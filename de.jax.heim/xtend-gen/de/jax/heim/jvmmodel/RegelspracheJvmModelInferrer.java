package de.jax.heim.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.jax.heim.regelsprache.Deklaration;
import de.jax.heim.regelsprache.Geraet;
import de.jax.heim.regelsprache.Model;
import de.jax.heim.regelsprache.Regel;
import de.jax.heim.regelsprache.Zustand;
import java.util.Arrays;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class RegelspracheJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IBatchTypeResolver batchTypeResolver;
  
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
  protected void _infer(final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String packageName = "mein.heim";
    EList<Deklaration> _deklarationen = model.getDeklarationen();
    final Iterable<Regel> regeln = Iterables.<Regel>filter(_deklarationen, Regel.class);
    boolean _isEmpty = IterableExtensions.isEmpty(regeln);
    boolean _not = (!_isEmpty);
    if (_not) {
      Resource _eResource = model.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      String _lastSegment = _trimFileExtension.lastSegment();
      String _plus = ((packageName + ".") + _lastSegment);
      final String nameMaschine = (_plus + "RegelMaschine");
      JvmGenericType _class = this._jvmTypesBuilder.toClass(model, nameMaschine);
      IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          RegelspracheJvmModelInferrer.this.initializeRegelMaschine(it, model, regeln);
        }
      };
      _accept.initializeLater(_function);
    }
    EList<Deklaration> _deklarationen_1 = model.getDeklarationen();
    Iterable<Geraet> _filter = Iterables.<Geraet>filter(_deklarationen_1, Geraet.class);
    for (final Geraet geraet : _filter) {
      String _name = geraet.getName();
      String _plus_1 = ((packageName + ".") + _name);
      final Procedure1<JvmEnumerationType> _function_1 = new Procedure1<JvmEnumerationType>() {
        public void apply(final JvmEnumerationType it) {
        }
      };
      JvmEnumerationType _enumerationType = this._jvmTypesBuilder.toEnumerationType(geraet, _plus_1, _function_1);
      IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmEnumerationType> _accept_1 = acceptor.<JvmEnumerationType>accept(_enumerationType);
      final Procedure1<JvmEnumerationType> _function_2 = new Procedure1<JvmEnumerationType>() {
        public void apply(final JvmEnumerationType it) {
          EList<Zustand> _zustaende = geraet.getZustaende();
          for (final Zustand zustand : _zustaende) {
            EList<JvmMember> _members = it.getMembers();
            String _name = zustand.getName();
            JvmEnumerationLiteral _enumerationLiteral = RegelspracheJvmModelInferrer.this._jvmTypesBuilder.toEnumerationLiteral(zustand, _name);
            RegelspracheJvmModelInferrer.this._jvmTypesBuilder.<JvmEnumerationLiteral>operator_add(_members, _enumerationLiteral);
          }
        }
      };
      _accept_1.initializeLater(_function_2);
    }
  }
  
  public void initializeRegelMaschine(final JvmGenericType type, final Model model, final Iterable<? extends Regel> regeln) {
    EList<JvmMember> _members = type.getMembers();
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(model, Void.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _newTypeRef = RegelspracheJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, String.class);
        JvmTypeReference _addArrayTypeDimension = RegelspracheJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_newTypeRef);
        JvmFormalParameter _parameter = RegelspracheJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "args", _addArrayTypeDimension);
        RegelspracheJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        it.setStatic(true);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("new ");
            String _simpleName = type.getSimpleName();
            _builder.append(_simpleName, "");
            _builder.append("().run();");
            _builder.newLineIfNotEmpty();
          }
        };
        RegelspracheJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(model, "main", _newTypeRef, _function);
    this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    EList<JvmMember> _members_1 = type.getMembers();
    JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(model, Void.TYPE);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append(Scanner.class, "");
            _builder.append(" sc = new Scanner(System.in);");
            _builder.newLineIfNotEmpty();
            _builder.append("System.out.println(\"Haussimulator aktiviert. Folgende Befehle stehen zur Verfügung : \");");
            _builder.newLine();
            {
              final Function1<Regel, Geraet> _function = new Function1<Regel, Geraet>() {
                public Geraet apply(final Regel it) {
                  Zustand _wenn = it.getWenn();
                  return RegelspracheJvmModelInferrer.this.getGeraet(_wenn);
                }
              };
              Iterable<Geraet> _map = IterableExtensions.map(regeln, _function);
              final Function1<Geraet, EList<Zustand>> _function_1 = new Function1<Geraet, EList<Zustand>>() {
                public EList<Zustand> apply(final Geraet it) {
                  return it.getZustaende();
                }
              };
              Iterable<EList<Zustand>> _map_1 = IterableExtensions.<Geraet, EList<Zustand>>map(_map, _function_1);
              Iterable<Zustand> _flatten = Iterables.<Zustand>concat(_map_1);
              for(final Zustand zustand : _flatten) {
                _builder.append("System.out.println(\" - ");
                Geraet _geraet = RegelspracheJvmModelInferrer.this.getGeraet(zustand);
                String _name = _geraet.getName();
                _builder.append(_name, "");
                _builder.append(" ");
                String _name_1 = zustand.getName();
                _builder.append(_name_1, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("System.out.println(\"Warte auf Eingabe...\");");
            _builder.newLine();
            _builder.append("while(sc.hasNextLine()) {");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("String command = sc.nextLine();");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("String[] split = command.split(\" \");");
            _builder.newLine();
            {
              final Function1<Regel, Geraet> _function_2 = new Function1<Regel, Geraet>() {
                public Geraet apply(final Regel it) {
                  Zustand _wenn = it.getWenn();
                  return RegelspracheJvmModelInferrer.this.getGeraet(_wenn);
                }
              };
              Iterable<Geraet> _map_2 = IterableExtensions.map(regeln, _function_2);
              for(final Geraet geraet : _map_2) {
                _builder.append("    ");
                _builder.append("if (split[0].equals(\"");
                String _name_2 = geraet.getName();
                _builder.append(_name_2, "    ");
                _builder.append("\")) {");
                _builder.newLineIfNotEmpty();
                {
                  EList<Zustand> _zustaende = geraet.getZustaende();
                  for(final Zustand zustand_1 : _zustaende) {
                    _builder.append("    ");
                    _builder.append("if (split[1].equals(\"");
                    String _name_3 = zustand_1.getName();
                    _builder.append(_name_3, "    ");
                    _builder.append("\")) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("trigger(");
                    String _name_4 = geraet.getName();
                    _builder.append(_name_4, "        ");
                    _builder.append(".");
                    String _name_5 = zustand_1.getName();
                    _builder.append(_name_5, "        ");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("    ");
                    _builder.append("} else ");
                    _builder.newLine();
                  }
                }
                _builder.append("    ");
                _builder.append("        ");
                _builder.append("{");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("        ");
                _builder.append("System.err.println(\"Der Zustand \"+split[1]+\" ist für das Gerät \"+split[0]+\" nicht definiert.\");");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("    ");
            _builder.append("System.out.println(\"Warte auf Eingabe...\");");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        };
        RegelspracheJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(model, "run", _newTypeRef_1, _function_1);
    this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
    EList<JvmMember> _members_2 = type.getMembers();
    JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(model, Void.TYPE);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _newTypeRef = RegelspracheJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, Enum.class);
        JvmFormalParameter _parameter = RegelspracheJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "event", _newTypeRef);
        RegelspracheJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("System.out.println(\"Signal \'\"+event.getClass().getSimpleName()+\" \"+event+\"\' eingegangen.\");");
            _builder.newLine();
            {
              for(final Regel regel : regeln) {
                _builder.append("if (event == ");
                Zustand _wenn = regel.getWenn();
                Geraet _geraet = RegelspracheJvmModelInferrer.this.getGeraet(_wenn);
                String _name = _geraet.getName();
                _builder.append(_name, "");
                _builder.append(".");
                Zustand _wenn_1 = regel.getWenn();
                String _name_1 = _wenn_1.getName();
                _builder.append(_name_1, "");
                _builder.append(") {");
                _builder.newLineIfNotEmpty();
                {
                  XExpression _dann = regel.getDann();
                  boolean _isReturningEvent = RegelspracheJvmModelInferrer.this.isReturningEvent(_dann);
                  if (_isReturningEvent) {
                    _builder.append("    ");
                    _builder.append("trigger(");
                    String _dannMethode = RegelspracheJvmModelInferrer.this.getDannMethode(regel);
                    _builder.append(_dannMethode, "    ");
                    _builder.append("());");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("    ");
                    String _dannMethode_1 = RegelspracheJvmModelInferrer.this.getDannMethode(regel);
                    _builder.append(_dannMethode_1, "    ");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        };
        RegelspracheJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(model, "trigger", _newTypeRef_2, _function_2);
    this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
    final Function1<Regel, Boolean> _function_3 = new Function1<Regel, Boolean>() {
      public Boolean apply(final Regel it) {
        XExpression _dann = it.getDann();
        return Boolean.valueOf((!Objects.equal(_dann, null)));
      }
    };
    Iterable<? extends Regel> _filter = IterableExtensions.filter(regeln, _function_3);
    for (final Regel regel : _filter) {
      EList<JvmMember> _members_3 = type.getMembers();
      String _dannMethode = this.getDannMethode(regel);
      XExpression _dann = regel.getDann();
      JvmTypeReference _inferredType = this._jvmTypesBuilder.inferredType(_dann);
      final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          XExpression _dann = regel.getDann();
          RegelspracheJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _dann);
        }
      };
      JvmOperation _method_3 = this._jvmTypesBuilder.toMethod(regel, _dannMethode, _inferredType, _function_4);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_3);
    }
  }
  
  public boolean isReturningEvent(final XExpression expression) {
    final IResolvedTypes types = this.batchTypeResolver.resolveTypes(expression);
    final LightweightTypeReference returnType = types.getReturnType(expression);
    boolean _isSubtypeOf = returnType.isSubtypeOf(Enum.class);
    if (_isSubtypeOf) {
      return true;
    }
    return false;
  }
  
  public String getDannMethode(final Regel regel) {
    EObject _eContainer = regel.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    int _indexOf = _eContents.indexOf(regel);
    return ("dann_" + Integer.valueOf(_indexOf));
  }
  
  public Geraet getGeraet(final Zustand zustand) {
    EObject _eContainer = zustand.eContainer();
    return ((Geraet) _eContainer);
  }
  
  public void infer(final EObject model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (model instanceof Model) {
      _infer((Model)model, acceptor, isPreIndexingPhase);
      return;
    } else if (model != null) {
      _infer(model, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, acceptor, isPreIndexingPhase).toString());
    }
  }
}
