/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uibk.dsl.assignment3.game.Object#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link uibk.dsl.assignment3.game.Object#getHealthPoints <em>Health Points</em>}</li>
 *   <li>{@link uibk.dsl.assignment3.game.Object#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see uibk.dsl.assignment3.game.GamePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Ingredient
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Object)
   * @see uibk.dsl.assignment3.game.GamePackage#getObject_SuperType()
   * @model
   * @generated
   */
  Object getSuperType();

  /**
   * Sets the value of the '{@link uibk.dsl.assignment3.game.Object#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Object value);

  /**
   * Returns the value of the '<em><b>Health Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Health Points</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Health Points</em>' attribute.
   * @see #setHealthPoints(int)
   * @see uibk.dsl.assignment3.game.GamePackage#getObject_HealthPoints()
   * @model
   * @generated
   */
  int getHealthPoints();

  /**
   * Sets the value of the '{@link uibk.dsl.assignment3.game.Object#getHealthPoints <em>Health Points</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Health Points</em>' attribute.
   * @see #getHealthPoints()
   * @generated
   */
  void setHealthPoints(int value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' attribute list.
   * The list contents are of type {@link uibk.dsl.assignment3.game.Action}.
   * The literals are from the enumeration {@link uibk.dsl.assignment3.game.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' attribute list.
   * @see uibk.dsl.assignment3.game.Action
   * @see uibk.dsl.assignment3.game.GamePackage#getObject_Actions()
   * @model unique="false"
   * @generated
   */
  EList<Action> getActions();

} // Object
