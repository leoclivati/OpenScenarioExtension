/**
 * generated by Xtext 2.35.0
 */
package de.bmwgroup.openscenario.asam.openScenario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.Sum#getRelationalOp <em>Relational Op</em>}</li>
 *   <li>{@link de.bmwgroup.openscenario.asam.openScenario.Sum#getNextSum <em>Next Sum</em>}</li>
 * </ul>
 *
 * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends Relation
{
  /**
   * Returns the value of the '<em><b>Relational Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Op</em>' attribute list.
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getSum_RelationalOp()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelationalOp();

  /**
   * Returns the value of the '<em><b>Next Sum</b></em>' containment reference list.
   * The list contents are of type {@link de.bmwgroup.openscenario.asam.openScenario.Sum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Sum</em>' containment reference list.
   * @see de.bmwgroup.openscenario.asam.openScenario.OpenScenarioPackage#getSum_NextSum()
   * @model containment="true"
   * @generated
   */
  EList<Sum> getNextSum();

} // Sum
