/**
 */
package de.jax.heim.regelsprache.impl;

import de.jax.heim.regelsprache.*;

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
public class RegelspracheFactoryImpl extends EFactoryImpl implements RegelspracheFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RegelspracheFactory init()
  {
    try
    {
      RegelspracheFactory theRegelspracheFactory = (RegelspracheFactory)EPackage.Registry.INSTANCE.getEFactory(RegelsprachePackage.eNS_URI);
      if (theRegelspracheFactory != null)
      {
        return theRegelspracheFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RegelspracheFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegelspracheFactoryImpl()
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
      case RegelsprachePackage.MODEL: return createModel();
      case RegelsprachePackage.DEKLARATION: return createDeklaration();
      case RegelsprachePackage.GERAET: return createGeraet();
      case RegelsprachePackage.ZUSTAND: return createZustand();
      case RegelsprachePackage.REGEL: return createRegel();
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
  public Deklaration createDeklaration()
  {
    DeklarationImpl deklaration = new DeklarationImpl();
    return deklaration;
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
  public RegelsprachePackage getRegelsprachePackage()
  {
    return (RegelsprachePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RegelsprachePackage getPackage()
  {
    return RegelsprachePackage.eINSTANCE;
  }

} //RegelspracheFactoryImpl
