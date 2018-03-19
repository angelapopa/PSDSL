package uibk.dsl.assignment1.ide.contentassist.antlr.internal;

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
import uibk.dsl.assignment1.services.JsonldConverterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJsonldConverterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_DATE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "','", "':'", "'enum'", "'='", "'list'", "'one'"
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

    	public void setGrammarAccess(JsonldConverterGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalJsonldConverter.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:54:1: ( ruleModel EOF )
            // InternalJsonldConverter.g:55:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJsonldConverter.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalJsonldConverter.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalJsonldConverter.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalJsonldConverter.g:68:3: ( rule__Model__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment()); 
            }
            // InternalJsonldConverter.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonldConverter.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsAssignment()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalJsonldConverter.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:79:1: ( ruleType EOF )
            // InternalJsonldConverter.g:80:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalJsonldConverter.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalJsonldConverter.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalJsonldConverter.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalJsonldConverter.g:93:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalJsonldConverter.g:94:3: ( rule__Type__Alternatives )
            // InternalJsonldConverter.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalJsonldConverter.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:104:1: ( ruleDataType EOF )
            // InternalJsonldConverter.g:105:1: ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalJsonldConverter.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalJsonldConverter.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalJsonldConverter.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalJsonldConverter.g:118:3: ( rule__DataType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getGroup()); 
            }
            // InternalJsonldConverter.g:119:3: ( rule__DataType__Group__0 )
            // InternalJsonldConverter.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalJsonldConverter.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:129:1: ( ruleEntity EOF )
            // InternalJsonldConverter.g:130:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalJsonldConverter.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalJsonldConverter.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalJsonldConverter.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalJsonldConverter.g:143:3: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // InternalJsonldConverter.g:144:3: ( rule__Entity__Group__0 )
            // InternalJsonldConverter.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalJsonldConverter.g:153:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:154:1: ( ruleProperty EOF )
            // InternalJsonldConverter.g:155:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJsonldConverter.g:162:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:166:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalJsonldConverter.g:167:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalJsonldConverter.g:167:2: ( ( rule__Property__Group__0 ) )
            // InternalJsonldConverter.g:168:3: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalJsonldConverter.g:169:3: ( rule__Property__Group__0 )
            // InternalJsonldConverter.g:169:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEnum"
    // InternalJsonldConverter.g:178:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:179:1: ( ruleEnum EOF )
            // InternalJsonldConverter.g:180:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalJsonldConverter.g:187:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:191:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalJsonldConverter.g:192:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalJsonldConverter.g:192:2: ( ( rule__Enum__Group__0 ) )
            // InternalJsonldConverter.g:193:3: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // InternalJsonldConverter.g:194:3: ( rule__Enum__Group__0 )
            // InternalJsonldConverter.g:194:4: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup()); 
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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumItem"
    // InternalJsonldConverter.g:203:1: entryRuleEnumItem : ruleEnumItem EOF ;
    public final void entryRuleEnumItem() throws RecognitionException {
        try {
            // InternalJsonldConverter.g:204:1: ( ruleEnumItem EOF )
            // InternalJsonldConverter.g:205:1: ruleEnumItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemRule()); 
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
    // $ANTLR end "entryRuleEnumItem"


    // $ANTLR start "ruleEnumItem"
    // InternalJsonldConverter.g:212:1: ruleEnumItem : ( ( rule__EnumItem__Group__0 ) ) ;
    public final void ruleEnumItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:216:2: ( ( ( rule__EnumItem__Group__0 ) ) )
            // InternalJsonldConverter.g:217:2: ( ( rule__EnumItem__Group__0 ) )
            {
            // InternalJsonldConverter.g:217:2: ( ( rule__EnumItem__Group__0 ) )
            // InternalJsonldConverter.g:218:3: ( rule__EnumItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemAccess().getGroup()); 
            }
            // InternalJsonldConverter.g:219:3: ( rule__EnumItem__Group__0 )
            // InternalJsonldConverter.g:219:4: rule__EnumItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumItem"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalJsonldConverter.g:227:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ruleEnum ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:231:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ruleEnum ) )
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
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonldConverter.g:232:2: ( ruleDataType )
                    {
                    // InternalJsonldConverter.g:232:2: ( ruleDataType )
                    // InternalJsonldConverter.g:233:3: ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonldConverter.g:238:2: ( ruleEntity )
                    {
                    // InternalJsonldConverter.g:238:2: ( ruleEntity )
                    // InternalJsonldConverter.g:239:3: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonldConverter.g:244:2: ( ruleEnum )
                    {
                    // InternalJsonldConverter.g:244:2: ( ruleEnum )
                    // InternalJsonldConverter.g:245:3: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 
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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalJsonldConverter.g:254:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:258:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalJsonldConverter.g:259:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalJsonldConverter.g:266:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:270:1: ( ( 'datatype' ) )
            // InternalJsonldConverter.g:271:1: ( 'datatype' )
            {
            // InternalJsonldConverter.g:271:1: ( 'datatype' )
            // InternalJsonldConverter.g:272:2: 'datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalJsonldConverter.g:281:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:285:1: ( rule__DataType__Group__1__Impl )
            // InternalJsonldConverter.g:286:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalJsonldConverter.g:292:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:296:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalJsonldConverter.g:297:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalJsonldConverter.g:297:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalJsonldConverter.g:298:2: ( rule__DataType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            }
            // InternalJsonldConverter.g:299:2: ( rule__DataType__NameAssignment_1 )
            // InternalJsonldConverter.g:299:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalJsonldConverter.g:308:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:312:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalJsonldConverter.g:313:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalJsonldConverter.g:320:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:324:1: ( ( 'entity' ) )
            // InternalJsonldConverter.g:325:1: ( 'entity' )
            {
            // InternalJsonldConverter.g:325:1: ( 'entity' )
            // InternalJsonldConverter.g:326:2: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalJsonldConverter.g:335:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:339:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalJsonldConverter.g:340:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalJsonldConverter.g:347:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:351:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalJsonldConverter.g:352:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalJsonldConverter.g:352:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalJsonldConverter.g:353:2: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // InternalJsonldConverter.g:354:2: ( rule__Entity__NameAssignment_1 )
            // InternalJsonldConverter.g:354:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalJsonldConverter.g:362:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:366:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalJsonldConverter.g:367:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalJsonldConverter.g:374:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:378:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalJsonldConverter.g:379:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalJsonldConverter.g:379:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalJsonldConverter.g:380:2: ( rule__Entity__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2()); 
            }
            // InternalJsonldConverter.g:381:2: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonldConverter.g:381:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalJsonldConverter.g:389:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:393:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalJsonldConverter.g:394:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalJsonldConverter.g:401:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:405:1: ( ( '{' ) )
            // InternalJsonldConverter.g:406:1: ( '{' )
            {
            // InternalJsonldConverter.g:406:1: ( '{' )
            // InternalJsonldConverter.g:407:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalJsonldConverter.g:416:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:420:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalJsonldConverter.g:421:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalJsonldConverter.g:428:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__UnorderedGroup_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:432:1: ( ( ( rule__Entity__UnorderedGroup_4 )? ) )
            // InternalJsonldConverter.g:433:1: ( ( rule__Entity__UnorderedGroup_4 )? )
            {
            // InternalJsonldConverter.g:433:1: ( ( rule__Entity__UnorderedGroup_4 )? )
            // InternalJsonldConverter.g:434:2: ( rule__Entity__UnorderedGroup_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getUnorderedGroup_4()); 
            }
            // InternalJsonldConverter.g:435:2: ( rule__Entity__UnorderedGroup_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonldConverter.g:435:3: rule__Entity__UnorderedGroup_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__UnorderedGroup_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getUnorderedGroup_4()); 
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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalJsonldConverter.g:443:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:447:1: ( rule__Entity__Group__5__Impl )
            // InternalJsonldConverter.g:448:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalJsonldConverter.g:454:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:458:1: ( ( '}' ) )
            // InternalJsonldConverter.g:459:1: ( '}' )
            {
            // InternalJsonldConverter.g:459:1: ( '}' )
            // InternalJsonldConverter.g:460:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalJsonldConverter.g:470:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:474:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalJsonldConverter.g:475:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalJsonldConverter.g:482:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:486:1: ( ( 'extends' ) )
            // InternalJsonldConverter.g:487:1: ( 'extends' )
            {
            // InternalJsonldConverter.g:487:1: ( 'extends' )
            // InternalJsonldConverter.g:488:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalJsonldConverter.g:497:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:501:1: ( rule__Entity__Group_2__1__Impl )
            // InternalJsonldConverter.g:502:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalJsonldConverter.g:508:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:512:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalJsonldConverter.g:513:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalJsonldConverter.g:513:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalJsonldConverter.g:514:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            }
            // InternalJsonldConverter.g:515:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalJsonldConverter.g:515:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_4_1__0"
    // InternalJsonldConverter.g:524:1: rule__Entity__Group_4_1__0 : rule__Entity__Group_4_1__0__Impl rule__Entity__Group_4_1__1 ;
    public final void rule__Entity__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:528:1: ( rule__Entity__Group_4_1__0__Impl rule__Entity__Group_4_1__1 )
            // InternalJsonldConverter.g:529:2: rule__Entity__Group_4_1__0__Impl rule__Entity__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_1__1();

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
    // $ANTLR end "rule__Entity__Group_4_1__0"


    // $ANTLR start "rule__Entity__Group_4_1__0__Impl"
    // InternalJsonldConverter.g:536:1: rule__Entity__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:540:1: ( ( ',' ) )
            // InternalJsonldConverter.g:541:1: ( ',' )
            {
            // InternalJsonldConverter.g:541:1: ( ',' )
            // InternalJsonldConverter.g:542:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_4_1_0()); 
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
    // $ANTLR end "rule__Entity__Group_4_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_1__1"
    // InternalJsonldConverter.g:551:1: rule__Entity__Group_4_1__1 : rule__Entity__Group_4_1__1__Impl ;
    public final void rule__Entity__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:555:1: ( rule__Entity__Group_4_1__1__Impl )
            // InternalJsonldConverter.g:556:2: rule__Entity__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4_1__1"


    // $ANTLR start "rule__Entity__Group_4_1__1__Impl"
    // InternalJsonldConverter.g:562:1: rule__Entity__Group_4_1__1__Impl : ( ( rule__Entity__FeaturesAssignment_4_1_1 ) ) ;
    public final void rule__Entity__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:566:1: ( ( ( rule__Entity__FeaturesAssignment_4_1_1 ) ) )
            // InternalJsonldConverter.g:567:1: ( ( rule__Entity__FeaturesAssignment_4_1_1 ) )
            {
            // InternalJsonldConverter.g:567:1: ( ( rule__Entity__FeaturesAssignment_4_1_1 ) )
            // InternalJsonldConverter.g:568:2: ( rule__Entity__FeaturesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesAssignment_4_1_1()); 
            }
            // InternalJsonldConverter.g:569:2: ( rule__Entity__FeaturesAssignment_4_1_1 )
            // InternalJsonldConverter.g:569:3: rule__Entity__FeaturesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FeaturesAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesAssignment_4_1_1()); 
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
    // $ANTLR end "rule__Entity__Group_4_1__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalJsonldConverter.g:578:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:582:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalJsonldConverter.g:583:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalJsonldConverter.g:590:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:594:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalJsonldConverter.g:595:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalJsonldConverter.g:595:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalJsonldConverter.g:596:2: ( rule__Property__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            }
            // InternalJsonldConverter.g:597:2: ( rule__Property__NameAssignment_0 )
            // InternalJsonldConverter.g:597:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalJsonldConverter.g:605:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:609:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalJsonldConverter.g:610:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalJsonldConverter.g:617:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:621:1: ( ( ':' ) )
            // InternalJsonldConverter.g:622:1: ( ':' )
            {
            // InternalJsonldConverter.g:622:1: ( ':' )
            // InternalJsonldConverter.g:623:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalJsonldConverter.g:632:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:636:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalJsonldConverter.g:637:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalJsonldConverter.g:644:1: rule__Property__Group__2__Impl : ( ( rule__Property__ManyAssignment_2 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:648:1: ( ( ( rule__Property__ManyAssignment_2 )? ) )
            // InternalJsonldConverter.g:649:1: ( ( rule__Property__ManyAssignment_2 )? )
            {
            // InternalJsonldConverter.g:649:1: ( ( rule__Property__ManyAssignment_2 )? )
            // InternalJsonldConverter.g:650:2: ( rule__Property__ManyAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getManyAssignment_2()); 
            }
            // InternalJsonldConverter.g:651:2: ( rule__Property__ManyAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonldConverter.g:651:3: rule__Property__ManyAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__ManyAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getManyAssignment_2()); 
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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalJsonldConverter.g:659:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:663:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalJsonldConverter.g:664:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalJsonldConverter.g:671:1: rule__Property__Group__3__Impl : ( ( rule__Property__OneAssignment_3 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:675:1: ( ( ( rule__Property__OneAssignment_3 )? ) )
            // InternalJsonldConverter.g:676:1: ( ( rule__Property__OneAssignment_3 )? )
            {
            // InternalJsonldConverter.g:676:1: ( ( rule__Property__OneAssignment_3 )? )
            // InternalJsonldConverter.g:677:2: ( rule__Property__OneAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getOneAssignment_3()); 
            }
            // InternalJsonldConverter.g:678:2: ( rule__Property__OneAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonldConverter.g:678:3: rule__Property__OneAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__OneAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getOneAssignment_3()); 
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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalJsonldConverter.g:686:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:690:1: ( rule__Property__Group__4__Impl )
            // InternalJsonldConverter.g:691:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__4__Impl();

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
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalJsonldConverter.g:697:1: rule__Property__Group__4__Impl : ( ( rule__Property__TypeAssignment_4 ) ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:701:1: ( ( ( rule__Property__TypeAssignment_4 ) ) )
            // InternalJsonldConverter.g:702:1: ( ( rule__Property__TypeAssignment_4 ) )
            {
            // InternalJsonldConverter.g:702:1: ( ( rule__Property__TypeAssignment_4 ) )
            // InternalJsonldConverter.g:703:2: ( rule__Property__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_4()); 
            }
            // InternalJsonldConverter.g:704:2: ( rule__Property__TypeAssignment_4 )
            // InternalJsonldConverter.g:704:3: rule__Property__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_4()); 
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
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalJsonldConverter.g:713:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:717:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalJsonldConverter.g:718:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // InternalJsonldConverter.g:725:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:729:1: ( ( 'enum' ) )
            // InternalJsonldConverter.g:730:1: ( 'enum' )
            {
            // InternalJsonldConverter.g:730:1: ( 'enum' )
            // InternalJsonldConverter.g:731:2: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // InternalJsonldConverter.g:740:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:744:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalJsonldConverter.g:745:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // InternalJsonldConverter.g:752:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:756:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalJsonldConverter.g:757:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalJsonldConverter.g:757:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalJsonldConverter.g:758:2: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // InternalJsonldConverter.g:759:2: ( rule__Enum__NameAssignment_1 )
            // InternalJsonldConverter.g:759:3: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // InternalJsonldConverter.g:767:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:771:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalJsonldConverter.g:772:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // InternalJsonldConverter.g:779:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:783:1: ( ( '{' ) )
            // InternalJsonldConverter.g:784:1: ( '{' )
            {
            // InternalJsonldConverter.g:784:1: ( '{' )
            // InternalJsonldConverter.g:785:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // InternalJsonldConverter.g:794:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:798:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalJsonldConverter.g:799:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // InternalJsonldConverter.g:806:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__Group_3__0 )? ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:810:1: ( ( ( rule__Enum__Group_3__0 )? ) )
            // InternalJsonldConverter.g:811:1: ( ( rule__Enum__Group_3__0 )? )
            {
            // InternalJsonldConverter.g:811:1: ( ( rule__Enum__Group_3__0 )? )
            // InternalJsonldConverter.g:812:2: ( rule__Enum__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup_3()); 
            }
            // InternalJsonldConverter.g:813:2: ( rule__Enum__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonldConverter.g:813:3: rule__Enum__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enum__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // InternalJsonldConverter.g:821:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:825:1: ( rule__Enum__Group__4__Impl )
            // InternalJsonldConverter.g:826:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__4__Impl();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // InternalJsonldConverter.g:832:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:836:1: ( ( '}' ) )
            // InternalJsonldConverter.g:837:1: ( '}' )
            {
            // InternalJsonldConverter.g:837:1: ( '}' )
            // InternalJsonldConverter.g:838:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group_3__0"
    // InternalJsonldConverter.g:848:1: rule__Enum__Group_3__0 : rule__Enum__Group_3__0__Impl rule__Enum__Group_3__1 ;
    public final void rule__Enum__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:852:1: ( rule__Enum__Group_3__0__Impl rule__Enum__Group_3__1 )
            // InternalJsonldConverter.g:853:2: rule__Enum__Group_3__0__Impl rule__Enum__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Enum__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group_3__1();

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
    // $ANTLR end "rule__Enum__Group_3__0"


    // $ANTLR start "rule__Enum__Group_3__0__Impl"
    // InternalJsonldConverter.g:860:1: rule__Enum__Group_3__0__Impl : ( ( rule__Enum__FeaturesAssignment_3_0 ) ) ;
    public final void rule__Enum__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:864:1: ( ( ( rule__Enum__FeaturesAssignment_3_0 ) ) )
            // InternalJsonldConverter.g:865:1: ( ( rule__Enum__FeaturesAssignment_3_0 ) )
            {
            // InternalJsonldConverter.g:865:1: ( ( rule__Enum__FeaturesAssignment_3_0 ) )
            // InternalJsonldConverter.g:866:2: ( rule__Enum__FeaturesAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFeaturesAssignment_3_0()); 
            }
            // InternalJsonldConverter.g:867:2: ( rule__Enum__FeaturesAssignment_3_0 )
            // InternalJsonldConverter.g:867:3: rule__Enum__FeaturesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__FeaturesAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFeaturesAssignment_3_0()); 
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
    // $ANTLR end "rule__Enum__Group_3__0__Impl"


    // $ANTLR start "rule__Enum__Group_3__1"
    // InternalJsonldConverter.g:875:1: rule__Enum__Group_3__1 : rule__Enum__Group_3__1__Impl ;
    public final void rule__Enum__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:879:1: ( rule__Enum__Group_3__1__Impl )
            // InternalJsonldConverter.g:880:2: rule__Enum__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group_3__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_3__1"


    // $ANTLR start "rule__Enum__Group_3__1__Impl"
    // InternalJsonldConverter.g:886:1: rule__Enum__Group_3__1__Impl : ( ( rule__Enum__Group_3_1__0 )* ) ;
    public final void rule__Enum__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:890:1: ( ( ( rule__Enum__Group_3_1__0 )* ) )
            // InternalJsonldConverter.g:891:1: ( ( rule__Enum__Group_3_1__0 )* )
            {
            // InternalJsonldConverter.g:891:1: ( ( rule__Enum__Group_3_1__0 )* )
            // InternalJsonldConverter.g:892:2: ( rule__Enum__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup_3_1()); 
            }
            // InternalJsonldConverter.g:893:2: ( rule__Enum__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJsonldConverter.g:893:3: rule__Enum__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Enum__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__Enum__Group_3__1__Impl"


    // $ANTLR start "rule__Enum__Group_3_1__0"
    // InternalJsonldConverter.g:902:1: rule__Enum__Group_3_1__0 : rule__Enum__Group_3_1__0__Impl rule__Enum__Group_3_1__1 ;
    public final void rule__Enum__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:906:1: ( rule__Enum__Group_3_1__0__Impl rule__Enum__Group_3_1__1 )
            // InternalJsonldConverter.g:907:2: rule__Enum__Group_3_1__0__Impl rule__Enum__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group_3_1__1();

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
    // $ANTLR end "rule__Enum__Group_3_1__0"


    // $ANTLR start "rule__Enum__Group_3_1__0__Impl"
    // InternalJsonldConverter.g:914:1: rule__Enum__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:918:1: ( ( ',' ) )
            // InternalJsonldConverter.g:919:1: ( ',' )
            {
            // InternalJsonldConverter.g:919:1: ( ',' )
            // InternalJsonldConverter.g:920:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__Enum__Group_3_1__0__Impl"


    // $ANTLR start "rule__Enum__Group_3_1__1"
    // InternalJsonldConverter.g:929:1: rule__Enum__Group_3_1__1 : rule__Enum__Group_3_1__1__Impl ;
    public final void rule__Enum__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:933:1: ( rule__Enum__Group_3_1__1__Impl )
            // InternalJsonldConverter.g:934:2: rule__Enum__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_3_1__1"


    // $ANTLR start "rule__Enum__Group_3_1__1__Impl"
    // InternalJsonldConverter.g:940:1: rule__Enum__Group_3_1__1__Impl : ( ( rule__Enum__FeaturesAssignment_3_1_1 ) ) ;
    public final void rule__Enum__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:944:1: ( ( ( rule__Enum__FeaturesAssignment_3_1_1 ) ) )
            // InternalJsonldConverter.g:945:1: ( ( rule__Enum__FeaturesAssignment_3_1_1 ) )
            {
            // InternalJsonldConverter.g:945:1: ( ( rule__Enum__FeaturesAssignment_3_1_1 ) )
            // InternalJsonldConverter.g:946:2: ( rule__Enum__FeaturesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFeaturesAssignment_3_1_1()); 
            }
            // InternalJsonldConverter.g:947:2: ( rule__Enum__FeaturesAssignment_3_1_1 )
            // InternalJsonldConverter.g:947:3: rule__Enum__FeaturesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__FeaturesAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFeaturesAssignment_3_1_1()); 
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
    // $ANTLR end "rule__Enum__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumItem__Group__0"
    // InternalJsonldConverter.g:956:1: rule__EnumItem__Group__0 : rule__EnumItem__Group__0__Impl rule__EnumItem__Group__1 ;
    public final void rule__EnumItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:960:1: ( rule__EnumItem__Group__0__Impl rule__EnumItem__Group__1 )
            // InternalJsonldConverter.g:961:2: rule__EnumItem__Group__0__Impl rule__EnumItem__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EnumItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumItem__Group__1();

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
    // $ANTLR end "rule__EnumItem__Group__0"


    // $ANTLR start "rule__EnumItem__Group__0__Impl"
    // InternalJsonldConverter.g:968:1: rule__EnumItem__Group__0__Impl : ( ( rule__EnumItem__NameAssignment_0 ) ) ;
    public final void rule__EnumItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:972:1: ( ( ( rule__EnumItem__NameAssignment_0 ) ) )
            // InternalJsonldConverter.g:973:1: ( ( rule__EnumItem__NameAssignment_0 ) )
            {
            // InternalJsonldConverter.g:973:1: ( ( rule__EnumItem__NameAssignment_0 ) )
            // InternalJsonldConverter.g:974:2: ( rule__EnumItem__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemAccess().getNameAssignment_0()); 
            }
            // InternalJsonldConverter.g:975:2: ( rule__EnumItem__NameAssignment_0 )
            // InternalJsonldConverter.g:975:3: rule__EnumItem__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumItem__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__EnumItem__Group__0__Impl"


    // $ANTLR start "rule__EnumItem__Group__1"
    // InternalJsonldConverter.g:983:1: rule__EnumItem__Group__1 : rule__EnumItem__Group__1__Impl rule__EnumItem__Group__2 ;
    public final void rule__EnumItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:987:1: ( rule__EnumItem__Group__1__Impl rule__EnumItem__Group__2 )
            // InternalJsonldConverter.g:988:2: rule__EnumItem__Group__1__Impl rule__EnumItem__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EnumItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumItem__Group__2();

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
    // $ANTLR end "rule__EnumItem__Group__1"


    // $ANTLR start "rule__EnumItem__Group__1__Impl"
    // InternalJsonldConverter.g:995:1: rule__EnumItem__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:999:1: ( ( '=' ) )
            // InternalJsonldConverter.g:1000:1: ( '=' )
            {
            // InternalJsonldConverter.g:1000:1: ( '=' )
            // InternalJsonldConverter.g:1001:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemAccess().getEqualsSignKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__EnumItem__Group__1__Impl"


    // $ANTLR start "rule__EnumItem__Group__2"
    // InternalJsonldConverter.g:1010:1: rule__EnumItem__Group__2 : rule__EnumItem__Group__2__Impl ;
    public final void rule__EnumItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1014:1: ( rule__EnumItem__Group__2__Impl )
            // InternalJsonldConverter.g:1015:2: rule__EnumItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumItem__Group__2__Impl();

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
    // $ANTLR end "rule__EnumItem__Group__2"


    // $ANTLR start "rule__EnumItem__Group__2__Impl"
    // InternalJsonldConverter.g:1021:1: rule__EnumItem__Group__2__Impl : ( ( rule__EnumItem__TypeAssignment_2 ) ) ;
    public final void rule__EnumItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1025:1: ( ( ( rule__EnumItem__TypeAssignment_2 ) ) )
            // InternalJsonldConverter.g:1026:1: ( ( rule__EnumItem__TypeAssignment_2 ) )
            {
            // InternalJsonldConverter.g:1026:1: ( ( rule__EnumItem__TypeAssignment_2 ) )
            // InternalJsonldConverter.g:1027:2: ( rule__EnumItem__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemAccess().getTypeAssignment_2()); 
            }
            // InternalJsonldConverter.g:1028:2: ( rule__EnumItem__TypeAssignment_2 )
            // InternalJsonldConverter.g:1028:3: rule__EnumItem__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumItem__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__EnumItem__Group__2__Impl"


    // $ANTLR start "rule__Entity__UnorderedGroup_4"
    // InternalJsonldConverter.g:1037:1: rule__Entity__UnorderedGroup_4 : rule__Entity__UnorderedGroup_4__0 {...}?;
    public final void rule__Entity__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEntityAccess().getUnorderedGroup_4());
        	
        try {
            // InternalJsonldConverter.g:1042:1: ( rule__Entity__UnorderedGroup_4__0 {...}?)
            // InternalJsonldConverter.g:1043:2: rule__Entity__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Entity__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntityAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Entity__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntityAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEntityAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__UnorderedGroup_4"


    // $ANTLR start "rule__Entity__UnorderedGroup_4__Impl"
    // InternalJsonldConverter.g:1051:1: rule__Entity__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) ) ) ) ;
    public final void rule__Entity__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalJsonldConverter.g:1056:1: ( ( ({...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) ) ) ) )
            // InternalJsonldConverter.g:1057:3: ( ({...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) ) ) )
            {
            // InternalJsonldConverter.g:1057:3: ( ({...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonldConverter.g:1058:3: ({...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) ) )
                    {
                    // InternalJsonldConverter.g:1058:3: ({...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) ) )
                    // InternalJsonldConverter.g:1059:4: {...}? => ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Entity__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalJsonldConverter.g:1059:102: ( ( ( rule__Entity__FeaturesAssignment_4_0 ) ) )
                    // InternalJsonldConverter.g:1060:5: ( ( rule__Entity__FeaturesAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalJsonldConverter.g:1066:5: ( ( rule__Entity__FeaturesAssignment_4_0 ) )
                    // InternalJsonldConverter.g:1067:6: ( rule__Entity__FeaturesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getFeaturesAssignment_4_0()); 
                    }
                    // InternalJsonldConverter.g:1068:6: ( rule__Entity__FeaturesAssignment_4_0 )
                    // InternalJsonldConverter.g:1068:7: rule__Entity__FeaturesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__FeaturesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getFeaturesAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonldConverter.g:1073:3: ({...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) ) )
                    {
                    // InternalJsonldConverter.g:1073:3: ({...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) ) )
                    // InternalJsonldConverter.g:1074:4: {...}? => ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Entity__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalJsonldConverter.g:1074:102: ( ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) ) )
                    // InternalJsonldConverter.g:1075:5: ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalJsonldConverter.g:1081:5: ( ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* ) )
                    // InternalJsonldConverter.g:1082:6: ( ( rule__Entity__Group_4_1__0 ) ) ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* )
                    {
                    // InternalJsonldConverter.g:1082:6: ( ( rule__Entity__Group_4_1__0 ) )
                    // InternalJsonldConverter.g:1083:7: ( rule__Entity__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getGroup_4_1()); 
                    }
                    // InternalJsonldConverter.g:1084:7: ( rule__Entity__Group_4_1__0 )
                    // InternalJsonldConverter.g:1084:8: rule__Entity__Group_4_1__0
                    {
                    pushFollow(FOLLOW_15);
                    rule__Entity__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getGroup_4_1()); 
                    }

                    }

                    // InternalJsonldConverter.g:1087:6: ( ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )* )
                    // InternalJsonldConverter.g:1088:7: ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getGroup_4_1()); 
                    }
                    // InternalJsonldConverter.g:1089:7: ( ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==RULE_ID) ) {
                                int LA9_3 = input.LA(3);

                                if ( (LA9_3==19) ) {
                                    switch ( input.LA(4) ) {
                                    case 22:
                                        {
                                        int LA9_5 = input.LA(5);

                                        if ( (LA9_5==23) ) {
                                            int LA9_6 = input.LA(6);

                                            if ( (LA9_6==RULE_ID) ) {
                                                int LA9_7 = input.LA(7);

                                                if ( (synpred1_InternalJsonldConverter()) ) {
                                                    alt9=1;
                                                }


                                            }


                                        }
                                        else if ( (LA9_5==RULE_ID) ) {
                                            int LA9_7 = input.LA(6);

                                            if ( (synpred1_InternalJsonldConverter()) ) {
                                                alt9=1;
                                            }


                                        }


                                        }
                                        break;
                                    case 23:
                                        {
                                        int LA9_6 = input.LA(5);

                                        if ( (LA9_6==RULE_ID) ) {
                                            int LA9_7 = input.LA(6);

                                            if ( (synpred1_InternalJsonldConverter()) ) {
                                                alt9=1;
                                            }


                                        }


                                        }
                                        break;
                                    case RULE_ID:
                                        {
                                        int LA9_7 = input.LA(5);

                                        if ( (synpred1_InternalJsonldConverter()) ) {
                                            alt9=1;
                                        }


                                        }
                                        break;

                                    }

                                }


                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalJsonldConverter.g:1089:8: ( rule__Entity__Group_4_1__0 )=> rule__Entity__Group_4_1__0
                    	    {
                    	    pushFollow(FOLLOW_15);
                    	    rule__Entity__Group_4_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getGroup_4_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Entity__UnorderedGroup_4__0"
    // InternalJsonldConverter.g:1103:1: rule__Entity__UnorderedGroup_4__0 : rule__Entity__UnorderedGroup_4__Impl ( rule__Entity__UnorderedGroup_4__1 )? ;
    public final void rule__Entity__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1107:1: ( rule__Entity__UnorderedGroup_4__Impl ( rule__Entity__UnorderedGroup_4__1 )? )
            // InternalJsonldConverter.g:1108:2: rule__Entity__UnorderedGroup_4__Impl ( rule__Entity__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__Entity__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalJsonldConverter.g:1109:2: ( rule__Entity__UnorderedGroup_4__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_4(), 1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJsonldConverter.g:1109:2: rule__Entity__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__Entity__UnorderedGroup_4__0"


    // $ANTLR start "rule__Entity__UnorderedGroup_4__1"
    // InternalJsonldConverter.g:1115:1: rule__Entity__UnorderedGroup_4__1 : rule__Entity__UnorderedGroup_4__Impl ;
    public final void rule__Entity__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1119:1: ( rule__Entity__UnorderedGroup_4__Impl )
            // InternalJsonldConverter.g:1120:2: rule__Entity__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__Entity__UnorderedGroup_4__1"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalJsonldConverter.g:1127:1: rule__Model__ElementsAssignment : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1131:1: ( ( ruleType ) )
            // InternalJsonldConverter.g:1132:2: ( ruleType )
            {
            // InternalJsonldConverter.g:1132:2: ( ruleType )
            // InternalJsonldConverter.g:1133:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalJsonldConverter.g:1142:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1146:1: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1147:2: ( RULE_ID )
            {
            // InternalJsonldConverter.g:1147:2: ( RULE_ID )
            // InternalJsonldConverter.g:1148:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalJsonldConverter.g:1157:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1161:1: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1162:2: ( RULE_ID )
            {
            // InternalJsonldConverter.g:1162:2: ( RULE_ID )
            // InternalJsonldConverter.g:1163:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalJsonldConverter.g:1172:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1176:1: ( ( ( RULE_ID ) ) )
            // InternalJsonldConverter.g:1177:2: ( ( RULE_ID ) )
            {
            // InternalJsonldConverter.g:1177:2: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1178:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            }
            // InternalJsonldConverter.g:1179:3: ( RULE_ID )
            // InternalJsonldConverter.g:1180:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4_0"
    // InternalJsonldConverter.g:1191:1: rule__Entity__FeaturesAssignment_4_0 : ( ruleProperty ) ;
    public final void rule__Entity__FeaturesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1195:1: ( ( ruleProperty ) )
            // InternalJsonldConverter.g:1196:2: ( ruleProperty )
            {
            // InternalJsonldConverter.g:1196:2: ( ruleProperty )
            // InternalJsonldConverter.g:1197:3: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesPropertyParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesPropertyParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__Entity__FeaturesAssignment_4_0"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4_1_1"
    // InternalJsonldConverter.g:1206:1: rule__Entity__FeaturesAssignment_4_1_1 : ( ruleProperty ) ;
    public final void rule__Entity__FeaturesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1210:1: ( ( ruleProperty ) )
            // InternalJsonldConverter.g:1211:2: ( ruleProperty )
            {
            // InternalJsonldConverter.g:1211:2: ( ruleProperty )
            // InternalJsonldConverter.g:1212:3: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesPropertyParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesPropertyParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__Entity__FeaturesAssignment_4_1_1"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalJsonldConverter.g:1221:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1225:1: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1226:2: ( RULE_ID )
            {
            // InternalJsonldConverter.g:1226:2: ( RULE_ID )
            // InternalJsonldConverter.g:1227:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__ManyAssignment_2"
    // InternalJsonldConverter.g:1236:1: rule__Property__ManyAssignment_2 : ( ( 'list' ) ) ;
    public final void rule__Property__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1240:1: ( ( ( 'list' ) ) )
            // InternalJsonldConverter.g:1241:2: ( ( 'list' ) )
            {
            // InternalJsonldConverter.g:1241:2: ( ( 'list' ) )
            // InternalJsonldConverter.g:1242:3: ( 'list' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getManyListKeyword_2_0()); 
            }
            // InternalJsonldConverter.g:1243:3: ( 'list' )
            // InternalJsonldConverter.g:1244:4: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getManyListKeyword_2_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getManyListKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getManyListKeyword_2_0()); 
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
    // $ANTLR end "rule__Property__ManyAssignment_2"


    // $ANTLR start "rule__Property__OneAssignment_3"
    // InternalJsonldConverter.g:1255:1: rule__Property__OneAssignment_3 : ( ( 'one' ) ) ;
    public final void rule__Property__OneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1259:1: ( ( ( 'one' ) ) )
            // InternalJsonldConverter.g:1260:2: ( ( 'one' ) )
            {
            // InternalJsonldConverter.g:1260:2: ( ( 'one' ) )
            // InternalJsonldConverter.g:1261:3: ( 'one' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getOneOneKeyword_3_0()); 
            }
            // InternalJsonldConverter.g:1262:3: ( 'one' )
            // InternalJsonldConverter.g:1263:4: 'one'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getOneOneKeyword_3_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getOneOneKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getOneOneKeyword_3_0()); 
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
    // $ANTLR end "rule__Property__OneAssignment_3"


    // $ANTLR start "rule__Property__TypeAssignment_4"
    // InternalJsonldConverter.g:1274:1: rule__Property__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1278:1: ( ( ( RULE_ID ) ) )
            // InternalJsonldConverter.g:1279:2: ( ( RULE_ID ) )
            {
            // InternalJsonldConverter.g:1279:2: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1280:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_4_0()); 
            }
            // InternalJsonldConverter.g:1281:3: ( RULE_ID )
            // InternalJsonldConverter.g:1282:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_4_0()); 
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
    // $ANTLR end "rule__Property__TypeAssignment_4"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // InternalJsonldConverter.g:1293:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1297:1: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1298:2: ( RULE_ID )
            {
            // InternalJsonldConverter.g:1298:2: ( RULE_ID )
            // InternalJsonldConverter.g:1299:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__FeaturesAssignment_3_0"
    // InternalJsonldConverter.g:1308:1: rule__Enum__FeaturesAssignment_3_0 : ( ruleEnumItem ) ;
    public final void rule__Enum__FeaturesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1312:1: ( ( ruleEnumItem ) )
            // InternalJsonldConverter.g:1313:2: ( ruleEnumItem )
            {
            // InternalJsonldConverter.g:1313:2: ( ruleEnumItem )
            // InternalJsonldConverter.g:1314:3: ruleEnumItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFeaturesEnumItemParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFeaturesEnumItemParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Enum__FeaturesAssignment_3_0"


    // $ANTLR start "rule__Enum__FeaturesAssignment_3_1_1"
    // InternalJsonldConverter.g:1323:1: rule__Enum__FeaturesAssignment_3_1_1 : ( ruleEnumItem ) ;
    public final void rule__Enum__FeaturesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1327:1: ( ( ruleEnumItem ) )
            // InternalJsonldConverter.g:1328:2: ( ruleEnumItem )
            {
            // InternalJsonldConverter.g:1328:2: ( ruleEnumItem )
            // InternalJsonldConverter.g:1329:3: ruleEnumItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFeaturesEnumItemParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFeaturesEnumItemParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__Enum__FeaturesAssignment_3_1_1"


    // $ANTLR start "rule__EnumItem__NameAssignment_0"
    // InternalJsonldConverter.g:1338:1: rule__EnumItem__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumItem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1342:1: ( ( RULE_ID ) )
            // InternalJsonldConverter.g:1343:2: ( RULE_ID )
            {
            // InternalJsonldConverter.g:1343:2: ( RULE_ID )
            // InternalJsonldConverter.g:1344:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__EnumItem__NameAssignment_0"


    // $ANTLR start "rule__EnumItem__TypeAssignment_2"
    // InternalJsonldConverter.g:1353:1: rule__EnumItem__TypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EnumItem__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonldConverter.g:1357:1: ( ( RULE_STRING ) )
            // InternalJsonldConverter.g:1358:2: ( RULE_STRING )
            {
            // InternalJsonldConverter.g:1358:2: ( RULE_STRING )
            // InternalJsonldConverter.g:1359:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__EnumItem__TypeAssignment_2"

    // $ANTLR start synpred1_InternalJsonldConverter
    public final void synpred1_InternalJsonldConverter_fragment() throws RecognitionException {   
        // InternalJsonldConverter.g:1089:8: ( rule__Entity__Group_4_1__0 )
        // InternalJsonldConverter.g:1089:9: rule__Entity__Group_4_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Entity__Group_4_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJsonldConverter

    // Delegated rules

    public final boolean synpred1_InternalJsonldConverter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJsonldConverter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000106002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040012L});

}
