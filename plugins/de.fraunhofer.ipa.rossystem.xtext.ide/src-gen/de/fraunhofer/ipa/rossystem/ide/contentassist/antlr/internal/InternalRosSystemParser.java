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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'}'", "'RosComponents'", "'('", "')'", "','", "'TopicConnections'", "'ServiceConnections'", "'ActionConnections'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'ActionConnection'", "'ComponentInterface'", "'name'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleActionConnection"
    // InternalRosSystem.g:128:1: entryRuleActionConnection : ruleActionConnection EOF ;
    public final void entryRuleActionConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:129:1: ( ruleActionConnection EOF )
            // InternalRosSystem.g:130:1: ruleActionConnection EOF
            {
             before(grammarAccess.getActionConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleActionConnection();

            state._fsp--;

             after(grammarAccess.getActionConnectionRule()); 
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
    // $ANTLR end "entryRuleActionConnection"


    // $ANTLR start "ruleActionConnection"
    // InternalRosSystem.g:137:1: ruleActionConnection : ( ( rule__ActionConnection__Group__0 ) ) ;
    public final void ruleActionConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:141:2: ( ( ( rule__ActionConnection__Group__0 ) ) )
            // InternalRosSystem.g:142:2: ( ( rule__ActionConnection__Group__0 ) )
            {
            // InternalRosSystem.g:142:2: ( ( rule__ActionConnection__Group__0 ) )
            // InternalRosSystem.g:143:3: ( rule__ActionConnection__Group__0 )
            {
             before(grammarAccess.getActionConnectionAccess().getGroup()); 
            // InternalRosSystem.g:144:3: ( rule__ActionConnection__Group__0 )
            // InternalRosSystem.g:144:4: rule__ActionConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystem.g:154:1: ( ruleEString EOF )
            // InternalRosSystem.g:155:1: ruleEString EOF
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
    // InternalRosSystem.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystem.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystem.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystem.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosSystem.g:169:3: ( rule__EString__Alternatives )
            // InternalRosSystem.g:169:4: rule__EString__Alternatives
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
    // InternalRosSystem.g:178:1: entryRuleComponentInterface : ruleComponentInterface EOF ;
    public final void entryRuleComponentInterface() throws RecognitionException {
        try {
            // InternalRosSystem.g:179:1: ( ruleComponentInterface EOF )
            // InternalRosSystem.g:180:1: ruleComponentInterface EOF
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
    // InternalRosSystem.g:187:1: ruleComponentInterface : ( ( rule__ComponentInterface__Group__0 ) ) ;
    public final void ruleComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:191:2: ( ( ( rule__ComponentInterface__Group__0 ) ) )
            // InternalRosSystem.g:192:2: ( ( rule__ComponentInterface__Group__0 ) )
            {
            // InternalRosSystem.g:192:2: ( ( rule__ComponentInterface__Group__0 ) )
            // InternalRosSystem.g:193:3: ( rule__ComponentInterface__Group__0 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup()); 
            // InternalRosSystem.g:194:3: ( rule__ComponentInterface__Group__0 )
            // InternalRosSystem.g:194:4: rule__ComponentInterface__Group__0
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
    // InternalRosSystem.g:203:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalRosSystem.g:204:1: ( ruleRosPublisher EOF )
            // InternalRosSystem.g:205:1: ruleRosPublisher EOF
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
    // InternalRosSystem.g:212:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:216:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalRosSystem.g:217:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalRosSystem.g:217:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalRosSystem.g:218:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalRosSystem.g:219:3: ( rule__RosPublisher__Group__0 )
            // InternalRosSystem.g:219:4: rule__RosPublisher__Group__0
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
    // InternalRosSystem.g:228:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalRosSystem.g:229:1: ( ruleRosSubscriber EOF )
            // InternalRosSystem.g:230:1: ruleRosSubscriber EOF
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
    // InternalRosSystem.g:237:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:241:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalRosSystem.g:242:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalRosSystem.g:242:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalRosSystem.g:243:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalRosSystem.g:244:3: ( rule__RosSubscriber__Group__0 )
            // InternalRosSystem.g:244:4: rule__RosSubscriber__Group__0
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
    // InternalRosSystem.g:253:1: entryRuleRosServiceServer : ruleRosServiceServer EOF ;
    public final void entryRuleRosServiceServer() throws RecognitionException {
        try {
            // InternalRosSystem.g:254:1: ( ruleRosServiceServer EOF )
            // InternalRosSystem.g:255:1: ruleRosServiceServer EOF
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
    // InternalRosSystem.g:262:1: ruleRosServiceServer : ( ( rule__RosServiceServer__Group__0 ) ) ;
    public final void ruleRosServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:266:2: ( ( ( rule__RosServiceServer__Group__0 ) ) )
            // InternalRosSystem.g:267:2: ( ( rule__RosServiceServer__Group__0 ) )
            {
            // InternalRosSystem.g:267:2: ( ( rule__RosServiceServer__Group__0 ) )
            // InternalRosSystem.g:268:3: ( rule__RosServiceServer__Group__0 )
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup()); 
            // InternalRosSystem.g:269:3: ( rule__RosServiceServer__Group__0 )
            // InternalRosSystem.g:269:4: rule__RosServiceServer__Group__0
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
    // InternalRosSystem.g:278:1: entryRuleRosServiceClient : ruleRosServiceClient EOF ;
    public final void entryRuleRosServiceClient() throws RecognitionException {
        try {
            // InternalRosSystem.g:279:1: ( ruleRosServiceClient EOF )
            // InternalRosSystem.g:280:1: ruleRosServiceClient EOF
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
    // InternalRosSystem.g:287:1: ruleRosServiceClient : ( ( rule__RosServiceClient__Group__0 ) ) ;
    public final void ruleRosServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:291:2: ( ( ( rule__RosServiceClient__Group__0 ) ) )
            // InternalRosSystem.g:292:2: ( ( rule__RosServiceClient__Group__0 ) )
            {
            // InternalRosSystem.g:292:2: ( ( rule__RosServiceClient__Group__0 ) )
            // InternalRosSystem.g:293:3: ( rule__RosServiceClient__Group__0 )
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup()); 
            // InternalRosSystem.g:294:3: ( rule__RosServiceClient__Group__0 )
            // InternalRosSystem.g:294:4: rule__RosServiceClient__Group__0
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


    // $ANTLR start "entryRuleRosActionServer"
    // InternalRosSystem.g:303:1: entryRuleRosActionServer : ruleRosActionServer EOF ;
    public final void entryRuleRosActionServer() throws RecognitionException {
        try {
            // InternalRosSystem.g:304:1: ( ruleRosActionServer EOF )
            // InternalRosSystem.g:305:1: ruleRosActionServer EOF
            {
             before(grammarAccess.getRosActionServerRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getRosActionServerRule()); 
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
    // $ANTLR end "entryRuleRosActionServer"


    // $ANTLR start "ruleRosActionServer"
    // InternalRosSystem.g:312:1: ruleRosActionServer : ( ( rule__RosActionServer__Group__0 ) ) ;
    public final void ruleRosActionServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:316:2: ( ( ( rule__RosActionServer__Group__0 ) ) )
            // InternalRosSystem.g:317:2: ( ( rule__RosActionServer__Group__0 ) )
            {
            // InternalRosSystem.g:317:2: ( ( rule__RosActionServer__Group__0 ) )
            // InternalRosSystem.g:318:3: ( rule__RosActionServer__Group__0 )
            {
             before(grammarAccess.getRosActionServerAccess().getGroup()); 
            // InternalRosSystem.g:319:3: ( rule__RosActionServer__Group__0 )
            // InternalRosSystem.g:319:4: rule__RosActionServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionServer"


    // $ANTLR start "entryRuleRosActionClient"
    // InternalRosSystem.g:328:1: entryRuleRosActionClient : ruleRosActionClient EOF ;
    public final void entryRuleRosActionClient() throws RecognitionException {
        try {
            // InternalRosSystem.g:329:1: ( ruleRosActionClient EOF )
            // InternalRosSystem.g:330:1: ruleRosActionClient EOF
            {
             before(grammarAccess.getRosActionClientRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getRosActionClientRule()); 
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
    // $ANTLR end "entryRuleRosActionClient"


    // $ANTLR start "ruleRosActionClient"
    // InternalRosSystem.g:337:1: ruleRosActionClient : ( ( rule__RosActionClient__Group__0 ) ) ;
    public final void ruleRosActionClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:341:2: ( ( ( rule__RosActionClient__Group__0 ) ) )
            // InternalRosSystem.g:342:2: ( ( rule__RosActionClient__Group__0 ) )
            {
            // InternalRosSystem.g:342:2: ( ( rule__RosActionClient__Group__0 ) )
            // InternalRosSystem.g:343:3: ( rule__RosActionClient__Group__0 )
            {
             before(grammarAccess.getRosActionClientAccess().getGroup()); 
            // InternalRosSystem.g:344:3: ( rule__RosActionClient__Group__0 )
            // InternalRosSystem.g:344:4: rule__RosActionClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionClient"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystem.g:352:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:356:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRosSystem.g:357:2: ( RULE_STRING )
                    {
                    // InternalRosSystem.g:357:2: ( RULE_STRING )
                    // InternalRosSystem.g:358:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:363:2: ( RULE_ID )
                    {
                    // InternalRosSystem.g:363:2: ( RULE_ID )
                    // InternalRosSystem.g:364:3: RULE_ID
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
    // InternalRosSystem.g:373:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:377:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystem.g:378:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
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
    // InternalRosSystem.g:385:1: rule__RosSystem__Group__0__Impl : ( () ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:389:1: ( ( () ) )
            // InternalRosSystem.g:390:1: ( () )
            {
            // InternalRosSystem.g:390:1: ( () )
            // InternalRosSystem.g:391:2: ()
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 
            // InternalRosSystem.g:392:2: ()
            // InternalRosSystem.g:392:3: 
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
    // InternalRosSystem.g:400:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:404:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystem.g:405:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
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
    // InternalRosSystem.g:412:1: rule__RosSystem__Group__1__Impl : ( 'RosSystem' ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:416:1: ( ( 'RosSystem' ) )
            // InternalRosSystem.g:417:1: ( 'RosSystem' )
            {
            // InternalRosSystem.g:417:1: ( 'RosSystem' )
            // InternalRosSystem.g:418:2: 'RosSystem'
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
    // InternalRosSystem.g:427:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:431:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystem.g:432:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
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
    // InternalRosSystem.g:439:1: rule__RosSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:443:1: ( ( '{' ) )
            // InternalRosSystem.g:444:1: ( '{' )
            {
            // InternalRosSystem.g:444:1: ( '{' )
            // InternalRosSystem.g:445:2: '{'
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
    // InternalRosSystem.g:454:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:458:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystem.g:459:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
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
    // InternalRosSystem.g:466:1: rule__RosSystem__Group__3__Impl : ( 'Name' ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:470:1: ( ( 'Name' ) )
            // InternalRosSystem.g:471:1: ( 'Name' )
            {
            // InternalRosSystem.g:471:1: ( 'Name' )
            // InternalRosSystem.g:472:2: 'Name'
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
    // InternalRosSystem.g:481:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:485:1: ( rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 )
            // InternalRosSystem.g:486:2: rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5
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
    // InternalRosSystem.g:493:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__NameAssignment_4 ) ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:497:1: ( ( ( rule__RosSystem__NameAssignment_4 ) ) )
            // InternalRosSystem.g:498:1: ( ( rule__RosSystem__NameAssignment_4 ) )
            {
            // InternalRosSystem.g:498:1: ( ( rule__RosSystem__NameAssignment_4 ) )
            // InternalRosSystem.g:499:2: ( rule__RosSystem__NameAssignment_4 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_4()); 
            // InternalRosSystem.g:500:2: ( rule__RosSystem__NameAssignment_4 )
            // InternalRosSystem.g:500:3: rule__RosSystem__NameAssignment_4
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
    // InternalRosSystem.g:508:1: rule__RosSystem__Group__5 : rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 ;
    public final void rule__RosSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:512:1: ( rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 )
            // InternalRosSystem.g:513:2: rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6
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
    // InternalRosSystem.g:520:1: rule__RosSystem__Group__5__Impl : ( ( rule__RosSystem__Group_5__0 )? ) ;
    public final void rule__RosSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:524:1: ( ( ( rule__RosSystem__Group_5__0 )? ) )
            // InternalRosSystem.g:525:1: ( ( rule__RosSystem__Group_5__0 )? )
            {
            // InternalRosSystem.g:525:1: ( ( rule__RosSystem__Group_5__0 )? )
            // InternalRosSystem.g:526:2: ( rule__RosSystem__Group_5__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5()); 
            // InternalRosSystem.g:527:2: ( rule__RosSystem__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystem.g:527:3: rule__RosSystem__Group_5__0
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
    // InternalRosSystem.g:535:1: rule__RosSystem__Group__6 : rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 ;
    public final void rule__RosSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:539:1: ( rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 )
            // InternalRosSystem.g:540:2: rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7
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
    // InternalRosSystem.g:547:1: rule__RosSystem__Group__6__Impl : ( ( rule__RosSystem__Group_6__0 )? ) ;
    public final void rule__RosSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:551:1: ( ( ( rule__RosSystem__Group_6__0 )? ) )
            // InternalRosSystem.g:552:1: ( ( rule__RosSystem__Group_6__0 )? )
            {
            // InternalRosSystem.g:552:1: ( ( rule__RosSystem__Group_6__0 )? )
            // InternalRosSystem.g:553:2: ( rule__RosSystem__Group_6__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6()); 
            // InternalRosSystem.g:554:2: ( rule__RosSystem__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:554:3: rule__RosSystem__Group_6__0
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
    // InternalRosSystem.g:562:1: rule__RosSystem__Group__7 : rule__RosSystem__Group__7__Impl rule__RosSystem__Group__8 ;
    public final void rule__RosSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:566:1: ( rule__RosSystem__Group__7__Impl rule__RosSystem__Group__8 )
            // InternalRosSystem.g:567:2: rule__RosSystem__Group__7__Impl rule__RosSystem__Group__8
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
    // InternalRosSystem.g:574:1: rule__RosSystem__Group__7__Impl : ( ( rule__RosSystem__Group_7__0 )? ) ;
    public final void rule__RosSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:578:1: ( ( ( rule__RosSystem__Group_7__0 )? ) )
            // InternalRosSystem.g:579:1: ( ( rule__RosSystem__Group_7__0 )? )
            {
            // InternalRosSystem.g:579:1: ( ( rule__RosSystem__Group_7__0 )? )
            // InternalRosSystem.g:580:2: ( rule__RosSystem__Group_7__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_7()); 
            // InternalRosSystem.g:581:2: ( rule__RosSystem__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:581:3: rule__RosSystem__Group_7__0
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
    // InternalRosSystem.g:589:1: rule__RosSystem__Group__8 : rule__RosSystem__Group__8__Impl rule__RosSystem__Group__9 ;
    public final void rule__RosSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:593:1: ( rule__RosSystem__Group__8__Impl rule__RosSystem__Group__9 )
            // InternalRosSystem.g:594:2: rule__RosSystem__Group__8__Impl rule__RosSystem__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__9();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:601:1: rule__RosSystem__Group__8__Impl : ( ( rule__RosSystem__Group_8__0 )? ) ;
    public final void rule__RosSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:605:1: ( ( ( rule__RosSystem__Group_8__0 )? ) )
            // InternalRosSystem.g:606:1: ( ( rule__RosSystem__Group_8__0 )? )
            {
            // InternalRosSystem.g:606:1: ( ( rule__RosSystem__Group_8__0 )? )
            // InternalRosSystem.g:607:2: ( rule__RosSystem__Group_8__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_8()); 
            // InternalRosSystem.g:608:2: ( rule__RosSystem__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:608:3: rule__RosSystem__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosSystem__Group__9"
    // InternalRosSystem.g:616:1: rule__RosSystem__Group__9 : rule__RosSystem__Group__9__Impl ;
    public final void rule__RosSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:620:1: ( rule__RosSystem__Group__9__Impl )
            // InternalRosSystem.g:621:2: rule__RosSystem__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__9"


    // $ANTLR start "rule__RosSystem__Group__9__Impl"
    // InternalRosSystem.g:627:1: rule__RosSystem__Group__9__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:631:1: ( ( '}' ) )
            // InternalRosSystem.g:632:1: ( '}' )
            {
            // InternalRosSystem.g:632:1: ( '}' )
            // InternalRosSystem.g:633:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__9__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__0"
    // InternalRosSystem.g:643:1: rule__RosSystem__Group_5__0 : rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 ;
    public final void rule__RosSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:647:1: ( rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 )
            // InternalRosSystem.g:648:2: rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1
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
    // InternalRosSystem.g:655:1: rule__RosSystem__Group_5__0__Impl : ( 'RosComponents' ) ;
    public final void rule__RosSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:659:1: ( ( 'RosComponents' ) )
            // InternalRosSystem.g:660:1: ( 'RosComponents' )
            {
            // InternalRosSystem.g:660:1: ( 'RosComponents' )
            // InternalRosSystem.g:661:2: 'RosComponents'
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
    // InternalRosSystem.g:670:1: rule__RosSystem__Group_5__1 : rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 ;
    public final void rule__RosSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:674:1: ( rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 )
            // InternalRosSystem.g:675:2: rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2
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
    // InternalRosSystem.g:682:1: rule__RosSystem__Group_5__1__Impl : ( '(' ) ;
    public final void rule__RosSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:686:1: ( ( '(' ) )
            // InternalRosSystem.g:687:1: ( '(' )
            {
            // InternalRosSystem.g:687:1: ( '(' )
            // InternalRosSystem.g:688:2: '('
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
    // InternalRosSystem.g:697:1: rule__RosSystem__Group_5__2 : rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 ;
    public final void rule__RosSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:701:1: ( rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 )
            // InternalRosSystem.g:702:2: rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3
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
    // InternalRosSystem.g:709:1: rule__RosSystem__Group_5__2__Impl : ( ( rule__RosSystem__Group_5_2__0 )? ) ;
    public final void rule__RosSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:713:1: ( ( ( rule__RosSystem__Group_5_2__0 )? ) )
            // InternalRosSystem.g:714:1: ( ( rule__RosSystem__Group_5_2__0 )? )
            {
            // InternalRosSystem.g:714:1: ( ( rule__RosSystem__Group_5_2__0 )? )
            // InternalRosSystem.g:715:2: ( rule__RosSystem__Group_5_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_2()); 
            // InternalRosSystem.g:716:2: ( rule__RosSystem__Group_5_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRosSystem.g:716:3: rule__RosSystem__Group_5_2__0
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
    // InternalRosSystem.g:724:1: rule__RosSystem__Group_5__3 : rule__RosSystem__Group_5__3__Impl ;
    public final void rule__RosSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:728:1: ( rule__RosSystem__Group_5__3__Impl )
            // InternalRosSystem.g:729:2: rule__RosSystem__Group_5__3__Impl
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
    // InternalRosSystem.g:735:1: rule__RosSystem__Group_5__3__Impl : ( ')' ) ;
    public final void rule__RosSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:739:1: ( ( ')' ) )
            // InternalRosSystem.g:740:1: ( ')' )
            {
            // InternalRosSystem.g:740:1: ( ')' )
            // InternalRosSystem.g:741:2: ')'
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
    // InternalRosSystem.g:751:1: rule__RosSystem__Group_5_2__0 : rule__RosSystem__Group_5_2__0__Impl rule__RosSystem__Group_5_2__1 ;
    public final void rule__RosSystem__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:755:1: ( rule__RosSystem__Group_5_2__0__Impl rule__RosSystem__Group_5_2__1 )
            // InternalRosSystem.g:756:2: rule__RosSystem__Group_5_2__0__Impl rule__RosSystem__Group_5_2__1
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
    // InternalRosSystem.g:763:1: rule__RosSystem__Group_5_2__0__Impl : ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) ) ;
    public final void rule__RosSystem__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:767:1: ( ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) ) )
            // InternalRosSystem.g:768:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) )
            {
            // InternalRosSystem.g:768:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_0 ) )
            // InternalRosSystem.g:769:2: ( rule__RosSystem__RosComponentAssignment_5_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_2_0()); 
            // InternalRosSystem.g:770:2: ( rule__RosSystem__RosComponentAssignment_5_2_0 )
            // InternalRosSystem.g:770:3: rule__RosSystem__RosComponentAssignment_5_2_0
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
    // InternalRosSystem.g:778:1: rule__RosSystem__Group_5_2__1 : rule__RosSystem__Group_5_2__1__Impl ;
    public final void rule__RosSystem__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:782:1: ( rule__RosSystem__Group_5_2__1__Impl )
            // InternalRosSystem.g:783:2: rule__RosSystem__Group_5_2__1__Impl
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
    // InternalRosSystem.g:789:1: rule__RosSystem__Group_5_2__1__Impl : ( ( rule__RosSystem__Group_5_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:793:1: ( ( ( rule__RosSystem__Group_5_2_1__0 )* ) )
            // InternalRosSystem.g:794:1: ( ( rule__RosSystem__Group_5_2_1__0 )* )
            {
            // InternalRosSystem.g:794:1: ( ( rule__RosSystem__Group_5_2_1__0 )* )
            // InternalRosSystem.g:795:2: ( rule__RosSystem__Group_5_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_2_1()); 
            // InternalRosSystem.g:796:2: ( rule__RosSystem__Group_5_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRosSystem.g:796:3: rule__RosSystem__Group_5_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_5_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRosSystem.g:805:1: rule__RosSystem__Group_5_2_1__0 : rule__RosSystem__Group_5_2_1__0__Impl rule__RosSystem__Group_5_2_1__1 ;
    public final void rule__RosSystem__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:809:1: ( rule__RosSystem__Group_5_2_1__0__Impl rule__RosSystem__Group_5_2_1__1 )
            // InternalRosSystem.g:810:2: rule__RosSystem__Group_5_2_1__0__Impl rule__RosSystem__Group_5_2_1__1
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
    // InternalRosSystem.g:817:1: rule__RosSystem__Group_5_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:821:1: ( ( ',' ) )
            // InternalRosSystem.g:822:1: ( ',' )
            {
            // InternalRosSystem.g:822:1: ( ',' )
            // InternalRosSystem.g:823:2: ','
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
    // InternalRosSystem.g:832:1: rule__RosSystem__Group_5_2_1__1 : rule__RosSystem__Group_5_2_1__1__Impl ;
    public final void rule__RosSystem__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:836:1: ( rule__RosSystem__Group_5_2_1__1__Impl )
            // InternalRosSystem.g:837:2: rule__RosSystem__Group_5_2_1__1__Impl
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
    // InternalRosSystem.g:843:1: rule__RosSystem__Group_5_2_1__1__Impl : ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:847:1: ( ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) ) )
            // InternalRosSystem.g:848:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) )
            {
            // InternalRosSystem.g:848:1: ( ( rule__RosSystem__RosComponentAssignment_5_2_1_1 ) )
            // InternalRosSystem.g:849:2: ( rule__RosSystem__RosComponentAssignment_5_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_2_1_1()); 
            // InternalRosSystem.g:850:2: ( rule__RosSystem__RosComponentAssignment_5_2_1_1 )
            // InternalRosSystem.g:850:3: rule__RosSystem__RosComponentAssignment_5_2_1_1
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
    // InternalRosSystem.g:859:1: rule__RosSystem__Group_6__0 : rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 ;
    public final void rule__RosSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:863:1: ( rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 )
            // InternalRosSystem.g:864:2: rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1
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
    // InternalRosSystem.g:871:1: rule__RosSystem__Group_6__0__Impl : ( 'TopicConnections' ) ;
    public final void rule__RosSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:875:1: ( ( 'TopicConnections' ) )
            // InternalRosSystem.g:876:1: ( 'TopicConnections' )
            {
            // InternalRosSystem.g:876:1: ( 'TopicConnections' )
            // InternalRosSystem.g:877:2: 'TopicConnections'
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
    // InternalRosSystem.g:886:1: rule__RosSystem__Group_6__1 : rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 ;
    public final void rule__RosSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:890:1: ( rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 )
            // InternalRosSystem.g:891:2: rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2
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
    // InternalRosSystem.g:898:1: rule__RosSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:902:1: ( ( '{' ) )
            // InternalRosSystem.g:903:1: ( '{' )
            {
            // InternalRosSystem.g:903:1: ( '{' )
            // InternalRosSystem.g:904:2: '{'
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
    // InternalRosSystem.g:913:1: rule__RosSystem__Group_6__2 : rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 ;
    public final void rule__RosSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:917:1: ( rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 )
            // InternalRosSystem.g:918:2: rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3
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
    // InternalRosSystem.g:925:1: rule__RosSystem__Group_6__2__Impl : ( ( rule__RosSystem__Group_6_2__0 )? ) ;
    public final void rule__RosSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:929:1: ( ( ( rule__RosSystem__Group_6_2__0 )? ) )
            // InternalRosSystem.g:930:1: ( ( rule__RosSystem__Group_6_2__0 )? )
            {
            // InternalRosSystem.g:930:1: ( ( rule__RosSystem__Group_6_2__0 )? )
            // InternalRosSystem.g:931:2: ( rule__RosSystem__Group_6_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_2()); 
            // InternalRosSystem.g:932:2: ( rule__RosSystem__Group_6_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystem.g:932:3: rule__RosSystem__Group_6_2__0
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
    // InternalRosSystem.g:940:1: rule__RosSystem__Group_6__3 : rule__RosSystem__Group_6__3__Impl ;
    public final void rule__RosSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:944:1: ( rule__RosSystem__Group_6__3__Impl )
            // InternalRosSystem.g:945:2: rule__RosSystem__Group_6__3__Impl
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
    // InternalRosSystem.g:951:1: rule__RosSystem__Group_6__3__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:955:1: ( ( '}' ) )
            // InternalRosSystem.g:956:1: ( '}' )
            {
            // InternalRosSystem.g:956:1: ( '}' )
            // InternalRosSystem.g:957:2: '}'
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
    // InternalRosSystem.g:967:1: rule__RosSystem__Group_6_2__0 : rule__RosSystem__Group_6_2__0__Impl rule__RosSystem__Group_6_2__1 ;
    public final void rule__RosSystem__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:971:1: ( rule__RosSystem__Group_6_2__0__Impl rule__RosSystem__Group_6_2__1 )
            // InternalRosSystem.g:972:2: rule__RosSystem__Group_6_2__0__Impl rule__RosSystem__Group_6_2__1
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
    // InternalRosSystem.g:979:1: rule__RosSystem__Group_6_2__0__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) ) ;
    public final void rule__RosSystem__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:983:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) ) )
            // InternalRosSystem.g:984:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) )
            {
            // InternalRosSystem.g:984:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 ) )
            // InternalRosSystem.g:985:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_6_2_0()); 
            // InternalRosSystem.g:986:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_0 )
            // InternalRosSystem.g:986:3: rule__RosSystem__TopicConnectionsAssignment_6_2_0
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
    // InternalRosSystem.g:994:1: rule__RosSystem__Group_6_2__1 : rule__RosSystem__Group_6_2__1__Impl ;
    public final void rule__RosSystem__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:998:1: ( rule__RosSystem__Group_6_2__1__Impl )
            // InternalRosSystem.g:999:2: rule__RosSystem__Group_6_2__1__Impl
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
    // InternalRosSystem.g:1005:1: rule__RosSystem__Group_6_2__1__Impl : ( ( rule__RosSystem__Group_6_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1009:1: ( ( ( rule__RosSystem__Group_6_2_1__0 )* ) )
            // InternalRosSystem.g:1010:1: ( ( rule__RosSystem__Group_6_2_1__0 )* )
            {
            // InternalRosSystem.g:1010:1: ( ( rule__RosSystem__Group_6_2_1__0 )* )
            // InternalRosSystem.g:1011:2: ( rule__RosSystem__Group_6_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_2_1()); 
            // InternalRosSystem.g:1012:2: ( rule__RosSystem__Group_6_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRosSystem.g:1012:3: rule__RosSystem__Group_6_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_6_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRosSystem.g:1021:1: rule__RosSystem__Group_6_2_1__0 : rule__RosSystem__Group_6_2_1__0__Impl rule__RosSystem__Group_6_2_1__1 ;
    public final void rule__RosSystem__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1025:1: ( rule__RosSystem__Group_6_2_1__0__Impl rule__RosSystem__Group_6_2_1__1 )
            // InternalRosSystem.g:1026:2: rule__RosSystem__Group_6_2_1__0__Impl rule__RosSystem__Group_6_2_1__1
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
    // InternalRosSystem.g:1033:1: rule__RosSystem__Group_6_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1037:1: ( ( ',' ) )
            // InternalRosSystem.g:1038:1: ( ',' )
            {
            // InternalRosSystem.g:1038:1: ( ',' )
            // InternalRosSystem.g:1039:2: ','
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
    // InternalRosSystem.g:1048:1: rule__RosSystem__Group_6_2_1__1 : rule__RosSystem__Group_6_2_1__1__Impl ;
    public final void rule__RosSystem__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1052:1: ( rule__RosSystem__Group_6_2_1__1__Impl )
            // InternalRosSystem.g:1053:2: rule__RosSystem__Group_6_2_1__1__Impl
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
    // InternalRosSystem.g:1059:1: rule__RosSystem__Group_6_2_1__1__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1063:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) ) )
            // InternalRosSystem.g:1064:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) )
            {
            // InternalRosSystem.g:1064:1: ( ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 ) )
            // InternalRosSystem.g:1065:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_6_2_1_1()); 
            // InternalRosSystem.g:1066:2: ( rule__RosSystem__TopicConnectionsAssignment_6_2_1_1 )
            // InternalRosSystem.g:1066:3: rule__RosSystem__TopicConnectionsAssignment_6_2_1_1
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
    // InternalRosSystem.g:1075:1: rule__RosSystem__Group_7__0 : rule__RosSystem__Group_7__0__Impl rule__RosSystem__Group_7__1 ;
    public final void rule__RosSystem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1079:1: ( rule__RosSystem__Group_7__0__Impl rule__RosSystem__Group_7__1 )
            // InternalRosSystem.g:1080:2: rule__RosSystem__Group_7__0__Impl rule__RosSystem__Group_7__1
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
    // InternalRosSystem.g:1087:1: rule__RosSystem__Group_7__0__Impl : ( 'ServiceConnections' ) ;
    public final void rule__RosSystem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1091:1: ( ( 'ServiceConnections' ) )
            // InternalRosSystem.g:1092:1: ( 'ServiceConnections' )
            {
            // InternalRosSystem.g:1092:1: ( 'ServiceConnections' )
            // InternalRosSystem.g:1093:2: 'ServiceConnections'
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
    // InternalRosSystem.g:1102:1: rule__RosSystem__Group_7__1 : rule__RosSystem__Group_7__1__Impl rule__RosSystem__Group_7__2 ;
    public final void rule__RosSystem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1106:1: ( rule__RosSystem__Group_7__1__Impl rule__RosSystem__Group_7__2 )
            // InternalRosSystem.g:1107:2: rule__RosSystem__Group_7__1__Impl rule__RosSystem__Group_7__2
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
    // InternalRosSystem.g:1114:1: rule__RosSystem__Group_7__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1118:1: ( ( '{' ) )
            // InternalRosSystem.g:1119:1: ( '{' )
            {
            // InternalRosSystem.g:1119:1: ( '{' )
            // InternalRosSystem.g:1120:2: '{'
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
    // InternalRosSystem.g:1129:1: rule__RosSystem__Group_7__2 : rule__RosSystem__Group_7__2__Impl rule__RosSystem__Group_7__3 ;
    public final void rule__RosSystem__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1133:1: ( rule__RosSystem__Group_7__2__Impl rule__RosSystem__Group_7__3 )
            // InternalRosSystem.g:1134:2: rule__RosSystem__Group_7__2__Impl rule__RosSystem__Group_7__3
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
    // InternalRosSystem.g:1141:1: rule__RosSystem__Group_7__2__Impl : ( ( rule__RosSystem__Group_7_2__0 )? ) ;
    public final void rule__RosSystem__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1145:1: ( ( ( rule__RosSystem__Group_7_2__0 )? ) )
            // InternalRosSystem.g:1146:1: ( ( rule__RosSystem__Group_7_2__0 )? )
            {
            // InternalRosSystem.g:1146:1: ( ( rule__RosSystem__Group_7_2__0 )? )
            // InternalRosSystem.g:1147:2: ( rule__RosSystem__Group_7_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_7_2()); 
            // InternalRosSystem.g:1148:2: ( rule__RosSystem__Group_7_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosSystem.g:1148:3: rule__RosSystem__Group_7_2__0
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
    // InternalRosSystem.g:1156:1: rule__RosSystem__Group_7__3 : rule__RosSystem__Group_7__3__Impl ;
    public final void rule__RosSystem__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1160:1: ( rule__RosSystem__Group_7__3__Impl )
            // InternalRosSystem.g:1161:2: rule__RosSystem__Group_7__3__Impl
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
    // InternalRosSystem.g:1167:1: rule__RosSystem__Group_7__3__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1171:1: ( ( '}' ) )
            // InternalRosSystem.g:1172:1: ( '}' )
            {
            // InternalRosSystem.g:1172:1: ( '}' )
            // InternalRosSystem.g:1173:2: '}'
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
    // InternalRosSystem.g:1183:1: rule__RosSystem__Group_7_2__0 : rule__RosSystem__Group_7_2__0__Impl rule__RosSystem__Group_7_2__1 ;
    public final void rule__RosSystem__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1187:1: ( rule__RosSystem__Group_7_2__0__Impl rule__RosSystem__Group_7_2__1 )
            // InternalRosSystem.g:1188:2: rule__RosSystem__Group_7_2__0__Impl rule__RosSystem__Group_7_2__1
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
    // InternalRosSystem.g:1195:1: rule__RosSystem__Group_7_2__0__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) ) ;
    public final void rule__RosSystem__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1199:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) ) )
            // InternalRosSystem.g:1200:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) )
            {
            // InternalRosSystem.g:1200:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 ) )
            // InternalRosSystem.g:1201:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_7_2_0()); 
            // InternalRosSystem.g:1202:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_0 )
            // InternalRosSystem.g:1202:3: rule__RosSystem__ServiceConnectionsAssignment_7_2_0
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
    // InternalRosSystem.g:1210:1: rule__RosSystem__Group_7_2__1 : rule__RosSystem__Group_7_2__1__Impl ;
    public final void rule__RosSystem__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1214:1: ( rule__RosSystem__Group_7_2__1__Impl )
            // InternalRosSystem.g:1215:2: rule__RosSystem__Group_7_2__1__Impl
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
    // InternalRosSystem.g:1221:1: rule__RosSystem__Group_7_2__1__Impl : ( ( rule__RosSystem__Group_7_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1225:1: ( ( ( rule__RosSystem__Group_7_2_1__0 )* ) )
            // InternalRosSystem.g:1226:1: ( ( rule__RosSystem__Group_7_2_1__0 )* )
            {
            // InternalRosSystem.g:1226:1: ( ( rule__RosSystem__Group_7_2_1__0 )* )
            // InternalRosSystem.g:1227:2: ( rule__RosSystem__Group_7_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_7_2_1()); 
            // InternalRosSystem.g:1228:2: ( rule__RosSystem__Group_7_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystem.g:1228:3: rule__RosSystem__Group_7_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_7_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRosSystem.g:1237:1: rule__RosSystem__Group_7_2_1__0 : rule__RosSystem__Group_7_2_1__0__Impl rule__RosSystem__Group_7_2_1__1 ;
    public final void rule__RosSystem__Group_7_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1241:1: ( rule__RosSystem__Group_7_2_1__0__Impl rule__RosSystem__Group_7_2_1__1 )
            // InternalRosSystem.g:1242:2: rule__RosSystem__Group_7_2_1__0__Impl rule__RosSystem__Group_7_2_1__1
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
    // InternalRosSystem.g:1249:1: rule__RosSystem__Group_7_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_7_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1253:1: ( ( ',' ) )
            // InternalRosSystem.g:1254:1: ( ',' )
            {
            // InternalRosSystem.g:1254:1: ( ',' )
            // InternalRosSystem.g:1255:2: ','
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
    // InternalRosSystem.g:1264:1: rule__RosSystem__Group_7_2_1__1 : rule__RosSystem__Group_7_2_1__1__Impl ;
    public final void rule__RosSystem__Group_7_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1268:1: ( rule__RosSystem__Group_7_2_1__1__Impl )
            // InternalRosSystem.g:1269:2: rule__RosSystem__Group_7_2_1__1__Impl
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
    // InternalRosSystem.g:1275:1: rule__RosSystem__Group_7_2_1__1__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_7_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1279:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) ) )
            // InternalRosSystem.g:1280:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) )
            {
            // InternalRosSystem.g:1280:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 ) )
            // InternalRosSystem.g:1281:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_7_2_1_1()); 
            // InternalRosSystem.g:1282:2: ( rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1 )
            // InternalRosSystem.g:1282:3: rule__RosSystem__ServiceConnectionsAssignment_7_2_1_1
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


    // $ANTLR start "rule__RosSystem__Group_8__0"
    // InternalRosSystem.g:1291:1: rule__RosSystem__Group_8__0 : rule__RosSystem__Group_8__0__Impl rule__RosSystem__Group_8__1 ;
    public final void rule__RosSystem__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1295:1: ( rule__RosSystem__Group_8__0__Impl rule__RosSystem__Group_8__1 )
            // InternalRosSystem.g:1296:2: rule__RosSystem__Group_8__0__Impl rule__RosSystem__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__0"


    // $ANTLR start "rule__RosSystem__Group_8__0__Impl"
    // InternalRosSystem.g:1303:1: rule__RosSystem__Group_8__0__Impl : ( 'ActionConnections' ) ;
    public final void rule__RosSystem__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1307:1: ( ( 'ActionConnections' ) )
            // InternalRosSystem.g:1308:1: ( 'ActionConnections' )
            {
            // InternalRosSystem.g:1308:1: ( 'ActionConnections' )
            // InternalRosSystem.g:1309:2: 'ActionConnections'
            {
             before(grammarAccess.getRosSystemAccess().getActionConnectionsKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getActionConnectionsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_8__1"
    // InternalRosSystem.g:1318:1: rule__RosSystem__Group_8__1 : rule__RosSystem__Group_8__1__Impl rule__RosSystem__Group_8__2 ;
    public final void rule__RosSystem__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1322:1: ( rule__RosSystem__Group_8__1__Impl rule__RosSystem__Group_8__2 )
            // InternalRosSystem.g:1323:2: rule__RosSystem__Group_8__1__Impl rule__RosSystem__Group_8__2
            {
            pushFollow(FOLLOW_17);
            rule__RosSystem__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__1"


    // $ANTLR start "rule__RosSystem__Group_8__1__Impl"
    // InternalRosSystem.g:1330:1: rule__RosSystem__Group_8__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1334:1: ( ( '{' ) )
            // InternalRosSystem.g:1335:1: ( '{' )
            {
            // InternalRosSystem.g:1335:1: ( '{' )
            // InternalRosSystem.g:1336:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_8__2"
    // InternalRosSystem.g:1345:1: rule__RosSystem__Group_8__2 : rule__RosSystem__Group_8__2__Impl rule__RosSystem__Group_8__3 ;
    public final void rule__RosSystem__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1349:1: ( rule__RosSystem__Group_8__2__Impl rule__RosSystem__Group_8__3 )
            // InternalRosSystem.g:1350:2: rule__RosSystem__Group_8__2__Impl rule__RosSystem__Group_8__3
            {
            pushFollow(FOLLOW_17);
            rule__RosSystem__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__2"


    // $ANTLR start "rule__RosSystem__Group_8__2__Impl"
    // InternalRosSystem.g:1357:1: rule__RosSystem__Group_8__2__Impl : ( ( rule__RosSystem__Group_8_2__0 )? ) ;
    public final void rule__RosSystem__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1361:1: ( ( ( rule__RosSystem__Group_8_2__0 )? ) )
            // InternalRosSystem.g:1362:1: ( ( rule__RosSystem__Group_8_2__0 )? )
            {
            // InternalRosSystem.g:1362:1: ( ( rule__RosSystem__Group_8_2__0 )? )
            // InternalRosSystem.g:1363:2: ( rule__RosSystem__Group_8_2__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_8_2()); 
            // InternalRosSystem.g:1364:2: ( rule__RosSystem__Group_8_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystem.g:1364:3: rule__RosSystem__Group_8_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_8_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_8__3"
    // InternalRosSystem.g:1372:1: rule__RosSystem__Group_8__3 : rule__RosSystem__Group_8__3__Impl ;
    public final void rule__RosSystem__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1376:1: ( rule__RosSystem__Group_8__3__Impl )
            // InternalRosSystem.g:1377:2: rule__RosSystem__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__3"


    // $ANTLR start "rule__RosSystem__Group_8__3__Impl"
    // InternalRosSystem.g:1383:1: rule__RosSystem__Group_8__3__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1387:1: ( ( '}' ) )
            // InternalRosSystem.g:1388:1: ( '}' )
            {
            // InternalRosSystem.g:1388:1: ( '}' )
            // InternalRosSystem.g:1389:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_8_2__0"
    // InternalRosSystem.g:1399:1: rule__RosSystem__Group_8_2__0 : rule__RosSystem__Group_8_2__0__Impl rule__RosSystem__Group_8_2__1 ;
    public final void rule__RosSystem__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1403:1: ( rule__RosSystem__Group_8_2__0__Impl rule__RosSystem__Group_8_2__1 )
            // InternalRosSystem.g:1404:2: rule__RosSystem__Group_8_2__0__Impl rule__RosSystem__Group_8_2__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2__0"


    // $ANTLR start "rule__RosSystem__Group_8_2__0__Impl"
    // InternalRosSystem.g:1411:1: rule__RosSystem__Group_8_2__0__Impl : ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_0 ) ) ;
    public final void rule__RosSystem__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1415:1: ( ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_0 ) ) )
            // InternalRosSystem.g:1416:1: ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_0 ) )
            {
            // InternalRosSystem.g:1416:1: ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_0 ) )
            // InternalRosSystem.g:1417:2: ( rule__RosSystem__ActionConnectionsAssignment_8_2_0 )
            {
             before(grammarAccess.getRosSystemAccess().getActionConnectionsAssignment_8_2_0()); 
            // InternalRosSystem.g:1418:2: ( rule__RosSystem__ActionConnectionsAssignment_8_2_0 )
            // InternalRosSystem.g:1418:3: rule__RosSystem__ActionConnectionsAssignment_8_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ActionConnectionsAssignment_8_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getActionConnectionsAssignment_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_8_2__1"
    // InternalRosSystem.g:1426:1: rule__RosSystem__Group_8_2__1 : rule__RosSystem__Group_8_2__1__Impl ;
    public final void rule__RosSystem__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1430:1: ( rule__RosSystem__Group_8_2__1__Impl )
            // InternalRosSystem.g:1431:2: rule__RosSystem__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2__1"


    // $ANTLR start "rule__RosSystem__Group_8_2__1__Impl"
    // InternalRosSystem.g:1437:1: rule__RosSystem__Group_8_2__1__Impl : ( ( rule__RosSystem__Group_8_2_1__0 )* ) ;
    public final void rule__RosSystem__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1441:1: ( ( ( rule__RosSystem__Group_8_2_1__0 )* ) )
            // InternalRosSystem.g:1442:1: ( ( rule__RosSystem__Group_8_2_1__0 )* )
            {
            // InternalRosSystem.g:1442:1: ( ( rule__RosSystem__Group_8_2_1__0 )* )
            // InternalRosSystem.g:1443:2: ( rule__RosSystem__Group_8_2_1__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_8_2_1()); 
            // InternalRosSystem.g:1444:2: ( rule__RosSystem__Group_8_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRosSystem.g:1444:3: rule__RosSystem__Group_8_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RosSystem__Group_8_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_8_2_1__0"
    // InternalRosSystem.g:1453:1: rule__RosSystem__Group_8_2_1__0 : rule__RosSystem__Group_8_2_1__0__Impl rule__RosSystem__Group_8_2_1__1 ;
    public final void rule__RosSystem__Group_8_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1457:1: ( rule__RosSystem__Group_8_2_1__0__Impl rule__RosSystem__Group_8_2_1__1 )
            // InternalRosSystem.g:1458:2: rule__RosSystem__Group_8_2_1__0__Impl rule__RosSystem__Group_8_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__RosSystem__Group_8_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2_1__0"


    // $ANTLR start "rule__RosSystem__Group_8_2_1__0__Impl"
    // InternalRosSystem.g:1465:1: rule__RosSystem__Group_8_2_1__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_8_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1469:1: ( ( ',' ) )
            // InternalRosSystem.g:1470:1: ( ',' )
            {
            // InternalRosSystem.g:1470:1: ( ',' )
            // InternalRosSystem.g:1471:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_8_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2_1__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_8_2_1__1"
    // InternalRosSystem.g:1480:1: rule__RosSystem__Group_8_2_1__1 : rule__RosSystem__Group_8_2_1__1__Impl ;
    public final void rule__RosSystem__Group_8_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1484:1: ( rule__RosSystem__Group_8_2_1__1__Impl )
            // InternalRosSystem.g:1485:2: rule__RosSystem__Group_8_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_8_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2_1__1"


    // $ANTLR start "rule__RosSystem__Group_8_2_1__1__Impl"
    // InternalRosSystem.g:1491:1: rule__RosSystem__Group_8_2_1__1__Impl : ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_1_1 ) ) ;
    public final void rule__RosSystem__Group_8_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1495:1: ( ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_1_1 ) ) )
            // InternalRosSystem.g:1496:1: ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_1_1 ) )
            {
            // InternalRosSystem.g:1496:1: ( ( rule__RosSystem__ActionConnectionsAssignment_8_2_1_1 ) )
            // InternalRosSystem.g:1497:2: ( rule__RosSystem__ActionConnectionsAssignment_8_2_1_1 )
            {
             before(grammarAccess.getRosSystemAccess().getActionConnectionsAssignment_8_2_1_1()); 
            // InternalRosSystem.g:1498:2: ( rule__RosSystem__ActionConnectionsAssignment_8_2_1_1 )
            // InternalRosSystem.g:1498:3: rule__RosSystem__ActionConnectionsAssignment_8_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ActionConnectionsAssignment_8_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getActionConnectionsAssignment_8_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_8_2_1__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__0"
    // InternalRosSystem.g:1507:1: rule__TopicConnection__Group__0 : rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 ;
    public final void rule__TopicConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1511:1: ( rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 )
            // InternalRosSystem.g:1512:2: rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1
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
    // InternalRosSystem.g:1519:1: rule__TopicConnection__Group__0__Impl : ( 'TopicConnection' ) ;
    public final void rule__TopicConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1523:1: ( ( 'TopicConnection' ) )
            // InternalRosSystem.g:1524:1: ( 'TopicConnection' )
            {
            // InternalRosSystem.g:1524:1: ( 'TopicConnection' )
            // InternalRosSystem.g:1525:2: 'TopicConnection'
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRosSystem.g:1534:1: rule__TopicConnection__Group__1 : rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 ;
    public final void rule__TopicConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1538:1: ( rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 )
            // InternalRosSystem.g:1539:2: rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2
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
    // InternalRosSystem.g:1546:1: rule__TopicConnection__Group__1__Impl : ( ( rule__TopicConnection__TopicNameAssignment_1 ) ) ;
    public final void rule__TopicConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1550:1: ( ( ( rule__TopicConnection__TopicNameAssignment_1 ) ) )
            // InternalRosSystem.g:1551:1: ( ( rule__TopicConnection__TopicNameAssignment_1 ) )
            {
            // InternalRosSystem.g:1551:1: ( ( rule__TopicConnection__TopicNameAssignment_1 ) )
            // InternalRosSystem.g:1552:2: ( rule__TopicConnection__TopicNameAssignment_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicNameAssignment_1()); 
            // InternalRosSystem.g:1553:2: ( rule__TopicConnection__TopicNameAssignment_1 )
            // InternalRosSystem.g:1553:3: rule__TopicConnection__TopicNameAssignment_1
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
    // InternalRosSystem.g:1561:1: rule__TopicConnection__Group__2 : rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 ;
    public final void rule__TopicConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1565:1: ( rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 )
            // InternalRosSystem.g:1566:2: rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:1573:1: rule__TopicConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1577:1: ( ( '{' ) )
            // InternalRosSystem.g:1578:1: ( '{' )
            {
            // InternalRosSystem.g:1578:1: ( '{' )
            // InternalRosSystem.g:1579:2: '{'
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
    // InternalRosSystem.g:1588:1: rule__TopicConnection__Group__3 : rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 ;
    public final void rule__TopicConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1592:1: ( rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 )
            // InternalRosSystem.g:1593:2: rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4
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
    // InternalRosSystem.g:1600:1: rule__TopicConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__TopicConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1604:1: ( ( 'From' ) )
            // InternalRosSystem.g:1605:1: ( 'From' )
            {
            // InternalRosSystem.g:1605:1: ( 'From' )
            // InternalRosSystem.g:1606:2: 'From'
            {
             before(grammarAccess.getTopicConnectionAccess().getFromKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRosSystem.g:1615:1: rule__TopicConnection__Group__4 : rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 ;
    public final void rule__TopicConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1619:1: ( rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 )
            // InternalRosSystem.g:1620:2: rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5
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
    // InternalRosSystem.g:1627:1: rule__TopicConnection__Group__4__Impl : ( '(' ) ;
    public final void rule__TopicConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1631:1: ( ( '(' ) )
            // InternalRosSystem.g:1632:1: ( '(' )
            {
            // InternalRosSystem.g:1632:1: ( '(' )
            // InternalRosSystem.g:1633:2: '('
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
    // InternalRosSystem.g:1642:1: rule__TopicConnection__Group__5 : rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 ;
    public final void rule__TopicConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1646:1: ( rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 )
            // InternalRosSystem.g:1647:2: rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:1654:1: rule__TopicConnection__Group__5__Impl : ( ( rule__TopicConnection__FromAssignment_5 ) ) ;
    public final void rule__TopicConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1658:1: ( ( ( rule__TopicConnection__FromAssignment_5 ) ) )
            // InternalRosSystem.g:1659:1: ( ( rule__TopicConnection__FromAssignment_5 ) )
            {
            // InternalRosSystem.g:1659:1: ( ( rule__TopicConnection__FromAssignment_5 ) )
            // InternalRosSystem.g:1660:2: ( rule__TopicConnection__FromAssignment_5 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_5()); 
            // InternalRosSystem.g:1661:2: ( rule__TopicConnection__FromAssignment_5 )
            // InternalRosSystem.g:1661:3: rule__TopicConnection__FromAssignment_5
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
    // InternalRosSystem.g:1669:1: rule__TopicConnection__Group__6 : rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7 ;
    public final void rule__TopicConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1673:1: ( rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7 )
            // InternalRosSystem.g:1674:2: rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:1681:1: rule__TopicConnection__Group__6__Impl : ( ( rule__TopicConnection__Group_6__0 )* ) ;
    public final void rule__TopicConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1685:1: ( ( ( rule__TopicConnection__Group_6__0 )* ) )
            // InternalRosSystem.g:1686:1: ( ( rule__TopicConnection__Group_6__0 )* )
            {
            // InternalRosSystem.g:1686:1: ( ( rule__TopicConnection__Group_6__0 )* )
            // InternalRosSystem.g:1687:2: ( rule__TopicConnection__Group_6__0 )*
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_6()); 
            // InternalRosSystem.g:1688:2: ( rule__TopicConnection__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRosSystem.g:1688:3: rule__TopicConnection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TopicConnection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRosSystem.g:1696:1: rule__TopicConnection__Group__7 : rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8 ;
    public final void rule__TopicConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1700:1: ( rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8 )
            // InternalRosSystem.g:1701:2: rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:1708:1: rule__TopicConnection__Group__7__Impl : ( ')' ) ;
    public final void rule__TopicConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1712:1: ( ( ')' ) )
            // InternalRosSystem.g:1713:1: ( ')' )
            {
            // InternalRosSystem.g:1713:1: ( ')' )
            // InternalRosSystem.g:1714:2: ')'
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
    // InternalRosSystem.g:1723:1: rule__TopicConnection__Group__8 : rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9 ;
    public final void rule__TopicConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1727:1: ( rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9 )
            // InternalRosSystem.g:1728:2: rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9
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
    // InternalRosSystem.g:1735:1: rule__TopicConnection__Group__8__Impl : ( 'To' ) ;
    public final void rule__TopicConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1739:1: ( ( 'To' ) )
            // InternalRosSystem.g:1740:1: ( 'To' )
            {
            // InternalRosSystem.g:1740:1: ( 'To' )
            // InternalRosSystem.g:1741:2: 'To'
            {
             before(grammarAccess.getTopicConnectionAccess().getToKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRosSystem.g:1750:1: rule__TopicConnection__Group__9 : rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10 ;
    public final void rule__TopicConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1754:1: ( rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10 )
            // InternalRosSystem.g:1755:2: rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10
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
    // InternalRosSystem.g:1762:1: rule__TopicConnection__Group__9__Impl : ( '(' ) ;
    public final void rule__TopicConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1766:1: ( ( '(' ) )
            // InternalRosSystem.g:1767:1: ( '(' )
            {
            // InternalRosSystem.g:1767:1: ( '(' )
            // InternalRosSystem.g:1768:2: '('
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
    // InternalRosSystem.g:1777:1: rule__TopicConnection__Group__10 : rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11 ;
    public final void rule__TopicConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1781:1: ( rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11 )
            // InternalRosSystem.g:1782:2: rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:1789:1: rule__TopicConnection__Group__10__Impl : ( ( rule__TopicConnection__ToAssignment_10 ) ) ;
    public final void rule__TopicConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1793:1: ( ( ( rule__TopicConnection__ToAssignment_10 ) ) )
            // InternalRosSystem.g:1794:1: ( ( rule__TopicConnection__ToAssignment_10 ) )
            {
            // InternalRosSystem.g:1794:1: ( ( rule__TopicConnection__ToAssignment_10 ) )
            // InternalRosSystem.g:1795:2: ( rule__TopicConnection__ToAssignment_10 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_10()); 
            // InternalRosSystem.g:1796:2: ( rule__TopicConnection__ToAssignment_10 )
            // InternalRosSystem.g:1796:3: rule__TopicConnection__ToAssignment_10
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
    // InternalRosSystem.g:1804:1: rule__TopicConnection__Group__11 : rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12 ;
    public final void rule__TopicConnection__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1808:1: ( rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12 )
            // InternalRosSystem.g:1809:2: rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:1816:1: rule__TopicConnection__Group__11__Impl : ( ( rule__TopicConnection__Group_11__0 )* ) ;
    public final void rule__TopicConnection__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1820:1: ( ( ( rule__TopicConnection__Group_11__0 )* ) )
            // InternalRosSystem.g:1821:1: ( ( rule__TopicConnection__Group_11__0 )* )
            {
            // InternalRosSystem.g:1821:1: ( ( rule__TopicConnection__Group_11__0 )* )
            // InternalRosSystem.g:1822:2: ( rule__TopicConnection__Group_11__0 )*
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_11()); 
            // InternalRosSystem.g:1823:2: ( rule__TopicConnection__Group_11__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRosSystem.g:1823:3: rule__TopicConnection__Group_11__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TopicConnection__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRosSystem.g:1831:1: rule__TopicConnection__Group__12 : rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13 ;
    public final void rule__TopicConnection__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1835:1: ( rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13 )
            // InternalRosSystem.g:1836:2: rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:1843:1: rule__TopicConnection__Group__12__Impl : ( ')' ) ;
    public final void rule__TopicConnection__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1847:1: ( ( ')' ) )
            // InternalRosSystem.g:1848:1: ( ')' )
            {
            // InternalRosSystem.g:1848:1: ( ')' )
            // InternalRosSystem.g:1849:2: ')'
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
    // InternalRosSystem.g:1858:1: rule__TopicConnection__Group__13 : rule__TopicConnection__Group__13__Impl ;
    public final void rule__TopicConnection__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1862:1: ( rule__TopicConnection__Group__13__Impl )
            // InternalRosSystem.g:1863:2: rule__TopicConnection__Group__13__Impl
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
    // InternalRosSystem.g:1869:1: rule__TopicConnection__Group__13__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1873:1: ( ( '}' ) )
            // InternalRosSystem.g:1874:1: ( '}' )
            {
            // InternalRosSystem.g:1874:1: ( '}' )
            // InternalRosSystem.g:1875:2: '}'
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
    // InternalRosSystem.g:1885:1: rule__TopicConnection__Group_6__0 : rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1 ;
    public final void rule__TopicConnection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1889:1: ( rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1 )
            // InternalRosSystem.g:1890:2: rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1
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
    // InternalRosSystem.g:1897:1: rule__TopicConnection__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TopicConnection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1901:1: ( ( ',' ) )
            // InternalRosSystem.g:1902:1: ( ',' )
            {
            // InternalRosSystem.g:1902:1: ( ',' )
            // InternalRosSystem.g:1903:2: ','
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
    // InternalRosSystem.g:1912:1: rule__TopicConnection__Group_6__1 : rule__TopicConnection__Group_6__1__Impl ;
    public final void rule__TopicConnection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1916:1: ( rule__TopicConnection__Group_6__1__Impl )
            // InternalRosSystem.g:1917:2: rule__TopicConnection__Group_6__1__Impl
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
    // InternalRosSystem.g:1923:1: rule__TopicConnection__Group_6__1__Impl : ( ( rule__TopicConnection__FromAssignment_6_1 ) ) ;
    public final void rule__TopicConnection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1927:1: ( ( ( rule__TopicConnection__FromAssignment_6_1 ) ) )
            // InternalRosSystem.g:1928:1: ( ( rule__TopicConnection__FromAssignment_6_1 ) )
            {
            // InternalRosSystem.g:1928:1: ( ( rule__TopicConnection__FromAssignment_6_1 ) )
            // InternalRosSystem.g:1929:2: ( rule__TopicConnection__FromAssignment_6_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_6_1()); 
            // InternalRosSystem.g:1930:2: ( rule__TopicConnection__FromAssignment_6_1 )
            // InternalRosSystem.g:1930:3: rule__TopicConnection__FromAssignment_6_1
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
    // InternalRosSystem.g:1939:1: rule__TopicConnection__Group_11__0 : rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1 ;
    public final void rule__TopicConnection__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1943:1: ( rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1 )
            // InternalRosSystem.g:1944:2: rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1
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
    // InternalRosSystem.g:1951:1: rule__TopicConnection__Group_11__0__Impl : ( ',' ) ;
    public final void rule__TopicConnection__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1955:1: ( ( ',' ) )
            // InternalRosSystem.g:1956:1: ( ',' )
            {
            // InternalRosSystem.g:1956:1: ( ',' )
            // InternalRosSystem.g:1957:2: ','
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
    // InternalRosSystem.g:1966:1: rule__TopicConnection__Group_11__1 : rule__TopicConnection__Group_11__1__Impl ;
    public final void rule__TopicConnection__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1970:1: ( rule__TopicConnection__Group_11__1__Impl )
            // InternalRosSystem.g:1971:2: rule__TopicConnection__Group_11__1__Impl
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
    // InternalRosSystem.g:1977:1: rule__TopicConnection__Group_11__1__Impl : ( ( rule__TopicConnection__ToAssignment_11_1 ) ) ;
    public final void rule__TopicConnection__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1981:1: ( ( ( rule__TopicConnection__ToAssignment_11_1 ) ) )
            // InternalRosSystem.g:1982:1: ( ( rule__TopicConnection__ToAssignment_11_1 ) )
            {
            // InternalRosSystem.g:1982:1: ( ( rule__TopicConnection__ToAssignment_11_1 ) )
            // InternalRosSystem.g:1983:2: ( rule__TopicConnection__ToAssignment_11_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_11_1()); 
            // InternalRosSystem.g:1984:2: ( rule__TopicConnection__ToAssignment_11_1 )
            // InternalRosSystem.g:1984:3: rule__TopicConnection__ToAssignment_11_1
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
    // InternalRosSystem.g:1993:1: rule__ServiceConnection__Group__0 : rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 ;
    public final void rule__ServiceConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1997:1: ( rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 )
            // InternalRosSystem.g:1998:2: rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1
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
    // InternalRosSystem.g:2005:1: rule__ServiceConnection__Group__0__Impl : ( 'ServiceConnection' ) ;
    public final void rule__ServiceConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2009:1: ( ( 'ServiceConnection' ) )
            // InternalRosSystem.g:2010:1: ( 'ServiceConnection' )
            {
            // InternalRosSystem.g:2010:1: ( 'ServiceConnection' )
            // InternalRosSystem.g:2011:2: 'ServiceConnection'
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRosSystem.g:2020:1: rule__ServiceConnection__Group__1 : rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 ;
    public final void rule__ServiceConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2024:1: ( rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 )
            // InternalRosSystem.g:2025:2: rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2
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
    // InternalRosSystem.g:2032:1: rule__ServiceConnection__Group__1__Impl : ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) ) ;
    public final void rule__ServiceConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2036:1: ( ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) ) )
            // InternalRosSystem.g:2037:1: ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) )
            {
            // InternalRosSystem.g:2037:1: ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) )
            // InternalRosSystem.g:2038:2: ( rule__ServiceConnection__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceNameAssignment_1()); 
            // InternalRosSystem.g:2039:2: ( rule__ServiceConnection__ServiceNameAssignment_1 )
            // InternalRosSystem.g:2039:3: rule__ServiceConnection__ServiceNameAssignment_1
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
    // InternalRosSystem.g:2047:1: rule__ServiceConnection__Group__2 : rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 ;
    public final void rule__ServiceConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2051:1: ( rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 )
            // InternalRosSystem.g:2052:2: rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:2059:1: rule__ServiceConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2063:1: ( ( '{' ) )
            // InternalRosSystem.g:2064:1: ( '{' )
            {
            // InternalRosSystem.g:2064:1: ( '{' )
            // InternalRosSystem.g:2065:2: '{'
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
    // InternalRosSystem.g:2074:1: rule__ServiceConnection__Group__3 : rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 ;
    public final void rule__ServiceConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2078:1: ( rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 )
            // InternalRosSystem.g:2079:2: rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4
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
    // InternalRosSystem.g:2086:1: rule__ServiceConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__ServiceConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2090:1: ( ( 'From' ) )
            // InternalRosSystem.g:2091:1: ( 'From' )
            {
            // InternalRosSystem.g:2091:1: ( 'From' )
            // InternalRosSystem.g:2092:2: 'From'
            {
             before(grammarAccess.getServiceConnectionAccess().getFromKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRosSystem.g:2101:1: rule__ServiceConnection__Group__4 : rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 ;
    public final void rule__ServiceConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2105:1: ( rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 )
            // InternalRosSystem.g:2106:2: rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5
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
    // InternalRosSystem.g:2113:1: rule__ServiceConnection__Group__4__Impl : ( '(' ) ;
    public final void rule__ServiceConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2117:1: ( ( '(' ) )
            // InternalRosSystem.g:2118:1: ( '(' )
            {
            // InternalRosSystem.g:2118:1: ( '(' )
            // InternalRosSystem.g:2119:2: '('
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
    // InternalRosSystem.g:2128:1: rule__ServiceConnection__Group__5 : rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 ;
    public final void rule__ServiceConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2132:1: ( rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 )
            // InternalRosSystem.g:2133:2: rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:2140:1: rule__ServiceConnection__Group__5__Impl : ( ( rule__ServiceConnection__FromAssignment_5 ) ) ;
    public final void rule__ServiceConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2144:1: ( ( ( rule__ServiceConnection__FromAssignment_5 ) ) )
            // InternalRosSystem.g:2145:1: ( ( rule__ServiceConnection__FromAssignment_5 ) )
            {
            // InternalRosSystem.g:2145:1: ( ( rule__ServiceConnection__FromAssignment_5 ) )
            // InternalRosSystem.g:2146:2: ( rule__ServiceConnection__FromAssignment_5 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_5()); 
            // InternalRosSystem.g:2147:2: ( rule__ServiceConnection__FromAssignment_5 )
            // InternalRosSystem.g:2147:3: rule__ServiceConnection__FromAssignment_5
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
    // InternalRosSystem.g:2155:1: rule__ServiceConnection__Group__6 : rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7 ;
    public final void rule__ServiceConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2159:1: ( rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7 )
            // InternalRosSystem.g:2160:2: rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:2167:1: rule__ServiceConnection__Group__6__Impl : ( ( rule__ServiceConnection__Group_6__0 )* ) ;
    public final void rule__ServiceConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2171:1: ( ( ( rule__ServiceConnection__Group_6__0 )* ) )
            // InternalRosSystem.g:2172:1: ( ( rule__ServiceConnection__Group_6__0 )* )
            {
            // InternalRosSystem.g:2172:1: ( ( rule__ServiceConnection__Group_6__0 )* )
            // InternalRosSystem.g:2173:2: ( rule__ServiceConnection__Group_6__0 )*
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup_6()); 
            // InternalRosSystem.g:2174:2: ( rule__ServiceConnection__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosSystem.g:2174:3: rule__ServiceConnection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ServiceConnection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRosSystem.g:2182:1: rule__ServiceConnection__Group__7 : rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8 ;
    public final void rule__ServiceConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2186:1: ( rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8 )
            // InternalRosSystem.g:2187:2: rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:2194:1: rule__ServiceConnection__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2198:1: ( ( ')' ) )
            // InternalRosSystem.g:2199:1: ( ')' )
            {
            // InternalRosSystem.g:2199:1: ( ')' )
            // InternalRosSystem.g:2200:2: ')'
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
    // InternalRosSystem.g:2209:1: rule__ServiceConnection__Group__8 : rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9 ;
    public final void rule__ServiceConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2213:1: ( rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9 )
            // InternalRosSystem.g:2214:2: rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9
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
    // InternalRosSystem.g:2221:1: rule__ServiceConnection__Group__8__Impl : ( 'To' ) ;
    public final void rule__ServiceConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2225:1: ( ( 'To' ) )
            // InternalRosSystem.g:2226:1: ( 'To' )
            {
            // InternalRosSystem.g:2226:1: ( 'To' )
            // InternalRosSystem.g:2227:2: 'To'
            {
             before(grammarAccess.getServiceConnectionAccess().getToKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRosSystem.g:2236:1: rule__ServiceConnection__Group__9 : rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10 ;
    public final void rule__ServiceConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2240:1: ( rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10 )
            // InternalRosSystem.g:2241:2: rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:2248:1: rule__ServiceConnection__Group__9__Impl : ( ( rule__ServiceConnection__ToAssignment_9 ) ) ;
    public final void rule__ServiceConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2252:1: ( ( ( rule__ServiceConnection__ToAssignment_9 ) ) )
            // InternalRosSystem.g:2253:1: ( ( rule__ServiceConnection__ToAssignment_9 ) )
            {
            // InternalRosSystem.g:2253:1: ( ( rule__ServiceConnection__ToAssignment_9 ) )
            // InternalRosSystem.g:2254:2: ( rule__ServiceConnection__ToAssignment_9 )
            {
             before(grammarAccess.getServiceConnectionAccess().getToAssignment_9()); 
            // InternalRosSystem.g:2255:2: ( rule__ServiceConnection__ToAssignment_9 )
            // InternalRosSystem.g:2255:3: rule__ServiceConnection__ToAssignment_9
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
    // InternalRosSystem.g:2263:1: rule__ServiceConnection__Group__10 : rule__ServiceConnection__Group__10__Impl ;
    public final void rule__ServiceConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2267:1: ( rule__ServiceConnection__Group__10__Impl )
            // InternalRosSystem.g:2268:2: rule__ServiceConnection__Group__10__Impl
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
    // InternalRosSystem.g:2274:1: rule__ServiceConnection__Group__10__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2278:1: ( ( '}' ) )
            // InternalRosSystem.g:2279:1: ( '}' )
            {
            // InternalRosSystem.g:2279:1: ( '}' )
            // InternalRosSystem.g:2280:2: '}'
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
    // InternalRosSystem.g:2290:1: rule__ServiceConnection__Group_6__0 : rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1 ;
    public final void rule__ServiceConnection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2294:1: ( rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1 )
            // InternalRosSystem.g:2295:2: rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1
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
    // InternalRosSystem.g:2302:1: rule__ServiceConnection__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ServiceConnection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2306:1: ( ( ',' ) )
            // InternalRosSystem.g:2307:1: ( ',' )
            {
            // InternalRosSystem.g:2307:1: ( ',' )
            // InternalRosSystem.g:2308:2: ','
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
    // InternalRosSystem.g:2317:1: rule__ServiceConnection__Group_6__1 : rule__ServiceConnection__Group_6__1__Impl ;
    public final void rule__ServiceConnection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2321:1: ( rule__ServiceConnection__Group_6__1__Impl )
            // InternalRosSystem.g:2322:2: rule__ServiceConnection__Group_6__1__Impl
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
    // InternalRosSystem.g:2328:1: rule__ServiceConnection__Group_6__1__Impl : ( ( rule__ServiceConnection__FromAssignment_6_1 ) ) ;
    public final void rule__ServiceConnection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2332:1: ( ( ( rule__ServiceConnection__FromAssignment_6_1 ) ) )
            // InternalRosSystem.g:2333:1: ( ( rule__ServiceConnection__FromAssignment_6_1 ) )
            {
            // InternalRosSystem.g:2333:1: ( ( rule__ServiceConnection__FromAssignment_6_1 ) )
            // InternalRosSystem.g:2334:2: ( rule__ServiceConnection__FromAssignment_6_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_6_1()); 
            // InternalRosSystem.g:2335:2: ( rule__ServiceConnection__FromAssignment_6_1 )
            // InternalRosSystem.g:2335:3: rule__ServiceConnection__FromAssignment_6_1
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


    // $ANTLR start "rule__ActionConnection__Group__0"
    // InternalRosSystem.g:2344:1: rule__ActionConnection__Group__0 : rule__ActionConnection__Group__0__Impl rule__ActionConnection__Group__1 ;
    public final void rule__ActionConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2348:1: ( rule__ActionConnection__Group__0__Impl rule__ActionConnection__Group__1 )
            // InternalRosSystem.g:2349:2: rule__ActionConnection__Group__0__Impl rule__ActionConnection__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ActionConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__0"


    // $ANTLR start "rule__ActionConnection__Group__0__Impl"
    // InternalRosSystem.g:2356:1: rule__ActionConnection__Group__0__Impl : ( 'ActionConnection' ) ;
    public final void rule__ActionConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2360:1: ( ( 'ActionConnection' ) )
            // InternalRosSystem.g:2361:1: ( 'ActionConnection' )
            {
            // InternalRosSystem.g:2361:1: ( 'ActionConnection' )
            // InternalRosSystem.g:2362:2: 'ActionConnection'
            {
             before(grammarAccess.getActionConnectionAccess().getActionConnectionKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActionConnectionAccess().getActionConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__0__Impl"


    // $ANTLR start "rule__ActionConnection__Group__1"
    // InternalRosSystem.g:2371:1: rule__ActionConnection__Group__1 : rule__ActionConnection__Group__1__Impl rule__ActionConnection__Group__2 ;
    public final void rule__ActionConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2375:1: ( rule__ActionConnection__Group__1__Impl rule__ActionConnection__Group__2 )
            // InternalRosSystem.g:2376:2: rule__ActionConnection__Group__1__Impl rule__ActionConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActionConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__1"


    // $ANTLR start "rule__ActionConnection__Group__1__Impl"
    // InternalRosSystem.g:2383:1: rule__ActionConnection__Group__1__Impl : ( ( rule__ActionConnection__ActionNameAssignment_1 ) ) ;
    public final void rule__ActionConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2387:1: ( ( ( rule__ActionConnection__ActionNameAssignment_1 ) ) )
            // InternalRosSystem.g:2388:1: ( ( rule__ActionConnection__ActionNameAssignment_1 ) )
            {
            // InternalRosSystem.g:2388:1: ( ( rule__ActionConnection__ActionNameAssignment_1 ) )
            // InternalRosSystem.g:2389:2: ( rule__ActionConnection__ActionNameAssignment_1 )
            {
             before(grammarAccess.getActionConnectionAccess().getActionNameAssignment_1()); 
            // InternalRosSystem.g:2390:2: ( rule__ActionConnection__ActionNameAssignment_1 )
            // InternalRosSystem.g:2390:3: rule__ActionConnection__ActionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionConnection__ActionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionConnectionAccess().getActionNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__1__Impl"


    // $ANTLR start "rule__ActionConnection__Group__2"
    // InternalRosSystem.g:2398:1: rule__ActionConnection__Group__2 : rule__ActionConnection__Group__2__Impl rule__ActionConnection__Group__3 ;
    public final void rule__ActionConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2402:1: ( rule__ActionConnection__Group__2__Impl rule__ActionConnection__Group__3 )
            // InternalRosSystem.g:2403:2: rule__ActionConnection__Group__2__Impl rule__ActionConnection__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ActionConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__2"


    // $ANTLR start "rule__ActionConnection__Group__2__Impl"
    // InternalRosSystem.g:2410:1: rule__ActionConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2414:1: ( ( '{' ) )
            // InternalRosSystem.g:2415:1: ( '{' )
            {
            // InternalRosSystem.g:2415:1: ( '{' )
            // InternalRosSystem.g:2416:2: '{'
            {
             before(grammarAccess.getActionConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActionConnectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__2__Impl"


    // $ANTLR start "rule__ActionConnection__Group__3"
    // InternalRosSystem.g:2425:1: rule__ActionConnection__Group__3 : rule__ActionConnection__Group__3__Impl rule__ActionConnection__Group__4 ;
    public final void rule__ActionConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2429:1: ( rule__ActionConnection__Group__3__Impl rule__ActionConnection__Group__4 )
            // InternalRosSystem.g:2430:2: rule__ActionConnection__Group__3__Impl rule__ActionConnection__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ActionConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__3"


    // $ANTLR start "rule__ActionConnection__Group__3__Impl"
    // InternalRosSystem.g:2437:1: rule__ActionConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__ActionConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2441:1: ( ( 'From' ) )
            // InternalRosSystem.g:2442:1: ( 'From' )
            {
            // InternalRosSystem.g:2442:1: ( 'From' )
            // InternalRosSystem.g:2443:2: 'From'
            {
             before(grammarAccess.getActionConnectionAccess().getFromKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActionConnectionAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__3__Impl"


    // $ANTLR start "rule__ActionConnection__Group__4"
    // InternalRosSystem.g:2452:1: rule__ActionConnection__Group__4 : rule__ActionConnection__Group__4__Impl rule__ActionConnection__Group__5 ;
    public final void rule__ActionConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2456:1: ( rule__ActionConnection__Group__4__Impl rule__ActionConnection__Group__5 )
            // InternalRosSystem.g:2457:2: rule__ActionConnection__Group__4__Impl rule__ActionConnection__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ActionConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__4"


    // $ANTLR start "rule__ActionConnection__Group__4__Impl"
    // InternalRosSystem.g:2464:1: rule__ActionConnection__Group__4__Impl : ( ( rule__ActionConnection__FromAssignment_4 ) ) ;
    public final void rule__ActionConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2468:1: ( ( ( rule__ActionConnection__FromAssignment_4 ) ) )
            // InternalRosSystem.g:2469:1: ( ( rule__ActionConnection__FromAssignment_4 ) )
            {
            // InternalRosSystem.g:2469:1: ( ( rule__ActionConnection__FromAssignment_4 ) )
            // InternalRosSystem.g:2470:2: ( rule__ActionConnection__FromAssignment_4 )
            {
             before(grammarAccess.getActionConnectionAccess().getFromAssignment_4()); 
            // InternalRosSystem.g:2471:2: ( rule__ActionConnection__FromAssignment_4 )
            // InternalRosSystem.g:2471:3: rule__ActionConnection__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ActionConnection__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionConnectionAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__4__Impl"


    // $ANTLR start "rule__ActionConnection__Group__5"
    // InternalRosSystem.g:2479:1: rule__ActionConnection__Group__5 : rule__ActionConnection__Group__5__Impl rule__ActionConnection__Group__6 ;
    public final void rule__ActionConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2483:1: ( rule__ActionConnection__Group__5__Impl rule__ActionConnection__Group__6 )
            // InternalRosSystem.g:2484:2: rule__ActionConnection__Group__5__Impl rule__ActionConnection__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ActionConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__5"


    // $ANTLR start "rule__ActionConnection__Group__5__Impl"
    // InternalRosSystem.g:2491:1: rule__ActionConnection__Group__5__Impl : ( 'To' ) ;
    public final void rule__ActionConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2495:1: ( ( 'To' ) )
            // InternalRosSystem.g:2496:1: ( 'To' )
            {
            // InternalRosSystem.g:2496:1: ( 'To' )
            // InternalRosSystem.g:2497:2: 'To'
            {
             before(grammarAccess.getActionConnectionAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActionConnectionAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__5__Impl"


    // $ANTLR start "rule__ActionConnection__Group__6"
    // InternalRosSystem.g:2506:1: rule__ActionConnection__Group__6 : rule__ActionConnection__Group__6__Impl rule__ActionConnection__Group__7 ;
    public final void rule__ActionConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2510:1: ( rule__ActionConnection__Group__6__Impl rule__ActionConnection__Group__7 )
            // InternalRosSystem.g:2511:2: rule__ActionConnection__Group__6__Impl rule__ActionConnection__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__ActionConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__6"


    // $ANTLR start "rule__ActionConnection__Group__6__Impl"
    // InternalRosSystem.g:2518:1: rule__ActionConnection__Group__6__Impl : ( ( rule__ActionConnection__ToAssignment_6 ) ) ;
    public final void rule__ActionConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2522:1: ( ( ( rule__ActionConnection__ToAssignment_6 ) ) )
            // InternalRosSystem.g:2523:1: ( ( rule__ActionConnection__ToAssignment_6 ) )
            {
            // InternalRosSystem.g:2523:1: ( ( rule__ActionConnection__ToAssignment_6 ) )
            // InternalRosSystem.g:2524:2: ( rule__ActionConnection__ToAssignment_6 )
            {
             before(grammarAccess.getActionConnectionAccess().getToAssignment_6()); 
            // InternalRosSystem.g:2525:2: ( rule__ActionConnection__ToAssignment_6 )
            // InternalRosSystem.g:2525:3: rule__ActionConnection__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ActionConnection__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActionConnectionAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__6__Impl"


    // $ANTLR start "rule__ActionConnection__Group__7"
    // InternalRosSystem.g:2533:1: rule__ActionConnection__Group__7 : rule__ActionConnection__Group__7__Impl ;
    public final void rule__ActionConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2537:1: ( rule__ActionConnection__Group__7__Impl )
            // InternalRosSystem.g:2538:2: rule__ActionConnection__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionConnection__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__7"


    // $ANTLR start "rule__ActionConnection__Group__7__Impl"
    // InternalRosSystem.g:2544:1: rule__ActionConnection__Group__7__Impl : ( '}' ) ;
    public final void rule__ActionConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2548:1: ( ( '}' ) )
            // InternalRosSystem.g:2549:1: ( '}' )
            {
            // InternalRosSystem.g:2549:1: ( '}' )
            // InternalRosSystem.g:2550:2: '}'
            {
             before(grammarAccess.getActionConnectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActionConnectionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionConnection__Group__7__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalRosSystem.g:2560:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2564:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalRosSystem.g:2565:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalRosSystem.g:2572:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2576:1: ( ( 'ComponentInterface' ) )
            // InternalRosSystem.g:2577:1: ( 'ComponentInterface' )
            {
            // InternalRosSystem.g:2577:1: ( 'ComponentInterface' )
            // InternalRosSystem.g:2578:2: 'ComponentInterface'
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
    // InternalRosSystem.g:2587:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2591:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalRosSystem.g:2592:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:2599:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2603:1: ( ( '{' ) )
            // InternalRosSystem.g:2604:1: ( '{' )
            {
            // InternalRosSystem.g:2604:1: ( '{' )
            // InternalRosSystem.g:2605:2: '{'
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
    // InternalRosSystem.g:2614:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2618:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalRosSystem.g:2619:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2626:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2630:1: ( ( 'name' ) )
            // InternalRosSystem.g:2631:1: ( 'name' )
            {
            // InternalRosSystem.g:2631:1: ( 'name' )
            // InternalRosSystem.g:2632:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:2641:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2645:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalRosSystem.g:2646:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2653:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2657:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalRosSystem.g:2658:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalRosSystem.g:2658:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalRosSystem.g:2659:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalRosSystem.g:2660:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalRosSystem.g:2660:3: rule__ComponentInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalRosSystem.g:2668:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2672:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalRosSystem.g:2673:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2680:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2684:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalRosSystem.g:2685:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalRosSystem.g:2685:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalRosSystem.g:2686:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalRosSystem.g:2687:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystem.g:2687:3: rule__ComponentInterface__Group_4__0
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
    // InternalRosSystem.g:2695:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2699:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalRosSystem.g:2700:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2707:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2711:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalRosSystem.g:2712:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalRosSystem.g:2712:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalRosSystem.g:2713:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalRosSystem.g:2714:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosSystem.g:2714:3: rule__ComponentInterface__Group_5__0
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
    // InternalRosSystem.g:2722:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2726:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalRosSystem.g:2727:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2734:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2738:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalRosSystem.g:2739:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalRosSystem.g:2739:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalRosSystem.g:2740:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalRosSystem.g:2741:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystem.g:2741:3: rule__ComponentInterface__Group_6__0
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
    // InternalRosSystem.g:2749:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2753:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalRosSystem.g:2754:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystem.g:2761:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2765:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalRosSystem.g:2766:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalRosSystem.g:2766:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalRosSystem.g:2767:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalRosSystem.g:2768:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystem.g:2768:3: rule__ComponentInterface__Group_7__0
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
    // InternalRosSystem.g:2776:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2780:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalRosSystem.g:2781:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__ComponentInterface__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__9();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:2788:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2792:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalRosSystem.g:2793:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalRosSystem.g:2793:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalRosSystem.g:2794:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalRosSystem.g:2795:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystem.g:2795:3: rule__ComponentInterface__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group__9"
    // InternalRosSystem.g:2803:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2807:1: ( rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 )
            // InternalRosSystem.g:2808:2: rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__ComponentInterface__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__9"


    // $ANTLR start "rule__ComponentInterface__Group__9__Impl"
    // InternalRosSystem.g:2815:1: rule__ComponentInterface__Group__9__Impl : ( ( rule__ComponentInterface__Group_9__0 )? ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2819:1: ( ( ( rule__ComponentInterface__Group_9__0 )? ) )
            // InternalRosSystem.g:2820:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            {
            // InternalRosSystem.g:2820:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            // InternalRosSystem.g:2821:2: ( rule__ComponentInterface__Group_9__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9()); 
            // InternalRosSystem.g:2822:2: ( rule__ComponentInterface__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystem.g:2822:3: rule__ComponentInterface__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__9__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__10"
    // InternalRosSystem.g:2830:1: rule__ComponentInterface__Group__10 : rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 ;
    public final void rule__ComponentInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2834:1: ( rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 )
            // InternalRosSystem.g:2835:2: rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__ComponentInterface__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__10"


    // $ANTLR start "rule__ComponentInterface__Group__10__Impl"
    // InternalRosSystem.g:2842:1: rule__ComponentInterface__Group__10__Impl : ( ( rule__ComponentInterface__Group_10__0 )? ) ;
    public final void rule__ComponentInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2846:1: ( ( ( rule__ComponentInterface__Group_10__0 )? ) )
            // InternalRosSystem.g:2847:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            {
            // InternalRosSystem.g:2847:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            // InternalRosSystem.g:2848:2: ( rule__ComponentInterface__Group_10__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10()); 
            // InternalRosSystem.g:2849:2: ( rule__ComponentInterface__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosSystem.g:2849:3: rule__ComponentInterface__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__10__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__11"
    // InternalRosSystem.g:2857:1: rule__ComponentInterface__Group__11 : rule__ComponentInterface__Group__11__Impl ;
    public final void rule__ComponentInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2861:1: ( rule__ComponentInterface__Group__11__Impl )
            // InternalRosSystem.g:2862:2: rule__ComponentInterface__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__11"


    // $ANTLR start "rule__ComponentInterface__Group__11__Impl"
    // InternalRosSystem.g:2868:1: rule__ComponentInterface__Group__11__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2872:1: ( ( '}' ) )
            // InternalRosSystem.g:2873:1: ( '}' )
            {
            // InternalRosSystem.g:2873:1: ( '}' )
            // InternalRosSystem.g:2874:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__11__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__0"
    // InternalRosSystem.g:2884:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2888:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalRosSystem.g:2889:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2896:1: rule__ComponentInterface__Group_4__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2900:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:2901:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:2901:1: ( 'NameSpace' )
            // InternalRosSystem.g:2902:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:2911:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2915:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalRosSystem.g:2916:2: rule__ComponentInterface__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystem.g:2922:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2926:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) )
            // InternalRosSystem.g:2927:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            {
            // InternalRosSystem.g:2927:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            // InternalRosSystem.g:2928:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 
            // InternalRosSystem.g:2929:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            // InternalRosSystem.g:2929:3: rule__ComponentInterface__NameSpaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameSpaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_5__0"
    // InternalRosSystem.g:2938:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2942:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalRosSystem.g:2943:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
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
    // InternalRosSystem.g:2950:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2954:1: ( ( 'RosPublishers' ) )
            // InternalRosSystem.g:2955:1: ( 'RosPublishers' )
            {
            // InternalRosSystem.g:2955:1: ( 'RosPublishers' )
            // InternalRosSystem.g:2956:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:2965:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2969:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalRosSystem.g:2970:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:2977:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2981:1: ( ( '{' ) )
            // InternalRosSystem.g:2982:1: ( '{' )
            {
            // InternalRosSystem.g:2982:1: ( '{' )
            // InternalRosSystem.g:2983:2: '{'
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
    // InternalRosSystem.g:2992:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2996:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalRosSystem.g:2997:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3004:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3008:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) )
            // InternalRosSystem.g:3009:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            {
            // InternalRosSystem.g:3009:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            // InternalRosSystem.g:3010:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_2()); 
            // InternalRosSystem.g:3011:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            // InternalRosSystem.g:3011:3: rule__ComponentInterface__RospublisherAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:3019:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3023:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalRosSystem.g:3024:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3031:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3035:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalRosSystem.g:3036:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:3036:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalRosSystem.g:3037:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalRosSystem.g:3038:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRosSystem.g:3038:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRosSystem.g:3046:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3050:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalRosSystem.g:3051:2: rule__ComponentInterface__Group_5__4__Impl
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
    // InternalRosSystem.g:3057:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3061:1: ( ( '}' ) )
            // InternalRosSystem.g:3062:1: ( '}' )
            {
            // InternalRosSystem.g:3062:1: ( '}' )
            // InternalRosSystem.g:3063:2: '}'
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
    // InternalRosSystem.g:3073:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3077:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalRosSystem.g:3078:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:3085:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3089:1: ( ( ',' ) )
            // InternalRosSystem.g:3090:1: ( ',' )
            {
            // InternalRosSystem.g:3090:1: ( ',' )
            // InternalRosSystem.g:3091:2: ','
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
    // InternalRosSystem.g:3100:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3104:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalRosSystem.g:3105:2: rule__ComponentInterface__Group_5_3__1__Impl
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
    // InternalRosSystem.g:3111:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3115:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:3116:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:3116:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            // InternalRosSystem.g:3117:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_3_1()); 
            // InternalRosSystem.g:3118:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            // InternalRosSystem.g:3118:3: rule__ComponentInterface__RospublisherAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_3_1()); 

            }


            }

        }
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
    // InternalRosSystem.g:3127:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3131:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalRosSystem.g:3132:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
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
    // InternalRosSystem.g:3139:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3143:1: ( ( 'RosSubscribers' ) )
            // InternalRosSystem.g:3144:1: ( 'RosSubscribers' )
            {
            // InternalRosSystem.g:3144:1: ( 'RosSubscribers' )
            // InternalRosSystem.g:3145:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:3154:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3158:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalRosSystem.g:3159:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3166:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3170:1: ( ( '{' ) )
            // InternalRosSystem.g:3171:1: ( '{' )
            {
            // InternalRosSystem.g:3171:1: ( '{' )
            // InternalRosSystem.g:3172:2: '{'
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
    // InternalRosSystem.g:3181:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3185:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalRosSystem.g:3186:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3193:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3197:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) )
            // InternalRosSystem.g:3198:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            {
            // InternalRosSystem.g:3198:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            // InternalRosSystem.g:3199:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_2()); 
            // InternalRosSystem.g:3200:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            // InternalRosSystem.g:3200:3: rule__ComponentInterface__RossubscriberAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:3208:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3212:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalRosSystem.g:3213:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3220:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3224:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalRosSystem.g:3225:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:3225:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalRosSystem.g:3226:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalRosSystem.g:3227:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRosSystem.g:3227:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRosSystem.g:3235:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3239:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalRosSystem.g:3240:2: rule__ComponentInterface__Group_6__4__Impl
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
    // InternalRosSystem.g:3246:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3250:1: ( ( '}' ) )
            // InternalRosSystem.g:3251:1: ( '}' )
            {
            // InternalRosSystem.g:3251:1: ( '}' )
            // InternalRosSystem.g:3252:2: '}'
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
    // InternalRosSystem.g:3262:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3266:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalRosSystem.g:3267:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:3274:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3278:1: ( ( ',' ) )
            // InternalRosSystem.g:3279:1: ( ',' )
            {
            // InternalRosSystem.g:3279:1: ( ',' )
            // InternalRosSystem.g:3280:2: ','
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
    // InternalRosSystem.g:3289:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3293:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalRosSystem.g:3294:2: rule__ComponentInterface__Group_6_3__1__Impl
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
    // InternalRosSystem.g:3300:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3304:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:3305:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:3305:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            // InternalRosSystem.g:3306:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_3_1()); 
            // InternalRosSystem.g:3307:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            // InternalRosSystem.g:3307:3: rule__ComponentInterface__RossubscriberAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_3_1()); 

            }


            }

        }
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
    // InternalRosSystem.g:3316:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3320:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalRosSystem.g:3321:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
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
    // InternalRosSystem.g:3328:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3332:1: ( ( 'RosSrvServers' ) )
            // InternalRosSystem.g:3333:1: ( 'RosSrvServers' )
            {
            // InternalRosSystem.g:3333:1: ( 'RosSrvServers' )
            // InternalRosSystem.g:3334:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:3343:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3347:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalRosSystem.g:3348:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:3355:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3359:1: ( ( '{' ) )
            // InternalRosSystem.g:3360:1: ( '{' )
            {
            // InternalRosSystem.g:3360:1: ( '{' )
            // InternalRosSystem.g:3361:2: '{'
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
    // InternalRosSystem.g:3370:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3374:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalRosSystem.g:3375:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3382:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3386:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) )
            // InternalRosSystem.g:3387:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            {
            // InternalRosSystem.g:3387:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            // InternalRosSystem.g:3388:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_2()); 
            // InternalRosSystem.g:3389:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            // InternalRosSystem.g:3389:3: rule__ComponentInterface__RosserviceserverAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_2()); 

            }


            }

        }
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
    // InternalRosSystem.g:3397:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3401:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalRosSystem.g:3402:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystem.g:3409:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3413:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalRosSystem.g:3414:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalRosSystem.g:3414:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalRosSystem.g:3415:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalRosSystem.g:3416:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRosSystem.g:3416:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalRosSystem.g:3424:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3428:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalRosSystem.g:3429:2: rule__ComponentInterface__Group_7__4__Impl
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
    // InternalRosSystem.g:3435:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3439:1: ( ( '}' ) )
            // InternalRosSystem.g:3440:1: ( '}' )
            {
            // InternalRosSystem.g:3440:1: ( '}' )
            // InternalRosSystem.g:3441:2: '}'
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
    // InternalRosSystem.g:3451:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3455:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalRosSystem.g:3456:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:3463:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3467:1: ( ( ',' ) )
            // InternalRosSystem.g:3468:1: ( ',' )
            {
            // InternalRosSystem.g:3468:1: ( ',' )
            // InternalRosSystem.g:3469:2: ','
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
    // InternalRosSystem.g:3478:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3482:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalRosSystem.g:3483:2: rule__ComponentInterface__Group_7_3__1__Impl
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
    // InternalRosSystem.g:3489:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3493:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) )
            // InternalRosSystem.g:3494:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            {
            // InternalRosSystem.g:3494:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            // InternalRosSystem.g:3495:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_3_1()); 
            // InternalRosSystem.g:3496:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            // InternalRosSystem.g:3496:3: rule__ComponentInterface__RosserviceserverAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_8__0"
    // InternalRosSystem.g:3505:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3509:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalRosSystem.g:3510:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__0"


    // $ANTLR start "rule__ComponentInterface__Group_8__0__Impl"
    // InternalRosSystem.g:3517:1: rule__ComponentInterface__Group_8__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3521:1: ( ( 'RosSrvClients' ) )
            // InternalRosSystem.g:3522:1: ( 'RosSrvClients' )
            {
            // InternalRosSystem.g:3522:1: ( 'RosSrvClients' )
            // InternalRosSystem.g:3523:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__1"
    // InternalRosSystem.g:3532:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3536:1: ( rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 )
            // InternalRosSystem.g:3537:2: rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2
            {
            pushFollow(FOLLOW_29);
            rule__ComponentInterface__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__1"


    // $ANTLR start "rule__ComponentInterface__Group_8__1__Impl"
    // InternalRosSystem.g:3544:1: rule__ComponentInterface__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3548:1: ( ( '{' ) )
            // InternalRosSystem.g:3549:1: ( '{' )
            {
            // InternalRosSystem.g:3549:1: ( '{' )
            // InternalRosSystem.g:3550:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__2"
    // InternalRosSystem.g:3559:1: rule__ComponentInterface__Group_8__2 : rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 ;
    public final void rule__ComponentInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3563:1: ( rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 )
            // InternalRosSystem.g:3564:2: rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__2"


    // $ANTLR start "rule__ComponentInterface__Group_8__2__Impl"
    // InternalRosSystem.g:3571:1: rule__ComponentInterface__Group_8__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) ;
    public final void rule__ComponentInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3575:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) )
            // InternalRosSystem.g:3576:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            {
            // InternalRosSystem.g:3576:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            // InternalRosSystem.g:3577:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_2()); 
            // InternalRosSystem.g:3578:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            // InternalRosSystem.g:3578:3: rule__ComponentInterface__RosserviceclientAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__3"
    // InternalRosSystem.g:3586:1: rule__ComponentInterface__Group_8__3 : rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 ;
    public final void rule__ComponentInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3590:1: ( rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 )
            // InternalRosSystem.g:3591:2: rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__3"


    // $ANTLR start "rule__ComponentInterface__Group_8__3__Impl"
    // InternalRosSystem.g:3598:1: rule__ComponentInterface__Group_8__3__Impl : ( ( rule__ComponentInterface__Group_8_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3602:1: ( ( ( rule__ComponentInterface__Group_8_3__0 )* ) )
            // InternalRosSystem.g:3603:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            {
            // InternalRosSystem.g:3603:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            // InternalRosSystem.g:3604:2: ( rule__ComponentInterface__Group_8_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 
            // InternalRosSystem.g:3605:2: ( rule__ComponentInterface__Group_8_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRosSystem.g:3605:3: rule__ComponentInterface__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__4"
    // InternalRosSystem.g:3613:1: rule__ComponentInterface__Group_8__4 : rule__ComponentInterface__Group_8__4__Impl ;
    public final void rule__ComponentInterface__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3617:1: ( rule__ComponentInterface__Group_8__4__Impl )
            // InternalRosSystem.g:3618:2: rule__ComponentInterface__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__4"


    // $ANTLR start "rule__ComponentInterface__Group_8__4__Impl"
    // InternalRosSystem.g:3624:1: rule__ComponentInterface__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3628:1: ( ( '}' ) )
            // InternalRosSystem.g:3629:1: ( '}' )
            {
            // InternalRosSystem.g:3629:1: ( '}' )
            // InternalRosSystem.g:3630:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__0"
    // InternalRosSystem.g:3640:1: rule__ComponentInterface__Group_8_3__0 : rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 ;
    public final void rule__ComponentInterface__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3644:1: ( rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 )
            // InternalRosSystem.g:3645:2: rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1
            {
            pushFollow(FOLLOW_29);
            rule__ComponentInterface__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__0__Impl"
    // InternalRosSystem.g:3652:1: rule__ComponentInterface__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3656:1: ( ( ',' ) )
            // InternalRosSystem.g:3657:1: ( ',' )
            {
            // InternalRosSystem.g:3657:1: ( ',' )
            // InternalRosSystem.g:3658:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__1"
    // InternalRosSystem.g:3667:1: rule__ComponentInterface__Group_8_3__1 : rule__ComponentInterface__Group_8_3__1__Impl ;
    public final void rule__ComponentInterface__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3671:1: ( rule__ComponentInterface__Group_8_3__1__Impl )
            // InternalRosSystem.g:3672:2: rule__ComponentInterface__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__1__Impl"
    // InternalRosSystem.g:3678:1: rule__ComponentInterface__Group_8_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3682:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) )
            // InternalRosSystem.g:3683:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            {
            // InternalRosSystem.g:3683:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            // InternalRosSystem.g:3684:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_3_1()); 
            // InternalRosSystem.g:3685:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            // InternalRosSystem.g:3685:3: rule__ComponentInterface__RosserviceclientAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__0"
    // InternalRosSystem.g:3694:1: rule__ComponentInterface__Group_9__0 : rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 ;
    public final void rule__ComponentInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3698:1: ( rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 )
            // InternalRosSystem.g:3699:2: rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__0"


    // $ANTLR start "rule__ComponentInterface__Group_9__0__Impl"
    // InternalRosSystem.g:3706:1: rule__ComponentInterface__Group_9__0__Impl : ( 'RosActionServers' ) ;
    public final void rule__ComponentInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3710:1: ( ( 'RosActionServers' ) )
            // InternalRosSystem.g:3711:1: ( 'RosActionServers' )
            {
            // InternalRosSystem.g:3711:1: ( 'RosActionServers' )
            // InternalRosSystem.g:3712:2: 'RosActionServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__1"
    // InternalRosSystem.g:3721:1: rule__ComponentInterface__Group_9__1 : rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 ;
    public final void rule__ComponentInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3725:1: ( rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 )
            // InternalRosSystem.g:3726:2: rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2
            {
            pushFollow(FOLLOW_30);
            rule__ComponentInterface__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__1"


    // $ANTLR start "rule__ComponentInterface__Group_9__1__Impl"
    // InternalRosSystem.g:3733:1: rule__ComponentInterface__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3737:1: ( ( '{' ) )
            // InternalRosSystem.g:3738:1: ( '{' )
            {
            // InternalRosSystem.g:3738:1: ( '{' )
            // InternalRosSystem.g:3739:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__2"
    // InternalRosSystem.g:3748:1: rule__ComponentInterface__Group_9__2 : rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 ;
    public final void rule__ComponentInterface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3752:1: ( rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 )
            // InternalRosSystem.g:3753:2: rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__2"


    // $ANTLR start "rule__ComponentInterface__Group_9__2__Impl"
    // InternalRosSystem.g:3760:1: rule__ComponentInterface__Group_9__2__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) ;
    public final void rule__ComponentInterface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3764:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) )
            // InternalRosSystem.g:3765:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            {
            // InternalRosSystem.g:3765:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            // InternalRosSystem.g:3766:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_2()); 
            // InternalRosSystem.g:3767:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            // InternalRosSystem.g:3767:3: rule__ComponentInterface__RosactionserverAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionserverAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__3"
    // InternalRosSystem.g:3775:1: rule__ComponentInterface__Group_9__3 : rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 ;
    public final void rule__ComponentInterface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3779:1: ( rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 )
            // InternalRosSystem.g:3780:2: rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__3"


    // $ANTLR start "rule__ComponentInterface__Group_9__3__Impl"
    // InternalRosSystem.g:3787:1: rule__ComponentInterface__Group_9__3__Impl : ( ( rule__ComponentInterface__Group_9_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3791:1: ( ( ( rule__ComponentInterface__Group_9_3__0 )* ) )
            // InternalRosSystem.g:3792:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            {
            // InternalRosSystem.g:3792:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            // InternalRosSystem.g:3793:2: ( rule__ComponentInterface__Group_9_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9_3()); 
            // InternalRosSystem.g:3794:2: ( rule__ComponentInterface__Group_9_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRosSystem.g:3794:3: rule__ComponentInterface__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__4"
    // InternalRosSystem.g:3802:1: rule__ComponentInterface__Group_9__4 : rule__ComponentInterface__Group_9__4__Impl ;
    public final void rule__ComponentInterface__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3806:1: ( rule__ComponentInterface__Group_9__4__Impl )
            // InternalRosSystem.g:3807:2: rule__ComponentInterface__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__4"


    // $ANTLR start "rule__ComponentInterface__Group_9__4__Impl"
    // InternalRosSystem.g:3813:1: rule__ComponentInterface__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3817:1: ( ( '}' ) )
            // InternalRosSystem.g:3818:1: ( '}' )
            {
            // InternalRosSystem.g:3818:1: ( '}' )
            // InternalRosSystem.g:3819:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__0"
    // InternalRosSystem.g:3829:1: rule__ComponentInterface__Group_9_3__0 : rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 ;
    public final void rule__ComponentInterface__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3833:1: ( rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 )
            // InternalRosSystem.g:3834:2: rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1
            {
            pushFollow(FOLLOW_30);
            rule__ComponentInterface__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__0__Impl"
    // InternalRosSystem.g:3841:1: rule__ComponentInterface__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3845:1: ( ( ',' ) )
            // InternalRosSystem.g:3846:1: ( ',' )
            {
            // InternalRosSystem.g:3846:1: ( ',' )
            // InternalRosSystem.g:3847:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__1"
    // InternalRosSystem.g:3856:1: rule__ComponentInterface__Group_9_3__1 : rule__ComponentInterface__Group_9_3__1__Impl ;
    public final void rule__ComponentInterface__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3860:1: ( rule__ComponentInterface__Group_9_3__1__Impl )
            // InternalRosSystem.g:3861:2: rule__ComponentInterface__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__1__Impl"
    // InternalRosSystem.g:3867:1: rule__ComponentInterface__Group_9_3__1__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3871:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) )
            // InternalRosSystem.g:3872:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            {
            // InternalRosSystem.g:3872:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            // InternalRosSystem.g:3873:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_3_1()); 
            // InternalRosSystem.g:3874:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            // InternalRosSystem.g:3874:3: rule__ComponentInterface__RosactionserverAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionserverAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__0"
    // InternalRosSystem.g:3883:1: rule__ComponentInterface__Group_10__0 : rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 ;
    public final void rule__ComponentInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3887:1: ( rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 )
            // InternalRosSystem.g:3888:2: rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__0"


    // $ANTLR start "rule__ComponentInterface__Group_10__0__Impl"
    // InternalRosSystem.g:3895:1: rule__ComponentInterface__Group_10__0__Impl : ( 'RosActionClients' ) ;
    public final void rule__ComponentInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3899:1: ( ( 'RosActionClients' ) )
            // InternalRosSystem.g:3900:1: ( 'RosActionClients' )
            {
            // InternalRosSystem.g:3900:1: ( 'RosActionClients' )
            // InternalRosSystem.g:3901:2: 'RosActionClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__1"
    // InternalRosSystem.g:3910:1: rule__ComponentInterface__Group_10__1 : rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 ;
    public final void rule__ComponentInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3914:1: ( rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 )
            // InternalRosSystem.g:3915:2: rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2
            {
            pushFollow(FOLLOW_31);
            rule__ComponentInterface__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__1"


    // $ANTLR start "rule__ComponentInterface__Group_10__1__Impl"
    // InternalRosSystem.g:3922:1: rule__ComponentInterface__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3926:1: ( ( '{' ) )
            // InternalRosSystem.g:3927:1: ( '{' )
            {
            // InternalRosSystem.g:3927:1: ( '{' )
            // InternalRosSystem.g:3928:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__2"
    // InternalRosSystem.g:3937:1: rule__ComponentInterface__Group_10__2 : rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 ;
    public final void rule__ComponentInterface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3941:1: ( rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 )
            // InternalRosSystem.g:3942:2: rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__2"


    // $ANTLR start "rule__ComponentInterface__Group_10__2__Impl"
    // InternalRosSystem.g:3949:1: rule__ComponentInterface__Group_10__2__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) ;
    public final void rule__ComponentInterface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3953:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) )
            // InternalRosSystem.g:3954:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            {
            // InternalRosSystem.g:3954:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            // InternalRosSystem.g:3955:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_2()); 
            // InternalRosSystem.g:3956:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            // InternalRosSystem.g:3956:3: rule__ComponentInterface__RosactionclientAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionclientAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__3"
    // InternalRosSystem.g:3964:1: rule__ComponentInterface__Group_10__3 : rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 ;
    public final void rule__ComponentInterface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3968:1: ( rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 )
            // InternalRosSystem.g:3969:2: rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__3"


    // $ANTLR start "rule__ComponentInterface__Group_10__3__Impl"
    // InternalRosSystem.g:3976:1: rule__ComponentInterface__Group_10__3__Impl : ( ( rule__ComponentInterface__Group_10_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3980:1: ( ( ( rule__ComponentInterface__Group_10_3__0 )* ) )
            // InternalRosSystem.g:3981:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            {
            // InternalRosSystem.g:3981:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            // InternalRosSystem.g:3982:2: ( rule__ComponentInterface__Group_10_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10_3()); 
            // InternalRosSystem.g:3983:2: ( rule__ComponentInterface__Group_10_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRosSystem.g:3983:3: rule__ComponentInterface__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentInterface__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__4"
    // InternalRosSystem.g:3991:1: rule__ComponentInterface__Group_10__4 : rule__ComponentInterface__Group_10__4__Impl ;
    public final void rule__ComponentInterface__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3995:1: ( rule__ComponentInterface__Group_10__4__Impl )
            // InternalRosSystem.g:3996:2: rule__ComponentInterface__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__4"


    // $ANTLR start "rule__ComponentInterface__Group_10__4__Impl"
    // InternalRosSystem.g:4002:1: rule__ComponentInterface__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4006:1: ( ( '}' ) )
            // InternalRosSystem.g:4007:1: ( '}' )
            {
            // InternalRosSystem.g:4007:1: ( '}' )
            // InternalRosSystem.g:4008:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__0"
    // InternalRosSystem.g:4018:1: rule__ComponentInterface__Group_10_3__0 : rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 ;
    public final void rule__ComponentInterface__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4022:1: ( rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 )
            // InternalRosSystem.g:4023:2: rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1
            {
            pushFollow(FOLLOW_31);
            rule__ComponentInterface__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__0__Impl"
    // InternalRosSystem.g:4030:1: rule__ComponentInterface__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4034:1: ( ( ',' ) )
            // InternalRosSystem.g:4035:1: ( ',' )
            {
            // InternalRosSystem.g:4035:1: ( ',' )
            // InternalRosSystem.g:4036:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__1"
    // InternalRosSystem.g:4045:1: rule__ComponentInterface__Group_10_3__1 : rule__ComponentInterface__Group_10_3__1__Impl ;
    public final void rule__ComponentInterface__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4049:1: ( rule__ComponentInterface__Group_10_3__1__Impl )
            // InternalRosSystem.g:4050:2: rule__ComponentInterface__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__1__Impl"
    // InternalRosSystem.g:4056:1: rule__ComponentInterface__Group_10_3__1__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4060:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) )
            // InternalRosSystem.g:4061:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            {
            // InternalRosSystem.g:4061:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            // InternalRosSystem.g:4062:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_3_1()); 
            // InternalRosSystem.g:4063:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            // InternalRosSystem.g:4063:3: rule__ComponentInterface__RosactionclientAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionclientAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__0"
    // InternalRosSystem.g:4072:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4076:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalRosSystem.g:4077:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystem.g:4084:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4088:1: ( ( () ) )
            // InternalRosSystem.g:4089:1: ( () )
            {
            // InternalRosSystem.g:4089:1: ( () )
            // InternalRosSystem.g:4090:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalRosSystem.g:4091:2: ()
            // InternalRosSystem.g:4091:3: 
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
    // InternalRosSystem.g:4099:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4103:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalRosSystem.g:4104:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystem.g:4111:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4115:1: ( ( 'RosPublisher' ) )
            // InternalRosSystem.g:4116:1: ( 'RosPublisher' )
            {
            // InternalRosSystem.g:4116:1: ( 'RosPublisher' )
            // InternalRosSystem.g:4117:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:4126:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4130:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalRosSystem.g:4131:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystem.g:4138:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4142:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalRosSystem.g:4143:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:4143:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalRosSystem.g:4144:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:4145:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:4145:3: rule__RosPublisher__NameAssignment_2
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
    // InternalRosSystem.g:4153:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4157:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalRosSystem.g:4158:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystem.g:4165:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4169:1: ( ( '{' ) )
            // InternalRosSystem.g:4170:1: ( '{' )
            {
            // InternalRosSystem.g:4170:1: ( '{' )
            // InternalRosSystem.g:4171:2: '{'
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
    // InternalRosSystem.g:4180:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4184:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalRosSystem.g:4185:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystem.g:4192:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4196:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalRosSystem.g:4197:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalRosSystem.g:4197:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalRosSystem.g:4198:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalRosSystem.g:4199:2: ( rule__RosPublisher__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystem.g:4199:3: rule__RosPublisher__Group_4__0
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
    // InternalRosSystem.g:4207:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4211:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalRosSystem.g:4212:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
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
    // InternalRosSystem.g:4219:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4223:1: ( ( 'RefPublisher' ) )
            // InternalRosSystem.g:4224:1: ( 'RefPublisher' )
            {
            // InternalRosSystem.g:4224:1: ( 'RefPublisher' )
            // InternalRosSystem.g:4225:2: 'RefPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRosSystem.g:4234:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4238:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalRosSystem.g:4239:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:4246:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4250:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalRosSystem.g:4251:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalRosSystem.g:4251:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalRosSystem.g:4252:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalRosSystem.g:4253:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalRosSystem.g:4253:3: rule__RosPublisher__PublisherAssignment_6
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
    // InternalRosSystem.g:4261:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4265:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalRosSystem.g:4266:2: rule__RosPublisher__Group__7__Impl
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
    // InternalRosSystem.g:4272:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4276:1: ( ( '}' ) )
            // InternalRosSystem.g:4277:1: ( '}' )
            {
            // InternalRosSystem.g:4277:1: ( '}' )
            // InternalRosSystem.g:4278:2: '}'
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
    // InternalRosSystem.g:4288:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4292:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalRosSystem.g:4293:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
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
    // InternalRosSystem.g:4300:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4304:1: ( ( 'ns' ) )
            // InternalRosSystem.g:4305:1: ( 'ns' )
            {
            // InternalRosSystem.g:4305:1: ( 'ns' )
            // InternalRosSystem.g:4306:2: 'ns'
            {
             before(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRosSystem.g:4315:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4319:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalRosSystem.g:4320:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalRosSystem.g:4326:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4330:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:4331:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:4331:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalRosSystem.g:4332:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:4333:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalRosSystem.g:4333:3: rule__RosPublisher__NsAssignment_4_1
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
    // InternalRosSystem.g:4342:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4346:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalRosSystem.g:4347:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystem.g:4354:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4358:1: ( ( () ) )
            // InternalRosSystem.g:4359:1: ( () )
            {
            // InternalRosSystem.g:4359:1: ( () )
            // InternalRosSystem.g:4360:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalRosSystem.g:4361:2: ()
            // InternalRosSystem.g:4361:3: 
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
    // InternalRosSystem.g:4369:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4373:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalRosSystem.g:4374:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystem.g:4381:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4385:1: ( ( 'RosSubscriber' ) )
            // InternalRosSystem.g:4386:1: ( 'RosSubscriber' )
            {
            // InternalRosSystem.g:4386:1: ( 'RosSubscriber' )
            // InternalRosSystem.g:4387:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRosSystem.g:4396:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4400:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalRosSystem.g:4401:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystem.g:4408:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4412:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalRosSystem.g:4413:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:4413:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalRosSystem.g:4414:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:4415:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystem.g:4415:3: rule__RosSubscriber__NameAssignment_2
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
    // InternalRosSystem.g:4423:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4427:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalRosSystem.g:4428:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalRosSystem.g:4435:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4439:1: ( ( '{' ) )
            // InternalRosSystem.g:4440:1: ( '{' )
            {
            // InternalRosSystem.g:4440:1: ( '{' )
            // InternalRosSystem.g:4441:2: '{'
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
    // InternalRosSystem.g:4450:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4454:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalRosSystem.g:4455:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalRosSystem.g:4462:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4466:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalRosSystem.g:4467:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalRosSystem.g:4467:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalRosSystem.g:4468:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalRosSystem.g:4469:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystem.g:4469:3: rule__RosSubscriber__Group_4__0
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
    // InternalRosSystem.g:4477:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4481:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalRosSystem.g:4482:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
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
    // InternalRosSystem.g:4489:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4493:1: ( ( 'RefSubscriber' ) )
            // InternalRosSystem.g:4494:1: ( 'RefSubscriber' )
            {
            // InternalRosSystem.g:4494:1: ( 'RefSubscriber' )
            // InternalRosSystem.g:4495:2: 'RefSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRosSystem.g:4504:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4508:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalRosSystem.g:4509:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:4516:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4520:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalRosSystem.g:4521:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalRosSystem.g:4521:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalRosSystem.g:4522:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalRosSystem.g:4523:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalRosSystem.g:4523:3: rule__RosSubscriber__SubscriberAssignment_6
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
    // InternalRosSystem.g:4531:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4535:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalRosSystem.g:4536:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalRosSystem.g:4542:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4546:1: ( ( '}' ) )
            // InternalRosSystem.g:4547:1: ( '}' )
            {
            // InternalRosSystem.g:4547:1: ( '}' )
            // InternalRosSystem.g:4548:2: '}'
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
    // InternalRosSystem.g:4558:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4562:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalRosSystem.g:4563:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
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
    // InternalRosSystem.g:4570:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4574:1: ( ( 'ns' ) )
            // InternalRosSystem.g:4575:1: ( 'ns' )
            {
            // InternalRosSystem.g:4575:1: ( 'ns' )
            // InternalRosSystem.g:4576:2: 'ns'
            {
             before(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRosSystem.g:4585:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4589:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalRosSystem.g:4590:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalRosSystem.g:4596:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4600:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalRosSystem.g:4601:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalRosSystem.g:4601:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalRosSystem.g:4602:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalRosSystem.g:4603:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalRosSystem.g:4603:3: rule__RosSubscriber__NsAssignment_4_1
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
    // InternalRosSystem.g:4612:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4616:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalRosSystem.g:4617:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystem.g:4624:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4628:1: ( ( () ) )
            // InternalRosSystem.g:4629:1: ( () )
            {
            // InternalRosSystem.g:4629:1: ( () )
            // InternalRosSystem.g:4630:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalRosSystem.g:4631:2: ()
            // InternalRosSystem.g:4631:3: 
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
    // InternalRosSystem.g:4639:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4643:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalRosSystem.g:4644:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystem.g:4651:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4655:1: ( ( 'RosServiceServer' ) )
            // InternalRosSystem.g:4656:1: ( 'RosServiceServer' )
            {
            // InternalRosSystem.g:4656:1: ( 'RosServiceServer' )
            // InternalRosSystem.g:4657:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRosSystem.g:4666:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4670:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalRosSystem.g:4671:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystem.g:4678:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4682:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalRosSystem.g:4683:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalRosSystem.g:4683:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalRosSystem.g:4684:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalRosSystem.g:4685:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosSystem.g:4685:3: rule__RosServiceServer__NameAssignment_2
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
    // InternalRosSystem.g:4693:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4697:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalRosSystem.g:4698:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalRosSystem.g:4705:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4709:1: ( ( '{' ) )
            // InternalRosSystem.g:4710:1: ( '{' )
            {
            // InternalRosSystem.g:4710:1: ( '{' )
            // InternalRosSystem.g:4711:2: '{'
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
    // InternalRosSystem.g:4720:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4724:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalRosSystem.g:4725:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalRosSystem.g:4732:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4736:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalRosSystem.g:4737:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalRosSystem.g:4737:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalRosSystem.g:4738:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalRosSystem.g:4739:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosSystem.g:4739:3: rule__RosServiceServer__Group_4__0
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
    // InternalRosSystem.g:4747:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4751:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalRosSystem.g:4752:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
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
    // InternalRosSystem.g:4759:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4763:1: ( ( 'RefServer' ) )
            // InternalRosSystem.g:4764:1: ( 'RefServer' )
            {
            // InternalRosSystem.g:4764:1: ( 'RefServer' )
            // InternalRosSystem.g:4765:2: 'RefServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRosSystem.g:4774:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4778:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalRosSystem.g:4779:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:4786:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4790:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalRosSystem.g:4791:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalRosSystem.g:4791:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalRosSystem.g:4792:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalRosSystem.g:4793:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalRosSystem.g:4793:3: rule__RosServiceServer__SrvserverAssignment_6
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
    // InternalRosSystem.g:4801:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4805:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalRosSystem.g:4806:2: rule__RosServiceServer__Group__7__Impl
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
    // InternalRosSystem.g:4812:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4816:1: ( ( '}' ) )
            // InternalRosSystem.g:4817:1: ( '}' )
            {
            // InternalRosSystem.g:4817:1: ( '}' )
            // InternalRosSystem.g:4818:2: '}'
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
    // InternalRosSystem.g:4828:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4832:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalRosSystem.g:4833:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
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
    // InternalRosSystem.g:4840:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4844:1: ( ( 'ns' ) )
            // InternalRosSystem.g:4845:1: ( 'ns' )
            {
            // InternalRosSystem.g:4845:1: ( 'ns' )
            // InternalRosSystem.g:4846:2: 'ns'
            {
             before(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRosSystem.g:4855:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4859:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalRosSystem.g:4860:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalRosSystem.g:4866:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4870:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // I