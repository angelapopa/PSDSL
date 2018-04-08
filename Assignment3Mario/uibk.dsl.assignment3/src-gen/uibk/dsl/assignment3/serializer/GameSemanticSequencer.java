/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.serializer;

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
import uibk.dsl.assignment3.game.Adventure;
import uibk.dsl.assignment3.game.GamePackage;
import uibk.dsl.assignment3.game.Scene;
import uibk.dsl.assignment3.game.Step;
import uibk.dsl.assignment3.services.GameGrammarAccess;

@SuppressWarnings("all")
public class GameSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GameGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GamePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GamePackage.ADVENTURE:
				sequence_Adventure(context, (Adventure) semanticObject); 
				return; 
			case GamePackage.CHARACTER:
				sequence_Character(context, (uibk.dsl.assignment3.game.Character) semanticObject); 
				return; 
			case GamePackage.OBJECT:
				sequence_Object(context, (uibk.dsl.assignment3.game.Object) semanticObject); 
				return; 
			case GamePackage.SCENE:
				sequence_Scene(context, (Scene) semanticObject); 
				return; 
			case GamePackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Adventure returns Adventure
	 *
	 * Constraint:
	 *     ingredients+=Ingredient+
	 */
	protected void sequence_Adventure(ISerializationContext context, Adventure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ingredient returns Character
	 *     Character returns Character
	 *
	 * Constraint:
	 *     ((name=STRING | name=ID) description=STRING healthPoints=INT (actions+=Step actions+=Step*)?)
	 */
	protected void sequence_Character(ISerializationContext context, uibk.dsl.assignment3.game.Character semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ingredient returns Object
	 *     Object returns Object
	 *
	 * Constraint:
	 *     ((name=STRING | name=ID) superType=[Object|ID]? description=STRING healthPoints=INT (actions+=Action actions+=Action*)?)
	 */
	protected void sequence_Object(ISerializationContext context, uibk.dsl.assignment3.game.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ingredient returns Scene
	 *     Scene returns Scene
	 *
	 * Constraint:
	 *     (name=ID (objects+=[Object|ID] objects+=[Object|ID]*)? description=STRING (actions+=Step actions+=Step*)?)
	 */
	protected void sequence_Scene(ISerializationContext context, Scene semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Step returns Step
	 *
	 * Constraint:
	 *     (action=Action targetObject=[Object|ID] valid=STRING scene=[Scene|ID])
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.STEP__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.STEP__ACTION));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.STEP__TARGET_OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.STEP__TARGET_OBJECT));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.STEP__VALID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.STEP__VALID));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.STEP__SCENE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.STEP__SCENE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStepAccess().getActionActionEnumRuleCall_2_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getStepAccess().getTargetObjectObjectIDTerminalRuleCall_3_0_1(), semanticObject.eGet(GamePackage.Literals.STEP__TARGET_OBJECT, false));
		feeder.accept(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_5_1_0(), semanticObject.getValid());
		feeder.accept(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_7_0_1(), semanticObject.eGet(GamePackage.Literals.STEP__SCENE, false));
		feeder.finish();
	}
	
	
}