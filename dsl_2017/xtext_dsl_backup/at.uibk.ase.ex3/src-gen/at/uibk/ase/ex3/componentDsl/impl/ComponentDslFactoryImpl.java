/**
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.componentDsl.impl;

import at.uibk.ase.ex3.componentDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDslFactoryImpl extends EFactoryImpl implements ComponentDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComponentDslFactory init()
  {
    try
    {
      ComponentDslFactory theComponentDslFactory = (ComponentDslFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentDslPackage.eNS_URI);
      if (theComponentDslFactory != null)
      {
        return theComponentDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ComponentDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDslFactoryImpl()
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
      case ComponentDslPackage.MODEL: return createModel();
      case ComponentDslPackage.ENTITY_BASE_TYPE: return createEntityBaseType();
      case ComponentDslPackage.ENTITY: return createEntity();
      case ComponentDslPackage.ATTRIBUTE: return createAttribute();
      case ComponentDslPackage.ATTRIBUTE_TYPE: return createAttributeType();
      case ComponentDslPackage.ELEMENT_TYPE: return createElementType();
      case ComponentDslPackage.BASIC_TYPE: return createBasicType();
      case ComponentDslPackage.ENTITY_TYPE: return createEntityType();
      case ComponentDslPackage.ACTION: return createAction();
      case ComponentDslPackage.CREATE: return createCreate();
      case ComponentDslPackage.ADD: return createAdd();
      case ComponentDslPackage.ADD_RESPONSIBILITY: return createAddResponsibility();
      case ComponentDslPackage.ADD_DEPENDENCY: return createAddDependency();
      case ComponentDslPackage.SIZE: return createSize();
      case ComponentDslPackage.ORDER: return createOrder();
      case ComponentDslPackage.CYCLE: return createCycle();
      case ComponentDslPackage.GROUP: return createGroup();
      case ComponentDslPackage.MEMBER: return createMember();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityBaseType createEntityBaseType()
  {
    EntityBaseTypeImpl entityBaseType = new EntityBaseTypeImpl();
    return entityBaseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeType()
  {
    AttributeTypeImpl attributeType = new AttributeTypeImpl();
    return attributeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Create createCreate()
  {
    CreateImpl create = new CreateImpl();
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddResponsibility createAddResponsibility()
  {
    AddResponsibilityImpl addResponsibility = new AddResponsibilityImpl();
    return addResponsibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddDependency createAddDependency()
  {
    AddDependencyImpl addDependency = new AddDependencyImpl();
    return addDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Order createOrder()
  {
    OrderImpl order = new OrderImpl();
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cycle createCycle()
  {
    CycleImpl cycle = new CycleImpl();
    return cycle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDslPackage getComponentDslPackage()
  {
    return (ComponentDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ComponentDslPackage getPackage()
  {
    return ComponentDslPackage.eINSTANCE;
  }

} //ComponentDslFactoryImpl
