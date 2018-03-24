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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'end'", "'scene'", "'objects'", "'('", "','", "')'", "'description'", "'actions'", "'object'", "'if'", "'valid'", "'default'", "'then'", "'look at'", "'pick up'", "'goto'", "'use'", "'with'", "'into'"
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
    // InternalGame.g:72:1: ruleAdventure returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleAdventure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_ingredients_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalGame.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalGame.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?) ) )
            // InternalGame.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?) )
            {
            // InternalGame.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?) )
            // InternalGame.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup());
            			
            // InternalGame.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?)
            // InternalGame.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+ {...}?
            {
            // InternalGame.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( ( LA2_0 == 13 || LA2_0 == 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalGame.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) ) )
            	    // InternalGame.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalGame.g:87:103: ( ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) ) )
            	    // InternalGame.g:88:5: ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalGame.g:91:8: ({...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) ) )
            	    // InternalGame.g:91:9: {...}? => (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    }
            	    // InternalGame.g:91:18: (otherlv_1= 'start' ( (otherlv_2= RULE_ID ) ) )
            	    // InternalGame.g:91:19: otherlv_1= 'start' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getAdventureAccess().getStartKeyword_0_0());
            	    							
            	    // InternalGame.g:95:8: ( (otherlv_2= RULE_ID ) )
            	    // InternalGame.g:96:9: (otherlv_2= RULE_ID )
            	    {
            	    // InternalGame.g:96:9: (otherlv_2= RULE_ID )
            	    // InternalGame.g:97:10: otherlv_2= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAdventureRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(otherlv_2, grammarAccess.getAdventureAccess().getStartSceneSceneCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGame.g:114:3: ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalGame.g:114:3: ({...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalGame.g:115:4: {...}? => ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalGame.g:115:103: ( ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalGame.g:116:5: ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalGame.g:119:8: ({...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalGame.g:119:9: {...}? => (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    }
            	    // InternalGame.g:119:18: (otherlv_3= 'end' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalGame.g:119:19: otherlv_3= 'end' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getAdventureAccess().getEndKeyword_1_0());
            	    							
            	    // InternalGame.g:123:8: ( (otherlv_4= RULE_ID ) )
            	    // InternalGame.g:124:9: (otherlv_4= RULE_ID )
            	    {
            	    // InternalGame.g:124:9: (otherlv_4= RULE_ID )
            	    // InternalGame.g:125:10: otherlv_4= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAdventureRule());
            	    										}
            	    									
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(otherlv_4, grammarAccess.getAdventureAccess().getEndSceneSceneCrossReference_1_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGame.g:142:3: ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) )
            	    {
            	    // InternalGame.g:142:3: ({...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ ) )
            	    // InternalGame.g:143:4: {...}? => ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalGame.g:143:103: ( ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+ )
            	    // InternalGame.g:144:5: ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalGame.g:147:8: ({...}? => ( (lv_ingredients_5_0= ruleIngredient ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==13) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }
            	        else if ( (LA1_0==20) ) {
            	            int LA1_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalGame.g:147:9: {...}? => ( (lv_ingredients_5_0= ruleIngredient ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    	    }
            	    	    // InternalGame.g:147:18: ( (lv_ingredients_5_0= ruleIngredient ) )
            	    	    // InternalGame.g:147:19: (lv_ingredients_5_0= ruleIngredient )
            	    	    {
            	    	    // InternalGame.g:147:19: (lv_ingredients_5_0= ruleIngredient )
            	    	    // InternalGame.g:148:9: lv_ingredients_5_0= ruleIngredient
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getAdventureAccess().getIngredientsIngredientParserRuleCall_2_0());
            	    	    								
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_ingredients_5_0=ruleIngredient();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getAdventureRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"ingredients",
            	    	    										lv_ingredients_5_0,
            	    	    										"uibk.dsl.assignment3.Game.Ingredient");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleAdventure"


    // $ANTLR start "entryRuleIngredient"
    // InternalGame.g:181:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalGame.g:181:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalGame.g:182:2: iv_ruleIngredient= ruleIngredient EOF
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
    // InternalGame.g:188:1: ruleIngredient returns [EObject current=null] : (this_Scene_0= ruleScene | this_Object_1= ruleObject ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        EObject this_Scene_0 = null;

        EObject this_Object_1 = null;



        	enterRule();

        try {
            // InternalGame.g:194:2: ( (this_Scene_0= ruleScene | this_Object_1= ruleObject ) )
            // InternalGame.g:195:2: (this_Scene_0= ruleScene | this_Object_1= ruleObject )
            {
            // InternalGame.g:195:2: (this_Scene_0= ruleScene | this_Object_1= ruleObject )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:196:3: this_Scene_0= ruleScene
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
                    // InternalGame.g:205:3: this_Object_1= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getIngredientAccess().getObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_1=ruleObject();

                    state._fsp--;


                    			current = this_Object_1;
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
    // InternalGame.g:217:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalGame.g:217:46: (iv_ruleScene= ruleScene EOF )
            // InternalGame.g:218:2: iv_ruleScene= ruleScene EOF
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
    // InternalGame.g:224:1: ruleScene returns [EObject current=null] : (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')' )? otherlv_16= 'end' ) ;
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
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_actions_12_0 = null;

        EObject lv_actions_14_0 = null;



        	enterRule();

        try {
            // InternalGame.g:230:2: ( (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')' )? otherlv_16= 'end' ) )
            // InternalGame.g:231:2: (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')' )? otherlv_16= 'end' )
            {
            // InternalGame.g:231:2: (otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')' )? otherlv_16= 'end' )
            // InternalGame.g:232:3: otherlv_0= 'scene' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')' )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneAccess().getSceneKeyword_0());
            		
            // InternalGame.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:238:5: lv_name_1_0= RULE_ID
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

            // InternalGame.g:254:3: (otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:255:4: otherlv_2= 'objects' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSceneAccess().getObjectsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSceneAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalGame.g:263:4: ( (otherlv_4= RULE_ID ) )
                    // InternalGame.g:264:5: (otherlv_4= RULE_ID )
                    {
                    // InternalGame.g:264:5: (otherlv_4= RULE_ID )
                    // InternalGame.g:265:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSceneRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_2_0());
                    					

                    }


                    }

                    // InternalGame.g:276:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGame.g:277:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGame.g:281:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalGame.g:282:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalGame.g:282:6: (otherlv_6= RULE_ID )
                    	    // InternalGame.g:283:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSceneRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getSceneAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getDescriptionKeyword_3());
            		
            // InternalGame.g:304:3: ( (lv_description_9_0= RULE_STRING ) )
            // InternalGame.g:305:4: (lv_description_9_0= RULE_STRING )
            {
            // InternalGame.g:305:4: (lv_description_9_0= RULE_STRING )
            // InternalGame.g:306:5: lv_description_9_0= RULE_STRING
            {
            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_9_0, grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:322:3: (otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:323:4: otherlv_10= 'actions' otherlv_11= '(' ( (lv_actions_12_0= ruleStep ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getSceneAccess().getActionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getSceneAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGame.g:331:4: ( (lv_actions_12_0= ruleStep ) )
                    // InternalGame.g:332:5: (lv_actions_12_0= ruleStep )
                    {
                    // InternalGame.g:332:5: (lv_actions_12_0= ruleStep )
                    // InternalGame.g:333:6: lv_actions_12_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actions_12_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSceneRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_12_0,
                    							"uibk.dsl.assignment3.Game.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:350:4: (otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGame.g:351:5: otherlv_13= ',' ( (lv_actions_14_0= ruleStep ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSceneAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGame.g:355:5: ( (lv_actions_14_0= ruleStep ) )
                    	    // InternalGame.g:356:6: (lv_actions_14_0= ruleStep )
                    	    {
                    	    // InternalGame.g:356:6: (lv_actions_14_0= ruleStep )
                    	    // InternalGame.g:357:7: lv_actions_14_0= ruleStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actions_14_0=ruleStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSceneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_14_0,
                    	    								"uibk.dsl.assignment3.Game.Step");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getSceneAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSceneAccess().getEndKeyword_6());
            		

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


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:388:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalGame.g:388:47: (iv_ruleObject= ruleObject EOF )
            // InternalGame.g:389:2: iv_ruleObject= ruleObject EOF
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
    // InternalGame.g:395:1: ruleObject returns [EObject current=null] : (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'end' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGame.g:401:2: ( (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'end' ) )
            // InternalGame.g:402:2: (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'end' )
            {
            // InternalGame.g:402:2: (otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'end' )
            // InternalGame.g:403:3: otherlv_0= 'object' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
            		
            // InternalGame.g:407:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )
            // InternalGame.g:408:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            {
            // InternalGame.g:408:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            // InternalGame.g:409:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            {
            // InternalGame.g:409:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:410:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
                    // InternalGame.g:425:6: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getDescriptionKeyword_2());
            		
            // InternalGame.g:446:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalGame.g:447:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalGame.g:447:4: (lv_description_3_0= RULE_STRING )
            // InternalGame.g:448:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_description_3_0, grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getEndKeyword_4());
            		

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
    // InternalGame.g:472:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalGame.g:472:45: (iv_ruleStep= ruleStep EOF )
            // InternalGame.g:473:2: iv_ruleStep= ruleStep EOF
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
    // InternalGame.g:479:1: ruleStep returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'if' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= 'then' ( (otherlv_11= RULE_ID ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_valid_7_0=null;
        Token otherlv_8=null;
        Token lv_default_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_action_0_0 = null;

        Enumerator lv_preposition_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:485:2: ( ( ( (lv_action_0_0= ruleAction ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'if' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= 'then' ( (otherlv_11= RULE_ID ) ) ) )
            // InternalGame.g:486:2: ( ( (lv_action_0_0= ruleAction ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'if' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= 'then' ( (otherlv_11= RULE_ID ) ) )
            {
            // InternalGame.g:486:2: ( ( (lv_action_0_0= ruleAction ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'if' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= 'then' ( (otherlv_11= RULE_ID ) ) )
            // InternalGame.g:487:3: ( (lv_action_0_0= ruleAction ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'if' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= 'then' ( (otherlv_11= RULE_ID ) )
            {
            // InternalGame.g:487:3: ( (lv_action_0_0= ruleAction ) )
            // InternalGame.g:488:4: (lv_action_0_0= ruleAction )
            {
            // InternalGame.g:488:4: (lv_action_0_0= ruleAction )
            // InternalGame.g:489:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStepAccess().getActionActionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_action_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"uibk.dsl.assignment3.Game.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:506:3: ( (otherlv_1= RULE_ID ) )
            // InternalGame.g:507:4: (otherlv_1= RULE_ID )
            {
            // InternalGame.g:507:4: (otherlv_1= RULE_ID )
            // InternalGame.g:508:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_1_0());
            				

            }


            }

            // InternalGame.g:519:3: ( ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=29 && LA9_0<=30)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:520:4: ( (lv_preposition_2_0= rulePreposition ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalGame.g:520:4: ( (lv_preposition_2_0= rulePreposition ) )
                    // InternalGame.g:521:5: (lv_preposition_2_0= rulePreposition )
                    {
                    // InternalGame.g:521:5: (lv_preposition_2_0= rulePreposition )
                    // InternalGame.g:522:6: lv_preposition_2_0= rulePreposition
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getPrepositionPrepositionEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_preposition_2_0=rulePreposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"preposition",
                    							lv_preposition_2_0,
                    							"uibk.dsl.assignment3.Game.Preposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:539:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGame.g:540:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGame.g:540:5: (otherlv_3= RULE_ID )
                    // InternalGame.g:541:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_3, grammarAccess.getStepAccess().getOtherObjectObjectCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getIfKeyword_3());
            		
            // InternalGame.g:557:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalGame.g:558:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalGame.g:558:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalGame.g:559:5: ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_4());
            				
            // InternalGame.g:562:5: ( ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalGame.g:563:6: ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalGame.g:563:6: ( ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:564:4: ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalGame.g:564:4: ({...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalGame.g:565:5: {...}? => ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalGame.g:565:101: ( ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) ) )
            	    // InternalGame.g:566:6: ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalGame.g:569:9: ({...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) ) )
            	    // InternalGame.g:569:10: {...}? => (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalGame.g:569:19: (otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) ) )
            	    // InternalGame.g:569:20: otherlv_6= 'valid' ( (lv_valid_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getStepAccess().getValidKeyword_4_0_0());
            	    								
            	    // InternalGame.g:573:9: ( (lv_valid_7_0= RULE_STRING ) )
            	    // InternalGame.g:574:10: (lv_valid_7_0= RULE_STRING )
            	    {
            	    // InternalGame.g:574:10: (lv_valid_7_0= RULE_STRING )
            	    // InternalGame.g:575:11: lv_valid_7_0= RULE_STRING
            	    {
            	    lv_valid_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_valid_7_0, grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_4_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getStepRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"valid",
            	    												lv_valid_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGame.g:597:4: ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalGame.g:597:4: ({...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalGame.g:598:5: {...}? => ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalGame.g:598:101: ( ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) ) )
            	    // InternalGame.g:599:6: ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalGame.g:602:9: ({...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) ) )
            	    // InternalGame.g:602:10: {...}? => (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalGame.g:602:19: (otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) ) )
            	    // InternalGame.g:602:20: otherlv_8= 'default' ( (lv_default_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getDefaultKeyword_4_1_0());
            	    								
            	    // InternalGame.g:606:9: ( (lv_default_9_0= RULE_STRING ) )
            	    // InternalGame.g:607:10: (lv_default_9_0= RULE_STRING )
            	    {
            	    // InternalGame.g:607:10: (lv_default_9_0= RULE_STRING )
            	    // InternalGame.g:608:11: lv_default_9_0= RULE_STRING
            	    {
            	    lv_default_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_default_9_0, grammarAccess.getStepAccess().getDefaultSTRINGTerminalRuleCall_4_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getStepRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"default",
            	    												lv_default_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStepAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canLeave(grammarAccess.getStepAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_4());
            				

            }

            otherlv_10=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getStepAccess().getThenKeyword_5());
            		
            // InternalGame.g:642:3: ( (otherlv_11= RULE_ID ) )
            // InternalGame.g:643:4: (otherlv_11= RULE_ID )
            {
            // InternalGame.g:643:4: (otherlv_11= RULE_ID )
            // InternalGame.g:644:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_11, grammarAccess.getStepAccess().getSceneSceneCrossReference_6_0());
            				

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleAction"
    // InternalGame.g:659:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'look at' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'goto' ) | (enumLiteral_3= 'use' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGame.g:665:2: ( ( (enumLiteral_0= 'look at' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'goto' ) | (enumLiteral_3= 'use' ) ) )
            // InternalGame.g:666:2: ( (enumLiteral_0= 'look at' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'goto' ) | (enumLiteral_3= 'use' ) )
            {
            // InternalGame.g:666:2: ( (enumLiteral_0= 'look at' ) | (enumLiteral_1= 'pick up' ) | (enumLiteral_2= 'goto' ) | (enumLiteral_3= 'use' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGame.g:667:3: (enumLiteral_0= 'look at' )
                    {
                    // InternalGame.g:667:3: (enumLiteral_0= 'look at' )
                    // InternalGame.g:668:4: enumLiteral_0= 'look at'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getLOOKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getLOOKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:675:3: (enumLiteral_1= 'pick up' )
                    {
                    // InternalGame.g:675:3: (enumLiteral_1= 'pick up' )
                    // InternalGame.g:676:4: enumLiteral_1= 'pick up'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:683:3: (enumLiteral_2= 'goto' )
                    {
                    // InternalGame.g:683:3: (enumLiteral_2= 'goto' )
                    // InternalGame.g:684:4: enumLiteral_2= 'goto'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getGOTOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getGOTOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:691:3: (enumLiteral_3= 'use' )
                    {
                    // InternalGame.g:691:3: (enumLiteral_3= 'use' )
                    // InternalGame.g:692:4: enumLiteral_3= 'use'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_3());
                    			

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


    // $ANTLR start "rulePreposition"
    // InternalGame.g:702:1: rulePreposition returns [Enumerator current=null] : ( (enumLiteral_0= 'with' ) | (enumLiteral_1= 'into' ) ) ;
    public final Enumerator rulePreposition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGame.g:708:2: ( ( (enumLiteral_0= 'with' ) | (enumLiteral_1= 'into' ) ) )
            // InternalGame.g:709:2: ( (enumLiteral_0= 'with' ) | (enumLiteral_1= 'into' ) )
            {
            // InternalGame.g:709:2: ( (enumLiteral_0= 'with' ) | (enumLiteral_1= 'into' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:710:3: (enumLiteral_0= 'with' )
                    {
                    // InternalGame.g:710:3: (enumLiteral_0= 'with' )
                    // InternalGame.g:711:4: enumLiteral_0= 'with'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPrepositionAccess().getWITHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrepositionAccess().getWITHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:718:3: (enumLiteral_1= 'into' )
                    {
                    // InternalGame.g:718:3: (enumLiteral_1= 'into' )
                    // InternalGame.g:719:4: enumLiteral_1= 'into'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPrepositionAccess().getINTOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrepositionAccess().getINTOEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePreposition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000103802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00000L});

}
