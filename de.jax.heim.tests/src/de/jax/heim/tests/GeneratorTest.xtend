package de.jax.heim.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.jax.heim.RegelspracheInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import de.jax.heim.regelsprache.Model
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import static org.junit.Assert.*
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(RegelspracheInjectorProvider)
class GeneratorTest {
    
    @Inject extension ParseHelper<Model>
    @Inject IGenerator generator
    
    
    @Test def void testGenerator() {
        val model = '''
            Fenster kann auf, zu
            Heizung kann an, aus
            
            Wenn Fenster.auf dann Heizung.aus
            Wenn Heizung.an  dann Fenster.zu
        '''.parse
        
        val fsa = new InMemoryFileSystemAccess
        generator.doGenerate(model.eResource, fsa)
        
        assertEquals(3, fsa.allFiles.size)
        assertEquals('''
            package mein.heim;
            
            import java.util.Scanner;
            
            public class __synthetic0RegelMaschine {
            
                public static void main(String[] args) {
                    new __synthetic0RegelMaschine().run();
                }
            
                public void run() {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Haussimulator aktiviert. Folgende Befehle stehen zur Verfügung : ");
                    System.out.println(" - Fenster auf");
                    System.out.println(" - Fenster zu");
                    System.out.println(" - Heizung an");
                    System.out.println(" - Heizung aus");
                    System.out.println("Warte auf Eingabe...");
                    while(sc.hasNextLine()) {
                        String command = sc.nextLine();
                        String[] split = command.split(" ");
                        if (split[0].equals("Fenster")) {
                        if (split[1].equals("auf")) {
                            trigger(Fenster.auf);
                        } else 
                        if (split[1].equals("zu")) {
                            trigger(Fenster.zu);
                        } else 
                                {
                                System.err.println("Der Zustand "+split[1]+" ist für das Gerät "+split[0]+" nicht definiert.");
                            }
                        }
                        if (split[0].equals("Heizung")) {
                        if (split[1].equals("an")) {
                            trigger(Heizung.an);
                        } else 
                        if (split[1].equals("aus")) {
                            trigger(Heizung.aus);
                        } else 
                                {
                                System.err.println("Der Zustand "+split[1]+" ist für das Gerät "+split[0]+" nicht definiert.");
                            }
                        }
                        System.out.println("Warte auf Eingabe...");
                    }
                }
            
                protected void trigger(Enum<?> event) {
                    if (event == Fenster.auf) {
                        trigger(Heizung.aus);
                    } 
                    if (event == Heizung.an) {
                        trigger(Fenster.zu);
                    } 
                }
                
            }
        '''.toString,
        fsa.allFiles.get("DEFAULT_OUTPUTmein/heim/__synthetic0RegelMaschine.java").toString)
    }
}