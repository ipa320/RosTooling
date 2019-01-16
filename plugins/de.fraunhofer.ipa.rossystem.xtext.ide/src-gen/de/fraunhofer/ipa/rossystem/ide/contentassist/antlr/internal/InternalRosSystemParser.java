package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'}'", "'Name'", "'RosComponents'", "'('", "')'", "','", "'TopicConnections'", "'ServiceConnections'", "'TopicConnection'", "'FromTopic'", "'ToTopic'", "'ServiceConnection'", "'FromSrv'", "'ToSrv'", "'ComponentInterface'", "'name'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }


    	private RosSystemGrammarAccess grammarAccess;

    	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystem.g:53:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystem.g:54:1: ( ruleRosSystem EOF )
            // InternalRosSystem.g:55:1: ruleRosSystem EOF
            {
             before(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSystem();

            state._fsp--;

             after(grammarAccess.getRosSystemRule()); 
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
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystem.g:62:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:66:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystem.g:67:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystem.g:67:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystem.g:68:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup()); 
            // InternalRosSystem.g:69:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystem.g:69:4: rule__RosSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleTopicConnection"
    // InternalRosSystem.g:78:1: entryRuleTopicConnection : ruleTopicConnection EOF ;
    public final void entryRuleTopicConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:79:1: ( ruleTopicConnection EOF )
            // InternalRosSystem.g:80:1: ruleTopicConnection EOF
            {
             before(grammarAccess.getTopicConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getTopicConnectionRule()); 
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
    // $ANTLR end "entryRuleTopicConnection"


    // $ANTLR start "ruleTopicConnection"
    // InternalRosSystem.g:87:1: ruleTopicConnection : ( ( rule__TopicConnection__Group__0 ) ) ;
    public final void ruleTopicConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:91:2: ( ( ( rule__TopicConnection__Group__0 ) ) )
            // InternalRosSystem.g:92:2: ( ( rule__TopicConnection__Group__0 ) )
            {
            // InternalRosSystem.g:92:2: ( ( rule__TopicConnection__Group__0 ) )
            // InternalRosSystem.g:93:3: ( rule__TopicConnection__Group__0 )
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup()); 
            // InternalRosSystem.g:94:3: ( rule__TopicConnection__Group__0 )
            // InternalRosSystem.g:94:4: rule__TopicConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopicConnection"


    // $ANTLR start "entryRuleServiceConnection"
    // InternalRosSystem.g:103:1: entryRuleServiceConnection : ruleServiceConnection EOF ;
    public final void entryRuleServiceConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:104:1: ( ruleServiceConnection EOF )
            // InternalRosSystem.g:105:1: ruleServiceConnection EOF
            {
             before(grammarAccess.getServiceConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getServiceConnectionRule()); 
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
    // $ANTLR end "entryRuleServiceConnection"


    // $ANTLR start "ruleServiceConnection"
    // InternalRosSystem.g:112:1: ruleServiceConnection : ( ( rule__ServiceConnection__Group__0 ) ) ;
    public final void ruleServiceConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:116:2: ( ( ( rule__ServiceConnection__Group__0 ) ) )
            // InternalRosSystem.g:117:2: ( ( rule__ServiceConnection__Group__0 ) )
            {
            // InternalRosSystem.g:117:2: ( ( rule__ServiceConnection__Group__0 ) )
            // InternalRosSystem.g:118:3: ( rule__ServiceConnection__Group__0 )
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup()); 
            // InternalRosSystem.g:119:3: ( rule__ServiceConnection__Group__0 )
            // InternalRosSystem.g:119:4: rule__ServiceConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystem.g:129:1: ( ruleEString EOF )
            // InternalRosSystem.g:130:1: ruleEString EOF
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
    // InternalRosSystem.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystem.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystem.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystem.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosSystem.g:144:3: ( rule__EString__Alternatives )
            // InternalRosSystem.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleComponentInterface"
    // InternalRosSystem.g:153:1: entryRuleComponentInterface : ruleComponentInterface EOF ;
    public final void entryRuleComponentInterface() throws RecognitionException {
        try {
            // InternalRosSystem.g:154:1: ( ruleComponentInterface EOF )
            // InternalRosSystem.g:155:1: ruleComponentInterface EOF
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
    // InternalRosSystem.g:162:1: ruleComponentInterface : ( ( rule__ComponentInterface__Group__0 ) ) ;
    public final void ruleComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:166:2: ( ( ( rule__ComponentInterface__Group__0 ) ) )
            // InternalRosSystem.g:167:2: ( ( rule__ComponentInterface__Group__0 ) )
            {
            // InternalRosSystem.g:167:2: ( ( rule__ComponentInterface__Group__0 ) )
            // InternalRosSystem.g:168:3: ( rule__ComponentInterface__Group__0 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup()); 
            // InternalRosSystem.g:169:3: ( rule__ComponentInterface__Group__0 )
            // InternalRosSystem.g:169:4: rule__ComponentInterface__Group__0
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
    // InternalRosSystem.g:178:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalRosSystem.g:179:1: ( ruleRosPublisher EOF )
            // InternalRosSystem.g:180:1: ruleRosPublisher EOF
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
    // InternalRosSystem.g:187:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:191:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalRosSystem.g:192:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalRosSystem.g:192:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalRosSystem.g:193:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalRosSystem.g:194:3: ( rule__RosPublisher__Group__0 )
            // InternalRosSystem.g:194:4: rule__RosPublisher__Group__0
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
    // InternalRosSystem.g:203:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalRosSystem.g:204:1: ( ruleRosSubscriber EOF )
            // InternalRosSystem.g:205:1: ruleRosSubscriber EOF
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
    // InternalRosSystem.g:212:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:216:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalRosSystem.g:217:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalRosSystem.g:217:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalRosSystem.g:218:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalRosSystem.g:219:3: ( rule__RosSubscriber__Group__0 )
            // InternalRosSystem.g:219:4: rule__RosSubscriber__Group__0
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
    // InternalRosSystem.g:228:1: entryRuleRosServiceServer : ruleRosServiceServer EOF ;
    public final void entryRuleRosServiceServer() throws RecognitionException {
        try {
            // InternalRosSystem.g:229:1: ( ruleRosServiceServer EOF )
            // InternalRosSystem.g:230:1: ruleRosServiceServer EOF
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
    // InternalRosSystem.g:237:1: ruleRosServiceServer : ( ( rule__RosServiceServer__Group__0 ) ) ;
    public final void ruleRosServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:241:2: ( ( ( rule__RosServiceServer__Group__0 ) ) )
            // InternalRosSystem.g:242:2: ( ( rule__RosServiceServer__Group__0 ) )
            {
            // InternalRosSystem.g:242:2: ( ( rule__RosServiceServer__Group__0 ) )
            // InternalRosSystem.g:243:3: ( rule__RosServiceServer__Group__0 )
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup()); 
            // InternalRosSystem.g:244:3: ( rule__RosServiceServer__Group__0 )
            // InternalRosSystem.g:244:4: rule__RosServiceServer__Group__0
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
    // InternalRosSystem.g:253:1: entryRuleRosServiceClient : ruleRosServiceClient EOF ;
    public final void entryRuleRosServiceClient() throws RecognitionException {
        try {
            // InternalRosSystem.g:254:1: ( ruleRosServiceClient EOF )
            // InternalRosSystem.g:255:1: ruleRosServiceClient EOF
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
    // InternalRosSystem.g:262:1: ruleRosServiceClient : ( ( rule__RosServiceClient__Group__0 ) ) ;
    public final void ruleRosServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:266:2: ( ( ( rule__RosServiceClient__Group__0 ) ) )
            // InternalRosSystem.g:267:2: ( ( rule__RosServiceClient__Group__0 ) )
            {
            // InternalRosSystem.g:267:2: ( ( rule__RosServiceClient__Group__0 ) )
            // InternalRosSystem.g:268:3: ( rule__RosServiceClient__Group__0 )
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup()); 
            // InternalRosSystem.g:269:3: ( rule__RosServiceClient__Group__0 )
            // InternalRosSystem.g:269:4: rule__RosServiceClient__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystem.g:277:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:281:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRosSystem.g:282:2: ( RULE_STRING )
                    {
                    // InternalRosSystem.g:282:2: ( RULE_STRING )
                    // InternalRosSystem.g:283:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:288:2: ( RULE_ID )
                    {
                    // InternalRosSystem.g:288:2: ( RULE_ID )
                    // InternalRosSystem.g:289:3: RULE_ID
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


    // $ANTLR start "rule__RosSystem__Group__0"
    // InternalRosSystem.g:298:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:302:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystem.g:303:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__1();

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
    // $ANTLR end "rule__RosSystem__Group__0"


    // $ANTLR start "rule__RosSystem__Group__0__Impl"
    // InternalRosSystem.g:310:1: rule__RosSystem__Group__0__Impl : ( () ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:314:1: ( ( () ) )
            // InternalRosSystem.g:315:1: ( () )
            {
            // InternalRosSystem.g:315:1: ( () )
            // InternalRosSystem.g:316:2: ()
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 
            // InternalRosSystem.g:317:2: ()
            // InternalRosSystem.g:317:3: 
            {
            }

             after(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0__Impl"


    // $ANTLR start "rule__RosSystem__Group__1"
    // InternalRosSystem.g:325:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:329:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystem.g:330:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__2();

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
    // $ANTLR end "rule__RosSystem__Group__1"


    // $ANTLR start "rule__RosSystem__Group__1__Impl"
    // InternalRosSystem.g:337:1: rule__RosSystem__Group__1__Impl : ( 'RosSystem' ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:341:1: ( ( 'RosSystem' ) )
            // InternalRosSystem.g:342:1: ( 'RosSystem' )
            {
            // InternalRosSystem.g:342:1: ( 'RosSystem' )
            // InternalRosSystem.g:343:2: 'RosSystem'
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__1__Impl"


    // $ANTLR start "rule__RosSystem__Group__2"
    // InternalRosSystem.g:352:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:356:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystem.g:357:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__3();

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
    // $ANTLR end "rule__RosSystem__Group__2"


    // $ANTLR start "rule__RosSystem__Group__2__Impl"
    // InternalRosSystem.g:364:1: rule__RosSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:368:1: ( ( '{' ) )
            // InternalRosSystem.g:369:1: ( '{' )
            {
            // InternalRosSystem.g:369:1: ( '{' )
            // InternalRosSystem.g:370:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__2__Impl"


    // $ANTLR start "rule__RosSystem__Group__3"
    // InternalRosSystem.g:379:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:383:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystem.g:384:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__4();

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
    // $ANTLR end "rule__RosSystem__Group__3"


    // $ANTLR start "rule__RosSystem__Group__3__Impl"
    // InternalRosSystem.g:391:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Group_3__0 )? ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:395:1: ( ( ( rule__RosSystem__Group_3__0 )? ) )
            // InternalRosSystem.g:396:1: ( ( rule__RosSystem__Group_3__0 )? )
            {
            // InternalRosSystem.g:396:1: ( ( rule__RosSystem__Group_3__0 )? )
            // InternalRosSystem.g:397:2: ( rule__RosSystem__Group_3__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_3()); 
            // InternalRosSystem.g:398:2: ( rule__RosSystem__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystem.g:398:3: rule__RosSystem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__3__Impl"


    // $ANTLR start "rule__RosSystem__Group__4"
    // InternalRosSystem.g:406:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:410:1: ( rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 )
            // InternalRosSystem.g:411:2: rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__5();

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
    // $ANTLR end "rule__RosSystem__Group__4"


    // $ANTLR start "rule__RosSystem__Group__4__Impl"
    // InternalRosSystem.g:418:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__Group_4__0 )? ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:422:1: ( ( ( rule__RosSystem__Group_4__0 )? ) )
            // InternalRosSystem.g:423:1: ( ( rule__RosSystem__Group_4__0 )? )
            {
            // InternalRosSystem.g:423:1: ( ( rule__RosSystem__Group_4__0 )? )
            // InternalRosSystem.g:424:2: ( rule__RosSystem__Group_4__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4()); 
            // InternalRosSystem.g:425:2: ( rule__RosSystem__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:425:3: rule__RosSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__4__Impl"


    // $ANTLR start "rule__RosSystem__Group__5"
    // InternalRosSystem.g:433:1: rule__RosSystem__Group__5 : rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 ;
    public final void rule__RosSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:437:1: ( rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 )
            // InternalRosSystem.g:438:2: rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__6();

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
    // $ANTLR end "rule__RosSystem__Group__5"


    // $ANTLR start "rule__RosSystem__Group__5__Impl"
    // InternalRosSystem.g:445:1: rule__RosSystem__Group__5__Impl : ( ( rule__RosSystem__Group_5__0 )? ) ;
    public final void rule__RosSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:449:1: ( ( ( rule__RosSystem__Group_5__0 )? ) )
            // InternalRosSystem.g:450:1: ( ( rule__RosSystem__Group_5__0 )? )
            {
            // InternalRosSystem.g:450:1: ( ( rule__RosSystem__Group_5__0 )? )
            // InternalRosSystem.g:451:2: ( rule__RosSystem__Group_5__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5()); 
            // InternalRosSystem.g:452:2: ( rule__RosSystem__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:452:3: rule__RosSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__5__Impl"


    // $ANTLR start "rule__RosSystem__Group__6"
    // InternalRosSystem.g:460:1: rule__RosSystem__Group__6 : rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 ;
    public final void rule__RosSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:464:1: ( rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 )
            // InternalRosSystem.g:465:2: rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__7();

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
    // $ANTLR end "rule__RosSystem__Group__6"


    // $ANTLR start "rule__RosSystem__Group__6__Impl"
    // InternalRosSystem.g:472:1: rule__RosSystem__Group__6__Impl : ( ( rule__RosSystem__Group_6__0 )? ) ;
    public final void rule__RosSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:476:1: ( ( ( rule__RosSystem__Group_6__0 )? ) )
            // InternalRosSystem.g:477:1: ( ( rule__RosSystem__Group_6__0 )? )
            {
            // InternalRosSystem.g:477:1: ( ( rule__RosSystem__Group_6__0 )? )
            // InternalRosSystem.g:478:2: ( rule__RosSystem__Group_6__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6()); 
            // InternalRosSystem.g:479:2: ( rule__RosSystem__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:479:3: rule__RosSystem__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__6__Impl"


    // $ANTLR start "rule__RosSystem__Group__7"
    // InternalRosSystem.g:487:1: rule__RosSystem__Group__7 : rule__RosSystem__Group__7__Impl ;
    public final void rule__RosSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:491:1: ( rule__RosSystem__Group__7__Impl )
            // InternalRosSystem.g:492:2: rule__RosSystem__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__7__Impl();

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
    // $ANTLR end "rule__RosSystem__Group__7"


    // $ANTLR start "rule__RosSystem__Group__7__Impl"
    // InternalRosSystem.g:498:1: rule__RosSystem__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:502:1: ( ( '}' ) )
            // InternalRosSystem.g:503:1: ( '}' )
            {
            // InternalRosSystem.g:503:1: ( '}' )
            // InternalRosSystem.g:504:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__7__Impl"


    // $ANTLR start "rule__RosSystem__Group_3__0"
    // InternalRosSystem.g:514:1: rule__RosSystem__Group_3__0 : rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 ;
    public final void rule__RosSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:518:1: ( rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 )
            // InternalRosSystem.g:519:2: rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RosSystem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_3__0"


    // $ANTLR start "rule__RosSystem__Group_3__0__Impl"
    // InternalRosSystem.g:526:1: rule__RosSystem__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__RosSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:530:1: ( ( 'Name' ) )
            // InternalRosSystem.g:531:1: ( 'Name' )
            {
            // InternalRosSystem.g:531:1: ( 'Name' )
            // InternalRosSystem.g:532:2: 'Name'
            {
             before(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3__1"
    // InternalRosSystem.g:541:1: rule__RosSystem__Group_3__1 : rule__RosSystem__Group_3__1__Impl ;
    public final void rule__RosSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:545:1: ( rule__RosSystem__Group_3__1__Impl )
            // InternalRosSystem.g:546:2: rule__RosSystem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_3__1"


    // $ANTLR start "rule__RosSystem__Group_3__1__Impl"
    // InternalRosSystem.g:552:1: rule__RosSystem__Group_3__1__Impl : ( ( rule__RosSystem__NameAssignment_3_1 ) ) ;
    public final void rule__RosSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:556:1: ( ( ( rule__RosSystem__NameAssignment_3_1 ) ) )
            // InternalRosSystem.g:557:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:557:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            // InternalRosSystem.g:558:2: ( rule__RosSystem__NameAssignment_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 
            // InternalRosSystem.g:559:2: ( rule__RosSystem__NameAssignment_3_1 )
            // InternalRosSystem.g:559:3: rule__RosSystem__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__0"
    // InternalRosSystem.g:568:1: rule__RosSystem__Group_4__0 : rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 ;
    public final void rule__RosSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:572:1: ( rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 )
            // InternalRosSystem.g:573:2: rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__1();

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
    // $ANTLR end "rule__RosSystem__Group_4__0"


    // $ANTLR start "rule__RosSystem__Group_4__0__Impl"
    // InternalRosSystem.g:580:1: rule__RosSystem__Group_4__0__Impl : ( 'RosComponents' ) ;
    public final void rule__RosSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:584:1: ( ( 'RosComponents' ) )
            // InternalRosSystem.g:585:1: ( 'RosComponents' )
            {
            // InternalRosSystem.g:585:1: ( 'RosComponents' )
            // InternalRosSystem.g:586:2: 'RosComponents'
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentsKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosComponentsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__1"
    // InternalRosSystem.g:595:1: rule__RosSystem__Group_4__1 : rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2 ;
    public final void rule__RosSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:599:1: ( rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2 )
            // InternalRosSystem.g:600:2: rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__2();

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
    // $ANTLR end "rule__RosSystem__Group_4__1"


    // $ANTLR start "rule__RosSystem__Group_4__1__Impl"
    // InternalRosSystem.g:607:1: rule__RosSystem__Group_4__1__Impl : ( '(' ) ;
    public final void rule__RosSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:611:1: ( ( '(' ) )
            // InternalRosSystem.g:612:1: ( '(' )
            {
            // InternalRosSystem.g:612:1: ( '(' )
            // InternalRosSystem.g:613:2: '('
            {
             before(grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__2"
    // InternalRosSystem.g:622:1: rule__RosSystem__Group_4__2 : rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3 ;
    public final void rule__RosSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:626:1: ( rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3 )
            // InternalRosSystem.g:627:2: rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__3();

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
    // $ANTLR end "rule__RosSystem__Group_4__2"


    // $ANTLR start "rule__RosSystem__Group_4__2__Impl"
    // InternalRosSystem.g:634:1: rule__RosSystem__Group_4__2__Impl : ( ( rule__RosSystem__RosComponentAssignment_4_2 ) ) ;
    public final void rule__RosSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:638:1: ( ( ( rule__RosSystem__RosComponentAssignment_4_2 ) ) )
            // InternalRosSystem.g:639:1: ( ( rule__RosSystem__RosComponentAssignment_4_2 ) )
            {
            // InternalRosSystem.g:639:1: ( ( rule__RosSystem__RosComponentAssignment_4_2 ) )
            // InternalRosSystem.g:640:2: ( rule__RosSystem__RosComponentAssignment_4_2 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_2()); 
            // InternalRosSystem.g:641:2: ( rule__RosSystem__RosComponentAssignment_4_2 )
            // InternalRosSystem.g:641:3: rule__RosSystem__RosComponentAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__3"
    // InternalRosSystem.g:649:1: rule__RosSystem__Group_4__3 : rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4 ;
    public final void rule__RosSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:653:1: ( rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4 )
            // InternalRosSystem.g:654:2: rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__4();

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
    // $ANTLR end "rule__RosSystem__Group_4__3"


    // $ANTLR start "rule__RosSystem__Group_4__3__Impl"
    // InternalRosSystem.g:661:1: rule__RosSystem__Group_4__3__Impl : ( ( rule__RosSystem__Group_4_3__0 )* ) ;
    public final void rule__RosSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:665:1: ( ( ( rule__RosSystem__Group_4_3__0 )* ) )
            // InternalRosSystem.g:666:1: ( ( rule__RosSystem__Group_4_3__0 )* )
            {
            // InternalRosSystem.g:666:1: ( ( rule__RosSystem__Group_4_3__0 )* )
            // InternalRosSystem.g:667:2: ( rule__RosSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4_3()); 
            // InternalRosSystem.g:668:2: ( rule__RosSystem__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRosSystem.g:668:3: rule__RosSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RosSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__4"
    // InternalRosSystem.g:676:1: rule__RosSystem__Group_4__4 : rule__RosSystem__Group_4__4__Impl ;
    public final void rule__RosSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:680:1: ( rule__RosSystem__Group_4__4__Impl )
            // InternalRosSystem.g:681:2: rule__RosSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__4__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_4__4"


    // $ANTLR start "rule__RosSystem__Group_4__4__Impl"
    // InternalRosSystem.g:687:1: rule__RosSystem__Group_4__4__Impl : ( ')' ) ;
    public final void rule__RosSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:691:1: ( ( ')' ) )
            // InternalRosSystem.g:692:1: ( ')' )
            {
            // InternalRosSystem.g:692:1: ( ')' )
            // InternalRosSystem.g:693:2: ')'
            {
             before(grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_4_3__0"
    // InternalRosSystem.g:703:1: rule__RosSystem__Group_4_3__0 : rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1 ;
    public final void rule__RosSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:707:1: ( rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1 )
            // InternalRosSystem.g:708:2: rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_4_3__0"


    // $ANTLR start "rule__RosSystem__Group_4_3__0__Impl"
    // InternalRosSystem.g:715:1: rule__RosSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:719:1: ( ( ',' ) )
            // InternalRosSystem.g:720:1: ( ',' )
            {
            // InternalRosSystem.g:720:1: ( ',' )
            // InternalRosSystem.g:721:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_4_3__1"
    // InternalRosSystem.g:730:1: rule__RosSystem__Group_4_3__1 : rule__RosSystem__Group_4_3__1__Impl ;
    public final void rule__RosSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:734:1: ( rule__RosSystem__Group_4_3__1__Impl )
            // InternalRosSystem.g:735:2: rule__RosSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_4_3__1"


    // $ANTLR start "rule__RosSystem__Group_4_3__1__Impl"
    // InternalRosSystem.g:741:1: rule__RosSystem__Group_4_3__1__Impl : ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) ) ;
    public final void rule__RosSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:745:1: ( ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) ) )
            // InternalRosSystem.g:746:1: ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) )
            {
            // InternalRosSystem.g:746:1: ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) )
            // InternalRosSystem.g:747:2: ( rule__RosSystem__RosComponentAssignment_4_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_3_1()); 
            // InternalRosSystem.g:748:2: ( rule__RosSystem__RosComponentAssignment_4_3_1 )
            // InternalRosSystem.g:748:3: rule__RosSystem__RosComponentAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__0"
    // InternalRosSystem.g:757:1: rule__RosSystem__Group_5__0 : rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 ;
    public final void rule__RosSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:761:1: ( rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 )
            // InternalRosSystem.g:762:2: rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__1();

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
    // $ANTLR end "rule__RosSystem__Group_5__0"


    // $ANTLR start "rule__RosSystem__Group_5__0__Impl"
    // InternalRosSystem.g:769:1: rule__RosSystem__Group_5__0__Impl : ( 'TopicConnections' ) ;
    public final void rule__RosSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:773:1: ( ( 'TopicConnections' ) )
            // InternalRosSystem.g:774:1: ( 'TopicConnections' )
            {
            // InternalRosSystem.g:774:1: ( 'TopicConnections' )
            // InternalRosSystem.g:775:2: 'TopicConnections'
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__1"
    // InternalRosSystem.g:784:1: rule__RosSystem__Group_5__1 : rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 ;
    public final void rule__RosSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:788:1: ( rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 )
            // InternalRosSystem.g:789:2: rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__RosSystem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__2();

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
    // $ANTLR end "rule__RosSystem__Group_5__1"


    // $ANTLR start "rule__RosSystem__Group_5__1__Impl"
    // InternalRosSystem.g:796:1: rule__RosSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:800:1: ( ( '{' ) )
            // InternalRosSystem.g:801:1: ( '{' )
            {
            // InternalRosSystem.g:801:1: ( '{' )
            // InternalRosSystem.g:802:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__2"
    // InternalRosSystem.g:811:1: rule__RosSystem__Group_5__2 : rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 ;
    public final void rule__RosSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:815:1: ( rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 )
            // InternalRosSystem.g:816:2: rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__RosSystem__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__3();

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
    // $ANTLR end "rule__RosSystem__Group_5__2"


    // $ANTLR start "rule__RosSystem__Group_5__2__Impl"
    // InternalRosSystem.g:823:1: rule__RosSystem__Group_5__2__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) ;
    public final void rule__RosSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:827:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) )
            // InternalRosSystem.g:828:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            {
            // InternalRosSystem.g:828:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            // InternalRosSystem.g:829:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 
            // InternalRosSystem.g:830:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            // InternalRosSystem.g:830:3: rule__RosSystem__TopicConnectionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__3"
    // InternalRosSystem.g:838:1: rule__RosSystem__Group_5__3 : rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 ;
    public final void rule__RosSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:842:1: ( rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 )
            // InternalRosSystem.g:843:2: rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4
            {
            pushFollow(FOLLOW_12);
            rule__RosSystem__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__4();

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
    // $ANTLR end "rule__RosSystem__Group_5__3"


    // $ANTLR start "rule__RosSystem__Group_5__3__Impl"
    // InternalRosSystem.g:850:1: rule__RosSystem__Group_5__3__Impl : ( ( rule__RosSystem__Group_5_3__0 )* ) ;
    public final void rule__RosSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:854:1: ( ( ( rule__RosSystem__Group_5_3__0 )* ) )
            // InternalRosSystem.g:855:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:855:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            // InternalRosSystem.g:856:2: ( rule__RosSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_3()); 
            // InternalRosSystem.g:857:2: ( rule__RosSystem__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRosSystem.g:857:3: rule__RosSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RosSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__4"
    // InternalRosSystem.g:865:1: rule__RosSystem__Group_5__4 : rule__RosSystem__Group_5__4__Impl ;
    public final void rule__RosSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:869:1: ( rule__RosSystem__Group_5__4__Impl )
            // InternalRosSystem.g:870:2: rule__RosSystem__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__4__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_5__4"


    // $ANTLR start "rule__RosSystem__Group_5__4__Impl"
    // InternalRosSystem.g:876:1: rule__RosSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:880:1: ( ( '}' ) )
            // InternalRosSystem.g:881:1: ( '}' )
            {
            // InternalRosSystem.g:881:1: ( '}' )
            // InternalRosSystem.g:882:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_3__0"
    // InternalRosSystem.g:892:1: rule__RosSystem__Group_5_3__0 : rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 ;
    public final void rule__RosSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:896:1: ( rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 )
            // InternalRosSystem.g:897:2: rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__RosSystem__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_5_3__0"


    // $ANTLR start "rule__RosSystem__Group_5_3__0__Impl"
    // InternalRosSystem.g:904:1: rule__RosSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:908:1: ( ( ',' ) )
            // InternalRosSystem.g:909:1: ( ',' )
            {
            // InternalRosSystem.g:909:1: ( ',' )
            // InternalRosSystem.g:910:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_3__1"
    // InternalRosSystem.g:919:1: rule__RosSystem__Group_5_3__1 : rule__RosSystem__Group_5_3__1__Impl ;
    public final void rule__RosSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:923:1: ( rule__RosSystem__Group_5_3__1__Impl )
            // InternalRosSystem.g:924:2: rule__RosSystem__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_5_3__1"


    // $ANTLR start "rule__RosSystem__Group_5_3__1__Impl"
    // InternalRosSystem.g:930:1: rule__RosSystem__Group_5_3__1__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) ;
    public final void rule__RosSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:934:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:935:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:935:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            // InternalRosSystem.g:936:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 
            // InternalRosSystem.g:937:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            // InternalRosSystem.g:937:3: rule__RosSystem__TopicConnectionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__0"
    // InternalRosSystem.g:946:1: rule__RosSystem__Group_6__0 : rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 ;
    public final void rule__RosSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:950:1: ( rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 )
            // InternalRosSystem.g:951:2: rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__1();

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
    // $ANTLR end "rule__RosSystem__Group_6__0"


    // $ANTLR start "rule__RosSystem__Group_6__0__Impl"
    // InternalRosSystem.g:958:1: rule__RosSystem__Group_6__0__Impl : ( 'ServiceConnections' ) ;
    public final void rule__RosSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:962:1: ( ( 'ServiceConnections' ) )
            // InternalRosSystem.g:963:1: ( 'ServiceConnections' )
            {
            // InternalRosSystem.g:963:1: ( 'ServiceConnections' )
            // InternalRosSystem.g:964:2: 'ServiceConnections'
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__1"
    // InternalRosSystem.g:973:1: rule__RosSystem__Group_6__1 : rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 ;
    public final void rule__RosSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:977:1: ( rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 )
            // InternalRosSystem.g:978:2: rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__RosSystem__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__2();

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
    // $ANTLR end "rule__RosSystem__Group_6__1"


    // $ANTLR start "rule__RosSystem__Group_6__1__Impl"
    // InternalRosSystem.g:985:1: rule__RosSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:989:1: ( ( '{' ) )
            // InternalRosSystem.g:990:1: ( '{' )
            {
            // InternalRosSystem.g:990:1: ( '{' )
            // InternalRosSystem.g:991:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__2"
    // InternalRosSystem.g:1000:1: rule__RosSystem__Group_6__2 : rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 ;
    public final void rule__RosSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1004:1: ( rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 )
            // InternalRosSystem.g:1005:2: rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__RosSystem__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__3();

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
    // $ANTLR end "rule__RosSystem__Group_6__2"


    // $ANTLR start "rule__RosSystem__Group_6__2__Impl"
    // InternalRosSystem.g:1012:1: rule__RosSystem__Group_6__2__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) ;
    public final void rule__RosSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1016:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) )
            // InternalRosSystem.g:1017:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            {
            // InternalRosSystem.g:1017:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            // InternalRosSystem.g:1018:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 
            // InternalRosSystem.g:1019:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            // InternalRosSystem.g:1019:3: rule__RosSystem__ServiceConnectionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__3"
    // InternalRosSystem.g:1027:1: rule__RosSystem__Group_6__3 : rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 ;
    public final void rule__RosSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1031:1: ( rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 )
            // InternalRosSystem.g:1032:2: rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4
            {
            pushFollow(FOLLOW_12);
            rule__RosSystem__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__4();

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
    // $ANTLR end "rule__RosSystem__Group_6__3"


    // $ANTLR start "rule__RosSystem__Group_6__3__Impl"
    // InternalRosSystem.g:1039:1: rule__RosSystem__Group_6__3__Impl : ( ( rule__RosSystem__Group_6_3__0 )* ) ;
    public final void rule__RosSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1043:1: ( ( ( rule__RosSystem__Group_6_3__0 )* ) )
            // InternalRosSystem.g:1044:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:1044:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            // InternalRosSystem.g:1045:2: ( rule__RosSystem__Group_6_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_3()); 
            // InternalRosSystem.g:1046:2: ( rule__RosSystem__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRosSystem.g:1046:3: rule__RosSystem__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RosSystem__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__4"
    // InternalRosSystem.g:1054:1: rule__RosSystem__Group_6__4 : rule__RosSystem__Group_6__4__Impl ;
    public final void rule__RosSystem__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1058:1: ( rule__RosSystem__Group_6__4__Impl )
            // InternalRosSystem.g:1059:2: rule__RosSystem__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__4__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_6__4"


    // $ANTLR start "rule__RosSystem__Group_6__4__Impl"
    // InternalRosSystem.g:1065:1: rule__RosSystem__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1069:1: ( ( '}' ) )
            // InternalRosSystem.g:1070:1: ( '}' )
            {
            // InternalRosSystem.g:1070:1: ( '}' )
            // InternalRosSystem.g:1071:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_3__0"
    // InternalRosSystem.g:1081:1: rule__RosSystem__Group_6_3__0 : rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 ;
    public final void rule__RosSystem__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1085:1: ( rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 )
            // InternalRosSystem.g:1086:2: rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1
            {
            pushFollow(FOLLOW_13);
            rule__RosSystem__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_6_3__0"


    // $ANTLR start "rule__RosSystem__Group_6_3__0__Impl"
    // InternalRosSystem.g:1093:1: rule__RosSystem__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1097:1: ( ( ',' ) )
            // InternalRosSystem.g:1098:1: ( ',' )
            {
            // InternalRosSystem.g:1098:1: ( ',' )
            // InternalRosSystem.g:1099:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_3__1"
    // InternalRosSystem.g:1108:1: rule__RosSystem__Group_6_3__1 : rule__RosSystem__Group_6_3__1__Impl ;
    public final void rule__RosSystem__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1112:1: ( rule__RosSystem__Group_6_3__1__Impl )
            // InternalRosSystem.g:1113:2: rule__RosSystem__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_6_3__1"


    // $ANTLR start "rule__RosSystem__Group_6_3__1__Impl"
    // InternalRosSystem.g:1119:1: rule__RosSystem__Group_6_3__1__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) ;
    public final void rule__RosSystem__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1123:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:1124:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:1124:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            // InternalRosSystem.g:1125:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 
            // InternalRosSystem.g:1126:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            // InternalRosSystem.g:1126:3: rule__RosSystem__ServiceConnectionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_3__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__0"
    // InternalRosSystem.g:1135:1: rule__TopicConnection__Group__0 : rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 ;
    public final void rule__TopicConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1139:1: ( rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 )
            // InternalRosSystem.g:1140:2: rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TopicConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__1();

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
    // $ANTLR end "rule__TopicConnection__Group__0"


    // $ANTLR start "rule__TopicConnection__Group__0__Impl"
    // InternalRosSystem.g:1147:1: rule__TopicConnection__Group__0__Impl : ( 'TopicConnection' ) ;
    public final void rule__TopicConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1151:1: ( ( 'TopicConnection' ) )
            // InternalRosSystem.g:1152:1: ( 'TopicConnection' )
            {
            // InternalRosSystem.g:1152:1: ( 'TopicConnection' )
            // InternalRosSystem.g:1153:2: 'TopicConnection'
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group__1"
    // InternalRosSystem.g:1162:1: rule__TopicConnection__Group__1 : rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 ;
    public final void rule__TopicConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1166:1: ( rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 )
            // InternalRosSystem.g:1167:2: rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TopicConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__2();

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
    // $ANTLR end "rule__TopicConnection__Group__1"


    // $ANTLR start "rule__TopicConnection__Group__1__Impl"
    // InternalRosSystem.g:1174:1: rule__TopicConnection__Group__1__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1178:1: ( ( '{' ) )
            // InternalRosSystem.g:1179:1: ( '{' )
            {
            // InternalRosSystem.g:1179:1: ( '{' )
            // InternalRosSystem.g:1180:2: '{'
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__2"
    // InternalRosSystem.g:1189:1: rule__TopicConnection__Group__2 : rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 ;
    public final void rule__TopicConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1193:1: ( rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 )
            // InternalRosSystem.g:1194:2: rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__3();

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
    // $ANTLR end "rule__TopicConnection__Group__2"


    // $ANTLR start "rule__TopicConnection__Group__2__Impl"
    // InternalRosSystem.g:1201:1: rule__TopicConnection__Group__2__Impl : ( 'FromTopic' ) ;
    public final void rule__TopicConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1205:1: ( ( 'FromTopic' ) )
            // InternalRosSystem.g:1206:1: ( 'FromTopic' )
            {
            // InternalRosSystem.g:1206:1: ( 'FromTopic' )
            // InternalRosSystem.g:1207:2: 'FromTopic'
            {
             before(grammarAccess.getTopicConnectionAccess().getFromTopicKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getFromTopicKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__2__Impl"


    // $ANTLR start "rule__TopicConnection__Group__3"
    // InternalRosSystem.g:1216:1: rule__TopicConnection__Group__3 : rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 ;
    public final void rule__TopicConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1220:1: ( rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 )
            // InternalRosSystem.g:1221:2: rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TopicConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__4();

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
    // $ANTLR end "rule__TopicConnection__Group__3"


    // $ANTLR start "rule__TopicConnection__Group__3__Impl"
    // InternalRosSystem.g:1228:1: rule__TopicConnection__Group__3__Impl : ( ( rule__TopicConnection__FromTopicAssignment_3 ) ) ;
    public final void rule__TopicConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1232:1: ( ( ( rule__TopicConnection__FromTopicAssignment_3 ) ) )
            // InternalRosSystem.g:1233:1: ( ( rule__TopicConnection__FromTopicAssignment_3 ) )
            {
            // InternalRosSystem.g:1233:1: ( ( rule__TopicConnection__FromTopicAssignment_3 ) )
            // InternalRosSystem.g:1234:2: ( rule__TopicConnection__FromTopicAssignment_3 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromTopicAssignment_3()); 
            // InternalRosSystem.g:1235:2: ( rule__TopicConnection__FromTopicAssignment_3 )
            // InternalRosSystem.g:1235:3: rule__TopicConnection__FromTopicAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__FromTopicAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getFromTopicAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__3__Impl"


    // $ANTLR start "rule__TopicConnection__Group__4"
    // InternalRosSystem.g:1243:1: rule__TopicConnection__Group__4 : rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 ;
    public final void rule__TopicConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1247:1: ( rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 )
            // InternalRosSystem.g:1248:2: rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__5();

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
    // $ANTLR end "rule__TopicConnection__Group__4"


    // $ANTLR start "rule__TopicConnection__Group__4__Impl"
    // InternalRosSystem.g:1255:1: rule__TopicConnection__Group__4__Impl : ( 'ToTopic' ) ;
    public final void rule__TopicConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1259:1: ( ( 'ToTopic' ) )
            // InternalRosSystem.g:1260:1: ( 'ToTopic' )
            {
            // InternalRosSystem.g:1260:1: ( 'ToTopic' )
            // InternalRosSystem.g:1261:2: 'ToTopic'
            {
             before(grammarAccess.getTopicConnectionAccess().getToTopicKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getToTopicKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__4__Impl"


    // $ANTLR start "rule__TopicConnection__Group__5"
    // InternalRosSystem.g:1270:1: rule__TopicConnection__Group__5 : rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 ;
    public final void rule__TopicConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1274:1: ( rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 )
            // InternalRosSystem.g:1275:2: rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__TopicConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__6();

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
    // $ANTLR end "rule__TopicConnection__Group__5"


    // $ANTLR start "rule__TopicConnection__Group__5__Impl"
    // InternalRosSystem.g:1282:1: rule__TopicConnection__Group__5__Impl : ( ( rule__TopicConnection__ToTopicAssignment_5 ) ) ;
    public final void rule__TopicConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1286:1: ( ( ( rule__TopicConnection__ToTopicAssignment_5 ) ) )
            // InternalRosSystem.g:1287:1: ( ( rule__TopicConnection__ToTopicAssignment_5 ) )
            {
            // InternalRosSystem.g:1287:1: ( ( rule__TopicConnection__ToTopicAssignment_5 ) )
            // InternalRosSystem.g:1288:2: ( rule__TopicConnection__ToTopicAssignment_5 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToTopicAssignment_5()); 
            // InternalRosSystem.g:1289:2: ( rule__TopicConnection__ToTopicAssignment_5 )
            // InternalRosSystem.g:1289:3: rule__TopicConnection__ToTopicAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__ToTopicAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getToTopicAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__5__Impl"


    // $ANTLR start "rule__TopicConnection__Group__6"
    // InternalRosSystem.g:1297:1: rule__TopicConnection__Group__6 : rule__TopicConnection__Group__6__Impl ;
    public final void rule__TopicConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1301:1: ( rule__TopicConnection__Group__6__Impl )
            // InternalRosSystem.g:1302:2: rule__TopicConnection__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__6__Impl();

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
    // $ANTLR end "rule__TopicConnection__Group__6"


    // $ANTLR start "rule__TopicConnection__Group__6__Impl"
    // InternalRosSystem.g:1308:1: rule__TopicConnection__Group__6__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1312:1: ( ( '}' ) )
            // InternalRosSystem.g:1313:1: ( '}' )
            {
            // InternalRosSystem.g:1313:1: ( '}' )
            // InternalRosSystem.g:1314:2: '}'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__6__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__0"
    // InternalRosSystem.g:1324:1: rule__ServiceConnection__Group__0 : rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 ;
    public final void rule__ServiceConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1328:1: ( rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 )
            // InternalRosSystem.g:1329:2: rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__1();

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
    // $ANTLR end "rule__ServiceConnection__Group__0"


    // $ANTLR start "rule__ServiceConnection__Group__0__Impl"
    // InternalRosSystem.g:1336:1: rule__ServiceConnection__Group__0__Impl : ( 'ServiceConnection' ) ;
    public final void rule__ServiceConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1340:1: ( ( 'ServiceConnection' ) )
            // InternalRosSystem.g:1341:1: ( 'ServiceConnection' )
            {
            // InternalRosSystem.g:1341:1: ( 'ServiceConnection' )
            // InternalRosSystem.g:1342:2: 'ServiceConnection'
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__1"
    // InternalRosSystem.g:1351:1: rule__ServiceConnection__Group__1 : rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 ;
    public final void rule__ServiceConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1355:1: ( rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 )
            // InternalRosSystem.g:1356:2: rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ServiceConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__2();

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
    // $ANTLR end "rule__ServiceConnection__Group__1"


    // $ANTLR start "rule__ServiceConnection__Group__1__Impl"
    // InternalRosSystem.g:1363:1: rule__ServiceConnection__Group__1__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1367:1: ( ( '{' ) )
            // InternalRosSystem.g:1368:1: ( '{' )
            {
            // InternalRosSystem.g:1368:1: ( '{' )
            // InternalRosSystem.g:1369:2: '{'
            {
             before(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__2"
    // InternalRosSystem.g:1378:1: rule__ServiceConnection__Group__2 : rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 ;
    public final void rule__ServiceConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1382:1: ( rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 )
            // InternalRosSystem.g:1383:2: rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__3();

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
    // $ANTLR end "rule__ServiceConnection__Group__2"


    // $ANTLR start "rule__ServiceConnection__Group__2__Impl"
    // InternalRosSystem.g:1390:1: rule__ServiceConnection__Group__2__Impl : ( 'FromSrv' ) ;
    public final void rule__ServiceConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1394:1: ( ( 'FromSrv' ) )
            // InternalRosSystem.g:1395:1: ( 'FromSrv' )
            {
            // InternalRosSystem.g:1395:1: ( 'FromSrv' )
            // InternalRosSystem.g:1396:2: 'FromSrv'
            {
             before(grammarAccess.getServiceConnectionAccess().getFromSrvKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getFromSrvKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__2__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__3"
    // InternalRosSystem.g:1405:1: rule__ServiceConnection__Group__3 : rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 ;
    public final void rule__ServiceConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1409:1: ( rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 )
            // InternalRosSystem.g:1410:2: rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ServiceConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__4();

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
    // $ANTLR end "rule__ServiceConnection__Group__3"


    // $ANTLR start "rule__ServiceConnection__Group__3__Impl"
    // InternalRosSystem.g:1417:1: rule__ServiceConnection__Group__3__Impl : ( ( rule__ServiceConnection__FromSrvAssignment_3 ) ) ;
    public final void rule__ServiceConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1421:1: ( ( ( rule__ServiceConnection__FromSrvAssignment_3 ) ) )
            // InternalRosSystem.g:1422:1: ( ( rule__ServiceConnection__FromSrvAssignment_3 ) )
            {
            // InternalRosSystem.g:1422:1: ( ( rule__ServiceConnection__FromSrvAssignment_3 ) )
            // InternalRosSystem.g:1423:2: ( rule__ServiceConnection__FromSrvAssignment_3 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromSrvAssignment_3()); 
            // InternalRosSystem.g:1424:2: ( rule__ServiceConnection__FromSrvAssignment_3 )
            // InternalRosSystem.g:1424:3: rule__ServiceConnection__FromSrvAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__FromSrvAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getFromSrvAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__3__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__4"
    // InternalRosSystem.g:1432:1: rule__ServiceConnection__Group__4 : rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 ;
    public final void rule__ServiceConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1436:1: ( rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 )
            // InternalRosSystem.g:1437:2: rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__5();

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
    // $ANTLR end "rule__ServiceConnection__Group__4"


    // $ANTLR start "rule__ServiceConnection__Group__4__Impl"
    // InternalRosSystem.g:1444:1: rule__ServiceConnection__Group__4__Impl : ( 'ToSrv' ) ;
    public final void rule__ServiceConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1448:1: ( ( 'ToSrv' ) )
            // InternalRosSystem.g:1449:1: ( 'ToSrv' )
            {
            // InternalRosSystem.g:1449:1: ( 'ToSrv' )
            // InternalRosSystem.g:1450:2: 'ToSrv'
            {
             before(grammarAccess.getServiceConnectionAccess().getToSrvKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getToSrvKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__4__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__5"
    // InternalRosSystem.g:1459:1: rule__ServiceConnection__Group__5 : rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 ;
    public final void rule__ServiceConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1463:1: ( rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 )
            // InternalRosSystem.g:1464:2: rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ServiceConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__6();

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
    // $ANTLR end "rule__ServiceConnection__Group__5"


    // $ANTLR start "rule__ServiceConnection__Group__5__Impl"
    // InternalRosSystem.g:1471:1: rule__ServiceConnection__Group__5__Impl : ( ( rule__ServiceConnection__ToSrvAssignment_5 ) ) ;
    public final void rule__ServiceConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1475:1: ( ( ( rule__ServiceConnection__ToSrvAssignment_5 ) ) )
            // InternalRosSystem.g:1476:1: ( ( rule__ServiceConnection__ToSrvAssignment_5 ) )
            {
            // InternalRosSystem.g:1476:1: ( ( rule__ServiceConnection__ToSrvAssignment_5 ) )
            // InternalRosSystem.g:1477:2: ( rule__ServiceConnection__ToSrvAssignment_5 )
            {
             before(grammarAccess.getServiceConnectionAccess().getToSrvAssignment_5()); 
            // InternalRosSystem.g:1478:2: ( rule__ServiceConnection__ToSrvAssignment_5 )
            // InternalRosSystem.g:1478:3: rule__ServiceConnection__ToSrvAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__ToSrvAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getToSrvAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__5__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__6"
    // InternalRosSystem.g:1486:1: rule__ServiceConnection__Group__6 : rule__ServiceConnection__Group__6__Impl ;
    public final void rule__ServiceConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1490:1: ( rule__ServiceConnection__Group__6__Impl )
            // InternalRosSystem.g:1491:2: rule__ServiceConnection__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__6__Impl();

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
    // $ANTLR end "rule__ServiceConnection__Group__6"


    // $ANTLR start "rule__ServiceConnection__Group__6__Impl"
    // InternalRosSystem.g:1497:1: rule__ServiceConnection__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1501:1: ( ( '}' ) )
            // InternalRosSystem.g:1502:1: ( '}' )
            {
            // InternalRosSystem.g:1502:1: ( '}' )
            // InternalRosSystem.g:1503:2: '}'
            {
             before(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__6__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalRosSystem.g:1513:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1517:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalRosSystem.g:1518:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:1525:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1529:1: ( ( 'ComponentInterface' ) )
            // InternalRosSystem.g:1530:1: ( 'ComponentInterface' )
            {
            // InternalRosSystem.g:1530:1: ( 'ComponentInterface' )
            // InternalRosSystem.g:1531:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRosSystem.g:1540:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1544:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalRosSystem.g:1545:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1552:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1556:1: ( ( '{' ) )
            // InternalRosSystem.g:1557:1: ( '{' )
            {
            // InternalRosSystem.g:1557:1: ( '{' )
            // InternalRosSystem.g:1558:2: '{'
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
    // InternalRosSystem.g:1567:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1571:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalRosSystem.g:1572:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1579:1: rule__ComponentInterface__Group__2__Impl : ( ( rule__ComponentInterface__Group_2__0 )? ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1583:1: ( ( ( rule__ComponentInterface__Group_2__0 )? ) )
            // InternalRosSystem.g:1584:1: ( ( rule__ComponentInterface__Group_2__0 )? )
            {
            // InternalRosSystem.g:1584:1: ( ( rule__ComponentInterface__Group_2__0 )? )
            // InternalRosSystem.g:1585:2: ( rule__ComponentInterface__Group_2__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_2()); 
            // InternalRosSystem.g:1586:2: ( rule__ComponentInterface__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:1586:3: rule__ComponentInterface__Group_2__0
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
    // InternalRosSystem.g:1594:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1598:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalRosSystem.g:1599:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1606:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__Group_3__0 )? ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1610:1: ( ( ( rule__ComponentInterface__Group_3__0 )? ) )
            // InternalRosSystem.g:1611:1: ( ( rule__ComponentInterface__Group_3__0 )? )
            {
            // InternalRosSystem.g:1611:1: ( ( rule__ComponentInterface__Group_3__0 )? )
            // InternalRosSystem.g:1612:2: ( rule__ComponentInterface__Group_3__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_3()); 
            // InternalRosSystem.g:1613:2: ( rule__ComponentInterface__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosSystem.g:1613:3: rule__ComponentInterface__Group_3__0
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
    // InternalRosSystem.g:1621:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1625:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalRosSystem.g:1626:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1633:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1637:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalRosSystem.g:1638:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalRosSystem.g:1638:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalRosSystem.g:1639:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalRosSystem.g:1640:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosSystem.g:1640:3: rule__ComponentInterface__Group_4__0
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
    // InternalRosSystem.g:1648:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1652:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalRosSystem.g:1653:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1660:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1664:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalRosSystem.g:1665:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalRosSystem.g:1665:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalRosSystem.g:1666:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalRosSystem.g:1667:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystem.g:1667:3: rule__ComponentInterface__Group_5__0
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
    // InternalRosSystem.g:1675:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1679:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalRosSystem.g:1680:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1687:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1691:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalRosSystem.g:1692:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalRosSystem.g:1692:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalRosSystem.g:1693:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalRosSystem.g:1694:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosSystem.g:1694:3: rule__ComponentInterface__Group_6__0
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
    // InternalRosSystem.g:1702:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1706:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalRosSystem.g:1707:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1714:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1718:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalRosSystem.g:1719:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalRosSystem.g:1719:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalRosSystem.g:1720:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalRosSystem.g:1721:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystem.g:1721:3: rule__ComponentInterface__Group_7__0
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
    // InternalRosSystem.g:1729:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1733:1: ( rule__ComponentInterface__Group__8__Impl )
            // InternalRosSystem.g:1734:2: rule__ComponentInterface__Group__8__Impl
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
    // InternalRosSystem.g:1740:1: rule__ComponentInterface__Group__8__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1744:1: ( ( '}' ) )
            // InternalRosSystem.g:1745:1: ( '}' )
            {
            // InternalRosSystem.g:1745:1: ( '}' )
            // InternalRosSystem.g:1746:2: '}'
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
    // InternalRosSystem.g:1756:1: rule__ComponentInterface__Group_2__0 : rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1 ;
    public final void rule__ComponentInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1760:1: ( rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1 )
            // InternalRosSystem.g:1761:2: rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:1768:1: rule__ComponentInterface__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1772:1: ( ( 'name' ) )
            // InternalRosSystem.g:1773:1: ( 'name' )
            {
            // InternalRosSystem.g:1773:1: ( 'name' )
            // InternalRosSystem.g:1774:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRosSystem.g:1783:1: rule__ComponentInterface__Group_2__1 : rule__ComponentInterface__Group_2__1__Impl ;
    public final void rule__ComponentInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1787:1: ( rule__ComponentInterface__Group_2__1__Impl )
            // InternalRosSystem.g:1788:2: rule__ComponentInterface__Group_2__1__Impl
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
    // InternalRosSystem.g:1794:1: rule__ComponentInterface__Group_2__1__Impl : ( ( rule__ComponentInterface__NameAssignment_2_1 ) ) ;
    public final void rule__ComponentInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1798:1: ( ( ( rule__ComponentInterface__NameAssignment_2_1 ) ) )
            // InternalRosSystem.g:1799:1: ( ( rule__ComponentInterface__NameAssignment_2_1 ) )
            {
            // InternalRosSystem.g:1799:1: ( ( rule__ComponentInterface__NameAssignment_2_1 ) )
            // InternalRosSystem.g:1800:2: ( rule__ComponentInterface__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2_1()); 
            // InternalRosSystem.g:1801:2: ( rule__ComponentInterface__NameAssignment_2_1 )
            // InternalRosSystem.g:1801:3: rule__ComponentInterface__NameAssignment_2_1
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
    // InternalRosSystem.g:1810:1: rule__ComponentInterface__Group_3__0 : rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1 ;
    public final void rule__ComponentInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1814:1: ( rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1 )
            // InternalRosSystem.g:1815:2: rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:1822:1: rule__ComponentInterface__Group_3__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1826:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:1827:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:1827:1: ( 'NameSpace' )
            // InternalRosSystem.g:1828:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRosSystem.g:1837:1: rule__ComponentInterface__Group_3__1 : rule__ComponentInterface__Group_3__1__Impl ;
    public final void rule__ComponentInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1841:1: ( rule__ComponentInterface__Group_3__1__Impl )
            // InternalRosSystem.g:1842:2: rule__ComponentInterface__Group_3__1__Impl
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
    // InternalRosSystem.g:1848:1: rule__ComponentInterface__Group_3__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1852:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) ) )
            // InternalRosSystem.g:1853:1: ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) )
            {
            // InternalRosSystem.g:1853:1: ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) )
            // InternalRosSystem.g:1854:2: ( rule__ComponentInterface__NameSpaceAssignment_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_3_1()); 
            // InternalRosSystem.g:1855:2: ( rule__ComponentInterface__NameSpaceAssignment_3_1 )
            // InternalRosSystem.g:1855:3: rule__ComponentInterface__NameSpaceAssignment_3_1
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
    // InternalRosSystem.g:1864:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1868:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalRosSystem.g:1869:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:1876:1: rule__ComponentInterface__Group_4__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1880:1: ( ( 'RosPublishers' ) )
            // InternalRosSystem.g:1881:1: ( 'RosPublishers' )
            {
            // InternalRosSystem.g:1881:1: ( 'RosPublishers' )
            // InternalRosSystem.g:1882:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRosSystem.g:1891:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2 ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1895:1: ( rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2 )
            // InternalRosSystem.g:1896:2: rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:1903:1: rule__ComponentInterface__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1907:1: ( ( '{' ) )
            // InternalRosSystem.g:1908:1: ( '{' )
            {
            // InternalRosSystem.g:1908:1: ( '{' )
            // InternalRosSystem.g:1909:2: '{'
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
    // InternalRosSystem.g:1918:1: rule__ComponentInterface__Group_4__2 : rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3 ;
    public final void rule__ComponentInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1922:1: ( rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3 )
            // InternalRosSystem.g:1923:2: rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:1930:1: rule__ComponentInterface__Group_4__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) ) ;
    public final void rule__ComponentInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1934:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) ) )
            // InternalRosSystem.g:1935:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) )
            {
            // InternalRosSystem.g:1935:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) )
            // InternalRosSystem.g:1936:2: ( rule__ComponentInterface__RospublisherAssignment_4_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_2()); 
            // InternalRosSystem.g:1937:2: ( rule__ComponentInterface__RospublisherAssignment_4_2 )
            // InternalRosSystem.g:1937:3: rule__ComponentInterface__RospublisherAssignment_4_2
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
    // InternalRosSystem.g:1945:1: rule__ComponentInterface__Group_4__3 : rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4 ;
    public final void rule__ComponentInterface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1949:1: ( rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4 )
            // InternalRosSystem.g:1950:2: rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:1957:1: rule__ComponentInterface__Group_4__3__Impl : ( ( rule__ComponentInterface__Group_4_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1961:1: ( ( ( rule__ComponentInterface__Group_4_3__0 )* ) )
            // InternalRosSystem.g:1962:1: ( ( rule__ComponentInterface__Group_4_3__0 )* )
            {
            // InternalRosSystem.g:1962:1: ( ( rule__ComponentInterface__Group_4_3__0 )* )
            // InternalRosSystem.g:1963:2: ( rule__ComponentInterface__Group_4_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4_3()); 
            // InternalRosSystem.g:1964:2: ( rule__ComponentInterface__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRosSystem.g:1964:3: rule__ComponentInterface__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRosSystem.g:1972:1: rule__ComponentInterface__Group_4__4 : rule__ComponentInterface__Group_4__4__Impl ;
    public final void rule__ComponentInterface__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1976:1: ( rule__ComponentInterface__Group_4__4__Impl )
            // InternalRosSystem.g:1977:2: rule__ComponentInterface__Group_4__4__Impl
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
    // InternalRosSystem.g:1983:1: rule__ComponentInterface__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1987:1: ( ( '}' ) )
            // InternalRosSystem.g:1988:1: ( '}' )
            {
            // InternalRosSystem.g:1988:1: ( '}' )
            // InternalRosSystem.g:1989:2: '}'
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
    // InternalRosSystem.g:1999:1: rule__ComponentInterface__Group_4_3__0 : rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1 ;
    public final void rule__ComponentInterface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2003:1: ( rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1 )
            // InternalRosSystem.g:2004:2: rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:2011:1: rule__ComponentInterface__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2015:1: ( ( ',' ) )
            // InternalRosSystem.g:2016:1: ( ',' )
            {
            // InternalRosSystem.g:2016:1: ( ',' )
            // InternalRosSystem.g:2017:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRosSystem.g:2026:1: rule__ComponentInterface__Group_4_3__1 : rule__ComponentInterface__Group_4_3__1__Impl ;
    public final void rule__ComponentInterface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2030:1: ( rule__ComponentInterface__Group_4_3__1__Impl )
            // InternalRosSystem.g:2031:2: rule__ComponentInterface__Group_4_3__1__Impl
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
    // InternalRosSystem.g:2037:1: rule__ComponentInterface__Group_4_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2041:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) ) )
            // InternalRosSystem.g:2042:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) )
            {
            // InternalRosSystem.g:2042:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) )
            // InternalRosSystem.g:2043:2: ( rule__ComponentInterface__RospublisherAssignment_4_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_3_1()); 
            // InternalRosSystem.g:2044:2: ( rule__ComponentInterface__RospublisherAssignment_4_3_1 )
            // InternalRosSystem.g:2044:3: rule__ComponentInterface__RospublisherAssignment_4_3_1
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
    // InternalRosSystem.g:2053:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2057:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalRosSystem.g:2058:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2065:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2069:1: ( ( 'RosSubscribers' ) )
            // InternalRosSystem.g:2070:1: ( 'RosSubscribers' )
            {
            // InternalRosSystem.g:2070:1: ( 'RosSubscribers' )
            // InternalRosSystem.g:2071:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRosSystem.g:2080:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2084:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalRosSystem.g:2085:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2092:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2096:1: ( ( '{' ) )
            // InternalRosSystem.g:2097:1: ( '{' )
            {
            // InternalRosSystem.g:2097:1: ( '{' )
            // InternalRosSystem.g:2098:2: '{'
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
    // InternalRosSystem.g:2107:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2111:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalRosSystem.g:2112:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:2119:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2123:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) ) )
            // InternalRosSystem.g:2124:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) )
            {
            // InternalRosSystem.g:2124:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) )
            // InternalRosSystem.g:2125:2: ( rule__ComponentInterface__RossubscriberAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_2()); 
            // InternalRosSystem.g:2126:2: ( rule__ComponentInterface__RossubscriberAssignment_5_2 )
            // InternalRosSystem.g:2126:3: rule__ComponentInterface__RossubscriberAssignment_5_2
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
    // InternalRosSystem.g:2134:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2138:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalRosSystem.g:2139:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:2146:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2150:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalRosSystem.g:2151:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:2151:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalRosSystem.g:2152:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalRosSystem.g:2153:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosSystem.g:2153:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRosSystem.g:2161:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2165:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalRosSystem.g:2166:2: rule__ComponentInterface__Group_5__4__Impl
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
    // InternalRosSystem.g:2172:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2176:1: ( ( '}' ) )
            // InternalRosSystem.g:2177:1: ( '}' )
            {
            // InternalRosSystem.g:2177:1: ( '}' )
            // InternalRosSystem.g:2178:2: '}'
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
    // InternalRosSystem.g:2188:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2192:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalRosSystem.g:2193:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2200:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2204:1: ( ( ',' ) )
            // InternalRosSystem.g:2205:1: ( ',' )
            {
            // InternalRosSystem.g:2205:1: ( ',' )
            // InternalRosSystem.g:2206:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRosSystem.g:2215:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2219:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalRosSystem.g:2220:2: rule__ComponentInterface__Group_5_3__1__Impl
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
    // InternalRosSystem.g:2226:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2230:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:2231:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:2231:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) )
            // InternalRosSystem.g:2232:2: ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_3_1()); 
            // InternalRosSystem.g:2233:2: ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 )
            // InternalRosSystem.g:2233:3: rule__ComponentInterface__RossubscriberAssignment_5_3_1
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
    // InternalRosSystem.g:2242:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2246:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalRosSystem.g:2247:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2254:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2258:1: ( ( 'RosSrvServers' ) )
            // InternalRosSystem.g:2259:1: ( 'RosSrvServers' )
            {
            // InternalRosSystem.g:2259:1: ( 'RosSrvServers' )
            // InternalRosSystem.g:2260:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRosSystem.g:2269:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2273:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalRosSystem.g:2274:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:2281:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2285:1: ( ( '{' ) )
            // InternalRosSystem.g:2286:1: ( '{' )
            {
            // InternalRosSystem.g:2286:1: ( '{' )
            // InternalRosSystem.g:2287:2: '{'
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
    // InternalRosSystem.g:2296:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2300:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalRosSystem.g:2301:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:2308:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2312:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) ) )
            // InternalRosSystem.g:2313:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) )
            {
            // InternalRosSystem.g:2313:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) )
            // InternalRosSystem.g:2314:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2()); 
            // InternalRosSystem.g:2315:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2 )
            // InternalRosSystem.g:2315:3: rule__ComponentInterface__RosserviceserverAssignment_6_2
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
    // InternalRosSystem.g:2323:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2327:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalRosSystem.g:2328:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:2335:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2339:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalRosSystem.g:2340:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:2340:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalRosSystem.g:2341:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalRosSystem.g:2342:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosSystem.g:2342:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRosSystem.g:2350:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2354:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalRosSystem.g:2355:2: rule__ComponentInterface__Group_6__4__Impl
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
    // InternalRosSystem.g:2361:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2365:1: ( ( '}' ) )
            // InternalRosSystem.g:2366:1: ( '}' )
            {
            // InternalRosSystem.g:2366:1: ( '}' )
            // InternalRosSystem.g:2367:2: '}'
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
    // InternalRosSystem.g:2377:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2381:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalRosSystem.g:2382:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:2389:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2393:1: ( ( ',' ) )
            // InternalRosSystem.g:2394:1: ( ',' )
            {
            // InternalRosSystem.g:2394:1: ( ',' )
            // InternalRosSystem.g:2395:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRosSystem.g:2404:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2408:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalRosSystem.g:2409:2: rule__ComponentInterface__Group_6_3__1__Impl
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
    // InternalRosSystem.g:2415:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2419:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:2420:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:2420:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) )
            // InternalRosSystem.g:2421:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_3_1()); 
            // InternalRosSystem.g:2422:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 )
            // InternalRosSystem.g:2422:3: rule__ComponentInterface__RosserviceserverAssignment_6_3_1
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
    // InternalRosSystem.g:2431:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2435:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalRosSystem.g:2436:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2443:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2447:1: ( ( 'RosSrvClients' ) )
            // InternalRosSystem.g:2448:1: ( 'RosSrvClients' )
            {
            // InternalRosSystem.g:2448:1: ( 'RosSrvClients' )
            // InternalRosSystem.g:2449:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRosSystem.g:2458:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2462:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalRosSystem.g:2463:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2470:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2474:1: ( ( '{' ) )
            // InternalRosSystem.g:2475:1: ( '{' )
            {
            // InternalRosSystem.g:2475:1: ( '{' )
            // InternalRosSystem.g:2476:2: '{'
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
    // InternalRosSystem.g:2485:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2489:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalRosSystem.g:2490:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:2497:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2501:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) ) )
            // InternalRosSystem.g:2502:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) )
            {
            // InternalRosSystem.g:2502:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) )
            // InternalRosSystem.g:2503:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_2()); 
            // InternalRosSystem.g:2504:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_2 )
            // InternalRosSystem.g:2504:3: rule__ComponentInterface__RosserviceclientAssignment_7_2
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
    // InternalRosSystem.g:2512:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2516:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalRosSystem.g:2517:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:2524:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2528:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalRosSystem.g:2529:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalRosSystem.g:2529:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalRosSystem.g:2530:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalRosSystem.g:2531:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRosSystem.g:2531:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRosSystem.g:2539:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2543:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalRosSystem.g:2544:2: rule__ComponentInterface__Group_7__4__Impl
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
    // InternalRosSystem.g:2550:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2554:1: ( ( '}' ) )
            // InternalRosSystem.g:2555:1: ( '}' )
            {
            // InternalRosSystem.g:2555:1: ( '}' )
            // InternalRosSystem.g:2556:2: '}'
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
    // InternalRosSystem.g:2566:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2570:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalRosSystem.g:2571:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2578:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2582:1: ( ( ',' ) )
            // InternalRosSystem.g:2583:1: ( ',' )
            {
            // InternalRosSystem.g:2583:1: ( ',' )
            // InternalRosSystem.g:2584:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRosSystem.g:2593:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2597:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalRosSystem.g:2598:2: rule__ComponentInterface__Group_7_3__1__Impl
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
    // InternalRosSystem.g:2604:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2608:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) ) )
            // InternalRosSystem.g:2609:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) )
            {
            // InternalRosSystem.g:2609:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) )
            // InternalRosSystem.g:2610:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_3_1()); 
            // InternalRosSystem.g:2611:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 )
            // InternalRosSystem.g:2611:3: rule__ComponentInterface__RosserviceclientAssignment_7_3_1
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
    // InternalRosSystem.g:2620:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2624:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalRosSystem.g:2625:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:2632:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2636:1: ( ( () ) )
            // InternalRosSystem.g:2637:1: ( () )
            {
            // InternalRosSystem.g:2637:1: ( () )
            // InternalRosSystem.g:2638:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalRosSystem.g:2639:2: ()
            // InternalRosSystem.g:2639:3: 
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
    // InternalRosSystem.g:2647:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2651:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalRosSystem.g:2652:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2659:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2663:1: ( ( 'RosPublisher' ) )
            // InternalRosSystem.g:2664:1: ( 'RosPublisher' )
            {
            // InternalRosSystem.g:2664:1: ( 'RosPublisher' )
            // InternalRosSystem.g:2665:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRosSystem.g:2674:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2678:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalRosSystem.g:2679:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2686:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2690:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalRosSystem.g:2691:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:2691:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalRosSystem.g:2692:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:2693:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystem.g:2693:3: rule__RosPublisher__NameAssignment_2
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
    // InternalRosSystem.g:2701:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2705:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalRosSystem.g:2706:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:2713:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2717:1: ( ( '{' ) )
            // InternalRosSystem.g:2718:1: ( '{' )
            {
            // InternalRosSystem.g:2718:1: ( '{' )
            // InternalRosSystem.g:2719:2: '{'
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
    // InternalRosSystem.g:2728:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2732:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalRosSystem.g:2733:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:2740:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2744:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalRosSystem.g:2745:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalRosSystem.g:2745:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalRosSystem.g:2746:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalRosSystem.g:2747:2: ( rule__RosPublisher__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystem.g:2747:3: rule__RosPublisher__Group_4__0
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
    // InternalRosSystem.g:2755:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2759:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalRosSystem.g:2760:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2767:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2771:1: ( ( 'RefPublisher' ) )
            // InternalRosSystem.g:2772:1: ( 'RefPublisher' )
            {
            // InternalRosSystem.g:2772:1: ( 'RefPublisher' )
            // InternalRosSystem.g:2773:2: 'RefPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRosSystem.g:2782:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2786:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalRosSystem.g:2787:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystem.g:2794:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2798:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalRosSystem.g:2799:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalRosSystem.g:2799:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalRosSystem.g:2800:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalRosSystem.g:2801:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalRosSystem.g:2801:3: rule__RosPublisher__PublisherAssignment_6
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
    // InternalRosSystem.g:2809:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2813:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalRosSystem.g:2814:2: rule__RosPublisher__Group__7__Impl
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
    // InternalRosSystem.g:2820:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2824:1: ( ( '}' ) )
            // InternalRosSystem.g:2825:1: ( '}' )
            {
            // InternalRosSystem.g:2825:1: ( '}' )
            // InternalRosSystem.g:2826:2: '}'
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
    // InternalRosSystem.g:2836:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2840:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalRosSystem.g:2841:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2848:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2852:1: ( ( 'ns' ) )
            // InternalRosSystem.g:2853:1: ( 'ns' )
            {
            // InternalRosSystem.g:2853:1: ( 'ns' )
            // InternalRosSystem.g:2854:2: 'ns'
            {
             before(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:2863:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2867:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalRosSystem.g:2868:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalRosSystem.g:2874:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2878:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:2879:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:2879:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalRosSystem.g:2880:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:2881:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalRosSystem.g:2881:3: rule__RosPublisher__NsAssignment_4_1
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
    // InternalRosSystem.g:2890:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2894:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalRosSystem.g:2895:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2902:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2906:1: ( ( () ) )
            // InternalRosSystem.g:2907:1: ( () )
            {
            // InternalRosSystem.g:2907:1: ( () )
            // InternalRosSystem.g:2908:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalRosSystem.g:2909:2: ()
            // InternalRosSystem.g:2909:3: 
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
    // InternalRosSystem.g:2917:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2921:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalRosSystem.g:2922:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2929:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2933:1: ( ( 'RosSubscriber' ) )
            // InternalRosSystem.g:2934:1: ( 'RosSubscriber' )
            {
            // InternalRosSystem.g:2934:1: ( 'RosSubscriber' )
            // InternalRosSystem.g:2935:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRosSystem.g:2944:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2948:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalRosSystem.g:2949:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2956:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2960:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalRosSystem.g:2961:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:2961:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalRosSystem.g:2962:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:2963:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystem.g:2963:3: rule__RosSubscriber__NameAssignment_2
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
    // InternalRosSystem.g:2971:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2975:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalRosSystem.g:2976:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:2983:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2987:1: ( ( '{' ) )
            // InternalRosSystem.g:2988:1: ( '{' )
            {
            // InternalRosSystem.g:2988:1: ( '{' )
            // InternalRosSystem.g:2989:2: '{'
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
    // InternalRosSystem.g:2998:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3002:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalRosSystem.g:3003:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3010:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3014:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalRosSystem.g:3015:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalRosSystem.g:3015:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalRosSystem.g:3016:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalRosSystem.g:3017:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystem.g:3017:3: rule__RosSubscriber__Group_4__0
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
    // InternalRosSystem.g:3025:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3029:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalRosSystem.g:3030:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3037:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3041:1: ( ( 'RefSubscriber' ) )
            // InternalRosSystem.g:3042:1: ( 'RefSubscriber' )
            {
            // InternalRosSystem.g:3042:1: ( 'RefSubscriber' )
            // InternalRosSystem.g:3043:2: 'RefSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRosSystem.g:3052:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3056:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalRosSystem.g:3057:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystem.g:3064:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3068:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalRosSystem.g:3069:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalRosSystem.g:3069:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalRosSystem.g:3070:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalRosSystem.g:3071:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalRosSystem.g:3071:3: rule__RosSubscriber__SubscriberAssignment_6
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
    // InternalRosSystem.g:3079:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3083:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalRosSystem.g:3084:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalRosSystem.g:3090:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3094:1: ( ( '}' ) )
            // InternalRosSystem.g:3095:1: ( '}' )
            {
            // InternalRosSystem.g:3095:1: ( '}' )
            // InternalRosSystem.g:3096:2: '}'
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
    // InternalRosSystem.g:3106:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3110:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalRosSystem.g:3111:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3118:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3122:1: ( ( 'ns' ) )
            // InternalRosSystem.g:3123:1: ( 'ns' )
            {
            // InternalRosSystem.g:3123:1: ( 'ns' )
            // InternalRosSystem.g:3124:2: 'ns'
            {
             before(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:3133:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3137:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalRosSystem.g:3138:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalRosSystem.g:3144:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3148:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:3149:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3149:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalRosSystem.g:3150:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:3151:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalRosSystem.g:3151:3: rule__RosSubscriber__NsAssignment_4_1
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
    // InternalRosSystem.g:3160:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3164:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalRosSystem.g:3165:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3172:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3176:1: ( ( () ) )
            // InternalRosSystem.g:3177:1: ( () )
            {
            // InternalRosSystem.g:3177:1: ( () )
            // InternalRosSystem.g:3178:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalRosSystem.g:3179:2: ()
            // InternalRosSystem.g:3179:3: 
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
    // InternalRosSystem.g:3187:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3191:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalRosSystem.g:3192:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:3199:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3203:1: ( ( 'RosServiceServer' ) )
            // InternalRosSystem.g:3204:1: ( 'RosServiceServer' )
            {
            // InternalRosSystem.g:3204:1: ( 'RosServiceServer' )
            // InternalRosSystem.g:3205:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRosSystem.g:3214:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3218:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalRosSystem.g:3219:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:3226:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3230:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalRosSystem.g:3231:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:3231:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalRosSystem.g:3232:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:3233:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosSystem.g:3233:3: rule__RosServiceServer__NameAssignment_2
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
    // InternalRosSystem.g:3241:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3245:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalRosSystem.g:3246:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3253:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3257:1: ( ( '{' ) )
            // InternalRosSystem.g:3258:1: ( '{' )
            {
            // InternalRosSystem.g:3258:1: ( '{' )
            // InternalRosSystem.g:3259:2: '{'
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
    // InternalRosSystem.g:3268:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3272:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalRosSystem.g:3273:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3280:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3284:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalRosSystem.g:3285:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalRosSystem.g:3285:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalRosSystem.g:3286:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalRosSystem.g:3287:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystem.g:3287:3: rule__RosServiceServer__Group_4__0
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
    // InternalRosSystem.g:3295:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3299:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalRosSystem.g:3300:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3307:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3311:1: ( ( 'RefServer' ) )
            // InternalRosSystem.g:3312:1: ( 'RefServer' )
            {
            // InternalRosSystem.g:3312:1: ( 'RefServer' )
            // InternalRosSystem.g:3313:2: 'RefServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRosSystem.g:3322:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3326:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalRosSystem.g:3327:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystem.g:3334:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3338:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalRosSystem.g:3339:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalRosSystem.g:3339:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalRosSystem.g:3340:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalRosSystem.g:3341:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalRosSystem.g:3341:3: rule__RosServiceServer__SrvserverAssignment_6
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
    // InternalRosSystem.g:3349:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3353:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalRosSystem.g:3354:2: rule__RosServiceServer__Group__7__Impl
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
    // InternalRosSystem.g:3360:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3364:1: ( ( '}' ) )
            // InternalRosSystem.g:3365:1: ( '}' )
            {
            // InternalRosSystem.g:3365:1: ( '}' )
            // InternalRosSystem.g:3366:2: '}'
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
    // InternalRosSystem.g:3376:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3380:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalRosSystem.g:3381:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3388:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3392:1: ( ( 'ns' ) )
            // InternalRosSystem.g:3393:1: ( 'ns' )
            {
            // InternalRosSystem.g:3393:1: ( 'ns' )
            // InternalRosSystem.g:3394:2: 'ns'
            {
             before(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:3403:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3407:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalRosSystem.g:3408:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalRosSystem.g:3414:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3418:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:3419:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3419:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalRosSystem.g:3420:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:3421:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalRosSystem.g:3421:3: rule__RosServiceServer__NsAssignment_4_1
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
    // InternalRosSystem.g:3430:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3434:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalRosSystem.g:3435:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:3442:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3446:1: ( ( () ) )
            // InternalRosSystem.g:3447:1: ( () )
            {
            // InternalRosSystem.g:3447:1: ( () )
            // InternalRosSystem.g:3448:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalRosSystem.g:3449:2: ()
            // InternalRosSystem.g:3449:3: 
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
    // InternalRosSystem.g:3457:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3461:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalRosSystem.g:3462:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:3469:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3473:1: ( ( 'RosServiceClient' ) )
            // InternalRosSystem.g:3474:1: ( 'RosServiceClient' )
            {
            // InternalRosSystem.g:3474:1: ( 'RosServiceClient' )
            // InternalRosSystem.g:3475:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRosSystem.g:3484:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3488:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalRosSystem.g:3489:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:3496:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3500:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalRosSystem.g:3501:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:3501:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalRosSystem.g:3502:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:3503:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:3503:3: rule__RosServiceClient__NameAssignment_2
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
    // InternalRosSystem.g:3511:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3515:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalRosSystem.g:3516:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:3523:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3527:1: ( ( '{' ) )
            // InternalRosSystem.g:3528:1: ( '{' )
            {
            // InternalRosSystem.g:3528:1: ( '{' )
            // InternalRosSystem.g:3529:2: '{'
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
    // InternalRosSystem.g:3538:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3542:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalRosSystem.g:3543:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:3550:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3554:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalRosSystem.g:3555:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalRosSystem.g:3555:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalRosSystem.g:3556:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalRosSystem.g:3557:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystem.g:3557:3: rule__RosServiceClient__Group_4__0
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
    // InternalRosSystem.g:3565:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3569:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalRosSystem.g:3570:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3577:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3581:1: ( ( 'RefClient' ) )
            // InternalRosSystem.g:3582:1: ( 'RefClient' )
            {
            // InternalRosSystem.g:3582:1: ( 'RefClient' )
            // InternalRosSystem.g:3583:2: 'RefClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRosSystem.g:3592:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3596:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalRosSystem.g:3597:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystem.g:3604:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3608:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalRosSystem.g:3609:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalRosSystem.g:3609:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalRosSystem.g:3610:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalRosSystem.g:3611:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalRosSystem.g:3611:3: rule__RosServiceClient__SrvclientAssignment_6
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
    // InternalRosSystem.g:3619:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3623:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalRosSystem.g:3624:2: rule__RosServiceClient__Group__7__Impl
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
    // InternalRosSystem.g:3630:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3634:1: ( ( '}' ) )
            // InternalRosSystem.g:3635:1: ( '}' )
            {
            // InternalRosSystem.g:3635:1: ( '}' )
            // InternalRosSystem.g:3636:2: '}'
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
    // InternalRosSystem.g:3646:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3650:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalRosSystem.g:3651:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3658:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3662:1: ( ( 'ns' ) )
            // InternalRosSystem.g:3663:1: ( 'ns' )
            {
            // InternalRosSystem.g:3663:1: ( 'ns' )
            // InternalRosSystem.g:3664:2: 'ns'
            {
             before(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:3673:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3677:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalRosSystem.g:3678:2: rule__RosServiceClient__Group_4__1__Impl
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
    // InternalRosSystem.g:3684:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3688:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:3689:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3689:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalRosSystem.g:3690:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:3691:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalRosSystem.g:3691:3: rule__RosServiceClient__NsAssignment_4_1
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


    // $ANTLR start "rule__RosSystem__NameAssignment_3_1"
    // InternalRosSystem.g:3700:1: rule__RosSystem__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3704:1: ( ( ruleEString ) )
            // InternalRosSystem.g:3705:2: ( ruleEString )
            {
            // InternalRosSystem.g:3705:2: ( ruleEString )
            // InternalRosSystem.g:3706:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__NameAssignment_3_1"


    // $ANTLR start "rule__RosSystem__RosComponentAssignment_4_2"
    // InternalRosSystem.g:3715:1: rule__RosSystem__RosComponentAssignment_4_2 : ( ruleComponentInterface ) ;
    public final void rule__RosSystem__RosComponentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3719:1: ( ( ruleComponentInterface ) )
            // InternalRosSystem.g:3720:2: ( ruleComponentInterface )
            {
            // InternalRosSystem.g:3720:2: ( ruleComponentInterface )
            // InternalRosSystem.g:3721:3: ruleComponentInterface
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosComponentAssignment_4_2"


    // $ANTLR start "rule__RosSystem__RosComponentAssignment_4_3_1"
    // InternalRosSystem.g:3730:1: rule__RosSystem__RosComponentAssignment_4_3_1 : ( ruleComponentInterface ) ;
    public final void rule__RosSystem__RosComponentAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3734:1: ( ( ruleComponentInterface ) )
            // InternalRosSystem.g:3735:2: ( ruleComponentInterface )
            {
            // InternalRosSystem.g:3735:2: ( ruleComponentInterface )
            // InternalRosSystem.g:3736:3: ruleComponentInterface
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosComponentAssignment_4_3_1"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_5_2"
    // InternalRosSystem.g:3745:1: rule__RosSystem__TopicConnectionsAssignment_5_2 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3749:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:3750:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:3750:2: ( ruleTopicConnection )
            // InternalRosSystem.g:3751:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_5_2"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_5_3_1"
    // InternalRosSystem.g:3760:1: rule__RosSystem__TopicConnectionsAssignment_5_3_1 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3764:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:3765:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:3765:2: ( ruleTopicConnection )
            // InternalRosSystem.g:3766:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_5_3_1"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_6_2"
    // InternalRosSystem.g:3775:1: rule__RosSystem__ServiceConnectionsAssignment_6_2 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3779:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:3780:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:3780:2: ( ruleServiceConnection )
            // InternalRosSystem.g:3781:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_6_2"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_6_3_1"
    // InternalRosSystem.g:3790:1: rule__RosSystem__ServiceConnectionsAssignment_6_3_1 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3794:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:3795:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:3795:2: ( ruleServiceConnection )
            // InternalRosSystem.g:3796:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_6_3_1"


    // $ANTLR start "rule__TopicConnection__FromTopicAssignment_3"
    // InternalRosSystem.g:3805:1: rule__TopicConnection__FromTopicAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromTopicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3809:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:3810:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:3810:2: ( ( ruleEString ) )
            // InternalRosSystem.g:3811:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherCrossReference_3_0()); 
            // InternalRosSystem.g:3812:3: ( ruleEString )
            // InternalRosSystem.g:3813:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__FromTopicAssignment_3"


    // $ANTLR start "rule__TopicConnection__ToTopicAssignment_5"
    // InternalRosSystem.g:3824:1: rule__TopicConnection__ToTopicAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToTopicAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3828:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:3829:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:3829:2: ( ( ruleEString ) )
            // InternalRosSystem.g:3830:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberCrossReference_5_0()); 
            // InternalRosSystem.g:3831:3: ( ruleEString )
            // InternalRosSystem.g:3832:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__ToTopicAssignment_5"


    // $ANTLR start "rule__ServiceConnection__FromSrvAssignment_3"
    // InternalRosSystem.g:3843:1: rule__ServiceConnection__FromSrvAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromSrvAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3847:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:3848:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:3848:2: ( ( ruleEString ) )
            // InternalRosSystem.g:3849:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerCrossReference_3_0()); 
            // InternalRosSystem.g:3850:3: ( ruleEString )
            // InternalRosSystem.g:3851:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__FromSrvAssignment_3"


    // $ANTLR start "rule__ServiceConnection__ToSrvAssignment_5"
    // InternalRosSystem.g:3862:1: rule__ServiceConnection__ToSrvAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__ToSrvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3866:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:3867:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:3867:2: ( ( ruleEString ) )
            // InternalRosSystem.g:3868:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientCrossReference_5_0()); 
            // InternalRosSystem.g:3869:3: ( ruleEString )
            // InternalRosSystem.g:3870:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__ToSrvAssignment_5"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_2_1"
    // InternalRosSystem.g:3881:1: rule__ComponentInterface__NameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3885:1: ( ( ruleEString ) )
            // InternalRosSystem.g:3886:2: ( ruleEString )
            {
            // InternalRosSystem.g:3886:2: ( ruleEString )
            // InternalRosSystem.g:3887:3: ruleEString
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
    // InternalRosSystem.g:3896:1: rule__ComponentInterface__NameSpaceAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3900:1: ( ( ruleEString ) )
            // InternalRosSystem.g:3901:2: ( ruleEString )
            {
            // InternalRosSystem.g:3901:2: ( ruleEString )
            // InternalRosSystem.g:3902:3: ruleEString
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
    // InternalRosSystem.g:3911:1: rule__ComponentInterface__RospublisherAssignment_4_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3915:1: ( ( ruleRosPublisher ) )
            // InternalRosSystem.g:3916:2: ( ruleRosPublisher )
            {
            // InternalRosSystem.g:3916:2: ( ruleRosPublisher )
            // InternalRosSystem.g:3917:3: ruleRosPublisher
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
    // InternalRosSystem.g:3926:1: rule__ComponentInterface__RospublisherAssignment_4_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3930:1: ( ( ruleRosPublisher ) )
            // InternalRosSystem.g:3931:2: ( ruleRosPublisher )
            {
            // InternalRosSystem.g:3931:2: ( ruleRosPublisher )
            // InternalRosSystem.g:3932:3: ruleRosPublisher
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
    // InternalRosSystem.g:3941:1: rule__ComponentInterface__RossubscriberAssignment_5_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3945:1: ( ( ruleRosSubscriber ) )
            // InternalRosSystem.g:3946:2: ( ruleRosSubscriber )
            {
            // InternalRosSystem.g:3946:2: ( ruleRosSubscriber )
            // InternalRosSystem.g:3947:3: ruleRosSubscriber
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
    // InternalRosSystem.g:3956:1: rule__ComponentInterface__RossubscriberAssignment_5_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3960:1: ( ( ruleRosSubscriber ) )
            // InternalRosSystem.g:3961:2: ( ruleRosSubscriber )
            {
            // InternalRosSystem.g:3961:2: ( ruleRosSubscriber )
            // InternalRosSystem.g:3962:3: ruleRosSubscriber
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
    // InternalRosSystem.g:3971:1: rule__ComponentInterface__RosserviceserverAssignment_6_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3975:1: ( ( ruleRosServiceServer ) )
            // InternalRosSystem.g:3976:2: ( ruleRosServiceServer )
            {
            // InternalRosSystem.g:3976:2: ( ruleRosServiceServer )
            // InternalRosSystem.g:3977:3: ruleRosServiceServer
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
    // InternalRosSystem.g:3986:1: rule__ComponentInterface__RosserviceserverAssignment_6_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3990:1: ( ( ruleRosServiceServer ) )
            // InternalRosSystem.g:3991:2: ( ruleRosServiceServer )
            {
            // InternalRosSystem.g:3991:2: ( ruleRosServiceServer )
            // InternalRosSystem.g:3992:3: ruleRosServiceServer
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
    // InternalRosSystem.g:4001:1: rule__ComponentInterface__RosserviceclientAssignment_7_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4005:1: ( ( ruleRosServiceClient ) )
            // InternalRosSystem.g:4006:2: ( ruleRosServiceClient )
            {
            // InternalRosSystem.g:4006:2: ( ruleRosServiceClient )
            // InternalRosSystem.g:4007:3: ruleRosServiceClient
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
    // InternalRosSystem.g:4016:1: rule__ComponentInterface__RosserviceclientAssignment_7_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4020:1: ( ( ruleRosServiceClient ) )
            // InternalRosSystem.g:4021:2: ( ruleRosServiceClient )
            {
            // InternalRosSystem.g:4021:2: ( ruleRosServiceClient )
            // InternalRosSystem.g:4022:3: ruleRosServiceClient
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
    // InternalRosSystem.g:4031:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4035:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4036:2: ( ruleEString )
            {
            // InternalRosSystem.g:4036:2: ( ruleEString )
            // InternalRosSystem.g:4037:3: ruleEString
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
    // InternalRosSystem.g:4046:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4050:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4051:2: ( ruleEString )
            {
            // InternalRosSystem.g:4051:2: ( ruleEString )
            // InternalRosSystem.g:4052:3: ruleEString
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
    // InternalRosSystem.g:4061:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4065:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4066:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4066:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4067:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalRosSystem.g:4068:3: ( ruleEString )
            // InternalRosSystem.g:4069:4: ruleEString
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
    // InternalRosSystem.g:4080:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4084:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4085:2: ( ruleEString )
            {
            // InternalRosSystem.g:4085:2: ( ruleEString )
            // InternalRosSystem.g:4086:3: ruleEString
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
    // InternalRosSystem.g:4095:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4099:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4100:2: ( ruleEString )
            {
            // InternalRosSystem.g:4100:2: ( ruleEString )
            // InternalRosSystem.g:4101:3: ruleEString
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
    // InternalRosSystem.g:4110:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4114:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4115:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4115:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4116:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalRosSystem.g:4117:3: ( ruleEString )
            // InternalRosSystem.g:4118:4: ruleEString
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
    // InternalRosSystem.g:4129:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4133:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4134:2: ( ruleEString )
            {
            // InternalRosSystem.g:4134:2: ( ruleEString )
            // InternalRosSystem.g:4135:3: ruleEString
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
    // InternalRosSystem.g:4144:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4148:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4149:2: ( ruleEString )
            {
            // InternalRosSystem.g:4149:2: ( ruleEString )
            // InternalRosSystem.g:4150:3: ruleEString
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
    // InternalRosSystem.g:4159:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4163:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4164:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4164:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4165:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalRosSystem.g:4166:3: ( ruleEString )
            // InternalRosSystem.g:4167:4: ruleEString
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
    // InternalRosSystem.g:4178:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4182:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4183:2: ( ruleEString )
            {
            // InternalRosSystem.g:4183:2: ( ruleEString )
            // InternalRosSystem.g:4184:3: ruleEString
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
    // InternalRosSystem.g:4193:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4197:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4198:2: ( ruleEString )
            {
            // InternalRosSystem.g:4198:2: ( ruleEString )
            // InternalRosSystem.g:4199:3: ruleEString
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
    // InternalRosSystem.g:4208:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4212:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4213:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4213:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4214:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalRosSystem.g:4215:3: ( ruleEString )
            // InternalRosSystem.g:4216:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000018E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003F0002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000041000000000L});

}