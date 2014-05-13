/**
 */
package de.jax.heim.regelsprache.impl;

import de.jax.heim.regelsprache.Regel;
import de.jax.heim.regelsprache.RegelsprachePackage;
import de.jax.heim.regelsprache.Zustand;

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
 *   <li>{@link de.jax.heim.regelsprache.impl.RegelImpl#getWenn <em>Wenn</em>}</li>
 *   <li>{@link de.jax.heim.regelsprache.impl.RegelImpl#getDann <em>Dann</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegelImpl extends DeklarationImpl implements Regel
{
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
    return RegelsprachePackage.Literals.REGEL;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegelsprachePackage.REGEL__WENN, oldWenn, wenn));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RegelsprachePackage.REGEL__WENN, oldWenn, wenn));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegelsprachePackage.REGEL__DANN, oldDann, dann));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RegelsprachePackage.REGEL__DANN, oldDann, dann));
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
      case RegelsprachePackage.REGEL__WENN:
        if (resolve) return getWenn();
        return basicGetWenn();
      case RegelsprachePackage.REGEL__DANN:
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
      case RegelsprachePackage.REGEL__WENN:
        setWenn((Zustand)newValue);
        return;
      case RegelsprachePackage.REGEL__DANN:
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
      case RegelsprachePackage.REGEL__WENN:
        setWenn((Zustand)null);
        return;
      case RegelsprachePackage.REGEL__DANN:
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
      case RegelsprachePackage.REGEL__WENN:
        return wenn != null;
      case RegelsprachePackage.REGEL__DANN:
        return dann != null;
    }
    return super.eIsSet(featureID);
  }

} //RegelImpl
