/**
 */
package de.jax.smarthome.regelSprache.impl;

import de.jax.smarthome.regelSprache.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegelSpracheFactoryImpl extends EFactoryImpl implements RegelSpracheFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RegelSpracheFactory init()
  {
    try
    {
      RegelSpracheFactory theRegelSpracheFactory = (RegelSpracheFactory)EPackage.Registry.INSTANCE.getEFactory(RegelSprachePackage.eNS_URI);
      if (theRegelSpracheFactory != null)
      {
        return theRegelSpracheFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RegelSpracheFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegelSpracheFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RegelSprachePackage.MODEL: return createModel();
      case RegelSprachePackage.DEFINITION: return createDefinition();
      case RegelSprachePackage.GERAET: return createGeraet();
      case RegelSprachePackage.ZUSTAND: return createZustand();
      case RegelSprachePackage.REGEL: return createRegel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geraet createGeraet()
  {
    GeraetImpl geraet = new GeraetImpl();
    return geraet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zustand createZustand()
  {
    ZustandImpl zustand = new ZustandImpl();
    return zustand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Regel createRegel()
  {
    RegelImpl regel = new RegelImpl();
    return regel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegelSprachePackage getRegelSprachePackage()
  {
    return (RegelSprachePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RegelSprachePackage getPackage()
  {
    return RegelSprachePackage.eINSTANCE;
  }

} //RegelSpracheFactoryImpl
