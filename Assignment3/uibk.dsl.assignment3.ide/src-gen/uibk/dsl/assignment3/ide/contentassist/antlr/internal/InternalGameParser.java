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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'look at'", "'pick up'", "'goto'", "'use'", "'with'", "'into'", "'start'", "'end'", "'scene'", "'description'", "'objects'", "'('", "')'", "','", "'actions'", "'object'", "'if'", "'then'", "'valid'", "'default'"
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


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:128:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleObject EOF )
            // InternalGame.g:130:1: ruleObject EOF
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
    // InternalGame.g:137:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__Object__Group__0 ) )
            // InternalGame.g:143:3: ( rule__Object__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup()); 
            }
            // InternalGame.g:144:3: ( rule__Object__Group__0 )
            // InternalGame.g:144:4: rule__Object__Group__0
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
    // InternalGame.g:153:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleStep EOF )
            // InternalGame.g:155:1: ruleStep EOF
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
    // InternalGame.g:162:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Step__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Step__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getGroup()); 
            }
            // InternalGame.g:169:3: ( rule__Step__Group__0 )
            // InternalGame.g:169:4: rule__Step__Group__0
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
    // InternalGame.g:178:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:182:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGame.g:183:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGame.g:183:2: ( ( rule__Action__Alternatives ) )
            // InternalGame.g:184:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalGame.g:185:3: ( rule__Action__Alternatives )
            // InternalGame.g:185:4: rule__Action__Alternatives
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


    // $ANTLR start "rulePreposition"
    // InternalGame.g:194:1: rulePreposition : ( ( rule__Preposition__Alternatives ) ) ;
    public final void rulePreposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:198:1: ( ( ( rule__Preposition__Alternatives ) ) )
            // InternalGame.g:199:2: ( ( rule__Preposition__Alternatives ) )
            {
            // InternalGame.g:199:2: ( ( rule__Preposition__Alternatives ) )
            // InternalGame.g:200:3: ( rule__Preposition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrepositionAccess().getAlternatives()); 
            }
            // InternalGame.g:201:3: ( rule__Preposition__Alternatives )
            // InternalGame.g:201:4: rule__Preposition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Preposition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrepositionAccess().getAlternatives()); 
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
    // $ANTLR end "rulePreposition"


    // $ANTLR start "rule__Ingredient__Alternatives"
    // InternalGame.g:209:1: rule__Ingredient__Alternatives : ( ( ruleScene ) | ( ruleObject ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:213:1: ( ( ruleScene ) | ( ruleObject ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGame.g:214:2: ( ruleScene )
                    {
                    // InternalGame.g:214:2: ( ruleScene )
                    // InternalGame.g:215:3: ruleScene
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
                    // InternalGame.g:220:2: ( ruleObject )
                    {
                    // InternalGame.g:220:2: ( ruleObject )
                    // InternalGame.g:221:3: ruleObject
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

            }
        }
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
    // InternalGame.g:230:1: rule__Object__NameAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Object__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:234:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalGame.g:235:2: ( RULE_STRING )
                    {
                    // InternalGame.g:235:2: ( RULE_STRING )
                    // InternalGame.g:236:3: RULE_STRING
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
                    // InternalGame.g:241:2: ( RULE_ID )
                    {
                    // InternalGame.g:241:2: ( RULE_ID )
                    // InternalGame.g:242:3: RULE_ID
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
    // InternalGame.g:251:1: rule__Action__Alternatives : ( ( ( 'look at' ) ) | ( ( 'pick up' ) ) | ( ( 'goto' ) ) | ( ( 'use' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:255:1: ( ( ( 'look at' ) ) | ( ( 'pick up' ) ) | ( ( 'goto' ) ) | ( ( 'use' ) ) )
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
                    // InternalGame.g:256:2: ( ( 'look at' ) )
                    {
                    // InternalGame.g:256:2: ( ( 'look at' ) )
                    // InternalGame.g:257:3: ( 'look at' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getLOOKEnumLiteralDeclaration_0()); 
                    }
                    // InternalGame.g:258:3: ( 'look at' )
                    // InternalGame.g:258:4: 'look at'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getLOOKEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:262:2: ( ( 'pick up' ) )
                    {
                    // InternalGame.g:262:2: ( ( 'pick up' ) )
                    // InternalGame.g:263:3: ( 'pick up' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1()); 
                    }
                    // InternalGame.g:264:3: ( 'pick up' )
                    // InternalGame.g:264:4: 'pick up'
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
                    // InternalGame.g:268:2: ( ( 'goto' ) )
                    {
                    // InternalGame.g:268:2: ( ( 'goto' ) )
                    // InternalGame.g:269:3: ( 'goto' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getGOTOEnumLiteralDeclaration_2()); 
                    }
                    // InternalGame.g:270:3: ( 'goto' )
                    // InternalGame.g:270:4: 'goto'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getGOTOEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:274:2: ( ( 'use' ) )
                    {
                    // InternalGame.g:274:2: ( ( 'use' ) )
                    // InternalGame.g:275:3: ( 'use' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_3()); 
                    }
                    // InternalGame.g:276:3: ( 'use' )
                    // InternalGame.g:276:4: 'use'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_3()); 
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


    // $ANTLR start "rule__Preposition__Alternatives"
    // InternalGame.g:284:1: rule__Preposition__Alternatives : ( ( ( 'with' ) ) | ( ( 'into' ) ) );
    public final void rule__Preposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:288:1: ( ( ( 'with' ) ) | ( ( 'into' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:289:2: ( ( 'with' ) )
                    {
                    // InternalGame.g:289:2: ( ( 'with' ) )
                    // InternalGame.g:290:3: ( 'with' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrepositionAccess().getWITHEnumLiteralDeclaration_0()); 
                    }
                    // InternalGame.g:291:3: ( 'with' )
                    // InternalGame.g:291:4: 'with'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrepositionAccess().getWITHEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:295:2: ( ( 'into' ) )
                    {
                    // InternalGame.g:295:2: ( ( 'into' ) )
                    // InternalGame.g:296:3: ( 'into' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrepositionAccess().getINTOEnumLiteralDeclaration_1()); 
                    }
                    // InternalGame.g:297:3: ( 'into' )
                    // InternalGame.g:297:4: 'into'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrepositionAccess().getINTOEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__Preposition__Alternatives"


    // $ANTLR start "rule__Adventure__Group_0__0"
    // InternalGame.g:305:1: rule__Adventure__Group_0__0 : rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1 ;
    public final void rule__Adventure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:309:1: ( rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1 )
            // InternalGame.g:310:2: rule__Adventure__Group_0__0__Impl rule__Adventure__Group_0__1
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
    // InternalGame.g:317:1: rule__Adventure__Group_0__0__Impl : ( 'start' ) ;
    public final void rule__Adventure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:321:1: ( ( 'start' ) )
            // InternalGame.g:322:1: ( 'start' )
            {
            // InternalGame.g:322:1: ( 'start' )
            // InternalGame.g:323:2: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartKeyword_0_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:332:1: rule__Adventure__Group_0__1 : rule__Adventure__Group_0__1__Impl ;
    public final void rule__Adventure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:336:1: ( rule__Adventure__Group_0__1__Impl )
            // InternalGame.g:337:2: rule__Adventure__Group_0__1__Impl
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
    // InternalGame.g:343:1: rule__Adventure__Group_0__1__Impl : ( ( rule__Adventure__StartSceneAssignment_0_1 ) ) ;
    public final void rule__Adventure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:347:1: ( ( ( rule__Adventure__StartSceneAssignment_0_1 ) ) )
            // InternalGame.g:348:1: ( ( rule__Adventure__StartSceneAssignment_0_1 ) )
            {
            // InternalGame.g:348:1: ( ( rule__Adventure__StartSceneAssignment_0_1 ) )
            // InternalGame.g:349:2: ( rule__Adventure__StartSceneAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneAssignment_0_1()); 
            }
            // InternalGame.g:350:2: ( rule__Adventure__StartSceneAssignment_0_1 )
            // InternalGame.g:350:3: rule__Adventure__StartSceneAssignment_0_1
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
    // InternalGame.g:359:1: rule__Adventure__Group_1__0 : rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1 ;
    public final void rule__Adventure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:363:1: ( rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1 )
            // InternalGame.g:364:2: rule__Adventure__Group_1__0__Impl rule__Adventure__Group_1__1
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
    // InternalGame.g:371:1: rule__Adventure__Group_1__0__Impl : ( 'end' ) ;
    public final void rule__Adventure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:375:1: ( ( 'end' ) )
            // InternalGame.g:376:1: ( 'end' )
            {
            // InternalGame.g:376:1: ( 'end' )
            // InternalGame.g:377:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndKeyword_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:386:1: rule__Adventure__Group_1__1 : rule__Adventure__Group_1__1__Impl ;
    public final void rule__Adventure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:390:1: ( rule__Adventure__Group_1__1__Impl )
            // InternalGame.g:391:2: rule__Adventure__Group_1__1__Impl
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
    // InternalGame.g:397:1: rule__Adventure__Group_1__1__Impl : ( ( rule__Adventure__EndSceneAssignment_1_1 ) ) ;
    public final void rule__Adventure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:401:1: ( ( ( rule__Adventure__EndSceneAssignment_1_1 ) ) )
            // InternalGame.g:402:1: ( ( rule__Adventure__EndSceneAssignment_1_1 ) )
            {
            // InternalGame.g:402:1: ( ( rule__Adventure__EndSceneAssignment_1_1 ) )
            // InternalGame.g:403:2: ( rule__Adventure__EndSceneAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneAssignment_1_1()); 
            }
            // InternalGame.g:404:2: ( rule__Adventure__EndSceneAssignment_1_1 )
            // InternalGame.g:404:3: rule__Adventure__EndSceneAssignment_1_1
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
    // InternalGame.g:413:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:417:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:418:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalGame.g:425:1: rule__Scene__Group__0__Impl : ( 'scene' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:429:1: ( ( 'scene' ) )
            // InternalGame.g:430:1: ( 'scene' )
            {
            // InternalGame.g:430:1: ( 'scene' )
            // InternalGame.g:431:2: 'scene'
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
    // InternalGame.g:440:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:444:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:445:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
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
    // InternalGame.g:452:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:456:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:457:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:457:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:458:2: ( rule__Scene__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:459:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:459:3: rule__Scene__NameAssignment_1
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
    // InternalGame.g:467:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:471:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:472:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:479:1: rule__Scene__Group__2__Impl : ( ( rule__Scene__Group_2__0 )? ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:483:1: ( ( ( rule__Scene__Group_2__0 )? ) )
            // InternalGame.g:484:1: ( ( rule__Scene__Group_2__0 )? )
            {
            // InternalGame.g:484:1: ( ( rule__Scene__Group_2__0 )? )
            // InternalGame.g:485:2: ( rule__Scene__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_2()); 
            }
            // InternalGame.g:486:2: ( rule__Scene__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:486:3: rule__Scene__Group_2__0
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
    // InternalGame.g:494:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:498:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:499:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:506:1: rule__Scene__Group__3__Impl : ( 'description' ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:510:1: ( ( 'description' ) )
            // InternalGame.g:511:1: ( 'description' )
            {
            // InternalGame.g:511:1: ( 'description' )
            // InternalGame.g:512:2: 'description'
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
    // InternalGame.g:521:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:525:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:526:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
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
    // InternalGame.g:533:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__DescriptionAssignment_4 ) ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:537:1: ( ( ( rule__Scene__DescriptionAssignment_4 ) ) )
            // InternalGame.g:538:1: ( ( rule__Scene__DescriptionAssignment_4 ) )
            {
            // InternalGame.g:538:1: ( ( rule__Scene__DescriptionAssignment_4 ) )
            // InternalGame.g:539:2: ( rule__Scene__DescriptionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getDescriptionAssignment_4()); 
            }
            // InternalGame.g:540:2: ( rule__Scene__DescriptionAssignment_4 )
            // InternalGame.g:540:3: rule__Scene__DescriptionAssignment_4
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
    // InternalGame.g:548:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:552:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:553:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:560:1: rule__Scene__Group__5__Impl : ( ( rule__Scene__Group_5__0 )? ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:564:1: ( ( ( rule__Scene__Group_5__0 )? ) )
            // InternalGame.g:565:1: ( ( rule__Scene__Group_5__0 )? )
            {
            // InternalGame.g:565:1: ( ( rule__Scene__Group_5__0 )? )
            // InternalGame.g:566:2: ( rule__Scene__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_5()); 
            }
            // InternalGame.g:567:2: ( rule__Scene__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:567:3: rule__Scene__Group_5__0
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
    // InternalGame.g:575:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:579:1: ( rule__Scene__Group__6__Impl )
            // InternalGame.g:580:2: rule__Scene__Group__6__Impl
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
    // InternalGame.g:586:1: rule__Scene__Group__6__Impl : ( 'end' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:590:1: ( ( 'end' ) )
            // InternalGame.g:591:1: ( 'end' )
            {
            // InternalGame.g:591:1: ( 'end' )
            // InternalGame.g:592:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getEndKeyword_6()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalGame.g:602:1: rule__Scene__Group_2__0 : rule__Scene__Group_2__0__Impl rule__Scene__Group_2__1 ;
    public final void rule__Scene__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:606:1: ( rule__Scene__Group_2__0__Impl rule__Scene__Group_2__1 )
            // InternalGame.g:607:2: rule__Scene__Group_2__0__Impl rule__Scene__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:614:1: rule__Scene__Group_2__0__Impl : ( 'objects' ) ;
    public final void rule__Scene__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:618:1: ( ( 'objects' ) )
            // InternalGame.g:619:1: ( 'objects' )
            {
            // InternalGame.g:619:1: ( 'objects' )
            // InternalGame.g:620:2: 'objects'
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
    // InternalGame.g:629:1: rule__Scene__Group_2__1 : rule__Scene__Group_2__1__Impl rule__Scene__Group_2__2 ;
    public final void rule__Scene__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:633:1: ( rule__Scene__Group_2__1__Impl rule__Scene__Group_2__2 )
            // InternalGame.g:634:2: rule__Scene__Group_2__1__Impl rule__Scene__Group_2__2
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
    // InternalGame.g:641:1: rule__Scene__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Scene__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:645:1: ( ( '(' ) )
            // InternalGame.g:646:1: ( '(' )
            {
            // InternalGame.g:646:1: ( '(' )
            // InternalGame.g:647:2: '('
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
    // InternalGame.g:656:1: rule__Scene__Group_2__2 : rule__Scene__Group_2__2__Impl rule__Scene__Group_2__3 ;
    public final void rule__Scene__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:660:1: ( rule__Scene__Group_2__2__Impl rule__Scene__Group_2__3 )
            // InternalGame.g:661:2: rule__Scene__Group_2__2__Impl rule__Scene__Group_2__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGame.g:668:1: rule__Scene__Group_2__2__Impl : ( ( rule__Scene__ObjectsAssignment_2_2 ) ) ;
    public final void rule__Scene__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:672:1: ( ( ( rule__Scene__ObjectsAssignment_2_2 ) ) )
            // InternalGame.g:673:1: ( ( rule__Scene__ObjectsAssignment_2_2 ) )
            {
            // InternalGame.g:673:1: ( ( rule__Scene__ObjectsAssignment_2_2 ) )
            // InternalGame.g:674:2: ( rule__Scene__ObjectsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsAssignment_2_2()); 
            }
            // InternalGame.g:675:2: ( rule__Scene__ObjectsAssignment_2_2 )
            // InternalGame.g:675:3: rule__Scene__ObjectsAssignment_2_2
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
    // InternalGame.g:683:1: rule__Scene__Group_2__3 : rule__Scene__Group_2__3__Impl rule__Scene__Group_2__4 ;
    public final void rule__Scene__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:687:1: ( rule__Scene__Group_2__3__Impl rule__Scene__Group_2__4 )
            // InternalGame.g:688:2: rule__Scene__Group_2__3__Impl rule__Scene__Group_2__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalGame.g:695:1: rule__Scene__Group_2__3__Impl : ( ( rule__Scene__Group_2_3__0 )* ) ;
    public final void rule__Scene__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:699:1: ( ( ( rule__Scene__Group_2_3__0 )* ) )
            // InternalGame.g:700:1: ( ( rule__Scene__Group_2_3__0 )* )
            {
            // InternalGame.g:700:1: ( ( rule__Scene__Group_2_3__0 )* )
            // InternalGame.g:701:2: ( rule__Scene__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_2_3()); 
            }
            // InternalGame.g:702:2: ( rule__Scene__Group_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:702:3: rule__Scene__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scene__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalGame.g:710:1: rule__Scene__Group_2__4 : rule__Scene__Group_2__4__Impl ;
    public final void rule__Scene__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:714:1: ( rule__Scene__Group_2__4__Impl )
            // InternalGame.g:715:2: rule__Scene__Group_2__4__Impl
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
    // InternalGame.g:721:1: rule__Scene__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Scene__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:725:1: ( ( ')' ) )
            // InternalGame.g:726:1: ( ')' )
            {
            // InternalGame.g:726:1: ( ')' )
            // InternalGame.g:727:2: ')'
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
    // InternalGame.g:737:1: rule__Scene__Group_2_3__0 : rule__Scene__Group_2_3__0__Impl rule__Scene__Group_2_3__1 ;
    public final void rule__Scene__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:741:1: ( rule__Scene__Group_2_3__0__Impl rule__Scene__Group_2_3__1 )
            // InternalGame.g:742:2: rule__Scene__Group_2_3__0__Impl rule__Scene__Group_2_3__1
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
    // InternalGame.g:749:1: rule__Scene__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Scene__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:753:1: ( ( ',' ) )
            // InternalGame.g:754:1: ( ',' )
            {
            // InternalGame.g:754:1: ( ',' )
            // InternalGame.g:755:2: ','
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
    // InternalGame.g:764:1: rule__Scene__Group_2_3__1 : rule__Scene__Group_2_3__1__Impl ;
    public final void rule__Scene__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:768:1: ( rule__Scene__Group_2_3__1__Impl )
            // InternalGame.g:769:2: rule__Scene__Group_2_3__1__Impl
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
    // InternalGame.g:775:1: rule__Scene__Group_2_3__1__Impl : ( ( rule__Scene__ObjectsAssignment_2_3_1 ) ) ;
    public final void rule__Scene__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:779:1: ( ( ( rule__Scene__ObjectsAssignment_2_3_1 ) ) )
            // InternalGame.g:780:1: ( ( rule__Scene__ObjectsAssignment_2_3_1 ) )
            {
            // InternalGame.g:780:1: ( ( rule__Scene__ObjectsAssignment_2_3_1 ) )
            // InternalGame.g:781:2: ( rule__Scene__ObjectsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsAssignment_2_3_1()); 
            }
            // InternalGame.g:782:2: ( rule__Scene__ObjectsAssignment_2_3_1 )
            // InternalGame.g:782:3: rule__Scene__ObjectsAssignment_2_3_1
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
    // InternalGame.g:791:1: rule__Scene__Group_5__0 : rule__Scene__Group_5__0__Impl rule__Scene__Group_5__1 ;
    public final void rule__Scene__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:795:1: ( rule__Scene__Group_5__0__Impl rule__Scene__Group_5__1 )
            // InternalGame.g:796:2: rule__Scene__Group_5__0__Impl rule__Scene__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:803:1: rule__Scene__Group_5__0__Impl : ( 'actions' ) ;
    public final void rule__Scene__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:807:1: ( ( 'actions' ) )
            // InternalGame.g:808:1: ( 'actions' )
            {
            // InternalGame.g:808:1: ( 'actions' )
            // InternalGame.g:809:2: 'actions'
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
    // InternalGame.g:818:1: rule__Scene__Group_5__1 : rule__Scene__Group_5__1__Impl rule__Scene__Group_5__2 ;
    public final void rule__Scene__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:822:1: ( rule__Scene__Group_5__1__Impl rule__Scene__Group_5__2 )
            // InternalGame.g:823:2: rule__Scene__Group_5__1__Impl rule__Scene__Group_5__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:830:1: rule__Scene__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Scene__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:834:1: ( ( '(' ) )
            // InternalGame.g:835:1: ( '(' )
            {
            // InternalGame.g:835:1: ( '(' )
            // InternalGame.g:836:2: '('
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
    // InternalGame.g:845:1: rule__Scene__Group_5__2 : rule__Scene__Group_5__2__Impl rule__Scene__Group_5__3 ;
    public final void rule__Scene__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:849:1: ( rule__Scene__Group_5__2__Impl rule__Scene__Group_5__3 )
            // InternalGame.g:850:2: rule__Scene__Group_5__2__Impl rule__Scene__Group_5__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGame.g:857:1: rule__Scene__Group_5__2__Impl : ( ( rule__Scene__ActionsAssignment_5_2 ) ) ;
    public final void rule__Scene__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:861:1: ( ( ( rule__Scene__ActionsAssignment_5_2 ) ) )
            // InternalGame.g:862:1: ( ( rule__Scene__ActionsAssignment_5_2 ) )
            {
            // InternalGame.g:862:1: ( ( rule__Scene__ActionsAssignment_5_2 ) )
            // InternalGame.g:863:2: ( rule__Scene__ActionsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsAssignment_5_2()); 
            }
            // InternalGame.g:864:2: ( rule__Scene__ActionsAssignment_5_2 )
            // InternalGame.g:864:3: rule__Scene__ActionsAssignment_5_2
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
    // InternalGame.g:872:1: rule__Scene__Group_5__3 : rule__Scene__Group_5__3__Impl rule__Scene__Group_5__4 ;
    public final void rule__Scene__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:876:1: ( rule__Scene__Group_5__3__Impl rule__Scene__Group_5__4 )
            // InternalGame.g:877:2: rule__Scene__Group_5__3__Impl rule__Scene__Group_5__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalGame.g:884:1: rule__Scene__Group_5__3__Impl : ( ( rule__Scene__Group_5_3__0 )* ) ;
    public final void rule__Scene__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:888:1: ( ( ( rule__Scene__Group_5_3__0 )* ) )
            // InternalGame.g:889:1: ( ( rule__Scene__Group_5_3__0 )* )
            {
            // InternalGame.g:889:1: ( ( rule__Scene__Group_5_3__0 )* )
            // InternalGame.g:890:2: ( rule__Scene__Group_5_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getGroup_5_3()); 
            }
            // InternalGame.g:891:2: ( rule__Scene__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:891:3: rule__Scene__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scene__Group_5_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalGame.g:899:1: rule__Scene__Group_5__4 : rule__Scene__Group_5__4__Impl ;
    public final void rule__Scene__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:903:1: ( rule__Scene__Group_5__4__Impl )
            // InternalGame.g:904:2: rule__Scene__Group_5__4__Impl
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
    // InternalGame.g:910:1: rule__Scene__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Scene__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:914:1: ( ( ')' ) )
            // InternalGame.g:915:1: ( ')' )
            {
            // InternalGame.g:915:1: ( ')' )
            // InternalGame.g:916:2: ')'
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
    // InternalGame.g:926:1: rule__Scene__Group_5_3__0 : rule__Scene__Group_5_3__0__Impl rule__Scene__Group_5_3__1 ;
    public final void rule__Scene__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:930:1: ( rule__Scene__Group_5_3__0__Impl rule__Scene__Group_5_3__1 )
            // InternalGame.g:931:2: rule__Scene__Group_5_3__0__Impl rule__Scene__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:938:1: rule__Scene__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Scene__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:942:1: ( ( ',' ) )
            // InternalGame.g:943:1: ( ',' )
            {
            // InternalGame.g:943:1: ( ',' )
            // InternalGame.g:944:2: ','
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
    // InternalGame.g:953:1: rule__Scene__Group_5_3__1 : rule__Scene__Group_5_3__1__Impl ;
    public final void rule__Scene__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:957:1: ( rule__Scene__Group_5_3__1__Impl )
            // InternalGame.g:958:2: rule__Scene__Group_5_3__1__Impl
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
    // InternalGame.g:964:1: rule__Scene__Group_5_3__1__Impl : ( ( rule__Scene__ActionsAssignment_5_3_1 ) ) ;
    public final void rule__Scene__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:968:1: ( ( ( rule__Scene__ActionsAssignment_5_3_1 ) ) )
            // InternalGame.g:969:1: ( ( rule__Scene__ActionsAssignment_5_3_1 ) )
            {
            // InternalGame.g:969:1: ( ( rule__Scene__ActionsAssignment_5_3_1 ) )
            // InternalGame.g:970:2: ( rule__Scene__ActionsAssignment_5_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getActionsAssignment_5_3_1()); 
            }
            // InternalGame.g:971:2: ( rule__Scene__ActionsAssignment_5_3_1 )
            // InternalGame.g:971:3: rule__Scene__ActionsAssignment_5_3_1
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
    // InternalGame.g:980:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:984:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:985:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:992:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:996:1: ( ( 'object' ) )
            // InternalGame.g:997:1: ( 'object' )
            {
            // InternalGame.g:997:1: ( 'object' )
            // InternalGame.g:998:2: 'object'
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
    // InternalGame.g:1007:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1011:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1012:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGame.g:1019:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1023:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalGame.g:1024:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalGame.g:1024:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalGame.g:1025:2: ( rule__Object__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:1026:2: ( rule__Object__NameAssignment_1 )
            // InternalGame.g:1026:3: rule__Object__NameAssignment_1
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
    // InternalGame.g:1034:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1038:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1039:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalGame.g:1046:1: rule__Object__Group__2__Impl : ( 'description' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1050:1: ( ( 'description' ) )
            // InternalGame.g:1051:1: ( 'description' )
            {
            // InternalGame.g:1051:1: ( 'description' )
            // InternalGame.g:1052:2: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getDescriptionKeyword_2()); 
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
    // InternalGame.g:1061:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1065:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1066:2: rule__Object__Group__3__Impl rule__Object__Group__4
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
    // InternalGame.g:1073:1: rule__Object__Group__3__Impl : ( ( rule__Object__DescriptionAssignment_3 ) ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1077:1: ( ( ( rule__Object__DescriptionAssignment_3 ) ) )
            // InternalGame.g:1078:1: ( ( rule__Object__DescriptionAssignment_3 ) )
            {
            // InternalGame.g:1078:1: ( ( rule__Object__DescriptionAssignment_3 ) )
            // InternalGame.g:1079:2: ( rule__Object__DescriptionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionAssignment_3()); 
            }
            // InternalGame.g:1080:2: ( rule__Object__DescriptionAssignment_3 )
            // InternalGame.g:1080:3: rule__Object__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Object__DescriptionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getDescriptionAssignment_3()); 
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
    // InternalGame.g:1088:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1092:1: ( rule__Object__Group__4__Impl )
            // InternalGame.g:1093:2: rule__Object__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__4__Impl();

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
    // InternalGame.g:1099:1: rule__Object__Group__4__Impl : ( 'end' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1103:1: ( ( 'end' ) )
            // InternalGame.g:1104:1: ( 'end' )
            {
            // InternalGame.g:1104:1: ( 'end' )
            // InternalGame.g:1105:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEndKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEndKeyword_4()); 
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalGame.g:1115:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1119:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalGame.g:1120:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalGame.g:1127:1: rule__Step__Group__0__Impl : ( ( rule__Step__ActionAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1131:1: ( ( ( rule__Step__ActionAssignment_0 ) ) )
            // InternalGame.g:1132:1: ( ( rule__Step__ActionAssignment_0 ) )
            {
            // InternalGame.g:1132:1: ( ( rule__Step__ActionAssignment_0 ) )
            // InternalGame.g:1133:2: ( rule__Step__ActionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getActionAssignment_0()); 
            }
            // InternalGame.g:1134:2: ( rule__Step__ActionAssignment_0 )
            // InternalGame.g:1134:3: rule__Step__ActionAssignment_0
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
    // InternalGame.g:1142:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1146:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalGame.g:1147:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:1154:1: rule__Step__Group__1__Impl : ( ( rule__Step__TargetObjectAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1158:1: ( ( ( rule__Step__TargetObjectAssignment_1 ) ) )
            // InternalGame.g:1159:1: ( ( rule__Step__TargetObjectAssignment_1 ) )
            {
            // InternalGame.g:1159:1: ( ( rule__Step__TargetObjectAssignment_1 ) )
            // InternalGame.g:1160:2: ( rule__Step__TargetObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectAssignment_1()); 
            }
            // InternalGame.g:1161:2: ( rule__Step__TargetObjectAssignment_1 )
            // InternalGame.g:1161:3: rule__Step__TargetObjectAssignment_1
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
    // InternalGame.g:1169:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1173:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalGame.g:1174:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:1181:1: rule__Step__Group__2__Impl : ( ( rule__Step__Group_2__0 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1185:1: ( ( ( rule__Step__Group_2__0 )? ) )
            // InternalGame.g:1186:1: ( ( rule__Step__Group_2__0 )? )
            {
            // InternalGame.g:1186:1: ( ( rule__Step__Group_2__0 )? )
            // InternalGame.g:1187:2: ( rule__Step__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getGroup_2()); 
            }
            // InternalGame.g:1188:2: ( rule__Step__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=15 && LA9_0<=16)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:1188:3: rule__Step__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getGroup_2()); 
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
    // InternalGame.g:1196:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1200:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalGame.g:1201:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1208:1: rule__Step__Group__3__Impl : ( 'if' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1212:1: ( ( 'if' ) )
            // InternalGame.g:1213:1: ( 'if' )
            {
            // InternalGame.g:1213:1: ( 'if' )
            // InternalGame.g:1214:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getIfKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getIfKeyword_3()); 
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
    // InternalGame.g:1223:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1227:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalGame.g:1228:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1235:1: rule__Step__Group__4__Impl : ( ( rule__Step__UnorderedGroup_4 ) ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1239:1: ( ( ( rule__Step__UnorderedGroup_4 ) ) )
            // InternalGame.g:1240:1: ( ( rule__Step__UnorderedGroup_4 ) )
            {
            // InternalGame.g:1240:1: ( ( rule__Step__UnorderedGroup_4 ) )
            // InternalGame.g:1241:2: ( rule__Step__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getUnorderedGroup_4()); 
            }
            // InternalGame.g:1242:2: ( rule__Step__UnorderedGroup_4 )
            // InternalGame.g:1242:3: rule__Step__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__Step__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getUnorderedGroup_4()); 
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
    // InternalGame.g:1250:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1254:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // InternalGame.g:1255:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1262:1: rule__Step__Group__5__Impl : ( 'then' ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1266:1: ( ( 'then' ) )
            // InternalGame.g:1267:1: ( 'then' )
            {
            // InternalGame.g:1267:1: ( 'then' )
            // InternalGame.g:1268:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getThenKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getThenKeyword_5()); 
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
    // InternalGame.g:1277:1: rule__Step__Group__6 : rule__Step__Group__6__Impl ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1281:1: ( rule__Step__Group__6__Impl )
            // InternalGame.g:1282:2: rule__Step__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__6__Impl();

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
    // InternalGame.g:1288:1: rule__Step__Group__6__Impl : ( ( rule__Step__SceneAssignment_6 ) ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1292:1: ( ( ( rule__Step__SceneAssignment_6 ) ) )
            // InternalGame.g:1293:1: ( ( rule__Step__SceneAssignment_6 ) )
            {
            // InternalGame.g:1293:1: ( ( rule__Step__SceneAssignment_6 ) )
            // InternalGame.g:1294:2: ( rule__Step__SceneAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneAssignment_6()); 
            }
            // InternalGame.g:1295:2: ( rule__Step__SceneAssignment_6 )
            // InternalGame.g:1295:3: rule__Step__SceneAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Step__SceneAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneAssignment_6()); 
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


    // $ANTLR start "rule__Step__Group_2__0"
    // InternalGame.g:1304:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1308:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalGame.g:1309:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1();

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
    // $ANTLR end "rule__Step__Group_2__0"


    // $ANTLR start "rule__Step__Group_2__0__Impl"
    // InternalGame.g:1316:1: rule__Step__Group_2__0__Impl : ( ( rule__Step__PrepositionAssignment_2_0 ) ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1320:1: ( ( ( rule__Step__PrepositionAssignment_2_0 ) ) )
            // InternalGame.g:1321:1: ( ( rule__Step__PrepositionAssignment_2_0 ) )
            {
            // InternalGame.g:1321:1: ( ( rule__Step__PrepositionAssignment_2_0 ) )
            // InternalGame.g:1322:2: ( rule__Step__PrepositionAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getPrepositionAssignment_2_0()); 
            }
            // InternalGame.g:1323:2: ( rule__Step__PrepositionAssignment_2_0 )
            // InternalGame.g:1323:3: rule__Step__PrepositionAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__PrepositionAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getPrepositionAssignment_2_0()); 
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
    // $ANTLR end "rule__Step__Group_2__0__Impl"


    // $ANTLR start "rule__Step__Group_2__1"
    // InternalGame.g:1331:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1335:1: ( rule__Step__Group_2__1__Impl )
            // InternalGame.g:1336:2: rule__Step__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1__Impl();

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
    // $ANTLR end "rule__Step__Group_2__1"


    // $ANTLR start "rule__Step__Group_2__1__Impl"
    // InternalGame.g:1342:1: rule__Step__Group_2__1__Impl : ( ( rule__Step__OtherObjectAssignment_2_1 ) ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1346:1: ( ( ( rule__Step__OtherObjectAssignment_2_1 ) ) )
            // InternalGame.g:1347:1: ( ( rule__Step__OtherObjectAssignment_2_1 ) )
            {
            // InternalGame.g:1347:1: ( ( rule__Step__OtherObjectAssignment_2_1 ) )
            // InternalGame.g:1348:2: ( rule__Step__OtherObjectAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getOtherObjectAssignment_2_1()); 
            }
            // InternalGame.g:1349:2: ( rule__Step__OtherObjectAssignment_2_1 )
            // InternalGame.g:1349:3: rule__Step__OtherObjectAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__OtherObjectAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getOtherObjectAssignment_2_1()); 
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
    // $ANTLR end "rule__Step__Group_2__1__Impl"


    // $ANTLR start "rule__Step__Group_4_0__0"
    // InternalGame.g:1358:1: rule__Step__Group_4_0__0 : rule__Step__Group_4_0__0__Impl rule__Step__Group_4_0__1 ;
    public final void rule__Step__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1362:1: ( rule__Step__Group_4_0__0__Impl rule__Step__Group_4_0__1 )
            // InternalGame.g:1363:2: rule__Step__Group_4_0__0__Impl rule__Step__Group_4_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Step__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group_4_0__1();

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
    // $ANTLR end "rule__Step__Group_4_0__0"


    // $ANTLR start "rule__Step__Group_4_0__0__Impl"
    // InternalGame.g:1370:1: rule__Step__Group_4_0__0__Impl : ( 'valid' ) ;
    public final void rule__Step__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1374:1: ( ( 'valid' ) )
            // InternalGame.g:1375:1: ( 'valid' )
            {
            // InternalGame.g:1375:1: ( 'valid' )
            // InternalGame.g:1376:2: 'valid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidKeyword_4_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidKeyword_4_0_0()); 
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
    // $ANTLR end "rule__Step__Group_4_0__0__Impl"


    // $ANTLR start "rule__Step__Group_4_0__1"
    // InternalGame.g:1385:1: rule__Step__Group_4_0__1 : rule__Step__Group_4_0__1__Impl ;
    public final void rule__Step__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1389:1: ( rule__Step__Group_4_0__1__Impl )
            // InternalGame.g:1390:2: rule__Step__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__Step__Group_4_0__1"


    // $ANTLR start "rule__Step__Group_4_0__1__Impl"
    // InternalGame.g:1396:1: rule__Step__Group_4_0__1__Impl : ( ( rule__Step__ValidAssignment_4_0_1 ) ) ;
    public final void rule__Step__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1400:1: ( ( ( rule__Step__ValidAssignment_4_0_1 ) ) )
            // InternalGame.g:1401:1: ( ( rule__Step__ValidAssignment_4_0_1 ) )
            {
            // InternalGame.g:1401:1: ( ( rule__Step__ValidAssignment_4_0_1 ) )
            // InternalGame.g:1402:2: ( rule__Step__ValidAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidAssignment_4_0_1()); 
            }
            // InternalGame.g:1403:2: ( rule__Step__ValidAssignment_4_0_1 )
            // InternalGame.g:1403:3: rule__Step__ValidAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__ValidAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidAssignment_4_0_1()); 
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
    // $ANTLR end "rule__Step__Group_4_0__1__Impl"


    // $ANTLR start "rule__Step__Group_4_1__0"
    // InternalGame.g:1412:1: rule__Step__Group_4_1__0 : rule__Step__Group_4_1__0__Impl rule__Step__Group_4_1__1 ;
    public final void rule__Step__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1416:1: ( rule__Step__Group_4_1__0__Impl rule__Step__Group_4_1__1 )
            // InternalGame.g:1417:2: rule__Step__Group_4_1__0__Impl rule__Step__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Step__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group_4_1__1();

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
    // $ANTLR end "rule__Step__Group_4_1__0"


    // $ANTLR start "rule__Step__Group_4_1__0__Impl"
    // InternalGame.g:1424:1: rule__Step__Group_4_1__0__Impl : ( 'default' ) ;
    public final void rule__Step__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1428:1: ( ( 'default' ) )
            // InternalGame.g:1429:1: ( 'default' )
            {
            // InternalGame.g:1429:1: ( 'default' )
            // InternalGame.g:1430:2: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getDefaultKeyword_4_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getDefaultKeyword_4_1_0()); 
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
    // $ANTLR end "rule__Step__Group_4_1__0__Impl"


    // $ANTLR start "rule__Step__Group_4_1__1"
    // InternalGame.g:1439:1: rule__Step__Group_4_1__1 : rule__Step__Group_4_1__1__Impl ;
    public final void rule__Step__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1443:1: ( rule__Step__Group_4_1__1__Impl )
            // InternalGame.g:1444:2: rule__Step__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Step__Group_4_1__1"


    // $ANTLR start "rule__Step__Group_4_1__1__Impl"
    // InternalGame.g:1450:1: rule__Step__Group_4_1__1__Impl : ( ( rule__Step__DefaultAssignment_4_1_1 ) ) ;
    public final void rule__Step__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1454:1: ( ( ( rule__Step__DefaultAssignment_4_1_1 ) ) )
            // InternalGame.g:1455:1: ( ( rule__Step__DefaultAssignment_4_1_1 ) )
            {
            // InternalGame.g:1455:1: ( ( rule__Step__DefaultAssignment_4_1_1 ) )
            // InternalGame.g:1456:2: ( rule__Step__DefaultAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getDefaultAssignment_4_1_1()); 
            }
            // InternalGame.g:1457:2: ( rule__Step__DefaultAssignment_4_1_1 )
            // InternalGame.g:1457:3: rule__Step__DefaultAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__DefaultAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getDefaultAssignment_4_1_1()); 
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
    // $ANTLR end "rule__Step__Group_4_1__1__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup"
    // InternalGame.g:1466:1: rule__Adventure__UnorderedGroup : rule__Adventure__UnorderedGroup__0 {...}?;
    public final void rule__Adventure__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup());
        	
        try {
            // InternalGame.g:1471:1: ( rule__Adventure__UnorderedGroup__0 {...}?)
            // InternalGame.g:1472:2: rule__Adventure__UnorderedGroup__0 {...}?
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
    // InternalGame.g:1480:1: rule__Adventure__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) ) ;
    public final void rule__Adventure__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGame.g:1485:1: ( ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) ) )
            // InternalGame.g:1486:3: ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) )
            {
            // InternalGame.g:1486:3: ( ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt11=2;
            }
            else if ( ( LA11_0 == 19 || LA11_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt11=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:1487:3: ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) )
                    {
                    // InternalGame.g:1487:3: ({...}? => ( ( ( rule__Adventure__Group_0__0 ) ) ) )
                    // InternalGame.g:1488:4: {...}? => ( ( ( rule__Adventure__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalGame.g:1488:103: ( ( ( rule__Adventure__Group_0__0 ) ) )
                    // InternalGame.g:1489:5: ( ( rule__Adventure__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalGame.g:1495:5: ( ( rule__Adventure__Group_0__0 ) )
                    // InternalGame.g:1496:6: ( rule__Adventure__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1497:6: ( rule__Adventure__Group_0__0 )
                    // InternalGame.g:1497:7: rule__Adventure__Group_0__0
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
                    // InternalGame.g:1502:3: ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) )
                    {
                    // InternalGame.g:1502:3: ({...}? => ( ( ( rule__Adventure__Group_1__0 ) ) ) )
                    // InternalGame.g:1503:4: {...}? => ( ( ( rule__Adventure__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalGame.g:1503:103: ( ( ( rule__Adventure__Group_1__0 ) ) )
                    // InternalGame.g:1504:5: ( ( rule__Adventure__Group_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalGame.g:1510:5: ( ( rule__Adventure__Group_1__0 ) )
                    // InternalGame.g:1511:6: ( rule__Adventure__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1512:6: ( rule__Adventure__Group_1__0 )
                    // InternalGame.g:1512:7: rule__Adventure__Group_1__0
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
                    // InternalGame.g:1517:3: ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) )
                    {
                    // InternalGame.g:1517:3: ({...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) ) )
                    // InternalGame.g:1518:4: {...}? => ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalGame.g:1518:103: ( ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) ) )
                    // InternalGame.g:1519:5: ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalGame.g:1525:5: ( ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* ) )
                    // InternalGame.g:1526:6: ( ( rule__Adventure__IngredientsAssignment_2 ) ) ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* )
                    {
                    // InternalGame.g:1526:6: ( ( rule__Adventure__IngredientsAssignment_2 ) )
                    // InternalGame.g:1527:7: ( rule__Adventure__IngredientsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }
                    // InternalGame.g:1528:7: ( rule__Adventure__IngredientsAssignment_2 )
                    // InternalGame.g:1528:8: rule__Adventure__IngredientsAssignment_2
                    {
                    pushFollow(FOLLOW_17);
                    rule__Adventure__IngredientsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }

                    }

                    // InternalGame.g:1531:6: ( ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )* )
                    // InternalGame.g:1532:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getIngredientsAssignment_2()); 
                    }
                    // InternalGame.g:1533:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*
                    loop10:
                    do {
                        int alt10=2;
                        alt10 = dfa10.predict(input);
                        switch (alt10) {
                    	case 1 :
                    	    // InternalGame.g:1533:8: ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_17);
                    	    rule__Adventure__IngredientsAssignment_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // InternalGame.g:1547:1: rule__Adventure__UnorderedGroup__0 : rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )? ;
    public final void rule__Adventure__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1551:1: ( rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )? )
            // InternalGame.g:1552:2: rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_18);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:1553:2: ( rule__Adventure__UnorderedGroup__1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt12=1;
            }
            else if ( ( LA12_0 == 19 || LA12_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1553:2: rule__Adventure__UnorderedGroup__1
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
    // InternalGame.g:1559:1: rule__Adventure__UnorderedGroup__1 : rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )? ;
    public final void rule__Adventure__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1563:1: ( rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )? )
            // InternalGame.g:1564:2: rule__Adventure__UnorderedGroup__Impl ( rule__Adventure__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_18);
            rule__Adventure__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:1565:2: ( rule__Adventure__UnorderedGroup__2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 1) ) {
                alt13=1;
            }
            else if ( ( LA13_0 == 19 || LA13_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup(), 2) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:1565:2: rule__Adventure__UnorderedGroup__2
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
    // InternalGame.g:1571:1: rule__Adventure__UnorderedGroup__2 : rule__Adventure__UnorderedGroup__Impl ;
    public final void rule__Adventure__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1575:1: ( rule__Adventure__UnorderedGroup__Impl )
            // InternalGame.g:1576:2: rule__Adventure__UnorderedGroup__Impl
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


    // $ANTLR start "rule__Step__UnorderedGroup_4"
    // InternalGame.g:1583:1: rule__Step__UnorderedGroup_4 : rule__Step__UnorderedGroup_4__0 {...}?;
    public final void rule__Step__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_4());
        	
        try {
            // InternalGame.g:1588:1: ( rule__Step__UnorderedGroup_4__0 {...}?)
            // InternalGame.g:1589:2: rule__Step__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Step__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStepAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Step__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getStepAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__UnorderedGroup_4"


    // $ANTLR start "rule__Step__UnorderedGroup_4__Impl"
    // InternalGame.g:1597:1: rule__Step__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Step__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Step__Group_4_1__0 ) ) ) ) ) ;
    public final void rule__Step__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGame.g:1602:1: ( ( ({...}? => ( ( ( rule__Step__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Step__Group_4_1__0 ) ) ) ) ) )
            // InternalGame.g:1603:3: ( ({...}? => ( ( ( rule__Step__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Step__Group_4_1__0 ) ) ) ) )
            {
            // InternalGame.g:1603:3: ( ({...}? => ( ( ( rule__Step__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Step__Group_4_1__0 ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:1604:3: ({...}? => ( ( ( rule__Step__Group_4_0__0 ) ) ) )
                    {
                    // InternalGame.g:1604:3: ({...}? => ( ( ( rule__Step__Group_4_0__0 ) ) ) )
                    // InternalGame.g:1605:4: {...}? => ( ( ( rule__Step__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Step__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalGame.g:1605:100: ( ( ( rule__Step__Group_4_0__0 ) ) )
                    // InternalGame.g:1606:5: ( ( rule__Step__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalGame.g:1612:5: ( ( rule__Step__Group_4_0__0 ) )
                    // InternalGame.g:1613:6: ( rule__Step__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepAccess().getGroup_4_0()); 
                    }
                    // InternalGame.g:1614:6: ( rule__Step__Group_4_0__0 )
                    // InternalGame.g:1614:7: rule__Step__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepAccess().getGroup_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1619:3: ({...}? => ( ( ( rule__Step__Group_4_1__0 ) ) ) )
                    {
                    // InternalGame.g:1619:3: ({...}? => ( ( ( rule__Step__Group_4_1__0 ) ) ) )
                    // InternalGame.g:1620:4: {...}? => ( ( ( rule__Step__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Step__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalGame.g:1620:100: ( ( ( rule__Step__Group_4_1__0 ) ) )
                    // InternalGame.g:1621:5: ( ( rule__Step__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalGame.g:1627:5: ( ( rule__Step__Group_4_1__0 ) )
                    // InternalGame.g:1628:6: ( rule__Step__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepAccess().getGroup_4_1()); 
                    }
                    // InternalGame.g:1629:6: ( rule__Step__Group_4_1__0 )
                    // InternalGame.g:1629:7: rule__Step__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepAccess().getGroup_4_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Step__UnorderedGroup_4__0"
    // InternalGame.g:1642:1: rule__Step__UnorderedGroup_4__0 : rule__Step__UnorderedGroup_4__Impl ( rule__Step__UnorderedGroup_4__1 )? ;
    public final void rule__Step__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1646:1: ( rule__Step__UnorderedGroup_4__Impl ( rule__Step__UnorderedGroup_4__1 )? )
            // InternalGame.g:1647:2: rule__Step__UnorderedGroup_4__Impl ( rule__Step__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_19);
            rule__Step__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGame.g:1648:2: ( rule__Step__UnorderedGroup_4__1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_4(), 1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:1648:2: rule__Step__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__Step__UnorderedGroup_4__0"


    // $ANTLR start "rule__Step__UnorderedGroup_4__1"
    // InternalGame.g:1654:1: rule__Step__UnorderedGroup_4__1 : rule__Step__UnorderedGroup_4__Impl ;
    public final void rule__Step__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1658:1: ( rule__Step__UnorderedGroup_4__Impl )
            // InternalGame.g:1659:2: rule__Step__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__Step__UnorderedGroup_4__1"


    // $ANTLR start "rule__Adventure__StartSceneAssignment_0_1"
    // InternalGame.g:1666:1: rule__Adventure__StartSceneAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adventure__StartSceneAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1670:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1671:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1671:2: ( ( RULE_ID ) )
            // InternalGame.g:1672:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartSceneSceneCrossReference_0_1_0()); 
            }
            // InternalGame.g:1673:3: ( RULE_ID )
            // InternalGame.g:1674:4: RULE_ID
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
    // InternalGame.g:1685:1: rule__Adventure__EndSceneAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adventure__EndSceneAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1689:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1690:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1690:2: ( ( RULE_ID ) )
            // InternalGame.g:1691:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getEndSceneSceneCrossReference_1_1_0()); 
            }
            // InternalGame.g:1692:3: ( RULE_ID )
            // InternalGame.g:1693:4: RULE_ID
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
    // InternalGame.g:1704:1: rule__Adventure__IngredientsAssignment_2 : ( ruleIngredient ) ;
    public final void rule__Adventure__IngredientsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1708:1: ( ( ruleIngredient ) )
            // InternalGame.g:1709:2: ( ruleIngredient )
            {
            // InternalGame.g:1709:2: ( ruleIngredient )
            // InternalGame.g:1710:3: ruleIngredient
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
    // InternalGame.g:1719:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1723:1: ( ( RULE_ID ) )
            // InternalGame.g:1724:2: ( RULE_ID )
            {
            // InternalGame.g:1724:2: ( RULE_ID )
            // InternalGame.g:1725:3: RULE_ID
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
    // InternalGame.g:1734:1: rule__Scene__ObjectsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1738:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1739:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1739:2: ( ( RULE_ID ) )
            // InternalGame.g:1740:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_2_0()); 
            }
            // InternalGame.g:1741:3: ( RULE_ID )
            // InternalGame.g:1742:4: RULE_ID
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
    // InternalGame.g:1753:1: rule__Scene__ObjectsAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__ObjectsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1757:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1758:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1758:2: ( ( RULE_ID ) )
            // InternalGame.g:1759:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneAccess().getObjectsObjectCrossReference_2_3_1_0()); 
            }
            // InternalGame.g:1760:3: ( RULE_ID )
            // InternalGame.g:1761:4: RULE_ID
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
    // InternalGame.g:1772:1: rule__Scene__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Scene__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1776:1: ( ( RULE_STRING ) )
            // InternalGame.g:1777:2: ( RULE_STRING )
            {
            // InternalGame.g:1777:2: ( RULE_STRING )
            // InternalGame.g:1778:3: RULE_STRING
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
    // InternalGame.g:1787:1: rule__Scene__ActionsAssignment_5_2 : ( ruleStep ) ;
    public final void rule__Scene__ActionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1791:1: ( ( ruleStep ) )
            // InternalGame.g:1792:2: ( ruleStep )
            {
            // InternalGame.g:1792:2: ( ruleStep )
            // InternalGame.g:1793:3: ruleStep
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
    // InternalGame.g:1802:1: rule__Scene__ActionsAssignment_5_3_1 : ( ruleStep ) ;
    public final void rule__Scene__ActionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1806:1: ( ( ruleStep ) )
            // InternalGame.g:1807:2: ( ruleStep )
            {
            // InternalGame.g:1807:2: ( ruleStep )
            // InternalGame.g:1808:3: ruleStep
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
    // InternalGame.g:1817:1: rule__Object__NameAssignment_1 : ( ( rule__Object__NameAlternatives_1_0 ) ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1821:1: ( ( ( rule__Object__NameAlternatives_1_0 ) ) )
            // InternalGame.g:1822:2: ( ( rule__Object__NameAlternatives_1_0 ) )
            {
            // InternalGame.g:1822:2: ( ( rule__Object__NameAlternatives_1_0 ) )
            // InternalGame.g:1823:3: ( rule__Object__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAlternatives_1_0()); 
            }
            // InternalGame.g:1824:3: ( rule__Object__NameAlternatives_1_0 )
            // InternalGame.g:1824:4: rule__Object__NameAlternatives_1_0
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


    // $ANTLR start "rule__Object__DescriptionAssignment_3"
    // InternalGame.g:1832:1: rule__Object__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Object__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1836:1: ( ( RULE_STRING ) )
            // InternalGame.g:1837:2: ( RULE_STRING )
            {
            // InternalGame.g:1837:2: ( RULE_STRING )
            // InternalGame.g:1838:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Object__DescriptionAssignment_3"


    // $ANTLR start "rule__Step__ActionAssignment_0"
    // InternalGame.g:1847:1: rule__Step__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Step__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1851:1: ( ( ruleAction ) )
            // InternalGame.g:1852:2: ( ruleAction )
            {
            // InternalGame.g:1852:2: ( ruleAction )
            // InternalGame.g:1853:3: ruleAction
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
    // InternalGame.g:1862:1: rule__Step__TargetObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__TargetObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1866:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1867:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1867:2: ( ( RULE_ID ) )
            // InternalGame.g:1868:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTargetObjectObjectCrossReference_1_0()); 
            }
            // InternalGame.g:1869:3: ( RULE_ID )
            // InternalGame.g:1870:4: RULE_ID
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


    // $ANTLR start "rule__Step__PrepositionAssignment_2_0"
    // InternalGame.g:1881:1: rule__Step__PrepositionAssignment_2_0 : ( rulePreposition ) ;
    public final void rule__Step__PrepositionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1885:1: ( ( rulePreposition ) )
            // InternalGame.g:1886:2: ( rulePreposition )
            {
            // InternalGame.g:1886:2: ( rulePreposition )
            // InternalGame.g:1887:3: rulePreposition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getPrepositionPrepositionEnumRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePreposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getPrepositionPrepositionEnumRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Step__PrepositionAssignment_2_0"


    // $ANTLR start "rule__Step__OtherObjectAssignment_2_1"
    // InternalGame.g:1896:1: rule__Step__OtherObjectAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__OtherObjectAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1900:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1901:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1901:2: ( ( RULE_ID ) )
            // InternalGame.g:1902:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getOtherObjectObjectCrossReference_2_1_0()); 
            }
            // InternalGame.g:1903:3: ( RULE_ID )
            // InternalGame.g:1904:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getOtherObjectObjectIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getOtherObjectObjectIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getOtherObjectObjectCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Step__OtherObjectAssignment_2_1"


    // $ANTLR start "rule__Step__ValidAssignment_4_0_1"
    // InternalGame.g:1915:1: rule__Step__ValidAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__Step__ValidAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1919:1: ( ( RULE_STRING ) )
            // InternalGame.g:1920:2: ( RULE_STRING )
            {
            // InternalGame.g:1920:2: ( RULE_STRING )
            // InternalGame.g:1921:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_4_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getValidSTRINGTerminalRuleCall_4_0_1_0()); 
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
    // $ANTLR end "rule__Step__ValidAssignment_4_0_1"


    // $ANTLR start "rule__Step__DefaultAssignment_4_1_1"
    // InternalGame.g:1930:1: rule__Step__DefaultAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__Step__DefaultAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1934:1: ( ( RULE_STRING ) )
            // InternalGame.g:1935:2: ( RULE_STRING )
            {
            // InternalGame.g:1935:2: ( RULE_STRING )
            // InternalGame.g:1936:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getDefaultSTRINGTerminalRuleCall_4_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getDefaultSTRINGTerminalRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__Step__DefaultAssignment_4_1_1"


    // $ANTLR start "rule__Step__SceneAssignment_6"
    // InternalGame.g:1945:1: rule__Step__SceneAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Step__SceneAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1949:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:1950:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:1950:2: ( ( RULE_ID ) )
            // InternalGame.g:1951:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneSceneCrossReference_6_0()); 
            }
            // InternalGame.g:1952:3: ( RULE_ID )
            // InternalGame.g:1953:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneSceneIDTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSceneSceneCrossReference_6_0()); 
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
    // $ANTLR end "rule__Step__SceneAssignment_6"

    // $ANTLR start synpred1_InternalGame
    public final void synpred1_InternalGame_fragment() throws RecognitionException {   
        // InternalGame.g:1533:8: ( rule__Adventure__IngredientsAssignment_2 )
        // InternalGame.g:1533:9: rule__Adventure__IngredientsAssignment_2
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\76\uffff";
    static final String dfa_2s = "\1\1\75\uffff";
    static final String dfa_3s = "\1\21\1\uffff\1\5\1\4\3\24\1\26\2\4\1\5\2\22\1\27\1\26\2\0\1\5\1\24\1\13\1\uffff\1\27\4\5\1\17\2\5\1\35\1\33\2\4\2\34\2\4\1\5\2\34\1\27\1\13\1\22\4\5\1\17\2\5\1\35\1\33\2\4\2\34\2\4\1\5\2\34\1\27";
    static final String dfa_4s = "\1\32\1\uffff\2\5\1\25\2\24\1\26\2\4\1\5\1\31\1\22\1\30\1\26\2\0\1\5\1\24\1\16\1\uffff\1\30\4\5\1\33\2\5\1\36\1\33\2\4\2\36\2\4\1\5\2\34\1\30\1\16\1\22\4\5\1\33\2\5\1\36\1\33\2\4\2\36\2\4\1\5\2\34\1\30";
    static final String dfa_5s = "\1\uffff\1\2\22\uffff\1\1\51\uffff";
    static final String dfa_6s = "\17\uffff\1\0\1\1\55\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\6\uffff\1\3",
            "",
            "\1\4",
            "\1\5\1\6",
            "\1\10\1\7",
            "\1\11",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\17\6\uffff\1\16",
            "\1\20",
            "\1\22\1\21",
            "\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\25",
            "\1\10",
            "\1\26\1\27\1\30\1\31",
            "",
            "\1\22\1\21",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\33\1\34\12\uffff\1\35",
            "\1\36",
            "\1\36",
            "\1\37\1\40",
            "\1\35",
            "\1\41",
            "\1\42",
            "\1\45\1\43\1\44",
            "\1\45\1\43\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\45",
            "\1\45",
            "\1\52\1\51",
            "\1\53\1\54\1\55\1\56",
            "\1\17",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\60\1\61\12\uffff\1\62",
            "\1\63",
            "\1\63",
            "\1\64\1\65",
            "\1\62",
            "\1\66",
            "\1\67",
            "\1\72\1\70\1\71",
            "\1\72\1\70\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\72",
            "\1\72",
            "\1\52\1\51"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1533:7: ( ( rule__Adventure__IngredientsAssignment_2 )=> rule__Adventure__IngredientsAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_15 = input.LA(1);

                         
                        int index10_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_16 = input.LA(1);

                         
                        int index10_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGame()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000040E0002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000002L});

}
