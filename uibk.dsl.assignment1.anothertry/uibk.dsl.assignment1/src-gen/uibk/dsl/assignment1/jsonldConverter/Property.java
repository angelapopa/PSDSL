/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1.jsonldConverter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uibk.dsl.assignment1.jsonldConverter.Property#getName <em>Name</em>}</li>
 *   <li>{@link uibk.dsl.assignment1.jsonldConverter.Property#isMany <em>Many</em>}</li>
 *   <li>{@link uibk.dsl.assignment1.jsonldConverter.Property#isOne <em>One</em>}</li>
 *   <li>{@link uibk.dsl.assignment1.jsonldConverter.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uibk.dsl.assignment1.jsonldConverter.JsonldConverterPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uibk.dsl.assignment1.jsonldConverter.JsonldConverterPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uibk.dsl.assignment1.jsonldConverter.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see uibk.dsl.assignment1.jsonldConverter.JsonldConverterPackage#getProperty_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link uibk.dsl.assignment1.jsonldConverter.Property#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>One</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One</em>' attribute.
   * @see #setOne(boolean)
   * @see uibk.dsl.assignment1.jsonldConverter.JsonldConverterPackage#getProperty_One()
   * @model
   * @generated
   */
  boolean isOne();

  /**
   * Sets the value of the '{@link uibk.dsl.assignment1.jsonldConverter.Property#isOne <em>One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One</em>' attribute.
   * @see #isOne()
   * @generated
   */
  void setOne(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see uibk.dsl.assignment1.jsonldConverter.JsonldConverterPackage#getProperty_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link uibk.dsl.assignment1.jsonldConverter.Property#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Property