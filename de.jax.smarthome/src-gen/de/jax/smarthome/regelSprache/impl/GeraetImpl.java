/**
 */
package de.jax.smarthome.regelSprache.impl;

import de.jax.smarthome.regelSprache.Geraet;
import de.jax.smarthome.regelSprache.RegelSprachePackage;
import de.jax.smarthome.regelSprache.Zustand;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geraet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.GeraetImpl#getArtikel <em>Artikel</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.GeraetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.GeraetImpl#getZustaende <em>Zustaende</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeraetImpl extends DefinitionImpl implements Geraet
{
  /**
   * The default value of the '{@link #getArtikel() <em>Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtikel()
   * @generated
   * @ordered
   */
  protected static final String ARTIKEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtikel() <em>Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtikel()
   * @generated
   * @ordered
   */
  protected String artikel = ARTIKEL_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getZustaende() <em>Zustaende</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZustaende()
   * @generated
   * @ordered
   */
  protected EList<Zustand> zustaende;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeraetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RegelSprachePackage.Literals.GERAET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtikel()
  {
    return artikel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtikel(String newArtikel)
  {
    String oldArtikel = artikel;
    artikel = newArtikel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.GERAET__ARTIKEL, oldArtikel, artikel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.GERAET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Zustand> getZustaende()
  {
    if (zustaende == null)
    {
      zustaende = new EObjectContainmentEList<Zustand>(Zustand.class, this, RegelSprachePackage.GERAET__ZUSTAENDE);
    }
    return zustaende;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RegelSprachePackage.GERAET__ZUSTAENDE:
        return ((InternalEList<?>)getZustaende()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RegelSprachePackage.GERAET__ARTIKEL:
        return getArtikel();
      case RegelSprachePackage.GERAET__NAME:
        return getName();
      case RegelSprachePackage.GERAET__ZUSTAENDE:
        return getZustaende();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RegelSprachePackage.GERAET__ARTIKEL:
        setArtikel((String)newValue);
        return;
      case RegelSprachePackage.GERAET__NAME:
        setName((String)newValue);
        return;
      case RegelSprachePackage.GERAET__ZUSTAENDE:
        getZustaende().clear();
        getZustaende().addAll((Collection<? extends Zustand>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RegelSprachePackage.GERAET__ARTIKEL:
        setArtikel(ARTIKEL_EDEFAULT);
        return;
      case RegelSprachePackage.GERAET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RegelSprachePackage.GERAET__ZUSTAENDE:
        getZustaende().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RegelSprachePackage.GERAET__ARTIKEL:
        return ARTIKEL_EDEFAULT == null ? artikel != null : !ARTIKEL_EDEFAULT.equals(artikel);
      case RegelSprachePackage.GERAET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RegelSprachePackage.GERAET__ZUSTAENDE:
        return zustaende != null && !zustaende.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (artikel: ");
    result.append(artikel);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GeraetImpl
