package uibk.dsl.assignment3.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uibk.dsl.assignment3.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jump over'", "'pick up'", "'walk through'", "'attack'", "'start'", "'end'", "'scene'", "'{'", "'description'", "'}'", "'objects'", "'('", "')'", "','", "'actions'", "'character'", "'healthPoints'", "'object'", "'is'", "'a'", "'step'", "'if'", "'then'", "'valid'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAdventure"
    // InternalGame.g:53:1: entryRuleAdventure : ruleAdventure EOF ;
    public final void entryRuleAdventure() throws RecognitionException {
        try {
            // InternalGame.g:54:1: ( ruleAdventure EOF )
            // InternalGame.g:55:1: ruleAdventure EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdventure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdventure"


    // $ANTLR start "ruleAdventure"
    // InternalGame.g:62:1: ruleAdventure : ( ( rule__Adventure__UnorderedGroup ) ) ;
    public final void ruleAdventure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:66:2: ( ( ( rule__Adventure__UnorderedGroup ) ) )
            // InternalGame.g:67:2: ( ( rule__Adventure__UnorderedGroup ) )
            {
            // InternalGame.g:67:2: ( ( rule__Adventure__UnorderedGroup ) )
            // InternalGame.g:68:3: ( rule__Adventure__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getUnorderedGroup()); 
            }
            // InternalGame.g:69:3: ( rule__Adventure__UnorderedGroup )
            // InternalGame.g:69:4: rule__Adventure__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getUnorderedGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdventure"


    // $ANTLR start "entryRuleIngredient"
    // InternalGame.g:78:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( ruleIngredient EOF )
            // InternalGame.g:80:1: ruleIngredient EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIngredientRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIngredientRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalGame.g:87:1: ruleIngredient : ( ( rule__Ingredient__Alternatives ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ( rule__Ingredient__Alternatives ) ) )
            // InternalGame.g:92:2: ( ( rule__Ingredient__Alternatives ) )
            {
            // InternalGame.g:92:2: ( ( rule__Ingredient__Alternatives ) )
            // InternalGame.g:93:3: ( rule__Ingredient__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIngredientAccess().getAlternatives()); 
            }
            // InternalGame.g:94:3: ( rule__Ingredient__Alternatives )
            // InternalGame.g:94:4: rule__Ingredient__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIngredientAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:103:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleScene EOF )
            // InternalGame.g:105:1: ruleScene EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScene();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalGame.g:112:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__Scene__Group__0 ) )
            // InternalGame.g:118:3: ( rule__Scene__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup()); 
            }
            // InternalGame.g:119:3: ( rule__Scene__Group__0 )
            // InternalGame.g:119:4: rule__Scene__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleCharacter"
    // InternalGame.g:128:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleCharacter EOF )
            // InternalGame.g:130:1: ruleCharacter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharacter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalGame.g:137:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__Character__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__Character__Group__0 ) )
            // InternalGame.g:143:3: ( rule__Character__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getGroup()); 
            }
            // InternalGame.g:144:3: ( rule__Character__Group__0 )
            // InternalGame.g:144:4: rule__Character__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:153:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleObject EOF )
            // InternalGame.g:155:1: ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalGame.g:162:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Object__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Object__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup()); 
            }
            // InternalGame.g:169:3: ( rule__Object__Group__0 )
            // InternalGame.g:169:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleStep"
    // InternalGame.g:178:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( ruleStep EOF )
            // InternalGame.g:180:1: ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalGame.g:187:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Step__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Step__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getGroup()); 
            }
            // InternalGame.g:194:3: ( rule__Step__Group__0 )
            // InternalGame.g:194:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleAction"
    // InternalGame.g:203:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:207:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGame.g:208:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGame.g:208:2: ( ( rule__Action__Alternatives ) )
            // InternalGame.g:209:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalGame.g:210:3: ( rule__Action__Alternatives )
            // InternalGame.g:210:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__Ingredient__Alternatives"
    // InternalGame.g:218:1: rule__Ingredient__Alternatives : ( ( ruleScene ) | ( ruleObject ) | ( ruleCharacter ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:222:1: ( ( ruleScene ) | ( ruleObject ) | ( ruleCharacter ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGame.g:223:2: ( ruleScene )
                    {
                    // InternalGame.g:223:2: ( ruleScene )
                    // InternalGame.g:224:3: ruleScene
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIngredientAccess().getSceneParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleScene();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIngredientAccess().getSceneParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:229:2: ( ruleObject )
                    {
                    // InternalGame.g:229:2: ( ruleObject )
                    // InternalGame.g:230:3: ruleObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIngredientAccess().getObjectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIngredientAccess().getObjectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:235:2: ( ruleCharacter )
                    {
                    // InternalGame.g:235:2: ( ruleCharacter )
                    // InternalGame.g:236:3: ruleCharacter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIngredientAccess().getCharacterParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIngredientAccess().getCharacterParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Alternatives"


    // $ANTLR start "rule__Character__NameAlternatives_1_0"
    // InternalGame.g:245:1: rule__Character__NameAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Character__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:249:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:250:2: ( RULE_STRING )
                    {
                    // InternalGame.g:250:2: ( RULE_STRING )
                    // InternalGame.g:251:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCharacterAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCharacterAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:256:2: ( RULE_ID )
                    {
                    // InternalGame.g:256:2: ( RULE_ID )
                    // InternalGame.g:257:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__NameAlternatives_1_0"


    // $ANTLR start "rule__Object__NameAlternatives_1_0"
    // InternalGame.g:266:1: rule__Object__NameAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Object__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:270:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:271:2: ( RULE_STRING )
                    {
                    // InternalGame.g:271:2: ( RULE_STRING )
                    // InternalGame.g:272:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:277:2: ( RULE_ID )
                    {
                    // InternalGame.g:277:2: ( RULE_ID )
                    // InternalGame.g:278:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAlternatives_1_0"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalGame.g:287:1: rule__Action__Alternatives : ( ( ( 'jump over' ) ) | ( ( 'pick up' ) ) | ( ( 'walk through' ) ) | ( ( 'attack' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:1: ( ( ( 'jump over' ) ) | ( ( 'pick up' ) ) | ( ( 'walk through' ) ) | ( ( 'attack' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGame.g:292:2: ( ( 'jump over' ) )
                    {
                    // InternalGame.g:292:2: ( ( 'jump over' ) )
                    // InternalGame.g:293:3: ( 'jump over' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getJUMPEnumLiteralDeclaration_0()); 
                    }
                    // InternalGame.g:294:3: ( 'jump over' )
                    // InternalGame.g:294:4: 'jump over'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getJUMPEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:298:2: ( ( 'pick up' ) )
                    {
                    // InternalGame.g:298:2: ( ( 'pick up' ) )
                    // InternalGame.g:299:3: ( 'pick up' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1()); 
                    }
                    // InternalGame.g:300:3: ( 'pick up' )
                    // InternalGame.g:300:4: 'pick up'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:304:2: ( ( 'walk through' ) )
                    {
                    // InternalGame.g:304:2: ( ( 'walk through' ) )
                    // InternalGame.g:305:3: ( 'walk through' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getWALKEnumLiteralDeclaration_2()); 
                    }
                    // InternalGame.g:306:3: ( 'walk through' )
                    // InternalGame.g:306:4: 'walk through'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getWALKEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:310:2: ( ( 'attack' ) )
                    {
                    // InternalGame.g:310:2: ( ( 'attack' ) )
                    // InternalGame.g:311:3: ( 'attack' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getATTACKEnumLiteralDeclaration_3()); 
                    }
                    // InternalGame.g:312:3: ( 'attack' )
                    // InternalGame.g:312:4: 'attack'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getATTACKEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Adventure__Group_0__0"
    // InternalGame.g:320:1: rule__Adventure__Group_0__0 : rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1 ;
    public final void rule__Adventure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:324:1: ( rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1 )
            // InternalGame.g:325:2: rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Adventure__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adventure__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_0__0"


    // $ANTLR start "rule__Adventure__Group_0__0__Impl"
    // InternalGame.g:332:1: rule__Adventure__Group_0__0__Impl : ( 'start' ) ;
    public final void rule__Adventure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:336:1: ( ( 'start' ) )
            // InternalGame.g:337:1: ( 'start' )
            {
            // InternalGame.g:337:1: ( 'start' )
            // InternalGame.g:338:2: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartKeyword_0_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getStartKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_0__0__Impl"


    // $ANTLR start "rule__Adventure__Group_0__1"
    // InternalGame.g:347:1: rule__Adventure__Group_0__1 : rule__Adventure__Group_0__1__Impl ;
    public final void rule__Adventure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:351:1: ( rule__Adventure__Group_0__1__Impl )
            // InternalGame.g:352:2: rule__Adventure__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_0__1"


    // $ANTLR start "rule__Adventure__Group_0__1__Impl"
    // InternalGame.g:358:1: rule__Adventure__Group_0__1__Impl : ( ( rule__Adventure__StartSceneAssignment_0_1 ) ) ;
    public final void rule__Adventure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:362:1: ( ( ( rule__Adventure__StartSceneAssignment_0_1 ) ) )
            // InternalGame.g:363:1: ( ( rule__Adventure__StartSceneAssignment_0_1 ) )
            {
            // InternalGame.g:363:1: ( ( rule__Adventure__StartSceneAssignment_0_1 ) )
            // InternalGame.g:364:2: ( rule__Adventure__StartSceneAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneAssignment_0_1()); 
            }
            // InternalGame.g:365:2: ( rule__Adventure__StartSceneAssignment_0_1 )
            // InternalGame.g:365:3: rule__Adventure__StartSceneAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__StartSceneAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getStartSceneAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_0__1__Impl"


    // $ANTLR start "rule__Adventure__Group_1__0"
    // InternalGame.g:374:1: rule__Adventure__Group_1__0 : rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1 ;
    public final void rule__Adventure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:378:1: ( rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1 )
            // InternalGame.g:379:2: rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Adventure__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adventure__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_1__0"


    // $ANTLR start "rule__Adventure__Group_1__0__Impl"
    // InternalGame.g:386:1: rule__Adventure__Group_1__0__Impl : ( 'end' ) ;
    public final void rule__Adventure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:390:1: ( ( 'end' ) )
            // InternalGame.g:391:1: ( 'end' )
            {
            // InternalGame.g:391:1: ( 'end' )
            // InternalGame.g:392:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndKeyword_1_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getEndKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_1__0__Impl"


    // $ANTLR start "rule__Adventure__Group_1__1"
    // InternalGame.g:401:1: rule__Adventure__Group_1__1 : rule__Adventure__Group_1__1__Impl ;
    public final void rule__Adventure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:405:1: ( rule__Adventure__Group_1__1__Impl )
            // InternalGame.g:406:2: rule__Adventure__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_1__1"


    // $ANTLR start "rule__Adventure__Group_1__1__Impl"
    // InternalGame.g:412:1: rule__Adventure__Group_1__1__Impl : ( ( rule__Adventure__EndSceneAssignment_1_1 ) ) ;
    public final void rule__Adventure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:416:1: ( ( ( rule__Adventure__EndSceneAssignment_1_1 ) ) )
            // InternalGame.g:417:1: ( ( rule__Adventure__EndSceneAssignment_1_1 ) )
            {
            // InternalGame.g:417:1: ( ( rule__Adventure__EndSceneAssignment_1_1 ) )
            // InternalGame.g:418:2: ( rule__Adventure__EndSceneAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneAssignment_1_1()); 
            }
            // InternalGame.g:419:2: ( rule__Adventure__EndSceneAssignment_1_1 )
            // InternalGame.g:419:3: rule__Adventure__EndSceneAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__EndSceneAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getEndSceneAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group_1__1__Impl"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalGame.g:428:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:432:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:433:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0"


    // $ANTLR start "rule__Scene__Group__0__Impl"
    // InternalGame.g:440:1: rule__Scene__Group__0__Impl : ( 'scene' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:444:1: ( ( 'scene' ) )
            // InternalGame.g:445:1: ( 'scene' )
            {
            // InternalGame.g:445:1: ( 'scene' )
            // InternalGame.g:446:2: 'scene'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getSceneKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getSceneKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0__Impl"


    // $ANTLR start "rule__Scene__Group__1"
    // InternalGame.g:455:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:459:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:460:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Scene__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1"


    // $ANTLR start "rule__Scene__Group__1__Impl"
    // InternalGame.g:467:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:471:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:472:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:472:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:473:2: ( rule__Scene__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:474:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:474:3: rule__Scene__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scene__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1__Impl"


    // $ANTLR start "rule__Scene__Group__2"
    // InternalGame.g:482:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:486:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:487:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Scene__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2"


    // $ANTLR start "rule__Scene__Group__2__Impl"
    // InternalGame.g:494:1: rule__Scene__Group__2__Impl : ( '{' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:498:1: ( ( '{' ) )
            // InternalGame.g:499:1: ( '{' )
            {
            // InternalGame.g:499:1: ( '{' )
            // InternalGame.g:500:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2__Impl"


    // $ANTLR start "rule__Scene__Group__3"
    // InternalGame.g:509:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:513:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:514:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Scene__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3"


    // $ANTLR start "rule__Scene__Group__3__Impl"
    // InternalGame.g:521:1: rule__Scene__Group__3__Impl : ( ( rule__Scene__Group_3__0 )? ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:525:1: ( ( ( rule__Scene__Group_3__0 )? ) )
            // InternalGame.g:526:1: ( ( rule__Scene__Group_3__0 )? )
            {
            // InternalGame.g:526:1: ( ( rule__Scene__Group_3__0 )? )
            // InternalGame.g:527:2: ( rule__Scene__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_3()); 
            }
            // InternalGame.g:528:2: ( rule__Scene__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:528:3: rule__Scene__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scene__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3__Impl"


    // $ANTLR start "rule__Scene__Group__4"
    // InternalGame.g:536:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:540:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:541:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Scene__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4"


    // $ANTLR start "rule__Scene__Group__4__Impl"
    // InternalGame.g:548:1: rule__Scene__Group__4__Impl : ( 'description' ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:552:1: ( ( 'description' ) )
            // InternalGame.g:553:1: ( 'description' )
            {
            // InternalGame.g:553:1: ( 'description' )
            // InternalGame.g:554:2: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getDescriptionKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4__Impl"


    // $ANTLR start "rule__Scene__Group__5"
    // InternalGame.g:563:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:567:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:568:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Scene__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5"


    // $ANTLR start "rule__Scene__Group__5__Impl"
    // InternalGame.g:575:1: rule__Scene__Group__5__Impl : ( ( rule__Scene__DescriptionAssignment_5 ) ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:579:1: ( ( ( rule__Scene__DescriptionAssignment_5 ) ) )
            // InternalGame.g:580:1: ( ( rule__Scene__DescriptionAssignment_5 ) )
            {
            // InternalGame.g:580:1: ( ( rule__Scene__DescriptionAssignment_5 ) )
            // InternalGame.g:581:2: ( rule__Scene__DescriptionAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionAssignment_5()); 
            }
            // InternalGame.g:582:2: ( rule__Scene__DescriptionAssignment_5 )
            // InternalGame.g:582:3: rule__Scene__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Scene__DescriptionAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getDescriptionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5__Impl"


    // $ANTLR start "rule__Scene__Group__6"
    // InternalGame.g:590:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:594:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:595:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Scene__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__6"


    // $ANTLR start "rule__Scene__Group__6__Impl"
    // InternalGame.g:602:1: rule__Scene__Group__6__Impl : ( ( rule__Scene__Group_6__0 )? ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:606:1: ( ( ( rule__Scene__Group_6__0 )? ) )
            // InternalGame.g:607:1: ( ( rule__Scene__Group_6__0 )? )
            {
            // InternalGame.g:607:1: ( ( rule__Scene__Group_6__0 )? )
            // InternalGame.g:608:2: ( rule__Scene__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_6()); 
            }
            // InternalGame.g:609:2: ( rule__Scene__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:609:3: rule__Scene__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scene__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__6__Impl"


    // $ANTLR start "rule__Scene__Group__7"
    // InternalGame.g:617:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:621:1: ( rule__Scene__Group__7__Impl )
            // InternalGame.g:622:2: rule__Scene__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__7"


    // $ANTLR start "rule__Scene__Group__7__Impl"
    // InternalGame.g:628:1: rule__Scene__Group__7__Impl : ( '}' ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:632:1: ( ( '}' ) )
            // InternalGame.g:633:1: ( '}' )
            {
            // InternalGame.g:633:1: ( '}' )
            // InternalGame.g:634:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__7__Impl"


    // $ANTLR start "rule__Scene__Group_3__0"
    // InternalGame.g:644:1: rule__Scene__Group_3__0 : rule__Scene__Group_3__0__Impl rule__Scene__Group_3__1 ;
    public final void rule__Scene__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:648:1: ( rule__Scene__Group_3__0__Impl rule__Scene__Group_3__1 )
            // InternalGame.g:649:2: rule__Scene__Group_3__0__Impl rule__Scene__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__0"


    // $ANTLR start "rule__Scene__Group_3__0__Impl"
    // InternalGame.g:656:1: rule__Scene__Group_3__0__Impl : ( 'objects' ) ;
    public final void rule__Scene__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:660:1: ( ( 'objects' ) )
            // InternalGame.g:661:1: ( 'objects' )
            {
            // InternalGame.g:661:1: ( 'objects' )
            // InternalGame.g:662:2: 'objects'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsKeyword_3_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__0__Impl"


    // $ANTLR start "rule__Scene__Group_3__1"
    // InternalGame.g:671:1: rule__Scene__Group_3__1 : rule__Scene__Group_3__1__Impl rule__Scene__Group_3__2 ;
    public final void rule__Scene__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:675:1: ( rule__Scene__Group_3__1__Impl rule__Scene__Group_3__2 )
            // InternalGame.g:676:2: rule__Scene__Group_3__1__Impl rule__Scene__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__1"


    // $ANTLR start "rule__Scene__Group_3__1__Impl"
    // InternalGame.g:683:1: rule__Scene__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Scene__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:687:1: ( ( '(' ) )
            // InternalGame.g:688:1: ( '(' )
            {
            // InternalGame.g:688:1: ( '(' )
            // InternalGame.g:689:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_3_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__1__Impl"


    // $ANTLR start "rule__Scene__Group_3__2"
    // InternalGame.g:698:1: rule__Scene__Group_3__2 : rule__Scene__Group_3__2__Impl rule__Scene__Group_3__3 ;
    public final void rule__Scene__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:702:1: ( rule__Scene__Group_3__2__Impl rule__Scene__Group_3__3 )
            // InternalGame.g:703:2: rule__Scene__Group_3__2__Impl rule__Scene__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__2"


    // $ANTLR start "rule__Scene__Group_3__2__Impl"
    // InternalGame.g:710:1: rule__Scene__Group_3__2__Impl : ( ( rule__Scene__ObjectsAssignment_3_2 ) ) ;
    public final void rule__Scene__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:714:1: ( ( ( rule__Scene__ObjectsAssignment_3_2 ) ) )
            // InternalGame.g:715:1: ( ( rule__Scene__ObjectsAssignment_3_2 ) )
            {
            // InternalGame.g:715:1: ( ( rule__Scene__ObjectsAssignment_3_2 ) )
            // InternalGame.g:716:2: ( rule__Scene__ObjectsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsAssignment_3_2()); 
            }
            // InternalGame.g:717:2: ( rule__Scene__ObjectsAssignment_3_2 )
            // InternalGame.g:717:3: rule__Scene__ObjectsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ObjectsAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__2__Impl"


    // $ANTLR start "rule__Scene__Group_3__3"
    // InternalGame.g:725:1: rule__Scene__Group_3__3 : rule__Scene__Group_3__3__Impl rule__Scene__Group_3__4 ;
    public final void rule__Scene__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:729:1: ( rule__Scene__Group_3__3__Impl rule__Scene__Group_3__4 )
            // InternalGame.g:730:2: rule__Scene__Group_3__3__Impl rule__Scene__Group_3__4
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__3"


    // $ANTLR start "rule__Scene__Group_3__3__Impl"
    // InternalGame.g:737:1: rule__Scene__Group_3__3__Impl : ( ( rule__Scene__Group_3_3__0 )* ) ;
    public final void rule__Scene__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:741:1: ( ( ( rule__Scene__Group_3_3__0 )* ) )
            // InternalGame.g:742:1: ( ( rule__Scene__Group_3_3__0 )* )
            {
            // InternalGame.g:742:1: ( ( rule__Scene__Group_3_3__0 )* )
            // InternalGame.g:743:2: ( rule__Scene__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_3_3()); 
            }
            // InternalGame.g:744:2: ( rule__Scene__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:744:3: rule__Scene__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scene__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__3__Impl"


    // $ANTLR start "rule__Scene__Group_3__4"
    // InternalGame.g:752:1: rule__Scene__Group_3__4 : rule__Scene__Group_3__4__Impl ;
    public final void rule__Scene__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:756:1: ( rule__Scene__Group_3__4__Impl )
            // InternalGame.g:757:2: rule__Scene__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__4"


    // $ANTLR start "rule__Scene__Group_3__4__Impl"
    // InternalGame.g:763:1: rule__Scene__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Scene__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:767:1: ( ( ')' ) )
            // InternalGame.g:768:1: ( ')' )
            {
            // InternalGame.g:768:1: ( ')' )
            // InternalGame.g:769:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getRightParenthesisKeyword_3_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getRightParenthesisKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3__4__Impl"


    // $ANTLR start "rule__Scene__Group_3_3__0"
    // InternalGame.g:779:1: rule__Scene__Group_3_3__0 : rule__Scene__Group_3_3__0__Impl rule__Scene__Group_3_3__1 ;
    public final void rule__Scene__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:783:1: ( rule__Scene__Group_3_3__0__Impl rule__Scene__Group_3_3__1 )
            // InternalGame.g:784:2: rule__Scene__Group_3_3__0__Impl rule__Scene__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3_3__0"


    // $ANTLR start "rule__Scene__Group_3_3__0__Impl"
    // InternalGame.g:791:1: rule__Scene__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Scene__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:795:1: ( ( ',' ) )
            // InternalGame.g:796:1: ( ',' )
            {
            // InternalGame.g:796:1: ( ',' )
            // InternalGame.g:797:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getCommaKeyword_3_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getCommaKeyword_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3_3__0__Impl"


    // $ANTLR start "rule__Scene__Group_3_3__1"
    // InternalGame.g:806:1: rule__Scene__Group_3_3__1 : rule__Scene__Group_3_3__1__Impl ;
    public final void rule__Scene__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:810:1: ( rule__Scene__Group_3_3__1__Impl )
            // InternalGame.g:811:2: rule__Scene__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3_3__1"


    // $ANTLR start "rule__Scene__Group_3_3__1__Impl"
    // InternalGame.g:817:1: rule__Scene__Group_3_3__1__Impl : ( ( rule__Scene__ObjectsAssignment_3_3_1 ) ) ;
    public final void rule__Scene__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:821:1: ( ( ( rule__Scene__ObjectsAssignment_3_3_1 ) ) )
            // InternalGame.g:822:1: ( ( rule__Scene__ObjectsAssignment_3_3_1 ) )
            {
            // InternalGame.g:822:1: ( ( rule__Scene__ObjectsAssignment_3_3_1 ) )
            // InternalGame.g:823:2: ( rule__Scene__ObjectsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsAssignment_3_3_1()); 
            }
            // InternalGame.g:824:2: ( rule__Scene__ObjectsAssignment_3_3_1 )
            // InternalGame.g:824:3: rule__Scene__ObjectsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ObjectsAssignment_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsAssignment_3_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_3_3__1__Impl"


    // $ANTLR start "rule__Scene__Group_6__0"
    // InternalGame.g:833:1: rule__Scene__Group_6__0 : rule__Scene__Group_6__0__Impl rule__Scene__Group_6__1 ;
    public final void rule__Scene__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:837:1: ( rule__Scene__Group_6__0__Impl rule__Scene__Group_6__1 )
            // InternalGame.g:838:2: rule__Scene__Group_6__0__Impl rule__Scene__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__0"


    // $ANTLR start "rule__Scene__Group_6__0__Impl"
    // InternalGame.g:845:1: rule__Scene__Group_6__0__Impl : ( 'actions' ) ;
    public final void rule__Scene__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:849:1: ( ( 'actions' ) )
            // InternalGame.g:850:1: ( 'actions' )
            {
            // InternalGame.g:850:1: ( 'actions' )
            // InternalGame.g:851:2: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsKeyword_6_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__0__Impl"


    // $ANTLR start "rule__Scene__Group_6__1"
    // InternalGame.g:860:1: rule__Scene__Group_6__1 : rule__Scene__Group_6__1__Impl rule__Scene__Group_6__2 ;
    public final void rule__Scene__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:864:1: ( rule__Scene__Group_6__1__Impl rule__Scene__Group_6__2 )
            // InternalGame.g:865:2: rule__Scene__Group_6__1__Impl rule__Scene__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__1"


    // $ANTLR start "rule__Scene__Group_6__1__Impl"
    // InternalGame.g:872:1: rule__Scene__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Scene__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:876:1: ( ( '(' ) )
            // InternalGame.g:877:1: ( '(' )
            {
            // InternalGame.g:877:1: ( '(' )
            // InternalGame.g:878:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_6_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__1__Impl"


    // $ANTLR start "rule__Scene__Group_6__2"
    // InternalGame.g:887:1: rule__Scene__Group_6__2 : rule__Scene__Group_6__2__Impl rule__Scene__Group_6__3 ;
    public final void rule__Scene__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:891:1: ( rule__Scene__Group_6__2__Impl rule__Scene__Group_6__3 )
            // InternalGame.g:892:2: rule__Scene__Group_6__2__Impl rule__Scene__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__2"


    // $ANTLR start "rule__Scene__Group_6__2__Impl"
    // InternalGame.g:899:1: rule__Scene__Group_6__2__Impl : ( ( rule__Scene__ActionsAssignment_6_2 ) ) ;
    public final void rule__Scene__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:903:1: ( ( ( rule__Scene__ActionsAssignment_6_2 ) ) )
            // InternalGame.g:904:1: ( ( rule__Scene__ActionsAssignment_6_2 ) )
            {
            // InternalGame.g:904:1: ( ( rule__Scene__ActionsAssignment_6_2 ) )
            // InternalGame.g:905:2: ( rule__Scene__ActionsAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsAssignment_6_2()); 
            }
            // InternalGame.g:906:2: ( rule__Scene__ActionsAssignment_6_2 )
            // InternalGame.g:906:3: rule__Scene__ActionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ActionsAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__2__Impl"


    // $ANTLR start "rule__Scene__Group_6__3"
    // InternalGame.g:914:1: rule__Scene__Group_6__3 : rule__Scene__Group_6__3__Impl rule__Scene__Group_6__4 ;
    public final void rule__Scene__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:918:1: ( rule__Scene__Group_6__3__Impl rule__Scene__Group_6__4 )
            // InternalGame.g:919:2: rule__Scene__Group_6__3__Impl rule__Scene__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__3"


    // $ANTLR start "rule__Scene__Group_6__3__Impl"
    // InternalGame.g:926:1: rule__Scene__Group_6__3__Impl : ( ( rule__Scene__Group_6_3__0 )* ) ;
    public final void rule__Scene__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:930:1: ( ( ( rule__Scene__Group_6_3__0 )* ) )
            // InternalGame.g:931:1: ( ( rule__Scene__Group_6_3__0 )* )
            {
            // InternalGame.g:931:1: ( ( rule__Scene__Group_6_3__0 )* )
            // InternalGame.g:932:2: ( rule__Scene__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_6_3()); 
            }
            // InternalGame.g:933:2: ( rule__Scene__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:933:3: rule__Scene__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scene__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__3__Impl"


    // $ANTLR start "rule__Scene__Group_6__4"
    // InternalGame.g:941:1: rule__Scene__Group_6__4 : rule__Scene__Group_6__4__Impl ;
    public final void rule__Scene__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:945:1: ( rule__Scene__Group_6__4__Impl )
            // InternalGame.g:946:2: rule__Scene__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__4"


    // $ANTLR start "rule__Scene__Group_6__4__Impl"
    // InternalGame.g:952:1: rule__Scene__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Scene__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:956:1: ( ( ')' ) )
            // InternalGame.g:957:1: ( ')' )
            {
            // InternalGame.g:957:1: ( ')' )
            // InternalGame.g:958:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getRightParenthesisKeyword_6_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getRightParenthesisKeyword_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6__4__Impl"


    // $ANTLR start "rule__Scene__Group_6_3__0"
    // InternalGame.g:968:1: rule__Scene__Group_6_3__0 : rule__Scene__Group_6_3__0__Impl rule__Scene__Group_6_3__1 ;
    public final void rule__Scene__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:972:1: ( rule__Scene__Group_6_3__0__Impl rule__Scene__Group_6_3__1 )
            // InternalGame.g:973:2: rule__Scene__Group_6_3__0__Impl rule__Scene__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6_3__0"


    // $ANTLR start "rule__Scene__Group_6_3__0__Impl"
    // InternalGame.g:980:1: rule__Scene__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Scene__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:984:1: ( ( ',' ) )
            // InternalGame.g:985:1: ( ',' )
            {
            // InternalGame.g:985:1: ( ',' )
            // InternalGame.g:986:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getCommaKeyword_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6_3__0__Impl"


    // $ANTLR start "rule__Scene__Group_6_3__1"
    // InternalGame.g:995:1: rule__Scene__Group_6_3__1 : rule__Scene__Group_6_3__1__Impl ;
    public final void rule__Scene__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:999:1: ( rule__Scene__Group_6_3__1__Impl )
            // InternalGame.g:1000:2: rule__Scene__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_6_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6_3__1"


    // $ANTLR start "rule__Scene__Group_6_3__1__Impl"
    // InternalGame.g:1006:1: rule__Scene__Group_6_3__1__Impl : ( ( rule__Scene__ActionsAssignment_6_3_1 ) ) ;
    public final void rule__Scene__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1010:1: ( ( ( rule__Scene__ActionsAssignment_6_3_1 ) ) )
            // InternalGame.g:1011:1: ( ( rule__Scene__ActionsAssignment_6_3_1 ) )
            {
            // InternalGame.g:1011:1: ( ( rule__Scene__ActionsAssignment_6_3_1 ) )
            // InternalGame.g:1012:2: ( rule__Scene__ActionsAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsAssignment_6_3_1()); 
            }
            // InternalGame.g:1013:2: ( rule__Scene__ActionsAssignment_6_3_1 )
            // InternalGame.g:1013:3: rule__Scene__ActionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ActionsAssignment_6_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsAssignment_6_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_6_3__1__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // InternalGame.g:1022:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1026:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalGame.g:1027:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Character__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // InternalGame.g:1034:1: rule__Character__Group__0__Impl : ( 'character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1038:1: ( ( 'character' ) )
            // InternalGame.g:1039:1: ( 'character' )
            {
            // InternalGame.g:1039:1: ( 'character' )
            // InternalGame.g:1040:2: 'character'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // InternalGame.g:1049:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1053:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalGame.g:1054:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Character__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // InternalGame.g:1061:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1065:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // InternalGame.g:1066:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // InternalGame.g:1066:1: ( ( rule__Character__NameAssignment_1 ) )
            // InternalGame.g:1067:2: ( rule__Character__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:1068:2: ( rule__Character__NameAssignment_1 )
            // InternalGame.g:1068:3: rule__Character__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Character__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // InternalGame.g:1076:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1080:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // InternalGame.g:1081:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Character__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // InternalGame.g:1088:1: rule__Character__Group__2__Impl : ( '{' ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1092:1: ( ( '{' ) )
            // InternalGame.g:1093:1: ( '{' )
            {
            // InternalGame.g:1093:1: ( '{' )
            // InternalGame.g:1094:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__3"
    // InternalGame.g:1103:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1107:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // InternalGame.g:1108:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Character__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3"


    // $ANTLR start "rule__Character__Group__3__Impl"
    // InternalGame.g:1115:1: rule__Character__Group__3__Impl : ( 'description' ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1119:1: ( ( 'description' ) )
            // InternalGame.g:1120:1: ( 'description' )
            {
            // InternalGame.g:1120:1: ( 'description' )
            // InternalGame.g:1121:2: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getDescriptionKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getDescriptionKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3__Impl"


    // $ANTLR start "rule__Character__Group__4"
    // InternalGame.g:1130:1: rule__Character__Group__4 : rule__Character__Group__4__Impl rule__Character__Group__5 ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1134:1: ( rule__Character__Group__4__Impl rule__Character__Group__5 )
            // InternalGame.g:1135:2: rule__Character__Group__4__Impl rule__Character__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Character__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4"


    // $ANTLR start "rule__Character__Group__4__Impl"
    // InternalGame.g:1142:1: rule__Character__Group__4__Impl : ( ( rule__Character__DescriptionAssignment_4 ) ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1146:1: ( ( ( rule__Character__DescriptionAssignment_4 ) ) )
            // InternalGame.g:1147:1: ( ( rule__Character__DescriptionAssignment_4 ) )
            {
            // InternalGame.g:1147:1: ( ( rule__Character__DescriptionAssignment_4 ) )
            // InternalGame.g:1148:2: ( rule__Character__DescriptionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getDescriptionAssignment_4()); 
            }
            // InternalGame.g:1149:2: ( rule__Character__DescriptionAssignment_4 )
            // InternalGame.g:1149:3: rule__Character__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Character__DescriptionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getDescriptionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__5"
    // InternalGame.g:1157:1: rule__Character__Group__5 : rule__Character__Group__5__Impl rule__Character__Group__6 ;
    public final void rule__Character__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1161:1: ( rule__Character__Group__5__Impl rule__Character__Group__6 )
            // InternalGame.g:1162:2: rule__Character__Group__5__Impl rule__Character__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Character__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__5"


    // $ANTLR start "rule__Character__Group__5__Impl"
    // InternalGame.g:1169:1: rule__Character__Group__5__Impl : ( 'healthPoints' ) ;
    public final void rule__Character__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1173:1: ( ( 'healthPoints' ) )
            // InternalGame.g:1174:1: ( 'healthPoints' )
            {
            // InternalGame.g:1174:1: ( 'healthPoints' )
            // InternalGame.g:1175:2: 'healthPoints'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getHealthPointsKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getHealthPointsKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__5__Impl"


    // $ANTLR start "rule__Character__Group__6"
    // InternalGame.g:1184:1: rule__Character__Group__6 : rule__Character__Group__6__Impl rule__Character__Group__7 ;
    public final void rule__Character__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1188:1: ( rule__Character__Group__6__Impl rule__Character__Group__7 )
            // InternalGame.g:1189:2: rule__Character__Group__6__Impl rule__Character__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__6"


    // $ANTLR start "rule__Character__Group__6__Impl"
    // InternalGame.g:1196:1: rule__Character__Group__6__Impl : ( ( rule__Character__HealthPointsAssignment_6 ) ) ;
    public final void rule__Character__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1200:1: ( ( ( rule__Character__HealthPointsAssignment_6 ) ) )
            // InternalGame.g:1201:1: ( ( rule__Character__HealthPointsAssignment_6 ) )
            {
            // InternalGame.g:1201:1: ( ( rule__Character__HealthPointsAssignment_6 ) )
            // InternalGame.g:1202:2: ( rule__Character__HealthPointsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getHealthPointsAssignment_6()); 
            }
            // InternalGame.g:1203:2: ( rule__Character__HealthPointsAssignment_6 )
            // InternalGame.g:1203:3: rule__Character__HealthPointsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Character__HealthPointsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getHealthPointsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__6__Impl"


    // $ANTLR start "rule__Character__Group__7"
    // InternalGame.g:1211:1: rule__Character__Group__7 : rule__Character__Group__7__Impl rule__Character__Group__8 ;
    public final void rule__Character__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1215:1: ( rule__Character__Group__7__Impl rule__Character__Group__8 )
            // InternalGame.g:1216:2: rule__Character__Group__7__Impl rule__Character__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__7"


    // $ANTLR start "rule__Character__Group__7__Impl"
    // InternalGame.g:1223:1: rule__Character__Group__7__Impl : ( ( rule__Character__Group_7__0 )? ) ;
    public final void rule__Character__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1227:1: ( ( ( rule__Character__Group_7__0 )? ) )
            // InternalGame.g:1228:1: ( ( rule__Character__Group_7__0 )? )
            {
            // InternalGame.g:1228:1: ( ( rule__Character__Group_7__0 )? )
            // InternalGame.g:1229:2: ( rule__Character__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getGroup_7()); 
            }
            // InternalGame.g:1230:2: ( rule__Character__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:1230:3: rule__Character__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__7__Impl"


    // $ANTLR start "rule__Character__Group__8"
    // InternalGame.g:1238:1: rule__Character__Group__8 : rule__Character__Group__8__Impl ;
    public final void rule__Character__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1242:1: ( rule__Character__Group__8__Impl )
            // InternalGame.g:1243:2: rule__Character__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__8"


    // $ANTLR start "rule__Character__Group__8__Impl"
    // InternalGame.g:1249:1: rule__Character__Group__8__Impl : ( '}' ) ;
    public final void rule__Character__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1253:1: ( ( '}' ) )
            // InternalGame.g:1254:1: ( '}' )
            {
            // InternalGame.g:1254:1: ( '}' )
            // InternalGame.g:1255:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__8__Impl"


    // $ANTLR start "rule__Character__Group_7__0"
    // InternalGame.g:1265:1: rule__Character__Group_7__0 : rule__Character__Group_7__0__Impl rule__Character__Group_7__1 ;
    public final void rule__Character__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1269:1: ( rule__Character__Group_7__0__Impl rule__Character__Group_7__1 )
            // InternalGame.g:1270:2: rule__Character__Group_7__0__Impl rule__Character__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Character__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__0"


    // $ANTLR start "rule__Character__Group_7__0__Impl"
    // InternalGame.g:1277:1: rule__Character__Group_7__0__Impl : ( 'actions' ) ;
    public final void rule__Character__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1281:1: ( ( 'actions' ) )
            // InternalGame.g:1282:1: ( 'actions' )
            {
            // InternalGame.g:1282:1: ( 'actions' )
            // InternalGame.g:1283:2: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getActionsKeyword_7_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getActionsKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__0__Impl"


    // $ANTLR start "rule__Character__Group_7__1"
    // InternalGame.g:1292:1: rule__Character__Group_7__1 : rule__Character__Group_7__1__Impl rule__Character__Group_7__2 ;
    public final void rule__Character__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1296:1: ( rule__Character__Group_7__1__Impl rule__Character__Group_7__2 )
            // InternalGame.g:1297:2: rule__Character__Group_7__1__Impl rule__Character__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__Character__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__1"


    // $ANTLR start "rule__Character__Group_7__1__Impl"
    // InternalGame.g:1304:1: rule__Character__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Character__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1308:1: ( ( '(' ) )
            // InternalGame.g:1309:1: ( '(' )
            {
            // InternalGame.g:1309:1: ( '(' )
            // InternalGame.g:1310:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getLeftParenthesisKeyword_7_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getLeftParenthesisKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__1__Impl"


    // $ANTLR start "rule__Character__Group_7__2"
    // InternalGame.g:1319:1: rule__Character__Group_7__2 : rule__Character__Group_7__2__Impl rule__Character__Group_7__3 ;
    public final void rule__Character__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1323:1: ( rule__Character__Group_7__2__Impl rule__Character__Group_7__3 )
            // InternalGame.g:1324:2: rule__Character__Group_7__2__Impl rule__Character__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Character__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__2"


    // $ANTLR start "rule__Character__Group_7__2__Impl"
    // InternalGame.g:1331:1: rule__Character__Group_7__2__Impl : ( ( rule__Character__ActionsAssignment_7_2 ) ) ;
    public final void rule__Character__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1335:1: ( ( ( rule__Character__ActionsAssignment_7_2 ) ) )
            // InternalGame.g:1336:1: ( ( rule__Character__ActionsAssignment_7_2 ) )
            {
            // InternalGame.g:1336:1: ( ( rule__Character__ActionsAssignment_7_2 ) )
            // InternalGame.g:1337:2: ( rule__Character__ActionsAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getActionsAssignment_7_2()); 
            }
            // InternalGame.g:1338:2: ( rule__Character__ActionsAssignment_7_2 )
            // InternalGame.g:1338:3: rule__Character__ActionsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Character__ActionsAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getActionsAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__2__Impl"


    // $ANTLR start "rule__Character__Group_7__3"
    // InternalGame.g:1346:1: rule__Character__Group_7__3 : rule__Character__Group_7__3__Impl rule__Character__Group_7__4 ;
    public final void rule__Character__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1350:1: ( rule__Character__Group_7__3__Impl rule__Character__Group_7__4 )
            // InternalGame.g:1351:2: rule__Character__Group_7__3__Impl rule__Character__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__Character__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__3"


    // $ANTLR start "rule__Character__Group_7__3__Impl"
    // InternalGame.g:1358:1: rule__Character__Group_7__3__Impl : ( ( rule__Character__Group_7_3__0 )* ) ;
    public final void rule__Character__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1362:1: ( ( ( rule__Character__Group_7_3__0 )* ) )
            // InternalGame.g:1363:1: ( ( rule__Character__Group_7_3__0 )* )
            {
            // InternalGame.g:1363:1: ( ( rule__Character__Group_7_3__0 )* )
            // InternalGame.g:1364:2: ( rule__Character__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getGroup_7_3()); 
            }
            // InternalGame.g:1365:2: ( rule__Character__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:1365:3: rule__Character__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Character__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getGroup_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__3__Impl"


    // $ANTLR start "rule__Character__Group_7__4"
    // InternalGame.g:1373:1: rule__Character__Group_7__4 : rule__Character__Group_7__4__Impl ;
    public final void rule__Character__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1377:1: ( rule__Character__Group_7__4__Impl )
            // InternalGame.g:1378:2: rule__Character__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__4"


    // $ANTLR start "rule__Character__Group_7__4__Impl"
    // InternalGame.g:1384:1: rule__Character__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Character__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1388:1: ( ( ')' ) )
            // InternalGame.g:1389:1: ( ')' )
            {
            // InternalGame.g:1389:1: ( ')' )
            // InternalGame.g:1390:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getRightParenthesisKeyword_7_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getRightParenthesisKeyword_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7__4__Impl"


    // $ANTLR start "rule__Character__Group_7_3__0"
    // InternalGame.g:1400:1: rule__Character__Group_7_3__0 : rule__Character__Group_7_3__0__Impl rule__Character__Group_7_3__1 ;
    public final void rule__Character__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1404:1: ( rule__Character__Group_7_3__0__Impl rule__Character__Group_7_3__1 )
            // InternalGame.g:1405:2: rule__Character__Group_7_3__0__Impl rule__Character__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Character__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group_7_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7_3__0"


    // $ANTLR start "rule__Character__Group_7_3__0__Impl"
    // InternalGame.g:1412:1: rule__Character__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Character__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1416:1: ( ( ',' ) )
            // InternalGame.g:1417:1: ( ',' )
            {
            // InternalGame.g:1417:1: ( ',' )
            // InternalGame.g:1418:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getCommaKeyword_7_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getCommaKeyword_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7_3__0__Impl"


    // $ANTLR start "rule__Character__Group_7_3__1"
    // InternalGame.g:1427:1: rule__Character__Group_7_3__1 : rule__Character__Group_7_3__1__Impl ;
    public final void rule__Character__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1431:1: ( rule__Character__Group_7_3__1__Impl )
            // InternalGame.g:1432:2: rule__Character__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group_7_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7_3__1"


    // $ANTLR start "rule__Character__Group_7_3__1__Impl"
    // InternalGame.g:1438:1: rule__Character__Group_7_3__1__Impl : ( ( rule__Character__ActionsAssignment_7_3_1 ) ) ;
    public final void rule__Character__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1442:1: ( ( ( rule__Character__ActionsAssignment_7_3_1 ) ) )
            // InternalGame.g:1443:1: ( ( rule__Character__ActionsAssignment_7_3_1 ) )
            {
            // InternalGame.g:1443:1: ( ( rule__Character__ActionsAssignment_7_3_1 ) )
            // InternalGame.g:1444:2: ( rule__Character__ActionsAssignment_7_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getActionsAssignment_7_3_1()); 
            }
            // InternalGame.g:1445:2: ( rule__Character__ActionsAssignment_7_3_1 )
            // InternalGame.g:1445:3: rule__Character__ActionsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Character__ActionsAssignment_7_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getActionsAssignment_7_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group_7_3__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalGame.g:1454:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1458:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:1459:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Object__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalGame.g:1466:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1470:1: ( ( 'object' ) )
            // InternalGame.g:1471:1: ( 'object' )
            {
            // InternalGame.g:1471:1: ( 'object' )
            // InternalGame.g:1472:2: 'object'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalGame.g:1481:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1485:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1486:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalGame.g:1493:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1497:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalGame.g:1498:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalGame.g:1498:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalGame.g:1499:2: ( rule__Object__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:1500:2: ( rule__Object__NameAssignment_1 )
            // InternalGame.g:1500:3: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalGame.g:1508:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1512:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1513:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalGame.g:1520:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1524:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalGame.g:1525:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalGame.g:1525:1: ( ( rule__Object__Group_2__0 )? )
            // InternalGame.g:1526:2: ( rule__Object__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_2()); 
            }
            // InternalGame.g:1527:2: ( rule__Object__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:1527:3: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalGame.g:1535:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1539:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1540:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalGame.g:1547:1: rule__Object__Group__3__Impl : ( '{' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1551:1: ( ( '{' ) )
            // InternalGame.g:1552:1: ( '{' )
            {
            // InternalGame.g:1552:1: ( '{' )
            // InternalGame.g:1553:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalGame.g:1562:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1566:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:1567:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Object__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalGame.g:1574:1: rule__Object__Group__4__Impl : ( 'description' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1578:1: ( ( 'description' ) )
            // InternalGame.g:1579:1: ( 'description' )
            {
            // InternalGame.g:1579:1: ( 'description' )
            // InternalGame.g:1580:2: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getDescriptionKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // InternalGame.g:1589:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1593:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:1594:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Object__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // InternalGame.g:1601:1: rule__Object__Group__5__Impl : ( ( rule__Object__DescriptionAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1605:1: ( ( ( rule__Object__DescriptionAssignment_5 ) ) )
            // InternalGame.g:1606:1: ( ( rule__Object__DescriptionAssignment_5 ) )
            {
            // InternalGame.g:1606:1: ( ( rule__Object__DescriptionAssignment_5 ) )
            // InternalGame.g:1607:2: ( rule__Object__DescriptionAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionAssignment_5()); 
            }
            // InternalGame.g:1608:2: ( rule__Object__DescriptionAssignment_5 )
            // InternalGame.g:1608:3: rule__Object__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Object__DescriptionAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getDescriptionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group__6"
    // InternalGame.g:1616:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1620:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalGame.g:1621:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Object__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6"


    // $ANTLR start "rule__Object__Group__6__Impl"
    // InternalGame.g:1628:1: rule__Object__Group__6__Impl : ( 'healthPoints' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1632:1: ( ( 'healthPoints' ) )
            // InternalGame.g:1633:1: ( 'healthPoints' )
            {
            // InternalGame.g:1633:1: ( 'healthPoints' )
            // InternalGame.g:1634:2: 'healthPoints'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getHealthPointsKeyword_6()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getHealthPointsKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6__Impl"


    // $ANTLR start "rule__Object__Group__7"
    // InternalGame.g:1643:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1647:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalGame.g:1648:2: rule__Object__Group__7__Impl rule__Object__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__7"


    // $ANTLR start "rule__Object__Group__7__Impl"
    // InternalGame.g:1655:1: rule__Object__Group__7__Impl : ( ( rule__Object__HealthPointsAssignment_7 ) ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1659:1: ( ( ( rule__Object__HealthPointsAssignment_7 ) ) )
            // InternalGame.g:1660:1: ( ( rule__Object__HealthPointsAssignment_7 ) )
            {
            // InternalGame.g:1660:1: ( ( rule__Object__HealthPointsAssignment_7 ) )
            // InternalGame.g:1661:2: ( rule__Object__HealthPointsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getHealthPointsAssignment_7()); 
            }
            // InternalGame.g:1662:2: ( rule__Object__HealthPointsAssignment_7 )
            // InternalGame.g:1662:3: rule__Object__HealthPointsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Object__HealthPointsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getHealthPointsAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__7__Impl"


    // $ANTLR start "rule__Object__Group__8"
    // InternalGame.g:1670:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1674:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalGame.g:1675:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__8"


    // $ANTLR start "rule__Object__Group__8__Impl"
    // InternalGame.g:1682:1: rule__Object__Group__8__Impl : ( ( rule__Object__Group_8__0 )? ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1686:1: ( ( ( rule__Object__Group_8__0 )? ) )
            // InternalGame.g:1687:1: ( ( rule__Object__Group_8__0 )? )
            {
            // InternalGame.g:1687:1: ( ( rule__Object__Group_8__0 )? )
            // InternalGame.g:1688:2: ( rule__Object__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_8()); 
            }
            // InternalGame.g:1689:2: ( rule__Object__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1689:3: rule__Object__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__8__Impl"


    // $ANTLR start "rule__Object__Group__9"
    // InternalGame.g:1697:1: rule__Object__Group__9 : rule__Object__Group__9__Impl ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1701:1: ( rule__Object__Group__9__Impl )
            // InternalGame.g:1702:2: rule__Object__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__9"


    // $ANTLR start "rule__Object__Group__9__Impl"
    // InternalGame.g:1708:1: rule__Object__Group__9__Impl : ( '}' ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1712:1: ( ( '}' ) )
            // InternalGame.g:1713:1: ( '}' )
            {
            // InternalGame.g:1713:1: ( '}' )
            // InternalGame.g:1714:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__9__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalGame.g:1724:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1728:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalGame.g:1729:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Object__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // InternalGame.g:1736:1: rule__Object__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1740:1: ( ( 'is' ) )
            // InternalGame.g:1741:1: ( 'is' )
            {
            // InternalGame.g:1741:1: ( 'is' )
            // InternalGame.g:1742:2: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getIsKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getIsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // InternalGame.g:1751:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl rule__Object__Group_2__2 ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1755:1: ( rule__Object__Group_2__1__Impl rule__Object__Group_2__2 )
            // InternalGame.g:1756:2: rule__Object__Group_2__1__Impl rule__Object__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Object__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // InternalGame.g:1763:1: rule__Object__Group_2__1__Impl : ( 'a' ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1767:1: ( ( 'a' ) )
            // InternalGame.g:1768:1: ( 'a' )
            {
            // InternalGame.g:1768:1: ( 'a' )
            // InternalGame.g:1769:2: 'a'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAKeyword_2_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Object__Group_2__2"
    // InternalGame.g:1778:1: rule__Object__Group_2__2 : rule__Object__Group_2__2__Impl ;
    public final void rule__Object__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1782:1: ( rule__Object__Group_2__2__Impl )
            // InternalGame.g:1783:2: rule__Object__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__2"


    // $ANTLR start "rule__Object__Group_2__2__Impl"
    // InternalGame.g:1789:1: rule__Object__Group_2__2__Impl : ( ( rule__Object__SuperTypeAssignment_2_2 ) ) ;
    public final void rule__Object__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1793:1: ( ( ( rule__Object__SuperTypeAssignment_2_2 ) ) )
            // InternalGame.g:1794:1: ( ( rule__Object__SuperTypeAssignment_2_2 ) )
            {
            // InternalGame.g:1794:1: ( ( rule__Object__SuperTypeAssignment_2_2 ) )
            // InternalGame.g:1795:2: ( rule__Object__SuperTypeAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_2()); 
            }
            // InternalGame.g:1796:2: ( rule__Object__SuperTypeAssignment_2_2 )
            // InternalGame.g:1796:3: rule__Object__SuperTypeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Object__SuperTypeAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__2__Impl"


    // $ANTLR start "rule__Object__Group_8__0"
    // InternalGame.g:1805:1: rule__Object__Group_8__0 : rule__Object__Group_8__0__Impl rule__Object__Group_8__1 ;
    public final void rule__Object__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1809:1: ( rule__Object__Group_8__0__Impl rule__Object__Group_8__1 )
            // InternalGame.g:1810:2: rule__Object__Group_8__0__Impl rule__Object__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Object__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__0"


    // $ANTLR start "rule__Object__Group_8__0__Impl"
    // InternalGame.g:1817:1: rule__Object__Group_8__0__Impl : ( 'actions' ) ;
    public final void rule__Object__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1821:1: ( ( 'actions' ) )
            // InternalGame.g:1822:1: ( 'actions' )
            {
            // InternalGame.g:1822:1: ( 'actions' )
            // InternalGame.g:1823:2: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getActionsKeyword_8_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getActionsKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__0__Impl"


    // $ANTLR start "rule__Object__Group_8__1"
    // InternalGame.g:1832:1: rule__Object__Group_8__1 : rule__Object__Group_8__1__Impl rule__Object__Group_8__2 ;
    public final void rule__Object__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1836:1: ( rule__Object__Group_8__1__Impl rule__Object__Group_8__2 )
            // InternalGame.g:1837:2: rule__Object__Group_8__1__Impl rule__Object__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Object__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__1"


    // $ANTLR start "rule__Object__Group_8__1__Impl"
    // InternalGame.g:1844:1: rule__Object__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Object__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1848:1: ( ( '(' ) )
            // InternalGame.g:1849:1: ( '(' )
            {
            // InternalGame.g:1849:1: ( '(' )
            // InternalGame.g:1850:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_8_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__1__Impl"


    // $ANTLR start "rule__Object__Group_8__2"
    // InternalGame.g:1859:1: rule__Object__Group_8__2 : rule__Object__Group_8__2__Impl rule__Object__Group_8__3 ;
    public final void rule__Object__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1863:1: ( rule__Object__Group_8__2__Impl rule__Object__Group_8__3 )
            // InternalGame.g:1864:2: rule__Object__Group_8__2__Impl rule__Object__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__2"


    // $ANTLR start "rule__Object__Group_8__2__Impl"
    // InternalGame.g:1871:1: rule__Object__Group_8__2__Impl : ( ( rule__Object__ActionsAssignment_8_2 ) ) ;
    public final void rule__Object__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1875:1: ( ( ( rule__Object__ActionsAssignment_8_2 ) ) )
            // InternalGame.g:1876:1: ( ( rule__Object__ActionsAssignment_8_2 ) )
            {
            // InternalGame.g:1876:1: ( ( rule__Object__ActionsAssignment_8_2 ) )
            // InternalGame.g:1877:2: ( rule__Object__ActionsAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getActionsAssignment_8_2()); 
            }
            // InternalGame.g:1878:2: ( rule__Object__ActionsAssignment_8_2 )
            // InternalGame.g:1878:3: rule__Object__ActionsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Object__ActionsAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getActionsAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__2__Impl"


    // $ANTLR start "rule__Object__Group_8__3"
    // InternalGame.g:1886:1: rule__Object__Group_8__3 : rule__Object__Group_8__3__Impl rule__Object__Group_8__4 ;
    public final void rule__Object__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1890:1: ( rule__Object__Group_8__3__Impl rule__Object__Group_8__4 )
            // InternalGame.g:1891:2: rule__Object__Group_8__3__Impl rule__Object__Group_8__4
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_8__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__3"


    // $ANTLR start "rule__Object__Group_8__3__Impl"
    // InternalGame.g:1898:1: rule__Object__Group_8__3__Impl : ( ( rule__Object__Group_8_3__0 )* ) ;
    public final void rule__Object__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1902:1: ( ( ( rule__Object__Group_8_3__0 )* ) )
            // InternalGame.g:1903:1: ( ( rule__Object__Group_8_3__0 )* )
            {
            // InternalGame.g:1903:1: ( ( rule__Object__Group_8_3__0 )* )
            // InternalGame.g:1904:2: ( rule__Object__Group_8_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_8_3()); 
            }
            // InternalGame.g:1905:2: ( rule__Object__Group_8_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:1905:3: rule__Object__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Object__Group_8_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__3__Impl"


    // $ANTLR start "rule__Object__Group_8__4"
    // InternalGame.g:1913:1: rule__Object__Group_8__4 : rule__Object__Group_8__4__Impl ;
    public final void rule__Object__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1917:1: ( rule__Object__Group_8__4__Impl )
            // InternalGame.g:1918:2: rule__Object__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__4"


    // $ANTLR start "rule__Object__Group_8__4__Impl"
    // InternalGame.g:1924:1: rule__Object__Group_8__4__Impl : ( ')' ) ;
    public final void rule__Object__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1928:1: ( ( ')' ) )
            // InternalGame.g:1929:1: ( ')' )
            {
            // InternalGame.g:1929:1: ( ')' )
            // InternalGame.g:1930:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightParenthesisKeyword_8_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getRightParenthesisKeyword_8_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8__4__Impl"


    // $ANTLR start "rule__Object__Group_8_3__0"
    // InternalGame.g:1940:1: rule__Object__Group_8_3__0 : rule__Object__Group_8_3__0__Impl rule__Object__Group_8_3__1 ;
    public final void rule__Object__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1944:1: ( rule__Object__Group_8_3__0__Impl rule__Object__Group_8_3__1 )
            // InternalGame.g:1945:2: rule__Object__Group_8_3__0__Impl rule__Object__Group_8_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Object__Group_8_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_8_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8_3__0"


    // $ANTLR start "rule__Object__Group_8_3__0__Impl"
    // InternalGame.g:1952:1: rule__Object__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Object__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1956:1: ( ( ',' ) )
            // InternalGame.g:1957:1: ( ',' )
            {
            // InternalGame.g:1957:1: ( ',' )
            // InternalGame.g:1958:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCommaKeyword_8_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getCommaKeyword_8_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8_3__0__Impl"


    // $ANTLR start "rule__Object__Group_8_3__1"
    // InternalGame.g:1967:1: rule__Object__Group_8_3__1 : rule__Object__Group_8_3__1__Impl ;
    public final void rule__Object__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1971:1: ( rule__Object__Group_8_3__1__Impl )
            // InternalGame.g:1972:2: rule__Object__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_8_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8_3__1"


    // $ANTLR start "rule__Object__Group_8_3__1__Impl"
    // InternalGame.g:1978:1: rule__Object__Group_8_3__1__Impl : ( ( rule__Object__ActionsAssignment_8_3_1 ) ) ;
    public final void rule__Object__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1982:1: ( ( ( rule__Object__ActionsAssignment_8_3_1 ) ) )
            // InternalGame.g:1983:1: ( ( rule__Object__ActionsAssignment_8_3_1 ) )
            {
            // InternalGame.g:1983:1: ( ( rule__Object__ActionsAssignment_8_3_1 ) )
            // InternalGame.g:1984:2: ( rule__Object__ActionsAssignment_8_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getActionsAssignment_8_3_1()); 
            }
            // InternalGame.g:1985:2: ( rule__Object__ActionsAssignment_8_3_1 )
            // InternalGame.g:1985:3: rule__Object__ActionsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__ActionsAssignment_8_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getActionsAssignment_8_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_8_3__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalGame.g:1994:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1998:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalGame.g:1999:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Step__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalGame.g:2006:1: rule__Step__Group__0__Impl : ( 'step' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2010:1: ( ( 'step' ) )
            // InternalGame.g:2011:1: ( 'step' )
            {
            // InternalGame.g:2011:1: ( 'step' )
            // InternalGame.g:2012:2: 'step'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getStepKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalGame.g:2021:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2025:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalGame.g:2026:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Step__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalGame.g:2033:1: rule__Step__Group__1__Impl : ( '{' ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2037:1: ( ( '{' ) )
            // InternalGame.g:2038:1: ( '{' )
            {
            // InternalGame.g:2038:1: ( '{' )
            // InternalGame.g:2039:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // InternalGame.g:2048:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2052:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalGame.g:2053:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalGame.g:2060:1: rule__Step__Group__2__Impl : ( ( rule__Step__ActionAssignment_2 ) ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2064:1: ( ( ( rule__Step__ActionAssignment_2 ) ) )
            // InternalGame.g:2065:1: ( ( rule__Step__ActionAssignment_2 ) )
            {
            // InternalGame.g:2065:1: ( ( rule__Step__ActionAssignment_2 ) )
            // InternalGame.g:2066:2: ( rule__Step__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getActionAssignment_2()); 
            }
            // InternalGame.g:2067:2: ( rule__Step__ActionAssignment_2 )
            // InternalGame.g:2067:3: rule__Step__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Step__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getActionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalGame.g:2075:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2079:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalGame.g:2080:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Step__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // InternalGame.g:2087:1: rule__Step__Group__3__Impl : ( ( rule__Step__TargetObjectAssignment_3 ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2091:1: ( ( ( rule__Step__TargetObjectAssignment_3 ) ) )
            // InternalGame.g:2092:1: ( ( rule__Step__TargetObjectAssignment_3 ) )
            {
            // InternalGame.g:2092:1: ( ( rule__Step__TargetObjectAssignment_3 ) )
            // InternalGame.g:2093:2: ( rule__Step__TargetObjectAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectAssignment_3()); 
            }
            // InternalGame.g:2094:2: ( rule__Step__TargetObjectAssignment_3 )
            // InternalGame.g:2094:3: rule__Step__TargetObjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Step__TargetObjectAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTargetObjectAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Step__Group__4"
    // InternalGame.g:2102:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2106:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalGame.g:2107:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Step__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4"


    // $ANTLR start "rule__Step__Group__4__Impl"
    // InternalGame.g:2114:1: rule__Step__Group__4__Impl : ( 'if' ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2118:1: ( ( 'if' ) )
            // InternalGame.g:2119:1: ( 'if' )
            {
            // InternalGame.g:2119:1: ( 'if' )
            // InternalGame.g:2120:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getIfKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getIfKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4__Impl"


    // $ANTLR start "rule__Step__Group__5"
    // InternalGame.g:2129:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2133:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // InternalGame.g:2134:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Step__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5"


    // $ANTLR start "rule__Step__Group__5__Impl"
    // InternalGame.g:2141:1: rule__Step__Group__5__Impl : ( ( rule__Step__Group_5__0 ) ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2145:1: ( ( ( rule__Step__Group_5__0 ) ) )
            // InternalGame.g:2146:1: ( ( rule__Step__Group_5__0 ) )
            {
            // InternalGame.g:2146:1: ( ( rule__Step__Group_5__0 ) )
            // InternalGame.g:2147:2: ( rule__Step__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getGroup_5()); 
            }
            // InternalGame.g:2148:2: ( rule__Step__Group_5__0 )
            // InternalGame.g:2148:3: rule__Step__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__6"
    // InternalGame.g:2156:1: rule__Step__Group__6 : rule__Step__Group__6__Impl rule__Step__Group__7 ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2160:1: ( rule__Step__Group__6__Impl rule__Step__Group__7 )
            // InternalGame.g:2161:2: rule__Step__Group__6__Impl rule__Step__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6"


    // $ANTLR start "rule__Step__Group__6__Impl"
    // InternalGame.g:2168:1: rule__Step__Group__6__Impl : ( 'then' ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2172:1: ( ( 'then' ) )
            // InternalGame.g:2173:1: ( 'then' )
            {
            // InternalGame.g:2173:1: ( 'then' )
            // InternalGame.g:2174:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getThenKeyword_6()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getThenKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6__Impl"


    // $ANTLR start "rule__Step__Group__7"
    // InternalGame.g:2183:1: rule__Step__Group__7 : rule__Step__Group__7__Impl rule__Step__Group__8 ;
    public final void rule__Step__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2187:1: ( rule__Step__Group__7__Impl rule__Step__Group__8 )
            // InternalGame.g:2188:2: rule__Step__Group__7__Impl rule__Step__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Step__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7"


    // $ANTLR start "rule__Step__Group__7__Impl"
    // InternalGame.g:2195:1: rule__Step__Group__7__Impl : ( ( rule__Step__SceneAssignment_7 ) ) ;
    public final void rule__Step__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2199:1: ( ( ( rule__Step__SceneAssignment_7 ) ) )
            // InternalGame.g:2200:1: ( ( rule__Step__SceneAssignment_7 ) )
            {
            // InternalGame.g:2200:1: ( ( rule__Step__SceneAssignment_7 ) )
            // InternalGame.g:2201:2: ( rule__Step__SceneAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneAssignment_7()); 
            }
            // InternalGame.g:2202:2: ( rule__Step__SceneAssignment_7 )
            // InternalGame.g:2202:3: rule__Step__SceneAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Step__SceneAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7__Impl"


    // $ANTLR start "rule__Step__Group__8"
    // InternalGame.g:2210:1: rule__Step__Group__8 : rule__Step__Group__8__Impl ;
    public final void rule__Step__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2214:1: ( rule__Step__Group__8__Impl )
            // InternalGame.g:2215:2: rule__Step__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__8"


    // $ANTLR start "rule__Step__Group__8__Impl"
    // InternalGame.g:2221:1: rule__Step__Group__8__Impl : ( '}' ) ;
    public final void rule__Step__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2225:1: ( ( '}' ) )
            // InternalGame.g:2226:1: ( '}' )
            {
            // InternalGame.g:2226:1: ( '}' )
            // InternalGame.g:2227:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__8__Impl"


    // $ANTLR start "rule__Step__Group_5__0"
    // InternalGame.g:2237:1: rule__Step__Group_5__0 : rule__Step__Group_5__0__Impl rule__Step__Group_5__1 ;
    public final void rule__Step__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2241:1: ( rule__Step__Group_5__0__Impl rule__Step__Group_5__1 )
            // InternalGame.g:2242:2: rule__Step__Group_5__0__Impl rule__Step__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Step__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_5__0"


    // $ANTLR start "rule__Step__Group_5__0__Impl"
    // InternalGame.g:2249:1: rule__Step__Group_5__0__Impl : ( 'valid' ) ;
    public final void rule__Step__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2253:1: ( ( 'valid' ) )
            // InternalGame.g:2254:1: ( 'valid' )
            {
            // InternalGame.g:2254:1: ( 'valid' )
            // InternalGame.g:2255:2: 'valid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidKeyword_5_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_5__0__Impl"


    // $ANTLR start "rule__Step__Group_5__1"
    // InternalGame.g:2264:1: rule__Step__Group_5__1 : rule__Step__Group_5__1__Impl ;
    public final void rule__Step__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2268:1: ( rule__Step__Group_5__1__Impl )
            // InternalGame.g:2269:2: rule__Step__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_5__1"


    // $ANTLR start "rule__Step__Group_5__1__Impl"
    // InternalGame.g:2275:1: rule__Step__Group_5__1__Impl : ( ( rule__Step__ValidAssignment_5_1 ) ) ;
    public final void rule__Step__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2279:1: ( ( ( rule__Step__ValidAssignment_5_1 ) ) )
            // InternalGame.g:2280:1: ( ( rule__Step__ValidAssignment_5_1 ) )
            {
            // InternalGame.g:2280:1: ( ( rule__Step__ValidAssignment_5_1 ) )
            // InternalGame.g:2281:2: ( rule__Step__ValidAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidAssignment_5_1()); 
            }
            // InternalGame.g:2282:2: ( rule__Step__ValidAssignment_5_1 )
            // InternalGame.g:2282:3: rule__Step__ValidAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__ValidAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_5__1__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup"
    // InternalGame.g:2291:1: rule__Adventure__UnorderedGroup : rule__Adventure__UnorderedGroup__0 {...}?;
    public final void rule__Adventure__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup());
        	
        try {
            // InternalGame.g:2296:1: ( rule__Adventure__UnorderedGroup__0 {...}?)
            // InternalGame.g:2297:2: rule__Adventure__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup"


    // $ANTLR start "rule__Adventure__UnorderedGroup__Impl"
    // InternalGame.g:2305:1: rule__Adventure__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) ) ;
    public final void rule__Adventure__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGame.g:2310:1: ( ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) ) )
            // InternalGame.g:2311:3: ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) )
            {
            // InternalGame.g:2311:3: ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt15=2;
            }
            else if ( ( LA15_0 == 17 || LA15_0 == 26 || LA15_0 == 28 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt15=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:2312:3: ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) )
                    {
                    // InternalGame.g:2312:3: ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) )
                    // InternalGame.g:2313:4: {...}? => ( ( ( rule__Adventure__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalGame.g:2313:103: ( ( ( rule__Adventure__Group_0__0 ) ) )
                    // InternalGame.g:2314:5: ( ( rule__Adventure__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalGame.g:2320:5: ( ( rule__Adventure__Group_0__0 ) )
                    // InternalGame.g:2321:6: ( rule__Adventure__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getGroup_0()); 
                    }
                    // InternalGame.g:2322:6: ( rule__Adventure__Group_0__0 )
                    // InternalGame.g:2322:7: rule__Adventure__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adventure__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2327:3: ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) )
                    {
                    // InternalGame.g:2327:3: ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) )
                    // InternalGame.g:2328:4: {...}? => ( ( ( rule__Adventure__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalGame.g:2328:103: ( ( ( rule__Adventure__Group_1__0 ) ) )
                    // InternalGame.g:2329:5: ( ( rule__Adventure__Group_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalGame.g:2335:5: ( ( rule__Adventure__Group_1__0 ) )
                    // InternalGame.g:2336:6: ( rule__Adventure__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getGroup_1()); 
                    }
                    // InternalGame.g:2337:6: ( rule__Adventure__Group_1__0 )
                    // InternalGame.g:2337:7: rule__Adventure__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adventure__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getGroup_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2342:3: ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) )
                    {
                    // InternalGame.g:2342:3: ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) )
                    // InternalGame.g:2343:4: {...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalGame.g:2343:103: ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) )
                    // InternalGame.g:2344:5: ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalGame.g:2350:5: ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) )
                    // InternalGame.g:2351:6: ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* )
                    {
                    // InternalGame.g:2351:6: ( ( rule__Adventure__IngredientsAssignment_2 ) )
                    // InternalGame.g:2352:7: ( rule__Adventure__IngredientsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }
                    // InternalGame.g:2353:7: ( rule__Adventure__IngredientsAssignment_2 )
                    // InternalGame.g:2353:8: rule__Adventure__IngredientsAssignment_2
                    {
                    pushFollow(FOLLOW_23);
                    rule__Adventure__IngredientsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }

                    }

                    // InternalGame.g:2356:6: ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* )
                    // InternalGame.g:2357:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }
                    // InternalGame.g:2358:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalGame.g:2358:8: ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_23);
                    	    rule__Adventure__IngredientsAssignment_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup__0"
    // InternalGame.g:2372:1: rule__Adventure__UnorderedGroup__0 : rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )? ;
    public final void rule__Adventure__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2376:1: ( rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )? )
            // InternalGame.g:2377:2: rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_24);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:2378:2: ( rule__Adventure__UnorderedGroup__1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt16=1;
            }
            else if ( ( LA16_0 == 17 || LA16_0 == 26 || LA16_0 == 28 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGame.g:2378:2: rule__Adventure__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adventure__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup__0"


    // $ANTLR start "rule__Adventure__UnorderedGroup__1"
    // InternalGame.g:2384:1: rule__Adventure__UnorderedGroup__1 : rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )? ;
    public final void rule__Adventure__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2388:1: ( rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )? )
            // InternalGame.g:2389:2: rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_24);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:2390:2: ( rule__Adventure__UnorderedGroup__2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( ( LA17_0 == 17 || LA17_0 == 26 || LA17_0 == 28 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGame.g:2390:2: rule__Adventure__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adventure__UnorderedGroup__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup__1"


    // $ANTLR start "rule__Adventure__UnorderedGroup__2"
    // InternalGame.g:2396:1: rule__Adventure__UnorderedGroup__2 : rule__Adventure__UnorderedGroup__Impl ;
    public final void rule__Adventure__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2400:1: ( rule__Adventure__UnorderedGroup__Impl )
            // InternalGame.g:2401:2: rule__Adventure__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup__2"


    // $ANTLR start "rule__Adventure__StartSceneAssignment_0_1"
    // InternalGame.g:2408:1: rule__Adventure__StartSceneAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adventure__StartSceneAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2412:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2413:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2413:2: ( ( RULE_ID ) )
            // InternalGame.g:2414:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneSceneCrossReference_0_1_0()); 
            }
            // InternalGame.g:2415:3: ( RULE_ID )
            // InternalGame.g:2416:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneSceneIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getStartSceneSceneIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getStartSceneSceneCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__StartSceneAssignment_0_1"


    // $ANTLR start "rule__Adventure__EndSceneAssignment_1_1"
    // InternalGame.g:2427:1: rule__Adventure__EndSceneAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adventure__EndSceneAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2431:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2432:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2432:2: ( ( RULE_ID ) )
            // InternalGame.g:2433:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneSceneCrossReference_1_1_0()); 
            }
            // InternalGame.g:2434:3: ( RULE_ID )
            // InternalGame.g:2435:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneSceneIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getEndSceneSceneIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getEndSceneSceneCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__EndSceneAssignment_1_1"


    // $ANTLR start "rule__Adventure__IngredientsAssignment_2"
    // InternalGame.g:2446:1: rule__Adventure__IngredientsAssignment_2 : ( ruleIngredient ) ;
    public final void rule__Adventure__IngredientsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2450:1: ( ( ruleIngredient ) )
            // InternalGame.g:2451:2: ( ruleIngredient )
            {
            // InternalGame.g:2451:2: ( ruleIngredient )
            // InternalGame.g:2452:3: ruleIngredient
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getIngredientsIngredientParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getIngredientsIngredientParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__IngredientsAssignment_2"


    // $ANTLR start "rule__Scene__NameAssignment_1"
    // InternalGame.g:2461:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2465:1: ( ( RULE_ID ) )
            // InternalGame.g:2466:2: ( RULE_ID )
            {
            // InternalGame.g:2466:2: ( RULE_ID )
            // InternalGame.g:2467:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__NameAssignment_1"


    // $ANTLR start "rule__Scene__ObjectsAssignment_3_2"
    // InternalGame.g:2476:1: rule__Scene__ObjectsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__ObjectsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2480:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2481:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2481:2: ( ( RULE_ID ) )
            // InternalGame.g:2482:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_3_2_0()); 
            }
            // InternalGame.g:2483:3: ( RULE_ID )
            // InternalGame.g:2484:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_3_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ObjectsAssignment_3_2"


    // $ANTLR start "rule__Scene__ObjectsAssignment_3_3_1"
    // InternalGame.g:2495:1: rule__Scene__ObjectsAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__ObjectsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2499:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2500:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2500:2: ( ( RULE_ID ) )
            // InternalGame.g:2501:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_3_3_1_0()); 
            }
            // InternalGame.g:2502:3: ( RULE_ID )
            // InternalGame.g:2503:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_3_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_3_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_3_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ObjectsAssignment_3_3_1"


    // $ANTLR start "rule__Scene__DescriptionAssignment_5"
    // InternalGame.g:2514:1: rule__Scene__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Scene__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2518:1: ( ( RULE_STRING ) )
            // InternalGame.g:2519:2: ( RULE_STRING )
            {
            // InternalGame.g:2519:2: ( RULE_STRING )
            // InternalGame.g:2520:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__DescriptionAssignment_5"


    // $ANTLR start "rule__Scene__ActionsAssignment_6_2"
    // InternalGame.g:2529:1: rule__Scene__ActionsAssignment_6_2 : ( ruleStep ) ;
    public final void rule__Scene__ActionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2533:1: ( ( ruleStep ) )
            // InternalGame.g:2534:2: ( ruleStep )
            {
            // InternalGame.g:2534:2: ( ruleStep )
            // InternalGame.g:2535:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ActionsAssignment_6_2"


    // $ANTLR start "rule__Scene__ActionsAssignment_6_3_1"
    // InternalGame.g:2544:1: rule__Scene__ActionsAssignment_6_3_1 : ( ruleStep ) ;
    public final void rule__Scene__ActionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2548:1: ( ( ruleStep ) )
            // InternalGame.g:2549:2: ( ruleStep )
            {
            // InternalGame.g:2549:2: ( ruleStep )
            // InternalGame.g:2550:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_6_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ActionsAssignment_6_3_1"


    // $ANTLR start "rule__Character__NameAssignment_1"
    // InternalGame.g:2559:1: rule__Character__NameAssignment_1 : ( ( rule__Character__NameAlternatives_1_0 ) ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2563:1: ( ( ( rule__Character__NameAlternatives_1_0 ) ) )
            // InternalGame.g:2564:2: ( ( rule__Character__NameAlternatives_1_0 ) )
            {
            // InternalGame.g:2564:2: ( ( rule__Character__NameAlternatives_1_0 ) )
            // InternalGame.g:2565:3: ( rule__Character__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getNameAlternatives_1_0()); 
            }
            // InternalGame.g:2566:3: ( rule__Character__NameAlternatives_1_0 )
            // InternalGame.g:2566:4: rule__Character__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Character__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getNameAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__NameAssignment_1"


    // $ANTLR start "rule__Character__DescriptionAssignment_4"
    // InternalGame.g:2574:1: rule__Character__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Character__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2578:1: ( ( RULE_STRING ) )
            // InternalGame.g:2579:2: ( RULE_STRING )
            {
            // InternalGame.g:2579:2: ( RULE_STRING )
            // InternalGame.g:2580:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__DescriptionAssignment_4"


    // $ANTLR start "rule__Character__HealthPointsAssignment_6"
    // InternalGame.g:2589:1: rule__Character__HealthPointsAssignment_6 : ( RULE_INT ) ;
    public final void rule__Character__HealthPointsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2593:1: ( ( RULE_INT ) )
            // InternalGame.g:2594:2: ( RULE_INT )
            {
            // InternalGame.g:2594:2: ( RULE_INT )
            // InternalGame.g:2595:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getHealthPointsINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getHealthPointsINTTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__HealthPointsAssignment_6"


    // $ANTLR start "rule__Character__ActionsAssignment_7_2"
    // InternalGame.g:2604:1: rule__Character__ActionsAssignment_7_2 : ( ruleStep ) ;
    public final void rule__Character__ActionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2608:1: ( ( ruleStep ) )
            // InternalGame.g:2609:2: ( ruleStep )
            {
            // InternalGame.g:2609:2: ( ruleStep )
            // InternalGame.g:2610:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getActionsStepParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getActionsStepParserRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ActionsAssignment_7_2"


    // $ANTLR start "rule__Character__ActionsAssignment_7_3_1"
    // InternalGame.g:2619:1: rule__Character__ActionsAssignment_7_3_1 : ( ruleStep ) ;
    public final void rule__Character__ActionsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2623:1: ( ( ruleStep ) )
            // InternalGame.g:2624:2: ( ruleStep )
            {
            // InternalGame.g:2624:2: ( ruleStep )
            // InternalGame.g:2625:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getActionsStepParserRuleCall_7_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getActionsStepParserRuleCall_7_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ActionsAssignment_7_3_1"


    // $ANTLR start "rule__Object__NameAssignment_1"
    // InternalGame.g:2634:1: rule__Object__NameAssignment_1 : ( ( rule__Object__NameAlternatives_1_0 ) ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2638:1: ( ( ( rule__Object__NameAlternatives_1_0 ) ) )
            // InternalGame.g:2639:2: ( ( rule__Object__NameAlternatives_1_0 ) )
            {
            // InternalGame.g:2639:2: ( ( rule__Object__NameAlternatives_1_0 ) )
            // InternalGame.g:2640:3: ( rule__Object__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAlternatives_1_0()); 
            }
            // InternalGame.g:2641:3: ( rule__Object__NameAlternatives_1_0 )
            // InternalGame.g:2641:4: rule__Object__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getNameAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_1"


    // $ANTLR start "rule__Object__SuperTypeAssignment_2_2"
    // InternalGame.g:2649:1: rule__Object__SuperTypeAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Object__SuperTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2653:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2654:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2654:2: ( ( RULE_ID ) )
            // InternalGame.g:2655:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_2_0()); 
            }
            // InternalGame.g:2656:3: ( RULE_ID )
            // InternalGame.g:2657:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SuperTypeAssignment_2_2"


    // $ANTLR start "rule__Object__DescriptionAssignment_5"
    // InternalGame.g:2668:1: rule__Object__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Object__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2672:1: ( ( RULE_STRING ) )
            // InternalGame.g:2673:2: ( RULE_STRING )
            {
            // InternalGame.g:2673:2: ( RULE_STRING )
            // InternalGame.g:2674:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__DescriptionAssignment_5"


    // $ANTLR start "rule__Object__HealthPointsAssignment_7"
    // InternalGame.g:2683:1: rule__Object__HealthPointsAssignment_7 : ( RULE_INT ) ;
    public final void rule__Object__HealthPointsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2687:1: ( ( RULE_INT ) )
            // InternalGame.g:2688:2: ( RULE_INT )
            {
            // InternalGame.g:2688:2: ( RULE_INT )
            // InternalGame.g:2689:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getHealthPointsINTTerminalRuleCall_7_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getHealthPointsINTTerminalRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__HealthPointsAssignment_7"


    // $ANTLR start "rule__Object__ActionsAssignment_8_2"
    // InternalGame.g:2698:1: rule__Object__ActionsAssignment_8_2 : ( ruleAction ) ;
    public final void rule__Object__ActionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2702:1: ( ( ruleAction ) )
            // InternalGame.g:2703:2: ( ruleAction )
            {
            // InternalGame.g:2703:2: ( ruleAction )
            // InternalGame.g:2704:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getActionsActionEnumRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getActionsActionEnumRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ActionsAssignment_8_2"


    // $ANTLR start "rule__Object__ActionsAssignment_8_3_1"
    // InternalGame.g:2713:1: rule__Object__ActionsAssignment_8_3_1 : ( ruleAction ) ;
    public final void rule__Object__ActionsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2717:1: ( ( ruleAction ) )
            // InternalGame.g:2718:2: ( ruleAction )
            {
            // InternalGame.g:2718:2: ( ruleAction )
            // InternalGame.g:2719:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getActionsActionEnumRuleCall_8_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getActionsActionEnumRuleCall_8_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ActionsAssignment_8_3_1"


    // $ANTLR start "rule__Step__ActionAssignment_2"
    // InternalGame.g:2728:1: rule__Step__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Step__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2732:1: ( ( ruleAction ) )
            // InternalGame.g:2733:2: ( ruleAction )
            {
            // InternalGame.g:2733:2: ( ruleAction )
            // InternalGame.g:2734:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getActionActionEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getActionActionEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ActionAssignment_2"


    // $ANTLR start "rule__Step__TargetObjectAssignment_3"
    // InternalGame.g:2743:1: rule__Step__TargetObjectAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Step__TargetObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2747:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2748:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2748:2: ( ( RULE_ID ) )
            // InternalGame.g:2749:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_3_0()); 
            }
            // InternalGame.g:2750:3: ( RULE_ID )
            // InternalGame.g:2751:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectObjectIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTargetObjectObjectIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TargetObjectAssignment_3"


    // $ANTLR start "rule__Step__ValidAssignment_5_1"
    // InternalGame.g:2762:1: rule__Step__ValidAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Step__ValidAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2766:1: ( ( RULE_STRING ) )
            // InternalGame.g:2767:2: ( RULE_STRING )
            {
            // InternalGame.g:2767:2: ( RULE_STRING )
            // InternalGame.g:2768:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ValidAssignment_5_1"


    // $ANTLR start "rule__Step__SceneAssignment_7"
    // InternalGame.g:2777:1: rule__Step__SceneAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Step__SceneAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2781:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2782:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2782:2: ( ( RULE_ID ) )
            // InternalGame.g:2783:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneSceneCrossReference_7_0()); 
            }
            // InternalGame.g:2784:3: ( RULE_ID )
            // InternalGame.g:2785:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneSceneCrossReference_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__SceneAssignment_7"

    // $ANTLR start synpred1_InternalGame
    public final void synpred1_InternalGame_fragment() throws RecognitionException {   
        // InternalGame.g:2358:8: ( rule__Adventure__IngredientsAssignment_2 )
        // InternalGame.g:2358:9: rule__Adventure__IngredientsAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Adventure__IngredientsAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGame

    // Delegated rules

    public final boolean synpred1_InternalGame() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGame_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\154\uffff";
    static final String dfa_2s = "\1\1\153\uffff";
    static final String dfa_3s = "\1\17\1\uffff\1\5\2\4\5\22\1\23\1\36\2\23\1\26\1\4\1\5\2\4\1\5\1\24\1\22\2\33\1\27\1\26\1\0\2\6\1\5\1\23\1\37\1\uffff\2\24\1\27\1\22\1\26\1\0\1\26\1\0\2\13\1\37\4\5\4\27\1\22\1\40\1\13\1\24\1\13\1\42\4\27\4\5\1\4\1\40\1\41\1\42\1\5\1\4\1\24\1\41\1\27\1\5\1\37\2\24\1\22\1\27\1\13\1\37\1\24\4\5\1\22\1\40\1\13\1\42\4\5\1\4\1\40\1\41\1\42\1\5\1\4\1\24\1\41\1\27\1\5\1\24\1\27";
    static final String dfa_4s = "\1\34\1\uffff\3\5\1\22\2\35\2\22\1\25\1\36\2\23\1\26\1\4\1\5\2\4\1\5\1\31\1\22\2\33\1\30\1\26\1\0\2\6\1\5\1\23\1\37\1\uffff\2\31\1\30\1\22\1\26\1\0\1\26\1\0\2\16\1\37\4\5\4\30\1\22\1\40\1\16\1\24\1\16\1\42\4\30\4\5\1\4\1\40\1\41\1\42\1\5\1\4\1\24\1\41\1\30\1\5\1\37\2\24\1\22\1\30\1\16\1\37\1\24\4\5\1\22\1\40\1\16\1\42\4\5\1\4\1\40\1\41\1\42\1\5\1\4\1\24\1\41\1\30\1\5\1\24\1\30";
    static final String dfa_5s = "\1\uffff\1\2\36\uffff\1\1\113\uffff";
    static final String dfa_6s = "\32\uffff\1\0\13\uffff\1\1\1\uffff\1\2\103\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\10\uffff\1\4\1\uffff\1\3",
            "",
            "\1\5",
            "\1\6\1\7",
            "\1\10\1\11",
            "\1\12",
            "\1\14\12\uffff\1\13",
            "\1\14\12\uffff\1\13",
            "\1\15",
            "\1\15",
            "\1\17\1\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\32\4\uffff\1\31",
            "\1\14",
            "\1\33",
            "\1\34",
            "\1\36\1\35",
            "\1\37",
            "\1\uffff",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\17",
            "\1\44",
            "",
            "\1\46\4\uffff\1\45",
            "\1\50\4\uffff\1\47",
            "\1\36\1\35",
            "\1\51",
            "\1\52",
            "\1\uffff",
            "\1\53",
            "\1\uffff",
            "\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\70",
            "\1\71",
            "\1\72\1\73\1\74\1\75",
            "\1\46",
            "\1\76\1\77\1\100\1\101",
            "\1\102",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\1\114",
            "\1\116",
            "\1\117",
            "\1\32",
            "\1\120",
            "\1\121",
            "\1\123\1\122",
            "\1\124\1\125\1\126\1\127",
            "\1\130",
            "\1\50",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\1\135\1\136\1\137",
            "\1\140",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\115\1\114",
            "\1\152",
            "\1\153",
            "\1\123\1\122"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2358:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_26 = input.LA(1);

                         
                        int index14_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_26);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_38 = input.LA(1);

                         
                        int index14_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_38);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_40 = input.LA(1);

                         
                        int index14_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_40);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000014020002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000014038002L});

}
