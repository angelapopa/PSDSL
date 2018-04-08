package at.uibk.ase.ex3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.uibk.ase.ex3.services.ComponentDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_VERSION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Group'", "'Member'", "'entity'", "'extends'", "'{'", "'}'", "'['", "']'", "'String'", "'Int'", "'Boolean'", "'Version'", "'create'", "'('", "','", "')'", "'add'", "'to'", "'responsibility'", "'dependency'", "'size'", "'of'", "'project'", "'order'", "'for'", "'cycle'", "'between'", "'and'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_VERSION=7;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDsl.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalComponentDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalComponentDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalComponentDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalComponentDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )+ ( (lv_actions_1_0= ruleAction ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:77:2: ( ( ( (lv_entities_0_0= ruleEntity ) )+ ( (lv_actions_1_0= ruleAction ) )+ ) )
            // InternalComponentDsl.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )+ ( (lv_actions_1_0= ruleAction ) )+ )
            {
            // InternalComponentDsl.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )+ ( (lv_actions_1_0= ruleAction ) )+ )
            // InternalComponentDsl.g:79:3: ( (lv_entities_0_0= ruleEntity ) )+ ( (lv_actions_1_0= ruleAction ) )+
            {
            // InternalComponentDsl.g:79:3: ( (lv_entities_0_0= ruleEntity ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentDsl.g:80:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalComponentDsl.g:80:4: (lv_entities_0_0= ruleEntity )
            	    // InternalComponentDsl.g:81:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"at.uibk.ase.ex3.ComponentDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalComponentDsl.g:98:3: ( (lv_actions_1_0= ruleAction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24||LA2_0==28||LA2_0==32||LA2_0==34||LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentDsl.g:99:4: (lv_actions_1_0= ruleAction )
            	    {
            	    // InternalComponentDsl.g:99:4: (lv_actions_1_0= ruleAction )
            	    // InternalComponentDsl.g:100:5: lv_actions_1_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getActionsActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actions_1_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"at.uibk.ase.ex3.ComponentDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntityBaseType"
    // InternalComponentDsl.g:121:1: entryRuleEntityBaseType returns [EObject current=null] : iv_ruleEntityBaseType= ruleEntityBaseType EOF ;
    public final EObject entryRuleEntityBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityBaseType = null;


        try {
            // InternalComponentDsl.g:121:55: (iv_ruleEntityBaseType= ruleEntityBaseType EOF )
            // InternalComponentDsl.g:122:2: iv_ruleEntityBaseType= ruleEntityBaseType EOF
            {
             newCompositeNode(grammarAccess.getEntityBaseTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityBaseType=ruleEntityBaseType();

            state._fsp--;

             current =iv_ruleEntityBaseType; 
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
    // $ANTLR end "entryRuleEntityBaseType"


    // $ANTLR start "ruleEntityBaseType"
    // InternalComponentDsl.g:128:1: ruleEntityBaseType returns [EObject current=null] : ( (otherlv_0= 'Group' () ) | (otherlv_2= 'Member' () ) ) ;
    public final EObject ruleEntityBaseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDsl.g:134:2: ( ( (otherlv_0= 'Group' () ) | (otherlv_2= 'Member' () ) ) )
            // InternalComponentDsl.g:135:2: ( (otherlv_0= 'Group' () ) | (otherlv_2= 'Member' () ) )
            {
            // InternalComponentDsl.g:135:2: ( (otherlv_0= 'Group' () ) | (otherlv_2= 'Member' () ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentDsl.g:136:3: (otherlv_0= 'Group' () )
                    {
                    // InternalComponentDsl.g:136:3: (otherlv_0= 'Group' () )
                    // InternalComponentDsl.g:137:4: otherlv_0= 'Group' ()
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityBaseTypeAccess().getGroupKeyword_0_0());
                    			
                    // InternalComponentDsl.g:141:4: ()
                    // InternalComponentDsl.g:142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityBaseTypeAccess().getGroupAction_0_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDsl.g:150:3: (otherlv_2= 'Member' () )
                    {
                    // InternalComponentDsl.g:150:3: (otherlv_2= 'Member' () )
                    // InternalComponentDsl.g:151:4: otherlv_2= 'Member' ()
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityBaseTypeAccess().getMemberKeyword_1_0());
                    			
                    // InternalComponentDsl.g:155:4: ()
                    // InternalComponentDsl.g:156:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityBaseTypeAccess().getMemberAction_1_1(),
                    						current);
                    				

                    }


                    }


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
    // $ANTLR end "ruleEntityBaseType"


    // $ANTLR start "entryRuleEntity"
    // InternalComponentDsl.g:167:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalComponentDsl.g:167:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalComponentDsl.g:168:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalComponentDsl.g:174:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (lv_parent_3_0= ruleEntityBaseType ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parent_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:180:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (lv_parent_3_0= ruleEntityBaseType ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalComponentDsl.g:181:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (lv_parent_3_0= ruleEntityBaseType ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalComponentDsl.g:181:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (lv_parent_3_0= ruleEntityBaseType ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalComponentDsl.g:182:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (lv_parent_3_0= ruleEntityBaseType ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalComponentDsl.g:186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDsl.g:187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDsl.g:187:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDsl.g:188:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2());
            		
            // InternalComponentDsl.g:208:3: ( (lv_parent_3_0= ruleEntityBaseType ) )
            // InternalComponentDsl.g:209:4: (lv_parent_3_0= ruleEntityBaseType )
            {
            // InternalComponentDsl.g:209:4: (lv_parent_3_0= ruleEntityBaseType )
            // InternalComponentDsl.g:210:5: lv_parent_3_0= ruleEntityBaseType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getParentEntityBaseTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_parent_3_0=ruleEntityBaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"parent",
            						lv_parent_3_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityBaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDsl.g:231:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=20 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentDsl.g:232:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalComponentDsl.g:232:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalComponentDsl.g:233:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"at.uibk.ase.ex3.ComponentDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleAttribute"
    // InternalComponentDsl.g:258:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalComponentDsl.g:258:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalComponentDsl.g:259:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalComponentDsl.g:265:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:271:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalComponentDsl.g:272:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalComponentDsl.g:272:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalComponentDsl.g:273:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalComponentDsl.g:273:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalComponentDsl.g:274:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalComponentDsl.g:274:4: (lv_type_0_0= ruleAttributeType )
            // InternalComponentDsl.g:275:5: lv_type_0_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"at.uibk.ase.ex3.ComponentDsl.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDsl.g:292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDsl.g:293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDsl.g:293:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDsl.g:294:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalComponentDsl.g:314:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalComponentDsl.g:314:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalComponentDsl.g:315:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalComponentDsl.g:321:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_elementType_0_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:327:2: ( ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // InternalComponentDsl.g:328:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // InternalComponentDsl.g:328:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // InternalComponentDsl.g:329:3: ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // InternalComponentDsl.g:329:3: ( (lv_elementType_0_0= ruleElementType ) )
            // InternalComponentDsl.g:330:4: (lv_elementType_0_0= ruleElementType )
            {
            // InternalComponentDsl.g:330:4: (lv_elementType_0_0= ruleElementType )
            // InternalComponentDsl.g:331:5: lv_elementType_0_0= ruleElementType
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_elementType_0_0=ruleElementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_0_0,
            						"at.uibk.ase.ex3.ComponentDsl.ElementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDsl.g:348:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentDsl.g:349:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalComponentDsl.g:349:4: ( (lv_array_1_0= '[' ) )
                    // InternalComponentDsl.g:350:5: (lv_array_1_0= '[' )
                    {
                    // InternalComponentDsl.g:350:5: (lv_array_1_0= '[' )
                    // InternalComponentDsl.g:351:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalComponentDsl.g:363:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalComponentDsl.g:364:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalComponentDsl.g:364:5: (lv_length_2_0= RULE_INT )
                            // InternalComponentDsl.g:365:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAttributeTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleElementType"
    // InternalComponentDsl.g:390:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalComponentDsl.g:390:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalComponentDsl.g:391:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalComponentDsl.g:397:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:403:2: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // InternalComponentDsl.g:404:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // InternalComponentDsl.g:404:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=23)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentDsl.g:405:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDsl.g:414:3: this_EntityType_1= ruleEntityType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;


                    			current = this_EntityType_1;
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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // InternalComponentDsl.g:426:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalComponentDsl.g:426:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalComponentDsl.g:427:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalComponentDsl.g:433:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;


        	enterRule();

        try {
            // InternalComponentDsl.g:439:2: ( ( ( (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' ) ) ) )
            // InternalComponentDsl.g:440:2: ( ( (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' ) ) )
            {
            // InternalComponentDsl.g:440:2: ( ( (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' ) ) )
            // InternalComponentDsl.g:441:3: ( (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' ) )
            {
            // InternalComponentDsl.g:441:3: ( (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' ) )
            // InternalComponentDsl.g:442:4: (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' )
            {
            // InternalComponentDsl.g:442:4: (lv_typeName_0_1= 'String' | lv_typeName_0_2= 'Int' | lv_typeName_0_3= 'Boolean' | lv_typeName_0_4= 'Version' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalComponentDsl.g:443:5: lv_typeName_0_1= 'String'
                    {
                    lv_typeName_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalComponentDsl.g:454:5: lv_typeName_0_2= 'Int'
                    {
                    lv_typeName_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalComponentDsl.g:465:5: lv_typeName_0_3= 'Boolean'
                    {
                    lv_typeName_0_3=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalComponentDsl.g:476:5: lv_typeName_0_4= 'Version'
                    {
                    lv_typeName_0_4=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameVersionKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalComponentDsl.g:492:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalComponentDsl.g:492:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalComponentDsl.g:493:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalComponentDsl.g:499:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalComponentDsl.g:505:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalComponentDsl.g:506:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalComponentDsl.g:506:2: ( (otherlv_0= RULE_ID ) )
            // InternalComponentDsl.g:507:3: (otherlv_0= RULE_ID )
            {
            // InternalComponentDsl.g:507:3: (otherlv_0= RULE_ID )
            // InternalComponentDsl.g:508:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0());
            			

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleAction"
    // InternalComponentDsl.g:522:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalComponentDsl.g:522:47: (iv_ruleAction= ruleAction EOF )
            // InternalComponentDsl.g:523:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalComponentDsl.g:529:1: ruleAction returns [EObject current=null] : (this_Create_0= ruleCreate | this_Add_1= ruleAdd | this_AddResponsibility_2= ruleAddResponsibility | this_AddDependency_3= ruleAddDependency | this_Size_4= ruleSize | this_Order_5= ruleOrder | this_Cycle_6= ruleCycle ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Add_1 = null;

        EObject this_AddResponsibility_2 = null;

        EObject this_AddDependency_3 = null;

        EObject this_Size_4 = null;

        EObject this_Order_5 = null;

        EObject this_Cycle_6 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:535:2: ( (this_Create_0= ruleCreate | this_Add_1= ruleAdd | this_AddResponsibility_2= ruleAddResponsibility | this_AddDependency_3= ruleAddDependency | this_Size_4= ruleSize | this_Order_5= ruleOrder | this_Cycle_6= ruleCycle ) )
            // InternalComponentDsl.g:536:2: (this_Create_0= ruleCreate | this_Add_1= ruleAdd | this_AddResponsibility_2= ruleAddResponsibility | this_AddDependency_3= ruleAddDependency | this_Size_4= ruleSize | this_Order_5= ruleOrder | this_Cycle_6= ruleCycle )
            {
            // InternalComponentDsl.g:536:2: (this_Create_0= ruleCreate | this_Add_1= ruleAdd | this_AddResponsibility_2= ruleAddResponsibility | this_AddDependency_3= ruleAddDependency | this_Size_4= ruleSize | this_Order_5= ruleOrder | this_Cycle_6= ruleCycle )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt9=2;
                    }
                    break;
                case 30:
                    {
                    alt9=3;
                    }
                    break;
                case 31:
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                alt9=5;
                }
                break;
            case 34:
                {
                alt9=6;
                }
                break;
            case 37:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalComponentDsl.g:537:3: this_Create_0= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_0=ruleCreate();

                    state._fsp--;


                    			current = this_Create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDsl.g:546:3: this_Add_1= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAddParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_1=ruleAdd();

                    state._fsp--;


                    			current = this_Add_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDsl.g:555:3: this_AddResponsibility_2= ruleAddResponsibility
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAddResponsibilityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddResponsibility_2=ruleAddResponsibility();

                    state._fsp--;


                    			current = this_AddResponsibility_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentDsl.g:564:3: this_AddDependency_3= ruleAddDependency
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAddDependencyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddDependency_3=ruleAddDependency();

                    state._fsp--;


                    			current = this_AddDependency_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentDsl.g:573:3: this_Size_4= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSizeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_4=ruleSize();

                    state._fsp--;


                    			current = this_Size_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalComponentDsl.g:582:3: this_Order_5= ruleOrder
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getOrderParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Order_5=ruleOrder();

                    state._fsp--;


                    			current = this_Order_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalComponentDsl.g:591:3: this_Cycle_6= ruleCycle
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCycleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cycle_6=ruleCycle();

                    state._fsp--;


                    			current = this_Cycle_6;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCreate"
    // InternalComponentDsl.g:603:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalComponentDsl.g:603:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalComponentDsl.g:604:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalComponentDsl.g:610:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'create' this_EntityType_1= ruleEntityType otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_version_5_0= RULE_VERSION ) ) otherlv_6= ')' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_version_5_0=null;
        Token otherlv_6=null;
        EObject this_EntityType_1 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:616:2: ( (otherlv_0= 'create' this_EntityType_1= ruleEntityType otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_version_5_0= RULE_VERSION ) ) otherlv_6= ')' ) )
            // InternalComponentDsl.g:617:2: (otherlv_0= 'create' this_EntityType_1= ruleEntityType otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_version_5_0= RULE_VERSION ) ) otherlv_6= ')' )
            {
            // InternalComponentDsl.g:617:2: (otherlv_0= 'create' this_EntityType_1= ruleEntityType otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_version_5_0= RULE_VERSION ) ) otherlv_6= ')' )
            // InternalComponentDsl.g:618:3: otherlv_0= 'create' this_EntityType_1= ruleEntityType otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_version_5_0= RULE_VERSION ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCreateAccess().getEntityTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_EntityType_1=ruleEntityType();

            state._fsp--;


            			current = this_EntityType_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getLeftParenthesisKeyword_2());
            		
            // InternalComponentDsl.g:634:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalComponentDsl.g:635:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalComponentDsl.g:635:4: (lv_name_3_0= RULE_STRING )
            // InternalComponentDsl.g:636:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCreateAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateAccess().getCommaKeyword_4());
            		
            // InternalComponentDsl.g:656:3: ( (lv_version_5_0= RULE_VERSION ) )
            // InternalComponentDsl.g:657:4: (lv_version_5_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:657:4: (lv_version_5_0= RULE_VERSION )
            // InternalComponentDsl.g:658:5: lv_version_5_0= RULE_VERSION
            {
            lv_version_5_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_version_5_0, grammarAccess.getCreateAccess().getVersionVERSIONTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_5_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleAdd"
    // InternalComponentDsl.g:682:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalComponentDsl.g:682:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalComponentDsl.g:683:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalComponentDsl.g:689:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'add' ( (lv_source_1_0= ruleEntityType ) ) otherlv_2= '(' ( (lv_sourceName_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_sourceVersion_5_0= RULE_VERSION ) ) otherlv_6= ')' otherlv_7= 'to' ( (lv_dest_8_0= ruleEntityType ) ) otherlv_9= '(' ( (lv_destinationName_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_destinationVersion_12_0= RULE_VERSION ) ) otherlv_13= ')' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_sourceName_3_0=null;
        Token otherlv_4=null;
        Token lv_sourceVersion_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_destinationName_10_0=null;
        Token otherlv_11=null;
        Token lv_destinationVersion_12_0=null;
        Token otherlv_13=null;
        EObject lv_source_1_0 = null;

        EObject lv_dest_8_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:695:2: ( (otherlv_0= 'add' ( (lv_source_1_0= ruleEntityType ) ) otherlv_2= '(' ( (lv_sourceName_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_sourceVersion_5_0= RULE_VERSION ) ) otherlv_6= ')' otherlv_7= 'to' ( (lv_dest_8_0= ruleEntityType ) ) otherlv_9= '(' ( (lv_destinationName_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_destinationVersion_12_0= RULE_VERSION ) ) otherlv_13= ')' ) )
            // InternalComponentDsl.g:696:2: (otherlv_0= 'add' ( (lv_source_1_0= ruleEntityType ) ) otherlv_2= '(' ( (lv_sourceName_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_sourceVersion_5_0= RULE_VERSION ) ) otherlv_6= ')' otherlv_7= 'to' ( (lv_dest_8_0= ruleEntityType ) ) otherlv_9= '(' ( (lv_destinationName_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_destinationVersion_12_0= RULE_VERSION ) ) otherlv_13= ')' )
            {
            // InternalComponentDsl.g:696:2: (otherlv_0= 'add' ( (lv_source_1_0= ruleEntityType ) ) otherlv_2= '(' ( (lv_sourceName_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_sourceVersion_5_0= RULE_VERSION ) ) otherlv_6= ')' otherlv_7= 'to' ( (lv_dest_8_0= ruleEntityType ) ) otherlv_9= '(' ( (lv_destinationName_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_destinationVersion_12_0= RULE_VERSION ) ) otherlv_13= ')' )
            // InternalComponentDsl.g:697:3: otherlv_0= 'add' ( (lv_source_1_0= ruleEntityType ) ) otherlv_2= '(' ( (lv_sourceName_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_sourceVersion_5_0= RULE_VERSION ) ) otherlv_6= ')' otherlv_7= 'to' ( (lv_dest_8_0= ruleEntityType ) ) otherlv_9= '(' ( (lv_destinationName_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_destinationVersion_12_0= RULE_VERSION ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            // InternalComponentDsl.g:701:3: ( (lv_source_1_0= ruleEntityType ) )
            // InternalComponentDsl.g:702:4: (lv_source_1_0= ruleEntityType )
            {
            // InternalComponentDsl.g:702:4: (lv_source_1_0= ruleEntityType )
            // InternalComponentDsl.g:703:5: lv_source_1_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getAddAccess().getSourceEntityTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_source_1_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_1_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getLeftParenthesisKeyword_2());
            		
            // InternalComponentDsl.g:724:3: ( (lv_sourceName_3_0= RULE_STRING ) )
            // InternalComponentDsl.g:725:4: (lv_sourceName_3_0= RULE_STRING )
            {
            // InternalComponentDsl.g:725:4: (lv_sourceName_3_0= RULE_STRING )
            // InternalComponentDsl.g:726:5: lv_sourceName_3_0= RULE_STRING
            {
            lv_sourceName_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceName_3_0, grammarAccess.getAddAccess().getSourceNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceName",
            						lv_sourceName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getCommaKeyword_4());
            		
            // InternalComponentDsl.g:746:3: ( (lv_sourceVersion_5_0= RULE_VERSION ) )
            // InternalComponentDsl.g:747:4: (lv_sourceVersion_5_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:747:4: (lv_sourceVersion_5_0= RULE_VERSION )
            // InternalComponentDsl.g:748:5: lv_sourceVersion_5_0= RULE_VERSION
            {
            lv_sourceVersion_5_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_sourceVersion_5_0, grammarAccess.getAddAccess().getSourceVersionVERSIONTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceVersion",
            						lv_sourceVersion_5_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getAddAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getAddAccess().getToKeyword_7());
            		
            // InternalComponentDsl.g:772:3: ( (lv_dest_8_0= ruleEntityType ) )
            // InternalComponentDsl.g:773:4: (lv_dest_8_0= ruleEntityType )
            {
            // InternalComponentDsl.g:773:4: (lv_dest_8_0= ruleEntityType )
            // InternalComponentDsl.g:774:5: lv_dest_8_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getAddAccess().getDestEntityTypeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_dest_8_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_8_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getAddAccess().getLeftParenthesisKeyword_9());
            		
            // InternalComponentDsl.g:795:3: ( (lv_destinationName_10_0= RULE_STRING ) )
            // InternalComponentDsl.g:796:4: (lv_destinationName_10_0= RULE_STRING )
            {
            // InternalComponentDsl.g:796:4: (lv_destinationName_10_0= RULE_STRING )
            // InternalComponentDsl.g:797:5: lv_destinationName_10_0= RULE_STRING
            {
            lv_destinationName_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_destinationName_10_0, grammarAccess.getAddAccess().getDestinationNameSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationName",
            						lv_destinationName_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getAddAccess().getCommaKeyword_11());
            		
            // InternalComponentDsl.g:817:3: ( (lv_destinationVersion_12_0= RULE_VERSION ) )
            // InternalComponentDsl.g:818:4: (lv_destinationVersion_12_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:818:4: (lv_destinationVersion_12_0= RULE_VERSION )
            // InternalComponentDsl.g:819:5: lv_destinationVersion_12_0= RULE_VERSION
            {
            lv_destinationVersion_12_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_destinationVersion_12_0, grammarAccess.getAddAccess().getDestinationVersionVERSIONTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationVersion",
            						lv_destinationVersion_12_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_13=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAddAccess().getRightParenthesisKeyword_13());
            		

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddResponsibility"
    // InternalComponentDsl.g:843:1: entryRuleAddResponsibility returns [EObject current=null] : iv_ruleAddResponsibility= ruleAddResponsibility EOF ;
    public final EObject entryRuleAddResponsibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddResponsibility = null;


        try {
            // InternalComponentDsl.g:843:58: (iv_ruleAddResponsibility= ruleAddResponsibility EOF )
            // InternalComponentDsl.g:844:2: iv_ruleAddResponsibility= ruleAddResponsibility EOF
            {
             newCompositeNode(grammarAccess.getAddResponsibilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddResponsibility=ruleAddResponsibility();

            state._fsp--;

             current =iv_ruleAddResponsibility; 
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
    // $ANTLR end "entryRuleAddResponsibility"


    // $ANTLR start "ruleAddResponsibility"
    // InternalComponentDsl.g:850:1: ruleAddResponsibility returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'responsibility' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_dest_6_0= ruleEntityType ) ) otherlv_7= '(' ( (lv_sourceName_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_sourceVersion_10_0= RULE_VERSION ) ) otherlv_11= ')' ) ;
    public final EObject ruleAddResponsibility() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_sourceName_8_0=null;
        Token otherlv_9=null;
        Token lv_sourceVersion_10_0=null;
        Token otherlv_11=null;
        EObject lv_dest_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:856:2: ( (otherlv_0= 'add' otherlv_1= 'responsibility' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_dest_6_0= ruleEntityType ) ) otherlv_7= '(' ( (lv_sourceName_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_sourceVersion_10_0= RULE_VERSION ) ) otherlv_11= ')' ) )
            // InternalComponentDsl.g:857:2: (otherlv_0= 'add' otherlv_1= 'responsibility' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_dest_6_0= ruleEntityType ) ) otherlv_7= '(' ( (lv_sourceName_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_sourceVersion_10_0= RULE_VERSION ) ) otherlv_11= ')' )
            {
            // InternalComponentDsl.g:857:2: (otherlv_0= 'add' otherlv_1= 'responsibility' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_dest_6_0= ruleEntityType ) ) otherlv_7= '(' ( (lv_sourceName_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_sourceVersion_10_0= RULE_VERSION ) ) otherlv_11= ')' )
            // InternalComponentDsl.g:858:3: otherlv_0= 'add' otherlv_1= 'responsibility' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_dest_6_0= ruleEntityType ) ) otherlv_7= '(' ( (lv_sourceName_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_sourceVersion_10_0= RULE_VERSION ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAddResponsibilityAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAddResponsibilityAccess().getResponsibilityKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAddResponsibilityAccess().getLeftParenthesisKeyword_2());
            		
            // InternalComponentDsl.g:870:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalComponentDsl.g:871:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalComponentDsl.g:871:4: (lv_name_3_0= RULE_STRING )
            // InternalComponentDsl.g:872:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAddResponsibilityAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddResponsibilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getAddResponsibilityAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAddResponsibilityAccess().getToKeyword_5());
            		
            // InternalComponentDsl.g:896:3: ( (lv_dest_6_0= ruleEntityType ) )
            // InternalComponentDsl.g:897:4: (lv_dest_6_0= ruleEntityType )
            {
            // InternalComponentDsl.g:897:4: (lv_dest_6_0= ruleEntityType )
            // InternalComponentDsl.g:898:5: lv_dest_6_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getAddResponsibilityAccess().getDestEntityTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_dest_6_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddResponsibilityRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_6_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getAddResponsibilityAccess().getLeftParenthesisKeyword_7());
            		
            // InternalComponentDsl.g:919:3: ( (lv_sourceName_8_0= RULE_STRING ) )
            // InternalComponentDsl.g:920:4: (lv_sourceName_8_0= RULE_STRING )
            {
            // InternalComponentDsl.g:920:4: (lv_sourceName_8_0= RULE_STRING )
            // InternalComponentDsl.g:921:5: lv_sourceName_8_0= RULE_STRING
            {
            lv_sourceName_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceName_8_0, grammarAccess.getAddResponsibilityAccess().getSourceNameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddResponsibilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceName",
            						lv_sourceName_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getAddResponsibilityAccess().getCommaKeyword_9());
            		
            // InternalComponentDsl.g:941:3: ( (lv_sourceVersion_10_0= RULE_VERSION ) )
            // InternalComponentDsl.g:942:4: (lv_sourceVersion_10_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:942:4: (lv_sourceVersion_10_0= RULE_VERSION )
            // InternalComponentDsl.g:943:5: lv_sourceVersion_10_0= RULE_VERSION
            {
            lv_sourceVersion_10_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_sourceVersion_10_0, grammarAccess.getAddResponsibilityAccess().getSourceVersionVERSIONTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddResponsibilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceVersion",
            						lv_sourceVersion_10_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAddResponsibilityAccess().getRightParenthesisKeyword_11());
            		

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
    // $ANTLR end "ruleAddResponsibility"


    // $ANTLR start "entryRuleAddDependency"
    // InternalComponentDsl.g:967:1: entryRuleAddDependency returns [EObject current=null] : iv_ruleAddDependency= ruleAddDependency EOF ;
    public final EObject entryRuleAddDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddDependency = null;


        try {
            // InternalComponentDsl.g:967:54: (iv_ruleAddDependency= ruleAddDependency EOF )
            // InternalComponentDsl.g:968:2: iv_ruleAddDependency= ruleAddDependency EOF
            {
             newCompositeNode(grammarAccess.getAddDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddDependency=ruleAddDependency();

            state._fsp--;

             current =iv_ruleAddDependency; 
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
    // $ANTLR end "entryRuleAddDependency"


    // $ANTLR start "ruleAddDependency"
    // InternalComponentDsl.g:974:1: ruleAddDependency returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'dependency' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'to' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' ) ;
    public final EObject ruleAddDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_sourceName_4_0=null;
        Token otherlv_5=null;
        Token lv_sourceVersion_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_destinationName_11_0=null;
        Token otherlv_12=null;
        Token lv_destinationVersion_13_0=null;
        Token otherlv_14=null;
        EObject lv_source_2_0 = null;

        EObject lv_dest_9_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:980:2: ( (otherlv_0= 'add' otherlv_1= 'dependency' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'to' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' ) )
            // InternalComponentDsl.g:981:2: (otherlv_0= 'add' otherlv_1= 'dependency' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'to' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' )
            {
            // InternalComponentDsl.g:981:2: (otherlv_0= 'add' otherlv_1= 'dependency' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'to' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' )
            // InternalComponentDsl.g:982:3: otherlv_0= 'add' otherlv_1= 'dependency' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'to' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAddDependencyAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAddDependencyAccess().getDependencyKeyword_1());
            		
            // InternalComponentDsl.g:990:3: ( (lv_source_2_0= ruleEntityType ) )
            // InternalComponentDsl.g:991:4: (lv_source_2_0= ruleEntityType )
            {
            // InternalComponentDsl.g:991:4: (lv_source_2_0= ruleEntityType )
            // InternalComponentDsl.g:992:5: lv_source_2_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getAddDependencyAccess().getSourceEntityTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_source_2_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddDependencyRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAddDependencyAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponentDsl.g:1013:3: ( (lv_sourceName_4_0= RULE_STRING ) )
            // InternalComponentDsl.g:1014:4: (lv_sourceName_4_0= RULE_STRING )
            {
            // InternalComponentDsl.g:1014:4: (lv_sourceName_4_0= RULE_STRING )
            // InternalComponentDsl.g:1015:5: lv_sourceName_4_0= RULE_STRING
            {
            lv_sourceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceName_4_0, grammarAccess.getAddDependencyAccess().getSourceNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceName",
            						lv_sourceName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getAddDependencyAccess().getCommaKeyword_5());
            		
            // InternalComponentDsl.g:1035:3: ( (lv_sourceVersion_6_0= RULE_VERSION ) )
            // InternalComponentDsl.g:1036:4: (lv_sourceVersion_6_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:1036:4: (lv_sourceVersion_6_0= RULE_VERSION )
            // InternalComponentDsl.g:1037:5: lv_sourceVersion_6_0= RULE_VERSION
            {
            lv_sourceVersion_6_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_sourceVersion_6_0, grammarAccess.getAddDependencyAccess().getSourceVersionVERSIONTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceVersion",
            						lv_sourceVersion_6_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getAddDependencyAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getAddDependencyAccess().getToKeyword_8());
            		
            // InternalComponentDsl.g:1061:3: ( (lv_dest_9_0= ruleEntityType ) )
            // InternalComponentDsl.g:1062:4: (lv_dest_9_0= ruleEntityType )
            {
            // InternalComponentDsl.g:1062:4: (lv_dest_9_0= ruleEntityType )
            // InternalComponentDsl.g:1063:5: lv_dest_9_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getAddDependencyAccess().getDestEntityTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_dest_9_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddDependencyRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_9_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getAddDependencyAccess().getLeftParenthesisKeyword_10());
            		
            // InternalComponentDsl.g:1084:3: ( (lv_destinationName_11_0= RULE_STRING ) )
            // InternalComponentDsl.g:1085:4: (lv_destinationName_11_0= RULE_STRING )
            {
            // InternalComponentDsl.g:1085:4: (lv_destinationName_11_0= RULE_STRING )
            // InternalComponentDsl.g:1086:5: lv_destinationName_11_0= RULE_STRING
            {
            lv_destinationName_11_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_destinationName_11_0, grammarAccess.getAddDependencyAccess().getDestinationNameSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationName",
            						lv_destinationName_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getAddDependencyAccess().getCommaKeyword_12());
            		
            // InternalComponentDsl.g:1106:3: ( (lv_destinationVersion_13_0= RULE_VERSION ) )
            // InternalComponentDsl.g:1107:4: (lv_destinationVersion_13_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:1107:4: (lv_destinationVersion_13_0= RULE_VERSION )
            // InternalComponentDsl.g:1108:5: lv_destinationVersion_13_0= RULE_VERSION
            {
            lv_destinationVersion_13_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_destinationVersion_13_0, grammarAccess.getAddDependencyAccess().getDestinationVersionVERSIONTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationVersion",
            						lv_destinationVersion_13_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAddDependencyAccess().getRightParenthesisKeyword_14());
            		

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
    // $ANTLR end "ruleAddDependency"


    // $ANTLR start "entryRuleSize"
    // InternalComponentDsl.g:1132:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalComponentDsl.g:1132:45: (iv_ruleSize= ruleSize EOF )
            // InternalComponentDsl.g:1133:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalComponentDsl.g:1139:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= 'of' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_sourceName_4_0=null;
        Token otherlv_5=null;
        Token lv_sourceVersion_6_0=null;
        Token otherlv_7=null;
        EObject lv_source_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:1145:2: ( (otherlv_0= 'size' otherlv_1= 'of' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' ) )
            // InternalComponentDsl.g:1146:2: (otherlv_0= 'size' otherlv_1= 'of' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' )
            {
            // InternalComponentDsl.g:1146:2: (otherlv_0= 'size' otherlv_1= 'of' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' )
            // InternalComponentDsl.g:1147:3: otherlv_0= 'size' otherlv_1= 'of' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getOfKeyword_1());
            		
            // InternalComponentDsl.g:1155:3: ( (lv_source_2_0= ruleEntityType ) )
            // InternalComponentDsl.g:1156:4: (lv_source_2_0= ruleEntityType )
            {
            // InternalComponentDsl.g:1156:4: (lv_source_2_0= ruleEntityType )
            // InternalComponentDsl.g:1157:5: lv_source_2_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getSizeAccess().getSourceEntityTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_source_2_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponentDsl.g:1178:3: ( (lv_sourceName_4_0= RULE_STRING ) )
            // InternalComponentDsl.g:1179:4: (lv_sourceName_4_0= RULE_STRING )
            {
            // InternalComponentDsl.g:1179:4: (lv_sourceName_4_0= RULE_STRING )
            // InternalComponentDsl.g:1180:5: lv_sourceName_4_0= RULE_STRING
            {
            lv_sourceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceName_4_0, grammarAccess.getSizeAccess().getSourceNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceName",
            						lv_sourceName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getSizeAccess().getCommaKeyword_5());
            		
            // InternalComponentDsl.g:1200:3: ( (lv_sourceVersion_6_0= RULE_VERSION ) )
            // InternalComponentDsl.g:1201:4: (lv_sourceVersion_6_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:1201:4: (lv_sourceVersion_6_0= RULE_VERSION )
            // InternalComponentDsl.g:1202:5: lv_sourceVersion_6_0= RULE_VERSION
            {
            lv_sourceVersion_6_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_sourceVersion_6_0, grammarAccess.getSizeAccess().getSourceVersionVERSIONTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceVersion",
            						lv_sourceVersion_6_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSizeAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleOrder"
    // InternalComponentDsl.g:1226:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalComponentDsl.g:1226:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalComponentDsl.g:1227:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalComponentDsl.g:1233:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= 'order' otherlv_2= 'for' ( (lv_source_3_0= ruleEntityType ) ) otherlv_4= '(' ( (lv_sourceName_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_sourceVersion_7_0= RULE_VERSION ) ) otherlv_8= ')' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_sourceName_5_0=null;
        Token otherlv_6=null;
        Token lv_sourceVersion_7_0=null;
        Token otherlv_8=null;
        EObject lv_source_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:1239:2: ( (otherlv_0= 'project' otherlv_1= 'order' otherlv_2= 'for' ( (lv_source_3_0= ruleEntityType ) ) otherlv_4= '(' ( (lv_sourceName_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_sourceVersion_7_0= RULE_VERSION ) ) otherlv_8= ')' ) )
            // InternalComponentDsl.g:1240:2: (otherlv_0= 'project' otherlv_1= 'order' otherlv_2= 'for' ( (lv_source_3_0= ruleEntityType ) ) otherlv_4= '(' ( (lv_sourceName_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_sourceVersion_7_0= RULE_VERSION ) ) otherlv_8= ')' )
            {
            // InternalComponentDsl.g:1240:2: (otherlv_0= 'project' otherlv_1= 'order' otherlv_2= 'for' ( (lv_source_3_0= ruleEntityType ) ) otherlv_4= '(' ( (lv_sourceName_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_sourceVersion_7_0= RULE_VERSION ) ) otherlv_8= ')' )
            // InternalComponentDsl.g:1241:3: otherlv_0= 'project' otherlv_1= 'order' otherlv_2= 'for' ( (lv_source_3_0= ruleEntityType ) ) otherlv_4= '(' ( (lv_sourceName_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_sourceVersion_7_0= RULE_VERSION ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getOrderKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getForKeyword_2());
            		
            // InternalComponentDsl.g:1253:3: ( (lv_source_3_0= ruleEntityType ) )
            // InternalComponentDsl.g:1254:4: (lv_source_3_0= ruleEntityType )
            {
            // InternalComponentDsl.g:1254:4: (lv_source_3_0= ruleEntityType )
            // InternalComponentDsl.g:1255:5: lv_source_3_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getSourceEntityTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_source_3_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_3_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftParenthesisKeyword_4());
            		
            // InternalComponentDsl.g:1276:3: ( (lv_sourceName_5_0= RULE_STRING ) )
            // InternalComponentDsl.g:1277:4: (lv_sourceName_5_0= RULE_STRING )
            {
            // InternalComponentDsl.g:1277:4: (lv_sourceName_5_0= RULE_STRING )
            // InternalComponentDsl.g:1278:5: lv_sourceName_5_0= RULE_STRING
            {
            lv_sourceName_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceName_5_0, grammarAccess.getOrderAccess().getSourceNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceName",
            						lv_sourceName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getCommaKeyword_6());
            		
            // InternalComponentDsl.g:1298:3: ( (lv_sourceVersion_7_0= RULE_VERSION ) )
            // InternalComponentDsl.g:1299:4: (lv_sourceVersion_7_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:1299:4: (lv_sourceVersion_7_0= RULE_VERSION )
            // InternalComponentDsl.g:1300:5: lv_sourceVersion_7_0= RULE_VERSION
            {
            lv_sourceVersion_7_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_sourceVersion_7_0, grammarAccess.getOrderAccess().getSourceVersionVERSIONTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceVersion",
            						lv_sourceVersion_7_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOrderAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleCycle"
    // InternalComponentDsl.g:1324:1: entryRuleCycle returns [EObject current=null] : iv_ruleCycle= ruleCycle EOF ;
    public final EObject entryRuleCycle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCycle = null;


        try {
            // InternalComponentDsl.g:1324:46: (iv_ruleCycle= ruleCycle EOF )
            // InternalComponentDsl.g:1325:2: iv_ruleCycle= ruleCycle EOF
            {
             newCompositeNode(grammarAccess.getCycleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCycle=ruleCycle();

            state._fsp--;

             current =iv_ruleCycle; 
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
    // $ANTLR end "entryRuleCycle"


    // $ANTLR start "ruleCycle"
    // InternalComponentDsl.g:1331:1: ruleCycle returns [EObject current=null] : (otherlv_0= 'cycle' otherlv_1= 'between' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'and' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' ) ;
    public final EObject ruleCycle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_sourceName_4_0=null;
        Token otherlv_5=null;
        Token lv_sourceVersion_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_destinationName_11_0=null;
        Token otherlv_12=null;
        Token lv_destinationVersion_13_0=null;
        Token otherlv_14=null;
        EObject lv_source_2_0 = null;

        EObject lv_dest_9_0 = null;



        	enterRule();

        try {
            // InternalComponentDsl.g:1337:2: ( (otherlv_0= 'cycle' otherlv_1= 'between' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'and' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' ) )
            // InternalComponentDsl.g:1338:2: (otherlv_0= 'cycle' otherlv_1= 'between' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'and' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' )
            {
            // InternalComponentDsl.g:1338:2: (otherlv_0= 'cycle' otherlv_1= 'between' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'and' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')' )
            // InternalComponentDsl.g:1339:3: otherlv_0= 'cycle' otherlv_1= 'between' ( (lv_source_2_0= ruleEntityType ) ) otherlv_3= '(' ( (lv_sourceName_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_sourceVersion_6_0= RULE_VERSION ) ) otherlv_7= ')' otherlv_8= 'and' ( (lv_dest_9_0= ruleEntityType ) ) otherlv_10= '(' ( (lv_destinationName_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_destinationVersion_13_0= RULE_VERSION ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getCycleAccess().getCycleKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCycleAccess().getBetweenKeyword_1());
            		
            // InternalComponentDsl.g:1347:3: ( (lv_source_2_0= ruleEntityType ) )
            // InternalComponentDsl.g:1348:4: (lv_source_2_0= ruleEntityType )
            {
            // InternalComponentDsl.g:1348:4: (lv_source_2_0= ruleEntityType )
            // InternalComponentDsl.g:1349:5: lv_source_2_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getCycleAccess().getSourceEntityTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_source_2_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCycleRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getCycleAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponentDsl.g:1370:3: ( (lv_sourceName_4_0= RULE_STRING ) )
            // InternalComponentDsl.g:1371:4: (lv_sourceName_4_0= RULE_STRING )
            {
            // InternalComponentDsl.g:1371:4: (lv_sourceName_4_0= RULE_STRING )
            // InternalComponentDsl.g:1372:5: lv_sourceName_4_0= RULE_STRING
            {
            lv_sourceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceName_4_0, grammarAccess.getCycleAccess().getSourceNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCycleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceName",
            						lv_sourceName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getCycleAccess().getCommaKeyword_5());
            		
            // InternalComponentDsl.g:1392:3: ( (lv_sourceVersion_6_0= RULE_VERSION ) )
            // InternalComponentDsl.g:1393:4: (lv_sourceVersion_6_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:1393:4: (lv_sourceVersion_6_0= RULE_VERSION )
            // InternalComponentDsl.g:1394:5: lv_sourceVersion_6_0= RULE_VERSION
            {
            lv_sourceVersion_6_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_sourceVersion_6_0, grammarAccess.getCycleAccess().getSourceVersionVERSIONTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCycleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceVersion",
            						lv_sourceVersion_6_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getCycleAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getCycleAccess().getAndKeyword_8());
            		
            // InternalComponentDsl.g:1418:3: ( (lv_dest_9_0= ruleEntityType ) )
            // InternalComponentDsl.g:1419:4: (lv_dest_9_0= ruleEntityType )
            {
            // InternalComponentDsl.g:1419:4: (lv_dest_9_0= ruleEntityType )
            // InternalComponentDsl.g:1420:5: lv_dest_9_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getCycleAccess().getDestEntityTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_dest_9_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCycleRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_9_0,
            						"at.uibk.ase.ex3.ComponentDsl.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getCycleAccess().getLeftParenthesisKeyword_10());
            		
            // InternalComponentDsl.g:1441:3: ( (lv_destinationName_11_0= RULE_STRING ) )
            // InternalComponentDsl.g:1442:4: (lv_destinationName_11_0= RULE_STRING )
            {
            // InternalComponentDsl.g:1442:4: (lv_destinationName_11_0= RULE_STRING )
            // InternalComponentDsl.g:1443:5: lv_destinationName_11_0= RULE_STRING
            {
            lv_destinationName_11_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_destinationName_11_0, grammarAccess.getCycleAccess().getDestinationNameSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCycleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationName",
            						lv_destinationName_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getCycleAccess().getCommaKeyword_12());
            		
            // InternalComponentDsl.g:1463:3: ( (lv_destinationVersion_13_0= RULE_VERSION ) )
            // InternalComponentDsl.g:1464:4: (lv_destinationVersion_13_0= RULE_VERSION )
            {
            // InternalComponentDsl.g:1464:4: (lv_destinationVersion_13_0= RULE_VERSION )
            // InternalComponentDsl.g:1465:5: lv_destinationVersion_13_0= RULE_VERSION
            {
            lv_destinationVersion_13_0=(Token)match(input,RULE_VERSION,FOLLOW_18); 

            					newLeafNode(lv_destinationVersion_13_0, grammarAccess.getCycleAccess().getDestinationVersionVERSIONTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCycleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationVersion",
            						lv_destinationVersion_13_0,
            						"at.uibk.ase.ex3.ComponentDsl.VERSION");
            				

            }


            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCycleAccess().getRightParenthesisKeyword_14());
            		

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
    // $ANTLR end "ruleCycle"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002511004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002511000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000F20010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F00010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});

}