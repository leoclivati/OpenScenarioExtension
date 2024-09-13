/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.PostfixExp#getPrimaryExp <em>Primary Exp</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.PostfixExp#getTail <em>Tail</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.PostfixExp#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getPostfixExp()
 * @model
 * @generated
 */
public interface PostfixExp extends MethodInvocation, Factor
{
  /**
   * Returns the value of the '<em><b>Primary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Exp</em>' containment reference.
   * @see #setPrimaryExp(PrimaryExp)
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getPostfixExp_PrimaryExp()
   * @model containment="true"
   * @generated
   */
  PrimaryExp getPrimaryExp();

  /**
   * Sets the value of the '{@link de.bmwgroup.openscenario.asam.openScenario.PostfixExp#getPrimaryExp <em>Primary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Exp</em>' containment reference.
   * @see #getPrimaryExp()
   * @generated
   */
  void setPrimaryExp(PrimaryExp value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link de.bmwgroup.openscenario.asam.openScenario.PostfixExpTail}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getPostfixExp_Tail()
   * @model containment="true"
   * @generated
   */
  EList<PostfixExpTail> getTail();

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference list.
   * The list contents are of type {@link de.bmwgroup.openscenario.asam.openScenario.ArgumentList}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference list.
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getPostfixExp_ArgumentList()
   * @model containment="true"
   * @generated
   */
  EList<ArgumentList> getArgumentList();

} // PostfixExp
