/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Default Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.RemoveDefaultDeclaration#getParameterReference <em>Parameter Reference</em>}</li>
 * </ul>
 *
 * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getRemoveDefaultDeclaration()
 * @model
 * @generated
 */
public interface RemoveDefaultDeclaration extends ConstraintDeclaration
{
  /**
   * Returns the value of the '<em><b>Parameter Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Reference</em>' containment reference.
   * @see #setParameterReference(PostfixExp)
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getRemoveDefaultDeclaration_ParameterReference()
   * @model containment="true"
   * @generated
   */
  PostfixExp getParameterReference();

  /**
   * Sets the value of the '{@link de.bmwgroup.openscenario.asam.openScenario.RemoveDefaultDeclaration#getParameterReference <em>Parameter Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Reference</em>' containment reference.
   * @see #getParameterReference()
   * @generated
   */
  void setParameterReference(PostfixExp value);

} // RemoveDefaultDeclaration
