/**
 */
package de.jax.heim.regelsprache;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.jax.heim.regelsprache.Regel#getWenn <em>Wenn</em>}</li>
 *   <li>{@link de.jax.heim.regelsprache.Regel#getDann <em>Dann</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.jax.heim.regelsprache.RegelsprachePackage#getRegel()
 * @model
 * @generated
 */
public interface Regel extends Deklaration
{
  /**
   * Returns the value of the '<em><b>Wenn</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wenn</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wenn</em>' reference.
   * @see #setWenn(Zustand)
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getRegel_Wenn()
   * @model
   * @generated
   */
  Zustand getWenn();

  /**
   * Sets the value of the '{@link de.jax.heim.regelsprache.Regel#getWenn <em>Wenn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wenn</em>' reference.
   * @see #getWenn()
   * @generated
   */
  void setWenn(Zustand value);

  /**
   * Returns the value of the '<em><b>Dann</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dann</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dann</em>' reference.
   * @see #setDann(Zustand)
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getRegel_Dann()
   * @model
   * @generated
   */
  Zustand getDann();

  /**
   * Sets the value of the '{@link de.jax.heim.regelsprache.Regel#getDann <em>Dann</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dann</em>' reference.
   * @see #getDann()
   * @generated
   */
  void setDann(Zustand value);

} // Regel
