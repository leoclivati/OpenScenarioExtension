/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario.impl;

import de.bmwgroup.openscenario.asam.openScenario.BehaviorSpecification;
import de.bmwgroup.openscenario.asam.openScenario.EnumValueReference;
import de.bmwgroup.openscenario.asam.openScenario.MemberDeclaration;
import de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage;
import de.bmwgroup.openscenario.asam.openScenario.ScenarioDeclaration;

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
 * An implementation of the model object '<em><b>Scenario Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ScenarioDeclarationImpl#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ScenarioDeclarationImpl#getBaseScenarioName <em>Base Scenario Name</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ScenarioDeclarationImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ScenarioDeclarationImpl#getEnumReference <em>Enum Reference</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ScenarioDeclarationImpl#getScenarioMemberDecl <em>Scenario Member Decl</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ScenarioDeclarationImpl#getBehaviorSpecification <em>Behavior Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioDeclarationImpl extends OscDeclarationImpl implements ScenarioDeclaration
{
  /**
   * The default value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioName()
   * @generated
   * @ordered
   */
  protected static final String SCENARIO_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioName()
   * @generated
   * @ordered
   */
  protected String scenarioName = SCENARIO_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseScenarioName() <em>Base Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseScenarioName()
   * @generated
   * @ordered
   */
  protected static final String BASE_SCENARIO_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseScenarioName() <em>Base Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseScenarioName()
   * @generated
   * @ordered
   */
  protected String baseScenarioName = BASE_SCENARIO_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected static final String FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected String fieldName = FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumReference() <em>Enum Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumReference()
   * @generated
   * @ordered
   */
  protected EnumValueReference enumReference;

  /**
   * The cached value of the '{@link #getScenarioMemberDecl() <em>Scenario Member Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioMemberDecl()
   * @generated
   * @ordered
   */
  protected EList<MemberDeclaration> scenarioMemberDecl;

  /**
   * The cached value of the '{@link #getBehaviorSpecification() <em>Behavior Specification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorSpecification()
   * @generated
   * @ordered
   */
  protected EList<BehaviorSpecification> behaviorSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioDeclarationImpl()
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
    return OpenScenarioPackage.Literals.SCENARIO_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getScenarioName()
  {
    return scenarioName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScenarioName(String newScenarioName)
  {
    String oldScenarioName = scenarioName;
    scenarioName = newScenarioName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_NAME, oldScenarioName, scenarioName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBaseScenarioName()
  {
    return baseScenarioName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBaseScenarioName(String newBaseScenarioName)
  {
    String oldBaseScenarioName = baseScenarioName;
    baseScenarioName = newBaseScenarioName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SCENARIO_DECLARATION__BASE_SCENARIO_NAME, oldBaseScenarioName, baseScenarioName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFieldName()
  {
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldName(String newFieldName)
  {
    String oldFieldName = fieldName;
    fieldName = newFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SCENARIO_DECLARATION__FIELD_NAME, oldFieldName, fieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumValueReference getEnumReference()
  {
    return enumReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumReference(EnumValueReference newEnumReference, NotificationChain msgs)
  {
    EnumValueReference oldEnumReference = enumReference;
    enumReference = newEnumReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE, oldEnumReference, newEnumReference);
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
  public void setEnumReference(EnumValueReference newEnumReference)
  {
    if (newEnumReference != enumReference)
    {
      NotificationChain msgs = null;
      if (enumReference != null)
        msgs = ((InternalEObject)enumReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE, null, msgs);
      if (newEnumReference != null)
        msgs = ((InternalEObject)newEnumReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE, null, msgs);
      msgs = basicSetEnumReference(newEnumReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE, newEnumReference, newEnumReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MemberDeclaration> getScenarioMemberDecl()
  {
    if (scenarioMemberDecl == null)
    {
      scenarioMemberDecl = new EObjectContainmentEList<MemberDeclaration>(MemberDeclaration.class, this, OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_MEMBER_DECL);
    }
    return scenarioMemberDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BehaviorSpecification> getBehaviorSpecification()
  {
    if (behaviorSpecification == null)
    {
      behaviorSpecification = new EObjectContainmentEList<BehaviorSpecification>(BehaviorSpecification.class, this, OpenScenarioPackage.SCENARIO_DECLARATION__BEHAVIOR_SPECIFICATION);
    }
    return behaviorSpecification;
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
      case OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE:
        return basicSetEnumReference(null, msgs);
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_MEMBER_DECL:
        return ((InternalEList<?>)getScenarioMemberDecl()).basicRemove(otherEnd, msgs);
      case OpenScenarioPackage.SCENARIO_DECLARATION__BEHAVIOR_SPECIFICATION:
        return ((InternalEList<?>)getBehaviorSpecification()).basicRemove(otherEnd, msgs);
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
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_NAME:
        return getScenarioName();
      case OpenScenarioPackage.SCENARIO_DECLARATION__BASE_SCENARIO_NAME:
        return getBaseScenarioName();
      case OpenScenarioPackage.SCENARIO_DECLARATION__FIELD_NAME:
        return getFieldName();
      case OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE:
        return getEnumReference();
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_MEMBER_DECL:
        return getScenarioMemberDecl();
      case OpenScenarioPackage.SCENARIO_DECLARATION__BEHAVIOR_SPECIFICATION:
        return getBehaviorSpecification();
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
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_NAME:
        setScenarioName((String)newValue);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__BASE_SCENARIO_NAME:
        setBaseScenarioName((String)newValue);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE:
        setEnumReference((EnumValueReference)newValue);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_MEMBER_DECL:
        getScenarioMemberDecl().clear();
        getScenarioMemberDecl().addAll((Collection<? extends MemberDeclaration>)newValue);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__BEHAVIOR_SPECIFICATION:
        getBehaviorSpecification().clear();
        getBehaviorSpecification().addAll((Collection<? extends BehaviorSpecification>)newValue);
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
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_NAME:
        setScenarioName(SCENARIO_NAME_EDEFAULT);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__BASE_SCENARIO_NAME:
        setBaseScenarioName(BASE_SCENARIO_NAME_EDEFAULT);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE:
        setEnumReference((EnumValueReference)null);
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_MEMBER_DECL:
        getScenarioMemberDecl().clear();
        return;
      case OpenScenarioPackage.SCENARIO_DECLARATION__BEHAVIOR_SPECIFICATION:
        getBehaviorSpecification().clear();
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
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_NAME:
        return SCENARIO_NAME_EDEFAULT == null ? scenarioName != null : !SCENARIO_NAME_EDEFAULT.equals(scenarioName);
      case OpenScenarioPackage.SCENARIO_DECLARATION__BASE_SCENARIO_NAME:
        return BASE_SCENARIO_NAME_EDEFAULT == null ? baseScenarioName != null : !BASE_SCENARIO_NAME_EDEFAULT.equals(baseScenarioName);
      case OpenScenarioPackage.SCENARIO_DECLARATION__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case OpenScenarioPackage.SCENARIO_DECLARATION__ENUM_REFERENCE:
        return enumReference != null;
      case OpenScenarioPackage.SCENARIO_DECLARATION__SCENARIO_MEMBER_DECL:
        return scenarioMemberDecl != null && !scenarioMemberDecl.isEmpty();
      case OpenScenarioPackage.SCENARIO_DECLARATION__BEHAVIOR_SPECIFICATION:
        return behaviorSpecification != null && !behaviorSpecification.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (scenarioName: ");
    result.append(scenarioName);
    result.append(", baseScenarioName: ");
    result.append(baseScenarioName);
    result.append(", fieldName: ");
    result.append(fieldName);
    result.append(')');
    return result.toString();
  }

} //ScenarioDeclarationImpl
