package de.fraunhofer.ipa.ros.seronetgw.xtext.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.ros.seronetgw.xtext.services.SeronetGwGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeronetGwParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GraphName'", "'RosGateway'", "'{'", "'}'", "'RosTopicPublisher'", "'('", "')'", "','", "'RosTopicSubscriber'", "'RosServiceServer'", "'RosServiceClient'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'MessageDefinition'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSeronetGwParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeronetGwParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeronetGwParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeronetGw.g"; }


    	private SeronetGwGrammarAccess grammarAccess;

    	public void setGrammarAccess(SeronetGwGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRosGateway"
    // InternalSeronetGw.g:53:1: entryRuleRosGateway : ruleRosGateway EOF ;
    public final void entryRuleRosGateway() throws RecognitionException {
        try {
            // InternalSeronetGw.g:54:1: ( ruleRosGateway EOF )
            // InternalSeronetGw.g:55:1: ruleRosGateway EOF
            {
             before(grammarAccess.getRosGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleRosGateway();

            state._fsp--;

             after(grammarAccess.getRosGatewayRule()); 
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
    // $ANTLR end "entryRuleRosGateway"


    // $ANTLR start "ruleRosGateway"
    // InternalSeronetGw.g:62:1: ruleRosGateway : ( ( rule__RosGateway__Group__0 ) ) ;
    public final void ruleRosGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:66:2: ( ( ( rule__RosGateway__Group__0 ) ) )
            // InternalSeronetGw.g:67:2: ( ( rule__RosGateway__Group__0 ) )
            {
            // InternalSeronetGw.g:67:2: ( ( rule__RosGateway__Group__0 ) )
            // InternalSeronetGw.g:68:3: ( rule__RosGateway__Group__0 )
            {
             before(grammarAccess.getRosGatewayAccess().getGroup()); 
            // InternalSeronetGw.g:69:3: ( rule__RosGateway__Group__0 )
            // InternalSeronetGw.g:69:4: rule__RosGateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosGateway"


    // $ANTLR start "entryRuleNamespace"
    // InternalSeronetGw.g:78:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalSeronetGw.g:79:1: ( ruleNamespace EOF )
            // InternalSeronetGw.g:80:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalSeronetGw.g:87:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:91:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalSeronetGw.g:92:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalSeronetGw.g:92:2: ( ( rule__Namespace__Alternatives ) )
            // InternalSeronetGw.g:93:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalSeronetGw.g:94:3: ( rule__Namespace__Alternatives )
            // InternalSeronetGw.g:94:4: rule__Namespace__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalSeronetGw.g:103:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalSeronetGw.g:104:1: ( ruleGraphName EOF )
            // InternalSeronetGw.g:105:1: ruleGraphName EOF
            {
             before(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGraphNameRule()); 
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
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalSeronetGw.g:112:1: ruleGraphName : ( 'GraphName' ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:116:2: ( ( 'GraphName' ) )
            // InternalSeronetGw.g:117:2: ( 'GraphName' )
            {
            // InternalSeronetGw.g:117:2: ( 'GraphName' )
            // InternalSeronetGw.g:118:3: 'GraphName'
            {
             before(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalSeronetGw.g:128:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalSeronetGw.g:129:1: ( ruleGlobalNamespace EOF )
            // InternalSeronetGw.g:130:1: ruleGlobalNamespace EOF
            {
             before(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalNamespace();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceRule()); 
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
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalSeronetGw.g:137:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:141:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalSeronetGw.g:142:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalSeronetGw.g:142:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalSeronetGw.g:143:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalSeronetGw.g:144:3: ( rule__GlobalNamespace__Group__0 )
            // InternalSeronetGw.g:144:4: rule__GlobalNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalSeronetGw.g:153:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalSeronetGw.g:154:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalSeronetGw.g:155:1: ruleRelativeNamespace_Impl EOF
            {
             before(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeNamespace_Impl();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplRule()); 
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
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalSeronetGw.g:162:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:166:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalSeronetGw.g:167:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalSeronetGw.g:167:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalSeronetGw.g:168:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalSeronetGw.g:169:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalSeronetGw.g:169:4: rule__RelativeNamespace_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalSeronetGw.g:178:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalSeronetGw.g:179:1: ( rulePrivateNamespace EOF )
            // InternalSeronetGw.g:180:1: rulePrivateNamespace EOF
            {
             before(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            rulePrivateNamespace();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceRule()); 
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
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalSeronetGw.g:187:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:191:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalSeronetGw.g:192:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalSeronetGw.g:192:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalSeronetGw.g:193:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalSeronetGw.g:194:3: ( rule__PrivateNamespace__Group__0 )
            // InternalSeronetGw.g:194:4: rule__PrivateNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleEString"
    // InternalSeronetGw.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSeronetGw.g:204:1: ( ruleEString EOF )
            // InternalSeronetGw.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSeronetGw.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSeronetGw.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSeronetGw.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalSeronetGw.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSeronetGw.g:219:3: ( rule__EString__Alternatives )
            // InternalSeronetGw.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalSeronetGw.g:228:1: entryRuleMessageDefinition : ruleMessageDefinition EOF ;
    public final void entryRuleMessageDefinition() throws RecognitionException {
        try {
            // InternalSeronetGw.g:229:1: ( ruleMessageDefinition EOF )
            // InternalSeronetGw.g:230:1: ruleMessageDefinition EOF
            {
             before(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageDefinition();

            state._fsp--;

             after(grammarAccess.getMessageDefinitionRule()); 
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
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalSeronetGw.g:237:1: ruleMessageDefinition : ( ( rule__MessageDefinition__Group__0 ) ) ;
    public final void ruleMessageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:241:2: ( ( ( rule__MessageDefinition__Group__0 ) ) )
            // InternalSeronetGw.g:242:2: ( ( rule__MessageDefinition__Group__0 ) )
            {
            // InternalSeronetGw.g:242:2: ( ( rule__MessageDefinition__Group__0 ) )
            // InternalSeronetGw.g:243:3: ( rule__MessageDefinition__Group__0 )
            {
             before(grammarAccess.getMessageDefinitionAccess().getGroup()); 
            // InternalSeronetGw.g:244:3: ( rule__MessageDefinition__Group__0 )
            // InternalSeronetGw.g:244:4: rule__MessageDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalSeronetGw.g:252:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:256:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSeronetGw.g:257:2: ( ruleGlobalNamespace )
                    {
                    // InternalSeronetGw.g:257:2: ( ruleGlobalNamespace )
                    // InternalSeronetGw.g:258:3: ruleGlobalNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobalNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeronetGw.g:263:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalSeronetGw.g:263:2: ( ruleRelativeNamespace_Impl )
                    // InternalSeronetGw.g:264:3: ruleRelativeNamespace_Impl
                    {
                     before(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelativeNamespace_Impl();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeronetGw.g:269:2: ( rulePrivateNamespace )
                    {
                    // InternalSeronetGw.g:269:2: ( rulePrivateNamespace )
                    // InternalSeronetGw.g:270:3: rulePrivateNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrivateNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 

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
    // $ANTLR end "rule__Namespace__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSeronetGw.g:279:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:283:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSeronetGw.g:284:2: ( RULE_STRING )
                    {
                    // InternalSeronetGw.g:284:2: ( RULE_STRING )
                    // InternalSeronetGw.g:285:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeronetGw.g:290:2: ( RULE_ID )
                    {
                    // InternalSeronetGw.g:290:2: ( RULE_ID )
                    // InternalSeronetGw.g:291:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RosGateway__Group__0"
    // InternalSeronetGw.g:300:1: rule__RosGateway__Group__0 : rule__RosGateway__Group__0__Impl rule__RosGateway__Group__1 ;
    public final void rule__RosGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:304:1: ( rule__RosGateway__Group__0__Impl rule__RosGateway__Group__1 )
            // InternalSeronetGw.g:305:2: rule__RosGateway__Group__0__Impl rule__RosGateway__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosGateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__1();

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
    // $ANTLR end "rule__RosGateway__Group__0"


    // $ANTLR start "rule__RosGateway__Group__0__Impl"
    // InternalSeronetGw.g:312:1: rule__RosGateway__Group__0__Impl : ( () ) ;
    public final void rule__RosGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:316:1: ( ( () ) )
            // InternalSeronetGw.g:317:1: ( () )
            {
            // InternalSeronetGw.g:317:1: ( () )
            // InternalSeronetGw.g:318:2: ()
            {
             before(grammarAccess.getRosGatewayAccess().getRosGatewayAction_0()); 
            // InternalSeronetGw.g:319:2: ()
            // InternalSeronetGw.g:319:3: 
            {
            }

             after(grammarAccess.getRosGatewayAccess().getRosGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__0__Impl"


    // $ANTLR start "rule__RosGateway__Group__1"
    // InternalSeronetGw.g:327:1: rule__RosGateway__Group__1 : rule__RosGateway__Group__1__Impl rule__RosGateway__Group__2 ;
    public final void rule__RosGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:331:1: ( rule__RosGateway__Group__1__Impl rule__RosGateway__Group__2 )
            // InternalSeronetGw.g:332:2: rule__RosGateway__Group__1__Impl rule__RosGateway__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosGateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__2();

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
    // $ANTLR end "rule__RosGateway__Group__1"


    // $ANTLR start "rule__RosGateway__Group__1__Impl"
    // InternalSeronetGw.g:339:1: rule__RosGateway__Group__1__Impl : ( 'RosGateway' ) ;
    public final void rule__RosGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:343:1: ( ( 'RosGateway' ) )
            // InternalSeronetGw.g:344:1: ( 'RosGateway' )
            {
            // InternalSeronetGw.g:344:1: ( 'RosGateway' )
            // InternalSeronetGw.g:345:2: 'RosGateway'
            {
             before(grammarAccess.getRosGatewayAccess().getRosGatewayKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRosGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__1__Impl"


    // $ANTLR start "rule__RosGateway__Group__2"
    // InternalSeronetGw.g:354:1: rule__RosGateway__Group__2 : rule__RosGateway__Group__2__Impl rule__RosGateway__Group__3 ;
    public final void rule__RosGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:358:1: ( rule__RosGateway__Group__2__Impl rule__RosGateway__Group__3 )
            // InternalSeronetGw.g:359:2: rule__RosGateway__Group__2__Impl rule__RosGateway__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RosGateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__3();

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
    // $ANTLR end "rule__RosGateway__Group__2"


    // $ANTLR start "rule__RosGateway__Group__2__Impl"
    // InternalSeronetGw.g:366:1: rule__RosGateway__Group__2__Impl : ( '{' ) ;
    public final void rule__RosGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:370:1: ( ( '{' ) )
            // InternalSeronetGw.g:371:1: ( '{' )
            {
            // InternalSeronetGw.g:371:1: ( '{' )
            // InternalSeronetGw.g:372:2: '{'
            {
             before(grammarAccess.getRosGatewayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__2__Impl"


    // $ANTLR start "rule__RosGateway__Group__3"
    // InternalSeronetGw.g:381:1: rule__RosGateway__Group__3 : rule__RosGateway__Group__3__Impl rule__RosGateway__Group__4 ;
    public final void rule__RosGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:385:1: ( rule__RosGateway__Group__3__Impl rule__RosGateway__Group__4 )
            // InternalSeronetGw.g:386:2: rule__RosGateway__Group__3__Impl rule__RosGateway__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RosGateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__4();

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
    // $ANTLR end "rule__RosGateway__Group__3"


    // $ANTLR start "rule__RosGateway__Group__3__Impl"
    // InternalSeronetGw.g:393:1: rule__RosGateway__Group__3__Impl : ( ( rule__RosGateway__Group_3__0 )? ) ;
    public final void rule__RosGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:397:1: ( ( ( rule__RosGateway__Group_3__0 )? ) )
            // InternalSeronetGw.g:398:1: ( ( rule__RosGateway__Group_3__0 )? )
            {
            // InternalSeronetGw.g:398:1: ( ( rule__RosGateway__Group_3__0 )? )
            // InternalSeronetGw.g:399:2: ( rule__RosGateway__Group_3__0 )?
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_3()); 
            // InternalSeronetGw.g:400:2: ( rule__RosGateway__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeronetGw.g:400:3: rule__RosGateway__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosGateway__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosGatewayAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__3__Impl"


    // $ANTLR start "rule__RosGateway__Group__4"
    // InternalSeronetGw.g:408:1: rule__RosGateway__Group__4 : rule__RosGateway__Group__4__Impl rule__RosGateway__Group__5 ;
    public final void rule__RosGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:412:1: ( rule__RosGateway__Group__4__Impl rule__RosGateway__Group__5 )
            // InternalSeronetGw.g:413:2: rule__RosGateway__Group__4__Impl rule__RosGateway__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RosGateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__5();

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
    // $ANTLR end "rule__RosGateway__Group__4"


    // $ANTLR start "rule__RosGateway__Group__4__Impl"
    // InternalSeronetGw.g:420:1: rule__RosGateway__Group__4__Impl : ( ( rule__RosGateway__Group_4__0 )? ) ;
    public final void rule__RosGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:424:1: ( ( ( rule__RosGateway__Group_4__0 )? ) )
            // InternalSeronetGw.g:425:1: ( ( rule__RosGateway__Group_4__0 )? )
            {
            // InternalSeronetGw.g:425:1: ( ( rule__RosGateway__Group_4__0 )? )
            // InternalSeronetGw.g:426:2: ( rule__RosGateway__Group_4__0 )?
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_4()); 
            // InternalSeronetGw.g:427:2: ( rule__RosGateway__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeronetGw.g:427:3: rule__RosGateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosGateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__4__Impl"


    // $ANTLR start "rule__RosGateway__Group__5"
    // InternalSeronetGw.g:435:1: rule__RosGateway__Group__5 : rule__RosGateway__Group__5__Impl rule__RosGateway__Group__6 ;
    public final void rule__RosGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:439:1: ( rule__RosGateway__Group__5__Impl rule__RosGateway__Group__6 )
            // InternalSeronetGw.g:440:2: rule__RosGateway__Group__5__Impl rule__RosGateway__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosGateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__6();

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
    // $ANTLR end "rule__RosGateway__Group__5"


    // $ANTLR start "rule__RosGateway__Group__5__Impl"
    // InternalSeronetGw.g:447:1: rule__RosGateway__Group__5__Impl : ( ( rule__RosGateway__Group_5__0 )? ) ;
    public final void rule__RosGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:451:1: ( ( ( rule__RosGateway__Group_5__0 )? ) )
            // InternalSeronetGw.g:452:1: ( ( rule__RosGateway__Group_5__0 )? )
            {
            // InternalSeronetGw.g:452:1: ( ( rule__RosGateway__Group_5__0 )? )
            // InternalSeronetGw.g:453:2: ( rule__RosGateway__Group_5__0 )?
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_5()); 
            // InternalSeronetGw.g:454:2: ( rule__RosGateway__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeronetGw.g:454:3: rule__RosGateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosGateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__5__Impl"


    // $ANTLR start "rule__RosGateway__Group__6"
    // InternalSeronetGw.g:462:1: rule__RosGateway__Group__6 : rule__RosGateway__Group__6__Impl rule__RosGateway__Group__7 ;
    public final void rule__RosGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:466:1: ( rule__RosGateway__Group__6__Impl rule__RosGateway__Group__7 )
            // InternalSeronetGw.g:467:2: rule__RosGateway__Group__6__Impl rule__RosGateway__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__RosGateway__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__7();

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
    // $ANTLR end "rule__RosGateway__Group__6"


    // $ANTLR start "rule__RosGateway__Group__6__Impl"
    // InternalSeronetGw.g:474:1: rule__RosGateway__Group__6__Impl : ( ( rule__RosGateway__Group_6__0 )? ) ;
    public final void rule__RosGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:478:1: ( ( ( rule__RosGateway__Group_6__0 )? ) )
            // InternalSeronetGw.g:479:1: ( ( rule__RosGateway__Group_6__0 )? )
            {
            // InternalSeronetGw.g:479:1: ( ( rule__RosGateway__Group_6__0 )? )
            // InternalSeronetGw.g:480:2: ( rule__RosGateway__Group_6__0 )?
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_6()); 
            // InternalSeronetGw.g:481:2: ( rule__RosGateway__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeronetGw.g:481:3: rule__RosGateway__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosGateway__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosGatewayAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__6__Impl"


    // $ANTLR start "rule__RosGateway__Group__7"
    // InternalSeronetGw.g:489:1: rule__RosGateway__Group__7 : rule__RosGateway__Group__7__Impl ;
    public final void rule__RosGateway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:493:1: ( rule__RosGateway__Group__7__Impl )
            // InternalSeronetGw.g:494:2: rule__RosGateway__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group__7__Impl();

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
    // $ANTLR end "rule__RosGateway__Group__7"


    // $ANTLR start "rule__RosGateway__Group__7__Impl"
    // InternalSeronetGw.g:500:1: rule__RosGateway__Group__7__Impl : ( '}' ) ;
    public final void rule__RosGateway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:504:1: ( ( '}' ) )
            // InternalSeronetGw.g:505:1: ( '}' )
            {
            // InternalSeronetGw.g:505:1: ( '}' )
            // InternalSeronetGw.g:506:2: '}'
            {
             before(grammarAccess.getRosGatewayAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group__7__Impl"


    // $ANTLR start "rule__RosGateway__Group_3__0"
    // InternalSeronetGw.g:516:1: rule__RosGateway__Group_3__0 : rule__RosGateway__Group_3__0__Impl rule__RosGateway__Group_3__1 ;
    public final void rule__RosGateway__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:520:1: ( rule__RosGateway__Group_3__0__Impl rule__RosGateway__Group_3__1 )
            // InternalSeronetGw.g:521:2: rule__RosGateway__Group_3__0__Impl rule__RosGateway__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RosGateway__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3__1();

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
    // $ANTLR end "rule__RosGateway__Group_3__0"


    // $ANTLR start "rule__RosGateway__Group_3__0__Impl"
    // InternalSeronetGw.g:528:1: rule__RosGateway__Group_3__0__Impl : ( 'RosTopicPublisher' ) ;
    public final void rule__RosGateway__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:532:1: ( ( 'RosTopicPublisher' ) )
            // InternalSeronetGw.g:533:1: ( 'RosTopicPublisher' )
            {
            // InternalSeronetGw.g:533:1: ( 'RosTopicPublisher' )
            // InternalSeronetGw.g:534:2: 'RosTopicPublisher'
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_3__1"
    // InternalSeronetGw.g:543:1: rule__RosGateway__Group_3__1 : rule__RosGateway__Group_3__1__Impl rule__RosGateway__Group_3__2 ;
    public final void rule__RosGateway__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:547:1: ( rule__RosGateway__Group_3__1__Impl rule__RosGateway__Group_3__2 )
            // InternalSeronetGw.g:548:2: rule__RosGateway__Group_3__1__Impl rule__RosGateway__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3__2();

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
    // $ANTLR end "rule__RosGateway__Group_3__1"


    // $ANTLR start "rule__RosGateway__Group_3__1__Impl"
    // InternalSeronetGw.g:555:1: rule__RosGateway__Group_3__1__Impl : ( '(' ) ;
    public final void rule__RosGateway__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:559:1: ( ( '(' ) )
            // InternalSeronetGw.g:560:1: ( '(' )
            {
            // InternalSeronetGw.g:560:1: ( '(' )
            // InternalSeronetGw.g:561:2: '('
            {
             before(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_3__2"
    // InternalSeronetGw.g:570:1: rule__RosGateway__Group_3__2 : rule__RosGateway__Group_3__2__Impl rule__RosGateway__Group_3__3 ;
    public final void rule__RosGateway__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:574:1: ( rule__RosGateway__Group_3__2__Impl rule__RosGateway__Group_3__3 )
            // InternalSeronetGw.g:575:2: rule__RosGateway__Group_3__2__Impl rule__RosGateway__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3__3();

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
    // $ANTLR end "rule__RosGateway__Group_3__2"


    // $ANTLR start "rule__RosGateway__Group_3__2__Impl"
    // InternalSeronetGw.g:582:1: rule__RosGateway__Group_3__2__Impl : ( ( rule__RosGateway__RosTopicPublisherAssignment_3_2 ) ) ;
    public final void rule__RosGateway__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:586:1: ( ( ( rule__RosGateway__RosTopicPublisherAssignment_3_2 ) ) )
            // InternalSeronetGw.g:587:1: ( ( rule__RosGateway__RosTopicPublisherAssignment_3_2 ) )
            {
            // InternalSeronetGw.g:587:1: ( ( rule__RosGateway__RosTopicPublisherAssignment_3_2 ) )
            // InternalSeronetGw.g:588:2: ( rule__RosGateway__RosTopicPublisherAssignment_3_2 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherAssignment_3_2()); 
            // InternalSeronetGw.g:589:2: ( rule__RosGateway__RosTopicPublisherAssignment_3_2 )
            // InternalSeronetGw.g:589:3: rule__RosGateway__RosTopicPublisherAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosTopicPublisherAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3__2__Impl"


    // $ANTLR start "rule__RosGateway__Group_3__3"
    // InternalSeronetGw.g:597:1: rule__RosGateway__Group_3__3 : rule__RosGateway__Group_3__3__Impl rule__RosGateway__Group_3__4 ;
    public final void rule__RosGateway__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:601:1: ( rule__RosGateway__Group_3__3__Impl rule__RosGateway__Group_3__4 )
            // InternalSeronetGw.g:602:2: rule__RosGateway__Group_3__3__Impl rule__RosGateway__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3__4();

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
    // $ANTLR end "rule__RosGateway__Group_3__3"


    // $ANTLR start "rule__RosGateway__Group_3__3__Impl"
    // InternalSeronetGw.g:609:1: rule__RosGateway__Group_3__3__Impl : ( ( rule__RosGateway__Group_3_3__0 )* ) ;
    public final void rule__RosGateway__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:613:1: ( ( ( rule__RosGateway__Group_3_3__0 )* ) )
            // InternalSeronetGw.g:614:1: ( ( rule__RosGateway__Group_3_3__0 )* )
            {
            // InternalSeronetGw.g:614:1: ( ( rule__RosGateway__Group_3_3__0 )* )
            // InternalSeronetGw.g:615:2: ( rule__RosGateway__Group_3_3__0 )*
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_3_3()); 
            // InternalSeronetGw.g:616:2: ( rule__RosGateway__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeronetGw.g:616:3: rule__RosGateway__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosGateway__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRosGatewayAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3__3__Impl"


    // $ANTLR start "rule__RosGateway__Group_3__4"
    // InternalSeronetGw.g:624:1: rule__RosGateway__Group_3__4 : rule__RosGateway__Group_3__4__Impl ;
    public final void rule__RosGateway__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:628:1: ( rule__RosGateway__Group_3__4__Impl )
            // InternalSeronetGw.g:629:2: rule__RosGateway__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3__4__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_3__4"


    // $ANTLR start "rule__RosGateway__Group_3__4__Impl"
    // InternalSeronetGw.g:635:1: rule__RosGateway__Group_3__4__Impl : ( ')' ) ;
    public final void rule__RosGateway__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:639:1: ( ( ')' ) )
            // InternalSeronetGw.g:640:1: ( ')' )
            {
            // InternalSeronetGw.g:640:1: ( ')' )
            // InternalSeronetGw.g:641:2: ')'
            {
             before(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_3_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3__4__Impl"


    // $ANTLR start "rule__RosGateway__Group_3_3__0"
    // InternalSeronetGw.g:651:1: rule__RosGateway__Group_3_3__0 : rule__RosGateway__Group_3_3__0__Impl rule__RosGateway__Group_3_3__1 ;
    public final void rule__RosGateway__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:655:1: ( rule__RosGateway__Group_3_3__0__Impl rule__RosGateway__Group_3_3__1 )
            // InternalSeronetGw.g:656:2: rule__RosGateway__Group_3_3__0__Impl rule__RosGateway__Group_3_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3_3__1();

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
    // $ANTLR end "rule__RosGateway__Group_3_3__0"


    // $ANTLR start "rule__RosGateway__Group_3_3__0__Impl"
    // InternalSeronetGw.g:663:1: rule__RosGateway__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RosGateway__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:667:1: ( ( ',' ) )
            // InternalSeronetGw.g:668:1: ( ',' )
            {
            // InternalSeronetGw.g:668:1: ( ',' )
            // InternalSeronetGw.g:669:2: ','
            {
             before(grammarAccess.getRosGatewayAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3_3__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_3_3__1"
    // InternalSeronetGw.g:678:1: rule__RosGateway__Group_3_3__1 : rule__RosGateway__Group_3_3__1__Impl ;
    public final void rule__RosGateway__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:682:1: ( rule__RosGateway__Group_3_3__1__Impl )
            // InternalSeronetGw.g:683:2: rule__RosGateway__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_3_3__1"


    // $ANTLR start "rule__RosGateway__Group_3_3__1__Impl"
    // InternalSeronetGw.g:689:1: rule__RosGateway__Group_3_3__1__Impl : ( ( rule__RosGateway__RosTopicPublisherAssignment_3_3_1 ) ) ;
    public final void rule__RosGateway__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:693:1: ( ( ( rule__RosGateway__RosTopicPublisherAssignment_3_3_1 ) ) )
            // InternalSeronetGw.g:694:1: ( ( rule__RosGateway__RosTopicPublisherAssignment_3_3_1 ) )
            {
            // InternalSeronetGw.g:694:1: ( ( rule__RosGateway__RosTopicPublisherAssignment_3_3_1 ) )
            // InternalSeronetGw.g:695:2: ( rule__RosGateway__RosTopicPublisherAssignment_3_3_1 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherAssignment_3_3_1()); 
            // InternalSeronetGw.g:696:2: ( rule__RosGateway__RosTopicPublisherAssignment_3_3_1 )
            // InternalSeronetGw.g:696:3: rule__RosGateway__RosTopicPublisherAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosTopicPublisherAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_3_3__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_4__0"
    // InternalSeronetGw.g:705:1: rule__RosGateway__Group_4__0 : rule__RosGateway__Group_4__0__Impl rule__RosGateway__Group_4__1 ;
    public final void rule__RosGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:709:1: ( rule__RosGateway__Group_4__0__Impl rule__RosGateway__Group_4__1 )
            // InternalSeronetGw.g:710:2: rule__RosGateway__Group_4__0__Impl rule__RosGateway__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__RosGateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4__1();

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
    // $ANTLR end "rule__RosGateway__Group_4__0"


    // $ANTLR start "rule__RosGateway__Group_4__0__Impl"
    // InternalSeronetGw.g:717:1: rule__RosGateway__Group_4__0__Impl : ( 'RosTopicSubscriber' ) ;
    public final void rule__RosGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:721:1: ( ( 'RosTopicSubscriber' ) )
            // InternalSeronetGw.g:722:1: ( 'RosTopicSubscriber' )
            {
            // InternalSeronetGw.g:722:1: ( 'RosTopicSubscriber' )
            // InternalSeronetGw.g:723:2: 'RosTopicSubscriber'
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_4__1"
    // InternalSeronetGw.g:732:1: rule__RosGateway__Group_4__1 : rule__RosGateway__Group_4__1__Impl rule__RosGateway__Group_4__2 ;
    public final void rule__RosGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:736:1: ( rule__RosGateway__Group_4__1__Impl rule__RosGateway__Group_4__2 )
            // InternalSeronetGw.g:737:2: rule__RosGateway__Group_4__1__Impl rule__RosGateway__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4__2();

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
    // $ANTLR end "rule__RosGateway__Group_4__1"


    // $ANTLR start "rule__RosGateway__Group_4__1__Impl"
    // InternalSeronetGw.g:744:1: rule__RosGateway__Group_4__1__Impl : ( '(' ) ;
    public final void rule__RosGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:748:1: ( ( '(' ) )
            // InternalSeronetGw.g:749:1: ( '(' )
            {
            // InternalSeronetGw.g:749:1: ( '(' )
            // InternalSeronetGw.g:750:2: '('
            {
             before(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_4__2"
    // InternalSeronetGw.g:759:1: rule__RosGateway__Group_4__2 : rule__RosGateway__Group_4__2__Impl rule__RosGateway__Group_4__3 ;
    public final void rule__RosGateway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:763:1: ( rule__RosGateway__Group_4__2__Impl rule__RosGateway__Group_4__3 )
            // InternalSeronetGw.g:764:2: rule__RosGateway__Group_4__2__Impl rule__RosGateway__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4__3();

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
    // $ANTLR end "rule__RosGateway__Group_4__2"


    // $ANTLR start "rule__RosGateway__Group_4__2__Impl"
    // InternalSeronetGw.g:771:1: rule__RosGateway__Group_4__2__Impl : ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_2 ) ) ;
    public final void rule__RosGateway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:775:1: ( ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_2 ) ) )
            // InternalSeronetGw.g:776:1: ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_2 ) )
            {
            // InternalSeronetGw.g:776:1: ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_2 ) )
            // InternalSeronetGw.g:777:2: ( rule__RosGateway__RosTopicSubscriberAssignment_4_2 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberAssignment_4_2()); 
            // InternalSeronetGw.g:778:2: ( rule__RosGateway__RosTopicSubscriberAssignment_4_2 )
            // InternalSeronetGw.g:778:3: rule__RosGateway__RosTopicSubscriberAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosTopicSubscriberAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4__2__Impl"


    // $ANTLR start "rule__RosGateway__Group_4__3"
    // InternalSeronetGw.g:786:1: rule__RosGateway__Group_4__3 : rule__RosGateway__Group_4__3__Impl rule__RosGateway__Group_4__4 ;
    public final void rule__RosGateway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:790:1: ( rule__RosGateway__Group_4__3__Impl rule__RosGateway__Group_4__4 )
            // InternalSeronetGw.g:791:2: rule__RosGateway__Group_4__3__Impl rule__RosGateway__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4__4();

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
    // $ANTLR end "rule__RosGateway__Group_4__3"


    // $ANTLR start "rule__RosGateway__Group_4__3__Impl"
    // InternalSeronetGw.g:798:1: rule__RosGateway__Group_4__3__Impl : ( ( rule__RosGateway__Group_4_3__0 )* ) ;
    public final void rule__RosGateway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:802:1: ( ( ( rule__RosGateway__Group_4_3__0 )* ) )
            // InternalSeronetGw.g:803:1: ( ( rule__RosGateway__Group_4_3__0 )* )
            {
            // InternalSeronetGw.g:803:1: ( ( rule__RosGateway__Group_4_3__0 )* )
            // InternalSeronetGw.g:804:2: ( rule__RosGateway__Group_4_3__0 )*
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_4_3()); 
            // InternalSeronetGw.g:805:2: ( rule__RosGateway__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeronetGw.g:805:3: rule__RosGateway__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosGateway__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRosGatewayAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4__3__Impl"


    // $ANTLR start "rule__RosGateway__Group_4__4"
    // InternalSeronetGw.g:813:1: rule__RosGateway__Group_4__4 : rule__RosGateway__Group_4__4__Impl ;
    public final void rule__RosGateway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:817:1: ( rule__RosGateway__Group_4__4__Impl )
            // InternalSeronetGw.g:818:2: rule__RosGateway__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4__4__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_4__4"


    // $ANTLR start "rule__RosGateway__Group_4__4__Impl"
    // InternalSeronetGw.g:824:1: rule__RosGateway__Group_4__4__Impl : ( ')' ) ;
    public final void rule__RosGateway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:828:1: ( ( ')' ) )
            // InternalSeronetGw.g:829:1: ( ')' )
            {
            // InternalSeronetGw.g:829:1: ( ')' )
            // InternalSeronetGw.g:830:2: ')'
            {
             before(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4__4__Impl"


    // $ANTLR start "rule__RosGateway__Group_4_3__0"
    // InternalSeronetGw.g:840:1: rule__RosGateway__Group_4_3__0 : rule__RosGateway__Group_4_3__0__Impl rule__RosGateway__Group_4_3__1 ;
    public final void rule__RosGateway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:844:1: ( rule__RosGateway__Group_4_3__0__Impl rule__RosGateway__Group_4_3__1 )
            // InternalSeronetGw.g:845:2: rule__RosGateway__Group_4_3__0__Impl rule__RosGateway__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4_3__1();

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
    // $ANTLR end "rule__RosGateway__Group_4_3__0"


    // $ANTLR start "rule__RosGateway__Group_4_3__0__Impl"
    // InternalSeronetGw.g:852:1: rule__RosGateway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RosGateway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:856:1: ( ( ',' ) )
            // InternalSeronetGw.g:857:1: ( ',' )
            {
            // InternalSeronetGw.g:857:1: ( ',' )
            // InternalSeronetGw.g:858:2: ','
            {
             before(grammarAccess.getRosGatewayAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4_3__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_4_3__1"
    // InternalSeronetGw.g:867:1: rule__RosGateway__Group_4_3__1 : rule__RosGateway__Group_4_3__1__Impl ;
    public final void rule__RosGateway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:871:1: ( rule__RosGateway__Group_4_3__1__Impl )
            // InternalSeronetGw.g:872:2: rule__RosGateway__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_4_3__1"


    // $ANTLR start "rule__RosGateway__Group_4_3__1__Impl"
    // InternalSeronetGw.g:878:1: rule__RosGateway__Group_4_3__1__Impl : ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 ) ) ;
    public final void rule__RosGateway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:882:1: ( ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 ) ) )
            // InternalSeronetGw.g:883:1: ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 ) )
            {
            // InternalSeronetGw.g:883:1: ( ( rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 ) )
            // InternalSeronetGw.g:884:2: ( rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberAssignment_4_3_1()); 
            // InternalSeronetGw.g:885:2: ( rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 )
            // InternalSeronetGw.g:885:3: rule__RosGateway__RosTopicSubscriberAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosTopicSubscriberAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_4_3__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_5__0"
    // InternalSeronetGw.g:894:1: rule__RosGateway__Group_5__0 : rule__RosGateway__Group_5__0__Impl rule__RosGateway__Group_5__1 ;
    public final void rule__RosGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:898:1: ( rule__RosGateway__Group_5__0__Impl rule__RosGateway__Group_5__1 )
            // InternalSeronetGw.g:899:2: rule__RosGateway__Group_5__0__Impl rule__RosGateway__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__RosGateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5__1();

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
    // $ANTLR end "rule__RosGateway__Group_5__0"


    // $ANTLR start "rule__RosGateway__Group_5__0__Impl"
    // InternalSeronetGw.g:906:1: rule__RosGateway__Group_5__0__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:910:1: ( ( 'RosServiceServer' ) )
            // InternalSeronetGw.g:911:1: ( 'RosServiceServer' )
            {
            // InternalSeronetGw.g:911:1: ( 'RosServiceServer' )
            // InternalSeronetGw.g:912:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRosServiceServerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_5__1"
    // InternalSeronetGw.g:921:1: rule__RosGateway__Group_5__1 : rule__RosGateway__Group_5__1__Impl rule__RosGateway__Group_5__2 ;
    public final void rule__RosGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:925:1: ( rule__RosGateway__Group_5__1__Impl rule__RosGateway__Group_5__2 )
            // InternalSeronetGw.g:926:2: rule__RosGateway__Group_5__1__Impl rule__RosGateway__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5__2();

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
    // $ANTLR end "rule__RosGateway__Group_5__1"


    // $ANTLR start "rule__RosGateway__Group_5__1__Impl"
    // InternalSeronetGw.g:933:1: rule__RosGateway__Group_5__1__Impl : ( '(' ) ;
    public final void rule__RosGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:937:1: ( ( '(' ) )
            // InternalSeronetGw.g:938:1: ( '(' )
            {
            // InternalSeronetGw.g:938:1: ( '(' )
            // InternalSeronetGw.g:939:2: '('
            {
             before(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_5__2"
    // InternalSeronetGw.g:948:1: rule__RosGateway__Group_5__2 : rule__RosGateway__Group_5__2__Impl rule__RosGateway__Group_5__3 ;
    public final void rule__RosGateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:952:1: ( rule__RosGateway__Group_5__2__Impl rule__RosGateway__Group_5__3 )
            // InternalSeronetGw.g:953:2: rule__RosGateway__Group_5__2__Impl rule__RosGateway__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5__3();

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
    // $ANTLR end "rule__RosGateway__Group_5__2"


    // $ANTLR start "rule__RosGateway__Group_5__2__Impl"
    // InternalSeronetGw.g:960:1: rule__RosGateway__Group_5__2__Impl : ( ( rule__RosGateway__RosServiceServerAssignment_5_2 ) ) ;
    public final void rule__RosGateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:964:1: ( ( ( rule__RosGateway__RosServiceServerAssignment_5_2 ) ) )
            // InternalSeronetGw.g:965:1: ( ( rule__RosGateway__RosServiceServerAssignment_5_2 ) )
            {
            // InternalSeronetGw.g:965:1: ( ( rule__RosGateway__RosServiceServerAssignment_5_2 ) )
            // InternalSeronetGw.g:966:2: ( rule__RosGateway__RosServiceServerAssignment_5_2 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerAssignment_5_2()); 
            // InternalSeronetGw.g:967:2: ( rule__RosGateway__RosServiceServerAssignment_5_2 )
            // InternalSeronetGw.g:967:3: rule__RosGateway__RosServiceServerAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosServiceServerAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceServerAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5__2__Impl"


    // $ANTLR start "rule__RosGateway__Group_5__3"
    // InternalSeronetGw.g:975:1: rule__RosGateway__Group_5__3 : rule__RosGateway__Group_5__3__Impl rule__RosGateway__Group_5__4 ;
    public final void rule__RosGateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:979:1: ( rule__RosGateway__Group_5__3__Impl rule__RosGateway__Group_5__4 )
            // InternalSeronetGw.g:980:2: rule__RosGateway__Group_5__3__Impl rule__RosGateway__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5__4();

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
    // $ANTLR end "rule__RosGateway__Group_5__3"


    // $ANTLR start "rule__RosGateway__Group_5__3__Impl"
    // InternalSeronetGw.g:987:1: rule__RosGateway__Group_5__3__Impl : ( ( rule__RosGateway__Group_5_3__0 )* ) ;
    public final void rule__RosGateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:991:1: ( ( ( rule__RosGateway__Group_5_3__0 )* ) )
            // InternalSeronetGw.g:992:1: ( ( rule__RosGateway__Group_5_3__0 )* )
            {
            // InternalSeronetGw.g:992:1: ( ( rule__RosGateway__Group_5_3__0 )* )
            // InternalSeronetGw.g:993:2: ( rule__RosGateway__Group_5_3__0 )*
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_5_3()); 
            // InternalSeronetGw.g:994:2: ( rule__RosGateway__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeronetGw.g:994:3: rule__RosGateway__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosGateway__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRosGatewayAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5__3__Impl"


    // $ANTLR start "rule__RosGateway__Group_5__4"
    // InternalSeronetGw.g:1002:1: rule__RosGateway__Group_5__4 : rule__RosGateway__Group_5__4__Impl ;
    public final void rule__RosGateway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1006:1: ( rule__RosGateway__Group_5__4__Impl )
            // InternalSeronetGw.g:1007:2: rule__RosGateway__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5__4__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_5__4"


    // $ANTLR start "rule__RosGateway__Group_5__4__Impl"
    // InternalSeronetGw.g:1013:1: rule__RosGateway__Group_5__4__Impl : ( ')' ) ;
    public final void rule__RosGateway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1017:1: ( ( ')' ) )
            // InternalSeronetGw.g:1018:1: ( ')' )
            {
            // InternalSeronetGw.g:1018:1: ( ')' )
            // InternalSeronetGw.g:1019:2: ')'
            {
             before(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5__4__Impl"


    // $ANTLR start "rule__RosGateway__Group_5_3__0"
    // InternalSeronetGw.g:1029:1: rule__RosGateway__Group_5_3__0 : rule__RosGateway__Group_5_3__0__Impl rule__RosGateway__Group_5_3__1 ;
    public final void rule__RosGateway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1033:1: ( rule__RosGateway__Group_5_3__0__Impl rule__RosGateway__Group_5_3__1 )
            // InternalSeronetGw.g:1034:2: rule__RosGateway__Group_5_3__0__Impl rule__RosGateway__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5_3__1();

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
    // $ANTLR end "rule__RosGateway__Group_5_3__0"


    // $ANTLR start "rule__RosGateway__Group_5_3__0__Impl"
    // InternalSeronetGw.g:1041:1: rule__RosGateway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RosGateway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1045:1: ( ( ',' ) )
            // InternalSeronetGw.g:1046:1: ( ',' )
            {
            // InternalSeronetGw.g:1046:1: ( ',' )
            // InternalSeronetGw.g:1047:2: ','
            {
             before(grammarAccess.getRosGatewayAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5_3__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_5_3__1"
    // InternalSeronetGw.g:1056:1: rule__RosGateway__Group_5_3__1 : rule__RosGateway__Group_5_3__1__Impl ;
    public final void rule__RosGateway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1060:1: ( rule__RosGateway__Group_5_3__1__Impl )
            // InternalSeronetGw.g:1061:2: rule__RosGateway__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_5_3__1"


    // $ANTLR start "rule__RosGateway__Group_5_3__1__Impl"
    // InternalSeronetGw.g:1067:1: rule__RosGateway__Group_5_3__1__Impl : ( ( rule__RosGateway__RosServiceServerAssignment_5_3_1 ) ) ;
    public final void rule__RosGateway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1071:1: ( ( ( rule__RosGateway__RosServiceServerAssignment_5_3_1 ) ) )
            // InternalSeronetGw.g:1072:1: ( ( rule__RosGateway__RosServiceServerAssignment_5_3_1 ) )
            {
            // InternalSeronetGw.g:1072:1: ( ( rule__RosGateway__RosServiceServerAssignment_5_3_1 ) )
            // InternalSeronetGw.g:1073:2: ( rule__RosGateway__RosServiceServerAssignment_5_3_1 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerAssignment_5_3_1()); 
            // InternalSeronetGw.g:1074:2: ( rule__RosGateway__RosServiceServerAssignment_5_3_1 )
            // InternalSeronetGw.g:1074:3: rule__RosGateway__RosServiceServerAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosServiceServerAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceServerAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_5_3__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_6__0"
    // InternalSeronetGw.g:1083:1: rule__RosGateway__Group_6__0 : rule__RosGateway__Group_6__0__Impl rule__RosGateway__Group_6__1 ;
    public final void rule__RosGateway__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1087:1: ( rule__RosGateway__Group_6__0__Impl rule__RosGateway__Group_6__1 )
            // InternalSeronetGw.g:1088:2: rule__RosGateway__Group_6__0__Impl rule__RosGateway__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__RosGateway__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6__1();

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
    // $ANTLR end "rule__RosGateway__Group_6__0"


    // $ANTLR start "rule__RosGateway__Group_6__0__Impl"
    // InternalSeronetGw.g:1095:1: rule__RosGateway__Group_6__0__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosGateway__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1099:1: ( ( 'RosServiceClient' ) )
            // InternalSeronetGw.g:1100:1: ( 'RosServiceClient' )
            {
            // InternalSeronetGw.g:1100:1: ( 'RosServiceClient' )
            // InternalSeronetGw.g:1101:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRosServiceClientKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_6__1"
    // InternalSeronetGw.g:1110:1: rule__RosGateway__Group_6__1 : rule__RosGateway__Group_6__1__Impl rule__RosGateway__Group_6__2 ;
    public final void rule__RosGateway__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1114:1: ( rule__RosGateway__Group_6__1__Impl rule__RosGateway__Group_6__2 )
            // InternalSeronetGw.g:1115:2: rule__RosGateway__Group_6__1__Impl rule__RosGateway__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6__2();

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
    // $ANTLR end "rule__RosGateway__Group_6__1"


    // $ANTLR start "rule__RosGateway__Group_6__1__Impl"
    // InternalSeronetGw.g:1122:1: rule__RosGateway__Group_6__1__Impl : ( '(' ) ;
    public final void rule__RosGateway__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1126:1: ( ( '(' ) )
            // InternalSeronetGw.g:1127:1: ( '(' )
            {
            // InternalSeronetGw.g:1127:1: ( '(' )
            // InternalSeronetGw.g:1128:2: '('
            {
             before(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6__1__Impl"


    // $ANTLR start "rule__RosGateway__Group_6__2"
    // InternalSeronetGw.g:1137:1: rule__RosGateway__Group_6__2 : rule__RosGateway__Group_6__2__Impl rule__RosGateway__Group_6__3 ;
    public final void rule__RosGateway__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1141:1: ( rule__RosGateway__Group_6__2__Impl rule__RosGateway__Group_6__3 )
            // InternalSeronetGw.g:1142:2: rule__RosGateway__Group_6__2__Impl rule__RosGateway__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6__3();

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
    // $ANTLR end "rule__RosGateway__Group_6__2"


    // $ANTLR start "rule__RosGateway__Group_6__2__Impl"
    // InternalSeronetGw.g:1149:1: rule__RosGateway__Group_6__2__Impl : ( ( rule__RosGateway__RosServiceClientAssignment_6_2 ) ) ;
    public final void rule__RosGateway__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1153:1: ( ( ( rule__RosGateway__RosServiceClientAssignment_6_2 ) ) )
            // InternalSeronetGw.g:1154:1: ( ( rule__RosGateway__RosServiceClientAssignment_6_2 ) )
            {
            // InternalSeronetGw.g:1154:1: ( ( rule__RosGateway__RosServiceClientAssignment_6_2 ) )
            // InternalSeronetGw.g:1155:2: ( rule__RosGateway__RosServiceClientAssignment_6_2 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientAssignment_6_2()); 
            // InternalSeronetGw.g:1156:2: ( rule__RosGateway__RosServiceClientAssignment_6_2 )
            // InternalSeronetGw.g:1156:3: rule__RosGateway__RosServiceClientAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosServiceClientAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceClientAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6__2__Impl"


    // $ANTLR start "rule__RosGateway__Group_6__3"
    // InternalSeronetGw.g:1164:1: rule__RosGateway__Group_6__3 : rule__RosGateway__Group_6__3__Impl rule__RosGateway__Group_6__4 ;
    public final void rule__RosGateway__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1168:1: ( rule__RosGateway__Group_6__3__Impl rule__RosGateway__Group_6__4 )
            // InternalSeronetGw.g:1169:2: rule__RosGateway__Group_6__3__Impl rule__RosGateway__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__RosGateway__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6__4();

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
    // $ANTLR end "rule__RosGateway__Group_6__3"


    // $ANTLR start "rule__RosGateway__Group_6__3__Impl"
    // InternalSeronetGw.g:1176:1: rule__RosGateway__Group_6__3__Impl : ( ( rule__RosGateway__Group_6_3__0 )* ) ;
    public final void rule__RosGateway__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1180:1: ( ( ( rule__RosGateway__Group_6_3__0 )* ) )
            // InternalSeronetGw.g:1181:1: ( ( rule__RosGateway__Group_6_3__0 )* )
            {
            // InternalSeronetGw.g:1181:1: ( ( rule__RosGateway__Group_6_3__0 )* )
            // InternalSeronetGw.g:1182:2: ( rule__RosGateway__Group_6_3__0 )*
            {
             before(grammarAccess.getRosGatewayAccess().getGroup_6_3()); 
            // InternalSeronetGw.g:1183:2: ( rule__RosGateway__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeronetGw.g:1183:3: rule__RosGateway__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosGateway__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRosGatewayAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6__3__Impl"


    // $ANTLR start "rule__RosGateway__Group_6__4"
    // InternalSeronetGw.g:1191:1: rule__RosGateway__Group_6__4 : rule__RosGateway__Group_6__4__Impl ;
    public final void rule__RosGateway__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1195:1: ( rule__RosGateway__Group_6__4__Impl )
            // InternalSeronetGw.g:1196:2: rule__RosGateway__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6__4__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_6__4"


    // $ANTLR start "rule__RosGateway__Group_6__4__Impl"
    // InternalSeronetGw.g:1202:1: rule__RosGateway__Group_6__4__Impl : ( ')' ) ;
    public final void rule__RosGateway__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1206:1: ( ( ')' ) )
            // InternalSeronetGw.g:1207:1: ( ')' )
            {
            // InternalSeronetGw.g:1207:1: ( ')' )
            // InternalSeronetGw.g:1208:2: ')'
            {
             before(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6__4__Impl"


    // $ANTLR start "rule__RosGateway__Group_6_3__0"
    // InternalSeronetGw.g:1218:1: rule__RosGateway__Group_6_3__0 : rule__RosGateway__Group_6_3__0__Impl rule__RosGateway__Group_6_3__1 ;
    public final void rule__RosGateway__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1222:1: ( rule__RosGateway__Group_6_3__0__Impl rule__RosGateway__Group_6_3__1 )
            // InternalSeronetGw.g:1223:2: rule__RosGateway__Group_6_3__0__Impl rule__RosGateway__Group_6_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RosGateway__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6_3__1();

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
    // $ANTLR end "rule__RosGateway__Group_6_3__0"


    // $ANTLR start "rule__RosGateway__Group_6_3__0__Impl"
    // InternalSeronetGw.g:1230:1: rule__RosGateway__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RosGateway__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1234:1: ( ( ',' ) )
            // InternalSeronetGw.g:1235:1: ( ',' )
            {
            // InternalSeronetGw.g:1235:1: ( ',' )
            // InternalSeronetGw.g:1236:2: ','
            {
             before(grammarAccess.getRosGatewayAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosGatewayAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6_3__0__Impl"


    // $ANTLR start "rule__RosGateway__Group_6_3__1"
    // InternalSeronetGw.g:1245:1: rule__RosGateway__Group_6_3__1 : rule__RosGateway__Group_6_3__1__Impl ;
    public final void rule__RosGateway__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1249:1: ( rule__RosGateway__Group_6_3__1__Impl )
            // InternalSeronetGw.g:1250:2: rule__RosGateway__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__RosGateway__Group_6_3__1"


    // $ANTLR start "rule__RosGateway__Group_6_3__1__Impl"
    // InternalSeronetGw.g:1256:1: rule__RosGateway__Group_6_3__1__Impl : ( ( rule__RosGateway__RosServiceClientAssignment_6_3_1 ) ) ;
    public final void rule__RosGateway__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1260:1: ( ( ( rule__RosGateway__RosServiceClientAssignment_6_3_1 ) ) )
            // InternalSeronetGw.g:1261:1: ( ( rule__RosGateway__RosServiceClientAssignment_6_3_1 ) )
            {
            // InternalSeronetGw.g:1261:1: ( ( rule__RosGateway__RosServiceClientAssignment_6_3_1 ) )
            // InternalSeronetGw.g:1262:2: ( rule__RosGateway__RosServiceClientAssignment_6_3_1 )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientAssignment_6_3_1()); 
            // InternalSeronetGw.g:1263:2: ( rule__RosGateway__RosServiceClientAssignment_6_3_1 )
            // InternalSeronetGw.g:1263:3: rule__RosGateway__RosServiceClientAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosGateway__RosServiceClientAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceClientAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__Group_6_3__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalSeronetGw.g:1272:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1276:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalSeronetGw.g:1277:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__GlobalNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__1();

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
    // $ANTLR end "rule__GlobalNamespace__Group__0"


    // $ANTLR start "rule__GlobalNamespace__Group__0__Impl"
    // InternalSeronetGw.g:1284:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1288:1: ( ( () ) )
            // InternalSeronetGw.g:1289:1: ( () )
            {
            // InternalSeronetGw.g:1289:1: ( () )
            // InternalSeronetGw.g:1290:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalSeronetGw.g:1291:2: ()
            // InternalSeronetGw.g:1291:3: 
            {
            }

             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__1"
    // InternalSeronetGw.g:1299:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1303:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalSeronetGw.g:1304:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GlobalNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2();

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
    // $ANTLR end "rule__GlobalNamespace__Group__1"


    // $ANTLR start "rule__GlobalNamespace__Group__1__Impl"
    // InternalSeronetGw.g:1311:1: rule__GlobalNamespace__Group__1__Impl : ( 'GlobalNamespace' ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1315:1: ( ( 'GlobalNamespace' ) )
            // InternalSeronetGw.g:1316:1: ( 'GlobalNamespace' )
            {
            // InternalSeronetGw.g:1316:1: ( 'GlobalNamespace' )
            // InternalSeronetGw.g:1317:2: 'GlobalNamespace'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__2"
    // InternalSeronetGw.g:1326:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1330:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalSeronetGw.g:1331:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GlobalNamespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__3();

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
    // $ANTLR end "rule__GlobalNamespace__Group__2"


    // $ANTLR start "rule__GlobalNamespace__Group__2__Impl"
    // InternalSeronetGw.g:1338:1: rule__GlobalNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1342:1: ( ( '{' ) )
            // InternalSeronetGw.g:1343:1: ( '{' )
            {
            // InternalSeronetGw.g:1343:1: ( '{' )
            // InternalSeronetGw.g:1344:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__3"
    // InternalSeronetGw.g:1353:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1357:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalSeronetGw.g:1358:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__GlobalNamespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__4();

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
    // $ANTLR end "rule__GlobalNamespace__Group__3"


    // $ANTLR start "rule__GlobalNamespace__Group__3__Impl"
    // InternalSeronetGw.g:1365:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1369:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalSeronetGw.g:1370:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalSeronetGw.g:1370:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalSeronetGw.g:1371:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalSeronetGw.g:1372:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeronetGw.g:1372:3: rule__GlobalNamespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalNamespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__4"
    // InternalSeronetGw.g:1380:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1384:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalSeronetGw.g:1385:2: rule__GlobalNamespace__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__4__Impl();

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
    // $ANTLR end "rule__GlobalNamespace__Group__4"


    // $ANTLR start "rule__GlobalNamespace__Group__4__Impl"
    // InternalSeronetGw.g:1391:1: rule__GlobalNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1395:1: ( ( '}' ) )
            // InternalSeronetGw.g:1396:1: ( '}' )
            {
            // InternalSeronetGw.g:1396:1: ( '}' )
            // InternalSeronetGw.g:1397:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__0"
    // InternalSeronetGw.g:1407:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1411:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalSeronetGw.g:1412:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__GlobalNamespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__1();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__0"


    // $ANTLR start "rule__GlobalNamespace__Group_3__0__Impl"
    // InternalSeronetGw.g:1419:1: rule__GlobalNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1423:1: ( ( 'parts' ) )
            // InternalSeronetGw.g:1424:1: ( 'parts' )
            {
            // InternalSeronetGw.g:1424:1: ( 'parts' )
            // InternalSeronetGw.g:1425:2: 'parts'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__1"
    // InternalSeronetGw.g:1434:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1438:1: ( rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 )
            // InternalSeronetGw.g:1439:2: rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__GlobalNamespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__2();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__1"


    // $ANTLR start "rule__GlobalNamespace__Group_3__1__Impl"
    // InternalSeronetGw.g:1446:1: rule__GlobalNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1450:1: ( ( '{' ) )
            // InternalSeronetGw.g:1451:1: ( '{' )
            {
            // InternalSeronetGw.g:1451:1: ( '{' )
            // InternalSeronetGw.g:1452:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__2"
    // InternalSeronetGw.g:1461:1: rule__GlobalNamespace__Group_3__2 : rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 ;
    public final void rule__GlobalNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1465:1: ( rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 )
            // InternalSeronetGw.g:1466:2: rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalNamespace__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__3();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__2"


    // $ANTLR start "rule__GlobalNamespace__Group_3__2__Impl"
    // InternalSeronetGw.g:1473:1: rule__GlobalNamespace__Group_3__2__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__GlobalNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1477:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) )
            // InternalSeronetGw.g:1478:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            {
            // InternalSeronetGw.g:1478:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            // InternalSeronetGw.g:1479:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalSeronetGw.g:1480:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            // InternalSeronetGw.g:1480:3: rule__GlobalNamespace__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__3"
    // InternalSeronetGw.g:1488:1: rule__GlobalNamespace__Group_3__3 : rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 ;
    public final void rule__GlobalNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1492:1: ( rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 )
            // InternalSeronetGw.g:1493:2: rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__GlobalNamespace__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__4();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__3"


    // $ANTLR start "rule__GlobalNamespace__Group_3__3__Impl"
    // InternalSeronetGw.g:1500:1: rule__GlobalNamespace__Group_3__3__Impl : ( ( rule__GlobalNamespace__Group_3_3__0 )* ) ;
    public final void rule__GlobalNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1504:1: ( ( ( rule__GlobalNamespace__Group_3_3__0 )* ) )
            // InternalSeronetGw.g:1505:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            {
            // InternalSeronetGw.g:1505:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            // InternalSeronetGw.g:1506:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 
            // InternalSeronetGw.g:1507:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeronetGw.g:1507:3: rule__GlobalNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GlobalNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__4"
    // InternalSeronetGw.g:1515:1: rule__GlobalNamespace__Group_3__4 : rule__GlobalNamespace__Group_3__4__Impl ;
    public final void rule__GlobalNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1519:1: ( rule__GlobalNamespace__Group_3__4__Impl )
            // InternalSeronetGw.g:1520:2: rule__GlobalNamespace__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__4__Impl();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__4"


    // $ANTLR start "rule__GlobalNamespace__Group_3__4__Impl"
    // InternalSeronetGw.g:1526:1: rule__GlobalNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1530:1: ( ( '}' ) )
            // InternalSeronetGw.g:1531:1: ( '}' )
            {
            // InternalSeronetGw.g:1531:1: ( '}' )
            // InternalSeronetGw.g:1532:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__0"
    // InternalSeronetGw.g:1542:1: rule__GlobalNamespace__Group_3_3__0 : rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 ;
    public final void rule__GlobalNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1546:1: ( rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 )
            // InternalSeronetGw.g:1547:2: rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__GlobalNamespace__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3_3__1();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__0"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__0__Impl"
    // InternalSeronetGw.g:1554:1: rule__GlobalNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__GlobalNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1558:1: ( ( ',' ) )
            // InternalSeronetGw.g:1559:1: ( ',' )
            {
            // InternalSeronetGw.g:1559:1: ( ',' )
            // InternalSeronetGw.g:1560:2: ','
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__1"
    // InternalSeronetGw.g:1569:1: rule__GlobalNamespace__Group_3_3__1 : rule__GlobalNamespace__Group_3_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1573:1: ( rule__GlobalNamespace__Group_3_3__1__Impl )
            // InternalSeronetGw.g:1574:2: rule__GlobalNamespace__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__1"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__1__Impl"
    // InternalSeronetGw.g:1580:1: rule__GlobalNamespace__Group_3_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1584:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalSeronetGw.g:1585:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalSeronetGw.g:1585:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            // InternalSeronetGw.g:1586:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalSeronetGw.g:1587:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            // InternalSeronetGw.g:1587:3: rule__GlobalNamespace__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalSeronetGw.g:1596:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1600:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalSeronetGw.g:1601:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RelativeNamespace_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__1();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0__Impl"
    // InternalSeronetGw.g:1608:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1612:1: ( ( () ) )
            // InternalSeronetGw.g:1613:1: ( () )
            {
            // InternalSeronetGw.g:1613:1: ( () )
            // InternalSeronetGw.g:1614:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalSeronetGw.g:1615:2: ()
            // InternalSeronetGw.g:1615:3: 
            {
            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1"
    // InternalSeronetGw.g:1623:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1627:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalSeronetGw.g:1628:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RelativeNamespace_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1__Impl"
    // InternalSeronetGw.g:1635:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( 'RelativeNamespace' ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1639:1: ( ( 'RelativeNamespace' ) )
            // InternalSeronetGw.g:1640:1: ( 'RelativeNamespace' )
            {
            // InternalSeronetGw.g:1640:1: ( 'RelativeNamespace' )
            // InternalSeronetGw.g:1641:2: 'RelativeNamespace'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2"
    // InternalSeronetGw.g:1650:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1654:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalSeronetGw.g:1655:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RelativeNamespace_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__3();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2__Impl"
    // InternalSeronetGw.g:1662:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1666:1: ( ( '{' ) )
            // InternalSeronetGw.g:1667:1: ( '{' )
            {
            // InternalSeronetGw.g:1667:1: ( '{' )
            // InternalSeronetGw.g:1668:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__3"
    // InternalSeronetGw.g:1677:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1681:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalSeronetGw.g:1682:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__RelativeNamespace_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__4();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__3__Impl"
    // InternalSeronetGw.g:1689:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1693:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalSeronetGw.g:1694:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalSeronetGw.g:1694:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalSeronetGw.g:1695:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalSeronetGw.g:1696:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSeronetGw.g:1696:3: rule__RelativeNamespace_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeNamespace_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__4"
    // InternalSeronetGw.g:1704:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1708:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalSeronetGw.g:1709:2: rule__RelativeNamespace_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__4__Impl();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__4"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__4__Impl"
    // InternalSeronetGw.g:1715:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1719:1: ( ( '}' ) )
            // InternalSeronetGw.g:1720:1: ( '}' )
            {
            // InternalSeronetGw.g:1720:1: ( '}' )
            // InternalSeronetGw.g:1721:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__4__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__0"
    // InternalSeronetGw.g:1731:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1735:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalSeronetGw.g:1736:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RelativeNamespace_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__1();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__0__Impl"
    // InternalSeronetGw.g:1743:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1747:1: ( ( 'parts' ) )
            // InternalSeronetGw.g:1748:1: ( 'parts' )
            {
            // InternalSeronetGw.g:1748:1: ( 'parts' )
            // InternalSeronetGw.g:1749:2: 'parts'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__1"
    // InternalSeronetGw.g:1758:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1762:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 )
            // InternalSeronetGw.g:1763:2: rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__RelativeNamespace_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__2();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__1__Impl"
    // InternalSeronetGw.g:1770:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1774:1: ( ( '{' ) )
            // InternalSeronetGw.g:1775:1: ( '{' )
            {
            // InternalSeronetGw.g:1775:1: ( '{' )
            // InternalSeronetGw.g:1776:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__2"
    // InternalSeronetGw.g:1785:1: rule__RelativeNamespace_Impl__Group_3__2 : rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 ;
    public final void rule__RelativeNamespace_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1789:1: ( rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 )
            // InternalSeronetGw.g:1790:2: rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__RelativeNamespace_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__3();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__2__Impl"
    // InternalSeronetGw.g:1797:1: rule__RelativeNamespace_Impl__Group_3__2__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1801:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) )
            // InternalSeronetGw.g:1802:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            {
            // InternalSeronetGw.g:1802:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            // InternalSeronetGw.g:1803:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 
            // InternalSeronetGw.g:1804:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            // InternalSeronetGw.g:1804:3: rule__RelativeNamespace_Impl__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__3"
    // InternalSeronetGw.g:1812:1: rule__RelativeNamespace_Impl__Group_3__3 : rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 ;
    public final void rule__RelativeNamespace_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1816:1: ( rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 )
            // InternalSeronetGw.g:1817:2: rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__RelativeNamespace_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__4();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__3__Impl"
    // InternalSeronetGw.g:1824:1: rule__RelativeNamespace_Impl__Group_3__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1828:1: ( ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) )
            // InternalSeronetGw.g:1829:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            {
            // InternalSeronetGw.g:1829:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            // InternalSeronetGw.g:1830:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 
            // InternalSeronetGw.g:1831:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeronetGw.g:1831:3: rule__RelativeNamespace_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RelativeNamespace_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__4"
    // InternalSeronetGw.g:1839:1: rule__RelativeNamespace_Impl__Group_3__4 : rule__RelativeNamespace_Impl__Group_3__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1843:1: ( rule__RelativeNamespace_Impl__Group_3__4__Impl )
            // InternalSeronetGw.g:1844:2: rule__RelativeNamespace_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__4__Impl();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__4"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__4__Impl"
    // InternalSeronetGw.g:1850:1: rule__RelativeNamespace_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1854:1: ( ( '}' ) )
            // InternalSeronetGw.g:1855:1: ( '}' )
            {
            // InternalSeronetGw.g:1855:1: ( '}' )
            // InternalSeronetGw.g:1856:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__0"
    // InternalSeronetGw.g:1866:1: rule__RelativeNamespace_Impl__Group_3_3__0 : rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1870:1: ( rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 )
            // InternalSeronetGw.g:1871:2: rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__RelativeNamespace_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3_3__1();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__0__Impl"
    // InternalSeronetGw.g:1878:1: rule__RelativeNamespace_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1882:1: ( ( ',' ) )
            // InternalSeronetGw.g:1883:1: ( ',' )
            {
            // InternalSeronetGw.g:1883:1: ( ',' )
            // InternalSeronetGw.g:1884:2: ','
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__1"
    // InternalSeronetGw.g:1893:1: rule__RelativeNamespace_Impl__Group_3_3__1 : rule__RelativeNamespace_Impl__Group_3_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1897:1: ( rule__RelativeNamespace_Impl__Group_3_3__1__Impl )
            // InternalSeronetGw.g:1898:2: rule__RelativeNamespace_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__1__Impl"
    // InternalSeronetGw.g:1904:1: rule__RelativeNamespace_Impl__Group_3_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1908:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) )
            // InternalSeronetGw.g:1909:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            {
            // InternalSeronetGw.g:1909:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            // InternalSeronetGw.g:1910:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 
            // InternalSeronetGw.g:1911:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            // InternalSeronetGw.g:1911:3: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalSeronetGw.g:1920:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1924:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalSeronetGw.g:1925:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PrivateNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__1();

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
    // $ANTLR end "rule__PrivateNamespace__Group__0"


    // $ANTLR start "rule__PrivateNamespace__Group__0__Impl"
    // InternalSeronetGw.g:1932:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1936:1: ( ( () ) )
            // InternalSeronetGw.g:1937:1: ( () )
            {
            // InternalSeronetGw.g:1937:1: ( () )
            // InternalSeronetGw.g:1938:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalSeronetGw.g:1939:2: ()
            // InternalSeronetGw.g:1939:3: 
            {
            }

             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__1"
    // InternalSeronetGw.g:1947:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1951:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalSeronetGw.g:1952:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PrivateNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2();

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
    // $ANTLR end "rule__PrivateNamespace__Group__1"


    // $ANTLR start "rule__PrivateNamespace__Group__1__Impl"
    // InternalSeronetGw.g:1959:1: rule__PrivateNamespace__Group__1__Impl : ( 'PrivateNamespace' ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1963:1: ( ( 'PrivateNamespace' ) )
            // InternalSeronetGw.g:1964:1: ( 'PrivateNamespace' )
            {
            // InternalSeronetGw.g:1964:1: ( 'PrivateNamespace' )
            // InternalSeronetGw.g:1965:2: 'PrivateNamespace'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__2"
    // InternalSeronetGw.g:1974:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1978:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalSeronetGw.g:1979:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__PrivateNamespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__3();

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
    // $ANTLR end "rule__PrivateNamespace__Group__2"


    // $ANTLR start "rule__PrivateNamespace__Group__2__Impl"
    // InternalSeronetGw.g:1986:1: rule__PrivateNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:1990:1: ( ( '{' ) )
            // InternalSeronetGw.g:1991:1: ( '{' )
            {
            // InternalSeronetGw.g:1991:1: ( '{' )
            // InternalSeronetGw.g:1992:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__3"
    // InternalSeronetGw.g:2001:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2005:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalSeronetGw.g:2006:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__PrivateNamespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__4();

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
    // $ANTLR end "rule__PrivateNamespace__Group__3"


    // $ANTLR start "rule__PrivateNamespace__Group__3__Impl"
    // InternalSeronetGw.g:2013:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2017:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalSeronetGw.g:2018:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalSeronetGw.g:2018:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalSeronetGw.g:2019:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalSeronetGw.g:2020:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeronetGw.g:2020:3: rule__PrivateNamespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrivateNamespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__4"
    // InternalSeronetGw.g:2028:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2032:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalSeronetGw.g:2033:2: rule__PrivateNamespace__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__4__Impl();

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
    // $ANTLR end "rule__PrivateNamespace__Group__4"


    // $ANTLR start "rule__PrivateNamespace__Group__4__Impl"
    // InternalSeronetGw.g:2039:1: rule__PrivateNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2043:1: ( ( '}' ) )
            // InternalSeronetGw.g:2044:1: ( '}' )
            {
            // InternalSeronetGw.g:2044:1: ( '}' )
            // InternalSeronetGw.g:2045:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__4__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__0"
    // InternalSeronetGw.g:2055:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2059:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalSeronetGw.g:2060:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__PrivateNamespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__1();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__0"


    // $ANTLR start "rule__PrivateNamespace__Group_3__0__Impl"
    // InternalSeronetGw.g:2067:1: rule__PrivateNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2071:1: ( ( 'parts' ) )
            // InternalSeronetGw.g:2072:1: ( 'parts' )
            {
            // InternalSeronetGw.g:2072:1: ( 'parts' )
            // InternalSeronetGw.g:2073:2: 'parts'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__1"
    // InternalSeronetGw.g:2082:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2086:1: ( rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 )
            // InternalSeronetGw.g:2087:2: rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__PrivateNamespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__2();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__1"


    // $ANTLR start "rule__PrivateNamespace__Group_3__1__Impl"
    // InternalSeronetGw.g:2094:1: rule__PrivateNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2098:1: ( ( '{' ) )
            // InternalSeronetGw.g:2099:1: ( '{' )
            {
            // InternalSeronetGw.g:2099:1: ( '{' )
            // InternalSeronetGw.g:2100:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__2"
    // InternalSeronetGw.g:2109:1: rule__PrivateNamespace__Group_3__2 : rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 ;
    public final void rule__PrivateNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2113:1: ( rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 )
            // InternalSeronetGw.g:2114:2: rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__PrivateNamespace__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__3();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__2"


    // $ANTLR start "rule__PrivateNamespace__Group_3__2__Impl"
    // InternalSeronetGw.g:2121:1: rule__PrivateNamespace__Group_3__2__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__PrivateNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2125:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) )
            // InternalSeronetGw.g:2126:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            {
            // InternalSeronetGw.g:2126:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            // InternalSeronetGw.g:2127:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalSeronetGw.g:2128:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            // InternalSeronetGw.g:2128:3: rule__PrivateNamespace__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__3"
    // InternalSeronetGw.g:2136:1: rule__PrivateNamespace__Group_3__3 : rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 ;
    public final void rule__PrivateNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2140:1: ( rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 )
            // InternalSeronetGw.g:2141:2: rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__PrivateNamespace__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__4();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__3"


    // $ANTLR start "rule__PrivateNamespace__Group_3__3__Impl"
    // InternalSeronetGw.g:2148:1: rule__PrivateNamespace__Group_3__3__Impl : ( ( rule__PrivateNamespace__Group_3_3__0 )* ) ;
    public final void rule__PrivateNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2152:1: ( ( ( rule__PrivateNamespace__Group_3_3__0 )* ) )
            // InternalSeronetGw.g:2153:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            {
            // InternalSeronetGw.g:2153:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            // InternalSeronetGw.g:2154:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 
            // InternalSeronetGw.g:2155:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeronetGw.g:2155:3: rule__PrivateNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PrivateNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__4"
    // InternalSeronetGw.g:2163:1: rule__PrivateNamespace__Group_3__4 : rule__PrivateNamespace__Group_3__4__Impl ;
    public final void rule__PrivateNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2167:1: ( rule__PrivateNamespace__Group_3__4__Impl )
            // InternalSeronetGw.g:2168:2: rule__PrivateNamespace__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__4__Impl();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__4"


    // $ANTLR start "rule__PrivateNamespace__Group_3__4__Impl"
    // InternalSeronetGw.g:2174:1: rule__PrivateNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2178:1: ( ( '}' ) )
            // InternalSeronetGw.g:2179:1: ( '}' )
            {
            // InternalSeronetGw.g:2179:1: ( '}' )
            // InternalSeronetGw.g:2180:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__4__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__0"
    // InternalSeronetGw.g:2190:1: rule__PrivateNamespace__Group_3_3__0 : rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 ;
    public final void rule__PrivateNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2194:1: ( rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 )
            // InternalSeronetGw.g:2195:2: rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__PrivateNamespace__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3_3__1();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__0"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__0__Impl"
    // InternalSeronetGw.g:2202:1: rule__PrivateNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__PrivateNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2206:1: ( ( ',' ) )
            // InternalSeronetGw.g:2207:1: ( ',' )
            {
            // InternalSeronetGw.g:2207:1: ( ',' )
            // InternalSeronetGw.g:2208:2: ','
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__1"
    // InternalSeronetGw.g:2217:1: rule__PrivateNamespace__Group_3_3__1 : rule__PrivateNamespace__Group_3_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2221:1: ( rule__PrivateNamespace__Group_3_3__1__Impl )
            // InternalSeronetGw.g:2222:2: rule__PrivateNamespace__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__1"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__1__Impl"
    // InternalSeronetGw.g:2228:1: rule__PrivateNamespace__Group_3_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2232:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalSeronetGw.g:2233:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalSeronetGw.g:2233:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            // InternalSeronetGw.g:2234:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalSeronetGw.g:2235:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            // InternalSeronetGw.g:2235:3: rule__PrivateNamespace__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__1__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__0"
    // InternalSeronetGw.g:2244:1: rule__MessageDefinition__Group__0 : rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 ;
    public final void rule__MessageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2248:1: ( rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 )
            // InternalSeronetGw.g:2249:2: rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MessageDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__1();

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
    // $ANTLR end "rule__MessageDefinition__Group__0"


    // $ANTLR start "rule__MessageDefinition__Group__0__Impl"
    // InternalSeronetGw.g:2256:1: rule__MessageDefinition__Group__0__Impl : ( () ) ;
    public final void rule__MessageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2260:1: ( ( () ) )
            // InternalSeronetGw.g:2261:1: ( () )
            {
            // InternalSeronetGw.g:2261:1: ( () )
            // InternalSeronetGw.g:2262:2: ()
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0()); 
            // InternalSeronetGw.g:2263:2: ()
            // InternalSeronetGw.g:2263:3: 
            {
            }

             after(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__0__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__1"
    // InternalSeronetGw.g:2271:1: rule__MessageDefinition__Group__1 : rule__MessageDefinition__Group__1__Impl ;
    public final void rule__MessageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2275:1: ( rule__MessageDefinition__Group__1__Impl )
            // InternalSeronetGw.g:2276:2: rule__MessageDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__1__Impl();

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
    // $ANTLR end "rule__MessageDefinition__Group__1"


    // $ANTLR start "rule__MessageDefinition__Group__1__Impl"
    // InternalSeronetGw.g:2282:1: rule__MessageDefinition__Group__1__Impl : ( 'MessageDefinition' ) ;
    public final void rule__MessageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2286:1: ( ( 'MessageDefinition' ) )
            // InternalSeronetGw.g:2287:1: ( 'MessageDefinition' )
            {
            // InternalSeronetGw.g:2287:1: ( 'MessageDefinition' )
            // InternalSeronetGw.g:2288:2: 'MessageDefinition'
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__1__Impl"


    // $ANTLR start "rule__RosGateway__RosTopicPublisherAssignment_3_2"
    // InternalSeronetGw.g:2298:1: rule__RosGateway__RosTopicPublisherAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosTopicPublisherAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2302:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2303:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2303:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2304:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherCrossReference_3_2_0()); 
            // InternalSeronetGw.g:2305:3: ( ruleEString )
            // InternalSeronetGw.g:2306:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosTopicPublisherAssignment_3_2"


    // $ANTLR start "rule__RosGateway__RosTopicPublisherAssignment_3_3_1"
    // InternalSeronetGw.g:2317:1: rule__RosGateway__RosTopicPublisherAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosTopicPublisherAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2321:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2322:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2322:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2323:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherCrossReference_3_3_1_0()); 
            // InternalSeronetGw.g:2324:3: ( ruleEString )
            // InternalSeronetGw.g:2325:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicPublisherPublisherCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosTopicPublisherAssignment_3_3_1"


    // $ANTLR start "rule__RosGateway__RosTopicSubscriberAssignment_4_2"
    // InternalSeronetGw.g:2336:1: rule__RosGateway__RosTopicSubscriberAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosTopicSubscriberAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2340:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2341:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2341:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2342:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberCrossReference_4_2_0()); 
            // InternalSeronetGw.g:2343:3: ( ruleEString )
            // InternalSeronetGw.g:2344:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosTopicSubscriberAssignment_4_2"


    // $ANTLR start "rule__RosGateway__RosTopicSubscriberAssignment_4_3_1"
    // InternalSeronetGw.g:2355:1: rule__RosGateway__RosTopicSubscriberAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosTopicSubscriberAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2359:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2360:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2360:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2361:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberCrossReference_4_3_1_0()); 
            // InternalSeronetGw.g:2362:3: ( ruleEString )
            // InternalSeronetGw.g:2363:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosTopicSubscriberSubscriberCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosTopicSubscriberAssignment_4_3_1"


    // $ANTLR start "rule__RosGateway__RosServiceServerAssignment_5_2"
    // InternalSeronetGw.g:2374:1: rule__RosGateway__RosServiceServerAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosServiceServerAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2378:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2379:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2379:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2380:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerCrossReference_5_2_0()); 
            // InternalSeronetGw.g:2381:3: ( ruleEString )
            // InternalSeronetGw.g:2382:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosServiceServerAssignment_5_2"


    // $ANTLR start "rule__RosGateway__RosServiceServerAssignment_5_3_1"
    // InternalSeronetGw.g:2393:1: rule__RosGateway__RosServiceServerAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosServiceServerAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2397:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2398:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2398:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2399:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerCrossReference_5_3_1_0()); 
            // InternalSeronetGw.g:2400:3: ( ruleEString )
            // InternalSeronetGw.g:2401:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceServerServiceServerCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosServiceServerAssignment_5_3_1"


    // $ANTLR start "rule__RosGateway__RosServiceClientAssignment_6_2"
    // InternalSeronetGw.g:2412:1: rule__RosGateway__RosServiceClientAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosServiceClientAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2416:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2417:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2417:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2418:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientCrossReference_6_2_0()); 
            // InternalSeronetGw.g:2419:3: ( ruleEString )
            // InternalSeronetGw.g:2420:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosServiceClientAssignment_6_2"


    // $ANTLR start "rule__RosGateway__RosServiceClientAssignment_6_3_1"
    // InternalSeronetGw.g:2431:1: rule__RosGateway__RosServiceClientAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RosGateway__RosServiceClientAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2435:1: ( ( ( ruleEString ) ) )
            // InternalSeronetGw.g:2436:2: ( ( ruleEString ) )
            {
            // InternalSeronetGw.g:2436:2: ( ( ruleEString ) )
            // InternalSeronetGw.g:2437:3: ( ruleEString )
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientCrossReference_6_3_1_0()); 
            // InternalSeronetGw.g:2438:3: ( ruleEString )
            // InternalSeronetGw.g:2439:4: ruleEString
            {
             before(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getRosGatewayAccess().getRosServiceClientServiceClientCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosGateway__RosServiceClientAssignment_6_3_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_2"
    // InternalSeronetGw.g:2450:1: rule__GlobalNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2454:1: ( ( ruleGraphName ) )
            // InternalSeronetGw.g:2455:2: ( ruleGraphName )
            {
            // InternalSeronetGw.g:2455:2: ( ruleGraphName )
            // InternalSeronetGw.g:2456:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_2"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_3_1"
    // InternalSeronetGw.g:2465:1: rule__GlobalNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2469:1: ( ( ruleGraphName ) )
            // InternalSeronetGw.g:2470:2: ( ruleGraphName )
            {
            // InternalSeronetGw.g:2470:2: ( ruleGraphName )
            // InternalSeronetGw.g:2471:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_3_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_2"
    // InternalSeronetGw.g:2480:1: rule__RelativeNamespace_Impl__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2484:1: ( ( ruleGraphName ) )
            // InternalSeronetGw.g:2485:2: ( ruleGraphName )
            {
            // InternalSeronetGw.g:2485:2: ( ruleGraphName )
            // InternalSeronetGw.g:2486:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_2"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1"
    // InternalSeronetGw.g:2495:1: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2499:1: ( ( ruleGraphName ) )
            // InternalSeronetGw.g:2500:2: ( ruleGraphName )
            {
            // InternalSeronetGw.g:2500:2: ( ruleGraphName )
            // InternalSeronetGw.g:2501:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_2"
    // InternalSeronetGw.g:2510:1: rule__PrivateNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2514:1: ( ( ruleGraphName ) )
            // InternalSeronetGw.g:2515:2: ( ruleGraphName )
            {
            // InternalSeronetGw.g:2515:2: ( ruleGraphName )
            // InternalSeronetGw.g:2516:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_2"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_3_1"
    // InternalSeronetGw.g:2525:1: rule__PrivateNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeronetGw.g:2529:1: ( ( ruleGraphName ) )
            // InternalSeronetGw.g:2530:2: ( ruleGraphName )
            {
            // InternalSeronetGw.g:2530:2: ( ruleGraphName )
            // InternalSeronetGw.g:2531:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000038C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}