/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uibk.dsl.assignment3.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "game";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsl.uibk/assignment3/Game";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "game";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GamePackage eINSTANCE = uibk.dsl.assignment3.game.impl.GamePackageImpl.init();

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.impl.AdventureImpl <em>Adventure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.impl.AdventureImpl
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getAdventure()
   * @generated
   */
  int ADVENTURE = 0;

  /**
   * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE__INGREDIENTS = 0;

  /**
   * The number of structural features of the '<em>Adventure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.impl.IngredientImpl <em>Ingredient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.impl.IngredientImpl
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getIngredient()
   * @generated
   */
  int INGREDIENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Ingredient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.impl.SceneImpl <em>Scene</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.impl.SceneImpl
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getScene()
   * @generated
   */
  int SCENE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE__NAME = INGREDIENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE__DESCRIPTION = INGREDIENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Objects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE__OBJECTS = INGREDIENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE__ACTIONS = INGREDIENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scene</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.impl.CharacterImpl <em>Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.impl.CharacterImpl
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getCharacter()
   * @generated
   */
  int CHARACTER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__NAME = INGREDIENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__DESCRIPTION = INGREDIENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Health Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__HEALTH_POINTS = INGREDIENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__ACTIONS = INGREDIENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.impl.ObjectImpl
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getObject()
   * @generated
   */
  int OBJECT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = INGREDIENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__DESCRIPTION = INGREDIENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__SUPER_TYPE = INGREDIENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Health Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__HEALTH_POINTS = INGREDIENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__ACTIONS = INGREDIENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.impl.StepImpl
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getStep()
   * @generated
   */
  int STEP = 5;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__ACTION = 0;

  /**
   * The feature id for the '<em><b>Target Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TARGET_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Valid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__VALID = 2;

  /**
   * The feature id for the '<em><b>Scene</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__SCENE = 3;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uibk.dsl.assignment3.game.Action <em>Action</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uibk.dsl.assignment3.game.Action
   * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;


  /**
   * Returns the meta object for class '{@link uibk.dsl.assignment3.game.Adventure <em>Adventure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adventure</em>'.
   * @see uibk.dsl.assignment3.game.Adventure
   * @generated
   */
  EClass getAdventure();

  /**
   * Returns the meta object for the containment reference list '{@link uibk.dsl.assignment3.game.Adventure#getIngredients <em>Ingredients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ingredients</em>'.
   * @see uibk.dsl.assignment3.game.Adventure#getIngredients()
   * @see #getAdventure()
   * @generated
   */
  EReference getAdventure_Ingredients();

  /**
   * Returns the meta object for class '{@link uibk.dsl.assignment3.game.Ingredient <em>Ingredient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ingredient</em>'.
   * @see uibk.dsl.assignment3.game.Ingredient
   * @generated
   */
  EClass getIngredient();

  /**
   * Returns the meta object for the attribute '{@link uibk.dsl.assignment3.game.Ingredient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uibk.dsl.assignment3.game.Ingredient#getName()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Name();

  /**
   * Returns the meta object for the attribute '{@link uibk.dsl.assignment3.game.Ingredient#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uibk.dsl.assignment3.game.Ingredient#getDescription()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Description();

  /**
   * Returns the meta object for class '{@link uibk.dsl.assignment3.game.Scene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scene</em>'.
   * @see uibk.dsl.assignment3.game.Scene
   * @generated
   */
  EClass getScene();

  /**
   * Returns the meta object for the reference list '{@link uibk.dsl.assignment3.game.Scene#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Objects</em>'.
   * @see uibk.dsl.assignment3.game.Scene#getObjects()
   * @see #getScene()
   * @generated
   */
  EReference getScene_Objects();

  /**
   * Returns the meta object for the containment reference list '{@link uibk.dsl.assignment3.game.Scene#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see uibk.dsl.assignment3.game.Scene#getActions()
   * @see #getScene()
   * @generated
   */
  EReference getScene_Actions();

  /**
   * Returns the meta object for class '{@link uibk.dsl.assignment3.game.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character</em>'.
   * @see uibk.dsl.assignment3.game.Character
   * @generated
   */
  EClass getCharacter();

  /**
   * Returns the meta object for the attribute '{@link uibk.dsl.assignment3.game.Character#getHealthPoints <em>Health Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Health Points</em>'.
   * @see uibk.dsl.assignment3.game.Character#getHealthPoints()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_HealthPoints();

  /**
   * Returns the meta object for the containment reference list '{@link uibk.dsl.assignment3.game.Character#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see uibk.dsl.assignment3.game.Character#getActions()
   * @see #getCharacter()
   * @generated
   */
  EReference getCharacter_Actions();

  /**
   * Returns the meta object for class '{@link uibk.dsl.assignment3.game.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see uibk.dsl.assignment3.game.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the reference '{@link uibk.dsl.assignment3.game.Object#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see uibk.dsl.assignment3.game.Object#getSuperType()
   * @see #getObject()
   * @generated
   */
  EReference getObject_SuperType();

  /**
   * Returns the meta object for the attribute '{@link uibk.dsl.assignment3.game.Object#getHealthPoints <em>Health Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Health Points</em>'.
   * @see uibk.dsl.assignment3.game.Object#getHealthPoints()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_HealthPoints();

  /**
   * Returns the meta object for the attribute list '{@link uibk.dsl.assignment3.game.Object#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Actions</em>'.
   * @see uibk.dsl.assignment3.game.Object#getActions()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Actions();

  /**
   * Returns the meta object for class '{@link uibk.dsl.assignment3.game.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see uibk.dsl.assignment3.game.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link uibk.dsl.assignment3.game.Step#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see uibk.dsl.assignment3.game.Step#getAction()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Action();

  /**
   * Returns the meta object for the reference '{@link uibk.dsl.assignment3.game.Step#getTargetObject <em>Target Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Object</em>'.
   * @see uibk.dsl.assignment3.game.Step#getTargetObject()
   * @see #getStep()
   * @generated
   */
  EReference getStep_TargetObject();

  /**
   * Returns the meta object for the attribute '{@link uibk.dsl.assignment3.game.Step#getValid <em>Valid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valid</em>'.
   * @see uibk.dsl.assignment3.game.Step#getValid()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Valid();

  /**
   * Returns the meta object for the reference '{@link uibk.dsl.assignment3.game.Step#getScene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scene</em>'.
   * @see uibk.dsl.assignment3.game.Step#getScene()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Scene();

  /**
   * Returns the meta object for enum '{@link uibk.dsl.assignment3.game.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Action</em>'.
   * @see uibk.dsl.assignment3.game.Action
   * @generated
   */
  EEnum getAction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GameFactory getGameFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.impl.AdventureImpl <em>Adventure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.impl.AdventureImpl
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getAdventure()
     * @generated
     */
    EClass ADVENTURE = eINSTANCE.getAdventure();

    /**
     * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVENTURE__INGREDIENTS = eINSTANCE.getAdventure_Ingredients();

    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.impl.IngredientImpl <em>Ingredient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.impl.IngredientImpl
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getIngredient()
     * @generated
     */
    EClass INGREDIENT = eINSTANCE.getIngredient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__DESCRIPTION = eINSTANCE.getIngredient_Description();

    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.impl.SceneImpl <em>Scene</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.impl.SceneImpl
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getScene()
     * @generated
     */
    EClass SCENE = eINSTANCE.getScene();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENE__OBJECTS = eINSTANCE.getScene_Objects();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENE__ACTIONS = eINSTANCE.getScene_Actions();

    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.impl.CharacterImpl <em>Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.impl.CharacterImpl
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getCharacter()
     * @generated
     */
    EClass CHARACTER = eINSTANCE.getCharacter();

    /**
     * The meta object literal for the '<em><b>Health Points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__HEALTH_POINTS = eINSTANCE.getCharacter_HealthPoints();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTER__ACTIONS = eINSTANCE.getCharacter_Actions();

    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.impl.ObjectImpl
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__SUPER_TYPE = eINSTANCE.getObject_SuperType();

    /**
     * The meta object literal for the '<em><b>Health Points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__HEALTH_POINTS = eINSTANCE.getObject_HealthPoints();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__ACTIONS = eINSTANCE.getObject_Actions();

    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.impl.StepImpl
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__ACTION = eINSTANCE.getStep_Action();

    /**
     * The meta object literal for the '<em><b>Target Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__TARGET_OBJECT = eINSTANCE.getStep_TargetObject();

    /**
     * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__VALID = eINSTANCE.getStep_Valid();

    /**
     * The meta object literal for the '<em><b>Scene</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__SCENE = eINSTANCE.getStep_Scene();

    /**
     * The meta object literal for the '{@link uibk.dsl.assignment3.game.Action <em>Action</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uibk.dsl.assignment3.game.Action
     * @see uibk.dsl.assignment3.game.impl.GamePackageImpl#getAction()
     * @generated
     */
    EEnum ACTION = eINSTANCE.getAction();

  }

} //GamePackage
