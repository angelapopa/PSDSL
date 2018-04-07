/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.game.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uibk.dsl.assignment3.game.Action;
import uibk.dsl.assignment3.game.Adventure;
import uibk.dsl.assignment3.game.GameFactory;
import uibk.dsl.assignment3.game.GamePackage;
import uibk.dsl.assignment3.game.Ingredient;
import uibk.dsl.assignment3.game.Scene;
import uibk.dsl.assignment3.game.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameFactoryImpl extends EFactoryImpl implements GameFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GameFactory init()
  {
    try
    {
      GameFactory theGameFactory = (GameFactory)EPackage.Registry.INSTANCE.getEFactory(GamePackage.eNS_URI);
      if (theGameFactory != null)
      {
        return theGameFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GameFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GamePackage.ADVENTURE: return createAdventure();
      case GamePackage.INGREDIENT: return createIngredient();
      case GamePackage.SCENE: return createScene();
      case GamePackage.CHARACTER: return createCharacter();
      case GamePackage.OBJECT: return createObject();
      case GamePackage.STEP: return createStep();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GamePackage.ACTION:
        return createActionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GamePackage.ACTION:
        return convertActionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adventure createAdventure()
  {
    AdventureImpl adventure = new AdventureImpl();
    return adventure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ingredient createIngredient()
  {
    IngredientImpl ingredient = new IngredientImpl();
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene createScene()
  {
    SceneImpl scene = new SceneImpl();
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uibk.dsl.assignment3.game.Character createCharacter()
  {
    CharacterImpl character = new CharacterImpl();
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uibk.dsl.assignment3.game.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createActionFromString(EDataType eDataType, String initialValue)
  {
    Action result = Action.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertActionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamePackage getGamePackage()
  {
    return (GamePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GamePackage getPackage()
  {
    return GamePackage.eINSTANCE;
  }

} //GameFactoryImpl
