/**
 */
package de.jax.heim.regelsprache;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.jax.heim.regelsprache.Model#getDeklarationen <em>Deklarationen</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.jax.heim.regelsprache.RegelsprachePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Deklarationen</b></em>' containment reference list.
   * The list contents are of type {@link de.jax.heim.regelsprache.Deklaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deklarationen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deklarationen</em>' containment reference list.
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getModel_Deklarationen()
   * @model containment="true"
   * @generated
   */
  EList<Deklaration> getDeklarationen();

} // Model
