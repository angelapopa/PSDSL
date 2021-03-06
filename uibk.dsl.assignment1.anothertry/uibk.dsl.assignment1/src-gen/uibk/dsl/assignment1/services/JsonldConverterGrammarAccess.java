/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class JsonldConverterGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		///* The entry rule of our DSL.
		// * Our DSL Model contains an arbitrary number (*) of Types which are added (+=) to a feature called elements. 
		// */ Model:
		//	elements+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Type*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//// Entity (or class) types which our DSL supports.
		//Type:
		//	DataType | Entity | Enum;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType | Entity | Enum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_0() { return cDataTypeParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
		
		//Enum
		public RuleCall getEnumParserRuleCall_2() { return cEnumParserRuleCall_2; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//// Defines a data type, e.g. String, Int, Url, Date
		//DataType:
		//	'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Assignment cFeaturesAssignment_4_0 = (Assignment)cUnorderedGroup_4.eContents().get(0);
		private final RuleCall cFeaturesPropertyParserRuleCall_4_0_0 = (RuleCall)cFeaturesAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cFeaturesAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cFeaturesPropertyParserRuleCall_4_1_1_0 = (RuleCall)cFeaturesAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		///* Defines an entity (or class) which can be instantiated later.
		// * An entity may extend a super type.
		// * An entity should have at least one property (or attribute).
		// */ Entity:
		//	'entity' name=ID ('extends' superType=[Entity])? '{' (features+=Property & (',' features+=Property)*)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity])? '{' (features+=Property & (',' features+=Property)*)? '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//(features+=Property & (',' features+=Property)*)?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }
		
		//features+=Property
		public Assignment getFeaturesAssignment_4_0() { return cFeaturesAssignment_4_0; }
		
		//Property
		public RuleCall getFeaturesPropertyParserRuleCall_4_0_0() { return cFeaturesPropertyParserRuleCall_4_0_0; }
		
		//(',' features+=Property)*
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//','
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }
		
		//features+=Property
		public Assignment getFeaturesAssignment_4_1_1() { return cFeaturesAssignment_4_1_1; }
		
		//Property
		public RuleCall getFeaturesPropertyParserRuleCall_4_1_1_0() { return cFeaturesPropertyParserRuleCall_4_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cManyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cManyListKeyword_2_0 = (Keyword)cManyAssignment_2.eContents().get(0);
		private final Assignment cOneAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cOneOneKeyword_3_0 = (Keyword)cOneAssignment_3.eContents().get(0);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeTypeCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_4_0_1 = (RuleCall)cTypeTypeCrossReference_4_0.eContents().get(1);
		
		///* Defines property of an Entity.
		// * Defines one-to-one relation with the keyword 'one'.
		// * Defines one-to-many relation with the keyword 'list'.
		// */ Property:
		//	name=ID ':' many?='list'? one?='one'? type=[Type];
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' many?='list'? one?='one'? type=[Type]
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//many?='list'?
		public Assignment getManyAssignment_2() { return cManyAssignment_2; }
		
		//'list'
		public Keyword getManyListKeyword_2_0() { return cManyListKeyword_2_0; }
		
		//one?='one'?
		public Assignment getOneAssignment_3() { return cOneAssignment_3; }
		
		//'one'
		public Keyword getOneOneKeyword_3_0() { return cOneOneKeyword_3_0; }
		
		//type=[Type]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_4_0() { return cTypeTypeCrossReference_4_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_4_0_1() { return cTypeTypeIDTerminalRuleCall_4_0_1; }
	}
	public class EnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.Enum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cFeaturesEnumItemParserRuleCall_3_0_0 = (RuleCall)cFeaturesAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cFeaturesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cFeaturesEnumItemParserRuleCall_3_1_1_0 = (RuleCall)cFeaturesAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		///* Defines an enumeration type by using the keyword 'enum'.
		// * An enumeration needs to have at least one item (or element). 
		// */ Enum:
		//	'enum' name=ID '{' (features+=EnumItem (',' features+=EnumItem)*)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'enum' name=ID '{' (features+=EnumItem (',' features+=EnumItem)*)? '}'
		public Group getGroup() { return cGroup; }
		
		//'enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(features+=EnumItem (',' features+=EnumItem)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//features+=EnumItem
		public Assignment getFeaturesAssignment_3_0() { return cFeaturesAssignment_3_0; }
		
		//EnumItem
		public RuleCall getFeaturesEnumItemParserRuleCall_3_0_0() { return cFeaturesEnumItemParserRuleCall_3_0_0; }
		
		//(',' features+=EnumItem)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//features+=EnumItem
		public Assignment getFeaturesAssignment_3_1_1() { return cFeaturesAssignment_3_1_1; }
		
		//EnumItem
		public RuleCall getFeaturesEnumItemParserRuleCall_3_1_1_0() { return cFeaturesEnumItemParserRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class EnumItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.EnumItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeSTRINGTerminalRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//// An item of an enumeration.
		//EnumItem:
		//	name=ID '=' type=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' type=STRING
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//type=STRING
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//STRING
		public RuleCall getTypeSTRINGTerminalRuleCall_2_0() { return cTypeSTRINGTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final EntityElements pEntity;
	private final PropertyElements pProperty;
	private final EnumElements pEnum;
	private final EnumItemElements pEnumItem;
	private final TerminalRule tURL;
	private final TerminalRule tDATE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public JsonldConverterGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pEntity = new EntityElements();
		this.pProperty = new PropertyElements();
		this.pEnum = new EnumElements();
		this.pEnumItem = new EnumItemElements();
		this.tURL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.URL");
		this.tDATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.dsl.assignment1.JsonldConverter.DATE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uibk.dsl.assignment1.JsonldConverter".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	///* The entry rule of our DSL.
	// * Our DSL Model contains an arbitrary number (*) of Types which are added (+=) to a feature called elements. 
	// */ Model:
	//	elements+=Type*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//// Entity (or class) types which our DSL supports.
	//Type:
	//	DataType | Entity | Enum;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//// Defines a data type, e.g. String, Int, Url, Date
	//DataType:
	//	'datatype' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	///* Defines an entity (or class) which can be instantiated later.
	// * An entity may extend a super type.
	// * An entity should have at least one property (or attribute).
	// */ Entity:
	//	'entity' name=ID ('extends' superType=[Entity])? '{' (features+=Property & (',' features+=Property)*)?
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	///* Defines property of an Entity.
	// * Defines one-to-one relation with the keyword 'one'.
	// * Defines one-to-many relation with the keyword 'list'.
	// */ Property:
	//	name=ID ':' many?='list'? one?='one'? type=[Type];
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	///* Defines an enumeration type by using the keyword 'enum'.
	// * An enumeration needs to have at least one item (or element). 
	// */ Enum:
	//	'enum' name=ID '{' (features+=EnumItem (',' features+=EnumItem)*)?
	//	'}';
	public EnumElements getEnumAccess() {
		return pEnum;
	}
	
	public ParserRule getEnumRule() {
		return getEnumAccess().getRule();
	}
	
	//// An item of an enumeration.
	//EnumItem:
	//	name=ID '=' type=STRING;
	public EnumItemElements getEnumItemAccess() {
		return pEnumItem;
	}
	
	public ParserRule getEnumItemRule() {
		return getEnumItemAccess().getRule();
	}
	
	//terminal URL:
	//	"(((http|https|ftp)+:)?\\/\\/)?(([\\d\\w]|%[a-fA-f\\d]{2,2})+(:([\\d\\w]|%[a-fA-f\\d]{2,2})+)?@)?([\\d\\w][-\\d\\w]{0,253}[\\d\\w]\\.)+[\\w]{2,63}(:[\\d]+)?(\\/([-+_~.\\d\\w]|%[a-fA-f\\d]{2,2})*)*(\\?(&?([-+_~.\\d\\w]|%[a-fA-f\\d]{2,2})=?)*)?(#([-+_~.\\d\\w]|%[a-fA-f\\d]{2,2})*)?";
	public TerminalRule getURLRule() {
		return tURL;
	}
	
	//terminal DATE:
	//	"([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))T([01]?\\d|2[0-3]):([0-5]\\d)?([0-5]\\d)";
	public TerminalRule getDATERule() {
		return tDATE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
