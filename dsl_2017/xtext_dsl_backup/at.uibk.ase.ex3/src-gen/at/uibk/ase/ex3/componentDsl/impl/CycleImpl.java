/**
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.componentDsl.impl;

import at.uibk.ase.ex3.componentDsl.ComponentDslPackage;
import at.uibk.ase.ex3.componentDsl.Cycle;
import at.uibk.ase.ex3.componentDsl.EntityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.impl.CycleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.impl.CycleImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.impl.CycleImpl#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.impl.CycleImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.impl.CycleImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link at.uibk.ase.ex3.componentDsl.impl.CycleImpl#getDestinationVersion <em>Destination Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CycleImpl extends ActionImpl implements Cycle
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EntityType source;

  /**
   * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceName()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceName()
   * @generated
   * @ordered
   */
  protected String sourceName = SOURCE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceVersion() <em>Source Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceVersion()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceVersion() <em>Source Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceVersion()
   * @generated
   * @ordered
   */
  protected String sourceVersion = SOURCE_VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected EntityType dest;

  /**
   * The default value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationName()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationName()
   * @generated
   * @ordered
   */
  protected String destinationName = DESTINATION_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDestinationVersion() <em>Destination Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationVersion()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestinationVersion() <em>Destination Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationVersion()
   * @generated
   * @ordered
   */
  protected String destinationVersion = DESTINATION_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CycleImpl()
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
    return ComponentDslPackage.Literals.CYCLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(EntityType newSource, NotificationChain msgs)
  {
    EntityType oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(EntityType newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentDslPackage.CYCLE__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentDslPackage.CYCLE__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceName()
  {
    return sourceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceName(String newSourceName)
  {
    String oldSourceName = sourceName;
    sourceName = newSourceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__SOURCE_NAME, oldSourceName, sourceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceVersion()
  {
    return sourceVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceVersion(String newSourceVersion)
  {
    String oldSourceVersion = sourceVersion;
    sourceVersion = newSourceVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__SOURCE_VERSION, oldSourceVersion, sourceVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDest(EntityType newDest, NotificationChain msgs)
  {
    EntityType oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__DEST, oldDest, newDest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDest(EntityType newDest)
  {
    if (newDest != dest)
    {
      NotificationChain msgs = null;
      if (dest != null)
        msgs = ((InternalEObject)dest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentDslPackage.CYCLE__DEST, null, msgs);
      if (newDest != null)
        msgs = ((InternalEObject)newDest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentDslPackage.CYCLE__DEST, null, msgs);
      msgs = basicSetDest(newDest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__DEST, newDest, newDest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestinationName()
  {
    return destinationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationName(String newDestinationName)
  {
    String oldDestinationName = destinationName;
    destinationName = newDestinationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__DESTINATION_NAME, oldDestinationName, destinationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestinationVersion()
  {
    return destinationVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationVersion(String newDestinationVersion)
  {
    String oldDestinationVersion = destinationVersion;
    destinationVersion = newDestinationVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentDslPackage.CYCLE__DESTINATION_VERSION, oldDestinationVersion, destinationVersion));
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
      case ComponentDslPackage.CYCLE__SOURCE:
        return basicSetSource(null, msgs);
      case ComponentDslPackage.CYCLE__DEST:
        return basicSetDest(null, msgs);
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
      case ComponentDslPackage.CYCLE__SOURCE:
        return getSource();
      case ComponentDslPackage.CYCLE__SOURCE_NAME:
        return getSourceName();
      case ComponentDslPackage.CYCLE__SOURCE_VERSION:
        return getSourceVersion();
      case ComponentDslPackage.CYCLE__DEST:
        return getDest();
      case ComponentDslPackage.CYCLE__DESTINATION_NAME:
        return getDestinationName();
      case ComponentDslPackage.CYCLE__DESTINATION_VERSION:
        return getDestinationVersion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComponentDslPackage.CYCLE__SOURCE:
        setSource((EntityType)newValue);
        return;
      case ComponentDslPackage.CYCLE__SOURCE_NAME:
        setSourceName((String)newValue);
        return;
      case ComponentDslPackage.CYCLE__SOURCE_VERSION:
        setSourceVersion((String)newValue);
        return;
      case ComponentDslPackage.CYCLE__DEST:
        setDest((EntityType)newValue);
        return;
      case ComponentDslPackage.CYCLE__DESTINATION_NAME:
        setDestinationName((String)newValue);
        return;
      case ComponentDslPackage.CYCLE__DESTINATION_VERSION:
        setDestinationVersion((String)newValue);
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
      case ComponentDslPackage.CYCLE__SOURCE:
        setSource((EntityType)null);
        return;
      case ComponentDslPackage.CYCLE__SOURCE_NAME:
        setSourceName(SOURCE_NAME_EDEFAULT);
        return;
      case ComponentDslPackage.CYCLE__SOURCE_VERSION:
        setSourceVersion(SOURCE_VERSION_EDEFAULT);
        return;
      case ComponentDslPackage.CYCLE__DEST:
        setDest((EntityType)null);
        return;
      case ComponentDslPackage.CYCLE__DESTINATION_NAME:
        setDestinationName(DESTINATION_NAME_EDEFAULT);
        return;
      case ComponentDslPackage.CYCLE__DESTINATION_VERSION:
        setDestinationVersion(DESTINATION_VERSION_EDEFAULT);
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
      case ComponentDslPackage.CYCLE__SOURCE:
        return source != null;
      case ComponentDslPackage.CYCLE__SOURCE_NAME:
        return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
      case ComponentDslPackage.CYCLE__SOURCE_VERSION:
        return SOURCE_VERSION_EDEFAULT == null ? sourceVersion != null : !SOURCE_VERSION_EDEFAULT.equals(sourceVersion);
      case ComponentDslPackage.CYCLE__DEST:
        return dest != null;
      case ComponentDslPackage.CYCLE__DESTINATION_NAME:
        return DESTINATION_NAME_EDEFAULT == null ? destinationName != null : !DESTINATION_NAME_EDEFAULT.equals(destinationName);
      case ComponentDslPackage.CYCLE__DESTINATION_VERSION:
        return DESTINATION_VERSION_EDEFAULT == null ? destinationVersion != null : !DESTINATION_VERSION_EDEFAULT.equals(destinationVersion);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sourceName: ");
    result.append(sourceName);
    result.append(", sourceVersion: ");
    result.append(sourceVersion);
    result.append(", destinationName: ");
    result.append(destinationName);
    result.append(", destinationVersion: ");
    result.append(destinationVersion);
    result.append(')');
    return result.toString();
  }

} //CycleImpl
