/*
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.serializer;

import at.uibk.ase.ex3.componentDsl.Add;
import at.uibk.ase.ex3.componentDsl.AddDependency;
import at.uibk.ase.ex3.componentDsl.AddResponsibility;
import at.uibk.ase.ex3.componentDsl.Attribute;
import at.uibk.ase.ex3.componentDsl.AttributeType;
import at.uibk.ase.ex3.componentDsl.BasicType;
import at.uibk.ase.ex3.componentDsl.ComponentDslPackage;
import at.uibk.ase.ex3.componentDsl.Cycle;
import at.uibk.ase.ex3.componentDsl.Entity;
import at.uibk.ase.ex3.componentDsl.EntityType;
import at.uibk.ase.ex3.componentDsl.Model;
import at.uibk.ase.ex3.componentDsl.Order;
import at.uibk.ase.ex3.componentDsl.Size;
import at.uibk.ase.ex3.services.ComponentDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ComponentDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentDslPackage.ADD:
				sequence_Add(context, (Add) semanticObject); 
				return; 
			case ComponentDslPackage.ADD_DEPENDENCY:
				sequence_AddDependency(context, (AddDependency) semanticObject); 
				return; 
			case ComponentDslPackage.ADD_RESPONSIBILITY:
				sequence_AddResponsibility(context, (AddResponsibility) semanticObject); 
				return; 
			case ComponentDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case ComponentDslPackage.ATTRIBUTE_TYPE:
				sequence_AttributeType(context, (AttributeType) semanticObject); 
				return; 
			case ComponentDslPackage.BASIC_TYPE:
				sequence_BasicType(context, (BasicType) semanticObject); 
				return; 
			case ComponentDslPackage.CYCLE:
				sequence_Cycle(context, (Cycle) semanticObject); 
				return; 
			case ComponentDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case ComponentDslPackage.ENTITY_TYPE:
				if (rule == grammarAccess.getActionRule()
						|| rule == grammarAccess.getCreateRule()) {
					sequence_Create_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElementTypeRule()
						|| rule == grammarAccess.getEntityTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case ComponentDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ComponentDslPackage.ORDER:
				sequence_Order(context, (Order) semanticObject); 
				return; 
			case ComponentDslPackage.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns AddDependency
	 *     AddDependency returns AddDependency
	 *
	 * Constraint:
	 *     (
	 *         source=EntityType 
	 *         sourceName=STRING 
	 *         sourceVersion=VERSION 
	 *         dest=EntityType 
	 *         destinationName=STRING 
	 *         destinationVersion=VERSION
	 *     )
	 */
	protected void sequence_AddDependency(ISerializationContext context, AddDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__SOURCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__SOURCE_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__SOURCE_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__SOURCE_VERSION));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__DEST));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__DESTINATION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__DESTINATION_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__DESTINATION_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_DEPENDENCY__DESTINATION_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddDependencyAccess().getSourceEntityTypeParserRuleCall_2_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getAddDependencyAccess().getSourceNameSTRINGTerminalRuleCall_4_0(), semanticObject.getSourceName());
		feeder.accept(grammarAccess.getAddDependencyAccess().getSourceVersionVERSIONTerminalRuleCall_6_0(), semanticObject.getSourceVersion());
		feeder.accept(grammarAccess.getAddDependencyAccess().getDestEntityTypeParserRuleCall_9_0(), semanticObject.getDest());
		feeder.accept(grammarAccess.getAddDependencyAccess().getDestinationNameSTRINGTerminalRuleCall_11_0(), semanticObject.getDestinationName());
		feeder.accept(grammarAccess.getAddDependencyAccess().getDestinationVersionVERSIONTerminalRuleCall_13_0(), semanticObject.getDestinationVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns AddResponsibility
	 *     AddResponsibility returns AddResponsibility
	 *
	 * Constraint:
	 *     (name=STRING dest=EntityType sourceName=STRING sourceVersion=VERSION)
	 */
	protected void sequence_AddResponsibility(ISerializationContext context, AddResponsibility semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__DEST));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__SOURCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__SOURCE_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__SOURCE_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD_RESPONSIBILITY__SOURCE_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddResponsibilityAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAddResponsibilityAccess().getDestEntityTypeParserRuleCall_6_0(), semanticObject.getDest());
		feeder.accept(grammarAccess.getAddResponsibilityAccess().getSourceNameSTRINGTerminalRuleCall_8_0(), semanticObject.getSourceName());
		feeder.accept(grammarAccess.getAddResponsibilityAccess().getSourceVersionVERSIONTerminalRuleCall_10_0(), semanticObject.getSourceVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Add
	 *     Add returns Add
	 *
	 * Constraint:
	 *     (
	 *         source=EntityType 
	 *         sourceName=STRING 
	 *         sourceVersion=VERSION 
	 *         dest=EntityType 
	 *         destinationName=STRING 
	 *         destinationVersion=VERSION
	 *     )
	 */
	protected void sequence_Add(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD__SOURCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD__SOURCE_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD__SOURCE_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD__SOURCE_VERSION));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD__DEST));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD__DESTINATION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD__DESTINATION_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ADD__DESTINATION_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ADD__DESTINATION_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddAccess().getSourceEntityTypeParserRuleCall_1_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getAddAccess().getSourceNameSTRINGTerminalRuleCall_3_0(), semanticObject.getSourceName());
		feeder.accept(grammarAccess.getAddAccess().getSourceVersionVERSIONTerminalRuleCall_5_0(), semanticObject.getSourceVersion());
		feeder.accept(grammarAccess.getAddAccess().getDestEntityTypeParserRuleCall_8_0(), semanticObject.getDest());
		feeder.accept(grammarAccess.getAddAccess().getDestinationNameSTRINGTerminalRuleCall_10_0(), semanticObject.getDestinationName());
		feeder.accept(grammarAccess.getAddAccess().getDestinationVersionVERSIONTerminalRuleCall_12_0(), semanticObject.getDestinationVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     (elementType=ElementType (array?='[' length=INT?)?)
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ATTRIBUTE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns BasicType
	 *     BasicType returns BasicType
	 *
	 * Constraint:
	 *     (typeName='String' | typeName='Int' | typeName='Boolean' | typeName='Version')
	 */
	protected void sequence_BasicType(ISerializationContext context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns EntityType
	 *     Create returns EntityType
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] name=STRING version=VERSION)
	 */
	protected void sequence_Create_EntityType(ISerializationContext context, EntityType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__ENTITY));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1(), semanticObject.eGet(ComponentDslPackage.Literals.ENTITY_TYPE__ENTITY, false));
		feeder.accept(grammarAccess.getCreateAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCreateAccess().getVersionVERSIONTerminalRuleCall_5_0(), semanticObject.getVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Cycle
	 *     Cycle returns Cycle
	 *
	 * Constraint:
	 *     (
	 *         source=EntityType 
	 *         sourceName=STRING 
	 *         sourceVersion=VERSION 
	 *         dest=EntityType 
	 *         destinationName=STRING 
	 *         destinationVersion=VERSION
	 *     )
	 */
	protected void sequence_Cycle(ISerializationContext context, Cycle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.CYCLE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.CYCLE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.CYCLE__SOURCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.CYCLE__SOURCE_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.CYCLE__SOURCE_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.CYCLE__SOURCE_VERSION));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.CYCLE__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.CYCLE__DEST));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.CYCLE__DESTINATION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.CYCLE__DESTINATION_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.CYCLE__DESTINATION_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.CYCLE__DESTINATION_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCycleAccess().getSourceEntityTypeParserRuleCall_2_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getCycleAccess().getSourceNameSTRINGTerminalRuleCall_4_0(), semanticObject.getSourceName());
		feeder.accept(grammarAccess.getCycleAccess().getSourceVersionVERSIONTerminalRuleCall_6_0(), semanticObject.getSourceVersion());
		feeder.accept(grammarAccess.getCycleAccess().getDestEntityTypeParserRuleCall_9_0(), semanticObject.getDest());
		feeder.accept(grammarAccess.getCycleAccess().getDestinationNameSTRINGTerminalRuleCall_11_0(), semanticObject.getDestinationName());
		feeder.accept(grammarAccess.getCycleAccess().getDestinationVersionVERSIONTerminalRuleCall_13_0(), semanticObject.getDestinationVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns EntityType
	 *     EntityType returns EntityType
	 *
	 * Constraint:
	 *     entity=[Entity|ID]
	 */
	protected void sequence_EntityType(ISerializationContext context, EntityType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ENTITY_TYPE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1(), semanticObject.eGet(ComponentDslPackage.Literals.ENTITY_TYPE__ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID parent=EntityBaseTypeEnum attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (entities+=Entity+ actions+=Action+)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Order
	 *     Order returns Order
	 *
	 * Constraint:
	 *     (source=EntityType sourceName=STRING sourceVersion=VERSION)
	 */
	protected void sequence_Order(ISerializationContext context, Order semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ORDER__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ORDER__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ORDER__SOURCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ORDER__SOURCE_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.ORDER__SOURCE_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.ORDER__SOURCE_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrderAccess().getSourceEntityTypeParserRuleCall_3_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getOrderAccess().getSourceNameSTRINGTerminalRuleCall_5_0(), semanticObject.getSourceName());
		feeder.accept(grammarAccess.getOrderAccess().getSourceVersionVERSIONTerminalRuleCall_7_0(), semanticObject.getSourceVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Size
	 *     Size returns Size
	 *
	 * Constraint:
	 *     (source=EntityType sourceName=STRING sourceVersion=VERSION)
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.SIZE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.SIZE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.SIZE__SOURCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.SIZE__SOURCE_NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentDslPackage.Literals.SIZE__SOURCE_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDslPackage.Literals.SIZE__SOURCE_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeAccess().getSourceEntityTypeParserRuleCall_2_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getSizeAccess().getSourceNameSTRINGTerminalRuleCall_4_0(), semanticObject.getSourceName());
		feeder.accept(grammarAccess.getSizeAccess().getSourceVersionVERSIONTerminalRuleCall_6_0(), semanticObject.getSourceVersion());
		feeder.finish();
	}
	
	
}
