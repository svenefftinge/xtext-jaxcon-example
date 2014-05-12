/**
 */
package de.jax.heim.regelsprache;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geraet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.jax.heim.regelsprache.Geraet#getName <em>Name</em>}</li>
 *   <li>{@link de.jax.heim.regelsprache.Geraet#getZustaende <em>Zustaende</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.jax.heim.regelsprache.RegelsprachePackage#getGeraet()
 * @model
 * @generated
 */
public interface Geraet extends Deklaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getGeraet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.jax.heim.regelsprache.Geraet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Zustaende</b></em>' containment reference list.
   * The list contents are of type {@link de.jax.heim.regelsprache.Zustand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zustaende</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zustaende</em>' containment reference list.
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getGeraet_Zustaende()
   * @model containment="true"
   * @generated
   */
  EList<Zustand> getZustaende();

} // Geraet
