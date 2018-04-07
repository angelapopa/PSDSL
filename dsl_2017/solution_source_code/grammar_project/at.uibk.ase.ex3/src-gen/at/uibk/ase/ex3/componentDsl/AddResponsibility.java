/**
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.componentDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getName <em>Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getDest <em>Dest</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getSourceVersion <em>Source Version</em>}</li>
 * </ul>
 *
 * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAddResponsibility()
 * @model
 * @generated
 */
public interface AddResponsibility extends Action
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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAddResponsibility_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' containment reference.
   * @see #setDest(EntityType)
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAddResponsibility_Dest()
   * @model containment="true"
   * @generated
   */
  EntityType getDest();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getDest <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' containment reference.
   * @see #getDest()
   * @generated
   */
  void setDest(EntityType value);

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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAddResponsibility_SourceName()
   * @model
   * @generated
   */
  String getSourceName();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getSourceName <em>Source Name</em>}' attribute.
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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAddResponsibility_SourceVersion()
   * @model
   * @generated
   */
  String getSourceVersion();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.AddResponsibility#getSourceVersion <em>Source Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Version</em>' attribute.
   * @see #getSourceVersion()
   * @generated
   */
  void setSourceVersion(String value);

} // AddResponsibility
