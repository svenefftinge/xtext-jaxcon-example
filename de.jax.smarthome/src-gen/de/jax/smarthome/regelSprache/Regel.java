/**
 */
package de.jax.smarthome.regelSprache;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.jax.smarthome.regelSprache.Regel#getWennArtikel <em>Wenn Artikel</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Regel#getWennGeraet <em>Wenn Geraet</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Regel#getWenn <em>Wenn</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Regel#getDannArtikel <em>Dann Artikel</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Regel#getDannGeraet <em>Dann Geraet</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Regel#getDann <em>Dann</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel()
 * @model
 * @generated
 */
public interface Regel extends Definition
{
  /**
   * Returns the value of the '<em><b>Wenn Artikel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wenn Artikel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wenn Artikel</em>' attribute.
   * @see #setWennArtikel(String)
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel_WennArtikel()
   * @model
   * @generated
   */
  String getWennArtikel();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Regel#getWennArtikel <em>Wenn Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wenn Artikel</em>' attribute.
   * @see #getWennArtikel()
   * @generated
   */
  void setWennArtikel(String value);

  /**
   * Returns the value of the '<em><b>Wenn Geraet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wenn Geraet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wenn Geraet</em>' reference.
   * @see #setWennGeraet(Geraet)
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel_WennGeraet()
   * @model
   * @generated
   */
  Geraet getWennGeraet();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Regel#getWennGeraet <em>Wenn Geraet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wenn Geraet</em>' reference.
   * @see #getWennGeraet()
   * @generated
   */
  void setWennGeraet(Geraet value);

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
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel_Wenn()
   * @model
   * @generated
   */
  Zustand getWenn();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Regel#getWenn <em>Wenn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wenn</em>' reference.
   * @see #getWenn()
   * @generated
   */
  void setWenn(Zustand value);

  /**
   * Returns the value of the '<em><b>Dann Artikel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dann Artikel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dann Artikel</em>' attribute.
   * @see #setDannArtikel(String)
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel_DannArtikel()
   * @model
   * @generated
   */
  String getDannArtikel();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Regel#getDannArtikel <em>Dann Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dann Artikel</em>' attribute.
   * @see #getDannArtikel()
   * @generated
   */
  void setDannArtikel(String value);

  /**
   * Returns the value of the '<em><b>Dann Geraet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dann Geraet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dann Geraet</em>' reference.
   * @see #setDannGeraet(Geraet)
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel_DannGeraet()
   * @model
   * @generated
   */
  Geraet getDannGeraet();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Regel#getDannGeraet <em>Dann Geraet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dann Geraet</em>' reference.
   * @see #getDannGeraet()
   * @generated
   */
  void setDannGeraet(Geraet value);

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
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getRegel_Dann()
   * @model
   * @generated
   */
  Zustand getDann();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Regel#getDann <em>Dann</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dann</em>' reference.
   * @see #getDann()
   * @generated
   */
  void setDann(Zustand value);

} // Regel
