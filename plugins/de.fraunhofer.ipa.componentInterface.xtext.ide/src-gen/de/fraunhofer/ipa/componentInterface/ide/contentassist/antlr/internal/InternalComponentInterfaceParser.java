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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'}'", "'NameSpace'", "'FromRosNode'", "'RosPublishers'", "','", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'value'"
    };
    public static final int RULE_DAY=11;
    public static final int RULE_DATE_TIME=16;
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_YEAR=13;
    public static final int RULE_MIN_SEC=15;
    public static final int RULE_ID=9;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HOUR=14;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_MONTH=12;
    public static final int T__46=46;
    public static final int RULE_BINARY=4;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleRosActionServer"
    // InternalComponentInterface.g:178:1: entryRuleRosActionServer : ruleRosActionServer EOF ;
    public final void entryRuleRosActionServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:179:1: ( ruleRosActionServer EOF )
            // InternalComponentInterface.g:180:1: ruleRosActionServer EOF
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
    // InternalComponentInterface.g:187:1: ruleRosActionServer : ( ( rule__RosActionServer__Group__0 ) ) ;
    public final void ruleRosActionServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:191:2: ( ( ( rule__RosActionServer__Group__0 ) ) )
            // InternalComponentInterface.g:192:2: ( ( rule__RosActionServer__Group__0 ) )
            {
            // InternalComponentInterface.g:192:2: ( ( rule__RosActionServer__Group__0 ) )
            // InternalComponentInterface.g:193:3: ( rule__RosActionServer__Group__0 )
            {
             before(grammarAccess.getRosActionServerAccess().getGroup()); 
            // InternalComponentInterface.g:194:3: ( rule__RosActionServer__Group__0 )
            // InternalComponentInterface.g:194:4: rule__RosActionServer__Group__0
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
    // InternalComponentInterface.g:203:1: entryRuleRosActionClient : ruleRosActionClient EOF ;
    public final void entryRuleRosActionClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:204:1: ( ruleRosActionClient EOF )
            // InternalComponentInterface.g:205:1: ruleRosActionClient EOF
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
    // InternalComponentInterface.g:212:1: ruleRosActionClient : ( ( rule__RosActionClient__Group__0 ) ) ;
    public final void ruleRosActionClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:216:2: ( ( ( rule__RosActionClient__Group__0 ) ) )
            // InternalComponentInterface.g:217:2: ( ( rule__RosActionClient__Group__0 ) )
            {
            // InternalComponentInterface.g:217:2: ( ( rule__RosActionClient__Group__0 ) )
            // InternalComponentInterface.g:218:3: ( rule__RosActionClient__Group__0 )
            {
             before(grammarAccess.getRosActionClientAccess().getGroup()); 
            // InternalComponentInterface.g:219:3: ( rule__RosActionClient__Group__0 )
            // InternalComponentInterface.g:219:4: rule__RosActionClient__Group__0
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


    // $ANTLR start "entryRuleRosParameter"
    // InternalComponentInterface.g:228:1: entryRuleRosParameter : ruleRosParameter EOF ;
    public final void entryRuleRosParameter() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( ruleRosParameter EOF )
            // InternalComponentInterface.g:230:1: ruleRosParameter EOF
            {
             before(grammarAccess.getRosParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosParameterRule()); 
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
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalComponentInterface.g:237:1: ruleRosParameter : ( ( rule__RosParameter__Group__0 ) ) ;
    public final void ruleRosParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__RosParameter__Group__0 ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__RosParameter__Group__0 ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__RosParameter__Group__0 ) )
            // InternalComponentInterface.g:243:3: ( rule__RosParameter__Group__0 )
            {
             before(grammarAccess.getRosParameterAccess().getGroup()); 
            // InternalComponentInterface.g:244:3: ( rule__RosParameter__Group__0 )
            // InternalComponentInterface.g:244:4: rule__RosParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosParameter"


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


    // $ANTLR start "entryRuleParameterValue"
    // InternalComponentInterface.g:278:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalComponentInterface.g:279:1: ( ruleParameterValue EOF )
            // InternalComponentInterface.g:280:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalComponentInterface.g:287:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:291:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalComponentInterface.g:292:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalComponentInterface.g:292:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalComponentInterface.g:293:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalComponentInterface.g:294:3: ( rule__ParameterValue__Alternatives )
            // InternalComponentInterface.g:294:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterString"
    // InternalComponentInterface.g:303:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:304:1: ( ruleParameterString EOF )
            // InternalComponentInterface.g:305:1: ruleParameterString EOF
            {
             before(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringRule()); 
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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalComponentInterface.g:312:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:316:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalComponentInterface.g:317:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalComponentInterface.g:317:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalComponentInterface.g:318:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment()); 
            // InternalComponentInterface.g:319:3: ( rule__ParameterString__ValueAssignment )
            // InternalComponentInterface.g:319:4: rule__ParameterString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalComponentInterface.g:328:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalComponentInterface.g:329:1: ( ruleParameterBase64 EOF )
            // InternalComponentInterface.g:330:1: ruleParameterBase64 EOF
            {
             before(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64Rule()); 
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
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalComponentInterface.g:337:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:341:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalComponentInterface.g:342:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalComponentInterface.g:342:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalComponentInterface.g:343:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment()); 
            // InternalComponentInterface.g:344:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalComponentInterface.g:344:4: rule__ParameterBase64__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64Access().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalComponentInterface.g:353:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalComponentInterface.g:354:1: ( ruleParameterInteger EOF )
            // InternalComponentInterface.g:355:1: ruleParameterInteger EOF
            {
             before(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerRule()); 
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
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalComponentInterface.g:362:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:366:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalComponentInterface.g:367:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalComponentInterface.g:367:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalComponentInterface.g:368:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 
            // InternalComponentInterface.g:369:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalComponentInterface.g:369:4: rule__ParameterInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalComponentInterface.g:378:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalComponentInterface.g:379:1: ( ruleParameterDouble EOF )
            // InternalComponentInterface.g:380:1: ruleParameterDouble EOF
            {
             before(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleRule()); 
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
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalComponentInterface.g:387:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:391:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalComponentInterface.g:392:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalComponentInterface.g:392:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalComponentInterface.g:393:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 
            // InternalComponentInterface.g:394:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalComponentInterface.g:394:4: rule__ParameterDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalComponentInterface.g:403:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalComponentInterface.g:404:1: ( ruleParameterBoolean EOF )
            // InternalComponentInterface.g:405:1: ruleParameterBoolean EOF
            {
             before(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanRule()); 
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
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalComponentInterface.g:412:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:416:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalComponentInterface.g:417:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalComponentInterface.g:417:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalComponentInterface.g:418:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 
            // InternalComponentInterface.g:419:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalComponentInterface.g:419:4: rule__ParameterBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterList"
    // InternalComponentInterface.g:428:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalComponentInterface.g:429:1: ( ruleParameterList EOF )
            // InternalComponentInterface.g:430:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalComponentInterface.g:437:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:441:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalComponentInterface.g:442:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalComponentInterface.g:442:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalComponentInterface.g:443:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalComponentInterface.g:444:3: ( rule__ParameterList__Group__0 )
            // InternalComponentInterface.g:444:4: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalComponentInterface.g:453:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalComponentInterface.g:454:1: ( ruleParameterStruct EOF )
            // InternalComponentInterface.g:455:1: ruleParameterStruct EOF
            {
             before(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStruct();

            state._fsp--;

             after(grammarAccess.getParameterStructRule()); 
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
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalComponentInterface.g:462:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:466:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalComponentInterface.g:467:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalComponentInterface.g:467:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalComponentInterface.g:468:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup()); 
            // InternalComponentInterface.g:469:3: ( rule__ParameterStruct__Group__0 )
            // InternalComponentInterface.g:469:4: rule__ParameterStruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalComponentInterface.g:478:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalComponentInterface.g:479:1: ( ruleParameterStructMember EOF )
            // InternalComponentInterface.g:480:1: ruleParameterStructMember EOF
            {
             before(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberRule()); 
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
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalComponentInterface.g:487:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:491:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalComponentInterface.g:492:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalComponentInterface.g:492:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalComponentInterface.g:493:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup()); 
            // InternalComponentInterface.g:494:3: ( rule__ParameterStructMember__Group__0 )
            // InternalComponentInterface.g:494:4: rule__ParameterStructMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalComponentInterface.g:503:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalComponentInterface.g:504:1: ( ruleBase64Binary EOF )
            // InternalComponentInterface.g:505:1: ruleBase64Binary EOF
            {
             before(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getBase64BinaryRule()); 
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
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalComponentInterface.g:512:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:516:2: ( ( RULE_BINARY ) )
            // InternalComponentInterface.g:517:2: ( RULE_BINARY )
            {
            // InternalComponentInterface.g:517:2: ( RULE_BINARY )
            // InternalComponentInterface.g:518:3: RULE_BINARY
            {
             before(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall()); 
            match(input,RULE_BINARY,FOLLOW_2); 
             after(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalComponentInterface.g:528:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalComponentInterface.g:529:1: ( ruleboolean0 EOF )
            // InternalComponentInterface.g:530:1: ruleboolean0 EOF
            {
             before(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getBoolean0Rule()); 
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
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalComponentInterface.g:537:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:541:2: ( ( RULE_BOOLEAN ) )
            // InternalComponentInterface.g:542:2: ( RULE_BOOLEAN )
            {
            // InternalComponentInterface.g:542:2: ( RULE_BOOLEAN )
            // InternalComponentInterface.g:543:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalComponentInterface.g:553:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalComponentInterface.g:554:1: ( ruleDouble0 EOF )
            // InternalComponentInterface.g:555:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule()); 
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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalComponentInterface.g:562:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:566:2: ( ( RULE_DOUBLE ) )
            // InternalComponentInterface.g:567:2: ( RULE_DOUBLE )
            {
            // InternalComponentInterface.g:567:2: ( RULE_DOUBLE )
            // InternalComponentInterface.g:568:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalComponentInterface.g:578:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalComponentInterface.g:579:1: ( ruleInteger0 EOF )
            // InternalComponentInterface.g:580:1: ruleInteger0 EOF
            {
             before(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getInteger0Rule()); 
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
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalComponentInterface.g:587:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:591:2: ( ( RULE_DECINT ) )
            // InternalComponentInterface.g:592:2: ( RULE_DECINT )
            {
            // InternalComponentInterface.g:592:2: ( RULE_DECINT )
            // InternalComponentInterface.g:593:3: RULE_DECINT
            {
             before(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 
            match(input,RULE_DECINT,FOLLOW_2); 
             after(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComponentInterface.g:602:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:606:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalComponentInterface.g:607:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:607:2: ( RULE_STRING )
                    // InternalComponentInterface.g:608:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:613:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:613:2: ( RULE_ID )
                    // InternalComponentInterface.g:614:3: RULE_ID
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


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalComponentInterface.g:623:1: rule__ParameterValue__Alternatives : ( ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterInteger ) | ( ruleParameterBase64 ) | ( ruleParameterList ) | ( ruleParameterStruct ) | ( ruleParameterString ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:627:1: ( ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterInteger ) | ( ruleParameterBase64 ) | ( ruleParameterList ) | ( ruleParameterStruct ) | ( ruleParameterString ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:628:2: ( ruleParameterDouble )
                    {
                    // InternalComponentInterface.g:628:2: ( ruleParameterDouble )
                    // InternalComponentInterface.g:629:3: ruleParameterDouble
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterDouble();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:634:2: ( ruleParameterBoolean )
                    {
                    // InternalComponentInterface.g:634:2: ( ruleParameterBoolean )
                    // InternalComponentInterface.g:635:3: ruleParameterBoolean
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBoolean();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:640:2: ( ruleParameterInteger )
                    {
                    // InternalComponentInterface.g:640:2: ( ruleParameterInteger )
                    // InternalComponentInterface.g:641:3: ruleParameterInteger
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterInteger();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentInterface.g:646:2: ( ruleParameterBase64 )
                    {
                    // InternalComponentInterface.g:646:2: ( ruleParameterBase64 )
                    // InternalComponentInterface.g:647:3: ruleParameterBase64
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentInterface.g:652:2: ( ruleParameterList )
                    {
                    // InternalComponentInterface.g:652:2: ( ruleParameterList )
                    // InternalComponentInterface.g:653:3: ruleParameterList
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterList();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentInterface.g:658:2: ( ruleParameterStruct )
                    {
                    // InternalComponentInterface.g:658:2: ( ruleParameterStruct )
                    // InternalComponentInterface.g:659:3: ruleParameterStruct
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStruct();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentInterface.g:664:2: ( ruleParameterString )
                    {
                    // InternalComponentInterface.g:664:2: ( ruleParameterString )
                    // InternalComponentInterface.g:665:3: ruleParameterString
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterString();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_6()); 

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
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalComponentInterface.g:674:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:678:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:679:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalComponentInterface.g:686:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:690:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:691:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:691:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:692:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentInterface.g:701:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:705:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:706:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
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
    // InternalComponentInterface.g:713:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:717:1: ( ( '{' ) )
            // InternalComponentInterface.g:718:1: ( '{' )
            {
            // InternalComponentInterface.g:718:1: ( '{' )
            // InternalComponentInterface.g:719:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:728:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:732:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:733:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:740:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:744:1: ( ( 'name' ) )
            // InternalComponentInterface.g:745:1: ( 'name' )
            {
            // InternalComponentInterface.g:745:1: ( 'name' )
            // InternalComponentInterface.g:746:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentInterface.g:755:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:759:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:760:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:767:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:771:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:772:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:772:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:773:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:774:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:774:3: rule__ComponentInterface__NameAssignment_3
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
    // InternalComponentInterface.g:782:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:786:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:787:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:794:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:798:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:799:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:799:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:800:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:801:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:801:3: rule__ComponentInterface__Group_4__0
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
    // InternalComponentInterface.g:809:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:813:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:814:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:821:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:825:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:826:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:826:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:827:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:828:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:828:3: rule__ComponentInterface__Group_5__0
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
    // InternalComponentInterface.g:836:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:840:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:841:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:848:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__UnorderedGroup_6 ) ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:852:1: ( ( ( rule__ComponentInterface__UnorderedGroup_6 ) ) )
            // InternalComponentInterface.g:853:1: ( ( rule__ComponentInterface__UnorderedGroup_6 ) )
            {
            // InternalComponentInterface.g:853:1: ( ( rule__ComponentInterface__UnorderedGroup_6 ) )
            // InternalComponentInterface.g:854:2: ( rule__ComponentInterface__UnorderedGroup_6 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6()); 
            // InternalComponentInterface.g:855:2: ( rule__ComponentInterface__UnorderedGroup_6 )
            // InternalComponentInterface.g:855:3: rule__ComponentInterface__UnorderedGroup_6
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__UnorderedGroup_6();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6()); 

            }


            }

        }
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
    // InternalComponentInterface.g:863:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:867:1: ( rule__ComponentInterface__Group__7__Impl )
            // InternalComponentInterface.g:868:2: rule__ComponentInterface__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:874:1: rule__ComponentInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:878:1: ( ( '}' ) )
            // InternalComponentInterface.g:879:1: ( '}' )
            {
            // InternalComponentInterface.g:879:1: ( '}' )
            // InternalComponentInterface.g:880:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_4__0"
    // InternalComponentInterface.g:890:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:894:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:895:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:902:1: rule__ComponentInterface__Group_4__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:906:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:907:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:907:1: ( 'NameSpace' )
            // InternalComponentInterface.g:908:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalComponentInterface.g:917:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:921:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:922:2: rule__ComponentInterface__Group_4__1__Impl
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
    // InternalComponentInterface.g:928:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:932:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:933:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:933:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            // InternalComponentInterface.g:934:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 
            // InternalComponentInterface.g:935:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            // InternalComponentInterface.g:935:3: rule__ComponentInterface__NameSpaceAssignment_4_1
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
    // InternalComponentInterface.g:944:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:948:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:949:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:956:1: rule__ComponentInterface__Group_5__0__Impl : ( 'FromRosNode' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:960:1: ( ( 'FromRosNode' ) )
            // InternalComponentInterface.g:961:1: ( 'FromRosNode' )
            {
            // InternalComponentInterface.g:961:1: ( 'FromRosNode' )
            // InternalComponentInterface.g:962:2: 'FromRosNode'
            {
             before(grammarAccess.getComponentInterfaceAccess().getFromRosNodeKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getFromRosNodeKeyword_5_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:971:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:975:1: ( rule__ComponentInterface__Group_5__1__Impl )
            // InternalComponentInterface.g:976:2: rule__ComponentInterface__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:982:1: rule__ComponentInterface__Group_5__1__Impl : ( ( rule__ComponentInterface__FromRosNodeAssignment_5_1 ) ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:986:1: ( ( ( rule__ComponentInterface__FromRosNodeAssignment_5_1 ) ) )
            // InternalComponentInterface.g:987:1: ( ( rule__ComponentInterface__FromRosNodeAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:987:1: ( ( rule__ComponentInterface__FromRosNodeAssignment_5_1 ) )
            // InternalComponentInterface.g:988:2: ( rule__ComponentInterface__FromRosNodeAssignment_5_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getFromRosNodeAssignment_5_1()); 
            // InternalComponentInterface.g:989:2: ( rule__ComponentInterface__FromRosNodeAssignment_5_1 )
            // InternalComponentInterface.g:989:3: rule__ComponentInterface__FromRosNodeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__FromRosNodeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getFromRosNodeAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_6_0__0"
    // InternalComponentInterface.g:998:1: rule__ComponentInterface__Group_6_0__0 : rule__ComponentInterface__Group_6_0__0__Impl rule__ComponentInterface__Group_6_0__1 ;
    public final void rule__ComponentInterface__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1002:1: ( rule__ComponentInterface__Group_6_0__0__Impl rule__ComponentInterface__Group_6_0__1 )
            // InternalComponentInterface.g:1003:2: rule__ComponentInterface__Group_6_0__0__Impl rule__ComponentInterface__Group_6_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__0__Impl"
    // InternalComponentInterface.g:1010:1: rule__ComponentInterface__Group_6_0__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1014:1: ( ( 'RosPublishers' ) )
            // InternalComponentInterface.g:1015:1: ( 'RosPublishers' )
            {
            // InternalComponentInterface.g:1015:1: ( 'RosPublishers' )
            // InternalComponentInterface.g:1016:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_6_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__1"
    // InternalComponentInterface.g:1025:1: rule__ComponentInterface__Group_6_0__1 : rule__ComponentInterface__Group_6_0__1__Impl rule__ComponentInterface__Group_6_0__2 ;
    public final void rule__ComponentInterface__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1029:1: ( rule__ComponentInterface__Group_6_0__1__Impl rule__ComponentInterface__Group_6_0__2 )
            // InternalComponentInterface.g:1030:2: rule__ComponentInterface__Group_6_0__1__Impl rule__ComponentInterface__Group_6_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_6_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__1__Impl"
    // InternalComponentInterface.g:1037:1: rule__ComponentInterface__Group_6_0__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1041:1: ( ( '{' ) )
            // InternalComponentInterface.g:1042:1: ( '{' )
            {
            // InternalComponentInterface.g:1042:1: ( '{' )
            // InternalComponentInterface.g:1043:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__2"
    // InternalComponentInterface.g:1052:1: rule__ComponentInterface__Group_6_0__2 : rule__ComponentInterface__Group_6_0__2__Impl rule__ComponentInterface__Group_6_0__3 ;
    public final void rule__ComponentInterface__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1056:1: ( rule__ComponentInterface__Group_6_0__2__Impl rule__ComponentInterface__Group_6_0__3 )
            // InternalComponentInterface.g:1057:2: rule__ComponentInterface__Group_6_0__2__Impl rule__ComponentInterface__Group_6_0__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__2__Impl"
    // InternalComponentInterface.g:1064:1: rule__ComponentInterface__Group_6_0__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_6_0_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1068:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_6_0_2 ) ) )
            // InternalComponentInterface.g:1069:1: ( ( rule__ComponentInterface__RospublisherAssignment_6_0_2 ) )
            {
            // InternalComponentInterface.g:1069:1: ( ( rule__ComponentInterface__RospublisherAssignment_6_0_2 ) )
            // InternalComponentInterface.g:1070:2: ( rule__ComponentInterface__RospublisherAssignment_6_0_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_6_0_2()); 
            // InternalComponentInterface.g:1071:2: ( rule__ComponentInterface__RospublisherAssignment_6_0_2 )
            // InternalComponentInterface.g:1071:3: rule__ComponentInterface__RospublisherAssignment_6_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_6_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_6_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__3"
    // InternalComponentInterface.g:1079:1: rule__ComponentInterface__Group_6_0__3 : rule__ComponentInterface__Group_6_0__3__Impl rule__ComponentInterface__Group_6_0__4 ;
    public final void rule__ComponentInterface__Group_6_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1083:1: ( rule__ComponentInterface__Group_6_0__3__Impl rule__ComponentInterface__Group_6_0__4 )
            // InternalComponentInterface.g:1084:2: rule__ComponentInterface__Group_6_0__3__Impl rule__ComponentInterface__Group_6_0__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__3__Impl"
    // InternalComponentInterface.g:1091:1: rule__ComponentInterface__Group_6_0__3__Impl : ( ( rule__ComponentInterface__Group_6_0_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1095:1: ( ( ( rule__ComponentInterface__Group_6_0_3__0 )* ) )
            // InternalComponentInterface.g:1096:1: ( ( rule__ComponentInterface__Group_6_0_3__0 )* )
            {
            // InternalComponentInterface.g:1096:1: ( ( rule__ComponentInterface__Group_6_0_3__0 )* )
            // InternalComponentInterface.g:1097:2: ( rule__ComponentInterface__Group_6_0_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_0_3()); 
            // InternalComponentInterface.g:1098:2: ( rule__ComponentInterface__Group_6_0_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponentInterface.g:1098:3: rule__ComponentInterface__Group_6_0_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__4"
    // InternalComponentInterface.g:1106:1: rule__ComponentInterface__Group_6_0__4 : rule__ComponentInterface__Group_6_0__4__Impl ;
    public final void rule__ComponentInterface__Group_6_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1110:1: ( rule__ComponentInterface__Group_6_0__4__Impl )
            // InternalComponentInterface.g:1111:2: rule__ComponentInterface__Group_6_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_0__4__Impl"
    // InternalComponentInterface.g:1117:1: rule__ComponentInterface__Group_6_0__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1121:1: ( ( '}' ) )
            // InternalComponentInterface.g:1122:1: ( '}' )
            {
            // InternalComponentInterface.g:1122:1: ( '}' )
            // InternalComponentInterface.g:1123:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_0_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_0_3__0"
    // InternalComponentInterface.g:1133:1: rule__ComponentInterface__Group_6_0_3__0 : rule__ComponentInterface__Group_6_0_3__0__Impl rule__ComponentInterface__Group_6_0_3__1 ;
    public final void rule__ComponentInterface__Group_6_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1137:1: ( rule__ComponentInterface__Group_6_0_3__0__Impl rule__ComponentInterface__Group_6_0_3__1 )
            // InternalComponentInterface.g:1138:2: rule__ComponentInterface__Group_6_0_3__0__Impl rule__ComponentInterface__Group_6_0_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_6_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_0_3__0__Impl"
    // InternalComponentInterface.g:1145:1: rule__ComponentInterface__Group_6_0_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1149:1: ( ( ',' ) )
            // InternalComponentInterface.g:1150:1: ( ',' )
            {
            // InternalComponentInterface.g:1150:1: ( ',' )
            // InternalComponentInterface.g:1151:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_0_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_0_3__1"
    // InternalComponentInterface.g:1160:1: rule__ComponentInterface__Group_6_0_3__1 : rule__ComponentInterface__Group_6_0_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1164:1: ( rule__ComponentInterface__Group_6_0_3__1__Impl )
            // InternalComponentInterface.g:1165:2: rule__ComponentInterface__Group_6_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_0_3__1__Impl"
    // InternalComponentInterface.g:1171:1: rule__ComponentInterface__Group_6_0_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_6_0_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1175:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_6_0_3_1 ) ) )
            // InternalComponentInterface.g:1176:1: ( ( rule__ComponentInterface__RospublisherAssignment_6_0_3_1 ) )
            {
            // InternalComponentInterface.g:1176:1: ( ( rule__ComponentInterface__RospublisherAssignment_6_0_3_1 ) )
            // InternalComponentInterface.g:1177:2: ( rule__ComponentInterface__RospublisherAssignment_6_0_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_6_0_3_1()); 
            // InternalComponentInterface.g:1178:2: ( rule__ComponentInterface__RospublisherAssignment_6_0_3_1 )
            // InternalComponentInterface.g:1178:3: rule__ComponentInterface__RospublisherAssignment_6_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_6_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_6_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_0_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__0"
    // InternalComponentInterface.g:1187:1: rule__ComponentInterface__Group_6_1__0 : rule__ComponentInterface__Group_6_1__0__Impl rule__ComponentInterface__Group_6_1__1 ;
    public final void rule__ComponentInterface__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1191:1: ( rule__ComponentInterface__Group_6_1__0__Impl rule__ComponentInterface__Group_6_1__1 )
            // InternalComponentInterface.g:1192:2: rule__ComponentInterface__Group_6_1__0__Impl rule__ComponentInterface__Group_6_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__0__Impl"
    // InternalComponentInterface.g:1199:1: rule__ComponentInterface__Group_6_1__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1203:1: ( ( 'RosSubscribers' ) )
            // InternalComponentInterface.g:1204:1: ( 'RosSubscribers' )
            {
            // InternalComponentInterface.g:1204:1: ( 'RosSubscribers' )
            // InternalComponentInterface.g:1205:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__1"
    // InternalComponentInterface.g:1214:1: rule__ComponentInterface__Group_6_1__1 : rule__ComponentInterface__Group_6_1__1__Impl rule__ComponentInterface__Group_6_1__2 ;
    public final void rule__ComponentInterface__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1218:1: ( rule__ComponentInterface__Group_6_1__1__Impl rule__ComponentInterface__Group_6_1__2 )
            // InternalComponentInterface.g:1219:2: rule__ComponentInterface__Group_6_1__1__Impl rule__ComponentInterface__Group_6_1__2
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__1__Impl"
    // InternalComponentInterface.g:1226:1: rule__ComponentInterface__Group_6_1__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1230:1: ( ( '{' ) )
            // InternalComponentInterface.g:1231:1: ( '{' )
            {
            // InternalComponentInterface.g:1231:1: ( '{' )
            // InternalComponentInterface.g:1232:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__2"
    // InternalComponentInterface.g:1241:1: rule__ComponentInterface__Group_6_1__2 : rule__ComponentInterface__Group_6_1__2__Impl rule__ComponentInterface__Group_6_1__3 ;
    public final void rule__ComponentInterface__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1245:1: ( rule__ComponentInterface__Group_6_1__2__Impl rule__ComponentInterface__Group_6_1__3 )
            // InternalComponentInterface.g:1246:2: rule__ComponentInterface__Group_6_1__2__Impl rule__ComponentInterface__Group_6_1__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__2__Impl"
    // InternalComponentInterface.g:1253:1: rule__ComponentInterface__Group_6_1__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1257:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_2 ) ) )
            // InternalComponentInterface.g:1258:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_2 ) )
            {
            // InternalComponentInterface.g:1258:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_2 ) )
            // InternalComponentInterface.g:1259:2: ( rule__ComponentInterface__RossubscriberAssignment_6_1_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_1_2()); 
            // InternalComponentInterface.g:1260:2: ( rule__ComponentInterface__RossubscriberAssignment_6_1_2 )
            // InternalComponentInterface.g:1260:3: rule__ComponentInterface__RossubscriberAssignment_6_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_6_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__3"
    // InternalComponentInterface.g:1268:1: rule__ComponentInterface__Group_6_1__3 : rule__ComponentInterface__Group_6_1__3__Impl rule__ComponentInterface__Group_6_1__4 ;
    public final void rule__ComponentInterface__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1272:1: ( rule__ComponentInterface__Group_6_1__3__Impl rule__ComponentInterface__Group_6_1__4 )
            // InternalComponentInterface.g:1273:2: rule__ComponentInterface__Group_6_1__3__Impl rule__ComponentInterface__Group_6_1__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__3__Impl"
    // InternalComponentInterface.g:1280:1: rule__ComponentInterface__Group_6_1__3__Impl : ( ( rule__ComponentInterface__Group_6_1_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1284:1: ( ( ( rule__ComponentInterface__Group_6_1_3__0 )* ) )
            // InternalComponentInterface.g:1285:1: ( ( rule__ComponentInterface__Group_6_1_3__0 )* )
            {
            // InternalComponentInterface.g:1285:1: ( ( rule__ComponentInterface__Group_6_1_3__0 )* )
            // InternalComponentInterface.g:1286:2: ( rule__ComponentInterface__Group_6_1_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_1_3()); 
            // InternalComponentInterface.g:1287:2: ( rule__ComponentInterface__Group_6_1_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentInterface.g:1287:3: rule__ComponentInterface__Group_6_1_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__4"
    // InternalComponentInterface.g:1295:1: rule__ComponentInterface__Group_6_1__4 : rule__ComponentInterface__Group_6_1__4__Impl ;
    public final void rule__ComponentInterface__Group_6_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1299:1: ( rule__ComponentInterface__Group_6_1__4__Impl )
            // InternalComponentInterface.g:1300:2: rule__ComponentInterface__Group_6_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_1__4__Impl"
    // InternalComponentInterface.g:1306:1: rule__ComponentInterface__Group_6_1__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1310:1: ( ( '}' ) )
            // InternalComponentInterface.g:1311:1: ( '}' )
            {
            // InternalComponentInterface.g:1311:1: ( '}' )
            // InternalComponentInterface.g:1312:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_1_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1_3__0"
    // InternalComponentInterface.g:1322:1: rule__ComponentInterface__Group_6_1_3__0 : rule__ComponentInterface__Group_6_1_3__0__Impl rule__ComponentInterface__Group_6_1_3__1 ;
    public final void rule__ComponentInterface__Group_6_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1326:1: ( rule__ComponentInterface__Group_6_1_3__0__Impl rule__ComponentInterface__Group_6_1_3__1 )
            // InternalComponentInterface.g:1327:2: rule__ComponentInterface__Group_6_1_3__0__Impl rule__ComponentInterface__Group_6_1_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_6_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_1_3__0__Impl"
    // InternalComponentInterface.g:1334:1: rule__ComponentInterface__Group_6_1_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1338:1: ( ( ',' ) )
            // InternalComponentInterface.g:1339:1: ( ',' )
            {
            // InternalComponentInterface.g:1339:1: ( ',' )
            // InternalComponentInterface.g:1340:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_1_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_1_3__1"
    // InternalComponentInterface.g:1349:1: rule__ComponentInterface__Group_6_1_3__1 : rule__ComponentInterface__Group_6_1_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1353:1: ( rule__ComponentInterface__Group_6_1_3__1__Impl )
            // InternalComponentInterface.g:1354:2: rule__ComponentInterface__Group_6_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_1_3__1__Impl"
    // InternalComponentInterface.g:1360:1: rule__ComponentInterface__Group_6_1_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1364:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 ) ) )
            // InternalComponentInterface.g:1365:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 ) )
            {
            // InternalComponentInterface.g:1365:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 ) )
            // InternalComponentInterface.g:1366:2: ( rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_1_3_1()); 
            // InternalComponentInterface.g:1367:2: ( rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 )
            // InternalComponentInterface.g:1367:3: rule__ComponentInterface__RossubscriberAssignment_6_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_6_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_1_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__0"
    // InternalComponentInterface.g:1376:1: rule__ComponentInterface__Group_6_2__0 : rule__ComponentInterface__Group_6_2__0__Impl rule__ComponentInterface__Group_6_2__1 ;
    public final void rule__ComponentInterface__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1380:1: ( rule__ComponentInterface__Group_6_2__0__Impl rule__ComponentInterface__Group_6_2__1 )
            // InternalComponentInterface.g:1381:2: rule__ComponentInterface__Group_6_2__0__Impl rule__ComponentInterface__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__0__Impl"
    // InternalComponentInterface.g:1388:1: rule__ComponentInterface__Group_6_2__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1392:1: ( ( 'RosSrvServers' ) )
            // InternalComponentInterface.g:1393:1: ( 'RosSrvServers' )
            {
            // InternalComponentInterface.g:1393:1: ( 'RosSrvServers' )
            // InternalComponentInterface.g:1394:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__1"
    // InternalComponentInterface.g:1403:1: rule__ComponentInterface__Group_6_2__1 : rule__ComponentInterface__Group_6_2__1__Impl rule__ComponentInterface__Group_6_2__2 ;
    public final void rule__ComponentInterface__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1407:1: ( rule__ComponentInterface__Group_6_2__1__Impl rule__ComponentInterface__Group_6_2__2 )
            // InternalComponentInterface.g:1408:2: rule__ComponentInterface__Group_6_2__1__Impl rule__ComponentInterface__Group_6_2__2
            {
            pushFollow(FOLLOW_12);
            rule__ComponentInterface__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__1__Impl"
    // InternalComponentInterface.g:1415:1: rule__ComponentInterface__Group_6_2__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1419:1: ( ( '{' ) )
            // InternalComponentInterface.g:1420:1: ( '{' )
            {
            // InternalComponentInterface.g:1420:1: ( '{' )
            // InternalComponentInterface.g:1421:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__2"
    // InternalComponentInterface.g:1430:1: rule__ComponentInterface__Group_6_2__2 : rule__ComponentInterface__Group_6_2__2__Impl rule__ComponentInterface__Group_6_2__3 ;
    public final void rule__ComponentInterface__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1434:1: ( rule__ComponentInterface__Group_6_2__2__Impl rule__ComponentInterface__Group_6_2__3 )
            // InternalComponentInterface.g:1435:2: rule__ComponentInterface__Group_6_2__2__Impl rule__ComponentInterface__Group_6_2__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__2__Impl"
    // InternalComponentInterface.g:1442:1: rule__ComponentInterface__Group_6_2__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1446:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_2 ) ) )
            // InternalComponentInterface.g:1447:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_2 ) )
            {
            // InternalComponentInterface.g:1447:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_2 ) )
            // InternalComponentInterface.g:1448:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2_2()); 
            // InternalComponentInterface.g:1449:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2_2 )
            // InternalComponentInterface.g:1449:3: rule__ComponentInterface__RosserviceserverAssignment_6_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_6_2_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__3"
    // InternalComponentInterface.g:1457:1: rule__ComponentInterface__Group_6_2__3 : rule__ComponentInterface__Group_6_2__3__Impl rule__ComponentInterface__Group_6_2__4 ;
    public final void rule__ComponentInterface__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1461:1: ( rule__ComponentInterface__Group_6_2__3__Impl rule__ComponentInterface__Group_6_2__4 )
            // InternalComponentInterface.g:1462:2: rule__ComponentInterface__Group_6_2__3__Impl rule__ComponentInterface__Group_6_2__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__3__Impl"
    // InternalComponentInterface.g:1469:1: rule__ComponentInterface__Group_6_2__3__Impl : ( ( rule__ComponentInterface__Group_6_2_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1473:1: ( ( ( rule__ComponentInterface__Group_6_2_3__0 )* ) )
            // InternalComponentInterface.g:1474:1: ( ( rule__ComponentInterface__Group_6_2_3__0 )* )
            {
            // InternalComponentInterface.g:1474:1: ( ( rule__ComponentInterface__Group_6_2_3__0 )* )
            // InternalComponentInterface.g:1475:2: ( rule__ComponentInterface__Group_6_2_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_2_3()); 
            // InternalComponentInterface.g:1476:2: ( rule__ComponentInterface__Group_6_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentInterface.g:1476:3: rule__ComponentInterface__Group_6_2_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__4"
    // InternalComponentInterface.g:1484:1: rule__ComponentInterface__Group_6_2__4 : rule__ComponentInterface__Group_6_2__4__Impl ;
    public final void rule__ComponentInterface__Group_6_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1488:1: ( rule__ComponentInterface__Group_6_2__4__Impl )
            // InternalComponentInterface.g:1489:2: rule__ComponentInterface__Group_6_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_2__4__Impl"
    // InternalComponentInterface.g:1495:1: rule__ComponentInterface__Group_6_2__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1499:1: ( ( '}' ) )
            // InternalComponentInterface.g:1500:1: ( '}' )
            {
            // InternalComponentInterface.g:1500:1: ( '}' )
            // InternalComponentInterface.g:1501:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2_3__0"
    // InternalComponentInterface.g:1511:1: rule__ComponentInterface__Group_6_2_3__0 : rule__ComponentInterface__Group_6_2_3__0__Impl rule__ComponentInterface__Group_6_2_3__1 ;
    public final void rule__ComponentInterface__Group_6_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1515:1: ( rule__ComponentInterface__Group_6_2_3__0__Impl rule__ComponentInterface__Group_6_2_3__1 )
            // InternalComponentInterface.g:1516:2: rule__ComponentInterface__Group_6_2_3__0__Impl rule__ComponentInterface__Group_6_2_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentInterface__Group_6_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_2_3__0__Impl"
    // InternalComponentInterface.g:1523:1: rule__ComponentInterface__Group_6_2_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1527:1: ( ( ',' ) )
            // InternalComponentInterface.g:1528:1: ( ',' )
            {
            // InternalComponentInterface.g:1528:1: ( ',' )
            // InternalComponentInterface.g:1529:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_2_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_2_3__1"
    // InternalComponentInterface.g:1538:1: rule__ComponentInterface__Group_6_2_3__1 : rule__ComponentInterface__Group_6_2_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1542:1: ( rule__ComponentInterface__Group_6_2_3__1__Impl )
            // InternalComponentInterface.g:1543:2: rule__ComponentInterface__Group_6_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_2_3__1__Impl"
    // InternalComponentInterface.g:1549:1: rule__ComponentInterface__Group_6_2_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1553:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 ) ) )
            // InternalComponentInterface.g:1554:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 ) )
            {
            // InternalComponentInterface.g:1554:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 ) )
            // InternalComponentInterface.g:1555:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2_3_1()); 
            // InternalComponentInterface.g:1556:2: ( rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 )
            // InternalComponentInterface.g:1556:3: rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_2_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__0"
    // InternalComponentInterface.g:1565:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1569:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalComponentInterface.g:1570:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:1577:1: rule__ComponentInterface__Group_6_3__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1581:1: ( ( 'RosSrvClients' ) )
            // InternalComponentInterface.g:1582:1: ( 'RosSrvClients' )
            {
            // InternalComponentInterface.g:1582:1: ( 'RosSrvClients' )
            // InternalComponentInterface.g:1583:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_6_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_6_3_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1592:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl rule__ComponentInterface__Group_6_3__2 ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1596:1: ( rule__ComponentInterface__Group_6_3__1__Impl rule__ComponentInterface__Group_6_3__2 )
            // InternalComponentInterface.g:1597:2: rule__ComponentInterface__Group_6_3__1__Impl rule__ComponentInterface__Group_6_3__2
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInterface__Group_6_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__2();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:1604:1: rule__ComponentInterface__Group_6_3__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1608:1: ( ( '{' ) )
            // InternalComponentInterface.g:1609:1: ( '{' )
            {
            // InternalComponentInterface.g:1609:1: ( '{' )
            // InternalComponentInterface.g:1610:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_6_3__2"
    // InternalComponentInterface.g:1619:1: rule__ComponentInterface__Group_6_3__2 : rule__ComponentInterface__Group_6_3__2__Impl rule__ComponentInterface__Group_6_3__3 ;
    public final void rule__ComponentInterface__Group_6_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1623:1: ( rule__ComponentInterface__Group_6_3__2__Impl rule__ComponentInterface__Group_6_3__3 )
            // InternalComponentInterface.g:1624:2: rule__ComponentInterface__Group_6_3__2__Impl rule__ComponentInterface__Group_6_3__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__2__Impl"
    // InternalComponentInterface.g:1631:1: rule__ComponentInterface__Group_6_3__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1635:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_2 ) ) )
            // InternalComponentInterface.g:1636:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_2 ) )
            {
            // InternalComponentInterface.g:1636:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_2 ) )
            // InternalComponentInterface.g:1637:2: ( rule__ComponentInterface__RosserviceclientAssignment_6_3_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_6_3_2()); 
            // InternalComponentInterface.g:1638:2: ( rule__ComponentInterface__RosserviceclientAssignment_6_3_2 )
            // InternalComponentInterface.g:1638:3: rule__ComponentInterface__RosserviceclientAssignment_6_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_6_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_6_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__3"
    // InternalComponentInterface.g:1646:1: rule__ComponentInterface__Group_6_3__3 : rule__ComponentInterface__Group_6_3__3__Impl rule__ComponentInterface__Group_6_3__4 ;
    public final void rule__ComponentInterface__Group_6_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1650:1: ( rule__ComponentInterface__Group_6_3__3__Impl rule__ComponentInterface__Group_6_3__4 )
            // InternalComponentInterface.g:1651:2: rule__ComponentInterface__Group_6_3__3__Impl rule__ComponentInterface__Group_6_3__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__3__Impl"
    // InternalComponentInterface.g:1658:1: rule__ComponentInterface__Group_6_3__3__Impl : ( ( rule__ComponentInterface__Group_6_3_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1662:1: ( ( ( rule__ComponentInterface__Group_6_3_3__0 )* ) )
            // InternalComponentInterface.g:1663:1: ( ( rule__ComponentInterface__Group_6_3_3__0 )* )
            {
            // InternalComponentInterface.g:1663:1: ( ( rule__ComponentInterface__Group_6_3_3__0 )* )
            // InternalComponentInterface.g:1664:2: ( rule__ComponentInterface__Group_6_3_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3_3()); 
            // InternalComponentInterface.g:1665:2: ( rule__ComponentInterface__Group_6_3_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentInterface.g:1665:3: rule__ComponentInterface__Group_6_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__4"
    // InternalComponentInterface.g:1673:1: rule__ComponentInterface__Group_6_3__4 : rule__ComponentInterface__Group_6_3__4__Impl ;
    public final void rule__ComponentInterface__Group_6_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1677:1: ( rule__ComponentInterface__Group_6_3__4__Impl )
            // InternalComponentInterface.g:1678:2: rule__ComponentInterface__Group_6_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__4__Impl"
    // InternalComponentInterface.g:1684:1: rule__ComponentInterface__Group_6_3__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1688:1: ( ( '}' ) )
            // InternalComponentInterface.g:1689:1: ( '}' )
            {
            // InternalComponentInterface.g:1689:1: ( '}' )
            // InternalComponentInterface.g:1690:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_3_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3_3__0"
    // InternalComponentInterface.g:1700:1: rule__ComponentInterface__Group_6_3_3__0 : rule__ComponentInterface__Group_6_3_3__0__Impl rule__ComponentInterface__Group_6_3_3__1 ;
    public final void rule__ComponentInterface__Group_6_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1704:1: ( rule__ComponentInterface__Group_6_3_3__0__Impl rule__ComponentInterface__Group_6_3_3__1 )
            // InternalComponentInterface.g:1705:2: rule__ComponentInterface__Group_6_3_3__0__Impl rule__ComponentInterface__Group_6_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInterface__Group_6_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_3_3__0__Impl"
    // InternalComponentInterface.g:1712:1: rule__ComponentInterface__Group_6_3_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1716:1: ( ( ',' ) )
            // InternalComponentInterface.g:1717:1: ( ',' )
            {
            // InternalComponentInterface.g:1717:1: ( ',' )
            // InternalComponentInterface.g:1718:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3_3__1"
    // InternalComponentInterface.g:1727:1: rule__ComponentInterface__Group_6_3_3__1 : rule__ComponentInterface__Group_6_3_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1731:1: ( rule__ComponentInterface__Group_6_3_3__1__Impl )
            // InternalComponentInterface.g:1732:2: rule__ComponentInterface__Group_6_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_3_3__1__Impl"
    // InternalComponentInterface.g:1738:1: rule__ComponentInterface__Group_6_3_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1742:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 ) ) )
            // InternalComponentInterface.g:1743:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 ) )
            {
            // InternalComponentInterface.g:1743:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 ) )
            // InternalComponentInterface.g:1744:2: ( rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_6_3_3_1()); 
            // InternalComponentInterface.g:1745:2: ( rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 )
            // InternalComponentInterface.g:1745:3: rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_6_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__0"
    // InternalComponentInterface.g:1754:1: rule__ComponentInterface__Group_6_4__0 : rule__ComponentInterface__Group_6_4__0__Impl rule__ComponentInterface__Group_6_4__1 ;
    public final void rule__ComponentInterface__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1758:1: ( rule__ComponentInterface__Group_6_4__0__Impl rule__ComponentInterface__Group_6_4__1 )
            // InternalComponentInterface.g:1759:2: rule__ComponentInterface__Group_6_4__0__Impl rule__ComponentInterface__Group_6_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__0__Impl"
    // InternalComponentInterface.g:1766:1: rule__ComponentInterface__Group_6_4__0__Impl : ( 'RosActionServers' ) ;
    public final void rule__ComponentInterface__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1770:1: ( ( 'RosActionServers' ) )
            // InternalComponentInterface.g:1771:1: ( 'RosActionServers' )
            {
            // InternalComponentInterface.g:1771:1: ( 'RosActionServers' )
            // InternalComponentInterface.g:1772:2: 'RosActionServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_6_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__1"
    // InternalComponentInterface.g:1781:1: rule__ComponentInterface__Group_6_4__1 : rule__ComponentInterface__Group_6_4__1__Impl rule__ComponentInterface__Group_6_4__2 ;
    public final void rule__ComponentInterface__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1785:1: ( rule__ComponentInterface__Group_6_4__1__Impl rule__ComponentInterface__Group_6_4__2 )
            // InternalComponentInterface.g:1786:2: rule__ComponentInterface__Group_6_4__1__Impl rule__ComponentInterface__Group_6_4__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInterface__Group_6_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__1__Impl"
    // InternalComponentInterface.g:1793:1: rule__ComponentInterface__Group_6_4__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1797:1: ( ( '{' ) )
            // InternalComponentInterface.g:1798:1: ( '{' )
            {
            // InternalComponentInterface.g:1798:1: ( '{' )
            // InternalComponentInterface.g:1799:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__2"
    // InternalComponentInterface.g:1808:1: rule__ComponentInterface__Group_6_4__2 : rule__ComponentInterface__Group_6_4__2__Impl rule__ComponentInterface__Group_6_4__3 ;
    public final void rule__ComponentInterface__Group_6_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1812:1: ( rule__ComponentInterface__Group_6_4__2__Impl rule__ComponentInterface__Group_6_4__3 )
            // InternalComponentInterface.g:1813:2: rule__ComponentInterface__Group_6_4__2__Impl rule__ComponentInterface__Group_6_4__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__2__Impl"
    // InternalComponentInterface.g:1820:1: rule__ComponentInterface__Group_6_4__2__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1824:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_2 ) ) )
            // InternalComponentInterface.g:1825:1: ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_2 ) )
            {
            // InternalComponentInterface.g:1825:1: ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_2 ) )
            // InternalComponentInterface.g:1826:2: ( rule__ComponentInterface__RosactionserverAssignment_6_4_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_6_4_2()); 
            // InternalComponentInterface.g:1827:2: ( rule__ComponentInterface__RosactionserverAssignment_6_4_2 )
            // InternalComponentInterface.g:1827:3: rule__ComponentInterface__RosactionserverAssignment_6_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionserverAssignment_6_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_6_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__3"
    // InternalComponentInterface.g:1835:1: rule__ComponentInterface__Group_6_4__3 : rule__ComponentInterface__Group_6_4__3__Impl rule__ComponentInterface__Group_6_4__4 ;
    public final void rule__ComponentInterface__Group_6_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1839:1: ( rule__ComponentInterface__Group_6_4__3__Impl rule__ComponentInterface__Group_6_4__4 )
            // InternalComponentInterface.g:1840:2: rule__ComponentInterface__Group_6_4__3__Impl rule__ComponentInterface__Group_6_4__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__3__Impl"
    // InternalComponentInterface.g:1847:1: rule__ComponentInterface__Group_6_4__3__Impl : ( ( rule__ComponentInterface__Group_6_4_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1851:1: ( ( ( rule__ComponentInterface__Group_6_4_3__0 )* ) )
            // InternalComponentInterface.g:1852:1: ( ( rule__ComponentInterface__Group_6_4_3__0 )* )
            {
            // InternalComponentInterface.g:1852:1: ( ( rule__ComponentInterface__Group_6_4_3__0 )* )
            // InternalComponentInterface.g:1853:2: ( rule__ComponentInterface__Group_6_4_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_4_3()); 
            // InternalComponentInterface.g:1854:2: ( rule__ComponentInterface__Group_6_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentInterface.g:1854:3: rule__ComponentInterface__Group_6_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__4"
    // InternalComponentInterface.g:1862:1: rule__ComponentInterface__Group_6_4__4 : rule__ComponentInterface__Group_6_4__4__Impl ;
    public final void rule__ComponentInterface__Group_6_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1866:1: ( rule__ComponentInterface__Group_6_4__4__Impl )
            // InternalComponentInterface.g:1867:2: rule__ComponentInterface__Group_6_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_4__4__Impl"
    // InternalComponentInterface.g:1873:1: rule__ComponentInterface__Group_6_4__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1877:1: ( ( '}' ) )
            // InternalComponentInterface.g:1878:1: ( '}' )
            {
            // InternalComponentInterface.g:1878:1: ( '}' )
            // InternalComponentInterface.g:1879:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4_3__0"
    // InternalComponentInterface.g:1889:1: rule__ComponentInterface__Group_6_4_3__0 : rule__ComponentInterface__Group_6_4_3__0__Impl rule__ComponentInterface__Group_6_4_3__1 ;
    public final void rule__ComponentInterface__Group_6_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1893:1: ( rule__ComponentInterface__Group_6_4_3__0__Impl rule__ComponentInterface__Group_6_4_3__1 )
            // InternalComponentInterface.g:1894:2: rule__ComponentInterface__Group_6_4_3__0__Impl rule__ComponentInterface__Group_6_4_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInterface__Group_6_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_4_3__0__Impl"
    // InternalComponentInterface.g:1901:1: rule__ComponentInterface__Group_6_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1905:1: ( ( ',' ) )
            // InternalComponentInterface.g:1906:1: ( ',' )
            {
            // InternalComponentInterface.g:1906:1: ( ',' )
            // InternalComponentInterface.g:1907:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_4_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_4_3__1"
    // InternalComponentInterface.g:1916:1: rule__ComponentInterface__Group_6_4_3__1 : rule__ComponentInterface__Group_6_4_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1920:1: ( rule__ComponentInterface__Group_6_4_3__1__Impl )
            // InternalComponentInterface.g:1921:2: rule__ComponentInterface__Group_6_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_4_3__1__Impl"
    // InternalComponentInterface.g:1927:1: rule__ComponentInterface__Group_6_4_3__1__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1931:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 ) ) )
            // InternalComponentInterface.g:1932:1: ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 ) )
            {
            // InternalComponentInterface.g:1932:1: ( ( rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 ) )
            // InternalComponentInterface.g:1933:2: ( rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_6_4_3_1()); 
            // InternalComponentInterface.g:1934:2: ( rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 )
            // InternalComponentInterface.g:1934:3: rule__ComponentInterface__RosactionserverAssignment_6_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionserverAssignment_6_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_6_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_4_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__0"
    // InternalComponentInterface.g:1943:1: rule__ComponentInterface__Group_6_5__0 : rule__ComponentInterface__Group_6_5__0__Impl rule__ComponentInterface__Group_6_5__1 ;
    public final void rule__ComponentInterface__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1947:1: ( rule__ComponentInterface__Group_6_5__0__Impl rule__ComponentInterface__Group_6_5__1 )
            // InternalComponentInterface.g:1948:2: rule__ComponentInterface__Group_6_5__0__Impl rule__ComponentInterface__Group_6_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__0__Impl"
    // InternalComponentInterface.g:1955:1: rule__ComponentInterface__Group_6_5__0__Impl : ( 'RosActionClients' ) ;
    public final void rule__ComponentInterface__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1959:1: ( ( 'RosActionClients' ) )
            // InternalComponentInterface.g:1960:1: ( 'RosActionClients' )
            {
            // InternalComponentInterface.g:1960:1: ( 'RosActionClients' )
            // InternalComponentInterface.g:1961:2: 'RosActionClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_6_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__1"
    // InternalComponentInterface.g:1970:1: rule__ComponentInterface__Group_6_5__1 : rule__ComponentInterface__Group_6_5__1__Impl rule__ComponentInterface__Group_6_5__2 ;
    public final void rule__ComponentInterface__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1974:1: ( rule__ComponentInterface__Group_6_5__1__Impl rule__ComponentInterface__Group_6_5__2 )
            // InternalComponentInterface.g:1975:2: rule__ComponentInterface__Group_6_5__1__Impl rule__ComponentInterface__Group_6_5__2
            {
            pushFollow(FOLLOW_15);
            rule__ComponentInterface__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__1__Impl"
    // InternalComponentInterface.g:1982:1: rule__ComponentInterface__Group_6_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1986:1: ( ( '{' ) )
            // InternalComponentInterface.g:1987:1: ( '{' )
            {
            // InternalComponentInterface.g:1987:1: ( '{' )
            // InternalComponentInterface.g:1988:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__2"
    // InternalComponentInterface.g:1997:1: rule__ComponentInterface__Group_6_5__2 : rule__ComponentInterface__Group_6_5__2__Impl rule__ComponentInterface__Group_6_5__3 ;
    public final void rule__ComponentInterface__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2001:1: ( rule__ComponentInterface__Group_6_5__2__Impl rule__ComponentInterface__Group_6_5__3 )
            // InternalComponentInterface.g:2002:2: rule__ComponentInterface__Group_6_5__2__Impl rule__ComponentInterface__Group_6_5__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__2__Impl"
    // InternalComponentInterface.g:2009:1: rule__ComponentInterface__Group_6_5__2__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2013:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_2 ) ) )
            // InternalComponentInterface.g:2014:1: ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_2 ) )
            {
            // InternalComponentInterface.g:2014:1: ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_2 ) )
            // InternalComponentInterface.g:2015:2: ( rule__ComponentInterface__RosactionclientAssignment_6_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_6_5_2()); 
            // InternalComponentInterface.g:2016:2: ( rule__ComponentInterface__RosactionclientAssignment_6_5_2 )
            // InternalComponentInterface.g:2016:3: rule__ComponentInterface__RosactionclientAssignment_6_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionclientAssignment_6_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_6_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__3"
    // InternalComponentInterface.g:2024:1: rule__ComponentInterface__Group_6_5__3 : rule__ComponentInterface__Group_6_5__3__Impl rule__ComponentInterface__Group_6_5__4 ;
    public final void rule__ComponentInterface__Group_6_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2028:1: ( rule__ComponentInterface__Group_6_5__3__Impl rule__ComponentInterface__Group_6_5__4 )
            // InternalComponentInterface.g:2029:2: rule__ComponentInterface__Group_6_5__3__Impl rule__ComponentInterface__Group_6_5__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__3__Impl"
    // InternalComponentInterface.g:2036:1: rule__ComponentInterface__Group_6_5__3__Impl : ( ( rule__ComponentInterface__Group_6_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2040:1: ( ( ( rule__ComponentInterface__Group_6_5_3__0 )* ) )
            // InternalComponentInterface.g:2041:1: ( ( rule__ComponentInterface__Group_6_5_3__0 )* )
            {
            // InternalComponentInterface.g:2041:1: ( ( rule__ComponentInterface__Group_6_5_3__0 )* )
            // InternalComponentInterface.g:2042:2: ( rule__ComponentInterface__Group_6_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_5_3()); 
            // InternalComponentInterface.g:2043:2: ( rule__ComponentInterface__Group_6_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:2043:3: rule__ComponentInterface__Group_6_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__4"
    // InternalComponentInterface.g:2051:1: rule__ComponentInterface__Group_6_5__4 : rule__ComponentInterface__Group_6_5__4__Impl ;
    public final void rule__ComponentInterface__Group_6_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2055:1: ( rule__ComponentInterface__Group_6_5__4__Impl )
            // InternalComponentInterface.g:2056:2: rule__ComponentInterface__Group_6_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_5__4__Impl"
    // InternalComponentInterface.g:2062:1: rule__ComponentInterface__Group_6_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2066:1: ( ( '}' ) )
            // InternalComponentInterface.g:2067:1: ( '}' )
            {
            // InternalComponentInterface.g:2067:1: ( '}' )
            // InternalComponentInterface.g:2068:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5_3__0"
    // InternalComponentInterface.g:2078:1: rule__ComponentInterface__Group_6_5_3__0 : rule__ComponentInterface__Group_6_5_3__0__Impl rule__ComponentInterface__Group_6_5_3__1 ;
    public final void rule__ComponentInterface__Group_6_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2082:1: ( rule__ComponentInterface__Group_6_5_3__0__Impl rule__ComponentInterface__Group_6_5_3__1 )
            // InternalComponentInterface.g:2083:2: rule__ComponentInterface__Group_6_5_3__0__Impl rule__ComponentInterface__Group_6_5_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ComponentInterface__Group_6_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_5_3__0__Impl"
    // InternalComponentInterface.g:2090:1: rule__ComponentInterface__Group_6_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2094:1: ( ( ',' ) )
            // InternalComponentInterface.g:2095:1: ( ',' )
            {
            // InternalComponentInterface.g:2095:1: ( ',' )
            // InternalComponentInterface.g:2096:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_5_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_5_3__1"
    // InternalComponentInterface.g:2105:1: rule__ComponentInterface__Group_6_5_3__1 : rule__ComponentInterface__Group_6_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2109:1: ( rule__ComponentInterface__Group_6_5_3__1__Impl )
            // InternalComponentInterface.g:2110:2: rule__ComponentInterface__Group_6_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_5_3__1__Impl"
    // InternalComponentInterface.g:2116:1: rule__ComponentInterface__Group_6_5_3__1__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2120:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 ) ) )
            // InternalComponentInterface.g:2121:1: ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 ) )
            {
            // InternalComponentInterface.g:2121:1: ( ( rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 ) )
            // InternalComponentInterface.g:2122:2: ( rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_6_5_3_1()); 
            // InternalComponentInterface.g:2123:2: ( rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 )
            // InternalComponentInterface.g:2123:3: rule__ComponentInterface__RosactionclientAssignment_6_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionclientAssignment_6_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_6_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_5_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__0"
    // InternalComponentInterface.g:2132:1: rule__ComponentInterface__Group_6_6__0 : rule__ComponentInterface__Group_6_6__0__Impl rule__ComponentInterface__Group_6_6__1 ;
    public final void rule__ComponentInterface__Group_6_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2136:1: ( rule__ComponentInterface__Group_6_6__0__Impl rule__ComponentInterface__Group_6_6__1 )
            // InternalComponentInterface.g:2137:2: rule__ComponentInterface__Group_6_6__0__Impl rule__ComponentInterface__Group_6_6__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__0__Impl"
    // InternalComponentInterface.g:2144:1: rule__ComponentInterface__Group_6_6__0__Impl : ( 'RosParameters' ) ;
    public final void rule__ComponentInterface__Group_6_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2148:1: ( ( 'RosParameters' ) )
            // InternalComponentInterface.g:2149:1: ( 'RosParameters' )
            {
            // InternalComponentInterface.g:2149:1: ( 'RosParameters' )
            // InternalComponentInterface.g:2150:2: 'RosParameters'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_6_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_6_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__1"
    // InternalComponentInterface.g:2159:1: rule__ComponentInterface__Group_6_6__1 : rule__ComponentInterface__Group_6_6__1__Impl rule__ComponentInterface__Group_6_6__2 ;
    public final void rule__ComponentInterface__Group_6_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2163:1: ( rule__ComponentInterface__Group_6_6__1__Impl rule__ComponentInterface__Group_6_6__2 )
            // InternalComponentInterface.g:2164:2: rule__ComponentInterface__Group_6_6__1__Impl rule__ComponentInterface__Group_6_6__2
            {
            pushFollow(FOLLOW_16);
            rule__ComponentInterface__Group_6_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__1__Impl"
    // InternalComponentInterface.g:2171:1: rule__ComponentInterface__Group_6_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2175:1: ( ( '{' ) )
            // InternalComponentInterface.g:2176:1: ( '{' )
            {
            // InternalComponentInterface.g:2176:1: ( '{' )
            // InternalComponentInterface.g:2177:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__2"
    // InternalComponentInterface.g:2186:1: rule__ComponentInterface__Group_6_6__2 : rule__ComponentInterface__Group_6_6__2__Impl rule__ComponentInterface__Group_6_6__3 ;
    public final void rule__ComponentInterface__Group_6_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2190:1: ( rule__ComponentInterface__Group_6_6__2__Impl rule__ComponentInterface__Group_6_6__3 )
            // InternalComponentInterface.g:2191:2: rule__ComponentInterface__Group_6_6__2__Impl rule__ComponentInterface__Group_6_6__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__2"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__2__Impl"
    // InternalComponentInterface.g:2198:1: rule__ComponentInterface__Group_6_6__2__Impl : ( ( rule__ComponentInterface__RosparameterAssignment_6_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2202:1: ( ( ( rule__ComponentInterface__RosparameterAssignment_6_6_2 ) ) )
            // InternalComponentInterface.g:2203:1: ( ( rule__ComponentInterface__RosparameterAssignment_6_6_2 ) )
            {
            // InternalComponentInterface.g:2203:1: ( ( rule__ComponentInterface__RosparameterAssignment_6_6_2 ) )
            // InternalComponentInterface.g:2204:2: ( rule__ComponentInterface__RosparameterAssignment_6_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_6_6_2()); 
            // InternalComponentInterface.g:2205:2: ( rule__ComponentInterface__RosparameterAssignment_6_6_2 )
            // InternalComponentInterface.g:2205:3: rule__ComponentInterface__RosparameterAssignment_6_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosparameterAssignment_6_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_6_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__3"
    // InternalComponentInterface.g:2213:1: rule__ComponentInterface__Group_6_6__3 : rule__ComponentInterface__Group_6_6__3__Impl rule__ComponentInterface__Group_6_6__4 ;
    public final void rule__ComponentInterface__Group_6_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2217:1: ( rule__ComponentInterface__Group_6_6__3__Impl rule__ComponentInterface__Group_6_6__4 )
            // InternalComponentInterface.g:2218:2: rule__ComponentInterface__Group_6_6__3__Impl rule__ComponentInterface__Group_6_6__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__3"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__3__Impl"
    // InternalComponentInterface.g:2225:1: rule__ComponentInterface__Group_6_6__3__Impl : ( ( rule__ComponentInterface__Group_6_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2229:1: ( ( ( rule__ComponentInterface__Group_6_6_3__0 )* ) )
            // InternalComponentInterface.g:2230:1: ( ( rule__ComponentInterface__Group_6_6_3__0 )* )
            {
            // InternalComponentInterface.g:2230:1: ( ( rule__ComponentInterface__Group_6_6_3__0 )* )
            // InternalComponentInterface.g:2231:2: ( rule__ComponentInterface__Group_6_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_6_3()); 
            // InternalComponentInterface.g:2232:2: ( rule__ComponentInterface__Group_6_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:2232:3: rule__ComponentInterface__Group_6_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__4"
    // InternalComponentInterface.g:2240:1: rule__ComponentInterface__Group_6_6__4 : rule__ComponentInterface__Group_6_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2244:1: ( rule__ComponentInterface__Group_6_6__4__Impl )
            // InternalComponentInterface.g:2245:2: rule__ComponentInterface__Group_6_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__4"


    // $ANTLR start "rule__ComponentInterface__Group_6_6__4__Impl"
    // InternalComponentInterface.g:2251:1: rule__ComponentInterface__Group_6_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2255:1: ( ( '}' ) )
            // InternalComponentInterface.g:2256:1: ( '}' )
            {
            // InternalComponentInterface.g:2256:1: ( '}' )
            // InternalComponentInterface.g:2257:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_6_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6_3__0"
    // InternalComponentInterface.g:2267:1: rule__ComponentInterface__Group_6_6_3__0 : rule__ComponentInterface__Group_6_6_3__0__Impl rule__ComponentInterface__Group_6_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2271:1: ( rule__ComponentInterface__Group_6_6_3__0__Impl rule__ComponentInterface__Group_6_6_3__1 )
            // InternalComponentInterface.g:2272:2: rule__ComponentInterface__Group_6_6_3__0__Impl rule__ComponentInterface__Group_6_6_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ComponentInterface__Group_6_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_6_3__0__Impl"
    // InternalComponentInterface.g:2279:1: rule__ComponentInterface__Group_6_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2283:1: ( ( ',' ) )
            // InternalComponentInterface.g:2284:1: ( ',' )
            {
            // InternalComponentInterface.g:2284:1: ( ',' )
            // InternalComponentInterface.g:2285:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_6_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_6_3__1"
    // InternalComponentInterface.g:2294:1: rule__ComponentInterface__Group_6_6_3__1 : rule__ComponentInterface__Group_6_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2298:1: ( rule__ComponentInterface__Group_6_6_3__1__Impl )
            // InternalComponentInterface.g:2299:2: rule__ComponentInterface__Group_6_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_6_3__1__Impl"
    // InternalComponentInterface.g:2305:1: rule__ComponentInterface__Group_6_6_3__1__Impl : ( ( rule__ComponentInterface__RosparameterAssignment_6_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2309:1: ( ( ( rule__ComponentInterface__RosparameterAssignment_6_6_3_1 ) ) )
            // InternalComponentInterface.g:2310:1: ( ( rule__ComponentInterface__RosparameterAssignment_6_6_3_1 ) )
            {
            // InternalComponentInterface.g:2310:1: ( ( rule__ComponentInterface__RosparameterAssignment_6_6_3_1 ) )
            // InternalComponentInterface.g:2311:2: ( rule__ComponentInterface__RosparameterAssignment_6_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_6_6_3_1()); 
            // InternalComponentInterface.g:2312:2: ( rule__ComponentInterface__RosparameterAssignment_6_6_3_1 )
            // InternalComponentInterface.g:2312:3: rule__ComponentInterface__RosparameterAssignment_6_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosparameterAssignment_6_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_6_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_6_3__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__0"
    // InternalComponentInterface.g:2321:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2325:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalComponentInterface.g:2326:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:2333:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2337:1: ( ( () ) )
            // InternalComponentInterface.g:2338:1: ( () )
            {
            // InternalComponentInterface.g:2338:1: ( () )
            // InternalComponentInterface.g:2339:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:2340:2: ()
            // InternalComponentInterface.g:2340:3: 
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
    // InternalComponentInterface.g:2348:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2352:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalComponentInterface.g:2353:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2360:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2364:1: ( ( 'RosPublisher' ) )
            // InternalComponentInterface.g:2365:1: ( 'RosPublisher' )
            {
            // InternalComponentInterface.g:2365:1: ( 'RosPublisher' )
            // InternalComponentInterface.g:2366:2: 'RosPublisher'
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
    // InternalComponentInterface.g:2375:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2379:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalComponentInterface.g:2380:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2387:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2391:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2392:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2392:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalComponentInterface.g:2393:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2394:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:2394:3: rule__RosPublisher__NameAssignment_2
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
    // InternalComponentInterface.g:2402:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2406:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalComponentInterface.g:2407:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentInterface.g:2414:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2418:1: ( ( '{' ) )
            // InternalComponentInterface.g:2419:1: ( '{' )
            {
            // InternalComponentInterface.g:2419:1: ( '{' )
            // InternalComponentInterface.g:2420:2: '{'
            {
             before(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:2429:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2433:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalComponentInterface.g:2434:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentInterface.g:2441:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2445:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:2446:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2446:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalComponentInterface.g:2447:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:2448:2: ( rule__RosPublisher__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:2448:3: rule__RosPublisher__Group_4__0
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
    // InternalComponentInterface.g:2456:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2460:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalComponentInterface.g:2461:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
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
    // InternalComponentInterface.g:2468:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2472:1: ( ( 'RefPublisher' ) )
            // InternalComponentInterface.g:2473:1: ( 'RefPublisher' )
            {
            // InternalComponentInterface.g:2473:1: ( 'RefPublisher' )
            // InternalComponentInterface.g:2474:2: 'RefPublisher'
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
    // InternalComponentInterface.g:2483:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2487:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalComponentInterface.g:2488:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:2495:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2499:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalComponentInterface.g:2500:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalComponentInterface.g:2500:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalComponentInterface.g:2501:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalComponentInterface.g:2502:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalComponentInterface.g:2502:3: rule__RosPublisher__PublisherAssignment_6
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
    // InternalComponentInterface.g:2510:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2514:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalComponentInterface.g:2515:2: rule__RosPublisher__Group__7__Impl
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
    // InternalComponentInterface.g:2521:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2525:1: ( ( '}' ) )
            // InternalComponentInterface.g:2526:1: ( '}' )
            {
            // InternalComponentInterface.g:2526:1: ( '}' )
            // InternalComponentInterface.g:2527:2: '}'
            {
             before(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:2537:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2541:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalComponentInterface.g:2542:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
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
    // InternalComponentInterface.g:2549:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2553:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2554:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2554:1: ( 'ns' )
            // InternalComponentInterface.g:2555:2: 'ns'
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
    // InternalComponentInterface.g:2564:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2568:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalComponentInterface.g:2569:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalComponentInterface.g:2575:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2579:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2580:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2580:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2581:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2582:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalComponentInterface.g:2582:3: rule__RosPublisher__NsAssignment_4_1
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
    // InternalComponentInterface.g:2591:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2595:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalComponentInterface.g:2596:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentInterface.g:2603:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2607:1: ( ( () ) )
            // InternalComponentInterface.g:2608:1: ( () )
            {
            // InternalComponentInterface.g:2608:1: ( () )
            // InternalComponentInterface.g:2609:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:2610:2: ()
            // InternalComponentInterface.g:2610:3: 
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
    // InternalComponentInterface.g:2618:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2622:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalComponentInterface.g:2623:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2630:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2634:1: ( ( 'RosSubscriber' ) )
            // InternalComponentInterface.g:2635:1: ( 'RosSubscriber' )
            {
            // InternalComponentInterface.g:2635:1: ( 'RosSubscriber' )
            // InternalComponentInterface.g:2636:2: 'RosSubscriber'
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
    // InternalComponentInterface.g:2645:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2649:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalComponentInterface.g:2650:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2657:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2661:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2662:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2662:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalComponentInterface.g:2663:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2664:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:2664:3: rule__RosSubscriber__NameAssignment_2
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
    // InternalComponentInterface.g:2672:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2676:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalComponentInterface.g:2677:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2684:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2688:1: ( ( '{' ) )
            // InternalComponentInterface.g:2689:1: ( '{' )
            {
            // InternalComponentInterface.g:2689:1: ( '{' )
            // InternalComponentInterface.g:2690:2: '{'
            {
             before(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:2699:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2703:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalComponentInterface.g:2704:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2711:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2715:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2716:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2716:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2717:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2718:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:2718:3: rule__RosSubscriber__Group_4__0
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
    // InternalComponentInterface.g:2726:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2730:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalComponentInterface.g:2731:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
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
    // InternalComponentInterface.g:2738:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2742:1: ( ( 'RefSubscriber' ) )
            // InternalComponentInterface.g:2743:1: ( 'RefSubscriber' )
            {
            // InternalComponentInterface.g:2743:1: ( 'RefSubscriber' )
            // InternalComponentInterface.g:2744:2: 'RefSubscriber'
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
    // InternalComponentInterface.g:2753:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2757:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalComponentInterface.g:2758:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:2765:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2769:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalComponentInterface.g:2770:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalComponentInterface.g:2770:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalComponentInterface.g:2771:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalComponentInterface.g:2772:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalComponentInterface.g:2772:3: rule__RosSubscriber__SubscriberAssignment_6
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
    // InternalComponentInterface.g:2780:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2784:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalComponentInterface.g:2785:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalComponentInterface.g:2791:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2795:1: ( ( '}' ) )
            // InternalComponentInterface.g:2796:1: ( '}' )
            {
            // InternalComponentInterface.g:2796:1: ( '}' )
            // InternalComponentInterface.g:2797:2: '}'
            {
             before(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:2807:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2811:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalComponentInterface.g:2812:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
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
    // InternalComponentInterface.g:2819:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2823:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2824:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2824:1: ( 'ns' )
            // InternalComponentInterface.g:2825:2: 'ns'
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
    // InternalComponentInterface.g:2834:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2838:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:2839:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalComponentInterface.g:2845:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2849:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2850:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2850:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2851:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2852:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalComponentInterface.g:2852:3: rule__RosSubscriber__NsAssignment_4_1
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
    // InternalComponentInterface.g:2861:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2865:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalComponentInterface.g:2866:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:2873:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2877:1: ( ( () ) )
            // InternalComponentInterface.g:2878:1: ( () )
            {
            // InternalComponentInterface.g:2878:1: ( () )
            // InternalComponentInterface.g:2879:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:2880:2: ()
            // InternalComponentInterface.g:2880:3: 
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
    // InternalComponentInterface.g:2888:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2892:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalComponentInterface.g:2893:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2900:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2904:1: ( ( 'RosServiceServer' ) )
            // InternalComponentInterface.g:2905:1: ( 'RosServiceServer' )
            {
            // InternalComponentInterface.g:2905:1: ( 'RosServiceServer' )
            // InternalComponentInterface.g:2906:2: 'RosServiceServer'
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
    // InternalComponentInterface.g:2915:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2919:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalComponentInterface.g:2920:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2927:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2931:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2932:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2932:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:2933:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2934:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:2934:3: rule__RosServiceServer__NameAssignment_2
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
    // InternalComponentInterface.g:2942:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2946:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalComponentInterface.g:2947:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:2954:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2958:1: ( ( '{' ) )
            // InternalComponentInterface.g:2959:1: ( '{' )
            {
            // InternalComponentInterface.g:2959:1: ( '{' )
            // InternalComponentInterface.g:2960:2: '{'
            {
             before(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:2969:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2973:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalComponentInterface.g:2974:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:2981:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2985:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2986:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2986:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2987:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2988:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:2988:3: rule__RosServiceServer__Group_4__0
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
    // InternalComponentInterface.g:2996:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3000:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalComponentInterface.g:3001:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
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
    // InternalComponentInterface.g:3008:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3012:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:3013:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:3013:1: ( 'RefServer' )
            // InternalComponentInterface.g:3014:2: 'RefServer'
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
    // InternalComponentInterface.g:3023:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3027:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalComponentInterface.g:3028:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:3035:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3039:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalComponentInterface.g:3040:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:3040:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalComponentInterface.g:3041:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalComponentInterface.g:3042:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalComponentInterface.g:3042:3: rule__RosServiceServer__SrvserverAssignment_6
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
    // InternalComponentInterface.g:3050:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3054:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalComponentInterface.g:3055:2: rule__RosServiceServer__Group__7__Impl
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
    // InternalComponentInterface.g:3061:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3065:1: ( ( '}' ) )
            // InternalComponentInterface.g:3066:1: ( '}' )
            {
            // InternalComponentInterface.g:3066:1: ( '}' )
            // InternalComponentInterface.g:3067:2: '}'
            {
             before(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:3077:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3081:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalComponentInterface.g:3082:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
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
    // InternalComponentInterface.g:3089:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3093:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3094:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3094:1: ( 'ns' )
            // InternalComponentInterface.g:3095:2: 'ns'
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
    // InternalComponentInterface.g:3104:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3108:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:3109:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalComponentInterface.g:3115:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3119:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3120:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3120:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3121:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3122:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:3122:3: rule__RosServiceServer__NsAssignment_4_1
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
    // InternalComponentInterface.g:3131:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3135:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalComponentInterface.g:3136:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:3143:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3147:1: ( ( () ) )
            // InternalComponentInterface.g:3148:1: ( () )
            {
            // InternalComponentInterface.g:3148:1: ( () )
            // InternalComponentInterface.g:3149:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:3150:2: ()
            // InternalComponentInterface.g:3150:3: 
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
    // InternalComponentInterface.g:3158:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3162:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalComponentInterface.g:3163:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3170:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3174:1: ( ( 'RosServiceClient' ) )
            // InternalComponentInterface.g:3175:1: ( 'RosServiceClient' )
            {
            // InternalComponentInterface.g:3175:1: ( 'RosServiceClient' )
            // InternalComponentInterface.g:3176:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalComponentInterface.g:3185:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3189:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalComponentInterface.g:3190:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3197:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3201:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3202:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3202:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3203:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3204:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:3204:3: rule__RosServiceClient__NameAssignment_2
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
    // InternalComponentInterface.g:3212:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3216:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalComponentInterface.g:3217:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentInterface.g:3224:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3228:1: ( ( '{' ) )
            // InternalComponentInterface.g:3229:1: ( '{' )
            {
            // InternalComponentInterface.g:3229:1: ( '{' )
            // InternalComponentInterface.g:3230:2: '{'
            {
             before(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:3239:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3243:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalComponentInterface.g:3244:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentInterface.g:3251:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3255:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3256:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3256:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:3257:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3258:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:3258:3: rule__RosServiceClient__Group_4__0
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
    // InternalComponentInterface.g:3266:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3270:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalComponentInterface.g:3271:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
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
    // InternalComponentInterface.g:3278:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3282:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3283:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3283:1: ( 'RefClient' )
            // InternalComponentInterface.g:3284:2: 'RefClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalComponentInterface.g:3293:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3297:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalComponentInterface.g:3298:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:3305:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3309:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3310:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3310:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalComponentInterface.g:3311:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalComponentInterface.g:3312:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalComponentInterface.g:3312:3: rule__RosServiceClient__SrvclientAssignment_6
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
    // InternalComponentInterface.g:3320:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3324:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalComponentInterface.g:3325:2: rule__RosServiceClient__Group__7__Impl
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
    // InternalComponentInterface.g:3331:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3335:1: ( ( '}' ) )
            // InternalComponentInterface.g:3336:1: ( '}' )
            {
            // InternalComponentInterface.g:3336:1: ( '}' )
            // InternalComponentInterface.g:3337:2: '}'
            {
             before(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:3347:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3351:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalComponentInterface.g:3352:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
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
    // InternalComponentInterface.g:3359:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3363:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3364:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3364:1: ( 'ns' )
            // InternalComponentInterface.g:3365:2: 'ns'
            {
             before(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentInterface.g:3374:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3378:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3379:2: rule__RosServiceClient__Group_4__1__Impl
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
    // InternalComponentInterface.g:3385:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3389:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3390:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3390:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3391:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3392:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3392:3: rule__RosServiceClient__NsAssignment_4_1
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


    // $ANTLR start "rule__RosActionServer__Group__0"
    // InternalComponentInterface.g:3401:1: rule__RosActionServer__Group__0 : rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 ;
    public final void rule__RosActionServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3405:1: ( rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 )
            // InternalComponentInterface.g:3406:2: rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RosActionServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__0"


    // $ANTLR start "rule__RosActionServer__Group__0__Impl"
    // InternalComponentInterface.g:3413:1: rule__RosActionServer__Group__0__Impl : ( () ) ;
    public final void rule__RosActionServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3417:1: ( ( () ) )
            // InternalComponentInterface.g:3418:1: ( () )
            {
            // InternalComponentInterface.g:3418:1: ( () )
            // InternalComponentInterface.g:3419:2: ()
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerAction_0()); 
            // InternalComponentInterface.g:3420:2: ()
            // InternalComponentInterface.g:3420:3: 
            {
            }

             after(grammarAccess.getRosActionServerAccess().getRosActionServerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__0__Impl"


    // $ANTLR start "rule__RosActionServer__Group__1"
    // InternalComponentInterface.g:3428:1: rule__RosActionServer__Group__1 : rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 ;
    public final void rule__RosActionServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3432:1: ( rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 )
            // InternalComponentInterface.g:3433:2: rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RosActionServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__1"


    // $ANTLR start "rule__RosActionServer__Group__1__Impl"
    // InternalComponentInterface.g:3440:1: rule__RosActionServer__Group__1__Impl : ( 'RosActionServer' ) ;
    public final void rule__RosActionServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3444:1: ( ( 'RosActionServer' ) )
            // InternalComponentInterface.g:3445:1: ( 'RosActionServer' )
            {
            // InternalComponentInterface.g:3445:1: ( 'RosActionServer' )
            // InternalComponentInterface.g:3446:2: 'RosActionServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__1__Impl"


    // $ANTLR start "rule__RosActionServer__Group__2"
    // InternalComponentInterface.g:3455:1: rule__RosActionServer__Group__2 : rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 ;
    public final void rule__RosActionServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3459:1: ( rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 )
            // InternalComponentInterface.g:3460:2: rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RosActionServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__2"


    // $ANTLR start "rule__RosActionServer__Group__2__Impl"
    // InternalComponentInterface.g:3467:1: rule__RosActionServer__Group__2__Impl : ( ( rule__RosActionServer__NameAssignment_2 )? ) ;
    public final void rule__RosActionServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3471:1: ( ( ( rule__RosActionServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3472:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3472:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:3473:2: ( rule__RosActionServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3474:2: ( rule__RosActionServer__NameAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:3474:3: rule__RosActionServer__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionServer__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionServerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__2__Impl"


    // $ANTLR start "rule__RosActionServer__Group__3"
    // InternalComponentInterface.g:3482:1: rule__RosActionServer__Group__3 : rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 ;
    public final void rule__RosActionServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3486:1: ( rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 )
            // InternalComponentInterface.g:3487:2: rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__RosActionServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__3"


    // $ANTLR start "rule__RosActionServer__Group__3__Impl"
    // InternalComponentInterface.g:3494:1: rule__RosActionServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3498:1: ( ( '{' ) )
            // InternalComponentInterface.g:3499:1: ( '{' )
            {
            // InternalComponentInterface.g:3499:1: ( '{' )
            // InternalComponentInterface.g:3500:2: '{'
            {
             before(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__3__Impl"


    // $ANTLR start "rule__RosActionServer__Group__4"
    // InternalComponentInterface.g:3509:1: rule__RosActionServer__Group__4 : rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 ;
    public final void rule__RosActionServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3513:1: ( rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 )
            // InternalComponentInterface.g:3514:2: rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__RosActionServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__4"


    // $ANTLR start "rule__RosActionServer__Group__4__Impl"
    // InternalComponentInterface.g:3521:1: rule__RosActionServer__Group__4__Impl : ( ( rule__RosActionServer__Group_4__0 )? ) ;
    public final void rule__RosActionServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3525:1: ( ( ( rule__RosActionServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:3526:1: ( ( rule__RosActionServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3526:1: ( ( rule__RosActionServer__Group_4__0 )? )
            // InternalComponentInterface.g:3527:2: ( rule__RosActionServer__Group_4__0 )?
            {
             before(grammarAccess.getRosActionServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:3528:2: ( rule__RosActionServer__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:3528:3: rule__RosActionServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__4__Impl"


    // $ANTLR start "rule__RosActionServer__Group__5"
    // InternalComponentInterface.g:3536:1: rule__RosActionServer__Group__5 : rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 ;
    public final void rule__RosActionServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3540:1: ( rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 )
            // InternalComponentInterface.g:3541:2: rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosActionServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__5"


    // $ANTLR start "rule__RosActionServer__Group__5__Impl"
    // InternalComponentInterface.g:3548:1: rule__RosActionServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosActionServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3552:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:3553:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:3553:1: ( 'RefServer' )
            // InternalComponentInterface.g:3554:2: 'RefServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRefServerKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRefServerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__5__Impl"


    // $ANTLR start "rule__RosActionServer__Group__6"
    // InternalComponentInterface.g:3563:1: rule__RosActionServer__Group__6 : rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 ;
    public final void rule__RosActionServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3567:1: ( rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 )
            // InternalComponentInterface.g:3568:2: rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RosActionServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__6"


    // $ANTLR start "rule__RosActionServer__Group__6__Impl"
    // InternalComponentInterface.g:3575:1: rule__RosActionServer__Group__6__Impl : ( ( rule__RosActionServer__ActserverAssignment_6 ) ) ;
    public final void rule__RosActionServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3579:1: ( ( ( rule__RosActionServer__ActserverAssignment_6 ) ) )
            // InternalComponentInterface.g:3580:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:3580:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            // InternalComponentInterface.g:3581:2: ( rule__RosActionServer__ActserverAssignment_6 )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverAssignment_6()); 
            // InternalComponentInterface.g:3582:2: ( rule__RosActionServer__ActserverAssignment_6 )
            // InternalComponentInterface.g:3582:3: rule__RosActionServer__ActserverAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__ActserverAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getActserverAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__6__Impl"


    // $ANTLR start "rule__RosActionServer__Group__7"
    // InternalComponentInterface.g:3590:1: rule__RosActionServer__Group__7 : rule__RosActionServer__Group__7__Impl ;
    public final void rule__RosActionServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3594:1: ( rule__RosActionServer__Group__7__Impl )
            // InternalComponentInterface.g:3595:2: rule__RosActionServer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__7"


    // $ANTLR start "rule__RosActionServer__Group__7__Impl"
    // InternalComponentInterface.g:3601:1: rule__RosActionServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3605:1: ( ( '}' ) )
            // InternalComponentInterface.g:3606:1: ( '}' )
            {
            // InternalComponentInterface.g:3606:1: ( '}' )
            // InternalComponentInterface.g:3607:2: '}'
            {
             before(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__7__Impl"


    // $ANTLR start "rule__RosActionServer__Group_4__0"
    // InternalComponentInterface.g:3617:1: rule__RosActionServer__Group_4__0 : rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 ;
    public final void rule__RosActionServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3621:1: ( rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 )
            // InternalComponentInterface.g:3622:2: rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosActionServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__0"


    // $ANTLR start "rule__RosActionServer__Group_4__0__Impl"
    // InternalComponentInterface.g:3629:1: rule__RosActionServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3633:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3634:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3634:1: ( 'ns' )
            // InternalComponentInterface.g:3635:2: 'ns'
            {
             before(grammarAccess.getRosActionServerAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__0__Impl"


    // $ANTLR start "rule__RosActionServer__Group_4__1"
    // InternalComponentInterface.g:3644:1: rule__RosActionServer__Group_4__1 : rule__RosActionServer__Group_4__1__Impl ;
    public final void rule__RosActionServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3648:1: ( rule__RosActionServer__Group_4__1__Impl )
            // InternalComponentInterface.g:3649:2: rule__RosActionServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__1"


    // $ANTLR start "rule__RosActionServer__Group_4__1__Impl"
    // InternalComponentInterface.g:3655:1: rule__RosActionServer__Group_4__1__Impl : ( ( rule__RosActionServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3659:1: ( ( ( rule__RosActionServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3660:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3660:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3661:2: ( rule__RosActionServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3662:2: ( rule__RosActionServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:3662:3: rule__RosActionServer__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__1__Impl"


    // $ANTLR start "rule__RosActionClient__Group__0"
    // InternalComponentInterface.g:3671:1: rule__RosActionClient__Group__0 : rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 ;
    public final void rule__RosActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3675:1: ( rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 )
            // InternalComponentInterface.g:3676:2: rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__RosActionClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__0"


    // $ANTLR start "rule__RosActionClient__Group__0__Impl"
    // InternalComponentInterface.g:3683:1: rule__RosActionClient__Group__0__Impl : ( () ) ;
    public final void rule__RosActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3687:1: ( ( () ) )
            // InternalComponentInterface.g:3688:1: ( () )
            {
            // InternalComponentInterface.g:3688:1: ( () )
            // InternalComponentInterface.g:3689:2: ()
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientAction_0()); 
            // InternalComponentInterface.g:3690:2: ()
            // InternalComponentInterface.g:3690:3: 
            {
            }

             after(grammarAccess.getRosActionClientAccess().getRosActionClientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__0__Impl"


    // $ANTLR start "rule__RosActionClient__Group__1"
    // InternalComponentInterface.g:3698:1: rule__RosActionClient__Group__1 : rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 ;
    public final void rule__RosActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3702:1: ( rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 )
            // InternalComponentInterface.g:3703:2: rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RosActionClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__1"


    // $ANTLR start "rule__RosActionClient__Group__1__Impl"
    // InternalComponentInterface.g:3710:1: rule__RosActionClient__Group__1__Impl : ( 'RosActionClient' ) ;
    public final void rule__RosActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3714:1: ( ( 'RosActionClient' ) )
            // InternalComponentInterface.g:3715:1: ( 'RosActionClient' )
            {
            // InternalComponentInterface.g:3715:1: ( 'RosActionClient' )
            // InternalComponentInterface.g:3716:2: 'RosActionClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__1__Impl"


    // $ANTLR start "rule__RosActionClient__Group__2"
    // InternalComponentInterface.g:3725:1: rule__RosActionClient__Group__2 : rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 ;
    public final void rule__RosActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3729:1: ( rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 )
            // InternalComponentInterface.g:3730:2: rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RosActionClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__2"


    // $ANTLR start "rule__RosActionClient__Group__2__Impl"
    // InternalComponentInterface.g:3737:1: rule__RosActionClient__Group__2__Impl : ( ( rule__RosActionClient__NameAssignment_2 )? ) ;
    public final void rule__RosActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3741:1: ( ( ( rule__RosActionClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3742:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3742:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3743:2: ( rule__RosActionClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3744:2: ( rule__RosActionClient__NameAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:3744:3: rule__RosActionClient__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionClient__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionClientAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__2__Impl"


    // $ANTLR start "rule__RosActionClient__Group__3"
    // InternalComponentInterface.g:3752:1: rule__RosActionClient__Group__3 : rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 ;
    public final void rule__RosActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3756:1: ( rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 )
            // InternalComponentInterface.g:3757:2: rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__RosActionClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__3"


    // $ANTLR start "rule__RosActionClient__Group__3__Impl"
    // InternalComponentInterface.g:3764:1: rule__RosActionClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3768:1: ( ( '{' ) )
            // InternalComponentInterface.g:3769:1: ( '{' )
            {
            // InternalComponentInterface.g:3769:1: ( '{' )
            // InternalComponentInterface.g:3770:2: '{'
            {
             before(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__3__Impl"


    // $ANTLR start "rule__RosActionClient__Group__4"
    // InternalComponentInterface.g:3779:1: rule__RosActionClient__Group__4 : rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 ;
    public final void rule__RosActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3783:1: ( rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 )
            // InternalComponentInterface.g:3784:2: rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RosActionClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__4"


    // $ANTLR start "rule__RosActionClient__Group__4__Impl"
    // InternalComponentInterface.g:3791:1: rule__RosActionClient__Group__4__Impl : ( ( rule__RosActionClient__Group_4__0 )? ) ;
    public final void rule__RosActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3795:1: ( ( ( rule__RosActionClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3796:1: ( ( rule__RosActionClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3796:1: ( ( rule__RosActionClient__Group_4__0 )? )
            // InternalComponentInterface.g:3797:2: ( rule__RosActionClient__Group_4__0 )?
            {
             before(grammarAccess.getRosActionClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3798:2: ( rule__RosActionClient__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:3798:3: rule__RosActionClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__4__Impl"


    // $ANTLR start "rule__RosActionClient__Group__5"
    // InternalComponentInterface.g:3806:1: rule__RosActionClient__Group__5 : rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 ;
    public final void rule__RosActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3810:1: ( rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 )
            // InternalComponentInterface.g:3811:2: rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosActionClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__5"


    // $ANTLR start "rule__RosActionClient__Group__5__Impl"
    // InternalComponentInterface.g:3818:1: rule__RosActionClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3822:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3823:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3823:1: ( 'RefClient' )
            // InternalComponentInterface.g:3824:2: 'RefClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRefClientKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRefClientKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__5__Impl"


    // $ANTLR start "rule__RosActionClient__Group__6"
    // InternalComponentInterface.g:3833:1: rule__RosActionClient__Group__6 : rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 ;
    public final void rule__RosActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3837:1: ( rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 )
            // InternalComponentInterface.g:3838:2: rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RosActionClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__6"


    // $ANTLR start "rule__RosActionClient__Group__6__Impl"
    // InternalComponentInterface.g:3845:1: rule__RosActionClient__Group__6__Impl : ( ( rule__RosActionClient__ActclientAssignment_6 ) ) ;
    public final void rule__RosActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3849:1: ( ( ( rule__RosActionClient__ActclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3850:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3850:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            // InternalComponentInterface.g:3851:2: ( rule__RosActionClient__ActclientAssignment_6 )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientAssignment_6()); 
            // InternalComponentInterface.g:3852:2: ( rule__RosActionClient__ActclientAssignment_6 )
            // InternalComponentInterface.g:3852:3: rule__RosActionClient__ActclientAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__ActclientAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getActclientAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__6__Impl"


    // $ANTLR start "rule__RosActionClient__Group__7"
    // InternalComponentInterface.g:3860:1: rule__RosActionClient__Group__7 : rule__RosActionClient__Group__7__Impl ;
    public final void rule__RosActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3864:1: ( rule__RosActionClient__Group__7__Impl )
            // InternalComponentInterface.g:3865:2: rule__RosActionClient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__7"


    // $ANTLR start "rule__RosActionClient__Group__7__Impl"
    // InternalComponentInterface.g:3871:1: rule__RosActionClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3875:1: ( ( '}' ) )
            // InternalComponentInterface.g:3876:1: ( '}' )
            {
            // InternalComponentInterface.g:3876:1: ( '}' )
            // InternalComponentInterface.g:3877:2: '}'
            {
             before(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__7__Impl"


    // $ANTLR start "rule__RosActionClient__Group_4__0"
    // InternalComponentInterface.g:3887:1: rule__RosActionClient__Group_4__0 : rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 ;
    public final void rule__RosActionClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3891:1: ( rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 )
            // InternalComponentInterface.g:3892:2: rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosActionClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__0"


    // $ANTLR start "rule__RosActionClient__Group_4__0__Impl"
    // InternalComponentInterface.g:3899:1: rule__RosActionClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3903:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3904:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3904:1: ( 'ns' )
            // InternalComponentInterface.g:3905:2: 'ns'
            {
             before(grammarAccess.getRosActionClientAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__0__Impl"


    // $ANTLR start "rule__RosActionClient__Group_4__1"
    // InternalComponentInterface.g:3914:1: rule__RosActionClient__Group_4__1 : rule__RosActionClient__Group_4__1__Impl ;
    public final void rule__RosActionClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3918:1: ( rule__RosActionClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3919:2: rule__RosActionClient__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__1"


    // $ANTLR start "rule__RosActionClient__Group_4__1__Impl"
    // InternalComponentInterface.g:3925:1: rule__RosActionClient__Group_4__1__Impl : ( ( rule__RosActionClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3929:1: ( ( ( rule__RosActionClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3930:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3930:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3931:2: ( rule__RosActionClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3932:2: ( rule__RosActionClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3932:3: rule__RosActionClient__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__0"
    // InternalComponentInterface.g:3941:1: rule__RosParameter__Group__0 : rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 ;
    public final void rule__RosParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3945:1: ( rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 )
            // InternalComponentInterface.g:3946:2: rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RosParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0"


    // $ANTLR start "rule__RosParameter__Group__0__Impl"
    // InternalComponentInterface.g:3953:1: rule__RosParameter__Group__0__Impl : ( () ) ;
    public final void rule__RosParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3957:1: ( ( () ) )
            // InternalComponentInterface.g:3958:1: ( () )
            {
            // InternalComponentInterface.g:3958:1: ( () )
            // InternalComponentInterface.g:3959:2: ()
            {
             before(grammarAccess.getRosParameterAccess().getRosParameterAction_0()); 
            // InternalComponentInterface.g:3960:2: ()
            // InternalComponentInterface.g:3960:3: 
            {
            }

             after(grammarAccess.getRosParameterAccess().getRosParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0__Impl"


    // $ANTLR start "rule__RosParameter__Group__1"
    // InternalComponentInterface.g:3968:1: rule__RosParameter__Group__1 : rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 ;
    public final void rule__RosParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3972:1: ( rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 )
            // InternalComponentInterface.g:3973:2: rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RosParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__1"


    // $ANTLR start "rule__RosParameter__Group__1__Impl"
    // InternalComponentInterface.g:3980:1: rule__RosParameter__Group__1__Impl : ( 'RosParameter' ) ;
    public final void rule__RosParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3984:1: ( ( 'RosParameter' ) )
            // InternalComponentInterface.g:3985:1: ( 'RosParameter' )
            {
            // InternalComponentInterface.g:3985:1: ( 'RosParameter' )
            // InternalComponentInterface.g:3986:2: 'RosParameter'
            {
             before(grammarAccess.getRosParameterAccess().getRosParameterKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getRosParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__2"
    // InternalComponentInterface.g:3995:1: rule__RosParameter__Group__2 : rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 ;
    public final void rule__RosParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3999:1: ( rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 )
            // InternalComponentInterface.g:4000:2: rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RosParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__2"


    // $ANTLR start "rule__RosParameter__Group__2__Impl"
    // InternalComponentInterface.g:4007:1: rule__RosParameter__Group__2__Impl : ( ( rule__RosParameter__NameAssignment_2 )? ) ;
    public final void rule__RosParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4011:1: ( ( ( rule__RosParameter__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:4012:1: ( ( rule__RosParameter__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:4012:1: ( ( rule__RosParameter__NameAssignment_2 )? )
            // InternalComponentInterface.g:4013:2: ( rule__RosParameter__NameAssignment_2 )?
            {
             before(grammarAccess.getRosParameterAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:4014:2: ( rule__RosParameter__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:4014:3: rule__RosParameter__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosParameter__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__2__Impl"


    // $ANTLR start "rule__RosParameter__Group__3"
    // InternalComponentInterface.g:4022:1: rule__RosParameter__Group__3 : rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 ;
    public final void rule__RosParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4026:1: ( rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 )
            // InternalComponentInterface.g:4027:2: rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RosParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__3"


    // $ANTLR start "rule__RosParameter__Group__3__Impl"
    // InternalComponentInterface.g:4034:1: rule__RosParameter__Group__3__Impl : ( '{' ) ;
    public final void rule__RosParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4038:1: ( ( '{' ) )
            // InternalComponentInterface.g:4039:1: ( '{' )
            {
            // InternalComponentInterface.g:4039:1: ( '{' )
            // InternalComponentInterface.g:4040:2: '{'
            {
             before(grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__3__Impl"


    // $ANTLR start "rule__RosParameter__Group__4"
    // InternalComponentInterface.g:4049:1: rule__RosParameter__Group__4 : rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 ;
    public final void rule__RosParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4053:1: ( rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 )
            // InternalComponentInterface.g:4054:2: rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__RosParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__4"


    // $ANTLR start "rule__RosParameter__Group__4__Impl"
    // InternalComponentInterface.g:4061:1: rule__RosParameter__Group__4__Impl : ( ( rule__RosParameter__Group_4__0 )? ) ;
    public final void rule__RosParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4065:1: ( ( ( rule__RosParameter__Group_4__0 )? ) )
            // InternalComponentInterface.g:4066:1: ( ( rule__RosParameter__Group_4__0 )? )
            {
            // InternalComponentInterface.g:4066:1: ( ( rule__RosParameter__Group_4__0 )? )
            // InternalComponentInterface.g:4067:2: ( rule__RosParameter__Group_4__0 )?
            {
             before(grammarAccess.getRosParameterAccess().getGroup_4()); 
            // InternalComponentInterface.g:4068:2: ( rule__RosParameter__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:4068:3: rule__RosParameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosParameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosParameterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__4__Impl"


    // $ANTLR start "rule__RosParameter__Group__5"
    // InternalComponentInterface.g:4076:1: rule__RosParameter__Group__5 : rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 ;
    public final void rule__RosParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4080:1: ( rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 )
            // InternalComponentInterface.g:4081:2: rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__5"


    // $ANTLR start "rule__RosParameter__Group__5__Impl"
    // InternalComponentInterface.g:4088:1: rule__RosParameter__Group__5__Impl : ( 'RefParameter' ) ;
    public final void rule__RosParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4092:1: ( ( 'RefParameter' ) )
            // InternalComponentInterface.g:4093:1: ( 'RefParameter' )
            {
            // InternalComponentInterface.g:4093:1: ( 'RefParameter' )
            // InternalComponentInterface.g:4094:2: 'RefParameter'
            {
             before(grammarAccess.getRosParameterAccess().getRefParameterKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getRefParameterKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__5__Impl"


    // $ANTLR start "rule__RosParameter__Group__6"
    // InternalComponentInterface.g:4103:1: rule__RosParameter__Group__6 : rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 ;
    public final void rule__RosParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4107:1: ( rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 )
            // InternalComponentInterface.g:4108:2: rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__RosParameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__6"


    // $ANTLR start "rule__RosParameter__Group__6__Impl"
    // InternalComponentInterface.g:4115:1: rule__RosParameter__Group__6__Impl : ( ( rule__RosParameter__ParameterAssignment_6 ) ) ;
    public final void rule__RosParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4119:1: ( ( ( rule__RosParameter__ParameterAssignment_6 ) ) )
            // InternalComponentInterface.g:4120:1: ( ( rule__RosParameter__ParameterAssignment_6 ) )
            {
            // InternalComponentInterface.g:4120:1: ( ( rule__RosParameter__ParameterAssignment_6 ) )
            // InternalComponentInterface.g:4121:2: ( rule__RosParameter__ParameterAssignment_6 )
            {
             before(grammarAccess.getRosParameterAccess().getParameterAssignment_6()); 
            // InternalComponentInterface.g:4122:2: ( rule__RosParameter__ParameterAssignment_6 )
            // InternalComponentInterface.g:4122:3: rule__RosParameter__ParameterAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ParameterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getParameterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__6__Impl"


    // $ANTLR start "rule__RosParameter__Group__7"
    // InternalComponentInterface.g:4130:1: rule__RosParameter__Group__7 : rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8 ;
    public final void rule__RosParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4134:1: ( rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8 )
            // InternalComponentInterface.g:4135:2: rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__RosParameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__7"


    // $ANTLR start "rule__RosParameter__Group__7__Impl"
    // InternalComponentInterface.g:4142:1: rule__RosParameter__Group__7__Impl : ( ( rule__RosParameter__Group_7__0 )? ) ;
    public final void rule__RosParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4146:1: ( ( ( rule__RosParameter__Group_7__0 )? ) )
            // InternalComponentInterface.g:4147:1: ( ( rule__RosParameter__Group_7__0 )? )
            {
            // InternalComponentInterface.g:4147:1: ( ( rule__RosParameter__Group_7__0 )? )
            // InternalComponentInterface.g:4148:2: ( rule__RosParameter__Group_7__0 )?
            {
             before(grammarAccess.getRosParameterAccess().getGroup_7()); 
            // InternalComponentInterface.g:4149:2: ( rule__RosParameter__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:4149:3: rule__RosParameter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosParameter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosParameterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__7__Impl"


    // $ANTLR start "rule__RosParameter__Group__8"
    // InternalComponentInterface.g:4157:1: rule__RosParameter__Group__8 : rule__RosParameter__Group__8__Impl ;
    public final void rule__RosParameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4161:1: ( rule__RosParameter__Group__8__Impl )
            // InternalComponentInterface.g:4162:2: rule__RosParameter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__8"


    // $ANTLR start "rule__RosParameter__Group__8__Impl"
    // InternalComponentInterface.g:4168:1: rule__RosParameter__Group__8__Impl : ( '}' ) ;
    public final void rule__RosParameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4172:1: ( ( '}' ) )
            // InternalComponentInterface.g:4173:1: ( '}' )
            {
            // InternalComponentInterface.g:4173:1: ( '}' )
            // InternalComponentInterface.g:4174:2: '}'
            {
             before(grammarAccess.getRosParameterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__8__Impl"


    // $ANTLR start "rule__RosParameter__Group_4__0"
    // InternalComponentInterface.g:4184:1: rule__RosParameter__Group_4__0 : rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1 ;
    public final void rule__RosParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4188:1: ( rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1 )
            // InternalComponentInterface.g:4189:2: rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__0"


    // $ANTLR start "rule__RosParameter__Group_4__0__Impl"
    // InternalComponentInterface.g:4196:1: rule__RosParameter__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4200:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:4201:1: ( 'ns' )
            {
            // InternalComponentInterface.g:4201:1: ( 'ns' )
            // InternalComponentInterface.g:4202:2: 'ns'
            {
             before(grammarAccess.getRosParameterAccess().getNsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__0__Impl"


    // $ANTLR start "rule__RosParameter__Group_4__1"
    // InternalComponentInterface.g:4211:1: rule__RosParameter__Group_4__1 : rule__RosParameter__Group_4__1__Impl ;
    public final void rule__RosParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4215:1: ( rule__RosParameter__Group_4__1__Impl )
            // InternalComponentInterface.g:4216:2: rule__RosParameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__1"


    // $ANTLR start "rule__RosParameter__Group_4__1__Impl"
    // InternalComponentInterface.g:4222:1: rule__RosParameter__Group_4__1__Impl : ( ( rule__RosParameter__NsAssignment_4_1 ) ) ;
    public final void rule__RosParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4226:1: ( ( ( rule__RosParameter__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:4227:1: ( ( rule__RosParameter__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:4227:1: ( ( rule__RosParameter__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:4228:2: ( rule__RosParameter__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosParameterAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:4229:2: ( rule__RosParameter__NsAssignment_4_1 )
            // InternalComponentInterface.g:4229:3: rule__RosParameter__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__1__Impl"


    // $ANTLR start "rule__RosParameter__Group_7__0"
    // InternalComponentInterface.g:4238:1: rule__RosParameter__Group_7__0 : rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1 ;
    public final void rule__RosParameter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4242:1: ( rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1 )
            // InternalComponentInterface.g:4243:2: rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__RosParameter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__0"


    // $ANTLR start "rule__RosParameter__Group_7__0__Impl"
    // InternalComponentInterface.g:4250:1: rule__RosParameter__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__RosParameter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4254:1: ( ( 'value' ) )
            // InternalComponentInterface.g:4255:1: ( 'value' )
            {
            // InternalComponentInterface.g:4255:1: ( 'value' )
            // InternalComponentInterface.g:4256:2: 'value'
            {
             before(grammarAccess.getRosParameterAccess().getValueKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getValueKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__0__Impl"


    // $ANTLR start "rule__RosParameter__Group_7__1"
    // InternalComponentInterface.g:4265:1: rule__RosParameter__Group_7__1 : rule__RosParameter__Group_7__1__Impl ;
    public final void rule__RosParameter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4269:1: ( rule__RosParameter__Group_7__1__Impl )
            // InternalComponentInterface.g:4270:2: rule__RosParameter__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__1"


    // $ANTLR start "rule__RosParameter__Group_7__1__Impl"
    // InternalComponentInterface.g:4276:1: rule__RosParameter__Group_7__1__Impl : ( ( rule__RosParameter__ValueAssignment_7_1 ) ) ;
    public final void rule__RosParameter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4280:1: ( ( ( rule__RosParameter__ValueAssignment_7_1 ) ) )
            // InternalComponentInterface.g:4281:1: ( ( rule__RosParameter__ValueAssignment_7_1 ) )
            {
            // InternalComponentInterface.g:4281:1: ( ( rule__RosParameter__ValueAssignment_7_1 ) )
            // InternalComponentInterface.g:4282:2: ( rule__RosParameter__ValueAssignment_7_1 )
            {
             before(grammarAccess.getRosParameterAccess().getValueAssignment_7_1()); 
            // InternalComponentInterface.g:4283:2: ( rule__RosParameter__ValueAssignment_7_1 )
            // InternalComponentInterface.g:4283:3: rule__RosParameter__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getValueAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalComponentInterface.g:4292:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4296:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalComponentInterface.g:4297:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // InternalComponentInterface.g:4304:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4308:1: ( ( () ) )
            // InternalComponentInterface.g:4309:1: ( () )
            {
            // InternalComponentInterface.g:4309:1: ( () )
            // InternalComponentInterface.g:4310:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 
            // InternalComponentInterface.g:4311:2: ()
            // InternalComponentInterface.g:4311:3: 
            {
            }

             after(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // InternalComponentInterface.g:4319:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4323:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalComponentInterface.g:4324:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // InternalComponentInterface.g:4331:1: rule__ParameterList__Group__1__Impl : ( '{' ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4335:1: ( ( '{' ) )
            // InternalComponentInterface.g:4336:1: ( '{' )
            {
            // InternalComponentInterface.g:4336:1: ( '{' )
            // InternalComponentInterface.g:4337:2: '{'
            {
             before(grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__2"
    // InternalComponentInterface.g:4346:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4350:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalComponentInterface.g:4351:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ParameterList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2"


    // $ANTLR start "rule__ParameterList__Group__2__Impl"
    // InternalComponentInterface.g:4358:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4362:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalComponentInterface.g:4363:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalComponentInterface.g:4363:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalComponentInterface.g:4364:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2()); 
            // InternalComponentInterface.g:4365:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalComponentInterface.g:4365:3: rule__ParameterList__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2__Impl"


    // $ANTLR start "rule__ParameterList__Group__3"
    // InternalComponentInterface.g:4373:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4377:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalComponentInterface.g:4378:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ParameterList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3"


    // $ANTLR start "rule__ParameterList__Group__3__Impl"
    // InternalComponentInterface.g:4385:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4389:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalComponentInterface.g:4390:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalComponentInterface.g:4390:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalComponentInterface.g:4391:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3()); 
            // InternalComponentInterface.g:4392:2: ( rule__ParameterList__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalComponentInterface.g:4392:3: rule__ParameterList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParameterList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3__Impl"


    // $ANTLR start "rule__ParameterList__Group__4"
    // InternalComponentInterface.g:4400:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4404:1: ( rule__ParameterList__Group__4__Impl )
            // InternalComponentInterface.g:4405:2: rule__ParameterList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4"


    // $ANTLR start "rule__ParameterList__Group__4__Impl"
    // InternalComponentInterface.g:4411:1: rule__ParameterList__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4415:1: ( ( '}' ) )
            // InternalComponentInterface.g:4416:1: ( '}' )
            {
            // InternalComponentInterface.g:4416:1: ( '}' )
            // InternalComponentInterface.g:4417:2: '}'
            {
             before(grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__0"
    // InternalComponentInterface.g:4427:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4431:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalComponentInterface.g:4432:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0"


    // $ANTLR start "rule__ParameterList__Group_3__0__Impl"
    // InternalComponentInterface.g:4439:1: rule__ParameterList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4443:1: ( ( ',' ) )
            // InternalComponentInterface.g:4444:1: ( ',' )
            {
            // InternalComponentInterface.g:4444:1: ( ',' )
            // InternalComponentInterface.g:4445:2: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__1"
    // InternalComponentInterface.g:4454:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4458:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalComponentInterface.g:4459:2: rule__ParameterList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1"


    // $ANTLR start "rule__ParameterList__Group_3__1__Impl"
    // InternalComponentInterface.g:4465:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4469:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalComponentInterface.g:4470:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:4470:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalComponentInterface.g:4471:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 
            // InternalComponentInterface.g:4472:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalComponentInterface.g:4472:3: rule__ParameterList__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__0"
    // InternalComponentInterface.g:4481:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4485:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalComponentInterface.g:4486:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterStruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0"


    // $ANTLR start "rule__ParameterStruct__Group__0__Impl"
    // InternalComponentInterface.g:4493:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4497:1: ( ( () ) )
            // InternalComponentInterface.g:4498:1: ( () )
            {
            // InternalComponentInterface.g:4498:1: ( () )
            // InternalComponentInterface.g:4499:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 
            // InternalComponentInterface.g:4500:2: ()
            // InternalComponentInterface.g:4500:3: 
            {
            }

             after(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__1"
    // InternalComponentInterface.g:4508:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4512:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalComponentInterface.g:4513:2: rule__ParameterStruct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1"


    // $ANTLR start "rule__ParameterStruct__Group__1__Impl"
    // InternalComponentInterface.g:4519:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4523:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalComponentInterface.g:4524:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalComponentInterface.g:4524:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalComponentInterface.g:4525:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1()); 
            // InternalComponentInterface.g:4526:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:4526:3: rule__ParameterStruct__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStruct__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStructAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__0"
    // InternalComponentInterface.g:4535:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4539:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalComponentInterface.g:4540:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ParameterStruct__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0"


    // $ANTLR start "rule__ParameterStruct__Group_1__0__Impl"
    // InternalComponentInterface.g:4547:1: rule__ParameterStruct__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4551:1: ( ( '{' ) )
            // InternalComponentInterface.g:4552:1: ( '{' )
            {
            // InternalComponentInterface.g:4552:1: ( '{' )
            // InternalComponentInterface.g:4553:2: '{'
            {
             before(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__1"
    // InternalComponentInterface.g:4562:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4566:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalComponentInterface.g:4567:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ParameterStruct__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1"


    // $ANTLR start "rule__ParameterStruct__Group_1__1__Impl"
    // InternalComponentInterface.g:4574:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4578:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalComponentInterface.g:4579:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalComponentInterface.g:4579:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalComponentInterface.g:4580:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1()); 
            // InternalComponentInterface.g:4581:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalComponentInterface.g:4581:3: rule__ParameterStruct__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__2"
    // InternalComponentInterface.g:4589:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4593:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalComponentInterface.g:4594:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__ParameterStruct__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2"


    // $ANTLR start "rule__ParameterStruct__Group_1__2__Impl"
    // InternalComponentInterface.g:4601:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4605:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalComponentInterface.g:4606:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalComponentInterface.g:4606:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalComponentInterface.g:4607:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2()); 
            // InternalComponentInterface.g:4608:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalComponentInterface.g:4608:3: rule__ParameterStruct__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParameterStruct__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getParameterStructAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__3"
    // InternalComponentInterface.g:4616:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4620:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalComponentInterface.g:4621:2: rule__ParameterStruct__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3"


    // $ANTLR start "rule__ParameterStruct__Group_1__3__Impl"
    // InternalComponentInterface.g:4627:1: rule__ParameterStruct__Group_1__3__Impl : ( '}' ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4631:1: ( ( '}' ) )
            // InternalComponentInterface.g:4632:1: ( '}' )
            {
            // InternalComponentInterface.g:4632:1: ( '}' )
            // InternalComponentInterface.g:4633:2: '}'
            {
             before(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__0"
    // InternalComponentInterface.g:4643:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4647:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalComponentInterface.g:4648:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterStruct__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__0"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__0__Impl"
    // InternalComponentInterface.g:4655:1: rule__ParameterStruct__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4659:1: ( ( ',' ) )
            // InternalComponentInterface.g:4660:1: ( ',' )
            {
            // InternalComponentInterface.g:4660:1: ( ',' )
            // InternalComponentInterface.g:4661:2: ','
            {
             before(grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__1"
    // InternalComponentInterface.g:4670:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4674:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalComponentInterface.g:4675:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
            {
            pushFollow(FOLLOW_5);
            rule__ParameterStruct__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__1"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__1__Impl"
    // InternalComponentInterface.g:4682:1: rule__ParameterStruct__Group_1_2__1__Impl : ( '{' ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4686:1: ( ( '{' ) )
            // InternalComponentInterface.g:4687:1: ( '{' )
            {
            // InternalComponentInterface.g:4687:1: ( '{' )
            // InternalComponentInterface.g:4688:2: '{'
            {
             before(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__2"
    // InternalComponentInterface.g:4697:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4701:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalComponentInterface.g:4702:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
            {
            pushFollow(FOLLOW_7);
            rule__ParameterStruct__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__2"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__2__Impl"
    // InternalComponentInterface.g:4709:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4713:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalComponentInterface.g:4714:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalComponentInterface.g:4714:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalComponentInterface.g:4715:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2()); 
            // InternalComponentInterface.g:4716:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalComponentInterface.g:4716:3: rule__ParameterStruct__ValueAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__ValueAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__3"
    // InternalComponentInterface.g:4724:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4728:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalComponentInterface.g:4729:2: rule__ParameterStruct__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__3"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__3__Impl"
    // InternalComponentInterface.g:4735:1: rule__ParameterStruct__Group_1_2__3__Impl : ( '}' ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4739:1: ( ( '}' ) )
            // InternalComponentInterface.g:4740:1: ( '}' )
            {
            // InternalComponentInterface.g:4740:1: ( '}' )
            // InternalComponentInterface.g:4741:2: '}'
            {
             before(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__3__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__0"
    // InternalComponentInterface.g:4751:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4755:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalComponentInterface.g:4756:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterStructMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0"


    // $ANTLR start "rule__ParameterStructMember__Group__0__Impl"
    // InternalComponentInterface.g:4763:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4767:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalComponentInterface.g:4768:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalComponentInterface.g:4768:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalComponentInterface.g:4769:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0()); 
            // InternalComponentInterface.g:4770:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalComponentInterface.g:4770:3: rule__ParameterStructMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__1"
    // InternalComponentInterface.g:4778:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4782:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalComponentInterface.g:4783:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ParameterStructMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1"


    // $ANTLR start "rule__ParameterStructMember__Group__1__Impl"
    // InternalComponentInterface.g:4790:1: rule__ParameterStructMember__Group__1__Impl : ( '{' ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4794:1: ( ( '{' ) )
            // InternalComponentInterface.g:4795:1: ( '{' )
            {
            // InternalComponentInterface.g:4795:1: ( '{' )
            // InternalComponentInterface.g:4796:2: '{'
            {
             before(grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__2"
    // InternalComponentInterface.g:4805:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4809:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalComponentInterface.g:4810:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ParameterStructMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2"


    // $ANTLR start "rule__ParameterStructMember__Group__2__Impl"
    // InternalComponentInterface.g:4817:1: rule__ParameterStructMember__Group__2__Impl : ( 'value' ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4821:1: ( ( 'value' ) )
            // InternalComponentInterface.g:4822:1: ( 'value' )
            {
            // InternalComponentInterface.g:4822:1: ( 'value' )
            // InternalComponentInterface.g:4823:2: 'value'
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__3"
    // InternalComponentInterface.g:4832:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4836:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalComponentInterface.g:4837:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ParameterStructMember__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__3"


    // $ANTLR start "rule__ParameterStructMember__Group__3__Impl"
    // InternalComponentInterface.g:4844:1: rule__ParameterStructMember__Group__3__Impl : ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4848:1: ( ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) )
            // InternalComponentInterface.g:4849:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            {
            // InternalComponentInterface.g:4849:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            // InternalComponentInterface.g:4850:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3()); 
            // InternalComponentInterface.g:4851:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            // InternalComponentInterface.g:4851:3: rule__ParameterStructMember__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__3__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__4"
    // InternalComponentInterface.g:4859:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4863:1: ( rule__ParameterStructMember__Group__4__Impl )
            // InternalComponentInterface.g:4864:2: rule__ParameterStructMember__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__4"


    // $ANTLR start "rule__ParameterStructMember__Group__4__Impl"
    // InternalComponentInterface.g:4870:1: rule__ParameterStructMember__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4874:1: ( ( '}' ) )
            // InternalComponentInterface.g:4875:1: ( '}' )
            {
            // InternalComponentInterface.g:4875:1: ( '}' )
            // InternalComponentInterface.g:4876:2: '}'
            {
             before(grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__4__Impl"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6"
    // InternalComponentInterface.g:4886:1: rule__ComponentInterface__UnorderedGroup_6 : ( rule__ComponentInterface__UnorderedGroup_6__0 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
        	
        try {
            // InternalComponentInterface.g:4891:1: ( ( rule__ComponentInterface__UnorderedGroup_6__0 )? )
            // InternalComponentInterface.g:4892:2: ( rule__ComponentInterface__UnorderedGroup_6__0 )?
            {
            // InternalComponentInterface.g:4892:2: ( rule__ComponentInterface__UnorderedGroup_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt30=1;
            }
            else if ( LA30_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt30=1;
            }
            else if ( LA30_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt30=1;
            }
            else if ( LA30_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt30=1;
            }
            else if ( LA30_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentInterface.g:4892:2: rule__ComponentInterface__UnorderedGroup_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__0();

                    state._fsp--;


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

            	getUnorderedGroupHelper().leave(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__Impl"
    // InternalComponentInterface.g:4900:1: rule__ComponentInterface__UnorderedGroup_6__Impl : ( ({...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) ) ) ) ;
    public final void rule__ComponentInterface__UnorderedGroup_6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentInterface.g:4905:1: ( ( ({...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) ) ) ) )
            // InternalComponentInterface.g:4906:3: ( ({...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) ) ) )
            {
            // InternalComponentInterface.g:4906:3: ( ({...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) ) ) )
            int alt31=7;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt31=2;
            }
            else if ( LA31_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt31=3;
            }
            else if ( LA31_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt31=4;
            }
            else if ( LA31_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt31=5;
            }
            else if ( LA31_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt31=6;
            }
            else if ( LA31_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt31=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentInterface.g:4907:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4907:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) ) )
                    // InternalComponentInterface.g:4908:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0)");
                    }
                    // InternalComponentInterface.g:4908:114: ( ( ( rule__ComponentInterface__Group_6_0__0 ) ) )
                    // InternalComponentInterface.g:4909:5: ( ( rule__ComponentInterface__Group_6_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:4915:5: ( ( rule__ComponentInterface__Group_6_0__0 ) )
                    // InternalComponentInterface.g:4916:6: ( rule__ComponentInterface__Group_6_0__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_0()); 
                    // InternalComponentInterface.g:4917:6: ( rule__ComponentInterface__Group_6_0__0 )
                    // InternalComponentInterface.g:4917:7: rule__ComponentInterface__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:4922:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4922:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) ) )
                    // InternalComponentInterface.g:4923:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1)");
                    }
                    // InternalComponentInterface.g:4923:114: ( ( ( rule__ComponentInterface__Group_6_1__0 ) ) )
                    // InternalComponentInterface.g:4924:5: ( ( rule__ComponentInterface__Group_6_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:4930:5: ( ( rule__ComponentInterface__Group_6_1__0 ) )
                    // InternalComponentInterface.g:4931:6: ( rule__ComponentInterface__Group_6_1__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_1()); 
                    // InternalComponentInterface.g:4932:6: ( rule__ComponentInterface__Group_6_1__0 )
                    // InternalComponentInterface.g:4932:7: rule__ComponentInterface__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:4937:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4937:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) ) )
                    // InternalComponentInterface.g:4938:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2)");
                    }
                    // InternalComponentInterface.g:4938:114: ( ( ( rule__ComponentInterface__Group_6_2__0 ) ) )
                    // InternalComponentInterface.g:4939:5: ( ( rule__ComponentInterface__Group_6_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:4945:5: ( ( rule__ComponentInterface__Group_6_2__0 ) )
                    // InternalComponentInterface.g:4946:6: ( rule__ComponentInterface__Group_6_2__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_2()); 
                    // InternalComponentInterface.g:4947:6: ( rule__ComponentInterface__Group_6_2__0 )
                    // InternalComponentInterface.g:4947:7: rule__ComponentInterface__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalComponentInterface.g:4952:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4952:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) ) )
                    // InternalComponentInterface.g:4953:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3)");
                    }
                    // InternalComponentInterface.g:4953:114: ( ( ( rule__ComponentInterface__Group_6_3__0 ) ) )
                    // InternalComponentInterface.g:4954:5: ( ( rule__ComponentInterface__Group_6_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:4960:5: ( ( rule__ComponentInterface__Group_6_3__0 ) )
                    // InternalComponentInterface.g:4961:6: ( rule__ComponentInterface__Group_6_3__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
                    // InternalComponentInterface.g:4962:6: ( rule__ComponentInterface__Group_6_3__0 )
                    // InternalComponentInterface.g:4962:7: rule__ComponentInterface__Group_6_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalComponentInterface.g:4967:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4967:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) ) )
                    // InternalComponentInterface.g:4968:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4)");
                    }
                    // InternalComponentInterface.g:4968:114: ( ( ( rule__ComponentInterface__Group_6_4__0 ) ) )
                    // InternalComponentInterface.g:4969:5: ( ( rule__ComponentInterface__Group_6_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:4975:5: ( ( rule__ComponentInterface__Group_6_4__0 ) )
                    // InternalComponentInterface.g:4976:6: ( rule__ComponentInterface__Group_6_4__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_4()); 
                    // InternalComponentInterface.g:4977:6: ( rule__ComponentInterface__Group_6_4__0 )
                    // InternalComponentInterface.g:4977:7: rule__ComponentInterface__Group_6_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalComponentInterface.g:4982:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4982:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) ) )
                    // InternalComponentInterface.g:4983:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5)");
                    }
                    // InternalComponentInterface.g:4983:114: ( ( ( rule__ComponentInterface__Group_6_5__0 ) ) )
                    // InternalComponentInterface.g:4984:5: ( ( rule__ComponentInterface__Group_6_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:4990:5: ( ( rule__ComponentInterface__Group_6_5__0 ) )
                    // InternalComponentInterface.g:4991:6: ( rule__ComponentInterface__Group_6_5__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_5()); 
                    // InternalComponentInterface.g:4992:6: ( rule__ComponentInterface__Group_6_5__0 )
                    // InternalComponentInterface.g:4992:7: rule__ComponentInterface__Group_6_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalComponentInterface.g:4997:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) ) )
                    {
                    // InternalComponentInterface.g:4997:3: ({...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) ) )
                    // InternalComponentInterface.g:4998:4: {...}? => ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                        throw new FailedPredicateException(input, "rule__ComponentInterface__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6)");
                    }
                    // InternalComponentInterface.g:4998:114: ( ( ( rule__ComponentInterface__Group_6_6__0 ) ) )
                    // InternalComponentInterface.g:4999:5: ( ( rule__ComponentInterface__Group_6_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6);
                    				

                    					selected = true;
                    				
                    // InternalComponentInterface.g:5005:5: ( ( rule__ComponentInterface__Group_6_6__0 ) )
                    // InternalComponentInterface.g:5006:6: ( rule__ComponentInterface__Group_6_6__0 )
                    {
                     before(grammarAccess.getComponentInterfaceAccess().getGroup_6_6()); 
                    // InternalComponentInterface.g:5007:6: ( rule__ComponentInterface__Group_6_6__0 )
                    // InternalComponentInterface.g:5007:7: rule__ComponentInterface__Group_6_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentInterfaceAccess().getGroup_6_6()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__Impl"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__0"
    // InternalComponentInterface.g:5020:1: rule__ComponentInterface__UnorderedGroup_6__0 : rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__1 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5024:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__1 )? )
            // InternalComponentInterface.g:5025:2: rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__1 )?
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalComponentInterface.g:5026:2: ( rule__ComponentInterface__UnorderedGroup_6__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt32=1;
            }
            else if ( LA32_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt32=1;
            }
            else if ( LA32_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt32=1;
            }
            else if ( LA32_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentInterface.g:5026:2: rule__ComponentInterface__UnorderedGroup_6__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__1();

                    state._fsp--;


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
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__0"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__1"
    // InternalComponentInterface.g:5032:1: rule__ComponentInterface__UnorderedGroup_6__1 : rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__2 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5036:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__2 )? )
            // InternalComponentInterface.g:5037:2: rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__2 )?
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalComponentInterface.g:5038:2: ( rule__ComponentInterface__UnorderedGroup_6__2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt33=1;
            }
            else if ( LA33_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt33=1;
            }
            else if ( LA33_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt33=1;
            }
            else if ( LA33_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt33=1;
            }
            else if ( LA33_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalComponentInterface.g:5038:2: rule__ComponentInterface__UnorderedGroup_6__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__2();

                    state._fsp--;


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
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__1"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__2"
    // InternalComponentInterface.g:5044:1: rule__ComponentInterface__UnorderedGroup_6__2 : rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__3 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5048:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__3 )? )
            // InternalComponentInterface.g:5049:2: rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__3 )?
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalComponentInterface.g:5050:2: ( rule__ComponentInterface__UnorderedGroup_6__3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt34=1;
            }
            else if ( LA34_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt34=1;
            }
            else if ( LA34_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt34=1;
            }
            else if ( LA34_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentInterface.g:5050:2: rule__ComponentInterface__UnorderedGroup_6__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__3();

                    state._fsp--;


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
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__2"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__3"
    // InternalComponentInterface.g:5056:1: rule__ComponentInterface__UnorderedGroup_6__3 : rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__4 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5060:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__4 )? )
            // InternalComponentInterface.g:5061:2: rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__4 )?
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalComponentInterface.g:5062:2: ( rule__ComponentInterface__UnorderedGroup_6__4 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt35=1;
            }
            else if ( LA35_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt35=1;
            }
            else if ( LA35_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentInterface.g:5062:2: rule__ComponentInterface__UnorderedGroup_6__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__4();

                    state._fsp--;


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
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__3"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__4"
    // InternalComponentInterface.g:5068:1: rule__ComponentInterface__UnorderedGroup_6__4 : rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__5 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5072:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__5 )? )
            // InternalComponentInterface.g:5073:2: rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__5 )?
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalComponentInterface.g:5074:2: ( rule__ComponentInterface__UnorderedGroup_6__5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt36=1;
            }
            else if ( LA36_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt36=1;
            }
            else if ( LA36_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentInterface.g:5074:2: rule__ComponentInterface__UnorderedGroup_6__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__5();

                    state._fsp--;


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
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__4"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__5"
    // InternalComponentInterface.g:5080:1: rule__ComponentInterface__UnorderedGroup_6__5 : rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__6 )? ;
    public final void rule__ComponentInterface__UnorderedGroup_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5084:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__6 )? )
            // InternalComponentInterface.g:5085:2: rule__ComponentInterface__UnorderedGroup_6__Impl ( rule__ComponentInterface__UnorderedGroup_6__6 )?
            {
            pushFollow(FOLLOW_26);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalComponentInterface.g:5086:2: ( rule__ComponentInterface__UnorderedGroup_6__6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                alt37=1;
            }
            else if ( LA37_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                alt37=1;
            }
            else if ( LA37_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                alt37=1;
            }
            else if ( LA37_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                alt37=1;
            }
            else if ( LA37_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentInterface.g:5086:2: rule__ComponentInterface__UnorderedGroup_6__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__UnorderedGroup_6__6();

                    state._fsp--;


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
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__5"


    // $ANTLR start "rule__ComponentInterface__UnorderedGroup_6__6"
    // InternalComponentInterface.g:5092:1: rule__ComponentInterface__UnorderedGroup_6__6 : rule__ComponentInterface__UnorderedGroup_6__Impl ;
    public final void rule__ComponentInterface__UnorderedGroup_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5096:1: ( rule__ComponentInterface__UnorderedGroup_6__Impl )
            // InternalComponentInterface.g:5097:2: rule__ComponentInterface__UnorderedGroup_6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__UnorderedGroup_6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__UnorderedGroup_6__6"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:5104:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5108:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5109:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5109:2: ( ruleEString )
            // InternalComponentInterface.g:5110:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameAssignment_3"


    // $ANTLR start "rule__ComponentInterface__NameSpaceAssignment_4_1"
    // InternalComponentInterface.g:5119:1: rule__ComponentInterface__NameSpaceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5123:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5124:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5124:2: ( ruleEString )
            // InternalComponentInterface.g:5125:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameSpaceAssignment_4_1"


    // $ANTLR start "rule__ComponentInterface__FromRosNodeAssignment_5_1"
    // InternalComponentInterface.g:5134:1: rule__ComponentInterface__FromRosNodeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentInterface__FromRosNodeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5138:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5139:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5139:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5140:3: ( ruleEString )
            {
             before(grammarAccess.getComponentInterfaceAccess().getFromRosNodeNodeCrossReference_5_1_0()); 
            // InternalComponentInterface.g:5141:3: ( ruleEString )
            // InternalComponentInterface.g:5142:4: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getFromRosNodeNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getFromRosNodeNodeEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComponentInterfaceAccess().getFromRosNodeNodeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__FromRosNodeAssignment_5_1"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_6_0_2"
    // InternalComponentInterface.g:5153:1: rule__ComponentInterface__RospublisherAssignment_6_0_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5157:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:5158:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:5158:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:5159:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_6_0_2"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_6_0_3_1"
    // InternalComponentInterface.g:5168:1: rule__ComponentInterface__RospublisherAssignment_6_0_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_6_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5172:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:5173:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:5173:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:5174:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_6_0_3_1"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_6_1_2"
    // InternalComponentInterface.g:5183:1: rule__ComponentInterface__RossubscriberAssignment_6_1_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5187:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:5188:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:5188:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:5189:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_6_1_2"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_6_1_3_1"
    // InternalComponentInterface.g:5198:1: rule__ComponentInterface__RossubscriberAssignment_6_1_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5202:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:5203:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:5203:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:5204:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_6_1_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_6_2_2"
    // InternalComponentInterface.g:5213:1: rule__ComponentInterface__RosserviceserverAssignment_6_2_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5217:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:5218:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:5218:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:5219:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_6_2_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1"
    // InternalComponentInterface.g:5228:1: rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5232:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:5233:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:5233:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:5234:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_6_3_2"
    // InternalComponentInterface.g:5243:1: rule__ComponentInterface__RosserviceclientAssignment_6_3_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_6_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5247:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:5248:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:5248:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:5249:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_6_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_6_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_6_3_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1"
    // InternalComponentInterface.g:5258:1: rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5262:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:5263:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:5263:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:5264:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_6_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_6_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1"


    // $ANTLR start "rule__ComponentInterface__RosactionserverAssignment_6_4_2"
    // InternalComponentInterface.g:5273:1: rule__ComponentInterface__RosactionserverAssignment_6_4_2 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_6_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5277:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:5278:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:5278:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:5279:3: ruleRosActionServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_6_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_6_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionserverAssignment_6_4_2"


    // $ANTLR start "rule__ComponentInterface__RosactionserverAssignment_6_4_3_1"
    // InternalComponentInterface.g:5288:1: rule__ComponentInterface__RosactionserverAssignment_6_4_3_1 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_6_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5292:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:5293:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:5293:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:5294:3: ruleRosActionServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_6_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_6_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionserverAssignment_6_4_3_1"


    // $ANTLR start "rule__ComponentInterface__RosactionclientAssignment_6_5_2"
    // InternalComponentInterface.g:5303:1: rule__ComponentInterface__RosactionclientAssignment_6_5_2 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5307:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:5308:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:5308:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:5309:3: ruleRosActionClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_6_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionclientAssignment_6_5_2"


    // $ANTLR start "rule__ComponentInterface__RosactionclientAssignment_6_5_3_1"
    // InternalComponentInterface.g:5318:1: rule__ComponentInterface__RosactionclientAssignment_6_5_3_1 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_6_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5322:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:5323:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:5323:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:5324:3: ruleRosActionClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_6_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_6_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionclientAssignment_6_5_3_1"


    // $ANTLR start "rule__ComponentInterface__RosparameterAssignment_6_6_2"
    // InternalComponentInterface.g:5333:1: rule__ComponentInterface__RosparameterAssignment_6_6_2 : ( ruleRosParameter ) ;
    public final void rule__ComponentInterface__RosparameterAssignment_6_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5337:1: ( ( ruleRosParameter ) )
            // InternalComponentInterface.g:5338:2: ( ruleRosParameter )
            {
            // InternalComponentInterface.g:5338:2: ( ruleRosParameter )
            // InternalComponentInterface.g:5339:3: ruleRosParameter
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_6_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_6_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosparameterAssignment_6_6_2"


    // $ANTLR start "rule__ComponentInterface__RosparameterAssignment_6_6_3_1"
    // InternalComponentInterface.g:5348:1: rule__ComponentInterface__RosparameterAssignment_6_6_3_1 : ( ruleRosParameter ) ;
    public final void rule__ComponentInterface__RosparameterAssignment_6_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5352:1: ( ( ruleRosParameter ) )
            // InternalComponentInterface.g:5353:2: ( ruleRosParameter )
            {
            // InternalComponentInterface.g:5353:2: ( ruleRosParameter )
            // InternalComponentInterface.g:5354:3: ruleRosParameter
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_6_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_6_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosparameterAssignment_6_6_3_1"


    // $ANTLR start "rule__RosPublisher__NameAssignment_2"
    // InternalComponentInterface.g:5363:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5367:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5368:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5368:2: ( ruleEString )
            // InternalComponentInterface.g:5369:3: ruleEString
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
    // InternalComponentInterface.g:5378:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5382:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5383:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5383:2: ( ruleEString )
            // InternalComponentInterface.g:5384:3: ruleEString
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
    // InternalComponentInterface.g:5393:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5397:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5398:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5398:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5399:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalComponentInterface.g:5400:3: ( ruleEString )
            // InternalComponentInterface.g:5401:4: ruleEString
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
    // InternalComponentInterface.g:5412:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5416:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5417:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5417:2: ( ruleEString )
            // InternalComponentInterface.g:5418:3: ruleEString
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
    // InternalComponentInterface.g:5427:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5431:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5432:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5432:2: ( ruleEString )
            // InternalComponentInterface.g:5433:3: ruleEString
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
    // InternalComponentInterface.g:5442:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5446:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5447:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5447:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5448:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalComponentInterface.g:5449:3: ( ruleEString )
            // InternalComponentInterface.g:5450:4: ruleEString
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
    // InternalComponentInterface.g:5461:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5465:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5466:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5466:2: ( ruleEString )
            // InternalComponentInterface.g:5467:3: ruleEString
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
    // InternalComponentInterface.g:5476:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5480:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5481:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5481:2: ( ruleEString )
            // InternalComponentInterface.g:5482:3: ruleEString
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
    // InternalComponentInterface.g:5491:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5495:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5496:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5496:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5497:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalComponentInterface.g:5498:3: ( ruleEString )
            // InternalComponentInterface.g:5499:4: ruleEString
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
    // InternalComponentInterface.g:5510:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5514:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5515:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5515:2: ( ruleEString )
            // InternalComponentInterface.g:5516:3: ruleEString
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
    // InternalComponentInterface.g:5525:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5529:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5530:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5530:2: ( ruleEString )
            // InternalComponentInterface.g:5531:3: ruleEString
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
    // InternalComponentInterface.g:5540:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5544:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5545:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5545:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5546:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalComponentInterface.g:5547:3: ( ruleEString )
            // InternalComponentInterface.g:5548:4: ruleEString
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


    // $ANTLR start "rule__RosActionServer__NameAssignment_2"
    // InternalComponentInterface.g:5559:1: rule__RosActionServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5563:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5564:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5564:2: ( ruleEString )
            // InternalComponentInterface.g:5565:3: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__NameAssignment_2"


    // $ANTLR start "rule__RosActionServer__NsAssignment_4_1"
    // InternalComponentInterface.g:5574:1: rule__RosActionServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5578:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5579:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5579:2: ( ruleEString )
            // InternalComponentInterface.g:5580:3: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__NsAssignment_4_1"


    // $ANTLR start "rule__RosActionServer__ActserverAssignment_6"
    // InternalComponentInterface.g:5589:1: rule__RosActionServer__ActserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServer__ActserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5593:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5594:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5594:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5595:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0()); 
            // InternalComponentInterface.g:5596:3: ( ruleEString )
            // InternalComponentInterface.g:5597:4: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getActserverActionServerEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getActserverActionServerEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__ActserverAssignment_6"


    // $ANTLR start "rule__RosActionClient__NameAssignment_2"
    // InternalComponentInterface.g:5608:1: rule__RosActionClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5612:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5613:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5613:2: ( ruleEString )
            // InternalComponentInterface.g:5614:3: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__NameAssignment_2"


    // $ANTLR start "rule__RosActionClient__NsAssignment_4_1"
    // InternalComponentInterface.g:5623:1: rule__RosActionClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5627:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5628:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5628:2: ( ruleEString )
            // InternalComponentInterface.g:5629:3: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__NsAssignment_4_1"


    // $ANTLR start "rule__RosActionClient__ActclientAssignment_6"
    // InternalComponentInterface.g:5638:1: rule__RosActionClient__ActclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClient__ActclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5642:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5643:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5643:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5644:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0()); 
            // InternalComponentInterface.g:5645:3: ( ruleEString )
            // InternalComponentInterface.g:5646:4: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getActclientActionClientEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getActclientActionClientEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__ActclientAssignment_6"


    // $ANTLR start "rule__RosParameter__NameAssignment_2"
    // InternalComponentInterface.g:5657:1: rule__RosParameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5661:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5662:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5662:2: ( ruleEString )
            // InternalComponentInterface.g:5663:3: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__NameAssignment_2"


    // $ANTLR start "rule__RosParameter__NsAssignment_4_1"
    // InternalComponentInterface.g:5672:1: rule__RosParameter__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosParameter__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5676:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5677:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5677:2: ( ruleEString )
            // InternalComponentInterface.g:5678:3: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__NsAssignment_4_1"


    // $ANTLR start "rule__RosParameter__ParameterAssignment_6"
    // InternalComponentInterface.g:5687:1: rule__RosParameter__ParameterAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosParameter__ParameterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5691:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:5692:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:5692:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:5693:3: ( ruleEString )
            {
             before(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0()); 
            // InternalComponentInterface.g:5694:3: ( ruleEString )
            // InternalComponentInterface.g:5695:4: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getParameterParameterEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getParameterParameterEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ParameterAssignment_6"


    // $ANTLR start "rule__RosParameter__ValueAssignment_7_1"
    // InternalComponentInterface.g:5706:1: rule__RosParameter__ValueAssignment_7_1 : ( ruleParameterValue ) ;
    public final void rule__RosParameter__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5710:1: ( ( ruleParameterValue ) )
            // InternalComponentInterface.g:5711:2: ( ruleParameterValue )
            {
            // InternalComponentInterface.g:5711:2: ( ruleParameterValue )
            // InternalComponentInterface.g:5712:3: ruleParameterValue
            {
             before(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ValueAssignment_7_1"


    // $ANTLR start "rule__ParameterString__ValueAssignment"
    // InternalComponentInterface.g:5721:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5725:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5726:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5726:2: ( ruleEString )
            // InternalComponentInterface.g:5727:3: ruleEString
            {
             before(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__ValueAssignment"


    // $ANTLR start "rule__ParameterBase64__ValueAssignment"
    // InternalComponentInterface.g:5736:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5740:1: ( ( ruleBase64Binary ) )
            // InternalComponentInterface.g:5741:2: ( ruleBase64Binary )
            {
            // InternalComponentInterface.g:5741:2: ( ruleBase64Binary )
            // InternalComponentInterface.g:5742:3: ruleBase64Binary
            {
             before(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64__ValueAssignment"


    // $ANTLR start "rule__ParameterInteger__ValueAssignment"
    // InternalComponentInterface.g:5751:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5755:1: ( ( ruleInteger0 ) )
            // InternalComponentInterface.g:5756:2: ( ruleInteger0 )
            {
            // InternalComponentInterface.g:5756:2: ( ruleInteger0 )
            // InternalComponentInterface.g:5757:3: ruleInteger0
            {
             before(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInteger__ValueAssignment"


    // $ANTLR start "rule__ParameterDouble__ValueAssignment"
    // InternalComponentInterface.g:5766:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5770:1: ( ( ruleDouble0 ) )
            // InternalComponentInterface.g:5771:2: ( ruleDouble0 )
            {
            // InternalComponentInterface.g:5771:2: ( ruleDouble0 )
            // InternalComponentInterface.g:5772:3: ruleDouble0
            {
             before(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDouble__ValueAssignment"


    // $ANTLR start "rule__ParameterBoolean__ValueAssignment"
    // InternalComponentInterface.g:5781:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5785:1: ( ( ruleboolean0 ) )
            // InternalComponentInterface.g:5786:2: ( ruleboolean0 )
            {
            // InternalComponentInterface.g:5786:2: ( ruleboolean0 )
            // InternalComponentInterface.g:5787:3: ruleboolean0
            {
             before(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBoolean__ValueAssignment"


    // $ANTLR start "rule__ParameterList__ValueAssignment_2"
    // InternalComponentInterface.g:5796:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5800:1: ( ( ruleParameterValue ) )
            // InternalComponentInterface.g:5801:2: ( ruleParameterValue )
            {
            // InternalComponentInterface.g:5801:2: ( ruleParameterValue )
            // InternalComponentInterface.g:5802:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_2"


    // $ANTLR start "rule__ParameterList__ValueAssignment_3_1"
    // InternalComponentInterface.g:5811:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5815:1: ( ( ruleParameterValue ) )
            // InternalComponentInterface.g:5816:2: ( ruleParameterValue )
            {
            // InternalComponentInterface.g:5816:2: ( ruleParameterValue )
            // InternalComponentInterface.g:5817:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_3_1"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_1"
    // InternalComponentInterface.g:5826:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5830:1: ( ( ruleParameterStructMember ) )
            // InternalComponentInterface.g:5831:2: ( ruleParameterStructMember )
            {
            // InternalComponentInterface.g:5831:2: ( ruleParameterStructMember )
            // InternalComponentInterface.g:5832:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_1"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_2_2"
    // InternalComponentInterface.g:5841:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5845:1: ( ( ruleParameterStructMember ) )
            // InternalComponentInterface.g:5846:2: ( ruleParameterStructMember )
            {
            // InternalComponentInterface.g:5846:2: ( ruleParameterStructMember )
            // InternalComponentInterface.g:5847:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_2_2"


    // $ANTLR start "rule__ParameterStructMember__NameAssignment_0"
    // InternalComponentInterface.g:5856:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5860:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:5861:2: ( ruleEString )
            {
            // InternalComponentInterface.g:5861:2: ( ruleEString )
            // InternalComponentInterface.g:5862:3: ruleEString
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructMember__ValueAssignment_3"
    // InternalComponentInterface.g:5871:1: rule__ParameterStructMember__ValueAssignment_3 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:5875:1: ( ( ruleParameterValue ) )
            // InternalComponentInterface.g:5876:2: ( ruleParameterValue )
            {
            // InternalComponentInterface.g:5876:2: ( ruleParameterValue )
            // InternalComponentInterface.g:5877:3: ruleParameterValue
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__ValueAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\6\12\uffff";
    static final String dfa_3s = "\1\4\4\uffff\1\4\3\uffff\2\27";
    static final String dfa_4s = "\1\35\4\uffff\1\35\3\uffff\2\35";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\5\2\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\2\1\1\1\3\2\7\15\uffff\1\5\1\uffff\1\6\3\uffff\1\6",
            "",
            "",
            "",
            "",
            "\4\10\1\11\1\12\15\uffff\1\10\1\uffff\1\10\3\uffff\1\10",
            "",
            "",
            "",
            "\1\6\1\uffff\1\10\3\uffff\1\10",
            "\1\6\1\uffff\1\10\3\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "623:1: rule__ParameterValue__Alternatives : ( ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterInteger ) | ( ruleParameterBase64 ) | ( ruleParameterList ) | ( ruleParameterStruct ) | ( ruleParameterString ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FDC000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800300L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000FD0000002L});

}
