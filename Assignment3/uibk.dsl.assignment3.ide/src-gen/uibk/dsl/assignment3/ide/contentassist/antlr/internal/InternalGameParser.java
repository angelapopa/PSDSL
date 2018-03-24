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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jump over'", "'pick up'", "'walk through'", "'attack'", "'start'", "'end'", "'name'", "'HP'", "'scene'", "'description'", "'objects'", "'('", "')'", "','", "'actions'", "'object'", "'{'", "'extends'", "'if'", "'then'", "'valid'"
    };
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleHero"
    // InternalGame.g:103:1: entryRuleHero : ruleHero EOF ;
    public final void entryRuleHero() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleHero EOF )
            // InternalGame.g:105:1: ruleHero EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHero();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroRule()); 
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
    // $ANTLR end "entryRuleHero"


    // $ANTLR start "ruleHero"
    // InternalGame.g:112:1: ruleHero : ( ( rule__Hero__Group__0 ) ) ;
    public final void ruleHero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Hero__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__Hero__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__Hero__Group__0 ) )
            // InternalGame.g:118:3: ( rule__Hero__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getGroup()); 
            }
            // InternalGame.g:119:3: ( rule__Hero__Group__0 )
            // InternalGame.g:119:4: rule__Hero__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hero__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getGroup()); 
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
    // $ANTLR end "ruleHero"


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:128:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleScene EOF )
            // InternalGame.g:130:1: ruleScene EOF
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
    // InternalGame.g:137:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__Scene__Group__0 ) )
            // InternalGame.g:143:3: ( rule__Scene__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup()); 
            }
            // InternalGame.g:144:3: ( rule__Scene__Group__0 )
            // InternalGame.g:144:4: rule__Scene__Group__0
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
    // InternalGame.g:218:1: rule__Ingredient__Alternatives : ( ( ruleScene ) | ( ruleObject ) | ( ruleHero ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:222:1: ( ( ruleScene ) | ( ruleObject ) | ( ruleHero ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 17:
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
                    // InternalGame.g:235:2: ( ruleHero )
                    {
                    // InternalGame.g:235:2: ( ruleHero )
                    // InternalGame.g:236:3: ruleHero
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIngredientAccess().getHeroParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHero();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIngredientAccess().getHeroParserRuleCall_2()); 
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


    // $ANTLR start "rule__Object__NameAlternatives_1_0"
    // InternalGame.g:245:1: rule__Object__NameAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Object__NameAlternatives_1_0() throws RecognitionException {

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
                    // InternalGame.g:256:2: ( RULE_ID )
                    {
                    // InternalGame.g:256:2: ( RULE_ID )
                    // InternalGame.g:257:3: RULE_ID
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
    // InternalGame.g:266:1: rule__Action__Alternatives : ( ( ( 'jump over' ) ) | ( ( 'pick up' ) ) | ( ( 'walk through' ) ) | ( ( 'attack' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:270:1: ( ( ( 'jump over' ) ) | ( ( 'pick up' ) ) | ( ( 'walk through' ) ) | ( ( 'attack' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGame.g:271:2: ( ( 'jump over' ) )
                    {
                    // InternalGame.g:271:2: ( ( 'jump over' ) )
                    // InternalGame.g:272:3: ( 'jump over' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getJUMPEnumLiteralDeclaration_0()); 
                    }
                    // InternalGame.g:273:3: ( 'jump over' )
                    // InternalGame.g:273:4: 'jump over'
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
                    // InternalGame.g:277:2: ( ( 'pick up' ) )
                    {
                    // InternalGame.g:277:2: ( ( 'pick up' ) )
                    // InternalGame.g:278:3: ( 'pick up' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1()); 
                    }
                    // InternalGame.g:279:3: ( 'pick up' )
                    // InternalGame.g:279:4: 'pick up'
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
                    // InternalGame.g:283:2: ( ( 'walk through' ) )
                    {
                    // InternalGame.g:283:2: ( ( 'walk through' ) )
                    // InternalGame.g:284:3: ( 'walk through' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getWALKEnumLiteralDeclaration_2()); 
                    }
                    // InternalGame.g:285:3: ( 'walk through' )
                    // InternalGame.g:285:4: 'walk through'
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
                    // InternalGame.g:289:2: ( ( 'attack' ) )
                    {
                    // InternalGame.g:289:2: ( ( 'attack' ) )
                    // InternalGame.g:290:3: ( 'attack' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getATTACKEnumLiteralDeclaration_3()); 
                    }
                    // InternalGame.g:291:3: ( 'attack' )
                    // InternalGame.g:291:4: 'attack'
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
    // InternalGame.g:299:1: rule__Adventure__Group_0__0 : rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1 ;
    public final void rule__Adventure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:303:1: ( rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1 )
            // InternalGame.g:304:2: rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1
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
    // InternalGame.g:311:1: rule__Adventure__Group_0__0__Impl : ( 'start' ) ;
    public final void rule__Adventure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:315:1: ( ( 'start' ) )
            // InternalGame.g:316:1: ( 'start' )
            {
            // InternalGame.g:316:1: ( 'start' )
            // InternalGame.g:317:2: 'start'
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
    // InternalGame.g:326:1: rule__Adventure__Group_0__1 : rule__Adventure__Group_0__1__Impl ;
    public final void rule__Adventure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:330:1: ( rule__Adventure__Group_0__1__Impl )
            // InternalGame.g:331:2: rule__Adventure__Group_0__1__Impl
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
    // InternalGame.g:337:1: rule__Adventure__Group_0__1__Impl : ( ( rule__Adventure__StartSceneAssignment_0_1 ) ) ;
    public final void rule__Adventure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:1: ( ( ( rule__Adventure__StartSceneAssignment_0_1 ) ) )
            // InternalGame.g:342:1: ( ( rule__Adventure__StartSceneAssignment_0_1 ) )
            {
            // InternalGame.g:342:1: ( ( rule__Adventure__StartSceneAssignment_0_1 ) )
            // InternalGame.g:343:2: ( rule__Adventure__StartSceneAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneAssignment_0_1()); 
            }
            // InternalGame.g:344:2: ( rule__Adventure__StartSceneAssignment_0_1 )
            // InternalGame.g:344:3: rule__Adventure__StartSceneAssignment_0_1
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
    // InternalGame.g:353:1: rule__Adventure__Group_1__0 : rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1 ;
    public final void rule__Adventure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:357:1: ( rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1 )
            // InternalGame.g:358:2: rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1
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
    // InternalGame.g:365:1: rule__Adventure__Group_1__0__Impl : ( 'end' ) ;
    public final void rule__Adventure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:369:1: ( ( 'end' ) )
            // InternalGame.g:370:1: ( 'end' )
            {
            // InternalGame.g:370:1: ( 'end' )
            // InternalGame.g:371:2: 'end'
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
    // InternalGame.g:380:1: rule__Adventure__Group_1__1 : rule__Adventure__Group_1__1__Impl ;
    public final void rule__Adventure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:384:1: ( rule__Adventure__Group_1__1__Impl )
            // InternalGame.g:385:2: rule__Adventure__Group_1__1__Impl
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
    // InternalGame.g:391:1: rule__Adventure__Group_1__1__Impl : ( ( rule__Adventure__EndSceneAssignment_1_1 ) ) ;
    public final void rule__Adventure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:395:1: ( ( ( rule__Adventure__EndSceneAssignment_1_1 ) ) )
            // InternalGame.g:396:1: ( ( rule__Adventure__EndSceneAssignment_1_1 ) )
            {
            // InternalGame.g:396:1: ( ( rule__Adventure__EndSceneAssignment_1_1 ) )
            // InternalGame.g:397:2: ( rule__Adventure__EndSceneAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneAssignment_1_1()); 
            }
            // InternalGame.g:398:2: ( rule__Adventure__EndSceneAssignment_1_1 )
            // InternalGame.g:398:3: rule__Adventure__EndSceneAssignment_1_1
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


    // $ANTLR start "rule__Hero__Group__0"
    // InternalGame.g:407:1: rule__Hero__Group__0 : rule__Hero__Group__0__Impl rule__Hero__Group__1 ;
    public final void rule__Hero__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:411:1: ( rule__Hero__Group__0__Impl rule__Hero__Group__1 )
            // InternalGame.g:412:2: rule__Hero__Group__0__Impl rule__Hero__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Hero__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Hero__Group__1();

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
    // $ANTLR end "rule__Hero__Group__0"


    // $ANTLR start "rule__Hero__Group__0__Impl"
    // InternalGame.g:419:1: rule__Hero__Group__0__Impl : ( 'name' ) ;
    public final void rule__Hero__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:423:1: ( ( 'name' ) )
            // InternalGame.g:424:1: ( 'name' )
            {
            // InternalGame.g:424:1: ( 'name' )
            // InternalGame.g:425:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getNameKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getNameKeyword_0()); 
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
    // $ANTLR end "rule__Hero__Group__0__Impl"


    // $ANTLR start "rule__Hero__Group__1"
    // InternalGame.g:434:1: rule__Hero__Group__1 : rule__Hero__Group__1__Impl rule__Hero__Group__2 ;
    public final void rule__Hero__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:438:1: ( rule__Hero__Group__1__Impl rule__Hero__Group__2 )
            // InternalGame.g:439:2: rule__Hero__Group__1__Impl rule__Hero__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Hero__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Hero__Group__2();

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
    // $ANTLR end "rule__Hero__Group__1"


    // $ANTLR start "rule__Hero__Group__1__Impl"
    // InternalGame.g:446:1: rule__Hero__Group__1__Impl : ( ( rule__Hero__NameAssignment_1 ) ) ;
    public final void rule__Hero__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:450:1: ( ( ( rule__Hero__NameAssignment_1 ) ) )
            // InternalGame.g:451:1: ( ( rule__Hero__NameAssignment_1 ) )
            {
            // InternalGame.g:451:1: ( ( rule__Hero__NameAssignment_1 ) )
            // InternalGame.g:452:2: ( rule__Hero__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:453:2: ( rule__Hero__NameAssignment_1 )
            // InternalGame.g:453:3: rule__Hero__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hero__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Hero__Group__1__Impl"


    // $ANTLR start "rule__Hero__Group__2"
    // InternalGame.g:461:1: rule__Hero__Group__2 : rule__Hero__Group__2__Impl rule__Hero__Group__3 ;
    public final void rule__Hero__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:465:1: ( rule__Hero__Group__2__Impl rule__Hero__Group__3 )
            // InternalGame.g:466:2: rule__Hero__Group__2__Impl rule__Hero__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Hero__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Hero__Group__3();

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
    // $ANTLR end "rule__Hero__Group__2"


    // $ANTLR start "rule__Hero__Group__2__Impl"
    // InternalGame.g:473:1: rule__Hero__Group__2__Impl : ( 'HP' ) ;
    public final void rule__Hero__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:477:1: ( ( 'HP' ) )
            // InternalGame.g:478:1: ( 'HP' )
            {
            // InternalGame.g:478:1: ( 'HP' )
            // InternalGame.g:479:2: 'HP'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getHPKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getHPKeyword_2()); 
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
    // $ANTLR end "rule__Hero__Group__2__Impl"


    // $ANTLR start "rule__Hero__Group__3"
    // InternalGame.g:488:1: rule__Hero__Group__3 : rule__Hero__Group__3__Impl ;
    public final void rule__Hero__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:492:1: ( rule__Hero__Group__3__Impl )
            // InternalGame.g:493:2: rule__Hero__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hero__Group__3__Impl();

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
    // $ANTLR end "rule__Hero__Group__3"


    // $ANTLR start "rule__Hero__Group__3__Impl"
    // InternalGame.g:499:1: rule__Hero__Group__3__Impl : ( ( rule__Hero__HealthPointsAssignment_3 ) ) ;
    public final void rule__Hero__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:503:1: ( ( ( rule__Hero__HealthPointsAssignment_3 ) ) )
            // InternalGame.g:504:1: ( ( rule__Hero__HealthPointsAssignment_3 ) )
            {
            // InternalGame.g:504:1: ( ( rule__Hero__HealthPointsAssignment_3 ) )
            // InternalGame.g:505:2: ( rule__Hero__HealthPointsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getHealthPointsAssignment_3()); 
            }
            // InternalGame.g:506:2: ( rule__Hero__HealthPointsAssignment_3 )
            // InternalGame.g:506:3: rule__Hero__HealthPointsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Hero__HealthPointsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getHealthPointsAssignment_3()); 
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
    // $ANTLR end "rule__Hero__Group__3__Impl"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalGame.g:515:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:519:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:520:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalGame.g:527:1: rule__Scene__Group__0__Impl : ( 'scene' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:531:1: ( ( 'scene' ) )
            // InternalGame.g:532:1: ( 'scene' )
            {
            // InternalGame.g:532:1: ( 'scene' )
            // InternalGame.g:533:2: 'scene'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getSceneKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:542:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:546:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:547:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:554:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:558:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:559:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:559:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:560:2: ( rule__Scene__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:561:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:561:3: rule__Scene__NameAssignment_1
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
    // InternalGame.g:569:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:573:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:574:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:581:1: rule__Scene__Group__2__Impl : ( ( rule__Scene__Group_2__0 )? ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:585:1: ( ( ( rule__Scene__Group_2__0 )? ) )
            // InternalGame.g:586:1: ( ( rule__Scene__Group_2__0 )? )
            {
            // InternalGame.g:586:1: ( ( rule__Scene__Group_2__0 )? )
            // InternalGame.g:587:2: ( rule__Scene__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_2()); 
            }
            // InternalGame.g:588:2: ( rule__Scene__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:588:3: rule__Scene__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scene__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_2()); 
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
    // InternalGame.g:596:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:600:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:601:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:608:1: rule__Scene__Group__3__Impl : ( 'description' ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:612:1: ( ( 'description' ) )
            // InternalGame.g:613:1: ( 'description' )
            {
            // InternalGame.g:613:1: ( 'description' )
            // InternalGame.g:614:2: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getDescriptionKeyword_3()); 
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
    // InternalGame.g:623:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:627:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:628:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:635:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__DescriptionAssignment_4 ) ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:639:1: ( ( ( rule__Scene__DescriptionAssignment_4 ) ) )
            // InternalGame.g:640:1: ( ( rule__Scene__DescriptionAssignment_4 ) )
            {
            // InternalGame.g:640:1: ( ( rule__Scene__DescriptionAssignment_4 ) )
            // InternalGame.g:641:2: ( rule__Scene__DescriptionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionAssignment_4()); 
            }
            // InternalGame.g:642:2: ( rule__Scene__DescriptionAssignment_4 )
            // InternalGame.g:642:3: rule__Scene__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Scene__DescriptionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getDescriptionAssignment_4()); 
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
    // InternalGame.g:650:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:654:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:655:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
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
    // InternalGame.g:662:1: rule__Scene__Group__5__Impl : ( ( rule__Scene__Group_5__0 )? ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:666:1: ( ( ( rule__Scene__Group_5__0 )? ) )
            // InternalGame.g:667:1: ( ( rule__Scene__Group_5__0 )? )
            {
            // InternalGame.g:667:1: ( ( rule__Scene__Group_5__0 )? )
            // InternalGame.g:668:2: ( rule__Scene__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_5()); 
            }
            // InternalGame.g:669:2: ( rule__Scene__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:669:3: rule__Scene__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scene__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_5()); 
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
    // InternalGame.g:677:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:681:1: ( rule__Scene__Group__6__Impl )
            // InternalGame.g:682:2: rule__Scene__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__6__Impl();

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
    // InternalGame.g:688:1: rule__Scene__Group__6__Impl : ( 'end' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:692:1: ( ( 'end' ) )
            // InternalGame.g:693:1: ( 'end' )
            {
            // InternalGame.g:693:1: ( 'end' )
            // InternalGame.g:694:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getEndKeyword_6()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getEndKeyword_6()); 
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


    // $ANTLR start "rule__Scene__Group_2__0"
    // InternalGame.g:704:1: rule__Scene__Group_2__0 : rule__Scene__Group_2__0__Impl rule__Scene__Group_2__1 ;
    public final void rule__Scene__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:708:1: ( rule__Scene__Group_2__0__Impl rule__Scene__Group_2__1 )
            // InternalGame.g:709:2: rule__Scene__Group_2__0__Impl rule__Scene__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2__1();

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
    // $ANTLR end "rule__Scene__Group_2__0"


    // $ANTLR start "rule__Scene__Group_2__0__Impl"
    // InternalGame.g:716:1: rule__Scene__Group_2__0__Impl : ( 'objects' ) ;
    public final void rule__Scene__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:720:1: ( ( 'objects' ) )
            // InternalGame.g:721:1: ( 'objects' )
            {
            // InternalGame.g:721:1: ( 'objects' )
            // InternalGame.g:722:2: 'objects'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsKeyword_2_0()); 
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
    // $ANTLR end "rule__Scene__Group_2__0__Impl"


    // $ANTLR start "rule__Scene__Group_2__1"
    // InternalGame.g:731:1: rule__Scene__Group_2__1 : rule__Scene__Group_2__1__Impl rule__Scene__Group_2__2 ;
    public final void rule__Scene__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:735:1: ( rule__Scene__Group_2__1__Impl rule__Scene__Group_2__2 )
            // InternalGame.g:736:2: rule__Scene__Group_2__1__Impl rule__Scene__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2__2();

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
    // $ANTLR end "rule__Scene__Group_2__1"


    // $ANTLR start "rule__Scene__Group_2__1__Impl"
    // InternalGame.g:743:1: rule__Scene__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Scene__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:747:1: ( ( '(' ) )
            // InternalGame.g:748:1: ( '(' )
            {
            // InternalGame.g:748:1: ( '(' )
            // InternalGame.g:749:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_2_1()); 
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
    // $ANTLR end "rule__Scene__Group_2__1__Impl"


    // $ANTLR start "rule__Scene__Group_2__2"
    // InternalGame.g:758:1: rule__Scene__Group_2__2 : rule__Scene__Group_2__2__Impl rule__Scene__Group_2__3 ;
    public final void rule__Scene__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:762:1: ( rule__Scene__Group_2__2__Impl rule__Scene__Group_2__3 )
            // InternalGame.g:763:2: rule__Scene__Group_2__2__Impl rule__Scene__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2__3();

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
    // $ANTLR end "rule__Scene__Group_2__2"


    // $ANTLR start "rule__Scene__Group_2__2__Impl"
    // InternalGame.g:770:1: rule__Scene__Group_2__2__Impl : ( ( rule__Scene__ObjectsAssignment_2_2 ) ) ;
    public final void rule__Scene__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:774:1: ( ( ( rule__Scene__ObjectsAssignment_2_2 ) ) )
            // InternalGame.g:775:1: ( ( rule__Scene__ObjectsAssignment_2_2 ) )
            {
            // InternalGame.g:775:1: ( ( rule__Scene__ObjectsAssignment_2_2 ) )
            // InternalGame.g:776:2: ( rule__Scene__ObjectsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsAssignment_2_2()); 
            }
            // InternalGame.g:777:2: ( rule__Scene__ObjectsAssignment_2_2 )
            // InternalGame.g:777:3: rule__Scene__ObjectsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ObjectsAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsAssignment_2_2()); 
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
    // $ANTLR end "rule__Scene__Group_2__2__Impl"


    // $ANTLR start "rule__Scene__Group_2__3"
    // InternalGame.g:785:1: rule__Scene__Group_2__3 : rule__Scene__Group_2__3__Impl rule__Scene__Group_2__4 ;
    public final void rule__Scene__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:789:1: ( rule__Scene__Group_2__3__Impl rule__Scene__Group_2__4 )
            // InternalGame.g:790:2: rule__Scene__Group_2__3__Impl rule__Scene__Group_2__4
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2__4();

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
    // $ANTLR end "rule__Scene__Group_2__3"


    // $ANTLR start "rule__Scene__Group_2__3__Impl"
    // InternalGame.g:797:1: rule__Scene__Group_2__3__Impl : ( ( rule__Scene__Group_2_3__0 )* ) ;
    public final void rule__Scene__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:801:1: ( ( ( rule__Scene__Group_2_3__0 )* ) )
            // InternalGame.g:802:1: ( ( rule__Scene__Group_2_3__0 )* )
            {
            // InternalGame.g:802:1: ( ( rule__Scene__Group_2_3__0 )* )
            // InternalGame.g:803:2: ( rule__Scene__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_2_3()); 
            }
            // InternalGame.g:804:2: ( rule__Scene__Group_2_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:804:3: rule__Scene__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scene__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_2_3()); 
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
    // $ANTLR end "rule__Scene__Group_2__3__Impl"


    // $ANTLR start "rule__Scene__Group_2__4"
    // InternalGame.g:812:1: rule__Scene__Group_2__4 : rule__Scene__Group_2__4__Impl ;
    public final void rule__Scene__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:816:1: ( rule__Scene__Group_2__4__Impl )
            // InternalGame.g:817:2: rule__Scene__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2__4__Impl();

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
    // $ANTLR end "rule__Scene__Group_2__4"


    // $ANTLR start "rule__Scene__Group_2__4__Impl"
    // InternalGame.g:823:1: rule__Scene__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Scene__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:827:1: ( ( ')' ) )
            // InternalGame.g:828:1: ( ')' )
            {
            // InternalGame.g:828:1: ( ')' )
            // InternalGame.g:829:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getRightParenthesisKeyword_2_4()); 
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
    // $ANTLR end "rule__Scene__Group_2__4__Impl"


    // $ANTLR start "rule__Scene__Group_2_3__0"
    // InternalGame.g:839:1: rule__Scene__Group_2_3__0 : rule__Scene__Group_2_3__0__Impl rule__Scene__Group_2_3__1 ;
    public final void rule__Scene__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:843:1: ( rule__Scene__Group_2_3__0__Impl rule__Scene__Group_2_3__1 )
            // InternalGame.g:844:2: rule__Scene__Group_2_3__0__Impl rule__Scene__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2_3__1();

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
    // $ANTLR end "rule__Scene__Group_2_3__0"


    // $ANTLR start "rule__Scene__Group_2_3__0__Impl"
    // InternalGame.g:851:1: rule__Scene__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Scene__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:855:1: ( ( ',' ) )
            // InternalGame.g:856:1: ( ',' )
            {
            // InternalGame.g:856:1: ( ',' )
            // InternalGame.g:857:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getCommaKeyword_2_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getCommaKeyword_2_3_0()); 
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
    // $ANTLR end "rule__Scene__Group_2_3__0__Impl"


    // $ANTLR start "rule__Scene__Group_2_3__1"
    // InternalGame.g:866:1: rule__Scene__Group_2_3__1 : rule__Scene__Group_2_3__1__Impl ;
    public final void rule__Scene__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:870:1: ( rule__Scene__Group_2_3__1__Impl )
            // InternalGame.g:871:2: rule__Scene__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Scene__Group_2_3__1"


    // $ANTLR start "rule__Scene__Group_2_3__1__Impl"
    // InternalGame.g:877:1: rule__Scene__Group_2_3__1__Impl : ( ( rule__Scene__ObjectsAssignment_2_3_1 ) ) ;
    public final void rule__Scene__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:881:1: ( ( ( rule__Scene__ObjectsAssignment_2_3_1 ) ) )
            // InternalGame.g:882:1: ( ( rule__Scene__ObjectsAssignment_2_3_1 ) )
            {
            // InternalGame.g:882:1: ( ( rule__Scene__ObjectsAssignment_2_3_1 ) )
            // InternalGame.g:883:2: ( rule__Scene__ObjectsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsAssignment_2_3_1()); 
            }
            // InternalGame.g:884:2: ( rule__Scene__ObjectsAssignment_2_3_1 )
            // InternalGame.g:884:3: rule__Scene__ObjectsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ObjectsAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsAssignment_2_3_1()); 
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
    // $ANTLR end "rule__Scene__Group_2_3__1__Impl"


    // $ANTLR start "rule__Scene__Group_5__0"
    // InternalGame.g:893:1: rule__Scene__Group_5__0 : rule__Scene__Group_5__0__Impl rule__Scene__Group_5__1 ;
    public final void rule__Scene__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:897:1: ( rule__Scene__Group_5__0__Impl rule__Scene__Group_5__1 )
            // InternalGame.g:898:2: rule__Scene__Group_5__0__Impl rule__Scene__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5__1();

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
    // $ANTLR end "rule__Scene__Group_5__0"


    // $ANTLR start "rule__Scene__Group_5__0__Impl"
    // InternalGame.g:905:1: rule__Scene__Group_5__0__Impl : ( 'actions' ) ;
    public final void rule__Scene__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:909:1: ( ( 'actions' ) )
            // InternalGame.g:910:1: ( 'actions' )
            {
            // InternalGame.g:910:1: ( 'actions' )
            // InternalGame.g:911:2: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsKeyword_5_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsKeyword_5_0()); 
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
    // $ANTLR end "rule__Scene__Group_5__0__Impl"


    // $ANTLR start "rule__Scene__Group_5__1"
    // InternalGame.g:920:1: rule__Scene__Group_5__1 : rule__Scene__Group_5__1__Impl rule__Scene__Group_5__2 ;
    public final void rule__Scene__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:924:1: ( rule__Scene__Group_5__1__Impl rule__Scene__Group_5__2 )
            // InternalGame.g:925:2: rule__Scene__Group_5__1__Impl rule__Scene__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5__2();

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
    // $ANTLR end "rule__Scene__Group_5__1"


    // $ANTLR start "rule__Scene__Group_5__1__Impl"
    // InternalGame.g:932:1: rule__Scene__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Scene__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:936:1: ( ( '(' ) )
            // InternalGame.g:937:1: ( '(' )
            {
            // InternalGame.g:937:1: ( '(' )
            // InternalGame.g:938:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_5_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getLeftParenthesisKeyword_5_1()); 
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
    // $ANTLR end "rule__Scene__Group_5__1__Impl"


    // $ANTLR start "rule__Scene__Group_5__2"
    // InternalGame.g:947:1: rule__Scene__Group_5__2 : rule__Scene__Group_5__2__Impl rule__Scene__Group_5__3 ;
    public final void rule__Scene__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:951:1: ( rule__Scene__Group_5__2__Impl rule__Scene__Group_5__3 )
            // InternalGame.g:952:2: rule__Scene__Group_5__2__Impl rule__Scene__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5__3();

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
    // $ANTLR end "rule__Scene__Group_5__2"


    // $ANTLR start "rule__Scene__Group_5__2__Impl"
    // InternalGame.g:959:1: rule__Scene__Group_5__2__Impl : ( ( rule__Scene__ActionsAssignment_5_2 ) ) ;
    public final void rule__Scene__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:963:1: ( ( ( rule__Scene__ActionsAssignment_5_2 ) ) )
            // InternalGame.g:964:1: ( ( rule__Scene__ActionsAssignment_5_2 ) )
            {
            // InternalGame.g:964:1: ( ( rule__Scene__ActionsAssignment_5_2 ) )
            // InternalGame.g:965:2: ( rule__Scene__ActionsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsAssignment_5_2()); 
            }
            // InternalGame.g:966:2: ( rule__Scene__ActionsAssignment_5_2 )
            // InternalGame.g:966:3: rule__Scene__ActionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ActionsAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsAssignment_5_2()); 
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
    // $ANTLR end "rule__Scene__Group_5__2__Impl"


    // $ANTLR start "rule__Scene__Group_5__3"
    // InternalGame.g:974:1: rule__Scene__Group_5__3 : rule__Scene__Group_5__3__Impl rule__Scene__Group_5__4 ;
    public final void rule__Scene__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:978:1: ( rule__Scene__Group_5__3__Impl rule__Scene__Group_5__4 )
            // InternalGame.g:979:2: rule__Scene__Group_5__3__Impl rule__Scene__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5__4();

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
    // $ANTLR end "rule__Scene__Group_5__3"


    // $ANTLR start "rule__Scene__Group_5__3__Impl"
    // InternalGame.g:986:1: rule__Scene__Group_5__3__Impl : ( ( rule__Scene__Group_5_3__0 )* ) ;
    public final void rule__Scene__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:990:1: ( ( ( rule__Scene__Group_5_3__0 )* ) )
            // InternalGame.g:991:1: ( ( rule__Scene__Group_5_3__0 )* )
            {
            // InternalGame.g:991:1: ( ( rule__Scene__Group_5_3__0 )* )
            // InternalGame.g:992:2: ( rule__Scene__Group_5_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_5_3()); 
            }
            // InternalGame.g:993:2: ( rule__Scene__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:993:3: rule__Scene__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scene__Group_5_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getGroup_5_3()); 
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
    // $ANTLR end "rule__Scene__Group_5__3__Impl"


    // $ANTLR start "rule__Scene__Group_5__4"
    // InternalGame.g:1001:1: rule__Scene__Group_5__4 : rule__Scene__Group_5__4__Impl ;
    public final void rule__Scene__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1005:1: ( rule__Scene__Group_5__4__Impl )
            // InternalGame.g:1006:2: rule__Scene__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5__4__Impl();

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
    // $ANTLR end "rule__Scene__Group_5__4"


    // $ANTLR start "rule__Scene__Group_5__4__Impl"
    // InternalGame.g:1012:1: rule__Scene__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Scene__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1016:1: ( ( ')' ) )
            // InternalGame.g:1017:1: ( ')' )
            {
            // InternalGame.g:1017:1: ( ')' )
            // InternalGame.g:1018:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getRightParenthesisKeyword_5_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getRightParenthesisKeyword_5_4()); 
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
    // $ANTLR end "rule__Scene__Group_5__4__Impl"


    // $ANTLR start "rule__Scene__Group_5_3__0"
    // InternalGame.g:1028:1: rule__Scene__Group_5_3__0 : rule__Scene__Group_5_3__0__Impl rule__Scene__Group_5_3__1 ;
    public final void rule__Scene__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1032:1: ( rule__Scene__Group_5_3__0__Impl rule__Scene__Group_5_3__1 )
            // InternalGame.g:1033:2: rule__Scene__Group_5_3__0__Impl rule__Scene__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5_3__1();

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
    // $ANTLR end "rule__Scene__Group_5_3__0"


    // $ANTLR start "rule__Scene__Group_5_3__0__Impl"
    // InternalGame.g:1040:1: rule__Scene__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Scene__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1044:1: ( ( ',' ) )
            // InternalGame.g:1045:1: ( ',' )
            {
            // InternalGame.g:1045:1: ( ',' )
            // InternalGame.g:1046:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getCommaKeyword_5_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getCommaKeyword_5_3_0()); 
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
    // $ANTLR end "rule__Scene__Group_5_3__0__Impl"


    // $ANTLR start "rule__Scene__Group_5_3__1"
    // InternalGame.g:1055:1: rule__Scene__Group_5_3__1 : rule__Scene__Group_5_3__1__Impl ;
    public final void rule__Scene__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1059:1: ( rule__Scene__Group_5_3__1__Impl )
            // InternalGame.g:1060:2: rule__Scene__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Scene__Group_5_3__1"


    // $ANTLR start "rule__Scene__Group_5_3__1__Impl"
    // InternalGame.g:1066:1: rule__Scene__Group_5_3__1__Impl : ( ( rule__Scene__ActionsAssignment_5_3_1 ) ) ;
    public final void rule__Scene__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1070:1: ( ( ( rule__Scene__ActionsAssignment_5_3_1 ) ) )
            // InternalGame.g:1071:1: ( ( rule__Scene__ActionsAssignment_5_3_1 ) )
            {
            // InternalGame.g:1071:1: ( ( rule__Scene__ActionsAssignment_5_3_1 ) )
            // InternalGame.g:1072:2: ( rule__Scene__ActionsAssignment_5_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsAssignment_5_3_1()); 
            }
            // InternalGame.g:1073:2: ( rule__Scene__ActionsAssignment_5_3_1 )
            // InternalGame.g:1073:3: rule__Scene__ActionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ActionsAssignment_5_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsAssignment_5_3_1()); 
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
    // $ANTLR end "rule__Scene__Group_5_3__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalGame.g:1082:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1086:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:1087:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalGame.g:1094:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1098:1: ( ( 'object' ) )
            // InternalGame.g:1099:1: ( 'object' )
            {
            // InternalGame.g:1099:1: ( 'object' )
            // InternalGame.g:1100:2: 'object'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:1109:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1113:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1114:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:1121:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1125:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalGame.g:1126:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalGame.g:1126:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalGame.g:1127:2: ( rule__Object__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:1128:2: ( rule__Object__NameAssignment_1 )
            // InternalGame.g:1128:3: rule__Object__NameAssignment_1
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
    // InternalGame.g:1136:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1140:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1141:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:1148:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1152:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalGame.g:1153:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalGame.g:1153:1: ( ( rule__Object__Group_2__0 )? )
            // InternalGame.g:1154:2: ( rule__Object__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_2()); 
            }
            // InternalGame.g:1155:2: ( rule__Object__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:1155:3: rule__Object__Group_2__0
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
    // InternalGame.g:1163:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1167:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1168:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:1175:1: rule__Object__Group__3__Impl : ( '{' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1179:1: ( ( '{' ) )
            // InternalGame.g:1180:1: ( '{' )
            {
            // InternalGame.g:1180:1: ( '{' )
            // InternalGame.g:1181:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:1190:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1194:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:1195:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalGame.g:1202:1: rule__Object__Group__4__Impl : ( 'description' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1206:1: ( ( 'description' ) )
            // InternalGame.g:1207:1: ( 'description' )
            {
            // InternalGame.g:1207:1: ( 'description' )
            // InternalGame.g:1208:2: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:1217:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1221:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:1222:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1229:1: rule__Object__Group__5__Impl : ( ( rule__Object__DescriptionAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1233:1: ( ( ( rule__Object__DescriptionAssignment_5 ) ) )
            // InternalGame.g:1234:1: ( ( rule__Object__DescriptionAssignment_5 ) )
            {
            // InternalGame.g:1234:1: ( ( rule__Object__DescriptionAssignment_5 ) )
            // InternalGame.g:1235:2: ( rule__Object__DescriptionAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionAssignment_5()); 
            }
            // InternalGame.g:1236:2: ( rule__Object__DescriptionAssignment_5 )
            // InternalGame.g:1236:3: rule__Object__DescriptionAssignment_5
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
    // InternalGame.g:1244:1: rule__Object__Group__6 : rule__Object__Group__6__Impl ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1248:1: ( rule__Object__Group__6__Impl )
            // InternalGame.g:1249:2: rule__Object__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__6__Impl();

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
    // InternalGame.g:1255:1: rule__Object__Group__6__Impl : ( 'end' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1259:1: ( ( 'end' ) )
            // InternalGame.g:1260:1: ( 'end' )
            {
            // InternalGame.g:1260:1: ( 'end' )
            // InternalGame.g:1261:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEndKeyword_6()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEndKeyword_6()); 
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


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalGame.g:1271:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1275:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalGame.g:1276:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1283:1: rule__Object__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1287:1: ( ( 'extends' ) )
            // InternalGame.g:1288:1: ( 'extends' )
            {
            // InternalGame.g:1288:1: ( 'extends' )
            // InternalGame.g:1289:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getExtendsKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getExtendsKeyword_2_0()); 
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
    // InternalGame.g:1298:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1302:1: ( rule__Object__Group_2__1__Impl )
            // InternalGame.g:1303:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1__Impl();

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
    // InternalGame.g:1309:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1313:1: ( ( ( rule__Object__SuperTypeAssignment_2_1 ) ) )
            // InternalGame.g:1314:1: ( ( rule__Object__SuperTypeAssignment_2_1 ) )
            {
            // InternalGame.g:1314:1: ( ( rule__Object__SuperTypeAssignment_2_1 ) )
            // InternalGame.g:1315:2: ( rule__Object__SuperTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); 
            }
            // InternalGame.g:1316:2: ( rule__Object__SuperTypeAssignment_2_1 )
            // InternalGame.g:1316:3: rule__Object__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__SuperTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); 
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalGame.g:1325:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1329:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalGame.g:1330:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1337:1: rule__Step__Group__0__Impl : ( ( rule__Step__ActionAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1341:1: ( ( ( rule__Step__ActionAssignment_0 ) ) )
            // InternalGame.g:1342:1: ( ( rule__Step__ActionAssignment_0 ) )
            {
            // InternalGame.g:1342:1: ( ( rule__Step__ActionAssignment_0 ) )
            // InternalGame.g:1343:2: ( rule__Step__ActionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getActionAssignment_0()); 
            }
            // InternalGame.g:1344:2: ( rule__Step__ActionAssignment_0 )
            // InternalGame.g:1344:3: rule__Step__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__ActionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getActionAssignment_0()); 
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
    // InternalGame.g:1352:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1356:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalGame.g:1357:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1364:1: rule__Step__Group__1__Impl : ( ( rule__Step__TargetObjectAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1368:1: ( ( ( rule__Step__TargetObjectAssignment_1 ) ) )
            // InternalGame.g:1369:1: ( ( rule__Step__TargetObjectAssignment_1 ) )
            {
            // InternalGame.g:1369:1: ( ( rule__Step__TargetObjectAssignment_1 ) )
            // InternalGame.g:1370:2: ( rule__Step__TargetObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectAssignment_1()); 
            }
            // InternalGame.g:1371:2: ( rule__Step__TargetObjectAssignment_1 )
            // InternalGame.g:1371:3: rule__Step__TargetObjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__TargetObjectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTargetObjectAssignment_1()); 
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
    // InternalGame.g:1379:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1383:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalGame.g:1384:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1391:1: rule__Step__Group__2__Impl : ( 'if' ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1395:1: ( ( 'if' ) )
            // InternalGame.g:1396:1: ( 'if' )
            {
            // InternalGame.g:1396:1: ( 'if' )
            // InternalGame.g:1397:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getIfKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getIfKeyword_2()); 
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
    // InternalGame.g:1406:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1410:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalGame.g:1411:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1418:1: rule__Step__Group__3__Impl : ( ( rule__Step__Group_3__0 ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1422:1: ( ( ( rule__Step__Group_3__0 ) ) )
            // InternalGame.g:1423:1: ( ( rule__Step__Group_3__0 ) )
            {
            // InternalGame.g:1423:1: ( ( rule__Step__Group_3__0 ) )
            // InternalGame.g:1424:2: ( rule__Step__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getGroup_3()); 
            }
            // InternalGame.g:1425:2: ( rule__Step__Group_3__0 )
            // InternalGame.g:1425:3: rule__Step__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getGroup_3()); 
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
    // InternalGame.g:1433:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1437:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalGame.g:1438:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1445:1: rule__Step__Group__4__Impl : ( 'then' ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1449:1: ( ( 'then' ) )
            // InternalGame.g:1450:1: ( 'then' )
            {
            // InternalGame.g:1450:1: ( 'then' )
            // InternalGame.g:1451:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getThenKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getThenKeyword_4()); 
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
    // InternalGame.g:1460:1: rule__Step__Group__5 : rule__Step__Group__5__Impl ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1464:1: ( rule__Step__Group__5__Impl )
            // InternalGame.g:1465:2: rule__Step__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__5__Impl();

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
    // InternalGame.g:1471:1: rule__Step__Group__5__Impl : ( ( rule__Step__SceneAssignment_5 ) ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1475:1: ( ( ( rule__Step__SceneAssignment_5 ) ) )
            // InternalGame.g:1476:1: ( ( rule__Step__SceneAssignment_5 ) )
            {
            // InternalGame.g:1476:1: ( ( rule__Step__SceneAssignment_5 ) )
            // InternalGame.g:1477:2: ( rule__Step__SceneAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneAssignment_5()); 
            }
            // InternalGame.g:1478:2: ( rule__Step__SceneAssignment_5 )
            // InternalGame.g:1478:3: rule__Step__SceneAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Step__SceneAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneAssignment_5()); 
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


    // $ANTLR start "rule__Step__Group_3__0"
    // InternalGame.g:1487:1: rule__Step__Group_3__0 : rule__Step__Group_3__0__Impl rule__Step__Group_3__1 ;
    public final void rule__Step__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1491:1: ( rule__Step__Group_3__0__Impl rule__Step__Group_3__1 )
            // InternalGame.g:1492:2: rule__Step__Group_3__0__Impl rule__Step__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Step__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group_3__1();

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
    // $ANTLR end "rule__Step__Group_3__0"


    // $ANTLR start "rule__Step__Group_3__0__Impl"
    // InternalGame.g:1499:1: rule__Step__Group_3__0__Impl : ( 'valid' ) ;
    public final void rule__Step__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1503:1: ( ( 'valid' ) )
            // InternalGame.g:1504:1: ( 'valid' )
            {
            // InternalGame.g:1504:1: ( 'valid' )
            // InternalGame.g:1505:2: 'valid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidKeyword_3_0()); 
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
    // $ANTLR end "rule__Step__Group_3__0__Impl"


    // $ANTLR start "rule__Step__Group_3__1"
    // InternalGame.g:1514:1: rule__Step__Group_3__1 : rule__Step__Group_3__1__Impl ;
    public final void rule__Step__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1518:1: ( rule__Step__Group_3__1__Impl )
            // InternalGame.g:1519:2: rule__Step__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_3__1__Impl();

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
    // $ANTLR end "rule__Step__Group_3__1"


    // $ANTLR start "rule__Step__Group_3__1__Impl"
    // InternalGame.g:1525:1: rule__Step__Group_3__1__Impl : ( ( rule__Step__ValidAssignment_3_1 ) ) ;
    public final void rule__Step__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1529:1: ( ( ( rule__Step__ValidAssignment_3_1 ) ) )
            // InternalGame.g:1530:1: ( ( rule__Step__ValidAssignment_3_1 ) )
            {
            // InternalGame.g:1530:1: ( ( rule__Step__ValidAssignment_3_1 ) )
            // InternalGame.g:1531:2: ( rule__Step__ValidAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidAssignment_3_1()); 
            }
            // InternalGame.g:1532:2: ( rule__Step__ValidAssignment_3_1 )
            // InternalGame.g:1532:3: rule__Step__ValidAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__ValidAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidAssignment_3_1()); 
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
    // $ANTLR end "rule__Step__Group_3__1__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup"
    // InternalGame.g:1541:1: rule__Adventure__UnorderedGroup : rule__Adventure__UnorderedGroup__0 {...}?;
    public final void rule__Adventure__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup());
        	
        try {
            // InternalGame.g:1546:1: ( rule__Adventure__UnorderedGroup__0 {...}?)
            // InternalGame.g:1547:2: rule__Adventure__UnorderedGroup__0 {...}?
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
    // InternalGame.g:1555:1: rule__Adventure__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) ) ;
    public final void rule__Adventure__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGame.g:1560:1: ( ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) ) )
            // InternalGame.g:1561:3: ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) )
            {
            // InternalGame.g:1561:3: ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt10=2;
            }
            else if ( ( LA10_0 == 17 || LA10_0 == 19 || LA10_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt10=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1562:3: ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) )
                    {
                    // InternalGame.g:1562:3: ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) )
                    // InternalGame.g:1563:4: {...}? => ( ( ( rule__Adventure__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalGame.g:1563:103: ( ( ( rule__Adventure__Group_0__0 ) ) )
                    // InternalGame.g:1564:5: ( ( rule__Adventure__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalGame.g:1570:5: ( ( rule__Adventure__Group_0__0 ) )
                    // InternalGame.g:1571:6: ( rule__Adventure__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1572:6: ( rule__Adventure__Group_0__0 )
                    // InternalGame.g:1572:7: rule__Adventure__Group_0__0
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
                    // InternalGame.g:1577:3: ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) )
                    {
                    // InternalGame.g:1577:3: ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) )
                    // InternalGame.g:1578:4: {...}? => ( ( ( rule__Adventure__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalGame.g:1578:103: ( ( ( rule__Adventure__Group_1__0 ) ) )
                    // InternalGame.g:1579:5: ( ( rule__Adventure__Group_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalGame.g:1585:5: ( ( rule__Adventure__Group_1__0 ) )
                    // InternalGame.g:1586:6: ( rule__Adventure__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1587:6: ( rule__Adventure__Group_1__0 )
                    // InternalGame.g:1587:7: rule__Adventure__Group_1__0
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
                    // InternalGame.g:1592:3: ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) )
                    {
                    // InternalGame.g:1592:3: ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) )
                    // InternalGame.g:1593:4: {...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalGame.g:1593:103: ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) )
                    // InternalGame.g:1594:5: ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalGame.g:1600:5: ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) )
                    // InternalGame.g:1601:6: ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* )
                    {
                    // InternalGame.g:1601:6: ( ( rule__Adventure__IngredientsAssignment_2 ) )
                    // InternalGame.g:1602:7: ( rule__Adventure__IngredientsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }
                    // InternalGame.g:1603:7: ( rule__Adventure__IngredientsAssignment_2 )
                    // InternalGame.g:1603:8: rule__Adventure__IngredientsAssignment_2
                    {
                    pushFollow(FOLLOW_19);
                    rule__Adventure__IngredientsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }

                    }

                    // InternalGame.g:1606:6: ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* )
                    // InternalGame.g:1607:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }
                    // InternalGame.g:1608:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*
                    loop9:
                    do {
                        int alt9=2;
                        alt9 = dfa9.predict(input);
                        switch (alt9) {
                    	case 1 :
                    	    // InternalGame.g:1608:8: ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_19);
                    	    rule__Adventure__IngredientsAssignment_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // InternalGame.g:1622:1: rule__Adventure__UnorderedGroup__0 : rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )? ;
    public final void rule__Adventure__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1626:1: ( rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )? )
            // InternalGame.g:1627:2: rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_20);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:1628:2: ( rule__Adventure__UnorderedGroup__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt11=1;
            }
            else if ( ( LA11_0 == 17 || LA11_0 == 19 || LA11_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:1628:2: rule__Adventure__UnorderedGroup__1
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
    // InternalGame.g:1634:1: rule__Adventure__UnorderedGroup__1 : rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )? ;
    public final void rule__Adventure__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1638:1: ( rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )? )
            // InternalGame.g:1639:2: rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_20);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:1640:2: ( rule__Adventure__UnorderedGroup__2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt12=1;
            }
            else if ( ( LA12_0 == 17 || LA12_0 == 19 || LA12_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1640:2: rule__Adventure__UnorderedGroup__2
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
    // InternalGame.g:1646:1: rule__Adventure__UnorderedGroup__2 : rule__Adventure__UnorderedGroup__Impl ;
    public final void rule__Adventure__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1650:1: ( rule__Adventure__UnorderedGroup__Impl )
            // InternalGame.g:1651:2: rule__Adventure__UnorderedGroup__Impl
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
    // InternalGame.g:1658:1: rule__Adventure__StartSceneAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adventure__StartSceneAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1662:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1663:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1663:2: ( ( RULE_ID ) )
            // InternalGame.g:1664:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneSceneCrossReference_0_1_0()); 
            }
            // InternalGame.g:1665:3: ( RULE_ID )
            // InternalGame.g:1666:4: RULE_ID
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
    // InternalGame.g:1677:1: rule__Adventure__EndSceneAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adventure__EndSceneAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1681:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1682:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1682:2: ( ( RULE_ID ) )
            // InternalGame.g:1683:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneSceneCrossReference_1_1_0()); 
            }
            // InternalGame.g:1684:3: ( RULE_ID )
            // InternalGame.g:1685:4: RULE_ID
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
    // InternalGame.g:1696:1: rule__Adventure__IngredientsAssignment_2 : ( ruleIngredient ) ;
    public final void rule__Adventure__IngredientsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1700:1: ( ( ruleIngredient ) )
            // InternalGame.g:1701:2: ( ruleIngredient )
            {
            // InternalGame.g:1701:2: ( ruleIngredient )
            // InternalGame.g:1702:3: ruleIngredient
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


    // $ANTLR start "rule__Hero__NameAssignment_1"
    // InternalGame.g:1711:1: rule__Hero__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Hero__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1715:1: ( ( RULE_ID ) )
            // InternalGame.g:1716:2: ( RULE_ID )
            {
            // InternalGame.g:1716:2: ( RULE_ID )
            // InternalGame.g:1717:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Hero__NameAssignment_1"


    // $ANTLR start "rule__Hero__HealthPointsAssignment_3"
    // InternalGame.g:1726:1: rule__Hero__HealthPointsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Hero__HealthPointsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1730:1: ( ( RULE_STRING ) )
            // InternalGame.g:1731:2: ( RULE_STRING )
            {
            // InternalGame.g:1731:2: ( RULE_STRING )
            // InternalGame.g:1732:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeroAccess().getHealthPointsSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeroAccess().getHealthPointsSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Hero__HealthPointsAssignment_3"


    // $ANTLR start "rule__Scene__NameAssignment_1"
    // InternalGame.g:1741:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1745:1: ( ( RULE_ID ) )
            // InternalGame.g:1746:2: ( RULE_ID )
            {
            // InternalGame.g:1746:2: ( RULE_ID )
            // InternalGame.g:1747:3: RULE_ID
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


    // $ANTLR start "rule__Scene__ObjectsAssignment_2_2"
    // InternalGame.g:1756:1: rule__Scene__ObjectsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1760:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1761:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1761:2: ( ( RULE_ID ) )
            // InternalGame.g:1762:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_2_0()); 
            }
            // InternalGame.g:1763:3: ( RULE_ID )
            // InternalGame.g:1764:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_2_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_2_0()); 
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
    // $ANTLR end "rule__Scene__ObjectsAssignment_2_2"


    // $ANTLR start "rule__Scene__ObjectsAssignment_2_3_1"
    // InternalGame.g:1775:1: rule__Scene__ObjectsAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__ObjectsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1779:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1780:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1780:2: ( ( RULE_ID ) )
            // InternalGame.g:1781:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_3_1_0()); 
            }
            // InternalGame.g:1782:3: ( RULE_ID )
            // InternalGame.g:1783:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_2_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectIDTerminalRuleCall_2_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_3_1_0()); 
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
    // $ANTLR end "rule__Scene__ObjectsAssignment_2_3_1"


    // $ANTLR start "rule__Scene__DescriptionAssignment_4"
    // InternalGame.g:1794:1: rule__Scene__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Scene__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1798:1: ( ( RULE_STRING ) )
            // InternalGame.g:1799:2: ( RULE_STRING )
            {
            // InternalGame.g:1799:2: ( RULE_STRING )
            // InternalGame.g:1800:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__Scene__DescriptionAssignment_4"


    // $ANTLR start "rule__Scene__ActionsAssignment_5_2"
    // InternalGame.g:1809:1: rule__Scene__ActionsAssignment_5_2 : ( ruleStep ) ;
    public final void rule__Scene__ActionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1813:1: ( ( ruleStep ) )
            // InternalGame.g:1814:2: ( ruleStep )
            {
            // InternalGame.g:1814:2: ( ruleStep )
            // InternalGame.g:1815:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__Scene__ActionsAssignment_5_2"


    // $ANTLR start "rule__Scene__ActionsAssignment_5_3_1"
    // InternalGame.g:1824:1: rule__Scene__ActionsAssignment_5_3_1 : ( ruleStep ) ;
    public final void rule__Scene__ActionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1828:1: ( ( ruleStep ) )
            // InternalGame.g:1829:2: ( ruleStep )
            {
            // InternalGame.g:1829:2: ( ruleStep )
            // InternalGame.g:1830:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneAccess().getActionsStepParserRuleCall_5_3_1_0()); 
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
    // $ANTLR end "rule__Scene__ActionsAssignment_5_3_1"


    // $ANTLR start "rule__Object__NameAssignment_1"
    // InternalGame.g:1839:1: rule__Object__NameAssignment_1 : ( ( rule__Object__NameAlternatives_1_0 ) ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1843:1: ( ( ( rule__Object__NameAlternatives_1_0 ) ) )
            // InternalGame.g:1844:2: ( ( rule__Object__NameAlternatives_1_0 ) )
            {
            // InternalGame.g:1844:2: ( ( rule__Object__NameAlternatives_1_0 ) )
            // InternalGame.g:1845:3: ( rule__Object__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAlternatives_1_0()); 
            }
            // InternalGame.g:1846:3: ( rule__Object__NameAlternatives_1_0 )
            // InternalGame.g:1846:4: rule__Object__NameAlternatives_1_0
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


    // $ANTLR start "rule__Object__SuperTypeAssignment_2_1"
    // InternalGame.g:1854:1: rule__Object__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Object__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1858:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1859:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1859:2: ( ( RULE_ID ) )
            // InternalGame.g:1860:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
            }
            // InternalGame.g:1861:3: ( RULE_ID )
            // InternalGame.g:1862:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Object__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Object__DescriptionAssignment_5"
    // InternalGame.g:1873:1: rule__Object__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Object__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1877:1: ( ( RULE_STRING ) )
            // InternalGame.g:1878:2: ( RULE_STRING )
            {
            // InternalGame.g:1878:2: ( RULE_STRING )
            // InternalGame.g:1879:3: RULE_STRING
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


    // $ANTLR start "rule__Step__ActionAssignment_0"
    // InternalGame.g:1888:1: rule__Step__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Step__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1892:1: ( ( ruleAction ) )
            // InternalGame.g:1893:2: ( ruleAction )
            {
            // InternalGame.g:1893:2: ( ruleAction )
            // InternalGame.g:1894:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getActionActionEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getActionActionEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__Step__ActionAssignment_0"


    // $ANTLR start "rule__Step__TargetObjectAssignment_1"
    // InternalGame.g:1903:1: rule__Step__TargetObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__TargetObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1907:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1908:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1908:2: ( ( RULE_ID ) )
            // InternalGame.g:1909:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_1_0()); 
            }
            // InternalGame.g:1910:3: ( RULE_ID )
            // InternalGame.g:1911:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectObjectIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTargetObjectObjectIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_1_0()); 
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
    // $ANTLR end "rule__Step__TargetObjectAssignment_1"


    // $ANTLR start "rule__Step__ValidAssignment_3_1"
    // InternalGame.g:1922:1: rule__Step__ValidAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Step__ValidAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1926:1: ( ( RULE_STRING ) )
            // InternalGame.g:1927:2: ( RULE_STRING )
            {
            // InternalGame.g:1927:2: ( RULE_STRING )
            // InternalGame.g:1928:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Step__ValidAssignment_3_1"


    // $ANTLR start "rule__Step__SceneAssignment_5"
    // InternalGame.g:1937:1: rule__Step__SceneAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Step__SceneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1941:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1942:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1942:2: ( ( RULE_ID ) )
            // InternalGame.g:1943:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneSceneCrossReference_5_0()); 
            }
            // InternalGame.g:1944:3: ( RULE_ID )
            // InternalGame.g:1945:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneSceneCrossReference_5_0()); 
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
    // $ANTLR end "rule__Step__SceneAssignment_5"

    // $ANTLR start synpred1_InternalGame
    public final void synpred1_InternalGame_fragment() throws RecognitionException {   
        // InternalGame.g:1608:8: ( rule__Adventure__IngredientsAssignment_2 )
        // InternalGame.g:1608:9: rule__Adventure__IngredientsAssignment_2
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


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\1\1\62\uffff";
    static final String dfa_3s = "\1\17\1\uffff\1\5\1\4\1\5\1\24\2\33\1\22\1\26\1\4\1\5\1\24\1\4\1\5\1\20\1\33\1\4\1\0\1\27\1\26\1\0\1\20\1\uffff\1\5\1\24\1\13\1\0\1\27\4\5\1\35\1\37\1\4\1\36\1\5\1\27\1\13\1\20\4\5\1\35\1\37\1\4\1\36\1\5\1\27";
    static final String dfa_4s = "\1\32\1\uffff\3\5\1\25\2\34\1\22\1\26\1\4\1\5\1\24\1\4\1\5\1\31\1\33\1\4\1\0\1\30\1\26\1\0\1\20\1\uffff\1\5\1\24\1\16\1\0\1\30\4\5\1\35\1\37\1\4\1\36\1\5\1\30\1\16\1\20\4\5\1\35\1\37\1\4\1\36\1\5\1\30";
    static final String dfa_5s = "\1\uffff\1\2\25\uffff\1\1\33\uffff";
    static final String dfa_6s = "\22\uffff\1\2\2\uffff\1\0\5\uffff\1\1\27\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\4\1\uffff\1\2\6\uffff\1\3",
            "",
            "\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\12\1\11",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\25\10\uffff\1\24",
            "\1\14",
            "\1\26",
            "\1\uffff",
            "\1\31\1\30",
            "\1\32",
            "\1\uffff",
            "\1\33",
            "",
            "\1\34",
            "\1\12",
            "\1\35\1\36\1\37\1\40",
            "\1\uffff",
            "\1\31\1\30",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\1\47",
            "\1\51\1\52\1\53\1\54",
            "\1\25",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\50\1\47"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1608:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_21 = input.LA(1);

                         
                        int index9_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_27 = input.LA(1);

                         
                        int index9_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_27);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_18 = input.LA(1);

                         
                        int index9_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000040A0002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000040B8002L});

}
