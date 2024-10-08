/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario.impl;

import de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage;
import de.bmwgroup.openscenario.asam.openScenario.SIBaseExponent;
import de.bmwgroup.openscenario.asam.openScenario.SIBaseExponentList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Base Exponent List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.SIBaseExponentListImpl#getSIBaseExponentList <em>SI Base Exponent List</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.SIBaseExponentListImpl#getNextSIBaseExponentList <em>Next SI Base Exponent List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIBaseExponentListImpl extends MinimalEObjectImpl.Container implements SIBaseExponentList
{
  /**
   * The cached value of the '{@link #getSIBaseExponentList() <em>SI Base Exponent List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIBaseExponentList()
   * @generated
   * @ordered
   */
  protected SIBaseExponent siBaseExponentList;

  /**
   * The cached value of the '{@link #getNextSIBaseExponentList() <em>Next SI Base Exponent List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextSIBaseExponentList()
   * @generated
   * @ordered
   */
  protected EList<SIBaseExponent> nextSIBaseExponentList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SIBaseExponentListImpl()
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
    return OpenScenarioPackage.Literals.SI_BASE_EXPONENT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SIBaseExponent getSIBaseExponentList()
  {
    return siBaseExponentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIBaseExponentList(SIBaseExponent newSIBaseExponentList, NotificationChain msgs)
  {
    SIBaseExponent oldSIBaseExponentList = siBaseExponentList;
    siBaseExponentList = newSIBaseExponentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST, oldSIBaseExponentList, newSIBaseExponentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSIBaseExponentList(SIBaseExponent newSIBaseExponentList)
  {
    if (newSIBaseExponentList != siBaseExponentList)
    {
      NotificationChain msgs = null;
      if (siBaseExponentList != null)
        msgs = ((InternalEObject)siBaseExponentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST, null, msgs);
      if (newSIBaseExponentList != null)
        msgs = ((InternalEObject)newSIBaseExponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST, null, msgs);
      msgs = basicSetSIBaseExponentList(newSIBaseExponentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST, newSIBaseExponentList, newSIBaseExponentList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SIBaseExponent> getNextSIBaseExponentList()
  {
    if (nextSIBaseExponentList == null)
    {
      nextSIBaseExponentList = new EObjectContainmentEList<SIBaseExponent>(SIBaseExponent.class, this, OpenScenarioPackage.SI_BASE_EXPONENT_LIST__NEXT_SI_BASE_EXPONENT_LIST);
    }
    return nextSIBaseExponentList;
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
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST:
        return basicSetSIBaseExponentList(null, msgs);
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__NEXT_SI_BASE_EXPONENT_LIST:
        return ((InternalEList<?>)getNextSIBaseExponentList()).basicRemove(otherEnd, msgs);
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
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST:
        return getSIBaseExponentList();
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__NEXT_SI_BASE_EXPONENT_LIST:
        return getNextSIBaseExponentList();
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
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST:
        setSIBaseExponentList((SIBaseExponent)newValue);
        return;
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__NEXT_SI_BASE_EXPONENT_LIST:
        getNextSIBaseExponentList().clear();
        getNextSIBaseExponentList().addAll((Collection<? extends SIBaseExponent>)newValue);
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
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST:
        setSIBaseExponentList((SIBaseExponent)null);
        return;
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__NEXT_SI_BASE_EXPONENT_LIST:
        getNextSIBaseExponentList().clear();
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
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__SI_BASE_EXPONENT_LIST:
        return siBaseExponentList != null;
      case OpenScenarioPackage.SI_BASE_EXPONENT_LIST__NEXT_SI_BASE_EXPONENT_LIST:
        return nextSIBaseExponentList != null && !nextSIBaseExponentList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SIBaseExponentListImpl
