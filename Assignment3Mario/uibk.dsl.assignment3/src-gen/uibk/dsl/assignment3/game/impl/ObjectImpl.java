/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.game.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uibk.dsl.assignment3.game.Action;
import uibk.dsl.assignment3.game.GamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uibk.dsl.assignment3.game.impl.ObjectImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link uibk.dsl.assignment3.game.impl.ObjectImpl#getHealthPoints <em>Health Points</em>}</li>
 *   <li>{@link uibk.dsl.assignment3.game.impl.ObjectImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends IngredientImpl implements uibk.dsl.assignment3.game.Object
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected uibk.dsl.assignment3.game.Object superType;

  /**
   * The default value of the '{@link #getHealthPoints() <em>Health Points</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHealthPoints()
   * @generated
   * @ordered
   */
  protected static final int HEALTH_POINTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHealthPoints() <em>Health Points</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHealthPoints()
   * @generated
   * @ordered
   */
  protected int healthPoints = HEALTH_POINTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectImpl()
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
    return GamePackage.Literals.OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uibk.dsl.assignment3.game.Object getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (uibk.dsl.assignment3.game.Object)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uibk.dsl.assignment3.game.Object basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(uibk.dsl.assignment3.game.Object newSuperType)
  {
    uibk.dsl.assignment3.game.Object oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHealthPoints()
  {
    return healthPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHealthPoints(int newHealthPoints)
  {
    int oldHealthPoints = healthPoints;
    healthPoints = newHealthPoints;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJECT__HEALTH_POINTS, oldHealthPoints, healthPoints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EDataTypeEList<Action>(Action.class, this, GamePackage.OBJECT__ACTIONS);
    }
    return actions;
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
      case GamePackage.OBJECT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case GamePackage.OBJECT__HEALTH_POINTS:
        return getHealthPoints();
      case GamePackage.OBJECT__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GamePackage.OBJECT__SUPER_TYPE:
        setSuperType((uibk.dsl.assignment3.game.Object)newValue);
        return;
      case GamePackage.OBJECT__HEALTH_POINTS:
        setHealthPoints((Integer)newValue);
        return;
      case GamePackage.OBJECT__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case GamePackage.OBJECT__SUPER_TYPE:
        setSuperType((uibk.dsl.assignment3.game.Object)null);
        return;
      case GamePackage.OBJECT__HEALTH_POINTS:
        setHealthPoints(HEALTH_POINTS_EDEFAULT);
        return;
      case GamePackage.OBJECT__ACTIONS:
        getActions().clear();
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
      case GamePackage.OBJECT__SUPER_TYPE:
        return superType != null;
      case GamePackage.OBJECT__HEALTH_POINTS:
        return healthPoints != HEALTH_POINTS_EDEFAULT;
      case GamePackage.OBJECT__ACTIONS:
        return actions != null && !actions.isEmpty();
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
    result.append(" (healthPoints: ");
    result.append(healthPoints);
    result.append(", actions: ");
    result.append(actions);
    result.append(')');
    return result.toString();
  }

} //ObjectImpl
