package uibk.dsl.assignment1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uibk.dsl.assignment1.services.JsonldConverterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonldConverterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_DATE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'extends'", "'{'", "','", "'}'", "':'", "'list'", "'one'", "'enum'", "'='"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DATE=7;
    public static final int RULE_INT=8;
    public static final int RULE_URL=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonldConverterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonldConverterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonldConverterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonldConverter.g"; }



     	private JsonldConverterGrammarAccess grammarAccess;

        public InternalJsonldConverterParser(TokenStream input, JsonldConverterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected JsonldConverterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalJsonldConverter.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJsonldConverter.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalJsonldConverter.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJsonldConverter.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalJsonldConverter.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalJsonldConverter.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalJsonldConverter.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonldConverter.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalJsonldConverter.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalJsonldConverter.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"uibk.dsl.assignment1.JsonldConverter.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalJsonldConverter.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalJsonldConverter.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalJsonldConverter.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalJsonldConverter.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Enum_2 = null;



        	enterRule();

        try {
            // InternalJsonldConverter.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum ) )
            // InternalJsonldConverter.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum )
            {
            // InternalJsonldConverter.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonldConverter.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonldConverter.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonldConverter.g:133:3: this_Enum_2= ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enum_2=ruleEnum();

                    state._fsp--;


                    			current = this_Enum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalJsonldConverter.g:145:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalJsonldConverter.g:145:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalJsonldConverter.g:146:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalJsonldConverter.g:152:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJsonldConverter.g:158:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJsonldConverter.g:159:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJsonldConverter.g:159:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJsonldConverter.g:160:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalJsonldConverter.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJsonldConverter.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJsonldConverter.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalJsonldConverter.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalJsonldConverter.g:186:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalJsonldConverter.g:186:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalJsonldConverter.g:187:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalJsonldConverter.g:193:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_features_6_0 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalJsonldConverter.g:199:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )? otherlv_9= '}' ) )
            // InternalJsonldConverter.g:200:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )? otherlv_9= '}' )
            {
            // InternalJsonldConverter.g:200:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )? otherlv_9= '}' )
            // InternalJsonldConverter.g:201:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalJsonldConverter.g:205:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJsonldConverter.g:206:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJsonldConverter.g:206:4: (lv_name_1_0= RULE_ID )
            // InternalJsonldConverter.g:207:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJsonldConverter.g:223:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonldConverter.g:224:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalJsonldConverter.g:228:4: ( (otherlv_3= RULE_ID ) )
                    // InternalJsonldConverter.g:229:5: (otherlv_3= RULE_ID )
                    {
                    // InternalJsonldConverter.g:229:5: (otherlv_3= RULE_ID )
                    // InternalJsonldConverter.g:230:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonldConverter.g:246:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonldConverter.g:247:4: ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) )
                    {
                    // InternalJsonldConverter.g:247:4: ( ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) )
                    // InternalJsonldConverter.g:248:5: ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getEntityAccess().getUnorderedGroup_4());
                    				
                    // InternalJsonldConverter.g:251:5: ( ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?)
                    // InternalJsonldConverter.g:252:6: ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+ {...}?
                    {
                    // InternalJsonldConverter.g:252:6: ( ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( LA5_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0) ) {
                            alt5=1;
                        }
                        else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJsonldConverter.g:253:4: ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) )
                    	    {
                    	    // InternalJsonldConverter.g:253:4: ({...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) ) )
                    	    // InternalJsonldConverter.g:254:5: {...}? => ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0)");
                    	    }
                    	    // InternalJsonldConverter.g:254:103: ( ({...}? => ( (lv_features_6_0= ruleProperty ) ) ) )
                    	    // InternalJsonldConverter.g:255:6: ({...}? => ( (lv_features_6_0= ruleProperty ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0);
                    	    					
                    	    // InternalJsonldConverter.g:258:9: ({...}? => ( (lv_features_6_0= ruleProperty ) ) )
                    	    // InternalJsonldConverter.g:258:10: {...}? => ( (lv_features_6_0= ruleProperty ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntity", "true");
                    	    }
                    	    // InternalJsonldConverter.g:258:19: ( (lv_features_6_0= ruleProperty ) )
                    	    // InternalJsonldConverter.g:258:20: (lv_features_6_0= ruleProperty )
                    	    {
                    	    // InternalJsonldConverter.g:258:20: (lv_features_6_0= ruleProperty )
                    	    // InternalJsonldConverter.g:259:10: lv_features_6_0= ruleProperty
                    	    {

                    	    										newCompositeNode(grammarAccess.getEntityAccess().getFeaturesPropertyParserRuleCall_4_0_0());
                    	    									
                    	    pushFollow(FOLLOW_7);
                    	    lv_features_6_0=ruleProperty();

                    	    state._fsp--;


                    	    										if (current==null) {
                    	    											current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    										}
                    	    										add(
                    	    											current,
                    	    											"features",
                    	    											lv_features_6_0,
                    	    											"uibk.dsl.assignment1.JsonldConverter.Property");
                    	    										afterParserOrEnumRuleCall();
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityAccess().getUnorderedGroup_4());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJsonldConverter.g:281:4: ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) )
                    	    {
                    	    // InternalJsonldConverter.g:281:4: ({...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ ) )
                    	    // InternalJsonldConverter.g:282:5: {...}? => ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1)");
                    	    }
                    	    // InternalJsonldConverter.g:282:103: ( ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+ )
                    	    // InternalJsonldConverter.g:283:6: ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1);
                    	    					
                    	    // InternalJsonldConverter.g:286:9: ({...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) ) )+
                    	    int cnt4=0;
                    	    loop4:
                    	    do {
                    	        int alt4=2;
                    	        int LA4_0 = input.LA(1);

                    	        if ( (LA4_0==17) ) {
                    	            int LA4_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt4=1;
                    	            }


                    	        }


                    	        switch (alt4) {
                    	    	case 1 :
                    	    	    // InternalJsonldConverter.g:286:10: {...}? => (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleEntity", "true");
                    	    	    }
                    	    	    // InternalJsonldConverter.g:286:19: (otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) ) )
                    	    	    // InternalJsonldConverter.g:286:20: otherlv_7= ',' ( (lv_features_8_0= ruleProperty ) )
                    	    	    {
                    	    	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    	    	    									newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_1_0());
                    	    	    								
                    	    	    // InternalJsonldConverter.g:290:9: ( (lv_features_8_0= ruleProperty ) )
                    	    	    // InternalJsonldConverter.g:291:10: (lv_features_8_0= ruleProperty )
                    	    	    {
                    	    	    // InternalJsonldConverter.g:291:10: (lv_features_8_0= ruleProperty )
                    	    	    // InternalJsonldConverter.g:292:11: lv_features_8_0= ruleProperty
                    	    	    {

                    	    	    											newCompositeNode(grammarAccess.getEntityAccess().getFeaturesPropertyParserRuleCall_4_1_1_0());
                    	    	    										
                    	    	    pushFollow(FOLLOW_7);
                    	    	    lv_features_8_0=ruleProperty();

                    	    	    state._fsp--;


                    	    	    											if (current==null) {
                    	    	    												current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	    											}
                    	    	    											add(
                    	    	    												current,
                    	    	    												"features",
                    	    	    												lv_features_8_0,
                    	    	    												"uibk.dsl.assignment1.JsonldConverter.Property");
                    	    	    											afterParserOrEnumRuleCall();
                    	    	    										

                    	    	    }


                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt4 >= 1 ) break loop4;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(4, input);
                    	                throw eee;
                    	        }
                    	        cnt4++;
                    	    } while (true);

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityAccess().getUnorderedGroup_4());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntityAccess().getUnorderedGroup_4()) ) {
                        throw new FailedPredicateException(input, "ruleEntity", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntityAccess().getUnorderedGroup_4())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getEntityAccess().getUnorderedGroup_4());
                    				

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalJsonldConverter.g:331:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJsonldConverter.g:331:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJsonldConverter.g:332:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJsonldConverter.g:338:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'list' ) )? ( (lv_one_3_0= 'one' ) )? ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_many_2_0=null;
        Token lv_one_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJsonldConverter.g:344:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'list' ) )? ( (lv_one_3_0= 'one' ) )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalJsonldConverter.g:345:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'list' ) )? ( (lv_one_3_0= 'one' ) )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalJsonldConverter.g:345:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'list' ) )? ( (lv_one_3_0= 'one' ) )? ( (otherlv_4= RULE_ID ) ) )
            // InternalJsonldConverter.g:346:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'list' ) )? ( (lv_one_3_0= 'one' ) )? ( (otherlv_4= RULE_ID ) )
            {
            // InternalJsonldConverter.g:346:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJsonldConverter.g:347:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJsonldConverter.g:347:4: (lv_name_0_0= RULE_ID )
            // InternalJsonldConverter.g:348:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalJsonldConverter.g:368:3: ( (lv_many_2_0= 'list' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonldConverter.g:369:4: (lv_many_2_0= 'list' )
                    {
                    // InternalJsonldConverter.g:369:4: (lv_many_2_0= 'list' )
                    // InternalJsonldConverter.g:370:5: lv_many_2_0= 'list'
                    {
                    lv_many_2_0=(Token)match(input,20,FOLLOW_10); 

                    					newLeafNode(lv_many_2_0, grammarAccess.getPropertyAccess().getManyListKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "list");
                    				

                    }


                    }
                    break;

            }

            // InternalJsonldConverter.g:382:3: ( (lv_one_3_0= 'one' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonldConverter.g:383:4: (lv_one_3_0= 'one' )
                    {
                    // InternalJsonldConverter.g:383:4: (lv_one_3_0= 'one' )
                    // InternalJsonldConverter.g:384:5: lv_one_3_0= 'one'
                    {
                    lv_one_3_0=(Token)match(input,21,FOLLOW_4); 

                    					newLeafNode(lv_one_3_0, grammarAccess.getPropertyAccess().getOneOneKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyRule());
                    					}
                    					setWithLastConsumed(current, "one", true, "one");
                    				

                    }


                    }
                    break;

            }

            // InternalJsonldConverter.g:396:3: ( (otherlv_4= RULE_ID ) )
            // InternalJsonldConverter.g:397:4: (otherlv_4= RULE_ID )
            {
            // InternalJsonldConverter.g:397:4: (otherlv_4= RULE_ID )
            // InternalJsonldConverter.g:398:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getTypeTypeCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEnum"
    // InternalJsonldConverter.g:413:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalJsonldConverter.g:413:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalJsonldConverter.g:414:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalJsonldConverter.g:420:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalJsonldConverter.g:426:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )* )? otherlv_6= '}' ) )
            // InternalJsonldConverter.g:427:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )* )? otherlv_6= '}' )
            {
            // InternalJsonldConverter.g:427:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )* )? otherlv_6= '}' )
            // InternalJsonldConverter.g:428:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalJsonldConverter.g:432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJsonldConverter.g:433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJsonldConverter.g:433:4: (lv_name_1_0= RULE_ID )
            // InternalJsonldConverter.g:434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJsonldConverter.g:454:3: ( ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonldConverter.g:455:4: ( (lv_features_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )*
                    {
                    // InternalJsonldConverter.g:455:4: ( (lv_features_3_0= ruleEnumItem ) )
                    // InternalJsonldConverter.g:456:5: (lv_features_3_0= ruleEnumItem )
                    {
                    // InternalJsonldConverter.g:456:5: (lv_features_3_0= ruleEnumItem )
                    // InternalJsonldConverter.g:457:6: lv_features_3_0= ruleEnumItem
                    {

                    						newCompositeNode(grammarAccess.getEnumAccess().getFeaturesEnumItemParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_features_3_0=ruleEnumItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumRule());
                    						}
                    						add(
                    							current,
                    							"features",
                    							lv_features_3_0,
                    							"uibk.dsl.assignment1.JsonldConverter.EnumItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonldConverter.g:474:4: (otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalJsonldConverter.g:475:5: otherlv_4= ',' ( (lv_features_5_0= ruleEnumItem ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalJsonldConverter.g:479:5: ( (lv_features_5_0= ruleEnumItem ) )
                    	    // InternalJsonldConverter.g:480:6: (lv_features_5_0= ruleEnumItem )
                    	    {
                    	    // InternalJsonldConverter.g:480:6: (lv_features_5_0= ruleEnumItem )
                    	    // InternalJsonldConverter.g:481:7: lv_features_5_0= ruleEnumItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumAccess().getFeaturesEnumItemParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_features_5_0=ruleEnumItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"features",
                    	    								lv_features_5_0,
                    	    								"uibk.dsl.assignment1.JsonldConverter.EnumItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumItem"
    // InternalJsonldConverter.g:508:1: entryRuleEnumItem returns [EObject current=null] : iv_ruleEnumItem= ruleEnumItem EOF ;
    public final EObject entryRuleEnumItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItem = null;


        try {
            // InternalJsonldConverter.g:508:49: (iv_ruleEnumItem= ruleEnumItem EOF )
            // InternalJsonldConverter.g:509:2: iv_ruleEnumItem= ruleEnumItem EOF
            {
             newCompositeNode(grammarAccess.getEnumItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumItem=ruleEnumItem();

            state._fsp--;

             current =iv_ruleEnumItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumItem"


    // $ANTLR start "ruleEnumItem"
    // InternalJsonldConverter.g:515:1: ruleEnumItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalJsonldConverter.g:521:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // InternalJsonldConverter.g:522:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // InternalJsonldConverter.g:522:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= RULE_STRING ) ) )
            // InternalJsonldConverter.g:523:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= RULE_STRING ) )
            {
            // InternalJsonldConverter.g:523:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJsonldConverter.g:524:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJsonldConverter.g:524:4: (lv_name_0_0= RULE_ID )
            // InternalJsonldConverter.g:525:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumItemAccess().getEqualsSignKeyword_1());
            		
            // InternalJsonldConverter.g:545:3: ( (lv_type_2_0= RULE_STRING ) )
            // InternalJsonldConverter.g:546:4: (lv_type_2_0= RULE_STRING )
            {
            // InternalJsonldConverter.g:546:4: (lv_type_2_0= RULE_STRING )
            // InternalJsonldConverter.g:547:5: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getEnumItemAccess().getTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumItem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000406002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});

}
