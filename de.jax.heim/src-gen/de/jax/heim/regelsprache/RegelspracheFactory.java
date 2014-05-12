/**
 */
package de.jax.heim.regelsprache;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jax.heim.regelsprache.RegelsprachePackage
 * @generated
 */
public interface RegelspracheFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RegelspracheFactory eINSTANCE = de.jax.heim.regelsprache.impl.RegelspracheFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Deklaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deklaration</em>'.
   * @generated
   */
  Deklaration createDeklaration();

  /**
   * Returns a new object of class '<em>Geraet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geraet</em>'.
   * @generated
   */
  Geraet createGeraet();

  /**
   * Returns a new object of class '<em>Zustand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Zustand</em>'.
   * @generated
   */
  Zustand createZustand();

  /**
   * Returns a new object of class '<em>Regel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regel</em>'.
   * @generated
   */
  Regel createRegel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RegelsprachePackage getRegelsprachePackage();

} //RegelspracheFactory
