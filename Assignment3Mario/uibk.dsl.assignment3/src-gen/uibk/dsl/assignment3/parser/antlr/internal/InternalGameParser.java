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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scene'", "'{'", "'objects'", "'('", "','", "')'", "'description'", "'actions'", "'}'", "'character'", "'healthPoints'", "'object'", "'is'", "'a'", "'step'", "'if'", "'valid'", "'then'", "'jump over'", "'pick up'", "'walk through'", "'attack'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }



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




    // $ANTLR start "entryRuleAdventure"
    // InternalGame.g:65:1: entryRuleAdventure returns [EObject current=null] : iv_ruleAdventure= ruleAdventure EOF ;
    public final EObject entryRuleAdventure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdventure = null;


        try {
            // InternalGame.g:65:50: (iv_ruleAdventure= ruleAdventure EOF )
            // InternalGame.g:66:2: iv_ruleAdventure= ruleAdventure EOF
            {
             newCompositeNode(grammarAccess.getAdventureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdventure=ruleAdventure();

            state._fsp--;

             current =iv_ruleAdventure; 
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
    // $ANTLR end "entryRuleAdventure"


    // $ANTLR start "ruleAdventure"
    // InternalGame.g:72:1: ruleAdventure returns [EObject current=null] : ( (lv_ingredients_0_0= ruleIngredient ) )* ;
    public final EObject ruleAdventure() throws RecognitionException {
        EObject current = null;

        EObject lv_ingredients_0_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( ( (lv_ingredients_0_0= ruleIngredient ) )* )
            // InternalGame.g:79:2: ( (lv_ingredients_0_0= ruleIngredient ) )*
            {
            // InternalGame.g:79:2: ( (lv_ingredients_0_0= ruleIngredient ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:80:3: (lv_ingredients_0_0= ruleIngredient )
            	    {
            	    // InternalGame.g:80:3: (lv_ingredients_0_0= ruleIngredient )
            	    // InternalGame.g:81:4: lv_ingredients_0_0= ruleIngredient
            	    {

            	    				newCompositeNode(grammarAccess.getAdventureAccess().getIngredientsIngredientParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_ingredients_0_0=ruleIngredient();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAdventureRule());
            	    				}
            	    				add(
            	    					current,
            	    					"ingredients",
            	    					lv_ingredients_0_0,
            	    					"uibk.dsl.assignment3.Game.Ingredient");
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
    // $ANTLR end "ruleAdventure"


    // $ANTLR start "entryRuleIngredient"
    // InternalGame.g:101:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalGame.g:101:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalGame.g:102:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalGame.g:108:1: ruleIngredient returns [EObject current=null] : (this_Scene_0= ruleScene | this_Object_1= ruleObject | this_Character_2= ruleCharacter ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        EObject this_Scene_0 = null;

        EObject this_Object_1 = null;

        EObject this_Character_2 = null;



        	enterRule();

        try {
            // InternalGame.g:114:2: ( (this_Scene_0= ruleScene | this_Object_1= ruleObject | this_Character_2= ruleCharacter ) )
            // InternalGame.g:115:2: (this_Scene_0= ruleScene | this_Object_1= ruleObject | this_Character_2= ruleCharacter )
            {
            // InternalGame.g:115:2: (this_Scene_0= ruleScene | this_Object_1= ruleObject | this_Character_2= ruleCharacter )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 20:
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
                    // InternalGame.g:116:3: this_Scene_0= ruleScene
                    {

                    			newCompositeNode(grammarAccess.getIngredientAccess().getSceneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scene_0=ruleScene();

                    state._fsp--;


                    			current = this_Scene_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:125:3: this_Object_1= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getIngredientAccess().getObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_1=ruleObject();

                    state._fsp--;


                    			current = this_Object_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:134:3: this_Character_2= ruleCharacter
                    {

                    			newCompositeNode(grammarAccess.getIngredientAccess().getCharacterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Character_2=ruleCharacter();

                    state._fsp--;


                    			current = this_Character_2;
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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:146:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalGame.g:146:46: (iv_ruleScene= ruleScene EOF )
            // InternalGame.g:147:2: iv_ruleScene= ruleScene EOF
            {
             newCompositeNode(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScene=ruleScene();

            state._fsp--;

             current =iv_ruleScene; 
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
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalGame.g:153:1: ruleScene returns [EObject current=null] : (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_actions_13_0 = null;

        EObject lv_actions_15_0 = null;



        	enterRule();

        try {
            // InternalGame.g:159:2: ( (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalGame.g:160:2: (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalGame.g:160:2: (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalGame.g:161:3: otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneAccess().getSceneKeyword_0());
            		
            // InternalGame.g:165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:166:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:187:3: (otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:188:4: otherlv_3= 'objects' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getSceneAccess().getObjectsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalGame.g:196:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:197:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:197:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:198:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSceneRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getObjectsObjectCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalGame.g:209:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGame.g:210:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGame.g:214:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalGame.g:215:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalGame.g:215:6: (otherlv_7= RULE_ID )
                    	    // InternalGame.g:216:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSceneRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getSceneAccess().getObjectsObjectCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getSceneAccess().getDescriptionKeyword_4());
            		
            // InternalGame.g:237:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalGame.g:238:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalGame.g:238:4: (lv_description_10_0= RULE_STRING )
            // InternalGame.g:239:5: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_10_0, grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:255:3: (otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:256:4: otherlv_11= 'actions' otherlv_12= '(' ( (lv_actions_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getSceneAccess().getActionsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getSceneAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalGame.g:264:4: ( (lv_actions_13_0= ruleStep ) )
                    // InternalGame.g:265:5: (lv_actions_13_0= ruleStep )
                    {
                    // InternalGame.g:265:5: (lv_actions_13_0= ruleStep )
                    // InternalGame.g:266:6: lv_actions_13_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_actions_13_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSceneRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_13_0,
                    							"uibk.dsl.assignment3.Game.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:283:4: (otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGame.g:284:5: otherlv_14= ',' ( (lv_actions_15_0= ruleStep ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSceneAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGame.g:288:5: ( (lv_actions_15_0= ruleStep ) )
                    	    // InternalGame.g:289:6: (lv_actions_15_0= ruleStep )
                    	    {
                    	    // InternalGame.g:289:6: (lv_actions_15_0= ruleStep )
                    	    // InternalGame.g:290:7: lv_actions_15_0= ruleStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_actions_15_0=ruleStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSceneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_15_0,
                    	    								"uibk.dsl.assignment3.Game.Step");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getSceneAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleCharacter"
    // InternalGame.g:321:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalGame.g:321:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalGame.g:322:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
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
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalGame.g:328:1: ruleCharacter returns [EObject current=null] : (otherlv_0= 'character' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'healthPoints' ( (lv_healthPoints_6_0= RULE_INT ) ) (otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_healthPoints_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_actions_9_0 = null;

        EObject lv_actions_11_0 = null;



        	enterRule();

        try {
            // InternalGame.g:334:2: ( (otherlv_0= 'character' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'healthPoints' ( (lv_healthPoints_6_0= RULE_INT ) ) (otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalGame.g:335:2: (otherlv_0= 'character' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'healthPoints' ( (lv_healthPoints_6_0= RULE_INT ) ) (otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalGame.g:335:2: (otherlv_0= 'character' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'healthPoints' ( (lv_healthPoints_6_0= RULE_INT ) ) (otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalGame.g:336:3: otherlv_0= 'character' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'healthPoints' ( (lv_healthPoints_6_0= RULE_INT ) ) (otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
            		
            // InternalGame.g:340:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )
            // InternalGame.g:341:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            {
            // InternalGame.g:341:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            // InternalGame.g:342:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            {
            // InternalGame.g:342:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
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
                    // InternalGame.g:343:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getCharacterAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCharacterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalGame.g:358:6: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCharacterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterAccess().getDescriptionKeyword_3());
            		
            // InternalGame.g:383:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalGame.g:384:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalGame.g:384:4: (lv_description_4_0= RULE_STRING )
            // InternalGame.g:385:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_description_4_0, grammarAccess.getCharacterAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getCharacterAccess().getHealthPointsKeyword_5());
            		
            // InternalGame.g:405:3: ( (lv_healthPoints_6_0= RULE_INT ) )
            // InternalGame.g:406:4: (lv_healthPoints_6_0= RULE_INT )
            {
            // InternalGame.g:406:4: (lv_healthPoints_6_0= RULE_INT )
            // InternalGame.g:407:5: lv_healthPoints_6_0= RULE_INT
            {
            lv_healthPoints_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_healthPoints_6_0, grammarAccess.getCharacterAccess().getHealthPointsINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"healthPoints",
            						lv_healthPoints_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:423:3: (otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:424:4: otherlv_7= 'actions' otherlv_8= '(' ( (lv_actions_9_0= ruleStep ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getCharacterAccess().getActionsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getCharacterAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalGame.g:432:4: ( (lv_actions_9_0= ruleStep ) )
                    // InternalGame.g:433:5: (lv_actions_9_0= ruleStep )
                    {
                    // InternalGame.g:433:5: (lv_actions_9_0= ruleStep )
                    // InternalGame.g:434:6: lv_actions_9_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getCharacterAccess().getActionsStepParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_actions_9_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_9_0,
                    							"uibk.dsl.assignment3.Game.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:451:4: (otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGame.g:452:5: otherlv_10= ',' ( (lv_actions_11_0= ruleStep ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getCharacterAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGame.g:456:5: ( (lv_actions_11_0= ruleStep ) )
                    	    // InternalGame.g:457:6: (lv_actions_11_0= ruleStep )
                    	    {
                    	    // InternalGame.g:457:6: (lv_actions_11_0= ruleStep )
                    	    // InternalGame.g:458:7: lv_actions_11_0= ruleStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getCharacterAccess().getActionsStepParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_actions_11_0=ruleStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCharacterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_11_0,
                    	    								"uibk.dsl.assignment3.Game.Step");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getCharacterAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:489:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalGame.g:489:47: (iv_ruleObject= ruleObject EOF )
            // InternalGame.g:490:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalGame.g:496:1: ruleObject returns [EObject current=null] : (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) (otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'healthPoints' ( (lv_healthPoints_9_0= RULE_INT ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_healthPoints_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_actions_12_0 = null;

        Enumerator lv_actions_14_0 = null;



        	enterRule();

        try {
            // InternalGame.g:502:2: ( (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) (otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'healthPoints' ( (lv_healthPoints_9_0= RULE_INT ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalGame.g:503:2: (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) (otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'healthPoints' ( (lv_healthPoints_9_0= RULE_INT ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalGame.g:503:2: (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) (otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'healthPoints' ( (lv_healthPoints_9_0= RULE_INT ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalGame.g:504:3: otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) (otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'healthPoints' ( (lv_healthPoints_9_0= RULE_INT ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
            		
            // InternalGame.g:508:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )
            // InternalGame.g:509:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            {
            // InternalGame.g:509:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            // InternalGame.g:510:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            {
            // InternalGame.g:510:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:511:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getObjectAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalGame.g:526:6: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


            }


            }

            // InternalGame.g:543:3: (otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:544:4: otherlv_2= 'is' otherlv_3= 'a' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getIsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getAKeyword_2_1());
                    			
                    // InternalGame.g:552:4: ( (otherlv_4= RULE_ID ) )
                    // InternalGame.g:553:5: (otherlv_4= RULE_ID )
                    {
                    // InternalGame.g:553:5: (otherlv_4= RULE_ID )
                    // InternalGame.g:554:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getDescriptionKeyword_4());
            		
            // InternalGame.g:574:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalGame.g:575:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalGame.g:575:4: (lv_description_7_0= RULE_STRING )
            // InternalGame.g:576:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_description_7_0, grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getHealthPointsKeyword_6());
            		
            // InternalGame.g:596:3: ( (lv_healthPoints_9_0= RULE_INT ) )
            // InternalGame.g:597:4: (lv_healthPoints_9_0= RULE_INT )
            {
            // InternalGame.g:597:4: (lv_healthPoints_9_0= RULE_INT )
            // InternalGame.g:598:5: lv_healthPoints_9_0= RULE_INT
            {
            lv_healthPoints_9_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_healthPoints_9_0, grammarAccess.getObjectAccess().getHealthPointsINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"healthPoints",
            						lv_healthPoints_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:614:3: (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:615:4: otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getActionsKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalGame.g:623:4: ( (lv_actions_12_0= ruleAction ) )
                    // InternalGame.g:624:5: (lv_actions_12_0= ruleAction )
                    {
                    // InternalGame.g:624:5: (lv_actions_12_0= ruleAction )
                    // InternalGame.g:625:6: lv_actions_12_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getActionsActionEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_actions_12_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_12_0,
                    							"uibk.dsl.assignment3.Game.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:642:4: (otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGame.g:643:5: otherlv_13= ',' ( (lv_actions_14_0= ruleAction ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_19); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getObjectAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGame.g:647:5: ( (lv_actions_14_0= ruleAction ) )
                    	    // InternalGame.g:648:6: (lv_actions_14_0= ruleAction )
                    	    {
                    	    // InternalGame.g:648:6: (lv_actions_14_0= ruleAction )
                    	    // InternalGame.g:649:7: lv_actions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectAccess().getActionsActionEnumRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_actions_14_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_14_0,
                    	    								"uibk.dsl.assignment3.Game.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getObjectAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleStep"
    // InternalGame.g:680:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalGame.g:680:45: (iv_ruleStep= ruleStep EOF )
            // InternalGame.g:681:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalGame.g:687:1: ruleStep returns [EObject current=null] : (otherlv_0= 'step' otherlv_1= '{' ( (lv_action_2_0= ruleAction ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' (otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) ) ) otherlv_7= 'then' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_valid_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:693:2: ( (otherlv_0= 'step' otherlv_1= '{' ( (lv_action_2_0= ruleAction ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' (otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) ) ) otherlv_7= 'then' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalGame.g:694:2: (otherlv_0= 'step' otherlv_1= '{' ( (lv_action_2_0= ruleAction ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' (otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) ) ) otherlv_7= 'then' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalGame.g:694:2: (otherlv_0= 'step' otherlv_1= '{' ( (lv_action_2_0= ruleAction ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' (otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) ) ) otherlv_7= 'then' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalGame.g:695:3: otherlv_0= 'step' otherlv_1= '{' ( (lv_action_2_0= ruleAction ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' (otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) ) ) otherlv_7= 'then' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:703:3: ( (lv_action_2_0= ruleAction ) )
            // InternalGame.g:704:4: (lv_action_2_0= ruleAction )
            {
            // InternalGame.g:704:4: (lv_action_2_0= ruleAction )
            // InternalGame.g:705:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStepAccess().getActionActionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_action_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"uibk.dsl.assignment3.Game.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:722:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:723:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:723:4: (otherlv_3= RULE_ID )
            // InternalGame.g:724:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getIfKeyword_4());
            		
            // InternalGame.g:739:3: (otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) ) )
            // InternalGame.g:740:4: otherlv_5= 'valid' ( (lv_valid_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,27,FOLLOW_10); 

            				newLeafNode(otherlv_5, grammarAccess.getStepAccess().getValidKeyword_5_0());
            			
            // InternalGame.g:744:4: ( (lv_valid_6_0= RULE_STRING ) )
            // InternalGame.g:745:5: (lv_valid_6_0= RULE_STRING )
            {
            // InternalGame.g:745:5: (lv_valid_6_0= RULE_STRING )
            // InternalGame.g:746:6: lv_valid_6_0= RULE_STRING
            {
            lv_valid_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            						newLeafNode(lv_valid_6_0, grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_5_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStepRule());
            						}
            						setWithLastConsumed(
            							current,
            							"valid",
            							lv_valid_6_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getStepAccess().getThenKeyword_6());
            		
            // InternalGame.g:767:3: ( (otherlv_8= RULE_ID ) )
            // InternalGame.g:768:4: (otherlv_8= RULE_ID )
            {
            // InternalGame.g:768:4: (otherlv_8= RULE_ID )
            // InternalGame.g:769:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_8, grammarAccess.getStepAccess().getSceneSceneCrossReference_7_0());
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleAction"
    // InternalGame.g:788:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'jump over' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'walk through' ) | (enumLiteral_3= 'attack' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGame.g:794:2: ( ( (enumLiteral_0= 'jump over' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'walk through' ) | (enumLiteral_3= 'attack' ) ) )
            // InternalGame.g:795:2: ( (enumLiteral_0= 'jump over' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'walk through' ) | (enumLiteral_3= 'attack' ) )
            {
            // InternalGame.g:795:2: ( (enumLiteral_0= 'jump over' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'walk through' ) | (enumLiteral_3= 'attack' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGame.g:796:3: (enumLiteral_0= 'jump over' )
                    {
                    // InternalGame.g:796:3: (enumLiteral_0= 'jump over' )
                    // InternalGame.g:797:4: enumLiteral_0= 'jump over'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getJUMPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getJUMPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:804:3: (enumLiteral_1= 'pick up' )
                    {
                    // InternalGame.g:804:3: (enumLiteral_1= 'pick up' )
                    // InternalGame.g:805:4: enumLiteral_1= 'pick up'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:812:3: (enumLiteral_2= 'walk through' )
                    {
                    // InternalGame.g:812:3: (enumLiteral_2= 'walk through' )
                    // InternalGame.g:813:4: enumLiteral_2= 'walk through'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getWALKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getWALKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:820:3: (enumLiteral_3= 'attack' )
                    {
                    // InternalGame.g:820:3: (enumLiteral_3= 'attack' )
                    // InternalGame.g:821:4: enumLiteral_3= 'attack'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getATTACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionAccess().getATTACKEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000500802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});

}