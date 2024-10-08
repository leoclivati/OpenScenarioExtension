/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.Term#getAdditiveOp <em>Additive Op</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.Term#getNextTerm <em>Next Term</em>}</li>
 * </ul>
 *
 * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends Sum
{
  /**
   * Returns the value of the '<em><b>Additive Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive Op</em>' attribute list.
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getTerm_AdditiveOp()
   * @model unique="false"
   * @generated
   */
  EList<String> getAdditiveOp();

  /**
   * Returns the value of the '<em><b>Next Term</b></em>' containment reference list.
   * The list contents are of type {@link de.bmwgroup.openscenario.asam.openScenario.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Term</em>' containment reference list.
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getTerm_NextTerm()
   * @model containment="true"
   * @generated
   */
  EList<Term> getNextTerm();

} // Term
