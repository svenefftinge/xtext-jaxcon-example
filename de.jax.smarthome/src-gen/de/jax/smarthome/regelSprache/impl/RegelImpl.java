/**
 */
package de.jax.smarthome.regelSprache.impl;

import de.jax.smarthome.regelSprache.Geraet;
import de.jax.smarthome.regelSprache.Regel;
import de.jax.smarthome.regelSprache.RegelSprachePackage;
import de.jax.smarthome.regelSprache.Zustand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.RegelImpl#getWennArtikel <em>Wenn Artikel</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.RegelImpl#getWennGeraet <em>Wenn Geraet</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.RegelImpl#getWenn <em>Wenn</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.RegelImpl#getDannArtikel <em>Dann Artikel</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.RegelImpl#getDannGeraet <em>Dann Geraet</em>}</li>
 *   <li>{@link de.jax.smarthome.regelSprache.impl.RegelImpl#getDann <em>Dann</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegelImpl extends DefinitionImpl implements Regel
{
  /**
   * The default value of the '{@link #getWennArtikel() <em>Wenn Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWennArtikel()
   * @generated
   * @ordered
   */
  protected static final String WENN_ARTIKEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWennArtikel() <em>Wenn Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWennArtikel()
   * @generated
   * @ordered
   */
  protected String wennArtikel = WENN_ARTIKEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getWennGeraet() <em>Wenn Geraet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWennGeraet()
   * @generated
   * @ordered
   */
  protected Geraet wennGeraet;

  /**
   * The cached value of the '{@link #getWenn() <em>Wenn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWenn()
   * @generated
   * @ordered
   */
  protected Zustand wenn;

  /**
   * The default value of the '{@link #getDannArtikel() <em>Dann Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDannArtikel()
   * @generated
   * @ordered
   */
  protected static final String DANN_ARTIKEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDannArtikel() <em>Dann Artikel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDannArtikel()
   * @generated
   * @ordered
   */
  protected String dannArtikel = DANN_ARTIKEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getDannGeraet() <em>Dann Geraet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDannGeraet()
   * @generated
   * @ordered
   */
  protected Geraet dannGeraet;

  /**
   * The cached value of the '{@link #getDann() <em>Dann</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDann()
   * @generated
   * @ordered
   */
  protected Zustand dann;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegelImpl()
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
    return RegelSprachePackage.Literals.REGEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWennArtikel()
  {
    return wennArtikel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWennArtikel(String newWennArtikel)
  {
    String oldWennArtikel = wennArtikel;
    wennArtikel = newWennArtikel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.REGEL__WENN_ARTIKEL, oldWennArtikel, wennArtikel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geraet getWennGeraet()
  {
    if (wennGeraet != null && wennGeraet.eIsProxy())
    {
      InternalEObject oldWennGeraet = (InternalEObject)wennGeraet;
      wennGeraet = (Geraet)eResolveProxy(oldWennGeraet);
      if (wennGeraet != oldWennGeraet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegelSprachePackage.REGEL__WENN_GERAET, oldWennGeraet, wennGeraet));
      }
    }
    return wennGeraet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geraet basicGetWennGeraet()
  {
    return wennGeraet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWennGeraet(Geraet newWennGeraet)
  {
    Geraet oldWennGeraet = wennGeraet;
    wennGeraet = newWennGeraet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.REGEL__WENN_GERAET, oldWennGeraet, wennGeraet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zustand getWenn()
  {
    if (wenn != null && wenn.eIsProxy())
    {
      InternalEObject oldWenn = (InternalEObject)wenn;
      wenn = (Zustand)eResolveProxy(oldWenn);
      if (wenn != oldWenn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegelSprachePackage.REGEL__WENN, oldWenn, wenn));
      }
    }
    return wenn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zustand basicGetWenn()
  {
    return wenn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWenn(Zustand newWenn)
  {
    Zustand oldWenn = wenn;
    wenn = newWenn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.REGEL__WENN, oldWenn, wenn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDannArtikel()
  {
    return dannArtikel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDannArtikel(String newDannArtikel)
  {
    String oldDannArtikel = dannArtikel;
    dannArtikel = newDannArtikel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.REGEL__DANN_ARTIKEL, oldDannArtikel, dannArtikel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geraet getDannGeraet()
  {
    if (dannGeraet != null && dannGeraet.eIsProxy())
    {
      InternalEObject oldDannGeraet = (InternalEObject)dannGeraet;
      dannGeraet = (Geraet)eResolveProxy(oldDannGeraet);
      if (dannGeraet != oldDannGeraet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegelSprachePackage.REGEL__DANN_GERAET, oldDannGeraet, dannGeraet));
      }
    }
    return dannGeraet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geraet basicGetDannGeraet()
  {
    return dannGeraet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDannGeraet(Geraet newDannGeraet)
  {
    Geraet oldDannGeraet = dannGeraet;
    dannGeraet = newDannGeraet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.REGEL__DANN_GERAET, oldDannGeraet, dannGeraet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zustand getDann()
  {
    if (dann != null && dann.eIsProxy())
    {
      InternalEObject oldDann = (InternalEObject)dann;
      dann = (Zustand)eResolveProxy(oldDann);
      if (dann != oldDann)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegelSprachePackage.REGEL__DANN, oldDann, dann));
      }
    }
    return dann;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zustand basicGetDann()
  {
    return dann;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDann(Zustand newDann)
  {
    Zustand oldDann = dann;
    dann = newDann;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelSprachePackage.REGEL__DANN, oldDann, dann));
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
      case RegelSprachePackage.REGEL__WENN_ARTIKEL:
        return getWennArtikel();
      case RegelSprachePackage.REGEL__WENN_GERAET:
        if (resolve) return getWennGeraet();
        return basicGetWennGeraet();
      case RegelSprachePackage.REGEL__WENN:
        if (resolve) return getWenn();
        return basicGetWenn();
      case RegelSprachePackage.REGEL__DANN_ARTIKEL:
        return getDannArtikel();
      case RegelSprachePackage.REGEL__DANN_GERAET:
        if (resolve) return getDannGeraet();
        return basicGetDannGeraet();
      case RegelSprachePackage.REGEL__DANN:
        if (resolve) return getDann();
        return basicGetDann();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RegelSprachePackage.REGEL__WENN_ARTIKEL:
        setWennArtikel((String)newValue);
        return;
      case RegelSprachePackage.REGEL__WENN_GERAET:
        setWennGeraet((Geraet)newValue);
        return;
      case RegelSprachePackage.REGEL__WENN:
        setWenn((Zustand)newValue);
        return;
      case RegelSprachePackage.REGEL__DANN_ARTIKEL:
        setDannArtikel((String)newValue);
        return;
      case RegelSprachePackage.REGEL__DANN_GERAET:
        setDannGeraet((Geraet)newValue);
        return;
      case RegelSprachePackage.REGEL__DANN:
        setDann((Zustand)newValue);
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
      case RegelSprachePackage.REGEL__WENN_ARTIKEL:
        setWennArtikel(WENN_ARTIKEL_EDEFAULT);
        return;
      case RegelSprachePackage.REGEL__WENN_GERAET:
        setWennGeraet((Geraet)null);
        return;
      case RegelSprachePackage.REGEL__WENN:
        setWenn((Zustand)null);
        return;
      case RegelSprachePackage.REGEL__DANN_ARTIKEL:
        setDannArtikel(DANN_ARTIKEL_EDEFAULT);
        return;
      case RegelSprachePackage.REGEL__DANN_GERAET:
        setDannGeraet((Geraet)null);
        return;
      case RegelSprachePackage.REGEL__DANN:
        setDann((Zustand)null);
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
      case RegelSprachePackage.REGEL__WENN_ARTIKEL:
        return WENN_ARTIKEL_EDEFAULT == null ? wennArtikel != null : !WENN_ARTIKEL_EDEFAULT.equals(wennArtikel);
      case RegelSprachePackage.REGEL__WENN_GERAET:
        return wennGeraet != null;
      case RegelSprachePackage.REGEL__WENN:
        return wenn != null;
      case RegelSprachePackage.REGEL__DANN_ARTIKEL:
        return DANN_ARTIKEL_EDEFAULT == null ? dannArtikel != null : !DANN_ARTIKEL_EDEFAULT.equals(dannArtikel);
      case RegelSprachePackage.REGEL__DANN_GERAET:
        return dannGeraet != null;
      case RegelSprachePackage.REGEL__DANN:
        return dann != null;
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
    result.append(" (wennArtikel: ");
    result.append(wennArtikel);
    result.append(", dannArtikel: ");
    result.append(dannArtikel);
    result.append(')');
    return result.toString();
  }

} //RegelImpl
