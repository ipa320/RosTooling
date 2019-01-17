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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'}'", "'RosComponents'", "'('", "')'", "','", "'TopicConnections'", "'ServiceConnections'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'ComponentInterface'", "'name'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'"
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
    public static final int T__20=20;
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
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:391:1: rule__RosSystem__Group__3__Impl : ( 'Name' ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:395:1: ( ( 'Name' ) )
            // InternalRosSystem.g:396:1: ( 'Name' )
            {
            // InternalRosSystem.g:396:1: ( 'Name' )
            // InternalRosSystem.g:397:2: 'Name'
            {
             before(grammarAccess.getRosSystemAccess().getNameKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getNameKeyword_3()); 

            }


            }

        }
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
            pushFollow(FOLLOW_7);
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
    // InternalRosSystem.g:418:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__NameAssignment_4 ) ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:422:1: ( ( ( rule__RosSystem__NameAssignment_4 ) ) )
            // InternalRosSystem.g:423:1: ( ( rule__RosSystem__NameAssignment_4 ) )
            {
            // InternalRosSystem.g:423:1: ( ( rule__RosSystem__NameAssignment_4 ) )
            // InternalRosSystem.g:424:2: ( rule__RosSystem__NameAssignment_4 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_4()); 
            // InternalRosSystem.g:425:2: ( rule__RosSystem__NameAssignment_4 )
            // InternalRosSystem.g:425:3: rule__RosSystem__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_4()); 

            }


            }

        }
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
            pushFollow(FOLLOW_7);
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
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
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
            pushFollow(FOLLOW_7);
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
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
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
    // InternalRosSystem.g:487:1: rule__RosSystem__Group__7 : rule__RosSystem__Group__7__Impl rule__RosSystem__Group__8 ;
    public final void rule__RosSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:491:1: ( rule__RosSystem__Group__7__Impl rule__RosSystem__Group__8 )
            // InternalRosSystem.g:492:2: rule__RosSystem__Group__7__Impl rule__RosSystem__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__8();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:499:1: rule__RosSystem__Group__7__Impl : ( ( rule__RosSystem__Group_7__0 )? ) ;
    public final void rule__RosSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:503:1: ( ( ( rule__RosSystem__Group_7__0 )? ) )
            // InternalRosSystem.g:504:1: ( ( rule__RosSystem__Group_7__0 )? )
            {
            // InternalRosSystem.g:504:1: ( ( rule__RosSystem__Group_7__0 )? )
            // InternalRosSystem.g:505:2: ( rule__RosSystem__Group_7__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_7()); 
            // InternalRosSystem.g:506:2: ( rule__RosSystem__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:506:3: rule__RosSystem__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosSystem__Group__8"
    // InternalRosSystem.g:514:1: rule__RosSystem__Group__8 : rule__RosSystem__Group__8__Impl ;
    public final void rule__RosSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:518:1: ( rule__RosSystem__Group__8__Impl )
            // InternalRosSystem.g:519:2: rule__RosSystem__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__8"


    // $ANTLR start "rule__RosSystem__Group__8__Impl"
    // InternalRosSystem.g:525:1: rule__RosSystem__Group__8__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:529:1: ( ( '}' ) )
            // InternalRosSystem.g:530:1: ( '}' )
            {
            // InternalRosSystem.g:530:1: ( '}' )
            // InternalRosSystem.g:531:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__8__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__0"
    // InternalRosSystem.g:541:1: rule__RosSystem__Group_5__0 : rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 ;
    public final void rule__RosSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:545:1: ( rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 )
            // InternalRosSystem.g:546:2: rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRosSystem.g:553:1: rule__RosSystem__Group_5__0__Impl : ( 'RosComponents' ) ;
    public final void rule__RosSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:557:1: ( ( 'RosComponents' ) )
            // InternalRosSystem.g:558:1: ( 'RosComponents' )
            {
            // InternalRosSystem.g:558:1: ( 'RosComponents' )
            // InternalRosSystem.g:559:2: 'RosComponents'
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosComponentsKeyword_5_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:568:1: rule__RosSystem__Group_5__1 : rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 ;
    public final void rule__RosSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:572:1: ( rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 )
            // InternalRosSystem.g:573:2: rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystem.g:580:1: rule__RosSystem__Group_5__1__Impl : ( '(' ) ;
    public final void rule__RosSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:584:1: ( ( '(' ) )
            // InternalRosSystem.g:585:1: ( '(' )
            {
            // InternalRosSystem.g:585:1: ( '(' )
            // InternalRosSystem.g:586:2: '('
            {
             before(grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
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
    // InternalRosSystem.g:595:1: rule__RosSystem__Group_5__2 : rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 ;
    public final void rule__RosSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:599:1: ( rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 )
            // InternalRosSystem.g:600:2: rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystem.g:607:1: rule__RosSystem__Group_5__2__Impl : ( ( rule__RosSystem__Group_5_2__0 )? ) ;
    public final void rule__RosSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:611:1: ( ( ( rule__RosSystem__Group_5_2__0 )? ) )
            // InternalRosSystem.g:612:1: ( ( rule__RosSystem__Group_5_2__0 )? )
            {
            // InternalRosSystem.g:612:1: ( ( rule__RosSystem__Group_5_2__0 )? )
            // InternalRosSystem.g:613:2: ( rule__RosSystem__Group_5_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_2()); 
            // InternalRosSystem.g:614:2: ( rule__RosSystem__Group_5_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:614:3: rule__RosSystem__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_5_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_5_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:622:1: rule__RosSystem__Group_5__3 : rule__RosSystem__Group_5__3__Impl ;
    public final void rule__RosSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:626:1: ( rule__RosSystem__Group_5__3__Impl )
            // InternalRosSystem.g:627:2: rule__RosSystem__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:633:1: rule__RosSystem__Group_5__3__Impl : ( ')' ) ;
    public final void rule__RosSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:637:1: ( ( ')' ) )
            // InternalRosSystem.g:638:1: ( ')' )
            {
            // InternalRosSystem.g:638:1: ( ')' )
            // InternalRosSystem.g:639:2: ')'
            {
             before(grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_5_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosSystem__Group_5_2__0"
    // InternalRosSystem.g:649:1: rule__RosSystem__Group_5_2__0 : rule__RosSystem__Group_5_2__0__Impl rule__RosSystem__Group_5_2__1 ;
    public final void rule__RosSystem__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:653:1: ( rule__RosSystem__Group_5_2__0__Impl rule__RosSystem__Group_5_2__1 )
            // InternalRosSystem.g:654:2: rule__RosSystem__Group_5_2__0__Impl rule__RosSystem__Group_5_2__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2__0"


    // $ANTLR start "rule__RosSystem__Group_5_2__0__Impl"
    // InternalRosSystem.g:661:1: rule__RosSystem__Group_5_2__0__Impl : ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) ) ;
    public final void rule__RosSystem__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:665:1: ( ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) ) )
            // InternalRosSystem.g:666:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) )
            {
            // InternalRosSystem.g:666:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) )
            // InternalRosSystem.g:667:2: ( rule__RosSystem__RosComponentAssignment_5_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_2_0()); 
            // InternalRosSystem.g:668:2: ( rule__RosSystem__RosComponentAssignment_5_2_0 )
            // InternalRosSystem.g:668:3: rule__RosSystem__RosComponentAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentAssignment_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_2__1"
    // InternalRosSystem.g:676:1: rule__RosSystem__Group_5_2__1 : rule__RosSystem__Group_5_2__1__Impl ;
    public final void rule__RosSystem__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:680:1: ( rule__RosSystem__Group_5_2__1__Impl )
            // InternalRosSystem.g:681:2: rule__RosSystem__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2__1"


    // $ANTLR start "rule__RosSystem__Group_5_2__1__Impl"
    // InternalRosSystem.g:687:1: rule__RosSystem__Group_5_2__1__Impl : ( ( rule__RosSystem__Group_5_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:691:1: ( ( ( rule__RosSystem__Group_5_2_1__0 )* ) )
            // InternalRosSystem.g:692:1: ( ( rule__RosSystem__Group_5_2_1__0 )* )
            {
            // InternalRosSystem.g:692:1: ( ( rule__RosSystem__Group_5_2_1__0 )* )
            // InternalRosSystem.g:693:2: ( rule__RosSystem__Group_5_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_2_1()); 
            // InternalRosSystem.g:694:2: ( rule__RosSystem__Group_5_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRosSystem.g:694:3: rule__RosSystem__Group_5_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_5_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_2_1__0"
    // InternalRosSystem.g:703:1: rule__RosSystem__Group_5_2_1__0 : rule__RosSystem__Group_5_2_1__0__Impl rule__RosSystem__Group_5_2_1__1 ;
    public final void rule__RosSystem__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:707:1: ( rule__RosSystem__Group_5_2_1__0__Impl rule__RosSystem__Group_5_2_1__1 )
            // InternalRosSystem.g:708:2: rule__RosSystem__Group_5_2_1__0__Impl rule__RosSystem__Group_5_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__RosSystem__Group_5_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2_1__0"


    // $ANTLR start "rule__RosSystem__Group_5_2_1__0__Impl"
    // InternalRosSystem.g:715:1: rule__RosSystem__Group_5_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:719:1: ( ( ',' ) )
            // InternalRosSystem.g:720:1: ( ',' )
            {
            // InternalRosSystem.g:720:1: ( ',' )
            // InternalRosSystem.g:721:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_5_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2_1__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_2_1__1"
    // InternalRosSystem.g:730:1: rule__RosSystem__Group_5_2_1__1 : rule__RosSystem__Group_5_2_1__1__Impl ;
    public final void rule__RosSystem__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:734:1: ( rule__RosSystem__Group_5_2_1__1__Impl )
            // InternalRosSystem.g:735:2: rule__RosSystem__Group_5_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2_1__1"


    // $ANTLR start "rule__RosSystem__Group_5_2_1__1__Impl"
    // InternalRosSystem.g:741:1: rule__RosSystem__Group_5_2_1__1__Impl : ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:745:1: ( ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) ) )
            // InternalRosSystem.g:746:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) )
            {
            // InternalRosSystem.g:746:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) )
            // InternalRosSystem.g:747:2: ( rule__RosSystem__RosComponentAssignment_5_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_2_1_1()); 
            // InternalRosSystem.g:748:2: ( rule__RosSystem__RosComponentAssignment_5_2_1_1 )
            // InternalRosSystem.g:748:3: rule__RosSystem__RosComponentAssignment_5_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentAssignment_5_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_2_1__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__0"
    // InternalRosSystem.g:757:1: rule__RosSystem__Group_6__0 : rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 ;
    public final void rule__RosSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:761:1: ( rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 )
            // InternalRosSystem.g:762:2: rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1
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
    // InternalRosSystem.g:769:1: rule__RosSystem__Group_6__0__Impl : ( 'TopicConnections' ) ;
    public final void rule__RosSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:773:1: ( ( 'TopicConnections' ) )
            // InternalRosSystem.g:774:1: ( 'TopicConnections' )
            {
            // InternalRosSystem.g:774:1: ( 'TopicConnections' )
            // InternalRosSystem.g:775:2: 'TopicConnections'
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_6_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:784:1: rule__RosSystem__Group_6__1 : rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 ;
    public final void rule__RosSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:788:1: ( rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 )
            // InternalRosSystem.g:789:2: rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2
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
    // InternalRosSystem.g:796:1: rule__RosSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:800:1: ( ( '{' ) )
            // InternalRosSystem.g:801:1: ( '{' )
            {
            // InternalRosSystem.g:801:1: ( '{' )
            // InternalRosSystem.g:802:2: '{'
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
    // InternalRosSystem.g:811:1: rule__RosSystem__Group_6__2 : rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 ;
    public final void rule__RosSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:815:1: ( rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 )
            // InternalRosSystem.g:816:2: rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:823:1: rule__RosSystem__Group_6__2__Impl : ( ( rule__RosSystem__Group_6_2__0 )? ) ;
    public final void rule__RosSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:827:1: ( ( ( rule__RosSystem__Group_6_2__0 )? ) )
            // InternalRosSystem.g:828:1: ( ( rule__RosSystem__Group_6_2__0 )? )
            {
            // InternalRosSystem.g:828:1: ( ( rule__RosSystem__Group_6_2__0 )? )
            // InternalRosSystem.g:829:2: ( rule__RosSystem__Group_6_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_2()); 
            // InternalRosSystem.g:830:2: ( rule__RosSystem__Group_6_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRosSystem.g:830:3: rule__RosSystem__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_6_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:838:1: rule__RosSystem__Group_6__3 : rule__RosSystem__Group_6__3__Impl ;
    public final void rule__RosSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:842:1: ( rule__RosSystem__Group_6__3__Impl )
            // InternalRosSystem.g:843:2: rule__RosSystem__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:849:1: rule__RosSystem__Group_6__3__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:853:1: ( ( '}' ) )
            // InternalRosSystem.g:854:1: ( '}' )
            {
            // InternalRosSystem.g:854:1: ( '}' )
            // InternalRosSystem.g:855:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosSystem__Group_6_2__0"
    // InternalRosSystem.g:865:1: rule__RosSystem__Group_6_2__0 : rule__RosSystem__Group_6_2__0__Impl rule__RosSystem__Group_6_2__1 ;
    public final void rule__RosSystem__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:869:1: ( rule__RosSystem__Group_6_2__0__Impl rule__RosSystem__Group_6_2__1 )
            // InternalRosSystem.g:870:2: rule__RosSystem__Group_6_2__0__Impl rule__RosSystem__Group_6_2__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2__0"


    // $ANTLR start "rule__RosSystem__Group_6_2__0__Impl"
    // InternalRosSystem.g:877:1: rule__RosSystem__Group_6_2__0__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) ) ;
    public final void rule__RosSystem__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:881:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) ) )
            // InternalRosSystem.g:882:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) )
            {
            // InternalRosSystem.g:882:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) )
            // InternalRosSystem.g:883:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_6_2_0()); 
            // InternalRosSystem.g:884:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 )
            // InternalRosSystem.g:884:3: rule__RosSystem__TopicConnectionsAssignment_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_2__1"
    // InternalRosSystem.g:892:1: rule__RosSystem__Group_6_2__1 : rule__RosSystem__Group_6_2__1__Impl ;
    public final void rule__RosSystem__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:896:1: ( rule__RosSystem__Group_6_2__1__Impl )
            // InternalRosSystem.g:897:2: rule__RosSystem__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2__1"


    // $ANTLR start "rule__RosSystem__Group_6_2__1__Impl"
    // InternalRosSystem.g:903:1: rule__RosSystem__Group_6_2__1__Impl : ( ( rule__RosSystem__Group_6_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:907:1: ( ( ( rule__RosSystem__Group_6_2_1__0 )* ) )
            // InternalRosSystem.g:908:1: ( ( rule__RosSystem__Group_6_2_1__0 )* )
            {
            // InternalRosSystem.g:908:1: ( ( rule__RosSystem__Group_6_2_1__0 )* )
            // InternalRosSystem.g:909:2: ( rule__RosSystem__Group_6_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_2_1()); 
            // InternalRosSystem.g:910:2: ( rule__RosSystem__Group_6_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRosSystem.g:910:3: rule__RosSystem__Group_6_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_6_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_2_1__0"
    // InternalRosSystem.g:919:1: rule__RosSystem__Group_6_2_1__0 : rule__RosSystem__Group_6_2_1__0__Impl rule__RosSystem__Group_6_2_1__1 ;
    public final void rule__RosSystem__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:923:1: ( rule__RosSystem__Group_6_2_1__0__Impl rule__RosSystem__Group_6_2_1__1 )
            // InternalRosSystem.g:924:2: rule__RosSystem__Group_6_2_1__0__Impl rule__RosSystem__Group_6_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__RosSystem__Group_6_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2_1__0"


    // $ANTLR start "rule__RosSystem__Group_6_2_1__0__Impl"
    // InternalRosSystem.g:931:1: rule__RosSystem__Group_6_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:935:1: ( ( ',' ) )
            // InternalRosSystem.g:936:1: ( ',' )
            {
            // InternalRosSystem.g:936:1: ( ',' )
            // InternalRosSystem.g:937:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_6_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2_1__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_2_1__1"
    // InternalRosSystem.g:946:1: rule__RosSystem__Group_6_2_1__1 : rule__RosSystem__Group_6_2_1__1__Impl ;
    public final void rule__RosSystem__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:950:1: ( rule__RosSystem__Group_6_2_1__1__Impl )
            // InternalRosSystem.g:951:2: rule__RosSystem__Group_6_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2_1__1"


    // $ANTLR start "rule__RosSystem__Group_6_2_1__1__Impl"
    // InternalRosSystem.g:957:1: rule__RosSystem__Group_6_2_1__1__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:961:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) ) )
            // InternalRosSystem.g:962:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) )
            {
            // InternalRosSystem.g:962:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) )
            // InternalRosSystem.g:963:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_6_2_1_1()); 
            // InternalRosSystem.g:964:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 )
            // InternalRosSystem.g:964:3: rule__RosSystem__TopicConnectionsAssignment_6_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_6_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_6_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_2_1__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_7__0"
    // InternalRosSystem.g:973:1: rule__RosSystem__Group_7__0 : rule__RosSystem__Group_7__0__Impl rule__RosSystem__Group_7__1 ;
    public final void rule__RosSystem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:977:1: ( rule__RosSystem__Group_7__0__Impl rule__RosSystem__Group_7__1 )
            // InternalRosSystem.g:978:2: rule__RosSystem__Group_7__0__Impl rule__RosSystem__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__0"


    // $ANTLR start "rule__RosSystem__Group_7__0__Impl"
    // InternalRosSystem.g:985:1: rule__RosSystem__Group_7__0__Impl : ( 'ServiceConnections' ) ;
    public final void rule__RosSystem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:989:1: ( ( 'ServiceConnections' ) )
            // InternalRosSystem.g:990:1: ( 'ServiceConnections' )
            {
            // InternalRosSystem.g:990:1: ( 'ServiceConnections' )
            // InternalRosSystem.g:991:2: 'ServiceConnections'
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_7__1"
    // InternalRosSystem.g:1000:1: rule__RosSystem__Group_7__1 : rule__RosSystem__Group_7__1__Impl rule__RosSystem__Group_7__2 ;
    public final void rule__RosSystem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1004:1: ( rule__RosSystem__Group_7__1__Impl rule__RosSystem__Group_7__2 )
            // InternalRosSystem.g:1005:2: rule__RosSystem__Group_7__1__Impl rule__RosSystem__Group_7__2
            {
            pushFollow(FOLLOW_15);
            rule__RosSystem__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__1"


    // $ANTLR start "rule__RosSystem__Group_7__1__Impl"
    // InternalRosSystem.g:1012:1: rule__RosSystem__Group_7__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1016:1: ( ( '{' ) )
            // InternalRosSystem.g:1017:1: ( '{' )
            {
            // InternalRosSystem.g:1017:1: ( '{' )
            // InternalRosSystem.g:1018:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_7__2"
    // InternalRosSystem.g:1027:1: rule__RosSystem__Group_7__2 : rule__RosSystem__Group_7__2__Impl rule__RosSystem__Group_7__3 ;
    public final void rule__RosSystem__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1031:1: ( rule__RosSystem__Group_7__2__Impl rule__RosSystem__Group_7__3 )
            // InternalRosSystem.g:1032:2: rule__RosSystem__Group_7__2__Impl rule__RosSystem__Group_7__3
            {
            pushFollow(FOLLOW_15);
            rule__RosSystem__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__2"


    // $ANTLR start "rule__RosSystem__Group_7__2__Impl"
    // InternalRosSystem.g:1039:1: rule__RosSystem__Group_7__2__Impl : ( ( rule__RosSystem__Group_7_2__0 )? ) ;
    public final void rule__RosSystem__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1043:1: ( ( ( rule__RosSystem__Group_7_2__0 )? ) )
            // InternalRosSystem.g:1044:1: ( ( rule__RosSystem__Group_7_2__0 )? )
            {
            // InternalRosSystem.g:1044:1: ( ( rule__RosSystem__Group_7_2__0 )? )
            // InternalRosSystem.g:1045:2: ( rule__RosSystem__Group_7_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_7_2()); 
            // InternalRosSystem.g:1046:2: ( rule__RosSystem__Group_7_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:1046:3: rule__RosSystem__Group_7_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_7_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_7__3"
    // InternalRosSystem.g:1054:1: rule__RosSystem__Group_7__3 : rule__RosSystem__Group_7__3__Impl ;
    public final void rule__RosSystem__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1058:1: ( rule__RosSystem__Group_7__3__Impl )
            // InternalRosSystem.g:1059:2: rule__RosSystem__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__3"


    // $ANTLR start "rule__RosSystem__Group_7__3__Impl"
    // InternalRosSystem.g:1065:1: rule__RosSystem__Group_7__3__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1069:1: ( ( '}' ) )
            // InternalRosSystem.g:1070:1: ( '}' )
            {
            // InternalRosSystem.g:1070:1: ( '}' )
            // InternalRosSystem.g:1071:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_7_2__0"
    // InternalRosSystem.g:1081:1: rule__RosSystem__Group_7_2__0 : rule__RosSystem__Group_7_2__0__Impl rule__RosSystem__Group_7_2__1 ;
    public final void rule__RosSystem__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1085:1: ( rule__RosSystem__Group_7_2__0__Impl rule__RosSystem__Group_7_2__1 )
            // InternalRosSystem.g:1086:2: rule__RosSystem__Group_7_2__0__Impl rule__RosSystem__Group_7_2__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2__0"


    // $ANTLR start "rule__RosSystem__Group_7_2__0__Impl"
    // InternalRosSystem.g:1093:1: rule__RosSystem__Group_7_2__0__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) ) ;
    public final void rule__RosSystem__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1097:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) ) )
            // InternalRosSystem.g:1098:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) )
            {
            // InternalRosSystem.g:1098:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) )
            // InternalRosSystem.g:1099:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_7_2_0()); 
            // InternalRosSystem.g:1100:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 )
            // InternalRosSystem.g:1100:3: rule__RosSystem__ServiceConnectionsAssignment_7_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_7_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_7_2__1"
    // InternalRosSystem.g:1108:1: rule__RosSystem__Group_7_2__1 : rule__RosSystem__Group_7_2__1__Impl ;
    public final void rule__RosSystem__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1112:1: ( rule__RosSystem__Group_7_2__1__Impl )
            // InternalRosSystem.g:1113:2: rule__RosSystem__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2__1"


    // $ANTLR start "rule__RosSystem__Group_7_2__1__Impl"
    // InternalRosSystem.g:1119:1: rule__RosSystem__Group_7_2__1__Impl : ( ( rule__RosSystem__Group_7_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1123:1: ( ( ( rule__RosSystem__Group_7_2_1__0 )* ) )
            // InternalRosSystem.g:1124:1: ( ( rule__RosSystem__Group_7_2_1__0 )* )
            {
            // InternalRosSystem.g:1124:1: ( ( rule__RosSystem__Group_7_2_1__0 )* )
            // InternalRosSystem.g:1125:2: ( rule__RosSystem__Group_7_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_7_2_1()); 
            // InternalRosSystem.g:1126:2: ( rule__RosSystem__Group_7_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRosSystem.g:1126:3: rule__RosSystem__Group_7_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_7_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_7_2_1__0"
    // InternalRosSystem.g:1135:1: rule__RosSystem__Group_7_2_1__0 : rule__RosSystem__Group_7_2_1__0__Impl rule__RosSystem__Group_7_2_1__1 ;
    public final void rule__RosSystem__Group_7_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1139:1: ( rule__RosSystem__Group_7_2_1__0__Impl rule__RosSystem__Group_7_2_1__1 )
            // InternalRosSystem.g:1140:2: rule__RosSystem__Group_7_2_1__0__Impl rule__RosSystem__Group_7_2_1__1
            {
            pushFollow(FOLLOW_16);
            rule__RosSystem__Group_7_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2_1__0"


    // $ANTLR start "rule__RosSystem__Group_7_2_1__0__Impl"
    // InternalRosSystem.g:1147:1: rule__RosSystem__Group_7_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_7_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1151:1: ( ( ',' ) )
            // InternalRosSystem.g:1152:1: ( ',' )
            {
            // InternalRosSystem.g:1152:1: ( ',' )
            // InternalRosSystem.g:1153:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_7_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2_1__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_7_2_1__1"
    // InternalRosSystem.g:1162:1: rule__RosSystem__Group_7_2_1__1 : rule__RosSystem__Group_7_2_1__1__Impl ;
    public final void rule__RosSystem__Group_7_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1166:1: ( rule__RosSystem__Group_7_2_1__1__Impl )
            // InternalRosSystem.g:1167:2: rule__RosSystem__Group_7_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_7_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2_1__1"


    // $ANTLR start "rule__RosSystem__Group_7_2_1__1__Impl"
    // InternalRosSystem.g:1173:1: rule__RosSystem__Group_7_2_1__1__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_7_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1177:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) ) )
            // InternalRosSystem.g:1178:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) )
            {
            // InternalRosSystem.g:1178:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) )
            // InternalRosSystem.g:1179:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_7_2_1_1()); 
            // InternalRosSystem.g:1180:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 )
            // InternalRosSystem.g:1180:3: rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_7_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_7_2_1__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__0"
    // InternalRosSystem.g:1189:1: rule__TopicConnection__Group__0 : rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 ;
    public final void rule__TopicConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1193:1: ( rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 )
            // InternalRosSystem.g:1194:2: rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:1201:1: rule__TopicConnection__Group__0__Impl : ( 'TopicConnection' ) ;
    public final void rule__TopicConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1205:1: ( ( 'TopicConnection' ) )
            // InternalRosSystem.g:1206:1: ( 'TopicConnection' )
            {
            // InternalRosSystem.g:1206:1: ( 'TopicConnection' )
            // InternalRosSystem.g:1207:2: 'TopicConnection'
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
    // InternalRosSystem.g:1216:1: rule__TopicConnection__Group__1 : rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 ;
    public final void rule__TopicConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1220:1: ( rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 )
            // InternalRosSystem.g:1221:2: rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:1228:1: rule__TopicConnection__Group__1__Impl : ( ( rule__TopicConnection__TopicNameAssignment_1 ) ) ;
    public final void rule__TopicConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1232:1: ( ( ( rule__TopicConnection__TopicNameAssignment_1 ) ) )
            // InternalRosSystem.g:1233:1: ( ( rule__TopicConnection__TopicNameAssignment_1 ) )
            {
            // InternalRosSystem.g:1233:1: ( ( rule__TopicConnection__TopicNameAssignment_1 ) )
            // InternalRosSystem.g:1234:2: ( rule__TopicConnection__TopicNameAssignment_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicNameAssignment_1()); 
            // InternalRosSystem.g:1235:2: ( rule__TopicConnection__TopicNameAssignment_1 )
            // InternalRosSystem.g:1235:3: rule__TopicConnection__TopicNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__TopicNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getTopicNameAssignment_1()); 

            }


            }

        }
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
    // InternalRosSystem.g:1243:1: rule__TopicConnection__Group__2 : rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 ;
    public final void rule__TopicConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1247:1: ( rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 )
            // InternalRosSystem.g:1248:2: rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:1255:1: rule__TopicConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1259:1: ( ( '{' ) )
            // InternalRosSystem.g:1260:1: ( '{' )
            {
            // InternalRosSystem.g:1260:1: ( '{' )
            // InternalRosSystem.g:1261:2: '{'
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:1270:1: rule__TopicConnection__Group__3 : rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 ;
    public final void rule__TopicConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1274:1: ( rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 )
            // InternalRosSystem.g:1275:2: rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRosSystem.g:1282:1: rule__TopicConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__TopicConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1286:1: ( ( 'From' ) )
            // InternalRosSystem.g:1287:1: ( 'From' )
            {
            // InternalRosSystem.g:1287:1: ( 'From' )
            // InternalRosSystem.g:1288:2: 'From'
            {
             before(grammarAccess.getTopicConnectionAccess().getFromKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getFromKeyword_3()); 

            }


            }

        }
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
    // InternalRosSystem.g:1297:1: rule__TopicConnection__Group__4 : rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 ;
    public final void rule__TopicConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1301:1: ( rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 )
            // InternalRosSystem.g:1302:2: rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5
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
    // InternalRosSystem.g:1309:1: rule__TopicConnection__Group__4__Impl : ( '(' ) ;
    public final void rule__TopicConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1313:1: ( ( '(' ) )
            // InternalRosSystem.g:1314:1: ( '(' )
            {
            // InternalRosSystem.g:1314:1: ( '(' )
            // InternalRosSystem.g:1315:2: '('
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalRosSystem.g:1324:1: rule__TopicConnection__Group__5 : rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 ;
    public final void rule__TopicConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1328:1: ( rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 )
            // InternalRosSystem.g:1329:2: rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalRosSystem.g:1336:1: rule__TopicConnection__Group__5__Impl : ( ( rule__TopicConnection__FromAssignment_5 ) ) ;
    public final void rule__TopicConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1340:1: ( ( ( rule__TopicConnection__FromAssignment_5 ) ) )
            // InternalRosSystem.g:1341:1: ( ( rule__TopicConnection__FromAssignment_5 ) )
            {
            // InternalRosSystem.g:1341:1: ( ( rule__TopicConnection__FromAssignment_5 ) )
            // InternalRosSystem.g:1342:2: ( rule__TopicConnection__FromAssignment_5 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_5()); 
            // InternalRosSystem.g:1343:2: ( rule__TopicConnection__FromAssignment_5 )
            // InternalRosSystem.g:1343:3: rule__TopicConnection__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getFromAssignment_5()); 

            }


            }

        }
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
    // InternalRosSystem.g:1351:1: rule__TopicConnection__Group__6 : rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7 ;
    public final void rule__TopicConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1355:1: ( rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7 )
            // InternalRosSystem.g:1356:2: rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__TopicConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__7();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:1363:1: rule__TopicConnection__Group__6__Impl : ( ( rule__TopicConnection__Group_6__0 )* ) ;
    public final void rule__TopicConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1367:1: ( ( ( rule__TopicConnection__Group_6__0 )* ) )
            // InternalRosSystem.g:1368:1: ( ( rule__TopicConnection__Group_6__0 )* )
            {
            // InternalRosSystem.g:1368:1: ( ( rule__TopicConnection__Group_6__0 )* )
            // InternalRosSystem.g:1369:2: ( rule__TopicConnection__Group_6__0 )*
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_6()); 
            // InternalRosSystem.g:1370:2: ( rule__TopicConnection__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystem.g:1370:3: rule__TopicConnection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TopicConnection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTopicConnectionAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__TopicConnection__Group__7"
    // InternalRosSystem.g:1378:1: rule__TopicConnection__Group__7 : rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8 ;
    public final void rule__TopicConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1382:1: ( rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8 )
            // InternalRosSystem.g:1383:2: rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__TopicConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__7"


    // $ANTLR start "rule__TopicConnection__Group__7__Impl"
    // InternalRosSystem.g:1390:1: rule__TopicConnection__Group__7__Impl : ( ')' ) ;
    public final void rule__TopicConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1394:1: ( ( ')' ) )
            // InternalRosSystem.g:1395:1: ( ')' )
            {
            // InternalRosSystem.g:1395:1: ( ')' )
            // InternalRosSystem.g:1396:2: ')'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__7__Impl"


    // $ANTLR start "rule__TopicConnection__Group__8"
    // InternalRosSystem.g:1405:1: rule__TopicConnection__Group__8 : rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9 ;
    public final void rule__TopicConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1409:1: ( rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9 )
            // InternalRosSystem.g:1410:2: rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__TopicConnection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__8"


    // $ANTLR start "rule__TopicConnection__Group__8__Impl"
    // InternalRosSystem.g:1417:1: rule__TopicConnection__Group__8__Impl : ( 'To' ) ;
    public final void rule__TopicConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1421:1: ( ( 'To' ) )
            // InternalRosSystem.g:1422:1: ( 'To' )
            {
            // InternalRosSystem.g:1422:1: ( 'To' )
            // InternalRosSystem.g:1423:2: 'To'
            {
             before(grammarAccess.getTopicConnectionAccess().getToKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getToKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__8__Impl"


    // $ANTLR start "rule__TopicConnection__Group__9"
    // InternalRosSystem.g:1432:1: rule__TopicConnection__Group__9 : rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10 ;
    public final void rule__TopicConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1436:1: ( rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10 )
            // InternalRosSystem.g:1437:2: rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__9"


    // $ANTLR start "rule__TopicConnection__Group__9__Impl"
    // InternalRosSystem.g:1444:1: rule__TopicConnection__Group__9__Impl : ( '(' ) ;
    public final void rule__TopicConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1448:1: ( ( '(' ) )
            // InternalRosSystem.g:1449:1: ( '(' )
            {
            // InternalRosSystem.g:1449:1: ( '(' )
            // InternalRosSystem.g:1450:2: '('
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__9__Impl"


    // $ANTLR start "rule__TopicConnection__Group__10"
    // InternalRosSystem.g:1459:1: rule__TopicConnection__Group__10 : rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11 ;
    public final void rule__TopicConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1463:1: ( rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11 )
            // InternalRosSystem.g:1464:2: rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__TopicConnection__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__10"


    // $ANTLR start "rule__TopicConnection__Group__10__Impl"
    // InternalRosSystem.g:1471:1: rule__TopicConnection__Group__10__Impl : ( ( rule__TopicConnection__ToAssignment_10 ) ) ;
    public final void rule__TopicConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1475:1: ( ( ( rule__TopicConnection__ToAssignment_10 ) ) )
            // InternalRosSystem.g:1476:1: ( ( rule__TopicConnection__ToAssignment_10 ) )
            {
            // InternalRosSystem.g:1476:1: ( ( rule__TopicConnection__ToAssignment_10 ) )
            // InternalRosSystem.g:1477:2: ( rule__TopicConnection__ToAssignment_10 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_10()); 
            // InternalRosSystem.g:1478:2: ( rule__TopicConnection__ToAssignment_10 )
            // InternalRosSystem.g:1478:3: rule__TopicConnection__ToAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__ToAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getToAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__10__Impl"


    // $ANTLR start "rule__TopicConnection__Group__11"
    // InternalRosSystem.g:1486:1: rule__TopicConnection__Group__11 : rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12 ;
    public final void rule__TopicConnection__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1490:1: ( rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12 )
            // InternalRosSystem.g:1491:2: rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__TopicConnection__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__11"


    // $ANTLR start "rule__TopicConnection__Group__11__Impl"
    // InternalRosSystem.g:1498:1: rule__TopicConnection__Group__11__Impl : ( ( rule__TopicConnection__Group_11__0 )* ) ;
    public final void rule__TopicConnection__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1502:1: ( ( ( rule__TopicConnection__Group_11__0 )* ) )
            // InternalRosSystem.g:1503:1: ( ( rule__TopicConnection__Group_11__0 )* )
            {
            // InternalRosSystem.g:1503:1: ( ( rule__TopicConnection__Group_11__0 )* )
            // InternalRosSystem.g:1504:2: ( rule__TopicConnection__Group_11__0 )*
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_11()); 
            // InternalRosSystem.g:1505:2: ( rule__TopicConnection__Group_11__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosSystem.g:1505:3: rule__TopicConnection__Group_11__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TopicConnection__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTopicConnectionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__11__Impl"


    // $ANTLR start "rule__TopicConnection__Group__12"
    // InternalRosSystem.g:1513:1: rule__TopicConnection__Group__12 : rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13 ;
    public final void rule__TopicConnection__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1517:1: ( rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13 )
            // InternalRosSystem.g:1518:2: rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__TopicConnection__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__12"


    // $ANTLR start "rule__TopicConnection__Group__12__Impl"
    // InternalRosSystem.g:1525:1: rule__TopicConnection__Group__12__Impl : ( ')' ) ;
    public final void rule__TopicConnection__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1529:1: ( ( ')' ) )
            // InternalRosSystem.g:1530:1: ( ')' )
            {
            // InternalRosSystem.g:1530:1: ( ')' )
            // InternalRosSystem.g:1531:2: ')'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__12__Impl"


    // $ANTLR start "rule__TopicConnection__Group__13"
    // InternalRosSystem.g:1540:1: rule__TopicConnection__Group__13 : rule__TopicConnection__Group__13__Impl ;
    public final void rule__TopicConnection__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1544:1: ( rule__TopicConnection__Group__13__Impl )
            // InternalRosSystem.g:1545:2: rule__TopicConnection__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__13"


    // $ANTLR start "rule__TopicConnection__Group__13__Impl"
    // InternalRosSystem.g:1551:1: rule__TopicConnection__Group__13__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1555:1: ( ( '}' ) )
            // InternalRosSystem.g:1556:1: ( '}' )
            {
            // InternalRosSystem.g:1556:1: ( '}' )
            // InternalRosSystem.g:1557:2: '}'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__13__Impl"


    // $ANTLR start "rule__TopicConnection__Group_6__0"
    // InternalRosSystem.g:1567:1: rule__TopicConnection__Group_6__0 : rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1 ;
    public final void rule__TopicConnection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1571:1: ( rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1 )
            // InternalRosSystem.g:1572:2: rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__0"


    // $ANTLR start "rule__TopicConnection__Group_6__0__Impl"
    // InternalRosSystem.g:1579:1: rule__TopicConnection__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TopicConnection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1583:1: ( ( ',' ) )
            // InternalRosSystem.g:1584:1: ( ',' )
            {
            // InternalRosSystem.g:1584:1: ( ',' )
            // InternalRosSystem.g:1585:2: ','
            {
             before(grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group_6__1"
    // InternalRosSystem.g:1594:1: rule__TopicConnection__Group_6__1 : rule__TopicConnection__Group_6__1__Impl ;
    public final void rule__TopicConnection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1598:1: ( rule__TopicConnection__Group_6__1__Impl )
            // InternalRosSystem.g:1599:2: rule__TopicConnection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__1"


    // $ANTLR start "rule__TopicConnection__Group_6__1__Impl"
    // InternalRosSystem.g:1605:1: rule__TopicConnection__Group_6__1__Impl : ( ( rule__TopicConnection__FromAssignment_6_1 ) ) ;
    public final void rule__TopicConnection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1609:1: ( ( ( rule__TopicConnection__FromAssignment_6_1 ) ) )
            // InternalRosSystem.g:1610:1: ( ( rule__TopicConnection__FromAssignment_6_1 ) )
            {
            // InternalRosSystem.g:1610:1: ( ( rule__TopicConnection__FromAssignment_6_1 ) )
            // InternalRosSystem.g:1611:2: ( rule__TopicConnection__FromAssignment_6_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_6_1()); 
            // InternalRosSystem.g:1612:2: ( rule__TopicConnection__FromAssignment_6_1 )
            // InternalRosSystem.g:1612:3: rule__TopicConnection__FromAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__FromAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getFromAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group_11__0"
    // InternalRosSystem.g:1621:1: rule__TopicConnection__Group_11__0 : rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1 ;
    public final void rule__TopicConnection__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1625:1: ( rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1 )
            // InternalRosSystem.g:1626:2: rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__0"


    // $ANTLR start "rule__TopicConnection__Group_11__0__Impl"
    // InternalRosSystem.g:1633:1: rule__TopicConnection__Group_11__0__Impl : ( ',' ) ;
    public final void rule__TopicConnection__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1637:1: ( ( ',' ) )
            // InternalRosSystem.g:1638:1: ( ',' )
            {
            // InternalRosSystem.g:1638:1: ( ',' )
            // InternalRosSystem.g:1639:2: ','
            {
             before(grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group_11__1"
    // InternalRosSystem.g:1648:1: rule__TopicConnection__Group_11__1 : rule__TopicConnection__Group_11__1__Impl ;
    public final void rule__TopicConnection__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1652:1: ( rule__TopicConnection__Group_11__1__Impl )
            // InternalRosSystem.g:1653:2: rule__TopicConnection__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__1"


    // $ANTLR start "rule__TopicConnection__Group_11__1__Impl"
    // InternalRosSystem.g:1659:1: rule__TopicConnection__Group_11__1__Impl : ( ( rule__TopicConnection__ToAssignment_11_1 ) ) ;
    public final void rule__TopicConnection__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1663:1: ( ( ( rule__TopicConnection__ToAssignment_11_1 ) ) )
            // InternalRosSystem.g:1664:1: ( ( rule__TopicConnection__ToAssignment_11_1 ) )
            {
            // InternalRosSystem.g:1664:1: ( ( rule__TopicConnection__ToAssignment_11_1 ) )
            // InternalRosSystem.g:1665:2: ( rule__TopicConnection__ToAssignment_11_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_11_1()); 
            // InternalRosSystem.g:1666:2: ( rule__TopicConnection__ToAssignment_11_1 )
            // InternalRosSystem.g:1666:3: rule__TopicConnection__ToAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__ToAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getToAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__0"
    // InternalRosSystem.g:1675:1: rule__ServiceConnection__Group__0 : rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 ;
    public final void rule__ServiceConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1679:1: ( rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 )
            // InternalRosSystem.g:1680:2: rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:1687:1: rule__ServiceConnection__Group__0__Impl : ( 'ServiceConnection' ) ;
    public final void rule__ServiceConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1691:1: ( ( 'ServiceConnection' ) )
            // InternalRosSystem.g:1692:1: ( 'ServiceConnection' )
            {
            // InternalRosSystem.g:1692:1: ( 'ServiceConnection' )
            // InternalRosSystem.g:1693:2: 'ServiceConnection'
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
    // InternalRosSystem.g:1702:1: rule__ServiceConnection__Group__1 : rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 ;
    public final void rule__ServiceConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1706:1: ( rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 )
            // InternalRosSystem.g:1707:2: rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:1714:1: rule__ServiceConnection__Group__1__Impl : ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) ) ;
    public final void rule__ServiceConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1718:1: ( ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) ) )
            // InternalRosSystem.g:1719:1: ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) )
            {
            // InternalRosSystem.g:1719:1: ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) )
            // InternalRosSystem.g:1720:2: ( rule__ServiceConnection__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceNameAssignment_1()); 
            // InternalRosSystem.g:1721:2: ( rule__ServiceConnection__ServiceNameAssignment_1 )
            // InternalRosSystem.g:1721:3: rule__ServiceConnection__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__ServiceNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getServiceNameAssignment_1()); 

            }


            }

        }
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
    // InternalRosSystem.g:1729:1: rule__ServiceConnection__Group__2 : rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 ;
    public final void rule__ServiceConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1733:1: ( rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 )
            // InternalRosSystem.g:1734:2: rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:1741:1: rule__ServiceConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1745:1: ( ( '{' ) )
            // InternalRosSystem.g:1746:1: ( '{' )
            {
            // InternalRosSystem.g:1746:1: ( '{' )
            // InternalRosSystem.g:1747:2: '{'
            {
             before(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:1756:1: rule__ServiceConnection__Group__3 : rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 ;
    public final void rule__ServiceConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1760:1: ( rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 )
            // InternalRosSystem.g:1761:2: rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRosSystem.g:1768:1: rule__ServiceConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__ServiceConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1772:1: ( ( 'From' ) )
            // InternalRosSystem.g:1773:1: ( 'From' )
            {
            // InternalRosSystem.g:1773:1: ( 'From' )
            // InternalRosSystem.g:1774:2: 'From'
            {
             before(grammarAccess.getServiceConnectionAccess().getFromKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getFromKeyword_3()); 

            }


            }

        }
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
    // InternalRosSystem.g:1783:1: rule__ServiceConnection__Group__4 : rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 ;
    public final void rule__ServiceConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1787:1: ( rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 )
            // InternalRosSystem.g:1788:2: rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5
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
    // InternalRosSystem.g:1795:1: rule__ServiceConnection__Group__4__Impl : ( '(' ) ;
    public final void rule__ServiceConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1799:1: ( ( '(' ) )
            // InternalRosSystem.g:1800:1: ( '(' )
            {
            // InternalRosSystem.g:1800:1: ( '(' )
            // InternalRosSystem.g:1801:2: '('
            {
             before(grammarAccess.getServiceConnectionAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalRosSystem.g:1810:1: rule__ServiceConnection__Group__5 : rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 ;
    public final void rule__ServiceConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1814:1: ( rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 )
            // InternalRosSystem.g:1815:2: rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalRosSystem.g:1822:1: rule__ServiceConnection__Group__5__Impl : ( ( rule__ServiceConnection__FromAssignment_5 ) ) ;
    public final void rule__ServiceConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1826:1: ( ( ( rule__ServiceConnection__FromAssignment_5 ) ) )
            // InternalRosSystem.g:1827:1: ( ( rule__ServiceConnection__FromAssignment_5 ) )
            {
            // InternalRosSystem.g:1827:1: ( ( rule__ServiceConnection__FromAssignment_5 ) )
            // InternalRosSystem.g:1828:2: ( rule__ServiceConnection__FromAssignment_5 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_5()); 
            // InternalRosSystem.g:1829:2: ( rule__ServiceConnection__FromAssignment_5 )
            // InternalRosSystem.g:1829:3: rule__ServiceConnection__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getFromAssignment_5()); 

            }


            }

        }
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
    // InternalRosSystem.g:1837:1: rule__ServiceConnection__Group__6 : rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7 ;
    public final void rule__ServiceConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1841:1: ( rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7 )
            // InternalRosSystem.g:1842:2: rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__ServiceConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__7();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:1849:1: rule__ServiceConnection__Group__6__Impl : ( ( rule__ServiceConnection__Group_6__0 )* ) ;
    public final void rule__ServiceConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1853:1: ( ( ( rule__ServiceConnection__Group_6__0 )* ) )
            // InternalRosSystem.g:1854:1: ( ( rule__ServiceConnection__Group_6__0 )* )
            {
            // InternalRosSystem.g:1854:1: ( ( rule__ServiceConnection__Group_6__0 )* )
            // InternalRosSystem.g:1855:2: ( rule__ServiceConnection__Group_6__0 )*
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup_6()); 
            // InternalRosSystem.g:1856:2: ( rule__ServiceConnection__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRosSystem.g:1856:3: rule__ServiceConnection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ServiceConnection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getServiceConnectionAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__ServiceConnection__Group__7"
    // InternalRosSystem.g:1864:1: rule__ServiceConnection__Group__7 : rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8 ;
    public final void rule__ServiceConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1868:1: ( rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8 )
            // InternalRosSystem.g:1869:2: rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__ServiceConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__7"


    // $ANTLR start "rule__ServiceConnection__Group__7__Impl"
    // InternalRosSystem.g:1876:1: rule__ServiceConnection__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1880:1: ( ( ')' ) )
            // InternalRosSystem.g:1881:1: ( ')' )
            {
            // InternalRosSystem.g:1881:1: ( ')' )
            // InternalRosSystem.g:1882:2: ')'
            {
             before(grammarAccess.getServiceConnectionAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__7__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__8"
    // InternalRosSystem.g:1891:1: rule__ServiceConnection__Group__8 : rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9 ;
    public final void rule__ServiceConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1895:1: ( rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9 )
            // InternalRosSystem.g:1896:2: rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__8"


    // $ANTLR start "rule__ServiceConnection__Group__8__Impl"
    // InternalRosSystem.g:1903:1: rule__ServiceConnection__Group__8__Impl : ( 'To' ) ;
    public final void rule__ServiceConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1907:1: ( ( 'To' ) )
            // InternalRosSystem.g:1908:1: ( 'To' )
            {
            // InternalRosSystem.g:1908:1: ( 'To' )
            // InternalRosSystem.g:1909:2: 'To'
            {
             before(grammarAccess.getServiceConnectionAccess().getToKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getToKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__8__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__9"
    // InternalRosSystem.g:1918:1: rule__ServiceConnection__Group__9 : rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10 ;
    public final void rule__ServiceConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1922:1: ( rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10 )
            // InternalRosSystem.g:1923:2: rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__ServiceConnection__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__9"


    // $ANTLR start "rule__ServiceConnection__Group__9__Impl"
    // InternalRosSystem.g:1930:1: rule__ServiceConnection__Group__9__Impl : ( ( rule__ServiceConnection__ToAssignment_9 ) ) ;
    public final void rule__ServiceConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1934:1: ( ( ( rule__ServiceConnection__ToAssignment_9 ) ) )
            // InternalRosSystem.g:1935:1: ( ( rule__ServiceConnection__ToAssignment_9 ) )
            {
            // InternalRosSystem.g:1935:1: ( ( rule__ServiceConnection__ToAssignment_9 ) )
            // InternalRosSystem.g:1936:2: ( rule__ServiceConnection__ToAssignment_9 )
            {
             before(grammarAccess.getServiceConnectionAccess().getToAssignment_9()); 
            // InternalRosSystem.g:1937:2: ( rule__ServiceConnection__ToAssignment_9 )
            // InternalRosSystem.g:1937:3: rule__ServiceConnection__ToAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__ToAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getToAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__9__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__10"
    // InternalRosSystem.g:1945:1: rule__ServiceConnection__Group__10 : rule__ServiceConnection__Group__10__Impl ;
    public final void rule__ServiceConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1949:1: ( rule__ServiceConnection__Group__10__Impl )
            // InternalRosSystem.g:1950:2: rule__ServiceConnection__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__10"


    // $ANTLR start "rule__ServiceConnection__Group__10__Impl"
    // InternalRosSystem.g:1956:1: rule__ServiceConnection__Group__10__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1960:1: ( ( '}' ) )
            // InternalRosSystem.g:1961:1: ( '}' )
            {
            // InternalRosSystem.g:1961:1: ( '}' )
            // InternalRosSystem.g:1962:2: '}'
            {
             before(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__10__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_6__0"
    // InternalRosSystem.g:1972:1: rule__ServiceConnection__Group_6__0 : rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1 ;
    public final void rule__ServiceConnection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1976:1: ( rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1 )
            // InternalRosSystem.g:1977:2: rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__0"


    // $ANTLR start "rule__ServiceConnection__Group_6__0__Impl"
    // InternalRosSystem.g:1984:1: rule__ServiceConnection__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ServiceConnection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1988:1: ( ( ',' ) )
            // InternalRosSystem.g:1989:1: ( ',' )
            {
            // InternalRosSystem.g:1989:1: ( ',' )
            // InternalRosSystem.g:1990:2: ','
            {
             before(grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_6__1"
    // InternalRosSystem.g:1999:1: rule__ServiceConnection__Group_6__1 : rule__ServiceConnection__Group_6__1__Impl ;
    public final void rule__ServiceConnection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2003:1: ( rule__ServiceConnection__Group_6__1__Impl )
            // InternalRosSystem.g:2004:2: rule__ServiceConnection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__1"


    // $ANTLR start "rule__ServiceConnection__Group_6__1__Impl"
    // InternalRosSystem.g:2010:1: rule__ServiceConnection__Group_6__1__Impl : ( ( rule__ServiceConnection__FromAssignment_6_1 ) ) ;
    public final void rule__ServiceConnection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2014:1: ( ( ( rule__ServiceConnection__FromAssignment_6_1 ) ) )
            // InternalRosSystem.g:2015:1: ( ( rule__ServiceConnection__FromAssignment_6_1 ) )
            {
            // InternalRosSystem.g:2015:1: ( ( rule__ServiceConnection__FromAssignment_6_1 ) )
            // InternalRosSystem.g:2016:2: ( rule__ServiceConnection__FromAssignment_6_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_6_1()); 
            // InternalRosSystem.g:2017:2: ( rule__ServiceConnection__FromAssignment_6_1 )
            // InternalRosSystem.g:2017:3: rule__ServiceConnection__FromAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__FromAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getFromAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalRosSystem.g:2026:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2030:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalRosSystem.g:2031:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalRosSystem.g:2038:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2042:1: ( ( 'ComponentInterface' ) )
            // InternalRosSystem.g:2043:1: ( 'ComponentInterface' )
            {
            // InternalRosSystem.g:2043:1: ( 'ComponentInterface' )
            // InternalRosSystem.g:2044:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRosSystem.g:2053:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2057:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalRosSystem.g:2058:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2065:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2069:1: ( ( '{' ) )
            // InternalRosSystem.g:2070:1: ( '{' )
            {
            // InternalRosSystem.g:2070:1: ( '{' )
            // InternalRosSystem.g:2071:2: '{'
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
    // InternalRosSystem.g:2080:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2084:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalRosSystem.g:2085:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2092:1: rule__ComponentInterface__Group__2__Impl : ( ( rule__ComponentInterface__Group_2__0 )? ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2096:1: ( ( ( rule__ComponentInterface__Group_2__0 )? ) )
            // InternalRosSystem.g:2097:1: ( ( rule__ComponentInterface__Group_2__0 )? )
            {
            // InternalRosSystem.g:2097:1: ( ( rule__ComponentInterface__Group_2__0 )? )
            // InternalRosSystem.g:2098:2: ( rule__ComponentInterface__Group_2__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_2()); 
            // InternalRosSystem.g:2099:2: ( rule__ComponentInterface__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystem.g:2099:3: rule__ComponentInterface__Group_2__0
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
    // InternalRosSystem.g:2107:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2111:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalRosSystem.g:2112:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2119:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__Group_3__0 )? ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2123:1: ( ( ( rule__ComponentInterface__Group_3__0 )? ) )
            // InternalRosSystem.g:2124:1: ( ( rule__ComponentInterface__Group_3__0 )? )
            {
            // InternalRosSystem.g:2124:1: ( ( rule__ComponentInterface__Group_3__0 )? )
            // InternalRosSystem.g:2125:2: ( rule__ComponentInterface__Group_3__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_3()); 
            // InternalRosSystem.g:2126:2: ( rule__ComponentInterface__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:2126:3: rule__ComponentInterface__Group_3__0
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
    // InternalRosSystem.g:2134:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2138:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalRosSystem.g:2139:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2146:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2150:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalRosSystem.g:2151:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalRosSystem.g:2151:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalRosSystem.g:2152:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalRosSystem.g:2153:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystem.g:2153:3: rule__ComponentInterface__Group_4__0
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
    // InternalRosSystem.g:2161:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2165:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalRosSystem.g:2166:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2173:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2177:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalRosSystem.g:2178:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalRosSystem.g:2178:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalRosSystem.g:2179:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalRosSystem.g:2180:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystem.g:2180:3: rule__ComponentInterface__Group_5__0
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
    // InternalRosSystem.g:2188:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2192:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalRosSystem.g:2193:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2200:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2204:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalRosSystem.g:2205:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalRosSystem.g:2205:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalRosSystem.g:2206:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalRosSystem.g:2207:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosSystem.g:2207:3: rule__ComponentInterface__Group_6__0
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
    // InternalRosSystem.g:2215:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2219:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalRosSystem.g:2220:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2227:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2231:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalRosSystem.g:2232:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalRosSystem.g:2232:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalRosSystem.g:2233:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalRosSystem.g:2234:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystem.g:2234:3: rule__ComponentInterface__Group_7__0
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
    // InternalRosSystem.g:2242:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2246:1: ( rule__ComponentInterface__Group__8__Impl )
            // InternalRosSystem.g:2247:2: rule__ComponentInterface__Group__8__Impl
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
    // InternalRosSystem.g:2253:1: rule__ComponentInterface__Group__8__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2257:1: ( ( '}' ) )
            // InternalRosSystem.g:2258:1: ( '}' )
            {
            // InternalRosSystem.g:2258:1: ( '}' )
            // InternalRosSystem.g:2259:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2269:1: rule__ComponentInterface__Group_2__0 : rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1 ;
    public final void rule__ComponentInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2273:1: ( rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1 )
            // InternalRosSystem.g:2274:2: rule__ComponentInterface__Group_2__0__Impl rule__ComponentInterface__Group_2__1
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
    // InternalRosSystem.g:2281:1: rule__ComponentInterface__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2285:1: ( ( 'name' ) )
            // InternalRosSystem.g:2286:1: ( 'name' )
            {
            // InternalRosSystem.g:2286:1: ( 'name' )
            // InternalRosSystem.g:2287:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRosSystem.g:2296:1: rule__ComponentInterface__Group_2__1 : rule__ComponentInterface__Group_2__1__Impl ;
    public final void rule__ComponentInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2300:1: ( rule__ComponentInterface__Group_2__1__Impl )
            // InternalRosSystem.g:2301:2: rule__ComponentInterface__Group_2__1__Impl
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
    // InternalRosSystem.g:2307:1: rule__ComponentInterface__Group_2__1__Impl : ( ( rule__ComponentInterface__NameAssignment_2_1 ) ) ;
    public final void rule__ComponentInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2311:1: ( ( ( rule__ComponentInterface__NameAssignment_2_1 ) ) )
            // InternalRosSystem.g:2312:1: ( ( rule__ComponentInterface__NameAssignment_2_1 ) )
            {
            // InternalRosSystem.g:2312:1: ( ( rule__ComponentInterface__NameAssignment_2_1 ) )
            // InternalRosSystem.g:2313:2: ( rule__ComponentInterface__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2_1()); 
            // InternalRosSystem.g:2314:2: ( rule__ComponentInterface__NameAssignment_2_1 )
            // InternalRosSystem.g:2314:3: rule__ComponentInterface__NameAssignment_2_1
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
    // InternalRosSystem.g:2323:1: rule__ComponentInterface__Group_3__0 : rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1 ;
    public final void rule__ComponentInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2327:1: ( rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1 )
            // InternalRosSystem.g:2328:2: rule__ComponentInterface__Group_3__0__Impl rule__ComponentInterface__Group_3__1
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
    // InternalRosSystem.g:2335:1: rule__ComponentInterface__Group_3__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2339:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:2340:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:2340:1: ( 'NameSpace' )
            // InternalRosSystem.g:2341:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRosSystem.g:2350:1: rule__ComponentInterface__Group_3__1 : rule__ComponentInterface__Group_3__1__Impl ;
    public final void rule__ComponentInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2354:1: ( rule__ComponentInterface__Group_3__1__Impl )
            // InternalRosSystem.g:2355:2: rule__ComponentInterface__Group_3__1__Impl
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
    // InternalRosSystem.g:2361:1: rule__ComponentInterface__Group_3__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2365:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) ) )
            // InternalRosSystem.g:2366:1: ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) )
            {
            // InternalRosSystem.g:2366:1: ( ( rule__ComponentInterface__NameSpaceAssignment_3_1 ) )
            // InternalRosSystem.g:2367:2: ( rule__ComponentInterface__NameSpaceAssignment_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_3_1()); 
            // InternalRosSystem.g:2368:2: ( rule__ComponentInterface__NameSpaceAssignment_3_1 )
            // InternalRosSystem.g:2368:3: rule__ComponentInterface__NameSpaceAssignment_3_1
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
    // InternalRosSystem.g:2377:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2381:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalRosSystem.g:2382:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
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
    // InternalRosSystem.g:2389:1: rule__ComponentInterface__Group_4__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2393:1: ( ( 'RosPublishers' ) )
            // InternalRosSystem.g:2394:1: ( 'RosPublishers' )
            {
            // InternalRosSystem.g:2394:1: ( 'RosPublishers' )
            // InternalRosSystem.g:2395:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRosSystem.g:2404:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2 ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2408:1: ( rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2 )
            // InternalRosSystem.g:2409:2: rule__ComponentInterface__Group_4__1__Impl rule__ComponentInterface__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:2416:1: rule__ComponentInterface__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2420:1: ( ( '{' ) )
            // InternalRosSystem.g:2421:1: ( '{' )
            {
            // InternalRosSystem.g:2421:1: ( '{' )
            // InternalRosSystem.g:2422:2: '{'
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
    // InternalRosSystem.g:2431:1: rule__ComponentInterface__Group_4__2 : rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3 ;
    public final void rule__ComponentInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2435:1: ( rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3 )
            // InternalRosSystem.g:2436:2: rule__ComponentInterface__Group_4__2__Impl rule__ComponentInterface__Group_4__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2443:1: rule__ComponentInterface__Group_4__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) ) ;
    public final void rule__ComponentInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2447:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) ) )
            // InternalRosSystem.g:2448:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) )
            {
            // InternalRosSystem.g:2448:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_2 ) )
            // InternalRosSystem.g:2449:2: ( rule__ComponentInterface__RospublisherAssignment_4_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_2()); 
            // InternalRosSystem.g:2450:2: ( rule__ComponentInterface__RospublisherAssignment_4_2 )
            // InternalRosSystem.g:2450:3: rule__ComponentInterface__RospublisherAssignment_4_2
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
    // InternalRosSystem.g:2458:1: rule__ComponentInterface__Group_4__3 : rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4 ;
    public final void rule__ComponentInterface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2462:1: ( rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4 )
            // InternalRosSystem.g:2463:2: rule__ComponentInterface__Group_4__3__Impl rule__ComponentInterface__Group_4__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2470:1: rule__ComponentInterface__Group_4__3__Impl : ( ( rule__ComponentInterface__Group_4_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2474:1: ( ( ( rule__ComponentInterface__Group_4_3__0 )* ) )
            // InternalRosSystem.g:2475:1: ( ( rule__ComponentInterface__Group_4_3__0 )* )
            {
            // InternalRosSystem.g:2475:1: ( ( rule__ComponentInterface__Group_4_3__0 )* )
            // InternalRosSystem.g:2476:2: ( rule__ComponentInterface__Group_4_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4_3()); 
            // InternalRosSystem.g:2477:2: ( rule__ComponentInterface__Group_4_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRosSystem.g:2477:3: rule__ComponentInterface__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRosSystem.g:2485:1: rule__ComponentInterface__Group_4__4 : rule__ComponentInterface__Group_4__4__Impl ;
    public final void rule__ComponentInterface__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2489:1: ( rule__ComponentInterface__Group_4__4__Impl )
            // InternalRosSystem.g:2490:2: rule__ComponentInterface__Group_4__4__Impl
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
    // InternalRosSystem.g:2496:1: rule__ComponentInterface__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2500:1: ( ( '}' ) )
            // InternalRosSystem.g:2501:1: ( '}' )
            {
            // InternalRosSystem.g:2501:1: ( '}' )
            // InternalRosSystem.g:2502:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2512:1: rule__ComponentInterface__Group_4_3__0 : rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1 ;
    public final void rule__ComponentInterface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2516:1: ( rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1 )
            // InternalRosSystem.g:2517:2: rule__ComponentInterface__Group_4_3__0__Impl rule__ComponentInterface__Group_4_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:2524:1: rule__ComponentInterface__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2528:1: ( ( ',' ) )
            // InternalRosSystem.g:2529:1: ( ',' )
            {
            // InternalRosSystem.g:2529:1: ( ',' )
            // InternalRosSystem.g:2530:2: ','
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
    // InternalRosSystem.g:2539:1: rule__ComponentInterface__Group_4_3__1 : rule__ComponentInterface__Group_4_3__1__Impl ;
    public final void rule__ComponentInterface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2543:1: ( rule__ComponentInterface__Group_4_3__1__Impl )
            // InternalRosSystem.g:2544:2: rule__ComponentInterface__Group_4_3__1__Impl
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
    // InternalRosSystem.g:2550:1: rule__ComponentInterface__Group_4_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2554:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) ) )
            // InternalRosSystem.g:2555:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) )
            {
            // InternalRosSystem.g:2555:1: ( ( rule__ComponentInterface__RospublisherAssignment_4_3_1 ) )
            // InternalRosSystem.g:2556:2: ( rule__ComponentInterface__RospublisherAssignment_4_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_3_1()); 
            // InternalRosSystem.g:2557:2: ( rule__ComponentInterface__RospublisherAssignment_4_3_1 )
            // InternalRosSystem.g:2557:3: rule__ComponentInterface__RospublisherAssignment_4_3_1
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
    // InternalRosSystem.g:2566:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2570:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalRosSystem.g:2571:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
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
    // InternalRosSystem.g:2578:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2582:1: ( ( 'RosSubscribers' ) )
            // InternalRosSystem.g:2583:1: ( 'RosSubscribers' )
            {
            // InternalRosSystem.g:2583:1: ( 'RosSubscribers' )
            // InternalRosSystem.g:2584:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRosSystem.g:2593:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2597:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalRosSystem.g:2598:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2605:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2609:1: ( ( '{' ) )
            // InternalRosSystem.g:2610:1: ( '{' )
            {
            // InternalRosSystem.g:2610:1: ( '{' )
            // InternalRosSystem.g:2611:2: '{'
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
    // InternalRosSystem.g:2620:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2624:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalRosSystem.g:2625:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2632:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2636:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) ) )
            // InternalRosSystem.g:2637:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) )
            {
            // InternalRosSystem.g:2637:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_2 ) )
            // InternalRosSystem.g:2638:2: ( rule__ComponentInterface__RossubscriberAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_2()); 
            // InternalRosSystem.g:2639:2: ( rule__ComponentInterface__RossubscriberAssignment_5_2 )
            // InternalRosSystem.g:2639:3: rule__ComponentInterface__RossubscriberAssignment_5_2
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
    // InternalRosSystem.g:2647:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2651:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalRosSystem.g:2652:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2659:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2663:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalRosSystem.g:2664:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:2664:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalRosSystem.g:2665:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalRosSystem.g:2666:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystem.g:2666:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRosSystem.g:2674:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2678:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalRosSystem.g:2679:2: rule__ComponentInterface__Group_5__4__Impl
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
    // InternalRosSystem.g:2685:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2689:1: ( ( '}' ) )
            // InternalRosSystem.g:2690:1: ( '}' )
            {
            // InternalRosSystem.g:2690:1: ( '}' )
            // InternalRosSystem.g:2691:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2701:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2705:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalRosSystem.g:2706:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2713:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2717:1: ( ( ',' ) )
            // InternalRosSystem.g:2718:1: ( ',' )
            {
            // InternalRosSystem.g:2718:1: ( ',' )
            // InternalRosSystem.g:2719:2: ','
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
    // InternalRosSystem.g:2728:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2732:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalRosSystem.g:2733:2: rule__ComponentInterface__Group_5_3__1__Impl
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
    // InternalRosSystem.g:2739:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2743:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:2744:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:2744:1: ( ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 ) )
            // InternalRosSystem.g:2745:2: ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_3_1()); 
            // InternalRosSystem.g:2746:2: ( rule__ComponentInterface__RossubscriberAssignment_5_3_1 )
            // InternalRosSystem.g:2746:3: rule__ComponentInterface__RossubscriberAssignment_5_3_1
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
    // InternalRosSystem.g:2755:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2759:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalRosSystem.g:2760:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
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
    // InternalRosSystem.g:2767:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2771:1: ( ( 'RosSrvServers' ) )
            // InternalRosSystem.g:2772:1: ( 'RosSrvServers' )
            {
            // InternalRosSystem.g:2772:1: ( 'RosSrvServers' )
            // InternalRosSystem.g:2773:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRosSystem.g:2782:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2786:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalRosSystem.g:2787:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:2794:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2798:1: ( ( '{' ) )
            // InternalRosSystem.g:2799:1: ( '{' )
            {
            // InternalRosSystem.g:2799:1: ( '{' )
            // InternalRosSystem.g:2800:2: '{'
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
    // InternalRosSystem.g:2809:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2813:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalRosSystem.g:2814:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2821:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2825:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) ) )
            // InternalRosSystem.g:2826:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) )
            {
            // InternalRosSystem.g:2826:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2 ) )
            // InternalRosSystem.g:2827:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2()); 
            // InternalRosSystem.g:2828:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2 )
            // InternalRosSystem.g:2828:3: rule__ComponentInterface__RosserviceserverAssignment_6_2
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
    // InternalRosSystem.g:2836:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2840:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalRosSystem.g:2841:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2848:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2852:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalRosSystem.g:2853:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:2853:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalRosSystem.g:2854:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalRosSystem.g:2855:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystem.g:2855:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRosSystem.g:2863:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2867:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalRosSystem.g:2868:2: rule__ComponentInterface__Group_6__4__Impl
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
    // InternalRosSystem.g:2874:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2878:1: ( ( '}' ) )
            // InternalRosSystem.g:2879:1: ( '}' )
            {
            // InternalRosSystem.g:2879:1: ( '}' )
            // InternalRosSystem.g:2880:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2890:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2894:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalRosSystem.g:2895:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:2902:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2906:1: ( ( ',' ) )
            // InternalRosSystem.g:2907:1: ( ',' )
            {
            // InternalRosSystem.g:2907:1: ( ',' )
            // InternalRosSystem.g:2908:2: ','
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
    // InternalRosSystem.g:2917:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2921:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalRosSystem.g:2922:2: rule__ComponentInterface__Group_6_3__1__Impl
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
    // InternalRosSystem.g:2928:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2932:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:2933:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:2933:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 ) )
            // InternalRosSystem.g:2934:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_3_1()); 
            // InternalRosSystem.g:2935:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_3_1 )
            // InternalRosSystem.g:2935:3: rule__ComponentInterface__RosserviceserverAssignment_6_3_1
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
    // InternalRosSystem.g:2944:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2948:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalRosSystem.g:2949:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
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
    // InternalRosSystem.g:2956:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2960:1: ( ( 'RosSrvClients' ) )
            // InternalRosSystem.g:2961:1: ( 'RosSrvClients' )
            {
            // InternalRosSystem.g:2961:1: ( 'RosSrvClients' )
            // InternalRosSystem.g:2962:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRosSystem.g:2971:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2975:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalRosSystem.g:2976:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:2983:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2987:1: ( ( '{' ) )
            // InternalRosSystem.g:2988:1: ( '{' )
            {
            // InternalRosSystem.g:2988:1: ( '{' )
            // InternalRosSystem.g:2989:2: '{'
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
    // InternalRosSystem.g:2998:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3002:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalRosSystem.g:3003:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:3010:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3014:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) ) )
            // InternalRosSystem.g:3015:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) )
            {
            // InternalRosSystem.g:3015:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_2 ) )
            // InternalRosSystem.g:3016:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_2()); 
            // InternalRosSystem.g:3017:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_2 )
            // InternalRosSystem.g:3017:3: rule__ComponentInterface__RosserviceclientAssignment_7_2
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
    // InternalRosSystem.g:3025:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3029:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalRosSystem.g:3030:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:3037:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3041:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalRosSystem.g:3042:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalRosSystem.g:3042:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalRosSystem.g:3043:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalRosSystem.g:3044:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRosSystem.g:3044:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRosSystem.g:3052:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3056:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalRosSystem.g:3057:2: rule__ComponentInterface__Group_7__4__Impl
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
    // InternalRosSystem.g:3063:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3067:1: ( ( '}' ) )
            // InternalRosSystem.g:3068:1: ( '}' )
            {
            // InternalRosSystem.g:3068:1: ( '}' )
            // InternalRosSystem.g:3069:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3079:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3083:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalRosSystem.g:3084:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3091:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3095:1: ( ( ',' ) )
            // InternalRosSystem.g:3096:1: ( ',' )
            {
            // InternalRosSystem.g:3096:1: ( ',' )
            // InternalRosSystem.g:3097:2: ','
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
    // InternalRosSystem.g:3106:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3110:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalRosSystem.g:3111:2: rule__ComponentInterface__Group_7_3__1__Impl
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
    // InternalRosSystem.g:3117:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3121:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) ) )
            // InternalRosSystem.g:3122:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) )
            {
            // InternalRosSystem.g:3122:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 ) )
            // InternalRosSystem.g:3123:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_3_1()); 
            // InternalRosSystem.g:3124:2: ( rule__ComponentInterface__RosserviceclientAssignment_7_3_1 )
            // InternalRosSystem.g:3124:3: rule__ComponentInterface__RosserviceclientAssignment_7_3_1
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
    // InternalRosSystem.g:3133:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3137:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalRosSystem.g:3138:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3145:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3149:1: ( ( () ) )
            // InternalRosSystem.g:3150:1: ( () )
            {
            // InternalRosSystem.g:3150:1: ( () )
            // InternalRosSystem.g:3151:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalRosSystem.g:3152:2: ()
            // InternalRosSystem.g:3152:3: 
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
    // InternalRosSystem.g:3160:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3164:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalRosSystem.g:3165:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3172:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3176:1: ( ( 'RosPublisher' ) )
            // InternalRosSystem.g:3177:1: ( 'RosPublisher' )
            {
            // InternalRosSystem.g:3177:1: ( 'RosPublisher' )
            // InternalRosSystem.g:3178:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRosSystem.g:3187:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3191:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalRosSystem.g:3192:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3199:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3203:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalRosSystem.g:3204:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:3204:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalRosSystem.g:3205:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:3206:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystem.g:3206:3: rule__RosPublisher__NameAssignment_2
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
    // InternalRosSystem.g:3214:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3218:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalRosSystem.g:3219:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:3226:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3230:1: ( ( '{' ) )
            // InternalRosSystem.g:3231:1: ( '{' )
            {
            // InternalRosSystem.g:3231:1: ( '{' )
            // InternalRosSystem.g:3232:2: '{'
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
    // InternalRosSystem.g:3241:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3245:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalRosSystem.g:3246:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:3253:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3257:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalRosSystem.g:3258:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalRosSystem.g:3258:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalRosSystem.g:3259:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalRosSystem.g:3260:2: ( rule__RosPublisher__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:3260:3: rule__RosPublisher__Group_4__0
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
    // InternalRosSystem.g:3268:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3272:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalRosSystem.g:3273:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
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
    // InternalRosSystem.g:3280:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3284:1: ( ( 'RefPublisher' ) )
            // InternalRosSystem.g:3285:1: ( 'RefPublisher' )
            {
            // InternalRosSystem.g:3285:1: ( 'RefPublisher' )
            // InternalRosSystem.g:3286:2: 'RefPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRosSystem.g:3295:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3299:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalRosSystem.g:3300:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:3307:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3311:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalRosSystem.g:3312:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalRosSystem.g:3312:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalRosSystem.g:3313:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalRosSystem.g:3314:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalRosSystem.g:3314:3: rule__RosPublisher__PublisherAssignment_6
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
    // InternalRosSystem.g:3322:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3326:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalRosSystem.g:3327:2: rule__RosPublisher__Group__7__Impl
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
    // InternalRosSystem.g:3333:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3337:1: ( ( '}' ) )
            // InternalRosSystem.g:3338:1: ( '}' )
            {
            // InternalRosSystem.g:3338:1: ( '}' )
            // InternalRosSystem.g:3339:2: '}'
            {
             before(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3349:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3353:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalRosSystem.g:3354:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
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
    // InternalRosSystem.g:3361:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3365:1: ( ( 'ns' ) )
            // InternalRosSystem.g:3366:1: ( 'ns' )
            {
            // InternalRosSystem.g:3366:1: ( 'ns' )
            // InternalRosSystem.g:3367:2: 'ns'
            {
             before(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRosSystem.g:3376:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3380:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalRosSystem.g:3381:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalRosSystem.g:3387:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3391:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:3392:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3392:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalRosSystem.g:3393:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:3394:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalRosSystem.g:3394:3: rule__RosPublisher__NsAssignment_4_1
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
    // InternalRosSystem.g:3403:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3407:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalRosSystem.g:3408:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:3415:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3419:1: ( ( () ) )
            // InternalRosSystem.g:3420:1: ( () )
            {
            // InternalRosSystem.g:3420:1: ( () )
            // InternalRosSystem.g:3421:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalRosSystem.g:3422:2: ()
            // InternalRosSystem.g:3422:3: 
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
    // InternalRosSystem.g:3430:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3434:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalRosSystem.g:3435:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3442:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3446:1: ( ( 'RosSubscriber' ) )
            // InternalRosSystem.g:3447:1: ( 'RosSubscriber' )
            {
            // InternalRosSystem.g:3447:1: ( 'RosSubscriber' )
            // InternalRosSystem.g:3448:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRosSystem.g:3457:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3461:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalRosSystem.g:3462:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3469:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3473:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalRosSystem.g:3474:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:3474:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalRosSystem.g:3475:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:3476:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystem.g:3476:3: rule__RosSubscriber__NameAssignment_2
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
    // InternalRosSystem.g:3484:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3488:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalRosSystem.g:3489:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRosSystem.g:3496:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3500:1: ( ( '{' ) )
            // InternalRosSystem.g:3501:1: ( '{' )
            {
            // InternalRosSystem.g:3501:1: ( '{' )
            // InternalRosSystem.g:3502:2: '{'
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
    // InternalRosSystem.g:3511:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3515:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalRosSystem.g:3516:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalRosSystem.g:3523:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3527:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalRosSystem.g:3528:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalRosSystem.g:3528:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalRosSystem.g:3529:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalRosSystem.g:3530:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystem.g:3530:3: rule__RosSubscriber__Group_4__0
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
    // InternalRosSystem.g:3538:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3542:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalRosSystem.g:3543:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
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
    // InternalRosSystem.g:3550:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3554:1: ( ( 'RefSubscriber' ) )
            // InternalRosSystem.g:3555:1: ( 'RefSubscriber' )
            {
            // InternalRosSystem.g:3555:1: ( 'RefSubscriber' )
            // InternalRosSystem.g:3556:2: 'RefSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:3565:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3569:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalRosSystem.g:3570:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:3577:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3581:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalRosSystem.g:3582:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalRosSystem.g:3582:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalRosSystem.g:3583:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalRosSystem.g:3584:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalRosSystem.g:3584:3: rule__RosSubscriber__SubscriberAssignment_6
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
    // InternalRosSystem.g:3592:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3596:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalRosSystem.g:3597:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalRosSystem.g:3603:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3607:1: ( ( '}' ) )
            // InternalRosSystem.g:3608:1: ( '}' )
            {
            // InternalRosSystem.g:3608:1: ( '}' )
            // InternalRosSystem.g:3609:2: '}'
            {
             before(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3619:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3623:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalRosSystem.g:3624:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
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
    // InternalRosSystem.g:3631:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3635:1: ( ( 'ns' ) )
            // InternalRosSystem.g:3636:1: ( 'ns' )
            {
            // InternalRosSystem.g:3636:1: ( 'ns' )
            // InternalRosSystem.g:3637:2: 'ns'
            {
             before(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRosSystem.g:3646:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3650:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalRosSystem.g:3651:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalRosSystem.g:3657:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3661:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:3662:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3662:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalRosSystem.g:3663:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:3664:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalRosSystem.g:3664:3: rule__RosSubscriber__NsAssignment_4_1
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
    // InternalRosSystem.g:3673:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3677:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalRosSystem.g:3678:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:3685:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3689:1: ( ( () ) )
            // InternalRosSystem.g:3690:1: ( () )
            {
            // InternalRosSystem.g:3690:1: ( () )
            // InternalRosSystem.g:3691:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalRosSystem.g:3692:2: ()
            // InternalRosSystem.g:3692:3: 
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
    // InternalRosSystem.g:3700:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3704:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalRosSystem.g:3705:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3712:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3716:1: ( ( 'RosServiceServer' ) )
            // InternalRosSystem.g:3717:1: ( 'RosServiceServer' )
            {
            // InternalRosSystem.g:3717:1: ( 'RosServiceServer' )
            // InternalRosSystem.g:3718:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRosSystem.g:3727:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3731:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalRosSystem.g:3732:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3739:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3743:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalRosSystem.g:3744:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:3744:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalRosSystem.g:3745:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:3746:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystem.g:3746:3: rule__RosServiceServer__NameAssignment_2
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
    // InternalRosSystem.g:3754:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3758:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalRosSystem.g:3759:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystem.g:3766:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3770:1: ( ( '{' ) )
            // InternalRosSystem.g:3771:1: ( '{' )
            {
            // InternalRosSystem.g:3771:1: ( '{' )
            // InternalRosSystem.g:3772:2: '{'
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
    // InternalRosSystem.g:3781:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3785:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalRosSystem.g:3786:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystem.g:3793:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3797:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalRosSystem.g:3798:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalRosSystem.g:3798:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalRosSystem.g:3799:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalRosSystem.g:3800:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:3800:3: rule__RosServiceServer__Group_4__0
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
    // InternalRosSystem.g:3808:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3812:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalRosSystem.g:3813:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
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
    // InternalRosSystem.g:3820:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3824:1: ( ( 'RefServer' ) )
            // InternalRosSystem.g:3825:1: ( 'RefServer' )
            {
            // InternalRosSystem.g:3825:1: ( 'RefServer' )
            // InternalRosSystem.g:3826:2: 'RefServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRosSystem.g:3835:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3839:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalRosSystem.g:3840:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:3847:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3851:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalRosSystem.g:3852:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalRosSystem.g:3852:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalRosSystem.g:3853:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalRosSystem.g:3854:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalRosSystem.g:3854:3: rule__RosServiceServer__SrvserverAssignment_6
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
    // InternalRosSystem.g:3862:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3866:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalRosSystem.g:3867:2: rule__RosServiceServer__Group__7__Impl
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
    // InternalRosSystem.g:3873:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3877:1: ( ( '}' ) )
            // InternalRosSystem.g:3878:1: ( '}' )
            {
            // InternalRosSystem.g:3878:1: ( '}' )
            // InternalRosSystem.g:3879:2: '}'
            {
             before(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3889:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3893:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalRosSystem.g:3894:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
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
    // InternalRosSystem.g:3901:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3905:1: ( ( 'ns' ) )
            // InternalRosSystem.g:3906:1: ( 'ns' )
            {
            // InternalRosSystem.g:3906:1: ( 'ns' )
            // InternalRosSystem.g:3907:2: 'ns'
            {
             before(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRosSystem.g:3916:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3920:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalRosSystem.g:3921:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalRosSystem.g:3927:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3931:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:3932:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3932:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalRosSystem.g:3933:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:3934:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalRosSystem.g:3934:3: rule__RosServiceServer__NsAssignment_4_1
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
    // InternalRosSystem.g:3943:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3947:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalRosSystem.g:3948:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3955:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3959:1: ( ( () ) )
            // InternalRosSystem.g:3960:1: ( () )
            {
            // InternalRosSystem.g:3960:1: ( () )
            // InternalRosSystem.g:3961:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalRosSystem.g:3962:2: ()
            // InternalRosSystem.g:3962:3: 
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
    // InternalRosSystem.g:3970:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3974:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalRosSystem.g:3975:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3982:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3986:1: ( ( 'RosServiceClient' ) )
            // InternalRosSystem.g:3987:1: ( 'RosServiceClient' )
            {
            // InternalRosSystem.g:3987:1: ( 'RosServiceClient' )
            // InternalRosSystem.g:3988:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRosSystem.g:3997:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4001:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalRosSystem.g:4002:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:4009:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4013:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalRosSystem.g:4014:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:4014:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalRosSystem.g:4015:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:4016:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:4016:3: rule__RosServiceClient__NameAssignment_2
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
    // InternalRosSystem.g:4024:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4028:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalRosSystem.g:4029:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalRosSystem.g:4036:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4040:1: ( ( '{' ) )
            // InternalRosSystem.g:4041:1: ( '{' )
            {
            // InternalRosSystem.g:4041:1: ( '{' )
            // InternalRosSystem.g:4042:2: '{'
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
    // InternalRosSystem.g:4051:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4055:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalRosSystem.g:4056:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalRosSystem.g:4063:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4067:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalRosSystem.g:4068:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalRosSystem.g:4068:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalRosSystem.g:4069:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalRosSystem.g:4070:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystem.g:4070:3: rule__RosServiceClient__Group_4__0
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
    // InternalRosSystem.g:4078:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4082:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalRosSystem.g:4083:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
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
    // InternalRosSystem.g:4090:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4094:1: ( ( 'RefClient' ) )
            // InternalRosSystem.g:4095:1: ( 'RefClient' )
            {
            // InternalRosSystem.g:4095:1: ( 'RefClient' )
            // InternalRosSystem.g:4096:2: 'RefClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRosSystem.g:4105:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4109:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalRosSystem.g:4110:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:4117:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4121:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalRosSystem.g:4122:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalRosSystem.g:4122:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalRosSystem.g:4123:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalRosSystem.g:4124:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalRosSystem.g:4124:3: rule__RosServiceClient__SrvclientAssignment_6
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
    // InternalRosSystem.g:4132:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4136:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalRosSystem.g:4137:2: rule__RosServiceClient__Group__7__Impl
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
    // InternalRosSystem.g:4143:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4147:1: ( ( '}' ) )
            // InternalRosSystem.g:4148:1: ( '}' )
            {
            // InternalRosSystem.g:4148:1: ( '}' )
            // InternalRosSystem.g:4149:2: '}'
            {
             before(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:4159:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4163:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalRosSystem.g:4164:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
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
    // InternalRosSystem.g:4171:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4175:1: ( ( 'ns' ) )
            // InternalRosSystem.g:4176:1: ( 'ns' )
            {
            // InternalRosSystem.g:4176:1: ( 'ns' )
            // InternalRosSystem.g:4177:2: 'ns'
            {
             before(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRosSystem.g:4186:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4190:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalRosSystem.g:4191:2: rule__RosServiceClient__Group_4__1__Impl
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
    // InternalRosSystem.g:4197:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4201:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:4202:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:4202:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalRosSystem.g:4203:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:4204:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalRosSystem.g:4204:3: rule__RosServiceClient__NsAssignment_4_1
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


    // $ANTLR start "rule__RosSystem__NameAssignment_4"
    // InternalRosSystem.g:4213:1: rule__RosSystem__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4217:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4218:2: ( ruleEString )
            {
            // InternalRosSystem.g:4218:2: ( ruleEString )
            // InternalRosSystem.g:4219:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__NameAssignment_4"


    // $ANTLR start "rule__RosSystem__RosComponentAssignment_5_2_0"
    // InternalRosSystem.g:4228:1: rule__RosSystem__RosComponentAssignment_5_2_0 : ( ruleComponentInterface ) ;
    public final void rule__RosSystem__RosComponentAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4232:1: ( ( ruleComponentInterface ) )
            // InternalRosSystem.g:4233:2: ( ruleComponentInterface )
            {
            // InternalRosSystem.g:4233:2: ( ruleComponentInterface )
            // InternalRosSystem.g:4234:3: ruleComponentInterface
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosComponentAssignment_5_2_0"


    // $ANTLR start "rule__RosSystem__RosComponentAssignment_5_2_1_1"
    // InternalRosSystem.g:4243:1: rule__RosSystem__RosComponentAssignment_5_2_1_1 : ( ruleComponentInterface ) ;
    public final void rule__RosSystem__RosComponentAssignment_5_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4247:1: ( ( ruleComponentInterface ) )
            // InternalRosSystem.g:4248:2: ( ruleComponentInterface )
            {
            // InternalRosSystem.g:4248:2: ( ruleComponentInterface )
            // InternalRosSystem.g:4249:3: ruleComponentInterface
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosComponentAssignment_5_2_1_1"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_6_2_0"
    // InternalRosSystem.g:4258:1: rule__RosSystem__TopicConnectionsAssignment_6_2_0 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4262:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:4263:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:4263:2: ( ruleTopicConnection )
            // InternalRosSystem.g:4264:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_6_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_6_2_0"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_6_2_1_1"
    // InternalRosSystem.g:4273:1: rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_6_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4277:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:4278:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:4278:2: ( ruleTopicConnection )
            // InternalRosSystem.g:4279:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_6_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_6_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_6_2_1_1"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_7_2_0"
    // InternalRosSystem.g:4288:1: rule__RosSystem__ServiceConnectionsAssignment_7_2_0 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4292:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:4293:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:4293:2: ( ruleServiceConnection )
            // InternalRosSystem.g:4294:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_7_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_7_2_0"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1"
    // InternalRosSystem.g:4303:1: rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4307:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:4308:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:4308:2: ( ruleServiceConnection )
            // InternalRosSystem.g:4309:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_7_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_7_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1"


    // $ANTLR start "rule__TopicConnection__TopicNameAssignment_1"
    // InternalRosSystem.g:4318:1: rule__TopicConnection__TopicNameAssignment_1 : ( ruleEString ) ;
    public final void rule__TopicConnection__TopicNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4322:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4323:2: ( ruleEString )
            {
            // InternalRosSystem.g:4323:2: ( ruleEString )
            // InternalRosSystem.g:4324:3: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__TopicNameAssignment_1"


    // $ANTLR start "rule__TopicConnection__FromAssignment_5"
    // InternalRosSystem.g:4333:1: rule__TopicConnection__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4337:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4338:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4338:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4339:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0()); 
            // InternalRosSystem.g:4340:3: ( ruleEString )
            // InternalRosSystem.g:4341:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__FromAssignment_5"


    // $ANTLR start "rule__TopicConnection__FromAssignment_6_1"
    // InternalRosSystem.g:4352:1: rule__TopicConnection__FromAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4356:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4357:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4357:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4358:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0()); 
            // InternalRosSystem.g:4359:3: ( ruleEString )
            // InternalRosSystem.g:4360:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__FromAssignment_6_1"


    // $ANTLR start "rule__TopicConnection__ToAssignment_10"
    // InternalRosSystem.g:4371:1: rule__TopicConnection__ToAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4375:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4376:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4376:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4377:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0()); 
            // InternalRosSystem.g:4378:3: ( ruleEString )
            // InternalRosSystem.g:4379:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__ToAssignment_10"


    // $ANTLR start "rule__TopicConnection__ToAssignment_11_1"
    // InternalRosSystem.g:4390:1: rule__TopicConnection__ToAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4394:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4395:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4395:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4396:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0()); 
            // InternalRosSystem.g:4397:3: ( ruleEString )
            // InternalRosSystem.g:4398:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__ToAssignment_11_1"


    // $ANTLR start "rule__ServiceConnection__ServiceNameAssignment_1"
    // InternalRosSystem.g:4409:1: rule__ServiceConnection__ServiceNameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServiceConnection__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4413:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4414:2: ( ruleEString )
            {
            // InternalRosSystem.g:4414:2: ( ruleEString )
            // InternalRosSystem.g:4415:3: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__ServiceNameAssignment_1"


    // $ANTLR start "rule__ServiceConnection__FromAssignment_5"
    // InternalRosSystem.g:4424:1: rule__ServiceConnection__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4428:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4429:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4429:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4430:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0()); 
            // InternalRosSystem.g:4431:3: ( ruleEString )
            // InternalRosSystem.g:4432:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__FromAssignment_5"


    // $ANTLR start "rule__ServiceConnection__FromAssignment_6_1"
    // InternalRosSystem.g:4443:1: rule__ServiceConnection__FromAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4447:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4448:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4448:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4449:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0()); 
            // InternalRosSystem.g:4450:3: ( ruleEString )
            // InternalRosSystem.g:4451:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__FromAssignment_6_1"


    // $ANTLR start "rule__ServiceConnection__ToAssignment_9"
    // InternalRosSystem.g:4462:1: rule__ServiceConnection__ToAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__ToAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4466:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4467:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4467:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4468:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0()); 
            // InternalRosSystem.g:4469:3: ( ruleEString )
            // InternalRosSystem.g:4470:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getToRosServiceClientEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getToRosServiceClientEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__ToAssignment_9"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_2_1"
    // InternalRosSystem.g:4481:1: rule__ComponentInterface__NameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4485:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4486:2: ( ruleEString )
            {
            // InternalRosSystem.g:4486:2: ( ruleEString )
            // InternalRosSystem.g:4487:3: ruleEString
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
    // InternalRosSystem.g:4496:1: rule__ComponentInterface__NameSpaceAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4500:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4501:2: ( ruleEString )
            {
            // InternalRosSystem.g:4501:2: ( ruleEString )
            // InternalRosSystem.g:4502:3: ruleEString
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
    // InternalRosSystem.g:4511:1: rule__ComponentInterface__RospublisherAssignment_4_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4515:1: ( ( ruleRosPublisher ) )
            // InternalRosSystem.g:4516:2: ( ruleRosPublisher )
            {
            // InternalRosSystem.g:4516:2: ( ruleRosPublisher )
            // InternalRosSystem.g:4517:3: ruleRosPublisher
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
    // InternalRosSystem.g:4526:1: rule__ComponentInterface__RospublisherAssignment_4_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4530:1: ( ( ruleRosPublisher ) )
            // InternalRosSystem.g:4531:2: ( ruleRosPublisher )
            {
            // InternalRosSystem.g:4531:2: ( ruleRosPublisher )
            // InternalRosSystem.g:4532:3: ruleRosPublisher
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
    // InternalRosSystem.g:4541:1: rule__ComponentInterface__RossubscriberAssignment_5_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4545:1: ( ( ruleRosSubscriber ) )
            // InternalRosSystem.g:4546:2: ( ruleRosSubscriber )
            {
            // InternalRosSystem.g:4546:2: ( ruleRosSubscriber )
            // InternalRosSystem.g:4547:3: ruleRosSubscriber
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
    // InternalRosSystem.g:4556:1: rule__ComponentInterface__RossubscriberAssignment_5_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4560:1: ( ( ruleRosSubscriber ) )
            // InternalRosSystem.g:4561:2: ( ruleRosSubscriber )
            {
            // InternalRosSystem.g:4561:2: ( ruleRosSubscriber )
            // InternalRosSystem.g:4562:3: ruleRosSubscriber
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
    // InternalRosSystem.g:4571:1: rule__ComponentInterface__RosserviceserverAssignment_6_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4575:1: ( ( ruleRosServiceServer ) )
            // InternalRosSystem.g:4576:2: ( ruleRosServiceServer )
            {
            // InternalRosSystem.g:4576:2: ( ruleRosServiceServer )
            // InternalRosSystem.g:4577:3: ruleRosServiceServer
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
    // InternalRosSystem.g:4586:1: rule__ComponentInterface__RosserviceserverAssignment_6_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4590:1: ( ( ruleRosServiceServer ) )
            // InternalRosSystem.g:4591:2: ( ruleRosServiceServer )
            {
            // InternalRosSystem.g:4591:2: ( ruleRosServiceServer )
            // InternalRosSystem.g:4592:3: ruleRosServiceServer
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
    // InternalRosSystem.g:4601:1: rule__ComponentInterface__RosserviceclientAssignment_7_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4605:1: ( ( ruleRosServiceClient ) )
            // InternalRosSystem.g:4606:2: ( ruleRosServiceClient )
            {
            // InternalRosSystem.g:4606:2: ( ruleRosServiceClient )
            // InternalRosSystem.g:4607:3: ruleRosServiceClient
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
    // InternalRosSystem.g:4616:1: rule__ComponentInterface__RosserviceclientAssignment_7_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4620:1: ( ( ruleRosServiceClient ) )
            // InternalRosSystem.g:4621:2: ( ruleRosServiceClient )
            {
            // InternalRosSystem.g:4621:2: ( ruleRosServiceClient )
            // InternalRosSystem.g:4622:3: ruleRosServiceClient
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
    // InternalRosSystem.g:4631:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4635:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4636:2: ( ruleEString )
            {
            // InternalRosSystem.g:4636:2: ( ruleEString )
            // InternalRosSystem.g:4637:3: ruleEString
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
    // InternalRosSystem.g:4646:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4650:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4651:2: ( ruleEString )
            {
            // InternalRosSystem.g:4651:2: ( ruleEString )
            // InternalRosSystem.g:4652:3: ruleEString
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
    // InternalRosSystem.g:4661:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4665:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4666:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4666:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4667:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalRosSystem.g:4668:3: ( ruleEString )
            // InternalRosSystem.g:4669:4: ruleEString
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
    // InternalRosSystem.g:4680:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4684:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4685:2: ( ruleEString )
            {
            // InternalRosSystem.g:4685:2: ( ruleEString )
            // InternalRosSystem.g:4686:3: ruleEString
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
    // InternalRosSystem.g:4695:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4699:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4700:2: ( ruleEString )
            {
            // InternalRosSystem.g:4700:2: ( ruleEString )
            // InternalRosSystem.g:4701:3: ruleEString
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
    // InternalRosSystem.g:4710:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4714:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4715:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4715:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4716:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalRosSystem.g:4717:3: ( ruleEString )
            // InternalRosSystem.g:4718:4: ruleEString
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
    // InternalRosSystem.g:4729:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4733:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4734:2: ( ruleEString )
            {
            // InternalRosSystem.g:4734:2: ( ruleEString )
            // InternalRosSystem.g:4735:3: ruleEString
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
    // InternalRosSystem.g:4744:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4748:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4749:2: ( ruleEString )
            {
            // InternalRosSystem.g:4749:2: ( ruleEString )
            // InternalRosSystem.g:4750:3: ruleEString
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
    // InternalRosSystem.g:4759:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4763:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4764:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4764:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4765:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalRosSystem.g:4766:3: ( ruleEString )
            // InternalRosSystem.g:4767:4: ruleEString
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
    // InternalRosSystem.g:4778:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4782:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4783:2: ( ruleEString )
            {
            // InternalRosSystem.g:4783:2: ( ruleEString )
            // InternalRosSystem.g:4784:3: ruleEString
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
    // InternalRosSystem.g:4793:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4797:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4798:2: ( ruleEString )
            {
            // InternalRosSystem.g:4798:2: ( ruleEString )
            // InternalRosSystem.g:4799:3: ruleEString
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
    // InternalRosSystem.g:4808:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4812:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4813:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4813:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4814:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalRosSystem.g:4815:3: ( ruleEString )
            // InternalRosSystem.g:4816:4: ruleEString
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000018C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010400000000L});

}