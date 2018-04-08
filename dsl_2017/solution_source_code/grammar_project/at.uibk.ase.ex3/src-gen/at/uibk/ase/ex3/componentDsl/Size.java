/**
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.componentDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Size#getSource <em>Source</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Size#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Size#getSourceVersion <em>Source Version</em>}</li>
 * </ul>
 *
 * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getSize()
 * @model
 * @generated
 */
public interface Size extends Action
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(EntityType)
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getSize_Source()
   * @model containment="true"
   * @generated
   */
  EntityType getSource();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Size#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(EntityType value);

  /**
   * Returns the value of the '<em><b>Source Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Name</em>' attribute.
   * @see #setSourceName(String)
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getSize_SourceName()
   * @model
   * @generated
   */
  String getSourceName();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Size#getSourceName <em>Source Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Name</em>' attribute.
   * @see #getSourceName()
   * @generated
   */
  void setSourceName(String value);

  /**
   * Returns the value of the '<em><b>Source Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Version</em>' attribute.
   * @see #setSourceVersion(String)
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getSize_SourceVersion()
   * @model
   * @generated
   */
  String getSourceVersion();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Size#getSourceVersion <em>Source Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Version</em>' attribute.
   * @see #getSourceVersion()
   * @generated
   */
  void setSourceVersion(String value);

} // Size