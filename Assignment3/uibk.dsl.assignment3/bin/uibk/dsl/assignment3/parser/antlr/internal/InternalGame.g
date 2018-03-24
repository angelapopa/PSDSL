/*
 * generated by Xtext 2.12.0
 */
grammar InternalGame;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uibk.dsl.assignment3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uibk.dsl.assignment3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uibk.dsl.assignment3.services.GameGrammarAccess;

}

@parser::members {

 	private GameGrammarAccess grammarAccess;

    public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Adventure";
   	}

   	@Override
   	protected GameGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAdventure
entryRuleAdventure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdventureRule()); }
	iv_ruleAdventure=ruleAdventure
	{ $current=$iv_ruleAdventure.current; }
	EOF;

// Rule Adventure
ruleAdventure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='start'
							{
								newLeafNode(otherlv_1, grammarAccess.getAdventureAccess().getStartKeyword_0_0());
							}
							(
								(
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getAdventureRule());
										}
									}
									otherlv_2=RULE_ID
									{
										newLeafNode(otherlv_2, grammarAccess.getAdventureAccess().getStartSceneSceneCrossReference_0_1_0());
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1);
				}
							({true}?=>(otherlv_3='end'
							{
								newLeafNode(otherlv_3, grammarAccess.getAdventureAccess().getEndKeyword_1_0());
							}
							(
								(
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getAdventureRule());
										}
									}
									otherlv_4=RULE_ID
									{
										newLeafNode(otherlv_4, grammarAccess.getAdventureAccess().getEndSceneSceneCrossReference_1_1_0());
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getAdventureAccess().getIngredientsIngredientParserRuleCall_2_0());
								}
								lv_ingredients_5_0=ruleIngredient
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getAdventureRule());
									}
									add(
										$current,
										"ingredients",
										lv_ingredients_5_0,
										"uibk.dsl.assignment3.Game.Ingredient");
									afterParserOrEnumRuleCall();
								}
							)
							))+
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleIngredient
entryRuleIngredient returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIngredientRule()); }
	iv_ruleIngredient=ruleIngredient
	{ $current=$iv_ruleIngredient.current; }
	EOF;

// Rule Ingredient
ruleIngredient returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getIngredientAccess().getSceneParserRuleCall_0());
		}
		this_Scene_0=ruleScene
		{
			$current = $this_Scene_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getIngredientAccess().getObjectParserRuleCall_1());
		}
		this_Object_1=ruleObject
		{
			$current = $this_Object_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleScene
entryRuleScene returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSceneRule()); }
	iv_ruleScene=ruleScene
	{ $current=$iv_ruleScene.current; }
	EOF;

// Rule Scene
ruleScene returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scene'
		{
			newLeafNode(otherlv_0, grammarAccess.getSceneAccess().getSceneKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSceneRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='objects'
			{
				newLeafNode(otherlv_2, grammarAccess.getSceneAccess().getObjectsKeyword_2_0());
			}
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getSceneAccess().getLeftParenthesisKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSceneRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_2_0());
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getCommaKeyword_2_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSceneRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_3_1_0());
						}
					)
				)
			)*
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getSceneAccess().getRightParenthesisKeyword_2_4());
			}
		)?
		otherlv_8='description'
		{
			newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getDescriptionKeyword_3());
		}
		(
			(
				lv_description_9_0=RULE_STRING
				{
					newLeafNode(lv_description_9_0, grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSceneRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_10='actions'
			{
				newLeafNode(otherlv_10, grammarAccess.getSceneAccess().getActionsKeyword_5_0());
			}
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getSceneAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_2_0());
					}
					lv_actions_12_0=ruleStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSceneRule());
						}
						add(
							$current,
							"actions",
							lv_actions_12_0,
							"uibk.dsl.assignment3.Game.Step");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getSceneAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_3_1_0());
						}
						lv_actions_14_0=ruleStep
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSceneRule());
							}
							add(
								$current,
								"actions",
								lv_actions_14_0,
								"uibk.dsl.assignment3.Game.Step");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getSceneAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		otherlv_16='end'
		{
			newLeafNode(otherlv_16, grammarAccess.getSceneAccess().getEndKeyword_6());
		}
	)
;

// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	iv_ruleObject=ruleObject
	{ $current=$iv_ruleObject.current; }
	EOF;

// Rule Object
ruleObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
		}
		(
			(
				(
					lv_name_1_1=RULE_STRING
					{
						newLeafNode(lv_name_1_1, grammarAccess.getObjectAccess().getNameSTRINGTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObjectRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_1,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
					    |
					lv_name_1_2=RULE_ID
					{
						newLeafNode(lv_name_1_2, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObjectRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_2,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		otherlv_2='description'
		{
			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getDescriptionKeyword_2());
		}
		(
			(
				lv_description_3_0=RULE_STRING
				{
					newLeafNode(lv_description_3_0, grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStepAccess().getActionActionEnumRuleCall_0_0());
				}
				lv_action_0_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepRule());
					}
					set(
						$current,
						"action",
						lv_action_0_0,
						"uibk.dsl.assignment3.Game.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStepRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_1_0());
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStepAccess().getPrepositionPrepositionEnumRuleCall_2_0_0());
					}
					lv_preposition_2_0=rulePreposition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStepRule());
						}
						set(
							$current,
							"preposition",
							lv_preposition_2_0,
							"uibk.dsl.assignment3.Game.Preposition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getStepAccess().getOtherObjectObjectCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='if'
		{
			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getIfKeyword_3());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_4());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0);
					}
								({true}?=>(otherlv_6='valid'
								{
									newLeafNode(otherlv_6, grammarAccess.getStepAccess().getValidKeyword_4_0_0());
								}
								(
									(
										lv_valid_7_0=RULE_STRING
										{
											newLeafNode(lv_valid_7_0, grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_4_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getStepRule());
											}
											setWithLastConsumed(
												$current,
												"valid",
												lv_valid_7_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_4());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1);
					}
								({true}?=>(otherlv_8='default'
								{
									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getDefaultKeyword_4_1_0());
								}
								(
									(
										lv_default_9_0=RULE_STRING
										{
											newLeafNode(lv_default_9_0, grammarAccess.getStepAccess().getDefaultSTRINGTerminalRuleCall_4_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getStepRule());
											}
											setWithLastConsumed(
												$current,
												"default",
												lv_default_9_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_4());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getStepAccess().getUnorderedGroup_4())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_4());
				}
		)
		otherlv_10='then'
		{
			newLeafNode(otherlv_10, grammarAccess.getStepAccess().getThenKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStepRule());
					}
				}
				otherlv_11=RULE_ID
				{
					newLeafNode(otherlv_11, grammarAccess.getStepAccess().getSceneSceneCrossReference_6_0());
				}
			)
		)
	)
;

// Rule Action
ruleAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='look at'
			{
				$current = grammarAccess.getActionAccess().getLOOKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getLOOKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='pick up'
			{
				$current = grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='goto'
			{
				$current = grammarAccess.getActionAccess().getGOTOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getGOTOEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='use'
			{
				$current = grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule Preposition
rulePreposition returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='with'
			{
				$current = grammarAccess.getPrepositionAccess().getWITHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPrepositionAccess().getWITHEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='into'
			{
				$current = grammarAccess.getPrepositionAccess().getINTOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPrepositionAccess().getINTOEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
