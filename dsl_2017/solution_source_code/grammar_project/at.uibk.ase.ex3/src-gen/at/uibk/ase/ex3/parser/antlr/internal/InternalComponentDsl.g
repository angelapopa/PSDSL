/*
 * generated by Xtext 2.11.0
 */
grammar InternalComponentDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package at.uibk.ase.ex3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.uibk.ase.ex3.parser.antlr.internal;

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
import at.uibk.ase.ex3.services.ComponentDslGrammarAccess;

}

@parser::members {

 	private ComponentDslGrammarAccess grammarAccess;

    public InternalComponentDslParser(TokenStream input, ComponentDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ComponentDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0());
				}
				lv_entities_0_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"entities",
						lv_entities_0_0,
						"at.uibk.ase.ex3.ComponentDsl.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getActionsActionParserRuleCall_1_0());
				}
				lv_actions_1_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"actions",
						lv_actions_1_0,
						"at.uibk.ase.ex3.ComponentDsl.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='extends'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getParentEntityBaseTypeEnumEnumRuleCall_3_0());
				}
				lv_parent_3_0=ruleEntityBaseTypeEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"parent",
						lv_parent_3_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityBaseTypeEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
				}
				lv_attributes_5_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_5_0,
						"at.uibk.ase.ex3.ComponentDsl.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleAttributeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"at.uibk.ase.ex3.ComponentDsl.AttributeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAttributeType
entryRuleAttributeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeTypeRule()); }
	iv_ruleAttributeType=ruleAttributeType
	{ $current=$iv_ruleAttributeType.current; }
	EOF;

// Rule AttributeType
ruleAttributeType returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0());
				}
				lv_elementType_0_0=ruleElementType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
					}
					set(
						$current,
						"elementType",
						lv_elementType_0_0,
						"at.uibk.ase.ex3.ComponentDsl.ElementType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					lv_array_1_0='['
					{
						newLeafNode(lv_array_1_0, grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributeTypeRule());
						}
						setWithLastConsumed($current, "array", true, "[");
					}
				)
			)
			(
				(
					lv_length_2_0=RULE_INT
					{
						newLeafNode(lv_length_2_0, grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributeTypeRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)?
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
	)
;

// Entry rule entryRuleElementType
entryRuleElementType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementTypeRule()); }
	iv_ruleElementType=ruleElementType
	{ $current=$iv_ruleElementType.current; }
	EOF;

// Rule ElementType
ruleElementType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0());
		}
		this_BasicType_0=ruleBasicType
		{
			$current = $this_BasicType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1());
		}
		this_EntityType_1=ruleEntityType
		{
			$current = $this_EntityType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBasicType
entryRuleBasicType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	iv_ruleBasicType=ruleBasicType
	{ $current=$iv_ruleBasicType.current; }
	EOF;

// Rule BasicType
ruleBasicType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_typeName_0_1='String'
				{
					newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "typeName", lv_typeName_0_1, null);
				}
				    |
				lv_typeName_0_2='Int'
				{
					newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "typeName", lv_typeName_0_2, null);
				}
				    |
				lv_typeName_0_3='Boolean'
				{
					newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "typeName", lv_typeName_0_3, null);
				}
				    |
				lv_typeName_0_4='Version'
				{
					newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameVersionKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "typeName", lv_typeName_0_4, null);
				}
			)
		)
	)
;

// Entry rule entryRuleEntityType
entryRuleEntityType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityTypeRule()); }
	iv_ruleEntityType=ruleEntityType
	{ $current=$iv_ruleEntityType.current; }
	EOF;

// Rule EntityType
ruleEntityType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEntityTypeRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getCreateParserRuleCall_0());
		}
		this_Create_0=ruleCreate
		{
			$current = $this_Create_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getAddParserRuleCall_1());
		}
		this_Add_1=ruleAdd
		{
			$current = $this_Add_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getAddResponsibilityParserRuleCall_2());
		}
		this_AddResponsibility_2=ruleAddResponsibility
		{
			$current = $this_AddResponsibility_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getAddDependencyParserRuleCall_3());
		}
		this_AddDependency_3=ruleAddDependency
		{
			$current = $this_AddDependency_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSizeParserRuleCall_4());
		}
		this_Size_4=ruleSize
		{
			$current = $this_Size_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getOrderParserRuleCall_5());
		}
		this_Order_5=ruleOrder
		{
			$current = $this_Order_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getCycleParserRuleCall_6());
		}
		this_Cycle_6=ruleCycle
		{
			$current = $this_Cycle_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCreate
entryRuleCreate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateRule()); }
	iv_ruleCreate=ruleCreate
	{ $current=$iv_ruleCreate.current; }
	EOF;

