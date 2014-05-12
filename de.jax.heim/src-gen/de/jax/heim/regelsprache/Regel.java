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
   * Returns the value of the '<em><b>Wenn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wenn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wenn</em>' attribute.
   * @see #setWenn(String)
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getRegel_Wenn()
   * @model
   * @generated
   */
  String getWenn();

  /**
   * Sets the value of the '{@link de.jax.heim.regelsprache.Regel#getWenn <em>Wenn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wenn</em>' attribute.
   * @see #getWenn()
   * @generated
   */
  void setWenn(String value);

  /**
   * Returns the value of the '<em><b>Dann</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dann</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dann</em>' attribute.
   * @see #setDann(String)
   * @see de.jax.heim.regelsprache.RegelsprachePackage#getRegel_Dann()
   * @model
   * @generated
   */
  String getDann();

  /**
   * Sets the value of the '{@link de.jax.heim.regelsprache.Regel#getDann <em>Dann</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dann</em>' attribute.
   * @see #getDann()
   * @generated
   */
  void setDann(String value);

} // Regel
