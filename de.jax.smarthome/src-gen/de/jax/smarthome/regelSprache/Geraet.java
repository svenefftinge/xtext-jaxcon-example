/**
 */
package de.jax.smarthome.regelSprache;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geraet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.jax.smarthome.regelSprache.Geraet#getArtikel <em>Artikel</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Geraet#getName <em>Name</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.Geraet#getZustaende <em>Zustaende</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getGeraet()
 * @model
 * @generated
 */
public interface Geraet extends Definition
{
  /**
   * Returns the value of the '<em><b>Artikel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artikel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artikel</em>' attribute.
   * @see #setArtikel(String)
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getGeraet_Artikel()
   * @model
   * @generated
   */
  String getArtikel();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Geraet#getArtikel <em>Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artikel</em>' attribute.
   * @see #getArtikel()
   * @generated
   */
  void setArtikel(String value);

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
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getGeraet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.jax.smarthome.regelSprache.Geraet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Zustaende</b></em>' containment reference list.
   * The list contents are of type {@link de.jax.smarthome.regelSprache.Zustand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zustaende</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zustaende</em>' containment reference list.
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#getGeraet_Zustaende()
   * @model containment="true"
   * @generated
   */
  EList<Zustand> getZustaende();

} // Geraet
