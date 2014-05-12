/**
 */
package de.jax.smarthome.regelSprache;

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
 *   <li>{@link de.jax.smarthome.regelSprache.Model#getDefinitionen <em>Definitionen</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Definitionen</b></em>' containment reference list.
   * The list contents are of type {@link de.jax.smarthome.regelSprache.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitionen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitionen</em>' containment reference list.
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getModel_Definitionen()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitionen();

} // Model
