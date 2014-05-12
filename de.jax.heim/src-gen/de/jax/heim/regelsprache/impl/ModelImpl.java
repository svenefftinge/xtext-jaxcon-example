/**
 */
package de.jax.heim.regelsprache.impl;

import de.jax.heim.regelsprache.Deklaration;
import de.jax.heim.regelsprache.Model;
import de.jax.heim.regelsprache.RegelsprachePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.jax.heim.regelsprache.impl.ModelImpl#getDeklarationen <em>Deklarationen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDeklarationen() <em>Deklarationen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeklarationen()
   * @generated
   * @ordered
   */
  protected EList<Deklaration> deklarationen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return RegelsprachePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Deklaration> getDeklarationen()
  {
    if (deklarationen == null)
    {
      deklarationen = new EObjectContainmentEList<Deklaration>(Deklaration.class, this, RegelsprachePackage.MODEL__DEKLARATIONEN);
    }
    return deklarationen;
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
      case RegelsprachePackage.MODEL__DEKLARATIONEN:
        return ((InternalEList<?>)getDeklarationen()).basicRemove(otherEnd, msgs);
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
      case RegelsprachePackage.MODEL__DEKLARATIONEN:
        return getDeklarationen();
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
      case RegelsprachePackage.MODEL__DEKLARATIONEN:
        getDeklarationen().clear();
        getDeklarationen().addAll((Collection<? extends Deklaration>)newValue);
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
      case RegelsprachePackage.MODEL__DEKLARATIONEN:
        getDeklarationen().clear();
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
      case RegelsprachePackage.MODEL__DEKLARATIONEN:
        return deklarationen != null && !deklarationen.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
