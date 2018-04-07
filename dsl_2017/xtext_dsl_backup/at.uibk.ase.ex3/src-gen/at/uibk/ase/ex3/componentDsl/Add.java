/**
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.componentDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Add#getSource <em>Source</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Add#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Add#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Add#getDest <em>Dest</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Add#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.Add#getDestinationVersion <em>Destination Version</em>}</li>
 * </ul>
 *
 * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Action
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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd_Source()
   * @model containment="true"
   * @generated
   */
  EntityType getSource();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Add#getSource <em>Source</em>}' containment reference.
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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd_SourceName()
   * @model
   * @generated
   */
  String getSourceName();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Add#getSourceName <em>Source Name</em>}' attribute.
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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd_SourceVersion()
   * @model
   * @generated
   */
  String getSourceVersion();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Add#getSourceVersion <em>Source Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Version</em>' attribute.
   * @see #getSourceVersion()
   * @generated
   */
  void setSourceVersion(String value);

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
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd_Dest()
   * @model containment="true"
   * @generated
   */
  EntityType getDest();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Add#getDest <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' containment reference.
   * @see #getDest()
   * @generated
   */
  void setDest(EntityType value);

  /**
   * Returns the value of the '<em><b>Destination Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination Name</em>' attribute.
   * @see #setDestinationName(String)
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd_DestinationName()
   * @model
   * @generated
   */
  String getDestinationName();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Add#getDestinationName <em>Destination Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination Name</em>' attribute.
   * @see #getDestinationName()
   * @generated
   */
  void setDestinationName(String value);

  /**
   * Returns the value of the '<em><b>Destination Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination Version</em>' attribute.
   * @see #setDestinationVersion(String)
   * @see at.uibk.ase.ex3.componentDsl.ComponentDslPackage#getAdd_DestinationVersion()
   * @model
   * @generated
   */
  String getDestinationVersion();

  /**
   * Sets the value of the '{@link at.uibk.ase.ex3.componentDsl.Add#getDestinationVersion <em>Destination Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination Version</em>' attribute.
   * @see #getDestinationVersion()
   * @generated
   */
  void setDestinationVersion(String value);

} // Add
