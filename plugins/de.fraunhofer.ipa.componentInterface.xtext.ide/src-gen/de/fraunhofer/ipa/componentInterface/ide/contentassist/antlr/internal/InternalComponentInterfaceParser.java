package de.fraunhofer.ipa.componentInterface.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'}'", "'name'", "'NameSpace'", "'RosPublishers'", "','", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'"
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


        public InternalComponentInterfaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentInterfaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentInterfaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }


    	private ComponentInterfaceGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentInterfaceGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentInterface"
    // InternalComponentInterface.g:53:1: entryRuleComponentInterface : ruleComponentInterface EOF ;
    public final void entryRuleComponentInterface() throws RecognitionException {
        try {
            // InternalComponentInterface.g:54:1: ( ruleComponentInterface EOF )
            // InternalComponentInterface.g:55:1: ruleComponentInterface EOF
            {
             before(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceRule()); 
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
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalComponentInterface.g:62:1: ruleComponentInterface : ( ( rule__ComponentInterface__Group__0 ) ) ;
    public final void ruleComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:66:2: ( ( ( rule__ComponentInterface__Group__0 ) ) )
            // InternalComponentInterface.g:67:2: ( ( rule__ComponentInterface__Group__0 ) )
            {
            // InternalComponentInterface.g:67:2: ( ( rule__ComponentInterface__Group__0 ) )
            // InternalComponentInterface.g:68:3: ( rule__ComponentInterface__Group__0 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup()); 
            // InternalComponentInterface.g:69:3: ( rule__ComponentInterface__Group__0 )
            // InternalComponentInterface.g:69:4: rule__ComponentInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalComponentInterface.g:78:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalComponentInterface.g:79:1: ( ruleRosPublisher EOF )
            // InternalComponentInterface.g:80:1: ruleRosPublisher EOF
            {
             before(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getRosPublisherRule()); 
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
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalComponentInterface.g:87:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:91:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalComponentInterface.g:92:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalComponentInterface.g:92:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalComponentInterface.g:93:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalComponentInterface.g:94:3: ( rule__RosPublisher__Group__0 )
            // InternalComponentInterface.g:94:4: rule__RosPublisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalComponentInterface.g:103:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalComponentInterface.g:104:1: ( ruleRosSubscriber EOF )
            // InternalComponentInterface.g:105:1: ruleRosSubscriber EOF
            {
             before(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getRosSubscriberRule()); 
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
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalComponentInterface.g:112:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:116:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalComponentInterface.g:117:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalComponentInterface.g:117:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalComponentInterface.g:118:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalComponentInterface.g:119:3: ( rule__RosSubscriber__Group__0 )
            // InternalComponentInterface.g:119:4: rule__RosSubscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosServiceServer"
    // InternalComponentInterface.g:128:1: entryRuleRosServiceServer : ruleRosServiceServer EOF ;
    public final void entryRuleRosServiceServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:129:1: ( ruleRosServiceServer EOF )
            // InternalComponentInterface.g:130:1: ruleRosServiceServer EOF
            {
             before(grammarAccess.getRosServiceServerRule()); 
            pushFollow(FOLLOW_1);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getRosServiceServerRule()); 
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
    // $ANTLR end "entryRuleRosServiceServer"


    // $ANTLR start "ruleRosServiceServer"
    // InternalComponentInterface.g:137:1: ruleRosServiceServer : ( ( rule__RosServiceServer__Group__0 ) ) ;
    public final void ruleRosServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:141:2: ( ( ( rule__RosServiceServer__Group__0 ) ) )
            // InternalComponentInterface.g:142:2: ( ( rule__RosServiceServer__Group__0 ) )
            {
            // InternalComponentInterface.g:142:2: ( ( rule__RosServiceServer__Group__0 ) )
            // InternalComponentInterface.g:143:3: ( rule__RosServiceServer__Group__0 )
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup()); 
            // InternalComponentInterface.g:144:3: ( rule__RosServiceServer__Group__0 )
            // InternalComponentInterface.g:144:4: rule__RosServiceServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServiceServer"


    // $ANTLR start "entryRuleRosServiceClient"
    // InternalComponentInterface.g:153:1: entryRuleRosServiceClient : ruleRosServiceClient EOF ;
    public final void entryRuleRosServiceClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:154:1: ( ruleRosServiceClient EOF )
            // InternalComponentInterface.g:155:1: ruleRosServiceClient EOF
            {
             before(grammarAccess.getRosServiceClientRule()); 
            pushFollow(FOLLOW_1);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getRosServiceClientRule()); 
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
    // $ANTLR end "entryRuleRosServiceClient"


    // $ANTLR start "ruleRosServiceClient"
    // InternalComponentInterface.g:162:1: ruleRosServiceClient : ( ( rule__RosServiceClient__Group__0 ) ) ;
    public final void ruleRosServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:166:2: ( ( ( rule__RosServiceClient__Group__0 ) ) )
            // InternalComponentInterface.g:167:2: ( ( rule__RosServiceClient__Group__0 ) )
            {
            // InternalComponentInterface.g:167:2: ( ( rule__RosServiceClient__Group__0 ) )
            // InternalComponentInterface.g:168:3: ( rule__RosServiceClient__Group__0 )
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup()); 
            // InternalComponentInterface.g:169:3: ( rule__RosServiceClient__Group__0 )
            // InternalComponentInterface.g:169:4: rule__RosServiceClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServiceClient"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalComponentInterface.g:178:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:179:1: ( ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:180:1: ruleGlobalNamespace EOF
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
    // InternalComponentInterface.g:187:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:191:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalComponentInterface.g:192:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalComponentInterface.g:192:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalComponentInterface.g:193:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalComponentInterface.g:194:3: ( rule__GlobalNamespace__Group__0 )
            // InternalComponentInterface.g:194:4: rule__GlobalNamespace__Group__0
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
    // InternalComponentInterface.g:203:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalComponentInterface.g:204:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:205:1: ruleRelativeNamespace_Impl EOF
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
    // InternalComponentInterface.g:212:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:216:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalComponentInterface.g:217:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalComponentInterface.g:217:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalComponentInterface.g:218:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalComponentInterface.g:219:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalComponentInterface.g:219:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalComponentInterface.g:228:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( rulePrivateNamespace EOF )
            // InternalComponentInterface.g:230:1: rulePrivateNamespace EOF
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
    // InternalComponentInterface.g:237:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalComponentInterface.g:243:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalComponentInterface.g:244:3: ( rule__PrivateNamespace__Group__0 )
            // InternalComponentInterface.g:244:4: rule__PrivateNamespace__Group__0
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
    // InternalComponentInterface.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:254:1: ( ruleEString EOF )
            // InternalComponentInterface.g:255:1: ruleEString EOF
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
    // InternalComponentInterface.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComponentInterface.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComponentInterface.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalComponentInterface.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComponentInterface.g:269:3: ( rule__EString__Alternatives )
            // InternalComponentInterface.g:269:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComponentInterface.g:277:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:281:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:282:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:282:2: ( RULE_STRING )
                    // InternalComponentInterface.g:283:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:288:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:288:2: ( RULE_ID )
                    // InternalComponentInterface.g:289:3: RULE_ID
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


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalComponentInterface.g:298:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:302:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:303:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__1();

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
    // $ANTLR end "rule__ComponentInterface__Group__0"


    // $ANTLR start "rule__ComponentInterface__Group__0__Impl"
    // InternalComponentInterface.g:310:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:314:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:315:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:315:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:316:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__1"
    // InternalComponentInterface.g:325:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:329:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:330:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__2();

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
    // $ANTLR end "rule__ComponentInterface__Group__1"


    // $ANTLR start "rule__ComponentInterface__Group__1__Impl"
    // InternalComponentInterface.g:337:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:341:1: ( ( '{' ) )
            // InternalComponentInterface.g:342:1: ( '{' )
            {
            // InternalComponentInterface.g:342:1: ( '{' )
            // InternalComponentInterface.g:343:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__2"
    // InternalComponentInterface.g:352:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:356:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:357:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__3();

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
    // $ANTLR end "rule__ComponentInterface__Group__2"


    // $ANTLR start "rule__ComponentInterface__Group__2__Impl"
    // InternalComponentInterface.g:364:1: rule__ComponentInterface__Group__2__Impl : ( ( rule__ComponentInterface__Group_2__0 )? ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:368:1: ( ( ( rule__ComponentInterface__Group_2__0 )? ) )
            // InternalComponentInterface.g:369:1: ( ( rule__ComponentInterface__Group_2__0 )? )
            {
            // InternalComponentInterface.g:369:1: ( ( rule__ComponentInterface__Group_2__0 )? )
            // InternalComponentInterface.g:370:2: ( rule__ComponentInterface__Group_2__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_2()); 
            // InternalComponentInterface.g:371:2: ( rule__ComponentInterface__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:371:3: rule__ComponentInterface__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__3"
    // InternalComponentInterface.g:379:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:383:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:384:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__4();

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
    // $ANTLR end "rule__ComponentInterface__Group__3"


    // $ANTLR start "rule__ComponentInterface__Group__3__Impl"
    // InternalComponentInterface.g:391:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__Group_3__0 )? ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:395:1: ( ( ( rule__ComponentInterface__Group_3__0 )? ) )
            // InternalComponentInterface.g:396:1: ( ( rule__ComponentInterface__Group_3__0 )? )
            {
            // InternalComponentInterface.g:396:1: ( ( rule__ComponentInterface__Group_3__0 )? )
            // InternalComponentInterface.g:397:2: ( rule__ComponentInterface__Group_3__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:398:2: ( rule__ComponentInterface__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:398:3: rule__ComponentInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__4"
    // InternalComponentInterface.g:406:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:410:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:411:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__5();

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
    // $ANTLR end "rule__ComponentInterface__Group__4"


    // $ANTLR start "rule__ComponentInterface__Group__4__Impl"
    // InternalComponentInterface.g:418:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:422:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:423:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:423:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:424:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:425:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:425:3: rule__ComponentInterface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__5"
    // InternalComponentInterface.g:433:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:437:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:438:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__6();

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
    // $ANTLR end "rule__ComponentInterface__Group__5"


    // $ANTLR start "rule__ComponentInterface__Group__5__Impl"
    // InternalComponentInterface.g:445:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:449:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:450:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:450:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:451:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:452:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:452:3: rule__ComponentInterface__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__5__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__6"
    // InternalComponentInterface.g:460:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:464:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:465:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__7();

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
    // $ANTLR end "rule__ComponentInterface__Group__6"


    // $ANTLR start "rule__ComponentInterface__Group__6__Impl"
    // InternalComponentInterface.g:472:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:476:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:477:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:477:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:478:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:479:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:479:3: rule__ComponentInterface__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__6__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__7"
    // InternalComponentInterface.g:487:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:491:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:492:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__8();

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
    // $ANTLR end "rule__ComponentInterface__Group__7"


    // $ANTLR start "rule__ComponentInterface__Group__7__Impl"
    // InternalComponentInterface.g:499:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:503:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:504:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:504:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:505:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:506:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:506:3: rule__ComponentInterface__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__7__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__8"
    // InternalComponentInterface.g:514:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:518:1: ( rule__ComponentInterface__Group__8__Impl )
            // InternalComponentInterface.g:519:2: rule__ComponentInterface__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__8__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group__8"


    // $ANTLR start "rule__ComponentInterface__Group__8__Impl"
    // InternalComponentInterface.g:525:1: rule__ComponentInterface__Group__8__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:529:1: ( ( '}' ) )
            // InternalComponentInterface.g:530:1: ( '}' )
            {
            // InternalComponentInterface.g:530:1: ( '}' )
            // InternalComponentInterface.g:531:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__8__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_2__0"
    // InternalComponentInterface.g:541:1: rule__ComponentInterface__Group_2__0 : rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1 ;
    public final void rule__ComponentInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:545:1: ( rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1 )
            // InternalComponentInterface.g:546:2: rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentInterface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_2__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_2__0"


    // $ANTLR start "rule__ComponentInterface__Group_2__0__Impl"
    // InternalComponentInterface.g:553:1: rule__ComponentInterface__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:557:1: ( ( 'name' ) )
            // InternalComponentInterface.g:558:1: ( 'name' )
            {
            // InternalComponentInterface.g:558:1: ( 'name' )
            // InternalComponentInterface.g:559:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_2__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_2__1"
    // InternalComponentInterface.g:568:1: rule__ComponentInterface__Group_2__1 : rule__ComponentInterface__Group_2__1__Impl ;
    public final void rule__ComponentInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:572:1: ( rule__ComponentInterface__Group_2__1__Impl )
            // InternalComponentInterface.g:573:2: rule__ComponentInterface__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_2__1__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_2__1"


    // $ANTLR start "rule__ComponentInterface__Group_2__1__Impl"
    // InternalComponentInterface.g:579:1: rule__ComponentInterface__Group_2__1__Impl : ( ( rule__ComponentInterface__NameAssignment_2_1 ) ) ;
    public final void rule__ComponentInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:583:1: ( ( ( rule__ComponentInterface__NameAssignment_2_1 ) ) )
            // InternalComponentInterface.g:584:1: ( ( rule__ComponentInterface__NameAssignment_2_1 ) )
            {
            // InternalComponentInterface.g:584:1: ( ( rule__ComponentInterface__NameAssignment_2_1 ) )
            // InternalComponentInterface.g:585:2: ( rule__ComponentInterface__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2_1()); 
            // InternalComponentInterface.g:586:2: ( rule__ComponentInterface__NameAssignment_2_1 )
            // InternalComponentInterface.g:586:3: rule__ComponentInterface__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_2__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_3__0"
    // InternalComponentInterface.g:595:1: rule__ComponentInterface__Group_3__0 : rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1 ;
    public final void rule__ComponentInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:599:1: ( rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1 )
            // InternalComponentInterface.g:600:2: rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_3__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_3__0__Impl"
    // InternalComponentInterface.g:607:1: rule__ComponentInterface__Group_3__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:611:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:612:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:612:1: ( 'NameSpace' )
            // InternalComponentInterface.g:613:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_3__1"
    // InternalComponentInterface.g:622:1: rule__ComponentInterface__Group_3__1 : rule__ComponentInterface__Group_3__1__Impl ;
    public final void rule__ComponentInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:626:1: ( rule__ComponentInterface__Group_3__1__Impl )
            // InternalComponentInterface.g:627:2: rule__ComponentInterface__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_3__1__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_3__1__Impl"
    // InternalComponentInterface.g:633:1: rule__ComponentInterface__Group_3__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:637:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) ) )
            // InternalComponentInterface.g:638:1: ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:638:1: ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) )
            // InternalComponentInterface.g:639:2: ( rule__ComponentInterface__NameSpaceAssignment_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_3_1()); 
            // InternalComponentInterface.g:640:2: ( rule__ComponentInterface__NameSpaceAssignment_3_1 )
            // InternalComponentInterface.g:640:3: rule__ComponentInterface__NameSpaceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameSpaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__0"
    // InternalComponentInterface.g:649:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:653:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:654:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_4__0"


    // $ANTLR start "rule__ComponentInterface__Group_4__0__Impl"
    // InternalComponentInterface.g:661:1: rule__ComponentInterface__Group_4__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:665:1: ( ( 'RosPublishers' ) )
            // InternalComponentInterface.g:666:1: ( 'RosPublishers' )
            {
            // InternalComponentInterface.g:666:1: ( 'RosPublishers' )
            // InternalComponentInterface.g:667:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__1"
    // InternalComponentInterface.g:676:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2 ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:680:1: ( rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2 )
            // InternalComponentInterface.g:681:2: rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__2();

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
    // $ANTLR end "rule__ComponentInterface__Group_4__1"


    // $ANTLR start "rule__ComponentInterface__Group_4__1__Impl"
    // InternalComponentInterface.g:688:1: rule__ComponentInterface__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:692:1: ( ( '{' ) )
            // InternalComponentInterface.g:693:1: ( '{' )
            {
            // InternalComponentInterface.g:693:1: ( '{' )
            // InternalComponentInterface.g:694:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__2"
    // InternalComponentInterface.g:703:1: rule__ComponentInterface__Group_4__2 : rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3 ;
    public final void rule__ComponentInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:707:1: ( rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3 )
            // InternalComponentInterface.g:708:2: rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__3();

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
    // $ANTLR end "rule__ComponentInterface__Group_4__2"


    // $ANTLR start "rule__ComponentInterface__Group_4__2__Impl"
    // InternalComponentInterface.g:715:1: rule__ComponentInterface__Group_4__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) ) ;
    public final void rule__ComponentInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:719:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) ) )
            // InternalComponentInterface.g:720:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) )
            {
            // InternalComponentInterface.g:720:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) )
            // InternalComponentInterface.g:721:2: ( rule__ComponentInterface__RospublisherAssignment_4_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_2()); 
            // InternalComponentInterface.g:722:2: ( rule__ComponentInterface__RospublisherAssignment_4_2 )
            // InternalComponentInterface.g:722:3: rule__ComponentInterface__RospublisherAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__3"
    // InternalComponentInterface.g:730:1: rule__ComponentInterface__Group_4__3 : rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4 ;
    public final void rule__ComponentInterface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:734:1: ( rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4 )
            // InternalComponentInterface.g:735:2: rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__4();

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
    // $ANTLR end "rule__ComponentInterface__Group_4__3"


    // $ANTLR start "rule__ComponentInterface__Group_4__3__Impl"
    // InternalComponentInterface.g:742:1: rule__ComponentInterface__Group_4__3__Impl : ( ( rule__ComponentInterface__Group_4_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:746:1: ( ( ( rule__ComponentInterface__Group_4_3__0 )* ) )
            // InternalComponentInterface.g:747:1: ( ( rule__ComponentInterface__Group_4_3__0 )* )
            {
            // InternalComponentInterface.g:747:1: ( ( rule__ComponentInterface__Group_4_3__0 )* )
            // InternalComponentInterface.g:748:2: ( rule__ComponentInterface__Group_4_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4_3()); 
            // InternalComponentInterface.g:749:2: ( rule__ComponentInterface__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentInterface.g:749:3: rule__ComponentInterface__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentInterface__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__4"
    // InternalComponentInterface.g:757:1: rule__ComponentInterface__Group_4__4 : rule__ComponentInterface__Group_4__4__Impl ;
    public final void rule__ComponentInterface__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:761:1: ( rule__ComponentInterface__Group_4__4__Impl )
            // InternalComponentInterface.g:762:2: rule__ComponentInterface__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__4__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_4__4"


    // $ANTLR start "rule__ComponentInterface__Group_4__4__Impl"
    // InternalComponentInterface.g:768:1: rule__ComponentInterface__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:772:1: ( ( '}' ) )
            // InternalComponentInterface.g:773:1: ( '}' )
            {
            // InternalComponentInterface.g:773:1: ( '}' )
            // InternalComponentInterface.g:774:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4_3__0"
    // InternalComponentInterface.g:784:1: rule__ComponentInterface__Group_4_3__0 : rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1 ;
    public final void rule__ComponentInterface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:788:1: ( rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1 )
            // InternalComponentInterface.g:789:2: rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4_3__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_4_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_4_3__0__Impl"
    // InternalComponentInterface.g:796:1: rule__ComponentInterface__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:800:1: ( ( ',' ) )
            // InternalComponentInterface.g:801:1: ( ',' )
            {
            // InternalComponentInterface.g:801:1: ( ',' )
            // InternalComponentInterface.g:802:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4_3__1"
    // InternalComponentInterface.g:811:1: rule__ComponentInterface__Group_4_3__1 : rule__ComponentInterface__Group_4_3__1__Impl ;
    public final void rule__ComponentInterface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:815:1: ( rule__ComponentInterface__Group_4_3__1__Impl )
            // InternalComponentInterface.g:816:2: rule__ComponentInterface__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_4_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_4_3__1__Impl"
    // InternalComponentInterface.g:822:1: rule__ComponentInterface__Group_4_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:826:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) ) )
            // InternalComponentInterface.g:827:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) )
            {
            // InternalComponentInterface.g:827:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) )
            // InternalComponentInterface.g:828:2: ( rule__ComponentInterface__RospublisherAssignment_4_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_3_1()); 
            // InternalComponentInterface.g:829:2: ( rule__ComponentInterface__RospublisherAssignment_4_3_1 )
            // InternalComponentInterface.g:829:3: rule__ComponentInterface__RospublisherAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__0"
    // InternalComponentInterface.g:838:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:842:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:843:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_5__0"


    // $ANTLR start "rule__ComponentInterface__Group_5__0__Impl"
    // InternalComponentInterface.g:850:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:854:1: ( ( 'RosSubscribers' ) )
            // InternalComponentInterface.g:855:1: ( 'RosSubscribers' )
            {
            // InternalComponentInterface.g:855:1: ( 'RosSubscribers' )
            // InternalComponentInterface.g:856:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__1"
    // InternalComponentInterface.g:865:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:869:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalComponentInterface.g:870:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__2();

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
    // $ANTLR end "rule__ComponentInterface__Group_5__1"


    // $ANTLR start "rule__ComponentInterface__Group_5__1__Impl"
    // InternalComponentInterface.g:877:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:881:1: ( ( '{' ) )
            // InternalComponentInterface.g:882:1: ( '{' )
            {
            // InternalComponentInterface.g:882:1: ( '{' )
            // InternalComponentInterface.g:883:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__2"
    // InternalComponentInterface.g:892:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:896:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalComponentInterface.g:897:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__3();

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
    // $ANTLR end "rule__ComponentInterface__Group_5__2"


    // $ANTLR start "rule__ComponentInterface__Group_5__2__Impl"
    // InternalComponentInterface.g:904:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:908:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) ) )
            // InternalComponentInterface.g:909:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) )
            {
            // InternalComponentInterface.g:909:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) )
            // InternalComponentInterface.g:910:2: ( rule__ComponentInterface__RossubscriberAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_2()); 
            // InternalComponentInterface.g:911:2: ( rule__ComponentInterface__RossubscriberAssignment_5_2 )
            // InternalComponentInterface.g:911:3: rule__ComponentInterface__RossubscriberAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__3"
    // InternalComponentInterface.g:919:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:923:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalComponentInterface.g:924:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__4();

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
    // $ANTLR end "rule__ComponentInterface__Group_5__3"


    // $ANTLR start "rule__ComponentInterface__Group_5__3__Impl"
    // InternalComponentInterface.g:931:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:935:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalComponentInterface.g:936:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalComponentInterface.g:936:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalComponentInterface.g:937:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalComponentInterface.g:938:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentInterface.g:938:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentInterface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__4"
    // InternalComponentInterface.g:946:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:950:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalComponentInterface.g:951:2: rule__ComponentInterface__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__4__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_5__4"


    // $ANTLR start "rule__ComponentInterface__Group_5__4__Impl"
    // InternalComponentInterface.g:957:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:961:1: ( ( '}' ) )
            // InternalComponentInterface.g:962:1: ( '}' )
            {
            // InternalComponentInterface.g:962:1: ( '}' )
            // InternalComponentInterface.g:963:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__0"
    // InternalComponentInterface.g:973:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:977:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalComponentInterface.g:978:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5_3__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_5_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__0__Impl"
    // InternalComponentInterface.g:985:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:989:1: ( ( ',' ) )
            // InternalComponentInterface.g:990:1: ( ',' )
            {
            // InternalComponentInterface.g:990:1: ( ',' )
            // InternalComponentInterface.g:991:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__1"
    // InternalComponentInterface.g:1000:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1004:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalComponentInterface.g:1005:2: rule__ComponentInterface__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_5_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__1__Impl"
    // InternalComponentInterface.g:1011:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1015:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) ) )
            // InternalComponentInterface.g:1016:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) )
            {
            // InternalComponentInterface.g:1016:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) )
            // InternalComponentInterface.g:1017:2: ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_3_1()); 
            // InternalComponentInterface.g:1018:2: ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 )
            // InternalComponentInterface.g:1018:3: rule__ComponentInterface__RossubscriberAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__0"
    // InternalComponentInterface.g:1027:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1031:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:1032:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_6__0"


    // $ANTLR start "rule__ComponentInterface__Group_6__0__Impl"
    // InternalComponentInterface.g:1039:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1043:1: ( ( 'RosSrvServers' ) )
            // InternalComponentInterface.g:1044:1: ( 'RosSrvServers' )
            {
            // InternalComponentInterface.g:1044:1: ( 'RosSrvServers' )
            // InternalComponentInterface.g:1045:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__1"
    // InternalComponentInterface.g:1054:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1058:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalComponentInterface.g:1059:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInterface__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__2();

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
    // $ANTLR end "rule__ComponentInterface__Group_6__1"


    // $ANTLR start "rule__ComponentInterface__Group_6__1__Impl"
    // InternalComponentInterface.g:1066:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1070:1: ( ( '{' ) )
            // InternalComponentInterface.g:1071:1: ( '{' )
            {
            // InternalComponentInterface.g:1071:1: ( '{' )
            // InternalComponentInterface.g:1072:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__2"
    // InternalComponentInterface.g:1081:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1085:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalComponentInterface.g:1086:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__3();

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
    // $ANTLR end "rule__ComponentInterface__Group_6__2"


    // $ANTLR start "rule__ComponentInterface__Group_6__2__Impl"
    // InternalComponentInterface.g:1093:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1097:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) ) )
            // InternalComponentInterface.g:1098:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) )
            {
            // InternalComponentInterface.g:1098:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) )
            // InternalComponentInterface.g:1099:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2()); 
            // InternalComponentInterface.g:1100:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2 )
            // InternalComponentInterface.g:1100:3: rule__ComponentInterface__RosserviceserverAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__3"
    // InternalComponentInterface.g:1108:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1112:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalComponentInterface.g:1113:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__4();

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
    // $ANTLR end "rule__ComponentInterface__Group_6__3"


    // $ANTLR start "rule__ComponentInterface__Group_6__3__Impl"
    // InternalComponentInterface.g:1120:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1124:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalComponentInterface.g:1125:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalComponentInterface.g:1125:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalComponentInterface.g:1126:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalComponentInterface.g:1127:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:1127:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentInterface__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__4"
    // InternalComponentInterface.g:1135:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1139:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalComponentInterface.g:1140:2: rule__ComponentInterface__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__4__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_6__4"


    // $ANTLR start "rule__ComponentInterface__Group_6__4__Impl"
    // InternalComponentInterface.g:1146:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1150:1: ( ( '}' ) )
            // InternalComponentInterface.g:1151:1: ( '}' )
            {
            // InternalComponentInterface.g:1151:1: ( '}' )
            // InternalComponentInterface.g:1152:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__0"
    // InternalComponentInterface.g:1162:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1166:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalComponentInterface.g:1167:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInterface__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_6_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__0__Impl"
    // InternalComponentInterface.g:1174:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1178:1: ( ( ',' ) )
            // InternalComponentInterface.g:1179:1: ( ',' )
            {
            // InternalComponentInterface.g:1179:1: ( ',' )
            // InternalComponentInterface.g:1180:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__1"
    // InternalComponentInterface.g:1189:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1193:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalComponentInterface.g:1194:2: rule__ComponentInterface__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_6_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__1__Impl"
    // InternalComponentInterface.g:1200:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1204:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) ) )
            // InternalComponentInterface.g:1205:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) )
            {
            // InternalComponentInterface.g:1205:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) )
            // InternalComponentInterface.g:1206:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_3_1()); 
            // InternalComponentInterface.g:1207:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 )
            // InternalComponentInterface.g:1207:3: rule__ComponentInterface__RosserviceserverAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__0"
    // InternalComponentInterface.g:1216:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1220:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:1221:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_7__0"


    // $ANTLR start "rule__ComponentInterface__Group_7__0__Impl"
    // InternalComponentInterface.g:1228:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1232:1: ( ( 'RosSrvClients' ) )
            // InternalComponentInterface.g:1233:1: ( 'RosSrvClients' )
            {
            // InternalComponentInterface.g:1233:1: ( 'RosSrvClients' )
            // InternalComponentInterface.g:1234:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__1"
    // InternalComponentInterface.g:1243:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1247:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalComponentInterface.g:1248:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__2();

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
    // $ANTLR end "rule__ComponentInterface__Group_7__1"


    // $ANTLR start "rule__ComponentInterface__Group_7__1__Impl"
    // InternalComponentInterface.g:1255:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1259:1: ( ( '{' ) )
            // InternalComponentInterface.g:1260:1: ( '{' )
            {
            // InternalComponentInterface.g:1260:1: ( '{' )
            // InternalComponentInterface.g:1261:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__2"
    // InternalComponentInterface.g:1270:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1274:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalComponentInterface.g:1275:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__3();

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
    // $ANTLR end "rule__ComponentInterface__Group_7__2"


    // $ANTLR start "rule__ComponentInterface__Group_7__2__Impl"
    // InternalComponentInterface.g:1282:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1286:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) ) )
            // InternalComponentInterface.g:1287:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) )
            {
            // InternalComponentInterface.g:1287:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) )
            // InternalComponentInterface.g:1288:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_2()); 
            // InternalComponentInterface.g:1289:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_2 )
            // InternalComponentInterface.g:1289:3: rule__ComponentInterface__RosserviceclientAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__3"
    // InternalComponentInterface.g:1297:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1301:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalComponentInterface.g:1302:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__4();

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
    // $ANTLR end "rule__ComponentInterface__Group_7__3"


    // $ANTLR start "rule__ComponentInterface__Group_7__3__Impl"
    // InternalComponentInterface.g:1309:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1313:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalComponentInterface.g:1314:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalComponentInterface.g:1314:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalComponentInterface.g:1315:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalComponentInterface.g:1316:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:1316:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentInterface__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__4"
    // InternalComponentInterface.g:1324:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1328:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalComponentInterface.g:1329:2: rule__ComponentInterface__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__4__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_7__4"


    // $ANTLR start "rule__ComponentInterface__Group_7__4__Impl"
    // InternalComponentInterface.g:1335:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1339:1: ( ( '}' ) )
            // InternalComponentInterface.g:1340:1: ( '}' )
            {
            // InternalComponentInterface.g:1340:1: ( '}' )
            // InternalComponentInterface.g:1341:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__0"
    // InternalComponentInterface.g:1351:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1355:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalComponentInterface.g:1356:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7_3__1();

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
    // $ANTLR end "rule__ComponentInterface__Group_7_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__0__Impl"
    // InternalComponentInterface.g:1363:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1367:1: ( ( ',' ) )
            // InternalComponentInterface.g:1368:1: ( ',' )
            {
            // InternalComponentInterface.g:1368:1: ( ',' )
            // InternalComponentInterface.g:1369:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__1"
    // InternalComponentInterface.g:1378:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1382:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalComponentInterface.g:1383:2: rule__ComponentInterface__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__ComponentInterface__Group_7_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__1__Impl"
    // InternalComponentInterface.g:1389:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1393:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) ) )
            // InternalComponentInterface.g:1394:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) )
            {
            // InternalComponentInterface.g:1394:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) )
            // InternalComponentInterface.g:1395:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_3_1()); 
            // InternalComponentInterface.g:1396:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 )
            // InternalComponentInterface.g:1396:3: rule__ComponentInterface__RosserviceclientAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7_3__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__0"
    // InternalComponentInterface.g:1405:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1409:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalComponentInterface.g:1410:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RosPublisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__1();

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
    // $ANTLR end "rule__RosPublisher__Group__0"


    // $ANTLR start "rule__RosPublisher__Group__0__Impl"
    // InternalComponentInterface.g:1417:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1421:1: ( ( () ) )
            // InternalComponentInterface.g:1422:1: ( () )
            {
            // InternalComponentInterface.g:1422:1: ( () )
            // InternalComponentInterface.g:1423:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:1424:2: ()
            // InternalComponentInterface.g:1424:3: 
            {
            }

             after(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group__1"
    // InternalComponentInterface.g:1432:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1436:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalComponentInterface.g:1437:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RosPublisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__2();

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
    // $ANTLR end "rule__RosPublisher__Group__1"


    // $ANTLR start "rule__RosPublisher__Group__1__Impl"
    // InternalComponentInterface.g:1444:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1448:1: ( ( 'RosPublisher' ) )
            // InternalComponentInterface.g:1449:1: ( 'RosPublisher' )
            {
            // InternalComponentInterface.g:1449:1: ( 'RosPublisher' )
            // InternalComponentInterface.g:1450:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__2"
    // InternalComponentInterface.g:1459:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1463:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalComponentInterface.g:1464:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RosPublisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__3();

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
    // $ANTLR end "rule__RosPublisher__Group__2"


    // $ANTLR start "rule__RosPublisher__Group__2__Impl"
    // InternalComponentInterface.g:1471:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1475:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:1476:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:1476:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalComponentInterface.g:1477:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:1478:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:1478:3: rule__RosPublisher__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosPublisher__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__2__Impl"


    // $ANTLR start "rule__RosPublisher__Group__3"
    // InternalComponentInterface.g:1486:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1490:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalComponentInterface.g:1491:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RosPublisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__4();

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
    // $ANTLR end "rule__RosPublisher__Group__3"


    // $ANTLR start "rule__RosPublisher__Group__3__Impl"
    // InternalComponentInterface.g:1498:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1502:1: ( ( '{' ) )
            // InternalComponentInterface.g:1503:1: ( '{' )
            {
            // InternalComponentInterface.g:1503:1: ( '{' )
            // InternalComponentInterface.g:1504:2: '{'
            {
             before(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__3__Impl"


    // $ANTLR start "rule__RosPublisher__Group__4"
    // InternalComponentInterface.g:1513:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1517:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalComponentInterface.g:1518:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RosPublisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__5();

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
    // $ANTLR end "rule__RosPublisher__Group__4"


    // $ANTLR start "rule__RosPublisher__Group__4__Impl"
    // InternalComponentInterface.g:1525:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1529:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:1530:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:1530:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalComponentInterface.g:1531:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:1532:2: ( rule__RosPublisher__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:1532:3: rule__RosPublisher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosPublisher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosPublisherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__4__Impl"


    // $ANTLR start "rule__RosPublisher__Group__5"
    // InternalComponentInterface.g:1540:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1544:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalComponentInterface.g:1545:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosPublisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__6();

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
    // $ANTLR end "rule__RosPublisher__Group__5"


    // $ANTLR start "rule__RosPublisher__Group__5__Impl"
    // InternalComponentInterface.g:1552:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1556:1: ( ( 'RefPublisher' ) )
            // InternalComponentInterface.g:1557:1: ( 'RefPublisher' )
            {
            // InternalComponentInterface.g:1557:1: ( 'RefPublisher' )
            // InternalComponentInterface.g:1558:2: 'RefPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__5__Impl"


    // $ANTLR start "rule__RosPublisher__Group__6"
    // InternalComponentInterface.g:1567:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1571:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalComponentInterface.g:1572:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RosPublisher__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__7();

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
    // $ANTLR end "rule__RosPublisher__Group__6"


    // $ANTLR start "rule__RosPublisher__Group__6__Impl"
    // InternalComponentInterface.g:1579:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1583:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalComponentInterface.g:1584:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalComponentInterface.g:1584:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalComponentInterface.g:1585:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalComponentInterface.g:1586:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalComponentInterface.g:1586:3: rule__RosPublisher__PublisherAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__PublisherAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__6__Impl"


    // $ANTLR start "rule__RosPublisher__Group__7"
    // InternalComponentInterface.g:1594:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1598:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalComponentInterface.g:1599:2: rule__RosPublisher__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__7__Impl();

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
    // $ANTLR end "rule__RosPublisher__Group__7"


    // $ANTLR start "rule__RosPublisher__Group__7__Impl"
    // InternalComponentInterface.g:1605:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1609:1: ( ( '}' ) )
            // InternalComponentInterface.g:1610:1: ( '}' )
            {
            // InternalComponentInterface.g:1610:1: ( '}' )
            // InternalComponentInterface.g:1611:2: '}'
            {
             before(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__7__Impl"


    // $ANTLR start "rule__RosPublisher__Group_4__0"
    // InternalComponentInterface.g:1621:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1625:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalComponentInterface.g:1626:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosPublisher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_4__1();

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
    // $ANTLR end "rule__RosPublisher__Group_4__0"


    // $ANTLR start "rule__RosPublisher__Group_4__0__Impl"
    // InternalComponentInterface.g:1633:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1637:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:1638:1: ( 'ns' )
            {
            // InternalComponentInterface.g:1638:1: ( 'ns' )
            // InternalComponentInterface.g:1639:2: 'ns'
            {
             before(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_4__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group_4__1"
    // InternalComponentInterface.g:1648:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1652:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalComponentInterface.g:1653:2: rule__RosPublisher__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_4__1__Impl();

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
    // $ANTLR end "rule__RosPublisher__Group_4__1"


    // $ANTLR start "rule__RosPublisher__Group_4__1__Impl"
    // InternalComponentInterface.g:1659:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1663:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:1664:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:1664:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:1665:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:1666:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalComponentInterface.g:1666:3: rule__RosPublisher__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_4__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__0"
    // InternalComponentInterface.g:1675:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1679:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalComponentInterface.g:1680:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RosSubscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__1();

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
    // $ANTLR end "rule__RosSubscriber__Group__0"


    // $ANTLR start "rule__RosSubscriber__Group__0__Impl"
    // InternalComponentInterface.g:1687:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1691:1: ( ( () ) )
            // InternalComponentInterface.g:1692:1: ( () )
            {
            // InternalComponentInterface.g:1692:1: ( () )
            // InternalComponentInterface.g:1693:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:1694:2: ()
            // InternalComponentInterface.g:1694:3: 
            {
            }

             after(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__1"
    // InternalComponentInterface.g:1702:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1706:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalComponentInterface.g:1707:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RosSubscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__2();

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
    // $ANTLR end "rule__RosSubscriber__Group__1"


    // $ANTLR start "rule__RosSubscriber__Group__1__Impl"
    // InternalComponentInterface.g:1714:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1718:1: ( ( 'RosSubscriber' ) )
            // InternalComponentInterface.g:1719:1: ( 'RosSubscriber' )
            {
            // InternalComponentInterface.g:1719:1: ( 'RosSubscriber' )
            // InternalComponentInterface.g:1720:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__2"
    // InternalComponentInterface.g:1729:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1733:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalComponentInterface.g:1734:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RosSubscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__3();

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
    // $ANTLR end "rule__RosSubscriber__Group__2"


    // $ANTLR start "rule__RosSubscriber__Group__2__Impl"
    // InternalComponentInterface.g:1741:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1745:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:1746:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:1746:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalComponentInterface.g:1747:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:1748:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:1748:3: rule__RosSubscriber__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSubscriber__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__2__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__3"
    // InternalComponentInterface.g:1756:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1760:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalComponentInterface.g:1761:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__RosSubscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__4();

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
    // $ANTLR end "rule__RosSubscriber__Group__3"


    // $ANTLR start "rule__RosSubscriber__Group__3__Impl"
    // InternalComponentInterface.g:1768:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1772:1: ( ( '{' ) )
            // InternalComponentInterface.g:1773:1: ( '{' )
            {
            // InternalComponentInterface.g:1773:1: ( '{' )
            // InternalComponentInterface.g:1774:2: '{'
            {
             before(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__3__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__4"
    // InternalComponentInterface.g:1783:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1787:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalComponentInterface.g:1788:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__RosSubscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__5();

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
    // $ANTLR end "rule__RosSubscriber__Group__4"


    // $ANTLR start "rule__RosSubscriber__Group__4__Impl"
    // InternalComponentInterface.g:1795:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1799:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:1800:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:1800:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalComponentInterface.g:1801:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:1802:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:1802:3: rule__RosSubscriber__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSubscriber__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSubscriberAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__4__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__5"
    // InternalComponentInterface.g:1810:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1814:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalComponentInterface.g:1815:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosSubscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__6();

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
    // $ANTLR end "rule__RosSubscriber__Group__5"


    // $ANTLR start "rule__RosSubscriber__Group__5__Impl"
    // InternalComponentInterface.g:1822:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1826:1: ( ( 'RefSubscriber' ) )
            // InternalComponentInterface.g:1827:1: ( 'RefSubscriber' )
            {
            // InternalComponentInterface.g:1827:1: ( 'RefSubscriber' )
            // InternalComponentInterface.g:1828:2: 'RefSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__5__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__6"
    // InternalComponentInterface.g:1837:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1841:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalComponentInterface.g:1842:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RosSubscriber__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__7();

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
    // $ANTLR end "rule__RosSubscriber__Group__6"


    // $ANTLR start "rule__RosSubscriber__Group__6__Impl"
    // InternalComponentInterface.g:1849:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1853:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalComponentInterface.g:1854:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalComponentInterface.g:1854:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalComponentInterface.g:1855:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalComponentInterface.g:1856:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalComponentInterface.g:1856:3: rule__RosSubscriber__SubscriberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__SubscriberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__6__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__7"
    // InternalComponentInterface.g:1864:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1868:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalComponentInterface.g:1869:2: rule__RosSubscriber__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__7__Impl();

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
    // $ANTLR end "rule__RosSubscriber__Group__7"


    // $ANTLR start "rule__RosSubscriber__Group__7__Impl"
    // InternalComponentInterface.g:1875:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1879:1: ( ( '}' ) )
            // InternalComponentInterface.g:1880:1: ( '}' )
            {
            // InternalComponentInterface.g:1880:1: ( '}' )
            // InternalComponentInterface.g:1881:2: '}'
            {
             before(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__7__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_4__0"
    // InternalComponentInterface.g:1891:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1895:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalComponentInterface.g:1896:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosSubscriber__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_4__1();

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
    // $ANTLR end "rule__RosSubscriber__Group_4__0"


    // $ANTLR start "rule__RosSubscriber__Group_4__0__Impl"
    // InternalComponentInterface.g:1903:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1907:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:1908:1: ( 'ns' )
            {
            // InternalComponentInterface.g:1908:1: ( 'ns' )
            // InternalComponentInterface.g:1909:2: 'ns'
            {
             before(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_4__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_4__1"
    // InternalComponentInterface.g:1918:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1922:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:1923:2: rule__RosSubscriber__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_4__1__Impl();

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
    // $ANTLR end "rule__RosSubscriber__Group_4__1"


    // $ANTLR start "rule__RosSubscriber__Group_4__1__Impl"
    // InternalComponentInterface.g:1929:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1933:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:1934:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:1934:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:1935:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:1936:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalComponentInterface.g:1936:3: rule__RosSubscriber__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_4__1__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__0"
    // InternalComponentInterface.g:1945:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1949:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalComponentInterface.g:1950:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RosServiceServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__1();

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
    // $ANTLR end "rule__RosServiceServer__Group__0"


    // $ANTLR start "rule__RosServiceServer__Group__0__Impl"
    // InternalComponentInterface.g:1957:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1961:1: ( ( () ) )
            // InternalComponentInterface.g:1962:1: ( () )
            {
            // InternalComponentInterface.g:1962:1: ( () )
            // InternalComponentInterface.g:1963:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:1964:2: ()
            // InternalComponentInterface.g:1964:3: 
            {
            }

             after(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__0__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__1"
    // InternalComponentInterface.g:1972:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1976:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalComponentInterface.g:1977:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RosServiceServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__2();

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
    // $ANTLR end "rule__RosServiceServer__Group__1"


    // $ANTLR start "rule__RosServiceServer__Group__1__Impl"
    // InternalComponentInterface.g:1984:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1988:1: ( ( 'RosServiceServer' ) )
            // InternalComponentInterface.g:1989:1: ( 'RosServiceServer' )
            {
            // InternalComponentInterface.g:1989:1: ( 'RosServiceServer' )
            // InternalComponentInterface.g:1990:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__1__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__2"
    // InternalComponentInterface.g:1999:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2003:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalComponentInterface.g:2004:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RosServiceServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__3();

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
    // $ANTLR end "rule__RosServiceServer__Group__2"


    // $ANTLR start "rule__RosServiceServer__Group__2__Impl"
    // InternalComponentInterface.g:2011:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2015:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2016:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2016:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:2017:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2018:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:2018:3: rule__RosServiceServer__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceServer__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__2__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__3"
    // InternalComponentInterface.g:2026:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2030:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalComponentInterface.g:2031:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__RosServiceServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__4();

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
    // $ANTLR end "rule__RosServiceServer__Group__3"


    // $ANTLR start "rule__RosServiceServer__Group__3__Impl"
    // InternalComponentInterface.g:2038:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2042:1: ( ( '{' ) )
            // InternalComponentInterface.g:2043:1: ( '{' )
            {
            // InternalComponentInterface.g:2043:1: ( '{' )
            // InternalComponentInterface.g:2044:2: '{'
            {
             before(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__3__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__4"
    // InternalComponentInterface.g:2053:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2057:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalComponentInterface.g:2058:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__RosServiceServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__5();

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
    // $ANTLR end "rule__RosServiceServer__Group__4"


    // $ANTLR start "rule__RosServiceServer__Group__4__Impl"
    // InternalComponentInterface.g:2065:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2069:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2070:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2070:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2071:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2072:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:2072:3: rule__RosServiceServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__4__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__5"
    // InternalComponentInterface.g:2080:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2084:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalComponentInterface.g:2085:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__6();

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
    // $ANTLR end "rule__RosServiceServer__Group__5"


    // $ANTLR start "rule__RosServiceServer__Group__5__Impl"
    // InternalComponentInterface.g:2092:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2096:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:2097:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:2097:1: ( 'RefServer' )
            // InternalComponentInterface.g:2098:2: 'RefServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__5__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__6"
    // InternalComponentInterface.g:2107:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2111:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalComponentInterface.g:2112:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RosServiceServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__7();

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
    // $ANTLR end "rule__RosServiceServer__Group__6"


    // $ANTLR start "rule__RosServiceServer__Group__6__Impl"
    // InternalComponentInterface.g:2119:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2123:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalComponentInterface.g:2124:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:2124:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalComponentInterface.g:2125:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalComponentInterface.g:2126:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalComponentInterface.g:2126:3: rule__RosServiceServer__SrvserverAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__SrvserverAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__6__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__7"
    // InternalComponentInterface.g:2134:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2138:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalComponentInterface.g:2139:2: rule__RosServiceServer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__7__Impl();

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
    // $ANTLR end "rule__RosServiceServer__Group__7"


    // $ANTLR start "rule__RosServiceServer__Group__7__Impl"
    // InternalComponentInterface.g:2145:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2149:1: ( ( '}' ) )
            // InternalComponentInterface.g:2150:1: ( '}' )
            {
            // InternalComponentInterface.g:2150:1: ( '}' )
            // InternalComponentInterface.g:2151:2: '}'
            {
             before(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__7__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_4__0"
    // InternalComponentInterface.g:2161:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2165:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalComponentInterface.g:2166:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_4__1();

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
    // $ANTLR end "rule__RosServiceServer__Group_4__0"


    // $ANTLR start "rule__RosServiceServer__Group_4__0__Impl"
    // InternalComponentInterface.g:2173:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2177:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2178:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2178:1: ( 'ns' )
            // InternalComponentInterface.g:2179:2: 'ns'
            {
             before(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_4__0__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_4__1"
    // InternalComponentInterface.g:2188:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2192:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:2193:2: rule__RosServiceServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_4__1__Impl();

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
    // $ANTLR end "rule__RosServiceServer__Group_4__1"


    // $ANTLR start "rule__RosServiceServer__Group_4__1__Impl"
    // InternalComponentInterface.g:2199:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2203:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2204:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2204:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2205:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2206:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:2206:3: rule__RosServiceServer__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_4__1__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__0"
    // InternalComponentInterface.g:2215:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2219:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalComponentInterface.g:2220:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosServiceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__1();

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
    // $ANTLR end "rule__RosServiceClient__Group__0"


    // $ANTLR start "rule__RosServiceClient__Group__0__Impl"
    // InternalComponentInterface.g:2227:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2231:1: ( ( () ) )
            // InternalComponentInterface.g:2232:1: ( () )
            {
            // InternalComponentInterface.g:2232:1: ( () )
            // InternalComponentInterface.g:2233:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:2234:2: ()
            // InternalComponentInterface.g:2234:3: 
            {
            }

             after(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__0__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__1"
    // InternalComponentInterface.g:2242:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2246:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalComponentInterface.g:2247:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RosServiceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__2();

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
    // $ANTLR end "rule__RosServiceClient__Group__1"


    // $ANTLR start "rule__RosServiceClient__Group__1__Impl"
    // InternalComponentInterface.g:2254:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2258:1: ( ( 'RosServiceClient' ) )
            // InternalComponentInterface.g:2259:1: ( 'RosServiceClient' )
            {
            // InternalComponentInterface.g:2259:1: ( 'RosServiceClient' )
            // InternalComponentInterface.g:2260:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__1__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__2"
    // InternalComponentInterface.g:2269:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2273:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalComponentInterface.g:2274:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RosServiceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__3();

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
    // $ANTLR end "rule__RosServiceClient__Group__2"


    // $ANTLR start "rule__RosServiceClient__Group__2__Impl"
    // InternalComponentInterface.g:2281:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2285:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2286:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2286:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:2287:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2288:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2288:3: rule__RosServiceClient__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceClient__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__2__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__3"
    // InternalComponentInterface.g:2296:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2300:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalComponentInterface.g:2301:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__RosServiceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__4();

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
    // $ANTLR end "rule__RosServiceClient__Group__3"


    // $ANTLR start "rule__RosServiceClient__Group__3__Impl"
    // InternalComponentInterface.g:2308:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2312:1: ( ( '{' ) )
            // InternalComponentInterface.g:2313:1: ( '{' )
            {
            // InternalComponentInterface.g:2313:1: ( '{' )
            // InternalComponentInterface.g:2314:2: '{'
            {
             before(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__3__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__4"
    // InternalComponentInterface.g:2323:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2327:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalComponentInterface.g:2328:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__RosServiceClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__5();

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
    // $ANTLR end "rule__RosServiceClient__Group__4"


    // $ANTLR start "rule__RosServiceClient__Group__4__Impl"
    // InternalComponentInterface.g:2335:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2339:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:2340:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2340:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:2341:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:2342:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2342:3: rule__RosServiceClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__4__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__5"
    // InternalComponentInterface.g:2350:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2354:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalComponentInterface.g:2355:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__6();

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
    // $ANTLR end "rule__RosServiceClient__Group__5"


    // $ANTLR start "rule__RosServiceClient__Group__5__Impl"
    // InternalComponentInterface.g:2362:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2366:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:2367:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:2367:1: ( 'RefClient' )
            // InternalComponentInterface.g:2368:2: 'RefClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__5__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__6"
    // InternalComponentInterface.g:2377:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2381:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalComponentInterface.g:2382:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RosServiceClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__7();

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
    // $ANTLR end "rule__RosServiceClient__Group__6"


    // $ANTLR start "rule__RosServiceClient__Group__6__Impl"
    // InternalComponentInterface.g:2389:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2393:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalComponentInterface.g:2394:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:2394:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalComponentInterface.g:2395:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalComponentInterface.g:2396:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalComponentInterface.g:2396:3: rule__RosServiceClient__SrvclientAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__SrvclientAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__6__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__7"
    // InternalComponentInterface.g:2404:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2408:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalComponentInterface.g:2409:2: rule__RosServiceClient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__7__Impl();

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
    // $ANTLR end "rule__RosServiceClient__Group__7"


    // $ANTLR start "rule__RosServiceClient__Group__7__Impl"
    // InternalComponentInterface.g:2415:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2419:1: ( ( '}' ) )
            // InternalComponentInterface.g:2420:1: ( '}' )
            {
            // InternalComponentInterface.g:2420:1: ( '}' )
            // InternalComponentInterface.g:2421:2: '}'
            {
             before(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__7__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_4__0"
    // InternalComponentInterface.g:2431:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2435:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalComponentInterface.g:2436:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_4__1();

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
    // $ANTLR end "rule__RosServiceClient__Group_4__0"


    // $ANTLR start "rule__RosServiceClient__Group_4__0__Impl"
    // InternalComponentInterface.g:2443:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2447:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2448:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2448:1: ( 'ns' )
            // InternalComponentInterface.g:2449:2: 'ns'
            {
             before(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_4__0__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_4__1"
    // InternalComponentInterface.g:2458:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2462:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:2463:2: rule__RosServiceClient__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_4__1__Impl();

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
    // $ANTLR end "rule__RosServiceClient__Group_4__1"


    // $ANTLR start "rule__RosServiceClient__Group_4__1__Impl"
    // InternalComponentInterface.g:2469:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2473:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2474:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2474:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2475:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2476:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:2476:3: rule__RosServiceClient__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_4__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalComponentInterface.g:2485:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2489:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalComponentInterface.g:2490:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentInterface.g:2497:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2501:1: ( ( () ) )
            // InternalComponentInterface.g:2502:1: ( () )
            {
            // InternalComponentInterface.g:2502:1: ( () )
            // InternalComponentInterface.g:2503:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalComponentInterface.g:2504:2: ()
            // InternalComponentInterface.g:2504:3: 
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
    // InternalComponentInterface.g:2512:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2516:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalComponentInterface.g:2517:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:2524:1: rule__GlobalNamespace__Group__1__Impl : ( 'GlobalNamespace' ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2528:1: ( ( 'GlobalNamespace' ) )
            // InternalComponentInterface.g:2529:1: ( 'GlobalNamespace' )
            {
            // InternalComponentInterface.g:2529:1: ( 'GlobalNamespace' )
            // InternalComponentInterface.g:2530:2: 'GlobalNamespace'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentInterface.g:2539:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2543:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalComponentInterface.g:2544:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2551:1: rule__GlobalNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2555:1: ( ( '{' ) )
            // InternalComponentInterface.g:2556:1: ( '{' )
            {
            // InternalComponentInterface.g:2556:1: ( '{' )
            // InternalComponentInterface.g:2557:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:2566:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2570:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalComponentInterface.g:2571:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2578:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2582:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:2583:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2583:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:2584:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:2585:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2585:3: rule__GlobalNamespace__Group_3__0
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
    // InternalComponentInterface.g:2593:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2597:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalComponentInterface.g:2598:2: rule__GlobalNamespace__Group__4__Impl
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
    // InternalComponentInterface.g:2604:1: rule__GlobalNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2608:1: ( ( '}' ) )
            // InternalComponentInterface.g:2609:1: ( '}' )
            {
            // InternalComponentInterface.g:2609:1: ( '}' )
            // InternalComponentInterface.g:2610:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:2620:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2624:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalComponentInterface.g:2625:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:2632:1: rule__GlobalNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2636:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:2637:1: ( 'parts' )
            {
            // InternalComponentInterface.g:2637:1: ( 'parts' )
            // InternalComponentInterface.g:2638:2: 'parts'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentInterface.g:2647:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2651:1: ( rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 )
            // InternalComponentInterface.g:2652:2: rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:2659:1: rule__GlobalNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2663:1: ( ( '{' ) )
            // InternalComponentInterface.g:2664:1: ( '{' )
            {
            // InternalComponentInterface.g:2664:1: ( '{' )
            // InternalComponentInterface.g:2665:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:2674:1: rule__GlobalNamespace__Group_3__2 : rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 ;
    public final void rule__GlobalNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2678:1: ( rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 )
            // InternalComponentInterface.g:2679:2: rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:2686:1: rule__GlobalNamespace__Group_3__2__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__GlobalNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2690:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:2691:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:2691:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:2692:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:2693:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            // InternalComponentInterface.g:2693:3: rule__GlobalNamespace__PartsAssignment_3_2
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
    // InternalComponentInterface.g:2701:1: rule__GlobalNamespace__Group_3__3 : rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 ;
    public final void rule__GlobalNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2705:1: ( rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 )
            // InternalComponentInterface.g:2706:2: rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:2713:1: rule__GlobalNamespace__Group_3__3__Impl : ( ( rule__GlobalNamespace__Group_3_3__0 )* ) ;
    public final void rule__GlobalNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2717:1: ( ( ( rule__GlobalNamespace__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:2718:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:2718:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            // InternalComponentInterface.g:2719:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:2720:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentInterface.g:2720:3: rule__GlobalNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__GlobalNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalComponentInterface.g:2728:1: rule__GlobalNamespace__Group_3__4 : rule__GlobalNamespace__Group_3__4__Impl ;
    public final void rule__GlobalNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2732:1: ( rule__GlobalNamespace__Group_3__4__Impl )
            // InternalComponentInterface.g:2733:2: rule__GlobalNamespace__Group_3__4__Impl
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
    // InternalComponentInterface.g:2739:1: rule__GlobalNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2743:1: ( ( '}' ) )
            // InternalComponentInterface.g:2744:1: ( '}' )
            {
            // InternalComponentInterface.g:2744:1: ( '}' )
            // InternalComponentInterface.g:2745:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:2755:1: rule__GlobalNamespace__Group_3_3__0 : rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 ;
    public final void rule__GlobalNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2759:1: ( rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 )
            // InternalComponentInterface.g:2760:2: rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:2767:1: rule__GlobalNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__GlobalNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2771:1: ( ( ',' ) )
            // InternalComponentInterface.g:2772:1: ( ',' )
            {
            // InternalComponentInterface.g:2772:1: ( ',' )
            // InternalComponentInterface.g:2773:2: ','
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:2782:1: rule__GlobalNamespace__Group_3_3__1 : rule__GlobalNamespace__Group_3_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2786:1: ( rule__GlobalNamespace__Group_3_3__1__Impl )
            // InternalComponentInterface.g:2787:2: rule__GlobalNamespace__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:2793:1: rule__GlobalNamespace__Group_3_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2797:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:2798:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:2798:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:2799:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:2800:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:2800:3: rule__GlobalNamespace__PartsAssignment_3_3_1
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
    // InternalComponentInterface.g:2809:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2813:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalComponentInterface.g:2814:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:2821:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2825:1: ( ( () ) )
            // InternalComponentInterface.g:2826:1: ( () )
            {
            // InternalComponentInterface.g:2826:1: ( () )
            // InternalComponentInterface.g:2827:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalComponentInterface.g:2828:2: ()
            // InternalComponentInterface.g:2828:3: 
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
    // InternalComponentInterface.g:2836:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2840:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalComponentInterface.g:2841:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:2848:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( 'RelativeNamespace' ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2852:1: ( ( 'RelativeNamespace' ) )
            // InternalComponentInterface.g:2853:1: ( 'RelativeNamespace' )
            {
            // InternalComponentInterface.g:2853:1: ( 'RelativeNamespace' )
            // InternalComponentInterface.g:2854:2: 'RelativeNamespace'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalComponentInterface.g:2863:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2867:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalComponentInterface.g:2868:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2875:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2879:1: ( ( '{' ) )
            // InternalComponentInterface.g:2880:1: ( '{' )
            {
            // InternalComponentInterface.g:2880:1: ( '{' )
            // InternalComponentInterface.g:2881:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:2890:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2894:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalComponentInterface.g:2895:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2902:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2906:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalComponentInterface.g:2907:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2907:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalComponentInterface.g:2908:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalComponentInterface.g:2909:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2909:3: rule__RelativeNamespace_Impl__Group_3__0
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
    // InternalComponentInterface.g:2917:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2921:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalComponentInterface.g:2922:2: rule__RelativeNamespace_Impl__Group__4__Impl
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
    // InternalComponentInterface.g:2928:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2932:1: ( ( '}' ) )
            // InternalComponentInterface.g:2933:1: ( '}' )
            {
            // InternalComponentInterface.g:2933:1: ( '}' )
            // InternalComponentInterface.g:2934:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:2944:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2948:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalComponentInterface.g:2949:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:2956:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2960:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:2961:1: ( 'parts' )
            {
            // InternalComponentInterface.g:2961:1: ( 'parts' )
            // InternalComponentInterface.g:2962:2: 'parts'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentInterface.g:2971:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2975:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 )
            // InternalComponentInterface.g:2976:2: rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:2983:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2987:1: ( ( '{' ) )
            // InternalComponentInterface.g:2988:1: ( '{' )
            {
            // InternalComponentInterface.g:2988:1: ( '{' )
            // InternalComponentInterface.g:2989:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:2998:1: rule__RelativeNamespace_Impl__Group_3__2 : rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 ;
    public final void rule__RelativeNamespace_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3002:1: ( rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 )
            // InternalComponentInterface.g:3003:2: rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:3010:1: rule__RelativeNamespace_Impl__Group_3__2__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3014:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:3015:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:3015:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:3016:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:3017:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            // InternalComponentInterface.g:3017:3: rule__RelativeNamespace_Impl__PartsAssignment_3_2
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
    // InternalComponentInterface.g:3025:1: rule__RelativeNamespace_Impl__Group_3__3 : rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 ;
    public final void rule__RelativeNamespace_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3029:1: ( rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 )
            // InternalComponentInterface.g:3030:2: rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:3037:1: rule__RelativeNamespace_Impl__Group_3__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3041:1: ( ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:3042:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:3042:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            // InternalComponentInterface.g:3043:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:3044:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalComponentInterface.g:3044:3: rule__RelativeNamespace_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RelativeNamespace_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalComponentInterface.g:3052:1: rule__RelativeNamespace_Impl__Group_3__4 : rule__RelativeNamespace_Impl__Group_3__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3056:1: ( rule__RelativeNamespace_Impl__Group_3__4__Impl )
            // InternalComponentInterface.g:3057:2: rule__RelativeNamespace_Impl__Group_3__4__Impl
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
    // InternalComponentInterface.g:3063:1: rule__RelativeNamespace_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3067:1: ( ( '}' ) )
            // InternalComponentInterface.g:3068:1: ( '}' )
            {
            // InternalComponentInterface.g:3068:1: ( '}' )
            // InternalComponentInterface.g:3069:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:3079:1: rule__RelativeNamespace_Impl__Group_3_3__0 : rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3083:1: ( rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 )
            // InternalComponentInterface.g:3084:2: rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:3091:1: rule__RelativeNamespace_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3095:1: ( ( ',' ) )
            // InternalComponentInterface.g:3096:1: ( ',' )
            {
            // InternalComponentInterface.g:3096:1: ( ',' )
            // InternalComponentInterface.g:3097:2: ','
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:3106:1: rule__RelativeNamespace_Impl__Group_3_3__1 : rule__RelativeNamespace_Impl__Group_3_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3110:1: ( rule__RelativeNamespace_Impl__Group_3_3__1__Impl )
            // InternalComponentInterface.g:3111:2: rule__RelativeNamespace_Impl__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:3117:1: rule__RelativeNamespace_Impl__Group_3_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3121:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:3122:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:3122:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:3123:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:3124:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:3124:3: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1
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
    // InternalComponentInterface.g:3133:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3137:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalComponentInterface.g:3138:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentInterface.g:3145:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3149:1: ( ( () ) )
            // InternalComponentInterface.g:3150:1: ( () )
            {
            // InternalComponentInterface.g:3150:1: ( () )
            // InternalComponentInterface.g:3151:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalComponentInterface.g:3152:2: ()
            // InternalComponentInterface.g:3152:3: 
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
    // InternalComponentInterface.g:3160:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3164:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalComponentInterface.g:3165:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:3172:1: rule__PrivateNamespace__Group__1__Impl : ( 'PrivateNamespace' ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3176:1: ( ( 'PrivateNamespace' ) )
            // InternalComponentInterface.g:3177:1: ( 'PrivateNamespace' )
            {
            // InternalComponentInterface.g:3177:1: ( 'PrivateNamespace' )
            // InternalComponentInterface.g:3178:2: 'PrivateNamespace'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentInterface.g:3187:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3191:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalComponentInterface.g:3192:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:3199:1: rule__PrivateNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3203:1: ( ( '{' ) )
            // InternalComponentInterface.g:3204:1: ( '{' )
            {
            // InternalComponentInterface.g:3204:1: ( '{' )
            // InternalComponentInterface.g:3205:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:3214:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3218:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalComponentInterface.g:3219:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:3226:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3230:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:3231:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:3231:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:3232:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:3233:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:3233:3: rule__PrivateNamespace__Group_3__0
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
    // InternalComponentInterface.g:3241:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3245:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalComponentInterface.g:3246:2: rule__PrivateNamespace__Group__4__Impl
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
    // InternalComponentInterface.g:3252:1: rule__PrivateNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3256:1: ( ( '}' ) )
            // InternalComponentInterface.g:3257:1: ( '}' )
            {
            // InternalComponentInterface.g:3257:1: ( '}' )
            // InternalComponentInterface.g:3258:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:3268:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3272:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalComponentInterface.g:3273:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:3280:1: rule__PrivateNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3284:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:3285:1: ( 'parts' )
            {
            // InternalComponentInterface.g:3285:1: ( 'parts' )
            // InternalComponentInterface.g:3286:2: 'parts'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentInterface.g:3295:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3299:1: ( rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 )
            // InternalComponentInterface.g:3300:2: rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:3307:1: rule__PrivateNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3311:1: ( ( '{' ) )
            // InternalComponentInterface.g:3312:1: ( '{' )
            {
            // InternalComponentInterface.g:3312:1: ( '{' )
            // InternalComponentInterface.g:3313:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:3322:1: rule__PrivateNamespace__Group_3__2 : rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 ;
    public final void rule__PrivateNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3326:1: ( rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 )
            // InternalComponentInterface.g:3327:2: rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:3334:1: rule__PrivateNamespace__Group_3__2__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__PrivateNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3338:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:3339:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:3339:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:3340:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:3341:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            // InternalComponentInterface.g:3341:3: rule__PrivateNamespace__PartsAssignment_3_2
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
    // InternalComponentInterface.g:3349:1: rule__PrivateNamespace__Group_3__3 : rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 ;
    public final void rule__PrivateNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3353:1: ( rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 )
            // InternalComponentInterface.g:3354:2: rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:3361:1: rule__PrivateNamespace__Group_3__3__Impl : ( ( rule__PrivateNamespace__Group_3_3__0 )* ) ;
    public final void rule__PrivateNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3365:1: ( ( ( rule__PrivateNamespace__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:3366:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:3366:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            // InternalComponentInterface.g:3367:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:3368:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponentInterface.g:3368:3: rule__PrivateNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PrivateNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalComponentInterface.g:3376:1: rule__PrivateNamespace__Group_3__4 : rule__PrivateNamespace__Group_3__4__Impl ;
    public final void rule__PrivateNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3380:1: ( rule__PrivateNamespace__Group_3__4__Impl )
            // InternalComponentInterface.g:3381:2: rule__PrivateNamespace__Group_3__4__Impl
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
    // InternalComponentInterface.g:3387:1: rule__PrivateNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3391:1: ( ( '}' ) )
            // InternalComponentInterface.g:3392:1: ( '}' )
            {
            // InternalComponentInterface.g:3392:1: ( '}' )
            // InternalComponentInterface.g:3393:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:3403:1: rule__PrivateNamespace__Group_3_3__0 : rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 ;
    public final void rule__PrivateNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3407:1: ( rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 )
            // InternalComponentInterface.g:3408:2: rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:3415:1: rule__PrivateNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__PrivateNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3419:1: ( ( ',' ) )
            // InternalComponentInterface.g:3420:1: ( ',' )
            {
            // InternalComponentInterface.g:3420:1: ( ',' )
            // InternalComponentInterface.g:3421:2: ','
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:3430:1: rule__PrivateNamespace__Group_3_3__1 : rule__PrivateNamespace__Group_3_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3434:1: ( rule__PrivateNamespace__Group_3_3__1__Impl )
            // InternalComponentInterface.g:3435:2: rule__PrivateNamespace__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:3441:1: rule__PrivateNamespace__Group_3_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3445:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:3446:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:3446:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:3447:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:3448:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:3448:3: rule__PrivateNamespace__PartsAssignment_3_3_1
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


    // $ANTLR start "rule__ComponentInterface__NameAssignment_2_1"
    // InternalComponentInterface.g:3457:1: rule__ComponentInterface__NameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3461:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3462:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3462:2: ( ruleEString )
            // InternalComponentInterface.g:3463:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameAssignment_2_1"


    // $ANTLR start "rule__ComponentInterface__NameSpaceAssignment_3_1"
    // InternalComponentInterface.g:3472:1: rule__ComponentInterface__NameSpaceAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3476:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3477:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3477:2: ( ruleEString )
            // InternalComponentInterface.g:3478:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameSpaceAssignment_3_1"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_4_2"
    // InternalComponentInterface.g:3487:1: rule__ComponentInterface__RospublisherAssignment_4_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3491:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:3492:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:3492:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:3493:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_4_2"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_4_3_1"
    // InternalComponentInterface.g:3502:1: rule__ComponentInterface__RospublisherAssignment_4_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3506:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:3507:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:3507:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:3508:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_4_3_1"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_5_2"
    // InternalComponentInterface.g:3517:1: rule__ComponentInterface__RossubscriberAssignment_5_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3521:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:3522:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:3522:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:3523:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_5_2"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_5_3_1"
    // InternalComponentInterface.g:3532:1: rule__ComponentInterface__RossubscriberAssignment_5_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3536:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:3537:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:3537:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:3538:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_5_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_6_2"
    // InternalComponentInterface.g:3547:1: rule__ComponentInterface__RosserviceserverAssignment_6_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3551:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:3552:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:3552:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:3553:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_6_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_6_3_1"
    // InternalComponentInterface.g:3562:1: rule__ComponentInterface__RosserviceserverAssignment_6_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3566:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:3567:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:3567:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:3568:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_6_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_7_2"
    // InternalComponentInterface.g:3577:1: rule__ComponentInterface__RosserviceclientAssignment_7_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3581:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:3582:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:3582:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:3583:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_7_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_7_3_1"
    // InternalComponentInterface.g:3592:1: rule__ComponentInterface__RosserviceclientAssignment_7_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3596:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:3597:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:3597:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:3598:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_7_3_1"


    // $ANTLR start "rule__RosPublisher__NameAssignment_2"
    // InternalComponentInterface.g:3607:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3611:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3612:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3612:2: ( ruleEString )
            // InternalComponentInterface.g:3613:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__NameAssignment_2"


    // $ANTLR start "rule__RosPublisher__NsAssignment_4_1"
    // InternalComponentInterface.g:3622:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3626:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3627:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3627:2: ( ruleEString )
            // InternalComponentInterface.g:3628:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__NsAssignment_4_1"


    // $ANTLR start "rule__RosPublisher__PublisherAssignment_6"
    // InternalComponentInterface.g:3637:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3641:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3642:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3642:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3643:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalComponentInterface.g:3644:3: ( ruleEString )
            // InternalComponentInterface.g:3645:4: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getPublisherPublisherEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__PublisherAssignment_6"


    // $ANTLR start "rule__RosSubscriber__NameAssignment_2"
    // InternalComponentInterface.g:3656:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3660:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3661:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3661:2: ( ruleEString )
            // InternalComponentInterface.g:3662:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__NameAssignment_2"


    // $ANTLR start "rule__RosSubscriber__NsAssignment_4_1"
    // InternalComponentInterface.g:3671:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3675:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3676:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3676:2: ( ruleEString )
            // InternalComponentInterface.g:3677:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__NsAssignment_4_1"


    // $ANTLR start "rule__RosSubscriber__SubscriberAssignment_6"
    // InternalComponentInterface.g:3686:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3690:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3691:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3691:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3692:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalComponentInterface.g:3693:3: ( ruleEString )
            // InternalComponentInterface.g:3694:4: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__SubscriberAssignment_6"


    // $ANTLR start "rule__RosServiceServer__NameAssignment_2"
    // InternalComponentInterface.g:3705:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3709:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3710:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3710:2: ( ruleEString )
            // InternalComponentInterface.g:3711:3: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__NameAssignment_2"


    // $ANTLR start "rule__RosServiceServer__NsAssignment_4_1"
    // InternalComponentInterface.g:3720:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3724:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3725:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3725:2: ( ruleEString )
            // InternalComponentInterface.g:3726:3: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__NsAssignment_4_1"


    // $ANTLR start "rule__RosServiceServer__SrvserverAssignment_6"
    // InternalComponentInterface.g:3735:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3739:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3740:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3740:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3741:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalComponentInterface.g:3742:3: ( ruleEString )
            // InternalComponentInterface.g:3743:4: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__SrvserverAssignment_6"


    // $ANTLR start "rule__RosServiceClient__NameAssignment_2"
    // InternalComponentInterface.g:3754:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3758:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3759:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3759:2: ( ruleEString )
            // InternalComponentInterface.g:3760:3: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__NameAssignment_2"


    // $ANTLR start "rule__RosServiceClient__NsAssignment_4_1"
    // InternalComponentInterface.g:3769:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3773:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3774:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3774:2: ( ruleEString )
            // InternalComponentInterface.g:3775:3: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__NsAssignment_4_1"


    // $ANTLR start "rule__RosServiceClient__SrvclientAssignment_6"
    // InternalComponentInterface.g:3784:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3788:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3789:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3789:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3790:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalComponentInterface.g:3791:3: ( ruleEString )
            // InternalComponentInterface.g:3792:4: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__SrvclientAssignment_6"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_2"
    // InternalComponentInterface.g:3803:1: rule__GlobalNamespace__PartsAssignment_3_2 : ( ruleEString ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3807:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3808:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3808:2: ( ruleEString )
            // InternalComponentInterface.g:3809:3: ruleEString
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_2_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3818:1: rule__GlobalNamespace__PartsAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3822:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3823:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3823:2: ( ruleEString )
            // InternalComponentInterface.g:3824:3: ruleEString
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3833:1: rule__RelativeNamespace_Impl__PartsAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3837:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3838:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3838:2: ( ruleEString )
            // InternalComponentInterface.g:3839:3: ruleEString
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_2_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3848:1: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3852:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3853:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3853:2: ( ruleEString )
            // InternalComponentInterface.g:3854:3: ruleEString
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3863:1: rule__PrivateNamespace__PartsAssignment_3_2 : ( ruleEString ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3867:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3868:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3868:2: ( ruleEString )
            // InternalComponentInterface.g:3869:3: ruleEString
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_2_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3878:1: rule__PrivateNamespace__PartsAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3882:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3883:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3883:2: ( ruleEString )
            // InternalComponentInterface.g:3884:3: ruleEString
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001DE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});

}