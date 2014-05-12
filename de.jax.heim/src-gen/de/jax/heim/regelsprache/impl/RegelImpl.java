/**
 */
package de.jax.heim.regelsprache.impl;

import de.jax.heim.regelsprache.Regel;
import de.jax.heim.regelsprache.RegelsprachePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
   * The default value of the '{@link #getWenn() <em>Wenn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWenn()
   * @generated
   * @ordered
   */
  protected static final String WENN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWenn() <em>Wenn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWenn()
   * @generated
   * @ordered
   */
  protected String wenn = WENN_EDEFAULT;

  /**
   * The default value of the '{@link #getDann() <em>Dann</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDann()
   * @generated
   * @ordered
   */
  protected static final String DANN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDann() <em>Dann</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDann()
   * @generated
   * @ordered
   */
  protected String dann = DANN_EDEFAULT;

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
  public String getWenn()
  {
    return wenn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWenn(String newWenn)
  {
    String oldWenn = wenn;
    wenn = newWenn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegelsprachePackage.REGEL__WENN, oldWenn, wenn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDann()
  {
    return dann;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDann(String newDann)
  {
    String oldDann = dann;
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
        return getWenn();
      case RegelsprachePackage.REGEL__DANN:
        return getDann();
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
        setWenn((String)newValue);
        return;
      case RegelsprachePackage.REGEL__DANN:
        setDann((String)newValue);
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
        setWenn(WENN_EDEFAULT);
        return;
      case RegelsprachePackage.REGEL__DANN:
        setDann(DANN_EDEFAULT);
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
        return WENN_EDEFAULT == null ? wenn != null : !WENN_EDEFAULT.equals(wenn);
      case RegelsprachePackage.REGEL__DANN:
        return DANN_EDEFAULT == null ? dann != null : !DANN_EDEFAULT.equals(dann);
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
    result.append(" (wenn: ");
    result.append(wenn);
    result.append(", dann: ");
    result.append(dann);
    result.append(')');
    return result.toString();
  }

} //RegelImpl
