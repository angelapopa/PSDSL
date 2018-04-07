package org.xtext.asea3.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.asea3.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "'create_project'", "'in_version'", "':'", "'many'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalMyDsl.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDomainmodel EOF )
            // InternalMyDsl.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalMyDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleType EOF )
            // InternalMyDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMyDsl.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDataType EOF )
            // InternalMyDsl.g:105:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__DataType__Group__0 )
            // InternalMyDsl.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
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
    // InternalMyDsl.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEntity EOF )
            // InternalMyDsl.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCreateProject"
    // InternalMyDsl.g:153:1: entryRuleCreateProject : ruleCreateProject EOF ;
    public final void entryRuleCreateProject() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCreateProject EOF )
            // InternalMyDsl.g:155:1: ruleCreateProject EOF
            {
             before(grammarAccess.getCreateProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateProject();

            state._fsp--;

             after(grammarAccess.getCreateProjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCreateProject"


    // $ANTLR start "ruleCreateProject"
    // InternalMyDsl.g:162:1: ruleCreateProject : ( ( rule__CreateProject__Group__0 ) ) ;
    public final void ruleCreateProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__CreateProject__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__CreateProject__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__CreateProject__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__CreateProject__Group__0 )
            {
             before(grammarAccess.getCreateProjectAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__CreateProject__Group__0 )
            // InternalMyDsl.g:169:4: rule__CreateProject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateProject"


    // $ANTLR start "entryRuleFeature"
    // InternalMyDsl.g:178:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleFeature EOF )
            // InternalMyDsl.g:180:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyDsl.g:187:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Feature__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Feature__Group__0 )
            // InternalMyDsl.g:194:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:202:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ruleCreateProject ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ruleCreateProject ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:207:2: ( ruleDataType )
                    {
                    // InternalMyDsl.g:207:2: ( ruleDataType )
                    // InternalMyDsl.g:208:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:213:2: ( ruleEntity )
                    // InternalMyDsl.g:214:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:219:2: ( ruleCreateProject )
                    {
                    // InternalMyDsl.g:219:2: ( ruleCreateProject )
                    // InternalMyDsl.g:220:3: ruleCreateProject
                    {
                     before(grammarAccess.getTypeAccess().getCreateProjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateProject();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCreateProjectParserRuleCall_2()); 

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
    // InternalMyDsl.g:229:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalMyDsl.g:234:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:241:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( ( 'datatype' ) )
            // InternalMyDsl.g:246:1: ( 'datatype' )
            {
            // InternalMyDsl.g:246:1: ( 'datatype' )
            // InternalMyDsl.g:247:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:256:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( rule__DataType__Group__1__Impl )
            // InternalMyDsl.g:261:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:267:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:271:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:272:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:272:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalMyDsl.g:273:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:274:2: ( rule__DataType__NameAssignment_1 )
            // InternalMyDsl.g:274:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:283:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:288:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:295:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( ( 'entity' ) )
            // InternalMyDsl.g:300:1: ( 'entity' )
            {
            // InternalMyDsl.g:300:1: ( 'entity' )
            // InternalMyDsl.g:301:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:310:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:315:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:322:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:327:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:327:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:328:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:329:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:329:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:337:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:342:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:349:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalMyDsl.g:354:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalMyDsl.g:354:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalMyDsl.g:355:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalMyDsl.g:356:2: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:356:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:364:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDsl.g:369:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:376:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( '{' ) )
            // InternalMyDsl.g:381:1: ( '{' )
            {
            // InternalMyDsl.g:381:1: ( '{' )
            // InternalMyDsl.g:382:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:391:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalMyDsl.g:396:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:403:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalMyDsl.g:408:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalMyDsl.g:408:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalMyDsl.g:409:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalMyDsl.g:410:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:410:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:418:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Entity__Group__5__Impl )
            // InternalMyDsl.g:423:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:429:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( ( '}' ) )
            // InternalMyDsl.g:434:1: ( '}' )
            {
            // InternalMyDsl.g:434:1: ( '}' )
            // InternalMyDsl.g:435:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:445:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalMyDsl.g:450:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:457:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( 'extends' ) )
            // InternalMyDsl.g:462:1: ( 'extends' )
            {
            // InternalMyDsl.g:462:1: ( 'extends' )
            // InternalMyDsl.g:463:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:472:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Entity__Group_2__1__Impl )
            // InternalMyDsl.g:477:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:483:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:488:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:488:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:489:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:490:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:490:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CreateProject__Group__0"
    // InternalMyDsl.g:499:1: rule__CreateProject__Group__0 : rule__CreateProject__Group__0__Impl rule__CreateProject__Group__1 ;
    public final void rule__CreateProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__CreateProject__Group__0__Impl rule__CreateProject__Group__1 )
            // InternalMyDsl.g:504:2: rule__CreateProject__Group__0__Impl rule__CreateProject__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CreateProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__0"


    // $ANTLR start "rule__CreateProject__Group__0__Impl"
    // InternalMyDsl.g:511:1: rule__CreateProject__Group__0__Impl : ( 'create_project' ) ;
    public final void rule__CreateProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( 'create_project' ) )
            // InternalMyDsl.g:516:1: ( 'create_project' )
            {
            // InternalMyDsl.g:516:1: ( 'create_project' )
            // InternalMyDsl.g:517:2: 'create_project'
            {
             before(grammarAccess.getCreateProjectAccess().getCreate_projectKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCreateProjectAccess().getCreate_projectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__0__Impl"


    // $ANTLR start "rule__CreateProject__Group__1"
    // InternalMyDsl.g:526:1: rule__CreateProject__Group__1 : rule__CreateProject__Group__1__Impl rule__CreateProject__Group__2 ;
    public final void rule__CreateProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__CreateProject__Group__1__Impl rule__CreateProject__Group__2 )
            // InternalMyDsl.g:531:2: rule__CreateProject__Group__1__Impl rule__CreateProject__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CreateProject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateProject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__1"


    // $ANTLR start "rule__CreateProject__Group__1__Impl"
    // InternalMyDsl.g:538:1: rule__CreateProject__Group__1__Impl : ( ( rule__CreateProject__NameAssignment_1 ) ) ;
    public final void rule__CreateProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( ( rule__CreateProject__NameAssignment_1 ) ) )
            // InternalMyDsl.g:543:1: ( ( rule__CreateProject__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:543:1: ( ( rule__CreateProject__NameAssignment_1 ) )
            // InternalMyDsl.g:544:2: ( rule__CreateProject__NameAssignment_1 )
            {
             before(grammarAccess.getCreateProjectAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:545:2: ( rule__CreateProject__NameAssignment_1 )
            // InternalMyDsl.g:545:3: rule__CreateProject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateProject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateProjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__1__Impl"


    // $ANTLR start "rule__CreateProject__Group__2"
    // InternalMyDsl.g:553:1: rule__CreateProject__Group__2 : rule__CreateProject__Group__2__Impl rule__CreateProject__Group__3 ;
    public final void rule__CreateProject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__CreateProject__Group__2__Impl rule__CreateProject__Group__3 )
            // InternalMyDsl.g:558:2: rule__CreateProject__Group__2__Impl rule__CreateProject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CreateProject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateProject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__2"


    // $ANTLR start "rule__CreateProject__Group__2__Impl"
    // InternalMyDsl.g:565:1: rule__CreateProject__Group__2__Impl : ( 'in_version' ) ;
    public final void rule__CreateProject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( 'in_version' ) )
            // InternalMyDsl.g:570:1: ( 'in_version' )
            {
            // InternalMyDsl.g:570:1: ( 'in_version' )
            // InternalMyDsl.g:571:2: 'in_version'
            {
             before(grammarAccess.getCreateProjectAccess().getIn_versionKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCreateProjectAccess().getIn_versionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__2__Impl"


    // $ANTLR start "rule__CreateProject__Group__3"
    // InternalMyDsl.g:580:1: rule__CreateProject__Group__3 : rule__CreateProject__Group__3__Impl ;
    public final void rule__CreateProject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__CreateProject__Group__3__Impl )
            // InternalMyDsl.g:585:2: rule__CreateProject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateProject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__3"


    // $ANTLR start "rule__CreateProject__Group__3__Impl"
    // InternalMyDsl.g:591:1: rule__CreateProject__Group__3__Impl : ( ( rule__CreateProject__NameAssignment_3 ) ) ;
    public final void rule__CreateProject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( ( rule__CreateProject__NameAssignment_3 ) ) )
            // InternalMyDsl.g:596:1: ( ( rule__CreateProject__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:596:1: ( ( rule__CreateProject__NameAssignment_3 ) )
            // InternalMyDsl.g:597:2: ( rule__CreateProject__NameAssignment_3 )
            {
             before(grammarAccess.getCreateProjectAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:598:2: ( rule__CreateProject__NameAssignment_3 )
            // InternalMyDsl.g:598:3: rule__CreateProject__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CreateProject__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCreateProjectAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalMyDsl.g:607:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyDsl.g:612:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalMyDsl.g:619:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalMyDsl.g:624:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalMyDsl.g:624:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalMyDsl.g:625:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalMyDsl.g:626:2: ( rule__Feature__ManyAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:626:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalMyDsl.g:634:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalMyDsl.g:639:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalMyDsl.g:646:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalMyDsl.g:651:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:651:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalMyDsl.g:652:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:653:2: ( rule__Feature__NameAssignment_1 )
            // InternalMyDsl.g:653:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalMyDsl.g:661:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalMyDsl.g:666:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalMyDsl.g:673:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ':' ) )
            // InternalMyDsl.g:678:1: ( ':' )
            {
            // InternalMyDsl.g:678:1: ( ':' )
            // InternalMyDsl.g:679:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalMyDsl.g:688:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Feature__Group__3__Impl )
            // InternalMyDsl.g:693:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalMyDsl.g:699:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:704:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:704:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalMyDsl.g:705:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:706:2: ( rule__Feature__TypeAssignment_3 )
            // InternalMyDsl.g:706:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalMyDsl.g:715:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ruleType ) )
            // InternalMyDsl.g:720:2: ( ruleType )
            {
            // InternalMyDsl.g:720:2: ( ruleType )
            // InternalMyDsl.g:721:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalMyDsl.g:730:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:735:2: ( RULE_ID )
            {
            // InternalMyDsl.g:735:2: ( RULE_ID )
            // InternalMyDsl.g:736:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:745:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:750:2: ( RULE_ID )
            {
            // InternalMyDsl.g:750:2: ( RULE_ID )
            // InternalMyDsl.g:751:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:760:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:765:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:765:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:766:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalMyDsl.g:767:3: ( RULE_ID )
            // InternalMyDsl.g:768:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // InternalMyDsl.g:779:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ruleFeature ) )
            // InternalMyDsl.g:784:2: ( ruleFeature )
            {
            // InternalMyDsl.g:784:2: ( ruleFeature )
            // InternalMyDsl.g:785:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__CreateProject__NameAssignment_1"
    // InternalMyDsl.g:794:1: rule__CreateProject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CreateProject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:799:2: ( RULE_ID )
            {
            // InternalMyDsl.g:799:2: ( RULE_ID )
            // InternalMyDsl.g:800:3: RULE_ID
            {
             before(grammarAccess.getCreateProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateProjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__NameAssignment_1"


    // $ANTLR start "rule__CreateProject__NameAssignment_3"
    // InternalMyDsl.g:809:1: rule__CreateProject__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CreateProject__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:814:2: ( RULE_ID )
            {
            // InternalMyDsl.g:814:2: ( RULE_ID )
            // InternalMyDsl.g:815:3: RULE_ID
            {
             before(grammarAccess.getCreateProjectAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateProjectAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateProject__NameAssignment_3"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalMyDsl.g:824:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:829:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:829:2: ( ( 'many' ) )
            // InternalMyDsl.g:830:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalMyDsl.g:831:3: ( 'many' )
            // InternalMyDsl.g:832:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalMyDsl.g:843:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:848:2: ( RULE_ID )
            {
            // InternalMyDsl.g:848:2: ( RULE_ID )
            // InternalMyDsl.g:849:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalMyDsl.g:858:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:863:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:863:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:864:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalMyDsl.g:865:3: ( RULE_ID )
            // InternalMyDsl.g:866:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000084010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}