// Rule Create
ruleCreate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='create'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getCreateAccess().getEntityTypeParserRuleCall_1());
		}
		this_EntityType_1=ruleEntityType
		{
			$current = $this_EntityType_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getCreateAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getCreateAccess().getCommaKeyword_4());
		}
		(
			(
				lv_version_5_0=RULE_VERSION
				{
					newLeafNode(lv_version_5_0, grammarAccess.getCreateAccess().getVersionVERSIONTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreateRule());
					}
					setWithLastConsumed(
						$current,
						"version",
						lv_version_5_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddAccess().getSourceEntityTypeParserRuleCall_1_0());
				}
				lv_source_1_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddRule());
					}
					set(
						$current,
						"source",
						lv_source_1_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_sourceName_3_0=RULE_STRING
				{
					newLeafNode(lv_sourceName_3_0, grammarAccess.getAddAccess().getSourceNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"sourceName",
						lv_sourceName_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getCommaKeyword_4());
		}
		(
			(
				lv_sourceVersion_5_0=RULE_VERSION
				{
					newLeafNode(lv_sourceVersion_5_0, grammarAccess.getAddAccess().getSourceVersionVERSIONTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"sourceVersion",
						lv_sourceVersion_5_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAddAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='to'
		{
			newLeafNode(otherlv_7, grammarAccess.getAddAccess().getToKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddAccess().getDestEntityTypeParserRuleCall_8_0());
				}
				lv_dest_8_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddRule());
					}
					set(
						$current,
						"dest",
						lv_dest_8_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='('
		{
			newLeafNode(otherlv_9, grammarAccess.getAddAccess().getLeftParenthesisKeyword_9());
		}
		(
			(
				lv_destinationName_10_0=RULE_STRING
				{
					newLeafNode(lv_destinationName_10_0, grammarAccess.getAddAccess().getDestinationNameSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"destinationName",
						lv_destinationName_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11=','
		{
			newLeafNode(otherlv_11, grammarAccess.getAddAccess().getCommaKeyword_11());
		}
		(
			(
				lv_destinationVersion_12_0=RULE_VERSION
				{
					newLeafNode(lv_destinationVersion_12_0, grammarAccess.getAddAccess().getDestinationVersionVERSIONTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"destinationVersion",
						lv_destinationVersion_12_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_13=')'
		{
			newLeafNode(otherlv_13, grammarAccess.getAddAccess().getRightParenthesisKeyword_13());
		}
	)
;

// Entry rule entryRuleAddResponsibility
entryRuleAddResponsibility returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddResponsibilityRule()); }
	iv_ruleAddResponsibility=ruleAddResponsibility
	{ $current=$iv_ruleAddResponsibility.current; }
	EOF;

// Rule AddResponsibility
ruleAddResponsibility returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddResponsibilityAccess().getAddKeyword_0());
		}
		otherlv_1='responsibility'
		{
			newLeafNode(otherlv_1, grammarAccess.getAddResponsibilityAccess().getResponsibilityKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getAddResponsibilityAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getAddResponsibilityAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddResponsibilityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getAddResponsibilityAccess().getRightParenthesisKeyword_4());
		}
		otherlv_5='to'
		{
			newLeafNode(otherlv_5, grammarAccess.getAddResponsibilityAccess().getToKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddResponsibilityAccess().getDestEntityTypeParserRuleCall_6_0());
				}
				lv_dest_6_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddResponsibilityRule());
					}
					set(
						$current,
						"dest",
						lv_dest_6_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='('
		{
			newLeafNode(otherlv_7, grammarAccess.getAddResponsibilityAccess().getLeftParenthesisKeyword_7());
		}
		(
			(
				lv_sourceName_8_0=RULE_STRING
				{
					newLeafNode(lv_sourceName_8_0, grammarAccess.getAddResponsibilityAccess().getSourceNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddResponsibilityRule());
					}
					setWithLastConsumed(
						$current,
						"sourceName",
						lv_sourceName_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=','
		{
			newLeafNode(otherlv_9, grammarAccess.getAddResponsibilityAccess().getCommaKeyword_9());
		}
		(
			(
				lv_sourceVersion_10_0=RULE_VERSION
				{
					newLeafNode(lv_sourceVersion_10_0, grammarAccess.getAddResponsibilityAccess().getSourceVersionVERSIONTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddResponsibilityRule());
					}
					setWithLastConsumed(
						$current,
						"sourceVersion",
						lv_sourceVersion_10_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_11=')'
		{
			newLeafNode(otherlv_11, grammarAccess.getAddResponsibilityAccess().getRightParenthesisKeyword_11());
		}
	)
;

// Entry rule entryRuleAddDependency
entryRuleAddDependency returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddDependencyRule()); }
	iv_ruleAddDependency=ruleAddDependency
	{ $current=$iv_ruleAddDependency.current; }
	EOF;

// Rule AddDependency
ruleAddDependency returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddDependencyAccess().getAddKeyword_0());
		}
		otherlv_1='dependency'
		{
			newLeafNode(otherlv_1, grammarAccess.getAddDependencyAccess().getDependencyKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddDependencyAccess().getSourceEntityTypeParserRuleCall_2_0());
				}
				lv_source_2_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddDependencyRule());
					}
					set(
						$current,
						"source",
						lv_source_2_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getAddDependencyAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				lv_sourceName_4_0=RULE_STRING
				{
					newLeafNode(lv_sourceName_4_0, grammarAccess.getAddDependencyAccess().getSourceNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddDependencyRule());
					}
					setWithLastConsumed(
						$current,
						"sourceName",
						lv_sourceName_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getAddDependencyAccess().getCommaKeyword_5());
		}
		(
			(
				lv_sourceVersion_6_0=RULE_VERSION
				{
					newLeafNode(lv_sourceVersion_6_0, grammarAccess.getAddDependencyAccess().getSourceVersionVERSIONTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddDependencyRule());
					}
					setWithLastConsumed(
						$current,
						"sourceVersion",
						lv_sourceVersion_6_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getAddDependencyAccess().getRightParenthesisKeyword_7());
		}
		otherlv_8='to'
		{
			newLeafNode(otherlv_8, grammarAccess.getAddDependencyAccess().getToKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddDependencyAccess().getDestEntityTypeParserRuleCall_9_0());
				}
				lv_dest_9_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddDependencyRule());
					}
					set(
						$current,
						"dest",
						lv_dest_9_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='('
		{
			newLeafNode(otherlv_10, grammarAccess.getAddDependencyAccess().getLeftParenthesisKeyword_10());
		}
		(
			(
				lv_destinationName_11_0=RULE_STRING
				{
					newLeafNode(lv_destinationName_11_0, grammarAccess.getAddDependencyAccess().getDestinationNameSTRINGTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddDependencyRule());
					}
					setWithLastConsumed(
						$current,
						"destinationName",
						lv_destinationName_11_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_12=','
		{
			newLeafNode(otherlv_12, grammarAccess.getAddDependencyAccess().getCommaKeyword_12());
		}
		(
			(
				lv_destinationVersion_13_0=RULE_VERSION
				{
					newLeafNode(lv_destinationVersion_13_0, grammarAccess.getAddDependencyAccess().getDestinationVersionVERSIONTerminalRuleCall_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddDependencyRule());
					}
					setWithLastConsumed(
						$current,
						"destinationVersion",
						lv_destinationVersion_13_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_14=')'
		{
			newLeafNode(otherlv_14, grammarAccess.getAddDependencyAccess().getRightParenthesisKeyword_14());
		}
	)
;

// Entry rule entryRuleSize
entryRuleSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSizeRule()); }
	iv_ruleSize=ruleSize
	{ $current=$iv_ruleSize.current; }
	EOF;

// Rule Size
ruleSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='size'
		{
			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
		}
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getOfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSizeAccess().getSourceEntityTypeParserRuleCall_2_0());
				}
				lv_source_2_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSizeRule());
					}
					set(
						$current,
						"source",
						lv_source_2_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				lv_sourceName_4_0=RULE_STRING
				{
					newLeafNode(lv_sourceName_4_0, grammarAccess.getSizeAccess().getSourceNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"sourceName",
						lv_sourceName_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getSizeAccess().getCommaKeyword_5());
		}
		(
			(
				lv_sourceVersion_6_0=RULE_VERSION
				{
					newLeafNode(lv_sourceVersion_6_0, grammarAccess.getSizeAccess().getSourceVersionVERSIONTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"sourceVersion",
						lv_sourceVersion_6_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getSizeAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleOrder
entryRuleOrder returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrderRule()); }
	iv_ruleOrder=ruleOrder
	{ $current=$iv_ruleOrder.current; }
	EOF;

// Rule Order
ruleOrder returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='project'
		{
			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getProjectKeyword_0());
		}
		otherlv_1='order'
		{
			newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getOrderKeyword_1());
		}
		otherlv_2='for'
		{
			newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getForKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOrderAccess().getSourceEntityTypeParserRuleCall_3_0());
				}
				lv_source_3_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOrderRule());
					}
					set(
						$current,
						"source",
						lv_source_3_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				lv_sourceName_5_0=RULE_STRING
				{
					newLeafNode(lv_sourceName_5_0, grammarAccess.getOrderAccess().getSourceNameSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOrderRule());
					}
					setWithLastConsumed(
						$current,
						"sourceName",
						lv_sourceName_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6=','
		{
			newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getCommaKeyword_6());
		}
		(
			(
				lv_sourceVersion_7_0=RULE_VERSION
				{
					newLeafNode(lv_sourceVersion_7_0, grammarAccess.getOrderAccess().getSourceVersionVERSIONTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOrderRule());
					}
					setWithLastConsumed(
						$current,
						"sourceVersion",
						lv_sourceVersion_7_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getOrderAccess().getRightParenthesisKeyword_8());
		}
	)
;

// Entry rule entryRuleCycle
entryRuleCycle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCycleRule()); }
	iv_ruleCycle=ruleCycle
	{ $current=$iv_ruleCycle.current; }
	EOF;

// Rule Cycle
ruleCycle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='cycle'
		{
			newLeafNode(otherlv_0, grammarAccess.getCycleAccess().getCycleKeyword_0());
		}
		otherlv_1='between'
		{
			newLeafNode(otherlv_1, grammarAccess.getCycleAccess().getBetweenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCycleAccess().getSourceEntityTypeParserRuleCall_2_0());
				}
				lv_source_2_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCycleRule());
					}
					set(
						$current,
						"source",
						lv_source_2_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getCycleAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				lv_sourceName_4_0=RULE_STRING
				{
					newLeafNode(lv_sourceName_4_0, grammarAccess.getCycleAccess().getSourceNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCycleRule());
					}
					setWithLastConsumed(
						$current,
						"sourceName",
						lv_sourceName_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getCycleAccess().getCommaKeyword_5());
		}
		(
			(
				lv_sourceVersion_6_0=RULE_VERSION
				{
					newLeafNode(lv_sourceVersion_6_0, grammarAccess.getCycleAccess().getSourceVersionVERSIONTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCycleRule());
					}
					setWithLastConsumed(
						$current,
						"sourceVersion",
						lv_sourceVersion_6_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getCycleAccess().getRightParenthesisKeyword_7());
		}
		otherlv_8='and'
		{
			newLeafNode(otherlv_8, grammarAccess.getCycleAccess().getAndKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCycleAccess().getDestEntityTypeParserRuleCall_9_0());
				}
				lv_dest_9_0=ruleEntityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCycleRule());
					}
					set(
						$current,
						"dest",
						lv_dest_9_0,
						"at.uibk.ase.ex3.ComponentDsl.EntityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='('
		{
			newLeafNode(otherlv_10, grammarAccess.getCycleAccess().getLeftParenthesisKeyword_10());
		}
		(
			(
				lv_destinationName_11_0=RULE_STRING
				{
					newLeafNode(lv_destinationName_11_0, grammarAccess.getCycleAccess().getDestinationNameSTRINGTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCycleRule());
					}
					setWithLastConsumed(
						$current,
						"destinationName",
						lv_destinationName_11_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_12=','
		{
			newLeafNode(otherlv_12, grammarAccess.getCycleAccess().getCommaKeyword_12());
		}
		(
			(
				lv_destinationVersion_13_0=RULE_VERSION
				{
					newLeafNode(lv_destinationVersion_13_0, grammarAccess.getCycleAccess().getDestinationVersionVERSIONTerminalRuleCall_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCycleRule());
					}
					setWithLastConsumed(
						$current,
						"destinationVersion",
						lv_destinationVersion_13_0,
						"at.uibk.ase.ex3.ComponentDsl.VERSION");
				}
			)
		)
		otherlv_14=')'
		{
			newLeafNode(otherlv_14, grammarAccess.getCycleAccess().getRightParenthesisKeyword_14());
		}
	)
;

// Rule EntityBaseTypeEnum
ruleEntityBaseTypeEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Group'
			{
				$current = grammarAccess.getEntityBaseTypeEnumAccess().getGROUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEntityBaseTypeEnumAccess().getGROUPEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Member'
			{
				$current = grammarAccess.getEntityBaseTypeEnumAccess().getMEMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEntityBaseTypeEnumAccess().getMEMBEREnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_VERSION : RULE_INT '.' RULE_INT '.' RULE_INT ('-' RULE_ID)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
