/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.game.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uibk.dsl.assignment3.game.Adventure;
import uibk.dsl.assignment3.game.GamePackage;
import uibk.dsl.assignment3.game.Ingredient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adventure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uibk.dsl.assignment3.game.impl.AdventureImpl#getIngredients <em>Ingredients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdventureImpl extends MinimalEObjectImpl.Container implements Adventure
{
  /**
   * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredients()
   * @generated
   * @ordered
   */
  protected EList<Ingredient> ingredients;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdventureImpl()
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
    return GamePackage.Literals.ADVENTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ingredient> getIngredients()
  {
    if (ingredients == null)
    {
      ingredients = new EObjectContainmentEList<Ingredient>(Ingredient.class, this, GamePackage.ADVENTURE__INGREDIENTS);
    }
    return ingredients;
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
      case GamePackage.ADVENTURE__INGREDIENTS:
        return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
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
      case GamePackage.ADVENTURE__INGREDIENTS:
        return getIngredients();
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
      case GamePackage.ADVENTURE__INGREDIENTS:
        getIngredients().clear();
        getIngredients().addAll((Collection<? extends Ingredient>)newValue);
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
      case GamePackage.ADVENTURE__INGREDIENTS:
        getIngredients().clear();
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
      case GamePackage.ADVENTURE__INGREDIENTS:
        return ingredients != null && !ingredients.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AdventureImpl
