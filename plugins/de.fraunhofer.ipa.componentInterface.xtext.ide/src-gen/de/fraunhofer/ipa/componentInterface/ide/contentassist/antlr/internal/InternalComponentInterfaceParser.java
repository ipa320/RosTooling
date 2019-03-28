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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'}'", "'NameSpace'", "'RosPublishers'", "','", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'"
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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( ruleEString EOF )
            // InternalComponentInterface.g:230:1: ruleEString EOF
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
    // InternalComponentInterface.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalComponentInterface.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComponentInterface.g:244:3: ( rule__EString__Alternatives )
            // InternalComponentInterface.g:244:4: rule__EString__Alternatives
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
    // InternalComponentInterface.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalComponentInterface.g:257:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:257:2: ( RULE_STRING )
                    // InternalComponentInterface.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:263:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:263:2: ( RULE_ID )
                    // InternalComponentInterface.g:264:3: RULE_ID
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
    // InternalComponentInterface.g:273:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:277:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:278:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalComponentInterface.g:285:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:289:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:290:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:290:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:291:2: 'ComponentInterface'
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
    // InternalComponentInterface.g:300:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:304:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:305:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
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
    // InternalComponentInterface.g:312:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:316:1: ( ( '{' ) )
            // InternalComponentInterface.g:317:1: ( '{' )
            {
            // InternalComponentInterface.g:317:1: ( '{' )
            // InternalComponentInterface.g:318:2: '{'
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
    // InternalComponentInterface.g:327:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:331:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:332:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
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
    // InternalComponentInterface.g:339:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:343:1: ( ( 'name' ) )
            // InternalComponentInterface.g:344:1: ( 'name' )
            {
            // InternalComponentInterface.g:344:1: ( 'name' )
            // InternalComponentInterface.g:345:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:354:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:358:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:359:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
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
    // InternalComponentInterface.g:366:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:370:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:371:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:371:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:372:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:373:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:373:3: rule__ComponentInterface__NameAssignment_3
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
    // InternalComponentInterface.g:381:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:385:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:386:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
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
    // InternalComponentInterface.g:393:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:397:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:398:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:398:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:399:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:400:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:400:3: rule__ComponentInterface__Group_4__0
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
    // InternalComponentInterface.g:408:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:412:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:413:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
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
    // InternalComponentInterface.g:420:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:424:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:425:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:425:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:426:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:427:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:427:3: rule__ComponentInterface__Group_5__0
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
    // InternalComponentInterface.g:435:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:439:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:440:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:447:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:451:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:452:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:452:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:453:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:454:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:454:3: rule__ComponentInterface__Group_6__0
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
    // InternalComponentInterface.g:462:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:466:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:467:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:474:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:478:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:479:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:479:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:480:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:481:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:481:3: rule__ComponentInterface__Group_7__0
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
    // InternalComponentInterface.g:489:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:493:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalComponentInterface.g:494:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:501:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:505:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalComponentInterface.g:506:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalComponentInterface.g:506:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalComponentInterface.g:507:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalComponentInterface.g:508:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:508:3: rule__ComponentInterface__Group_8__0
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
    // InternalComponentInterface.g:516:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:520:1: ( rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 )
            // InternalComponentInterface.g:521:2: rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:528:1: rule__ComponentInterface__Group__9__Impl : ( ( rule__ComponentInterface__Group_9__0 )? ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:532:1: ( ( ( rule__ComponentInterface__Group_9__0 )? ) )
            // InternalComponentInterface.g:533:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            {
            // InternalComponentInterface.g:533:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            // InternalComponentInterface.g:534:2: ( rule__ComponentInterface__Group_9__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9()); 
            // InternalComponentInterface.g:535:2: ( rule__ComponentInterface__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:535:3: rule__ComponentInterface__Group_9__0
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
    // InternalComponentInterface.g:543:1: rule__ComponentInterface__Group__10 : rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 ;
    public final void rule__ComponentInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:547:1: ( rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 )
            // InternalComponentInterface.g:548:2: rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentInterface.g:555:1: rule__ComponentInterface__Group__10__Impl : ( ( rule__ComponentInterface__Group_10__0 )? ) ;
    public final void rule__ComponentInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:559:1: ( ( ( rule__ComponentInterface__Group_10__0 )? ) )
            // InternalComponentInterface.g:560:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            {
            // InternalComponentInterface.g:560:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            // InternalComponentInterface.g:561:2: ( rule__ComponentInterface__Group_10__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10()); 
            // InternalComponentInterface.g:562:2: ( rule__ComponentInterface__Group_10__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:562:3: rule__ComponentInterface__Group_10__0
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
    // InternalComponentInterface.g:570:1: rule__ComponentInterface__Group__11 : rule__ComponentInterface__Group__11__Impl ;
    public final void rule__ComponentInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:574:1: ( rule__ComponentInterface__Group__11__Impl )
            // InternalComponentInterface.g:575:2: rule__ComponentInterface__Group__11__Impl
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
    // InternalComponentInterface.g:581:1: rule__ComponentInterface__Group__11__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:585:1: ( ( '}' ) )
            // InternalComponentInterface.g:586:1: ( '}' )
            {
            // InternalComponentInterface.g:586:1: ( '}' )
            // InternalComponentInterface.g:587:2: '}'
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
    // InternalComponentInterface.g:597:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:601:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:602:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
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
    // InternalComponentInterface.g:609:1: rule__ComponentInterface__Group_4__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:613:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:614:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:614:1: ( 'NameSpace' )
            // InternalComponentInterface.g:615:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentInterface.g:624:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:628:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:629:2: rule__ComponentInterface__Group_4__1__Impl
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
    // InternalComponentInterface.g:635:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:639:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:640:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:640:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            // InternalComponentInterface.g:641:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 
            // InternalComponentInterface.g:642:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            // InternalComponentInterface.g:642:3: rule__ComponentInterface__NameSpaceAssignment_4_1
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
    // InternalComponentInterface.g:651:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:655:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:656:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
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
    // InternalComponentInterface.g:663:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:667:1: ( ( 'RosPublishers' ) )
            // InternalComponentInterface.g:668:1: ( 'RosPublishers' )
            {
            // InternalComponentInterface.g:668:1: ( 'RosPublishers' )
            // InternalComponentInterface.g:669:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:678:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:682:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalComponentInterface.g:683:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:690:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:694:1: ( ( '{' ) )
            // InternalComponentInterface.g:695:1: ( '{' )
            {
            // InternalComponentInterface.g:695:1: ( '{' )
            // InternalComponentInterface.g:696:2: '{'
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
    // InternalComponentInterface.g:705:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:709:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalComponentInterface.g:710:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:717:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:721:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) )
            // InternalComponentInterface.g:722:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            {
            // InternalComponentInterface.g:722:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            // InternalComponentInterface.g:723:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_2()); 
            // InternalComponentInterface.g:724:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            // InternalComponentInterface.g:724:3: rule__ComponentInterface__RospublisherAssignment_5_2
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
    // InternalComponentInterface.g:732:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:736:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalComponentInterface.g:737:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:744:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:748:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalComponentInterface.g:749:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalComponentInterface.g:749:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalComponentInterface.g:750:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalComponentInterface.g:751:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentInterface.g:751:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:759:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:763:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalComponentInterface.g:764:2: rule__ComponentInterface__Group_5__4__Impl
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
    // InternalComponentInterface.g:770:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:774:1: ( ( '}' ) )
            // InternalComponentInterface.g:775:1: ( '}' )
            {
            // InternalComponentInterface.g:775:1: ( '}' )
            // InternalComponentInterface.g:776:2: '}'
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
    // InternalComponentInterface.g:786:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:790:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalComponentInterface.g:791:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:798:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:802:1: ( ( ',' ) )
            // InternalComponentInterface.g:803:1: ( ',' )
            {
            // InternalComponentInterface.g:803:1: ( ',' )
            // InternalComponentInterface.g:804:2: ','
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
    // InternalComponentInterface.g:813:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:817:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalComponentInterface.g:818:2: rule__ComponentInterface__Group_5_3__1__Impl
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
    // InternalComponentInterface.g:824:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:828:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) )
            // InternalComponentInterface.g:829:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            {
            // InternalComponentInterface.g:829:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            // InternalComponentInterface.g:830:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_3_1()); 
            // InternalComponentInterface.g:831:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            // InternalComponentInterface.g:831:3: rule__ComponentInterface__RospublisherAssignment_5_3_1
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
    // InternalComponentInterface.g:840:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:844:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:845:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
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
    // InternalComponentInterface.g:852:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:856:1: ( ( 'RosSubscribers' ) )
            // InternalComponentInterface.g:857:1: ( 'RosSubscribers' )
            {
            // InternalComponentInterface.g:857:1: ( 'RosSubscribers' )
            // InternalComponentInterface.g:858:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalComponentInterface.g:867:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:871:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalComponentInterface.g:872:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
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
    // InternalComponentInterface.g:879:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:883:1: ( ( '{' ) )
            // InternalComponentInterface.g:884:1: ( '{' )
            {
            // InternalComponentInterface.g:884:1: ( '{' )
            // InternalComponentInterface.g:885:2: '{'
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
    // InternalComponentInterface.g:894:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:898:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalComponentInterface.g:899:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:906:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:910:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) )
            // InternalComponentInterface.g:911:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            {
            // InternalComponentInterface.g:911:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            // InternalComponentInterface.g:912:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_2()); 
            // InternalComponentInterface.g:913:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            // InternalComponentInterface.g:913:3: rule__ComponentInterface__RossubscriberAssignment_6_2
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
    // InternalComponentInterface.g:921:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:925:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalComponentInterface.g:926:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:933:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:937:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalComponentInterface.g:938:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalComponentInterface.g:938:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalComponentInterface.g:939:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalComponentInterface.g:940:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:940:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:948:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:952:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalComponentInterface.g:953:2: rule__ComponentInterface__Group_6__4__Impl
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
    // InternalComponentInterface.g:959:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:963:1: ( ( '}' ) )
            // InternalComponentInterface.g:964:1: ( '}' )
            {
            // InternalComponentInterface.g:964:1: ( '}' )
            // InternalComponentInterface.g:965:2: '}'
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
    // InternalComponentInterface.g:975:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:979:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalComponentInterface.g:980:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
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
    // InternalComponentInterface.g:987:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:991:1: ( ( ',' ) )
            // InternalComponentInterface.g:992:1: ( ',' )
            {
            // InternalComponentInterface.g:992:1: ( ',' )
            // InternalComponentInterface.g:993:2: ','
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
    // InternalComponentInterface.g:1002:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1006:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalComponentInterface.g:1007:2: rule__ComponentInterface__Group_6_3__1__Impl
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
    // InternalComponentInterface.g:1013:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1017:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) )
            // InternalComponentInterface.g:1018:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            {
            // InternalComponentInterface.g:1018:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            // InternalComponentInterface.g:1019:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_3_1()); 
            // InternalComponentInterface.g:1020:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            // InternalComponentInterface.g:1020:3: rule__ComponentInterface__RossubscriberAssignment_6_3_1
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
    // InternalComponentInterface.g:1029:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1033:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:1034:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
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
    // InternalComponentInterface.g:1041:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1045:1: ( ( 'RosSrvServers' ) )
            // InternalComponentInterface.g:1046:1: ( 'RosSrvServers' )
            {
            // InternalComponentInterface.g:1046:1: ( 'RosSrvServers' )
            // InternalComponentInterface.g:1047:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalComponentInterface.g:1056:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1060:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalComponentInterface.g:1061:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
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
    // InternalComponentInterface.g:1068:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1072:1: ( ( '{' ) )
            // InternalComponentInterface.g:1073:1: ( '{' )
            {
            // InternalComponentInterface.g:1073:1: ( '{' )
            // InternalComponentInterface.g:1074:2: '{'
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
    // InternalComponentInterface.g:1083:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1087:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalComponentInterface.g:1088:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1095:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1099:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) )
            // InternalComponentInterface.g:1100:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            {
            // InternalComponentInterface.g:1100:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            // InternalComponentInterface.g:1101:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_2()); 
            // InternalComponentInterface.g:1102:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            // InternalComponentInterface.g:1102:3: rule__ComponentInterface__RosserviceserverAssignment_7_2
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
    // InternalComponentInterface.g:1110:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1114:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalComponentInterface.g:1115:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1122:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1126:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalComponentInterface.g:1127:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalComponentInterface.g:1127:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalComponentInterface.g:1128:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalComponentInterface.g:1129:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:1129:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1137:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1141:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalComponentInterface.g:1142:2: rule__ComponentInterface__Group_7__4__Impl
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
    // InternalComponentInterface.g:1148:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1152:1: ( ( '}' ) )
            // InternalComponentInterface.g:1153:1: ( '}' )
            {
            // InternalComponentInterface.g:1153:1: ( '}' )
            // InternalComponentInterface.g:1154:2: '}'
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
    // InternalComponentInterface.g:1164:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1168:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalComponentInterface.g:1169:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
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
    // InternalComponentInterface.g:1176:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1180:1: ( ( ',' ) )
            // InternalComponentInterface.g:1181:1: ( ',' )
            {
            // InternalComponentInterface.g:1181:1: ( ',' )
            // InternalComponentInterface.g:1182:2: ','
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
    // InternalComponentInterface.g:1191:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1195:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalComponentInterface.g:1196:2: rule__ComponentInterface__Group_7_3__1__Impl
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
    // InternalComponentInterface.g:1202:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1206:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) )
            // InternalComponentInterface.g:1207:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            {
            // InternalComponentInterface.g:1207:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            // InternalComponentInterface.g:1208:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_3_1()); 
            // InternalComponentInterface.g:1209:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            // InternalComponentInterface.g:1209:3: rule__ComponentInterface__RosserviceserverAssignment_7_3_1
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
    // InternalComponentInterface.g:1218:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1222:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalComponentInterface.g:1223:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:1230:1: rule__ComponentInterface__Group_8__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1234:1: ( ( 'RosSrvClients' ) )
            // InternalComponentInterface.g:1235:1: ( 'RosSrvClients' )
            {
            // InternalComponentInterface.g:1235:1: ( 'RosSrvClients' )
            // InternalComponentInterface.g:1236:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalComponentInterface.g:1245:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1249:1: ( rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 )
            // InternalComponentInterface.g:1250:2: rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1257:1: rule__ComponentInterface__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1261:1: ( ( '{' ) )
            // InternalComponentInterface.g:1262:1: ( '{' )
            {
            // InternalComponentInterface.g:1262:1: ( '{' )
            // InternalComponentInterface.g:1263:2: '{'
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
    // InternalComponentInterface.g:1272:1: rule__ComponentInterface__Group_8__2 : rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 ;
    public final void rule__ComponentInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1276:1: ( rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 )
            // InternalComponentInterface.g:1277:2: rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1284:1: rule__ComponentInterface__Group_8__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) ;
    public final void rule__ComponentInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1288:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) )
            // InternalComponentInterface.g:1289:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            {
            // InternalComponentInterface.g:1289:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            // InternalComponentInterface.g:1290:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_2()); 
            // InternalComponentInterface.g:1291:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            // InternalComponentInterface.g:1291:3: rule__ComponentInterface__RosserviceclientAssignment_8_2
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
    // InternalComponentInterface.g:1299:1: rule__ComponentInterface__Group_8__3 : rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 ;
    public final void rule__ComponentInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1303:1: ( rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 )
            // InternalComponentInterface.g:1304:2: rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1311:1: rule__ComponentInterface__Group_8__3__Impl : ( ( rule__ComponentInterface__Group_8_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1315:1: ( ( ( rule__ComponentInterface__Group_8_3__0 )* ) )
            // InternalComponentInterface.g:1316:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            {
            // InternalComponentInterface.g:1316:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            // InternalComponentInterface.g:1317:2: ( rule__ComponentInterface__Group_8_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 
            // InternalComponentInterface.g:1318:2: ( rule__ComponentInterface__Group_8_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentInterface.g:1318:3: rule__ComponentInterface__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalComponentInterface.g:1326:1: rule__ComponentInterface__Group_8__4 : rule__ComponentInterface__Group_8__4__Impl ;
    public final void rule__ComponentInterface__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1330:1: ( rule__ComponentInterface__Group_8__4__Impl )
            // InternalComponentInterface.g:1331:2: rule__ComponentInterface__Group_8__4__Impl
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
    // InternalComponentInterface.g:1337:1: rule__ComponentInterface__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1341:1: ( ( '}' ) )
            // InternalComponentInterface.g:1342:1: ( '}' )
            {
            // InternalComponentInterface.g:1342:1: ( '}' )
            // InternalComponentInterface.g:1343:2: '}'
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
    // InternalComponentInterface.g:1353:1: rule__ComponentInterface__Group_8_3__0 : rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 ;
    public final void rule__ComponentInterface__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1357:1: ( rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 )
            // InternalComponentInterface.g:1358:2: rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1365:1: rule__ComponentInterface__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1369:1: ( ( ',' ) )
            // InternalComponentInterface.g:1370:1: ( ',' )
            {
            // InternalComponentInterface.g:1370:1: ( ',' )
            // InternalComponentInterface.g:1371:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:1380:1: rule__ComponentInterface__Group_8_3__1 : rule__ComponentInterface__Group_8_3__1__Impl ;
    public final void rule__ComponentInterface__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1384:1: ( rule__ComponentInterface__Group_8_3__1__Impl )
            // InternalComponentInterface.g:1385:2: rule__ComponentInterface__Group_8_3__1__Impl
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
    // InternalComponentInterface.g:1391:1: rule__ComponentInterface__Group_8_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1395:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) )
            // InternalComponentInterface.g:1396:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            {
            // InternalComponentInterface.g:1396:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            // InternalComponentInterface.g:1397:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_3_1()); 
            // InternalComponentInterface.g:1398:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            // InternalComponentInterface.g:1398:3: rule__ComponentInterface__RosserviceclientAssignment_8_3_1
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
    // InternalComponentInterface.g:1407:1: rule__ComponentInterface__Group_9__0 : rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 ;
    public final void rule__ComponentInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1411:1: ( rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 )
            // InternalComponentInterface.g:1412:2: rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:1419:1: rule__ComponentInterface__Group_9__0__Impl : ( 'RosActionServers' ) ;
    public final void rule__ComponentInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1423:1: ( ( 'RosActionServers' ) )
            // InternalComponentInterface.g:1424:1: ( 'RosActionServers' )
            {
            // InternalComponentInterface.g:1424:1: ( 'RosActionServers' )
            // InternalComponentInterface.g:1425:2: 'RosActionServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentInterface.g:1434:1: rule__ComponentInterface__Group_9__1 : rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 ;
    public final void rule__ComponentInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1438:1: ( rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 )
            // InternalComponentInterface.g:1439:2: rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1446:1: rule__ComponentInterface__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1450:1: ( ( '{' ) )
            // InternalComponentInterface.g:1451:1: ( '{' )
            {
            // InternalComponentInterface.g:1451:1: ( '{' )
            // InternalComponentInterface.g:1452:2: '{'
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
    // InternalComponentInterface.g:1461:1: rule__ComponentInterface__Group_9__2 : rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 ;
    public final void rule__ComponentInterface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1465:1: ( rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 )
            // InternalComponentInterface.g:1466:2: rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1473:1: rule__ComponentInterface__Group_9__2__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) ;
    public final void rule__ComponentInterface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1477:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) )
            // InternalComponentInterface.g:1478:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            {
            // InternalComponentInterface.g:1478:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            // InternalComponentInterface.g:1479:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_2()); 
            // InternalComponentInterface.g:1480:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            // InternalComponentInterface.g:1480:3: rule__ComponentInterface__RosactionserverAssignment_9_2
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
    // InternalComponentInterface.g:1488:1: rule__ComponentInterface__Group_9__3 : rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 ;
    public final void rule__ComponentInterface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1492:1: ( rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 )
            // InternalComponentInterface.g:1493:2: rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1500:1: rule__ComponentInterface__Group_9__3__Impl : ( ( rule__ComponentInterface__Group_9_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1504:1: ( ( ( rule__ComponentInterface__Group_9_3__0 )* ) )
            // InternalComponentInterface.g:1505:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            {
            // InternalComponentInterface.g:1505:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            // InternalComponentInterface.g:1506:2: ( rule__ComponentInterface__Group_9_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9_3()); 
            // InternalComponentInterface.g:1507:2: ( rule__ComponentInterface__Group_9_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentInterface.g:1507:3: rule__ComponentInterface__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalComponentInterface.g:1515:1: rule__ComponentInterface__Group_9__4 : rule__ComponentInterface__Group_9__4__Impl ;
    public final void rule__ComponentInterface__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1519:1: ( rule__ComponentInterface__Group_9__4__Impl )
            // InternalComponentInterface.g:1520:2: rule__ComponentInterface__Group_9__4__Impl
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
    // InternalComponentInterface.g:1526:1: rule__ComponentInterface__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1530:1: ( ( '}' ) )
            // InternalComponentInterface.g:1531:1: ( '}' )
            {
            // InternalComponentInterface.g:1531:1: ( '}' )
            // InternalComponentInterface.g:1532:2: '}'
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
    // InternalComponentInterface.g:1542:1: rule__ComponentInterface__Group_9_3__0 : rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 ;
    public final void rule__ComponentInterface__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1546:1: ( rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 )
            // InternalComponentInterface.g:1547:2: rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1554:1: rule__ComponentInterface__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1558:1: ( ( ',' ) )
            // InternalComponentInterface.g:1559:1: ( ',' )
            {
            // InternalComponentInterface.g:1559:1: ( ',' )
            // InternalComponentInterface.g:1560:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:1569:1: rule__ComponentInterface__Group_9_3__1 : rule__ComponentInterface__Group_9_3__1__Impl ;
    public final void rule__ComponentInterface__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1573:1: ( rule__ComponentInterface__Group_9_3__1__Impl )
            // InternalComponentInterface.g:1574:2: rule__ComponentInterface__Group_9_3__1__Impl
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
    // InternalComponentInterface.g:1580:1: rule__ComponentInterface__Group_9_3__1__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1584:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) )
            // InternalComponentInterface.g:1585:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            {
            // InternalComponentInterface.g:1585:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            // InternalComponentInterface.g:1586:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_3_1()); 
            // InternalComponentInterface.g:1587:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            // InternalComponentInterface.g:1587:3: rule__ComponentInterface__RosactionserverAssignment_9_3_1
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
    // InternalComponentInterface.g:1596:1: rule__ComponentInterface__Group_10__0 : rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 ;
    public final void rule__ComponentInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1600:1: ( rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 )
            // InternalComponentInterface.g:1601:2: rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:1608:1: rule__ComponentInterface__Group_10__0__Impl : ( 'RosActionClients' ) ;
    public final void rule__ComponentInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1612:1: ( ( 'RosActionClients' ) )
            // InternalComponentInterface.g:1613:1: ( 'RosActionClients' )
            {
            // InternalComponentInterface.g:1613:1: ( 'RosActionClients' )
            // InternalComponentInterface.g:1614:2: 'RosActionClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentInterface.g:1623:1: rule__ComponentInterface__Group_10__1 : rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 ;
    public final void rule__ComponentInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1627:1: ( rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 )
            // InternalComponentInterface.g:1628:2: rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1635:1: rule__ComponentInterface__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1639:1: ( ( '{' ) )
            // InternalComponentInterface.g:1640:1: ( '{' )
            {
            // InternalComponentInterface.g:1640:1: ( '{' )
            // InternalComponentInterface.g:1641:2: '{'
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
    // InternalComponentInterface.g:1650:1: rule__ComponentInterface__Group_10__2 : rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 ;
    public final void rule__ComponentInterface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1654:1: ( rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 )
            // InternalComponentInterface.g:1655:2: rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1662:1: rule__ComponentInterface__Group_10__2__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) ;
    public final void rule__ComponentInterface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1666:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) )
            // InternalComponentInterface.g:1667:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            {
            // InternalComponentInterface.g:1667:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            // InternalComponentInterface.g:1668:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_2()); 
            // InternalComponentInterface.g:1669:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            // InternalComponentInterface.g:1669:3: rule__ComponentInterface__RosactionclientAssignment_10_2
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
    // InternalComponentInterface.g:1677:1: rule__ComponentInterface__Group_10__3 : rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 ;
    public final void rule__ComponentInterface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1681:1: ( rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 )
            // InternalComponentInterface.g:1682:2: rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:1689:1: rule__ComponentInterface__Group_10__3__Impl : ( ( rule__ComponentInterface__Group_10_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1693:1: ( ( ( rule__ComponentInterface__Group_10_3__0 )* ) )
            // InternalComponentInterface.g:1694:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            {
            // InternalComponentInterface.g:1694:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            // InternalComponentInterface.g:1695:2: ( rule__ComponentInterface__Group_10_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10_3()); 
            // InternalComponentInterface.g:1696:2: ( rule__ComponentInterface__Group_10_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentInterface.g:1696:3: rule__ComponentInterface__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalComponentInterface.g:1704:1: rule__ComponentInterface__Group_10__4 : rule__ComponentInterface__Group_10__4__Impl ;
    public final void rule__ComponentInterface__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1708:1: ( rule__ComponentInterface__Group_10__4__Impl )
            // InternalComponentInterface.g:1709:2: rule__ComponentInterface__Group_10__4__Impl
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
    // InternalComponentInterface.g:1715:1: rule__ComponentInterface__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1719:1: ( ( '}' ) )
            // InternalComponentInterface.g:1720:1: ( '}' )
            {
            // InternalComponentInterface.g:1720:1: ( '}' )
            // InternalComponentInterface.g:1721:2: '}'
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
    // InternalComponentInterface.g:1731:1: rule__ComponentInterface__Group_10_3__0 : rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 ;
    public final void rule__ComponentInterface__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1735:1: ( rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 )
            // InternalComponentInterface.g:1736:2: rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1743:1: rule__ComponentInterface__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1747:1: ( ( ',' ) )
            // InternalComponentInterface.g:1748:1: ( ',' )
            {
            // InternalComponentInterface.g:1748:1: ( ',' )
            // InternalComponentInterface.g:1749:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:1758:1: rule__ComponentInterface__Group_10_3__1 : rule__ComponentInterface__Group_10_3__1__Impl ;
    public final void rule__ComponentInterface__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1762:1: ( rule__ComponentInterface__Group_10_3__1__Impl )
            // InternalComponentInterface.g:1763:2: rule__ComponentInterface__Group_10_3__1__Impl
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
    // InternalComponentInterface.g:1769:1: rule__ComponentInterface__Group_10_3__1__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1773:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) )
            // InternalComponentInterface.g:1774:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            {
            // InternalComponentInterface.g:1774:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            // InternalComponentInterface.g:1775:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_3_1()); 
            // InternalComponentInterface.g:1776:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            // InternalComponentInterface.g:1776:3: rule__ComponentInterface__RosactionclientAssignment_10_3_1
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
    // InternalComponentInterface.g:1785:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1789:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalComponentInterface.g:1790:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:1797:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1801:1: ( ( () ) )
            // InternalComponentInterface.g:1802:1: ( () )
            {
            // InternalComponentInterface.g:1802:1: ( () )
            // InternalComponentInterface.g:1803:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:1804:2: ()
            // InternalComponentInterface.g:1804:3: 
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
    // InternalComponentInterface.g:1812:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1816:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalComponentInterface.g:1817:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:1824:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1828:1: ( ( 'RosPublisher' ) )
            // InternalComponentInterface.g:1829:1: ( 'RosPublisher' )
            {
            // InternalComponentInterface.g:1829:1: ( 'RosPublisher' )
            // InternalComponentInterface.g:1830:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:1839:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1843:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalComponentInterface.g:1844:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:1851:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1855:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:1856:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:1856:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalComponentInterface.g:1857:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:1858:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:1858:3: rule__RosPublisher__NameAssignment_2
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
    // InternalComponentInterface.g:1866:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1870:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalComponentInterface.g:1871:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:1878:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1882:1: ( ( '{' ) )
            // InternalComponentInterface.g:1883:1: ( '{' )
            {
            // InternalComponentInterface.g:1883:1: ( '{' )
            // InternalComponentInterface.g:1884:2: '{'
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
    // InternalComponentInterface.g:1893:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1897:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalComponentInterface.g:1898:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:1905:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1909:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:1910:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:1910:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalComponentInterface.g:1911:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:1912:2: ( rule__RosPublisher__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:1912:3: rule__RosPublisher__Group_4__0
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
    // InternalComponentInterface.g:1920:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1924:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalComponentInterface.g:1925:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
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
    // InternalComponentInterface.g:1932:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1936:1: ( ( 'RefPublisher' ) )
            // InternalComponentInterface.g:1937:1: ( 'RefPublisher' )
            {
            // InternalComponentInterface.g:1937:1: ( 'RefPublisher' )
            // InternalComponentInterface.g:1938:2: 'RefPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentInterface.g:1947:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1951:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalComponentInterface.g:1952:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:1959:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1963:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalComponentInterface.g:1964:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalComponentInterface.g:1964:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalComponentInterface.g:1965:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalComponentInterface.g:1966:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalComponentInterface.g:1966:3: rule__RosPublisher__PublisherAssignment_6
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
    // InternalComponentInterface.g:1974:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1978:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalComponentInterface.g:1979:2: rule__RosPublisher__Group__7__Impl
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
    // InternalComponentInterface.g:1985:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1989:1: ( ( '}' ) )
            // InternalComponentInterface.g:1990:1: ( '}' )
            {
            // InternalComponentInterface.g:1990:1: ( '}' )
            // InternalComponentInterface.g:1991:2: '}'
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
    // InternalComponentInterface.g:2001:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2005:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalComponentInterface.g:2006:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
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
    // InternalComponentInterface.g:2013:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2017:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2018:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2018:1: ( 'ns' )
            // InternalComponentInterface.g:2019:2: 'ns'
            {
             before(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:2028:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2032:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalComponentInterface.g:2033:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalComponentInterface.g:2039:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2043:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2044:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2044:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2045:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2046:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalComponentInterface.g:2046:3: rule__RosPublisher__NsAssignment_4_1
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
    // InternalComponentInterface.g:2055:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2059:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalComponentInterface.g:2060:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentInterface.g:2067:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2071:1: ( ( () ) )
            // InternalComponentInterface.g:2072:1: ( () )
            {
            // InternalComponentInterface.g:2072:1: ( () )
            // InternalComponentInterface.g:2073:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:2074:2: ()
            // InternalComponentInterface.g:2074:3: 
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
    // InternalComponentInterface.g:2082:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2086:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalComponentInterface.g:2087:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2094:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2098:1: ( ( 'RosSubscriber' ) )
            // InternalComponentInterface.g:2099:1: ( 'RosSubscriber' )
            {
            // InternalComponentInterface.g:2099:1: ( 'RosSubscriber' )
            // InternalComponentInterface.g:2100:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalComponentInterface.g:2109:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2113:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalComponentInterface.g:2114:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2121:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2125:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2126:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2126:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalComponentInterface.g:2127:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2128:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:2128:3: rule__RosSubscriber__NameAssignment_2
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
    // InternalComponentInterface.g:2136:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2140:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalComponentInterface.g:2141:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentInterface.g:2148:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2152:1: ( ( '{' ) )
            // InternalComponentInterface.g:2153:1: ( '{' )
            {
            // InternalComponentInterface.g:2153:1: ( '{' )
            // InternalComponentInterface.g:2154:2: '{'
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
    // InternalComponentInterface.g:2163:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2167:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalComponentInterface.g:2168:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentInterface.g:2175:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2179:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2180:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2180:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2181:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2182:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2182:3: rule__RosSubscriber__Group_4__0
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
    // InternalComponentInterface.g:2190:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2194:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalComponentInterface.g:2195:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
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
    // InternalComponentInterface.g:2202:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2206:1: ( ( 'RefSubscriber' ) )
            // InternalComponentInterface.g:2207:1: ( 'RefSubscriber' )
            {
            // InternalComponentInterface.g:2207:1: ( 'RefSubscriber' )
            // InternalComponentInterface.g:2208:2: 'RefSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalComponentInterface.g:2217:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2221:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalComponentInterface.g:2222:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2229:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2233:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalComponentInterface.g:2234:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalComponentInterface.g:2234:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalComponentInterface.g:2235:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalComponentInterface.g:2236:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalComponentInterface.g:2236:3: rule__RosSubscriber__SubscriberAssignment_6
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
    // InternalComponentInterface.g:2244:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2248:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalComponentInterface.g:2249:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalComponentInterface.g:2255:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2259:1: ( ( '}' ) )
            // InternalComponentInterface.g:2260:1: ( '}' )
            {
            // InternalComponentInterface.g:2260:1: ( '}' )
            // InternalComponentInterface.g:2261:2: '}'
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
    // InternalComponentInterface.g:2271:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2275:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalComponentInterface.g:2276:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
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
    // InternalComponentInterface.g:2283:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2287:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2288:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2288:1: ( 'ns' )
            // InternalComponentInterface.g:2289:2: 'ns'
            {
             before(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:2298:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2302:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:2303:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalComponentInterface.g:2309:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2313:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2314:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2314:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2315:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2316:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalComponentInterface.g:2316:3: rule__RosSubscriber__NsAssignment_4_1
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
    // InternalComponentInterface.g:2325:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2329:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalComponentInterface.g:2330:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentInterface.g:2337:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2341:1: ( ( () ) )
            // InternalComponentInterface.g:2342:1: ( () )
            {
            // InternalComponentInterface.g:2342:1: ( () )
            // InternalComponentInterface.g:2343:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:2344:2: ()
            // InternalComponentInterface.g:2344:3: 
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
    // InternalComponentInterface.g:2352:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2356:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalComponentInterface.g:2357:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2364:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2368:1: ( ( 'RosServiceServer' ) )
            // InternalComponentInterface.g:2369:1: ( 'RosServiceServer' )
            {
            // InternalComponentInterface.g:2369:1: ( 'RosServiceServer' )
            // InternalComponentInterface.g:2370:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalComponentInterface.g:2379:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2383:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalComponentInterface.g:2384:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2391:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2395:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2396:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2396:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:2397:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2398:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2398:3: rule__RosServiceServer__NameAssignment_2
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
    // InternalComponentInterface.g:2406:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2410:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalComponentInterface.g:2411:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2418:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2422:1: ( ( '{' ) )
            // InternalComponentInterface.g:2423:1: ( '{' )
            {
            // InternalComponentInterface.g:2423:1: ( '{' )
            // InternalComponentInterface.g:2424:2: '{'
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
    // InternalComponentInterface.g:2433:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2437:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalComponentInterface.g:2438:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2445:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2449:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2450:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2450:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2451:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2452:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2452:3: rule__RosServiceServer__Group_4__0
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
    // InternalComponentInterface.g:2460:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2464:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalComponentInterface.g:2465:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
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
    // InternalComponentInterface.g:2472:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2476:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:2477:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:2477:1: ( 'RefServer' )
            // InternalComponentInterface.g:2478:2: 'RefServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalComponentInterface.g:2487:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2491:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalComponentInterface.g:2492:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2499:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2503:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalComponentInterface.g:2504:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:2504:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalComponentInterface.g:2505:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalComponentInterface.g:2506:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalComponentInterface.g:2506:3: rule__RosServiceServer__SrvserverAssignment_6
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
    // InternalComponentInterface.g:2514:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2518:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalComponentInterface.g:2519:2: rule__RosServiceServer__Group__7__Impl
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
    // InternalComponentInterface.g:2525:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2529:1: ( ( '}' ) )
            // InternalComponentInterface.g:2530:1: ( '}' )
            {
            // InternalComponentInterface.g:2530:1: ( '}' )
            // InternalComponentInterface.g:2531:2: '}'
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
    // InternalComponentInterface.g:2541:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2545:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalComponentInterface.g:2546:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
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
    // InternalComponentInterface.g:2553:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2557:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2558:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2558:1: ( 'ns' )
            // InternalComponentInterface.g:2559:2: 'ns'
            {
             before(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:2568:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2572:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:2573:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalComponentInterface.g:2579:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2583:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2584:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2584:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2585:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2586:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:2586:3: rule__RosServiceServer__NsAssignment_4_1
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
    // InternalComponentInterface.g:2595:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2599:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalComponentInterface.g:2600:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:2607:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2611:1: ( ( () ) )
            // InternalComponentInterface.g:2612:1: ( () )
            {
            // InternalComponentInterface.g:2612:1: ( () )
            // InternalComponentInterface.g:2613:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:2614:2: ()
            // InternalComponentInterface.g:2614:3: 
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
    // InternalComponentInterface.g:2622:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2626:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalComponentInterface.g:2627:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2634:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2638:1: ( ( 'RosServiceClient' ) )
            // InternalComponentInterface.g:2639:1: ( 'RosServiceClient' )
            {
            // InternalComponentInterface.g:2639:1: ( 'RosServiceClient' )
            // InternalComponentInterface.g:2640:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentInterface.g:2649:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2653:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalComponentInterface.g:2654:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2661:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2665:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2666:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2666:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:2667:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2668:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:2668:3: rule__RosServiceClient__NameAssignment_2
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
    // InternalComponentInterface.g:2676:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2680:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalComponentInterface.g:2681:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:2688:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2692:1: ( ( '{' ) )
            // InternalComponentInterface.g:2693:1: ( '{' )
            {
            // InternalComponentInterface.g:2693:1: ( '{' )
            // InternalComponentInterface.g:2694:2: '{'
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
    // InternalComponentInterface.g:2703:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2707:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalComponentInterface.g:2708:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:2715:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2719:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:2720:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2720:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:2721:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:2722:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2722:3: rule__RosServiceClient__Group_4__0
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
    // InternalComponentInterface.g:2730:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2734:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalComponentInterface.g:2735:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
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
    // InternalComponentInterface.g:2742:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2746:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:2747:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:2747:1: ( 'RefClient' )
            // InternalComponentInterface.g:2748:2: 'RefClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentInterface.g:2757:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2761:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalComponentInterface.g:2762:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:2769:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2773:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalComponentInterface.g:2774:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:2774:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalComponentInterface.g:2775:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalComponentInterface.g:2776:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalComponentInterface.g:2776:3: rule__RosServiceClient__SrvclientAssignment_6
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
    // InternalComponentInterface.g:2784:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2788:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalComponentInterface.g:2789:2: rule__RosServiceClient__Group__7__Impl
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
    // InternalComponentInterface.g:2795:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2799:1: ( ( '}' ) )
            // InternalComponentInterface.g:2800:1: ( '}' )
            {
            // InternalComponentInterface.g:2800:1: ( '}' )
            // InternalComponentInterface.g:2801:2: '}'
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
    // InternalComponentInterface.g:2811:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2815:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalComponentInterface.g:2816:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
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
    // InternalComponentInterface.g:2823:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2827:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2828:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2828:1: ( 'ns' )
            // InternalComponentInterface.g:2829:2: 'ns'
            {
             before(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:2838:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2842:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:2843:2: rule__RosServiceClient__Group_4__1__Impl
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
    // InternalComponentInterface.g:2849:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2853:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2854:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2854:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2855:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2856:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:2856:3: rule__RosServiceClient__NsAssignment_4_1
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
    // InternalComponentInterface.g:2865:1: rule__RosActionServer__Group__0 : rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 ;
    public final void rule__RosActionServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2869:1: ( rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 )
            // InternalComponentInterface.g:2870:2: rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:2877:1: rule__RosActionServer__Group__0__Impl : ( () ) ;
    public final void rule__RosActionServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2881:1: ( ( () ) )
            // InternalComponentInterface.g:2882:1: ( () )
            {
            // InternalComponentInterface.g:2882:1: ( () )
            // InternalComponentInterface.g:2883:2: ()
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerAction_0()); 
            // InternalComponentInterface.g:2884:2: ()
            // InternalComponentInterface.g:2884:3: 
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
    // InternalComponentInterface.g:2892:1: rule__RosActionServer__Group__1 : rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 ;
    public final void rule__RosActionServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2896:1: ( rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 )
            // InternalComponentInterface.g:2897:2: rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2904:1: rule__RosActionServer__Group__1__Impl : ( 'RosActionServer' ) ;
    public final void rule__RosActionServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2908:1: ( ( 'RosActionServer' ) )
            // InternalComponentInterface.g:2909:1: ( 'RosActionServer' )
            {
            // InternalComponentInterface.g:2909:1: ( 'RosActionServer' )
            // InternalComponentInterface.g:2910:2: 'RosActionServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalComponentInterface.g:2919:1: rule__RosActionServer__Group__2 : rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 ;
    public final void rule__RosActionServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2923:1: ( rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 )
            // InternalComponentInterface.g:2924:2: rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:2931:1: rule__RosActionServer__Group__2__Impl : ( ( rule__RosActionServer__NameAssignment_2 )? ) ;
    public final void rule__RosActionServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2935:1: ( ( ( rule__RosActionServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2936:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2936:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:2937:2: ( rule__RosActionServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2938:2: ( rule__RosActionServer__NameAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:2938:3: rule__RosActionServer__NameAssignment_2
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
    // InternalComponentInterface.g:2946:1: rule__RosActionServer__Group__3 : rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 ;
    public final void rule__RosActionServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2950:1: ( rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 )
            // InternalComponentInterface.g:2951:2: rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2958:1: rule__RosActionServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2962:1: ( ( '{' ) )
            // InternalComponentInterface.g:2963:1: ( '{' )
            {
            // InternalComponentInterface.g:2963:1: ( '{' )
            // InternalComponentInterface.g:2964:2: '{'
            {
             before(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:2973:1: rule__RosActionServer__Group__4 : rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 ;
    public final void rule__RosActionServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2977:1: ( rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 )
            // InternalComponentInterface.g:2978:2: rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentInterface.g:2985:1: rule__RosActionServer__Group__4__Impl : ( ( rule__RosActionServer__Group_4__0 )? ) ;
    public final void rule__RosActionServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2989:1: ( ( ( rule__RosActionServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2990:1: ( ( rule__RosActionServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2990:1: ( ( rule__RosActionServer__Group_4__0 )? )
            // InternalComponentInterface.g:2991:2: ( rule__RosActionServer__Group_4__0 )?
            {
             before(grammarAccess.getRosActionServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2992:2: ( rule__RosActionServer__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:2992:3: rule__RosActionServer__Group_4__0
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
    // InternalComponentInterface.g:3000:1: rule__RosActionServer__Group__5 : rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 ;
    public final void rule__RosActionServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3004:1: ( rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 )
            // InternalComponentInterface.g:3005:2: rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6
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
    // InternalComponentInterface.g:3012:1: rule__RosActionServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosActionServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3016:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:3017:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:3017:1: ( 'RefServer' )
            // InternalComponentInterface.g:3018:2: 'RefServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRefServerKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalComponentInterface.g:3027:1: rule__RosActionServer__Group__6 : rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 ;
    public final void rule__RosActionServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3031:1: ( rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 )
            // InternalComponentInterface.g:3032:2: rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3039:1: rule__RosActionServer__Group__6__Impl : ( ( rule__RosActionServer__ActserverAssignment_6 ) ) ;
    public final void rule__RosActionServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3043:1: ( ( ( rule__RosActionServer__ActserverAssignment_6 ) ) )
            // InternalComponentInterface.g:3044:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:3044:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            // InternalComponentInterface.g:3045:2: ( rule__RosActionServer__ActserverAssignment_6 )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverAssignment_6()); 
            // InternalComponentInterface.g:3046:2: ( rule__RosActionServer__ActserverAssignment_6 )
            // InternalComponentInterface.g:3046:3: rule__RosActionServer__ActserverAssignment_6
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
    // InternalComponentInterface.g:3054:1: rule__RosActionServer__Group__7 : rule__RosActionServer__Group__7__Impl ;
    public final void rule__RosActionServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3058:1: ( rule__RosActionServer__Group__7__Impl )
            // InternalComponentInterface.g:3059:2: rule__RosActionServer__Group__7__Impl
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
    // InternalComponentInterface.g:3065:1: rule__RosActionServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3069:1: ( ( '}' ) )
            // InternalComponentInterface.g:3070:1: ( '}' )
            {
            // InternalComponentInterface.g:3070:1: ( '}' )
            // InternalComponentInterface.g:3071:2: '}'
            {
             before(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:3081:1: rule__RosActionServer__Group_4__0 : rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 ;
    public final void rule__RosActionServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3085:1: ( rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 )
            // InternalComponentInterface.g:3086:2: rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1
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
    // InternalComponentInterface.g:3093:1: rule__RosActionServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3097:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3098:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3098:1: ( 'ns' )
            // InternalComponentInterface.g:3099:2: 'ns'
            {
             before(grammarAccess.getRosActionServerAccess().getNsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:3108:1: rule__RosActionServer__Group_4__1 : rule__RosActionServer__Group_4__1__Impl ;
    public final void rule__RosActionServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3112:1: ( rule__RosActionServer__Group_4__1__Impl )
            // InternalComponentInterface.g:3113:2: rule__RosActionServer__Group_4__1__Impl
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
    // InternalComponentInterface.g:3119:1: rule__RosActionServer__Group_4__1__Impl : ( ( rule__RosActionServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3123:1: ( ( ( rule__RosActionServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3124:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3124:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3125:2: ( rule__RosActionServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3126:2: ( rule__RosActionServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:3126:3: rule__RosActionServer__NsAssignment_4_1
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
    // InternalComponentInterface.g:3135:1: rule__RosActionClient__Group__0 : rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 ;
    public final void rule__RosActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3139:1: ( rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 )
            // InternalComponentInterface.g:3140:2: rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:3147:1: rule__RosActionClient__Group__0__Impl : ( () ) ;
    public final void rule__RosActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3151:1: ( ( () ) )
            // InternalComponentInterface.g:3152:1: ( () )
            {
            // InternalComponentInterface.g:3152:1: ( () )
            // InternalComponentInterface.g:3153:2: ()
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientAction_0()); 
            // InternalComponentInterface.g:3154:2: ()
            // InternalComponentInterface.g:3154:3: 
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
    // InternalComponentInterface.g:3162:1: rule__RosActionClient__Group__1 : rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 ;
    public final void rule__RosActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3166:1: ( rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 )
            // InternalComponentInterface.g:3167:2: rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:3174:1: rule__RosActionClient__Group__1__Impl : ( 'RosActionClient' ) ;
    public final void rule__RosActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3178:1: ( ( 'RosActionClient' ) )
            // InternalComponentInterface.g:3179:1: ( 'RosActionClient' )
            {
            // InternalComponentInterface.g:3179:1: ( 'RosActionClient' )
            // InternalComponentInterface.g:3180:2: 'RosActionClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentInterface.g:3189:1: rule__RosActionClient__Group__2 : rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 ;
    public final void rule__RosActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3193:1: ( rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 )
            // InternalComponentInterface.g:3194:2: rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:3201:1: rule__RosActionClient__Group__2__Impl : ( ( rule__RosActionClient__NameAssignment_2 )? ) ;
    public final void rule__RosActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3205:1: ( ( ( rule__RosActionClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3206:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3206:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3207:2: ( rule__RosActionClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3208:2: ( rule__RosActionClient__NameAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:3208:3: rule__RosActionClient__NameAssignment_2
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
    // InternalComponentInterface.g:3216:1: rule__RosActionClient__Group__3 : rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 ;
    public final void rule__RosActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3220:1: ( rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 )
            // InternalComponentInterface.g:3221:2: rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:3228:1: rule__RosActionClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3232:1: ( ( '{' ) )
            // InternalComponentInterface.g:3233:1: ( '{' )
            {
            // InternalComponentInterface.g:3233:1: ( '{' )
            // InternalComponentInterface.g:3234:2: '{'
            {
             before(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentInterface.g:3243:1: rule__RosActionClient__Group__4 : rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 ;
    public final void rule__RosActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3247:1: ( rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 )
            // InternalComponentInterface.g:3248:2: rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentInterface.g:3255:1: rule__RosActionClient__Group__4__Impl : ( ( rule__RosActionClient__Group_4__0 )? ) ;
    public final void rule__RosActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3259:1: ( ( ( rule__RosActionClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3260:1: ( ( rule__RosActionClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3260:1: ( ( rule__RosActionClient__Group_4__0 )? )
            // InternalComponentInterface.g:3261:2: ( rule__RosActionClient__Group_4__0 )?
            {
             before(grammarAccess.getRosActionClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3262:2: ( rule__RosActionClient__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:3262:3: rule__RosActionClient__Group_4__0
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
    // InternalComponentInterface.g:3270:1: rule__RosActionClient__Group__5 : rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 ;
    public final void rule__RosActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3274:1: ( rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 )
            // InternalComponentInterface.g:3275:2: rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6
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
    // InternalComponentInterface.g:3282:1: rule__RosActionClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3286:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3287:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3287:1: ( 'RefClient' )
            // InternalComponentInterface.g:3288:2: 'RefClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRefClientKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentInterface.g:3297:1: rule__RosActionClient__Group__6 : rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 ;
    public final void rule__RosActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3301:1: ( rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 )
            // InternalComponentInterface.g:3302:2: rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3309:1: rule__RosActionClient__Group__6__Impl : ( ( rule__RosActionClient__ActclientAssignment_6 ) ) ;
    public final void rule__RosActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3313:1: ( ( ( rule__RosActionClient__ActclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3314:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3314:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            // InternalComponentInterface.g:3315:2: ( rule__RosActionClient__ActclientAssignment_6 )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientAssignment_6()); 
            // InternalComponentInterface.g:3316:2: ( rule__RosActionClient__ActclientAssignment_6 )
            // InternalComponentInterface.g:3316:3: rule__RosActionClient__ActclientAssignment_6
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
    // InternalComponentInterface.g:3324:1: rule__RosActionClient__Group__7 : rule__RosActionClient__Group__7__Impl ;
    public final void rule__RosActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3328:1: ( rule__RosActionClient__Group__7__Impl )
            // InternalComponentInterface.g:3329:2: rule__RosActionClient__Group__7__Impl
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
    // InternalComponentInterface.g:3335:1: rule__RosActionClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3339:1: ( ( '}' ) )
            // InternalComponentInterface.g:3340:1: ( '}' )
            {
            // InternalComponentInterface.g:3340:1: ( '}' )
            // InternalComponentInterface.g:3341:2: '}'
            {
             before(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:3351:1: rule__RosActionClient__Group_4__0 : rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 ;
    public final void rule__RosActionClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3355:1: ( rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 )
            // InternalComponentInterface.g:3356:2: rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1
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
    // InternalComponentInterface.g:3363:1: rule__RosActionClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3367:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3368:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3368:1: ( 'ns' )
            // InternalComponentInterface.g:3369:2: 'ns'
            {
             before(grammarAccess.getRosActionClientAccess().getNsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:3378:1: rule__RosActionClient__Group_4__1 : rule__RosActionClient__Group_4__1__Impl ;
    public final void rule__RosActionClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3382:1: ( rule__RosActionClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3383:2: rule__RosActionClient__Group_4__1__Impl
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
    // InternalComponentInterface.g:3389:1: rule__RosActionClient__Group_4__1__Impl : ( ( rule__RosActionClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3393:1: ( ( ( rule__RosActionClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3394:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3394:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3395:2: ( rule__RosActionClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3396:2: ( rule__RosActionClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3396:3: rule__RosActionClient__NsAssignment_4_1
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


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:3405:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3409:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3410:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3410:2: ( ruleEString )
            // InternalComponentInterface.g:3411:3: ruleEString
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
    // InternalComponentInterface.g:3420:1: rule__ComponentInterface__NameSpaceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3424:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3425:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3425:2: ( ruleEString )
            // InternalComponentInterface.g:3426:3: ruleEString
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


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_5_2"
    // InternalComponentInterface.g:3435:1: rule__ComponentInterface__RospublisherAssignment_5_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3439:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:3440:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:3440:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:3441:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_5_2"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_5_3_1"
    // InternalComponentInterface.g:3450:1: rule__ComponentInterface__RospublisherAssignment_5_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3454:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:3455:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:3455:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:3456:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_5_3_1"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_6_2"
    // InternalComponentInterface.g:3465:1: rule__ComponentInterface__RossubscriberAssignment_6_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3469:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:3470:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:3470:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:3471:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_6_2"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_6_3_1"
    // InternalComponentInterface.g:3480:1: rule__ComponentInterface__RossubscriberAssignment_6_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3484:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:3485:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:3485:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:3486:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_6_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_7_2"
    // InternalComponentInterface.g:3495:1: rule__ComponentInterface__RosserviceserverAssignment_7_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3499:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:3500:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:3500:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:3501:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_7_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_7_3_1"
    // InternalComponentInterface.g:3510:1: rule__ComponentInterface__RosserviceserverAssignment_7_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3514:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:3515:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:3515:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:3516:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_7_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_8_2"
    // InternalComponentInterface.g:3525:1: rule__ComponentInterface__RosserviceclientAssignment_8_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3529:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:3530:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:3530:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:3531:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_8_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_8_3_1"
    // InternalComponentInterface.g:3540:1: rule__ComponentInterface__RosserviceclientAssignment_8_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3544:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:3545:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:3545:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:3546:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_8_3_1"


    // $ANTLR start "rule__ComponentInterface__RosactionserverAssignment_9_2"
    // InternalComponentInterface.g:3555:1: rule__ComponentInterface__RosactionserverAssignment_9_2 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3559:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:3560:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:3560:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:3561:3: ruleRosActionServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionserverAssignment_9_2"


    // $ANTLR start "rule__ComponentInterface__RosactionserverAssignment_9_3_1"
    // InternalComponentInterface.g:3570:1: rule__ComponentInterface__RosactionserverAssignment_9_3_1 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3574:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:3575:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:3575:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:3576:3: ruleRosActionServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionserverAssignment_9_3_1"


    // $ANTLR start "rule__ComponentInterface__RosactionclientAssignment_10_2"
    // InternalComponentInterface.g:3585:1: rule__ComponentInterface__RosactionclientAssignment_10_2 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3589:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:3590:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:3590:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:3591:3: ruleRosActionClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionclientAssignment_10_2"


    // $ANTLR start "rule__ComponentInterface__RosactionclientAssignment_10_3_1"
    // InternalComponentInterface.g:3600:1: rule__ComponentInterface__RosactionclientAssignment_10_3_1 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3604:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:3605:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:3605:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:3606:3: ruleRosActionClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionclientAssignment_10_3_1"


    // $ANTLR start "rule__RosPublisher__NameAssignment_2"
    // InternalComponentInterface.g:3615:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3619:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3620:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3620:2: ( ruleEString )
            // InternalComponentInterface.g:3621:3: ruleEString
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
    // InternalComponentInterface.g:3630:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3634:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3635:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3635:2: ( ruleEString )
            // InternalComponentInterface.g:3636:3: ruleEString
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
    // InternalComponentInterface.g:3645:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3649:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3650:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3650:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3651:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalComponentInterface.g:3652:3: ( ruleEString )
            // InternalComponentInterface.g:3653:4: ruleEString
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
    // InternalComponentInterface.g:3664:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3668:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3669:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3669:2: ( ruleEString )
            // InternalComponentInterface.g:3670:3: ruleEString
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
    // InternalComponentInterface.g:3679:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3683:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3684:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3684:2: ( ruleEString )
            // InternalComponentInterface.g:3685:3: ruleEString
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
    // InternalComponentInterface.g:3694:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3698:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3699:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3699:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3700:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalComponentInterface.g:3701:3: ( ruleEString )
            // InternalComponentInterface.g:3702:4: ruleEString
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
    // InternalComponentInterface.g:3713:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3717:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3718:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3718:2: ( ruleEString )
            // InternalComponentInterface.g:3719:3: ruleEString
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
    // InternalComponentInterface.g:3728:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3732:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3733:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3733:2: ( ruleEString )
            // InternalComponentInterface.g:3734:3: ruleEString
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
    // InternalComponentInterface.g:3743:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3747:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3748:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3748:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3749:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalComponentInterface.g:3750:3: ( ruleEString )
            // InternalComponentInterface.g:3751:4: ruleEString
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
    // InternalComponentInterface.g:3762:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3766:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3767:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3767:2: ( ruleEString )
            // InternalComponentInterface.g:3768:3: ruleEString
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
    // InternalComponentInterface.g:3777:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3781:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3782:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3782:2: ( ruleEString )
            // InternalComponentInterface.g:3783:3: ruleEString
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
    // InternalComponentInterface.g:3792:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3796:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3797:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3797:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3798:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalComponentInterface.g:3799:3: ( ruleEString )
            // InternalComponentInterface.g:3800:4: ruleEString
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
    // InternalComponentInterface.g:3811:1: rule__RosActionServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3815:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3816:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3816:2: ( ruleEString )
            // InternalComponentInterface.g:3817:3: ruleEString
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
    // InternalComponentInterface.g:3826:1: rule__RosActionServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3830:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3831:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3831:2: ( ruleEString )
            // InternalComponentInterface.g:3832:3: ruleEString
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
    // InternalComponentInterface.g:3841:1: rule__RosActionServer__ActserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServer__ActserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3845:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3846:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3846:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3847:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0()); 
            // InternalComponentInterface.g:3848:3: ( ruleEString )
            // InternalComponentInterface.g:3849:4: ruleEString
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
    // InternalComponentInterface.g:3860:1: rule__RosActionClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3864:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3865:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3865:2: ( ruleEString )
            // InternalComponentInterface.g:3866:3: ruleEString
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
    // InternalComponentInterface.g:3875:1: rule__RosActionClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3879:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3880:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3880:2: ( ruleEString )
            // InternalComponentInterface.g:3881:3: ruleEString
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
    // InternalComponentInterface.g:3890:1: rule__RosActionClient__ActclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClient__ActclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3894:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3895:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3895:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3896:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0()); 
            // InternalComponentInterface.g:3897:3: ( ruleEString )
            // InternalComponentInterface.g:3898:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007DC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000082000000L});

}