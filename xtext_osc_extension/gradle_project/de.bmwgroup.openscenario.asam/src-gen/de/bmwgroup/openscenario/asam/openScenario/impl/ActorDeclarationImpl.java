/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario.impl;

import de.bmwgroup.openscenario.asam.openScenario.ActorDeclaration;
import de.bmwgroup.openscenario.asam.openScenario.EnumValueReference;
import de.bmwgroup.openscenario.asam.openScenario.MemberDeclaration;
import de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage;

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
 * An implementation of the model object '<em><b>Actor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ActorDeclarationImpl#getActorName <em>Actor Name</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ActorDeclarationImpl#getBaseActorName <em>Base Actor Name</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ActorDeclarationImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ActorDeclarationImpl#getEnumReference <em>Enum Reference</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.impl.ActorDeclarationImpl#getActorMemberDecl <em>Actor Member Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorDeclarationImpl extends OscDeclarationImpl implements ActorDeclaration
{
  /**
   * The default value of the '{@link #getActorName() <em>Actor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorName()
   * @generated
   * @ordered
   */
  protected static final String ACTOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActorName() <em>Actor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorName()
   * @generated
   * @ordered
   */
  protected String actorName = ACTOR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseActorName() <em>Base Actor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseActorName()
   * @generated
   * @ordered
   */
  protected static final String BASE_ACTOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseActorName() <em>Base Actor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseActorName()
   * @generated
   * @ordered
   */
  protected String baseActorName = BASE_ACTOR_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getActorMemberDecl() <em>Actor Member Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorMemberDecl()
   * @generated
   * @ordered
   */
  protected EList<MemberDeclaration> actorMemberDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorDeclarationImpl()
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
    return OpenScenarioPackage.Literals.ACTOR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getActorName()
  {
    return actorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActorName(String newActorName)
  {
    String oldActorName = actorName;
    actorName = newActorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_NAME, oldActorName, actorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBaseActorName()
  {
    return baseActorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBaseActorName(String newBaseActorName)
  {
    String oldBaseActorName = baseActorName;
    baseActorName = newBaseActorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.ACTOR_DECLARATION__BASE_ACTOR_NAME, oldBaseActorName, baseActorName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.ACTOR_DECLARATION__FIELD_NAME, oldFieldName, fieldName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE, oldEnumReference, newEnumReference);
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
        msgs = ((InternalEObject)enumReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE, null, msgs);
      if (newEnumReference != null)
        msgs = ((InternalEObject)newEnumReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE, null, msgs);
      msgs = basicSetEnumReference(newEnumReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE, newEnumReference, newEnumReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MemberDeclaration> getActorMemberDecl()
  {
    if (actorMemberDecl == null)
    {
      actorMemberDecl = new EObjectContainmentEList<MemberDeclaration>(MemberDeclaration.class, this, OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_MEMBER_DECL);
    }
    return actorMemberDecl;
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
      case OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE:
        return basicSetEnumReference(null, msgs);
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_MEMBER_DECL:
        return ((InternalEList<?>)getActorMemberDecl()).basicRemove(otherEnd, msgs);
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
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_NAME:
        return getActorName();
      case OpenScenarioPackage.ACTOR_DECLARATION__BASE_ACTOR_NAME:
        return getBaseActorName();
      case OpenScenarioPackage.ACTOR_DECLARATION__FIELD_NAME:
        return getFieldName();
      case OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE:
        return getEnumReference();
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_MEMBER_DECL:
        return getActorMemberDecl();
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
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_NAME:
        setActorName((String)newValue);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__BASE_ACTOR_NAME:
        setBaseActorName((String)newValue);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE:
        setEnumReference((EnumValueReference)newValue);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_MEMBER_DECL:
        getActorMemberDecl().clear();
        getActorMemberDecl().addAll((Collection<? extends MemberDeclaration>)newValue);
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
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_NAME:
        setActorName(ACTOR_NAME_EDEFAULT);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__BASE_ACTOR_NAME:
        setBaseActorName(BASE_ACTOR_NAME_EDEFAULT);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE:
        setEnumReference((EnumValueReference)null);
        return;
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_MEMBER_DECL:
        getActorMemberDecl().clear();
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
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_NAME:
        return ACTOR_NAME_EDEFAULT == null ? actorName != null : !ACTOR_NAME_EDEFAULT.equals(actorName);
      case OpenScenarioPackage.ACTOR_DECLARATION__BASE_ACTOR_NAME:
        return BASE_ACTOR_NAME_EDEFAULT == null ? baseActorName != null : !BASE_ACTOR_NAME_EDEFAULT.equals(baseActorName);
      case OpenScenarioPackage.ACTOR_DECLARATION__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case OpenScenarioPackage.ACTOR_DECLARATION__ENUM_REFERENCE:
        return enumReference != null;
      case OpenScenarioPackage.ACTOR_DECLARATION__ACTOR_MEMBER_DECL:
        return actorMemberDecl != null && !actorMemberDecl.isEmpty();
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
    result.append(" (actorName: ");
    result.append(actorName);
    result.append(", baseActorName: ");
    result.append(baseActorName);
    result.append(", fieldName: ");
    result.append(fieldName);
    result.append(')');
    return result.toString();
  }

} //ActorDeclarationImpl
