package de.jax.heim.jvmmodel

import com.google.inject.Inject
import de.jax.heim.regelsprache.Geraet
import de.jax.heim.regelsprache.Model
import de.jax.heim.regelsprache.Regel
import de.jax.heim.regelsprache.Zustand
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver
import org.eclipse.xtext.xbase.XExpression
import java.util.Scanner

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class RegelspracheJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
    @Inject extension JvmTypesBuilder

    @Inject IBatchTypeResolver batchTypeResolver
    /**
     * The dispatch method {@code infer} is called for each instance of the
     * given element's type that is contained in a resource.
     * 
     * @param element
     *            the model to create one or more
     *            {@link JvmDeclaredType declared
     *            types} from.
     * @param acceptor
     *            each created
     *            {@link JvmDeclaredType type}
     *            without a container should be passed to the acceptor in order
     *            get attached to the current resource. The acceptor's
     *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
     *            accept(..)} method takes the constructed empty type for the
     *            pre-indexing phase. This one is further initialized in the
     *            indexing phase using the closure you pass to the returned
     *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
     *            initializeLater(..)}.
     * @param isPreIndexingPhase
     *            whether the method is called in a pre-indexing phase, i.e.
     *            when the global index is not yet fully updated. You must not
     *            rely on linking using the index if isPreIndexingPhase is
     *            <code>true</code>.
     */
    def dispatch void infer(Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
        val packageName = "mein.heim"
        val regeln = model.deklarationen.filter(Regel)
        if (!regeln.empty) {
            val nameMaschine = packageName+"."+model.eResource.URI.trimFileExtension.lastSegment+"RegelMaschine"
            acceptor.accept(model.toClass(nameMaschine))
                .initializeLater([
                    initializeRegelMaschine(model, regeln)
                ])
        }
        for (geraet : model.deklarationen.filter(Geraet)) {
            acceptor.accept(geraet.toEnumerationType(packageName+"."+geraet.name)[]).initializeLater [
                for (zustand : geraet.zustaende) {
                    members += zustand.toEnumerationLiteral(zustand.name)
                }
            ]
        }
    }
    
    def initializeRegelMaschine(JvmGenericType type, Model model, Iterable<? extends Regel> regeln) {
        type.members += model.toMethod('main', model.newTypeRef(Void.TYPE)) [
            parameters += model.toParameter("args", model.newTypeRef(String).addArrayTypeDimension)
            static = true
            body = '''
                new «type.simpleName»().run();
            '''
        ]
        
        type.members += model.toMethod("run", model.newTypeRef(Void.TYPE)) [
            body = '''
                «Scanner» sc = new Scanner(System.in);
                System.out.println("Haussimulator aktiviert. Folgende Befehle stehen zur Verfügung : ");
                «FOR zustand : regeln.map[wenn.geraet].map[zustaende].flatten»
                    System.out.println(" - «zustand.geraet.name» «zustand.name»");
                «ENDFOR»
                System.out.println("Warte auf Eingabe...");
                while(sc.hasNextLine()) {
                    String command = sc.nextLine();
                    String[] split = command.split(" ");
                    «FOR geraet : regeln.map[wenn.geraet]»
                        if (split[0].equals("«geraet.name»")) {
                        «FOR zustand : geraet.zustaende»
                            if (split[1].equals("«zustand.name»")) {
                                trigger(«geraet.name».«zustand.name»);
                            } else 
                            «ENDFOR»
                                {
                                System.err.println("Der Zustand "+split[1]+" ist für das Gerät "+split[0]+" nicht definiert.");
                            }
                        }
                    «ENDFOR»
                    System.out.println("Warte auf Eingabe...");
                }
            '''
        ]
        
        type.members += model.toMethod('trigger', model.newTypeRef(Void.TYPE)) [
            parameters += model.toParameter("event", model.newTypeRef(Enum))
            visibility = JvmVisibility.PROTECTED
            body = '''
                System.out.println("Signal '"+event.getClass().getSimpleName()+" "+event+"' eingegangen.");
                «FOR regel : regeln»
                    if (event == «regel.wenn.geraet.name».«regel.wenn.name») {
                        «IF regel.dann.isReturningEvent»
                            trigger(«regel.dannMethode»());
                        «ELSE»
                            «regel.dannMethode»();
                        «ENDIF»
                    }
                «ENDFOR»
            '''
        ]
        
        for (regel : regeln.filter[dann!=null]) {
            type.members += regel.toMethod(regel.dannMethode, regel.dann.inferredType) [
                body = regel.dann
            ]
        }
    }
    
    def boolean isReturningEvent(XExpression expression) {
        val types = batchTypeResolver.resolveTypes(expression)
        val returnType = types.getReturnType(expression)
        if (returnType.isSubtypeOf(Enum)) {
            return true;
        }
        return false;
    }
    
    def getDannMethode(Regel regel) {
        'dann_'+regel.eContainer.eContents.indexOf(regel)
    }
    
    def getGeraet(Zustand zustand) {
        zustand.eContainer as Geraet
    }
}

