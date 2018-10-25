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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'}'", "'namespace'", "'RosTopicPublisher'", "','", "'RosTopicSubscriber'", "'RosServiceServer'", "'RosServiceClient'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'ServiceServer'", "'ServiceName'", "'SrvRef'"
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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:79:1: ( ruleEString EOF )
            // InternalComponentInterface.g:80:1: ruleEString EOF
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
    // InternalComponentInterface.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComponentInterface.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComponentInterface.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalComponentInterface.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComponentInterface.g:94:3: ( rule__EString__Alternatives )
            // InternalComponentInterface.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:103:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:104:1: ( ruleNamespace EOF )
            // InternalComponentInterface.g:105:1: ruleNamespace EOF
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
    // InternalComponentInterface.g:112:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:116:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalComponentInterface.g:117:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalComponentInterface.g:117:2: ( ( rule__Namespace__Alternatives ) )
            // InternalComponentInterface.g:118:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalComponentInterface.g:119:3: ( rule__Namespace__Alternatives )
            // InternalComponentInterface.g:119:4: rule__Namespace__Alternatives
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


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalComponentInterface.g:128:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:129:1: ( ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:130:1: ruleGlobalNamespace EOF
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
    // InternalComponentInterface.g:137:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:141:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalComponentInterface.g:142:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalComponentInterface.g:142:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalComponentInterface.g:143:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalComponentInterface.g:144:3: ( rule__GlobalNamespace__Group__0 )
            // InternalComponentInterface.g:144:4: rule__GlobalNamespace__Group__0
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
    // InternalComponentInterface.g:153:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalComponentInterface.g:154:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:155:1: ruleRelativeNamespace_Impl EOF
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
    // InternalComponentInterface.g:162:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:166:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalComponentInterface.g:167:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalComponentInterface.g:167:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalComponentInterface.g:168:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalComponentInterface.g:169:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalComponentInterface.g:169:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalComponentInterface.g:178:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:179:1: ( rulePrivateNamespace EOF )
            // InternalComponentInterface.g:180:1: rulePrivateNamespace EOF
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
    // InternalComponentInterface.g:187:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:191:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalComponentInterface.g:192:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalComponentInterface.g:192:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalComponentInterface.g:193:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalComponentInterface.g:194:3: ( rule__PrivateNamespace__Group__0 )
            // InternalComponentInterface.g:194:4: rule__PrivateNamespace__Group__0
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


    // $ANTLR start "entryRuleRosPublisher"
    // InternalComponentInterface.g:203:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalComponentInterface.g:204:1: ( ruleRosPublisher EOF )
            // InternalComponentInterface.g:205:1: ruleRosPublisher EOF
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
    // InternalComponentInterface.g:212:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:216:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalComponentInterface.g:217:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalComponentInterface.g:217:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalComponentInterface.g:218:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalComponentInterface.g:219:3: ( rule__RosPublisher__Group__0 )
            // InternalComponentInterface.g:219:4: rule__RosPublisher__Group__0
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
    // InternalComponentInterface.g:228:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( ruleRosSubscriber EOF )
            // InternalComponentInterface.g:230:1: ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:237:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalComponentInterface.g:243:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalComponentInterface.g:244:3: ( rule__RosSubscriber__Group__0 )
            // InternalComponentInterface.g:244:4: rule__RosSubscriber__Group__0
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
    // InternalComponentInterface.g:253:1: entryRuleRosServiceServer : ruleRosServiceServer EOF ;
    public final void entryRuleRosServiceServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:254:1: ( ruleRosServiceServer EOF )
            // InternalComponentInterface.g:255:1: ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:262:1: ruleRosServiceServer : ( ( rule__RosServiceServer__Group__0 ) ) ;
    public final void ruleRosServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:266:2: ( ( ( rule__RosServiceServer__Group__0 ) ) )
            // InternalComponentInterface.g:267:2: ( ( rule__RosServiceServer__Group__0 ) )
            {
            // InternalComponentInterface.g:267:2: ( ( rule__RosServiceServer__Group__0 ) )
            // InternalComponentInterface.g:268:3: ( rule__RosServiceServer__Group__0 )
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup()); 
            // InternalComponentInterface.g:269:3: ( rule__RosServiceServer__Group__0 )
            // InternalComponentInterface.g:269:4: rule__RosServiceServer__Group__0
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
    // InternalComponentInterface.g:278:1: entryRuleRosServiceClient : ruleRosServiceClient EOF ;
    public final void entryRuleRosServiceClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:279:1: ( ruleRosServiceClient EOF )
            // InternalComponentInterface.g:280:1: ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:287:1: ruleRosServiceClient : ( ( rule__RosServiceClient__Group__0 ) ) ;
    public final void ruleRosServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:291:2: ( ( ( rule__RosServiceClient__Group__0 ) ) )
            // InternalComponentInterface.g:292:2: ( ( rule__RosServiceClient__Group__0 ) )
            {
            // InternalComponentInterface.g:292:2: ( ( rule__RosServiceClient__Group__0 ) )
            // InternalComponentInterface.g:293:3: ( rule__RosServiceClient__Group__0 )
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup()); 
            // InternalComponentInterface.g:294:3: ( rule__RosServiceClient__Group__0 )
            // InternalComponentInterface.g:294:4: rule__RosServiceClient__Group__0
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
    // InternalComponentInterface.g:302:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:306:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalComponentInterface.g:307:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:307:2: ( RULE_STRING )
                    // InternalComponentInterface.g:308:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:313:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:313:2: ( RULE_ID )
                    // InternalComponentInterface.g:314:3: RULE_ID
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


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalComponentInterface.g:323:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:327:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // InternalComponentInterface.g:328:2: ( ruleGlobalNamespace )
                    {
                    // InternalComponentInterface.g:328:2: ( ruleGlobalNamespace )
                    // InternalComponentInterface.g:329:3: ruleGlobalNamespace
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
                    // InternalComponentInterface.g:334:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalComponentInterface.g:334:2: ( ruleRelativeNamespace_Impl )
                    // InternalComponentInterface.g:335:3: ruleRelativeNamespace_Impl
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
                    // InternalComponentInterface.g:340:2: ( rulePrivateNamespace )
                    {
                    // InternalComponentInterface.g:340:2: ( rulePrivateNamespace )
                    // InternalComponentInterface.g:341:3: rulePrivateNamespace
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


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalComponentInterface.g:350:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:354:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:355:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalComponentInterface.g:362:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:366:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:367:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:367:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:368:2: 'ComponentInterface'
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
    // InternalComponentInterface.g:377:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:381:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:382:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
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
    // InternalComponentInterface.g:389:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:393:1: ( ( '{' ) )
            // InternalComponentInterface.g:394:1: ( '{' )
            {
            // InternalComponentInterface.g:394:1: ( '{' )
            // InternalComponentInterface.g:395:2: '{'
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
    // InternalComponentInterface.g:404:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:408:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:409:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
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
    // InternalComponentInterface.g:416:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:420:1: ( ( 'name' ) )
            // InternalComponentInterface.g:421:1: ( 'name' )
            {
            // InternalComponentInterface.g:421:1: ( 'name' )
            // InternalComponentInterface.g:422:2: 'name'
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
    // InternalComponentInterface.g:431:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:435:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:436:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
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
    // InternalComponentInterface.g:443:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:447:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:448:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:448:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:449:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:450:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:450:3: rule__ComponentInterface__NameAssignment_3
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
    // InternalComponentInterface.g:458:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:462:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:463:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
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
    // InternalComponentInterface.g:470:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:474:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:475:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:475:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:476:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:477:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:477:3: rule__ComponentInterface__Group_4__0
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
    // InternalComponentInterface.g:485:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:489:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:490:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
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
    // InternalComponentInterface.g:497:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:501:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:502:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:502:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:503:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:504:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:504:3: rule__ComponentInterface__Group_5__0
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
    // InternalComponentInterface.g:512:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:516:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:517:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
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
    // InternalComponentInterface.g:524:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:528:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:529:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:529:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:530:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:531:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:531:3: rule__ComponentInterface__Group_6__0
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
    // InternalComponentInterface.g:539:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:543:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:544:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
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
    // InternalComponentInterface.g:551:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:555:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:556:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:556:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:557:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:558:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:558:3: rule__ComponentInterface__Group_7__0
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
    // InternalComponentInterface.g:566:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:570:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalComponentInterface.g:571:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
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
    // InternalComponentInterface.g:578:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:582:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalComponentInterface.g:583:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalComponentInterface.g:583:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalComponentInterface.g:584:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalComponentInterface.g:585:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:585:3: rule__ComponentInterface__Group_8__0
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
    // InternalComponentInterface.g:593:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:597:1: ( rule__ComponentInterface__Group__9__Impl )
            // InternalComponentInterface.g:598:2: rule__ComponentInterface__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:604:1: rule__ComponentInterface__Group__9__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:608:1: ( ( '}' ) )
            // InternalComponentInterface.g:609:1: ( '}' )
            {
            // InternalComponentInterface.g:609:1: ( '}' )
            // InternalComponentInterface.g:610:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_4__0"
    // InternalComponentInterface.g:620:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:624:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:625:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:632:1: rule__ComponentInterface__Group_4__0__Impl : ( 'namespace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:636:1: ( ( 'namespace' ) )
            // InternalComponentInterface.g:637:1: ( 'namespace' )
            {
            // InternalComponentInterface.g:637:1: ( 'namespace' )
            // InternalComponentInterface.g:638:2: 'namespace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:647:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:651:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:652:2: rule__ComponentInterface__Group_4__1__Impl
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
    // InternalComponentInterface.g:658:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:662:1: ( ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:663:1: ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:663:1: ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) )
            // InternalComponentInterface.g:664:2: ( rule__ComponentInterface__NamespaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceAssignment_4_1()); 
            // InternalComponentInterface.g:665:2: ( rule__ComponentInterface__NamespaceAssignment_4_1 )
            // InternalComponentInterface.g:665:3: rule__ComponentInterface__NamespaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NamespaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNamespaceAssignment_4_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:674:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:678:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:679:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
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
    // InternalComponentInterface.g:686:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosTopicPublisher' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:690:1: ( ( 'RosTopicPublisher' ) )
            // InternalComponentInterface.g:691:1: ( 'RosTopicPublisher' )
            {
            // InternalComponentInterface.g:691:1: ( 'RosTopicPublisher' )
            // InternalComponentInterface.g:692:2: 'RosTopicPublisher'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherKeyword_5_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:701:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:705:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalComponentInterface.g:706:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:713:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:717:1: ( ( '{' ) )
            // InternalComponentInterface.g:718:1: ( '{' )
            {
            // InternalComponentInterface.g:718:1: ( '{' )
            // InternalComponentInterface.g:719:2: '{'
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
    // InternalComponentInterface.g:728:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:732:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalComponentInterface.g:733:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:740:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:744:1: ( ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_2 ) ) )
            // InternalComponentInterface.g:745:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_2 ) )
            {
            // InternalComponentInterface.g:745:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_2 ) )
            // InternalComponentInterface.g:746:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_2()); 
            // InternalComponentInterface.g:747:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_2 )
            // InternalComponentInterface.g:747:3: rule__ComponentInterface__RosTopicPublisherAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicPublisherAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:755:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:759:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalComponentInterface.g:760:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:767:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:771:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalComponentInterface.g:772:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalComponentInterface.g:772:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalComponentInterface.g:773:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalComponentInterface.g:774:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentInterface.g:774:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalComponentInterface.g:782:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:786:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalComponentInterface.g:787:2: rule__ComponentInterface__Group_5__4__Impl
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
    // InternalComponentInterface.g:793:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:797:1: ( ( '}' ) )
            // InternalComponentInterface.g:798:1: ( '}' )
            {
            // InternalComponentInterface.g:798:1: ( '}' )
            // InternalComponentInterface.g:799:2: '}'
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
    // InternalComponentInterface.g:809:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:813:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalComponentInterface.g:814:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:821:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:825:1: ( ( ',' ) )
            // InternalComponentInterface.g:826:1: ( ',' )
            {
            // InternalComponentInterface.g:826:1: ( ',' )
            // InternalComponentInterface.g:827:2: ','
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
    // InternalComponentInterface.g:836:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:840:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalComponentInterface.g:841:2: rule__ComponentInterface__Group_5_3__1__Impl
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
    // InternalComponentInterface.g:847:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:851:1: ( ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 ) ) )
            // InternalComponentInterface.g:852:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 ) )
            {
            // InternalComponentInterface.g:852:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 ) )
            // InternalComponentInterface.g:853:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_3_1()); 
            // InternalComponentInterface.g:854:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 )
            // InternalComponentInterface.g:854:3: rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_3_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:863:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:867:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:868:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
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
    // InternalComponentInterface.g:875:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosTopicSubscriber' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:879:1: ( ( 'RosTopicSubscriber' ) )
            // InternalComponentInterface.g:880:1: ( 'RosTopicSubscriber' )
            {
            // InternalComponentInterface.g:880:1: ( 'RosTopicSubscriber' )
            // InternalComponentInterface.g:881:2: 'RosTopicSubscriber'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberKeyword_6_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:890:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:894:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalComponentInterface.g:895:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentInterface.g:902:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:906:1: ( ( '{' ) )
            // InternalComponentInterface.g:907:1: ( '{' )
            {
            // InternalComponentInterface.g:907:1: ( '{' )
            // InternalComponentInterface.g:908:2: '{'
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
    // InternalComponentInterface.g:917:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:921:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalComponentInterface.g:922:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:929:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:933:1: ( ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 ) ) )
            // InternalComponentInterface.g:934:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 ) )
            {
            // InternalComponentInterface.g:934:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 ) )
            // InternalComponentInterface.g:935:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_2()); 
            // InternalComponentInterface.g:936:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 )
            // InternalComponentInterface.g:936:3: rule__ComponentInterface__RosTopicSubscriberAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicSubscriberAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:944:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:948:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalComponentInterface.g:949:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:956:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:960:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalComponentInterface.g:961:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalComponentInterface.g:961:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalComponentInterface.g:962:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalComponentInterface.g:963:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentInterface.g:963:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalComponentInterface.g:971:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:975:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalComponentInterface.g:976:2: rule__ComponentInterface__Group_6__4__Impl
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
    // InternalComponentInterface.g:982:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:986:1: ( ( '}' ) )
            // InternalComponentInterface.g:987:1: ( '}' )
            {
            // InternalComponentInterface.g:987:1: ( '}' )
            // InternalComponentInterface.g:988:2: '}'
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
    // InternalComponentInterface.g:998:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1002:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalComponentInterface.g:1003:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentInterface.g:1010:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1014:1: ( ( ',' ) )
            // InternalComponentInterface.g:1015:1: ( ',' )
            {
            // InternalComponentInterface.g:1015:1: ( ',' )
            // InternalComponentInterface.g:1016:2: ','
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
    // InternalComponentInterface.g:1025:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1029:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalComponentInterface.g:1030:2: rule__ComponentInterface__Group_6_3__1__Impl
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
    // InternalComponentInterface.g:1036:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1040:1: ( ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 ) ) )
            // InternalComponentInterface.g:1041:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 ) )
            {
            // InternalComponentInterface.g:1041:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 ) )
            // InternalComponentInterface.g:1042:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_3_1()); 
            // InternalComponentInterface.g:1043:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 )
            // InternalComponentInterface.g:1043:3: rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_3_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1052:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1056:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:1057:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
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
    // InternalComponentInterface.g:1064:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosServiceServer' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1068:1: ( ( 'RosServiceServer' ) )
            // InternalComponentInterface.g:1069:1: ( 'RosServiceServer' )
            {
            // InternalComponentInterface.g:1069:1: ( 'RosServiceServer' )
            // InternalComponentInterface.g:1070:2: 'RosServiceServer'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerKeyword_7_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1079:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1083:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalComponentInterface.g:1084:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1091:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1095:1: ( ( '{' ) )
            // InternalComponentInterface.g:1096:1: ( '{' )
            {
            // InternalComponentInterface.g:1096:1: ( '{' )
            // InternalComponentInterface.g:1097:2: '{'
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
    // InternalComponentInterface.g:1106:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1110:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalComponentInterface.g:1111:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1118:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosServiceServerAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1122:1: ( ( ( rule__ComponentInterface__RosServiceServerAssignment_7_2 ) ) )
            // InternalComponentInterface.g:1123:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_2 ) )
            {
            // InternalComponentInterface.g:1123:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_2 ) )
            // InternalComponentInterface.g:1124:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_2()); 
            // InternalComponentInterface.g:1125:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_2 )
            // InternalComponentInterface.g:1125:3: rule__ComponentInterface__RosServiceServerAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceServerAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1133:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1137:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalComponentInterface.g:1138:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1145:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1149:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalComponentInterface.g:1150:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalComponentInterface.g:1150:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalComponentInterface.g:1151:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalComponentInterface.g:1152:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:1152:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalComponentInterface.g:1160:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1164:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalComponentInterface.g:1165:2: rule__ComponentInterface__Group_7__4__Impl
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
    // InternalComponentInterface.g:1171:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1175:1: ( ( '}' ) )
            // InternalComponentInterface.g:1176:1: ( '}' )
            {
            // InternalComponentInterface.g:1176:1: ( '}' )
            // InternalComponentInterface.g:1177:2: '}'
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
    // InternalComponentInterface.g:1187:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1191:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalComponentInterface.g:1192:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1199:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1203:1: ( ( ',' ) )
            // InternalComponentInterface.g:1204:1: ( ',' )
            {
            // InternalComponentInterface.g:1204:1: ( ',' )
            // InternalComponentInterface.g:1205:2: ','
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
    // InternalComponentInterface.g:1214:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1218:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalComponentInterface.g:1219:2: rule__ComponentInterface__Group_7_3__1__Impl
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
    // InternalComponentInterface.g:1225:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosServiceServerAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1229:1: ( ( ( rule__ComponentInterface__RosServiceServerAssignment_7_3_1 ) ) )
            // InternalComponentInterface.g:1230:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_3_1 ) )
            {
            // InternalComponentInterface.g:1230:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_3_1 ) )
            // InternalComponentInterface.g:1231:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_3_1()); 
            // InternalComponentInterface.g:1232:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_3_1 )
            // InternalComponentInterface.g:1232:3: rule__ComponentInterface__RosServiceServerAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceServerAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1241:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1245:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalComponentInterface.g:1246:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
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
    // InternalComponentInterface.g:1253:1: rule__ComponentInterface__Group_8__0__Impl : ( 'RosServiceClient' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1257:1: ( ( 'RosServiceClient' ) )
            // InternalComponentInterface.g:1258:1: ( 'RosServiceClient' )
            {
            // InternalComponentInterface.g:1258:1: ( 'RosServiceClient' )
            // InternalComponentInterface.g:1259:2: 'RosServiceClient'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientKeyword_8_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1268:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1272:1: ( rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 )
            // InternalComponentInterface.g:1273:2: rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2
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
    // InternalComponentInterface.g:1280:1: rule__ComponentInterface__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1284:1: ( ( '{' ) )
            // InternalComponentInterface.g:1285:1: ( '{' )
            {
            // InternalComponentInterface.g:1285:1: ( '{' )
            // InternalComponentInterface.g:1286:2: '{'
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
    // InternalComponentInterface.g:1295:1: rule__ComponentInterface__Group_8__2 : rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 ;
    public final void rule__ComponentInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1299:1: ( rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 )
            // InternalComponentInterface.g:1300:2: rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1307:1: rule__ComponentInterface__Group_8__2__Impl : ( ( rule__ComponentInterface__RosServiceClientAssignment_8_2 ) ) ;
    public final void rule__ComponentInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1311:1: ( ( ( rule__ComponentInterface__RosServiceClientAssignment_8_2 ) ) )
            // InternalComponentInterface.g:1312:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_2 ) )
            {
            // InternalComponentInterface.g:1312:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_2 ) )
            // InternalComponentInterface.g:1313:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_2()); 
            // InternalComponentInterface.g:1314:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_2 )
            // InternalComponentInterface.g:1314:3: rule__ComponentInterface__RosServiceClientAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceClientAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:1322:1: rule__ComponentInterface__Group_8__3 : rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 ;
    public final void rule__ComponentInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1326:1: ( rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 )
            // InternalComponentInterface.g:1327:2: rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1334:1: rule__ComponentInterface__Group_8__3__Impl : ( ( rule__ComponentInterface__Group_8_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1338:1: ( ( ( rule__ComponentInterface__Group_8_3__0 )* ) )
            // InternalComponentInterface.g:1339:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            {
            // InternalComponentInterface.g:1339:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            // InternalComponentInterface.g:1340:2: ( rule__ComponentInterface__Group_8_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 
            // InternalComponentInterface.g:1341:2: ( rule__ComponentInterface__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:1341:3: rule__ComponentInterface__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentInterface__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalComponentInterface.g:1349:1: rule__ComponentInterface__Group_8__4 : rule__ComponentInterface__Group_8__4__Impl ;
    public final void rule__ComponentInterface__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1353:1: ( rule__ComponentInterface__Group_8__4__Impl )
            // InternalComponentInterface.g:1354:2: rule__ComponentInterface__Group_8__4__Impl
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
    // InternalComponentInterface.g:1360:1: rule__ComponentInterface__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1364:1: ( ( '}' ) )
            // InternalComponentInterface.g:1365:1: ( '}' )
            {
            // InternalComponentInterface.g:1365:1: ( '}' )
            // InternalComponentInterface.g:1366:2: '}'
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
    // InternalComponentInterface.g:1376:1: rule__ComponentInterface__Group_8_3__0 : rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 ;
    public final void rule__ComponentInterface__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1380:1: ( rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 )
            // InternalComponentInterface.g:1381:2: rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1
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
    // InternalComponentInterface.g:1388:1: rule__ComponentInterface__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1392:1: ( ( ',' ) )
            // InternalComponentInterface.g:1393:1: ( ',' )
            {
            // InternalComponentInterface.g:1393:1: ( ',' )
            // InternalComponentInterface.g:1394:2: ','
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
    // InternalComponentInterface.g:1403:1: rule__ComponentInterface__Group_8_3__1 : rule__ComponentInterface__Group_8_3__1__Impl ;
    public final void rule__ComponentInterface__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1407:1: ( rule__ComponentInterface__Group_8_3__1__Impl )
            // InternalComponentInterface.g:1408:2: rule__ComponentInterface__Group_8_3__1__Impl
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
    // InternalComponentInterface.g:1414:1: rule__ComponentInterface__Group_8_3__1__Impl : ( ( rule__ComponentInterface__RosServiceClientAssignment_8_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1418:1: ( ( ( rule__ComponentInterface__RosServiceClientAssignment_8_3_1 ) ) )
            // InternalComponentInterface.g:1419:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_3_1 ) )
            {
            // InternalComponentInterface.g:1419:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_3_1 ) )
            // InternalComponentInterface.g:1420:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_3_1()); 
            // InternalComponentInterface.g:1421:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_3_1 )
            // InternalComponentInterface.g:1421:3: rule__ComponentInterface__RosServiceClientAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceClientAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalComponentInterface.g:1430:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1434:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalComponentInterface.g:1435:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1442:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1446:1: ( ( () ) )
            // InternalComponentInterface.g:1447:1: ( () )
            {
            // InternalComponentInterface.g:1447:1: ( () )
            // InternalComponentInterface.g:1448:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalComponentInterface.g:1449:2: ()
            // InternalComponentInterface.g:1449:3: 
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
    // InternalComponentInterface.g:1457:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1461:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalComponentInterface.g:1462:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
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
    // InternalComponentInterface.g:1469:1: rule__GlobalNamespace__Group__1__Impl : ( 'GlobalNamespace' ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1473:1: ( ( 'GlobalNamespace' ) )
            // InternalComponentInterface.g:1474:1: ( 'GlobalNamespace' )
            {
            // InternalComponentInterface.g:1474:1: ( 'GlobalNamespace' )
            // InternalComponentInterface.g:1475:2: 'GlobalNamespace'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentInterface.g:1484:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1488:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalComponentInterface.g:1489:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1496:1: rule__GlobalNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1500:1: ( ( '{' ) )
            // InternalComponentInterface.g:1501:1: ( '{' )
            {
            // InternalComponentInterface.g:1501:1: ( '{' )
            // InternalComponentInterface.g:1502:2: '{'
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
    // InternalComponentInterface.g:1511:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1515:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalComponentInterface.g:1516:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1523:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1527:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:1528:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1528:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:1529:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:1530:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:1530:3: rule__GlobalNamespace__Group_3__0
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
    // InternalComponentInterface.g:1538:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1542:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalComponentInterface.g:1543:2: rule__GlobalNamespace__Group__4__Impl
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
    // InternalComponentInterface.g:1549:1: rule__GlobalNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1553:1: ( ( '}' ) )
            // InternalComponentInterface.g:1554:1: ( '}' )
            {
            // InternalComponentInterface.g:1554:1: ( '}' )
            // InternalComponentInterface.g:1555:2: '}'
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
    // InternalComponentInterface.g:1565:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1569:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalComponentInterface.g:1570:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
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
    // InternalComponentInterface.g:1577:1: rule__GlobalNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1581:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1582:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1582:1: ( 'parts' )
            // InternalComponentInterface.g:1583:2: 'parts'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentInterface.g:1592:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1596:1: ( rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 )
            // InternalComponentInterface.g:1597:2: rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2
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
    // InternalComponentInterface.g:1604:1: rule__GlobalNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1608:1: ( ( '{' ) )
            // InternalComponentInterface.g:1609:1: ( '{' )
            {
            // InternalComponentInterface.g:1609:1: ( '{' )
            // InternalComponentInterface.g:1610:2: '{'
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
    // InternalComponentInterface.g:1619:1: rule__GlobalNamespace__Group_3__2 : rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 ;
    public final void rule__GlobalNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1623:1: ( rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 )
            // InternalComponentInterface.g:1624:2: rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1631:1: rule__GlobalNamespace__Group_3__2__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__GlobalNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1635:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:1636:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:1636:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:1637:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:1638:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            // InternalComponentInterface.g:1638:3: rule__GlobalNamespace__PartsAssignment_3_2
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
    // InternalComponentInterface.g:1646:1: rule__GlobalNamespace__Group_3__3 : rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 ;
    public final void rule__GlobalNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1650:1: ( rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 )
            // InternalComponentInterface.g:1651:2: rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1658:1: rule__GlobalNamespace__Group_3__3__Impl : ( ( rule__GlobalNamespace__Group_3_3__0 )* ) ;
    public final void rule__GlobalNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1662:1: ( ( ( rule__GlobalNamespace__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:1663:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:1663:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            // InternalComponentInterface.g:1664:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:1665:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentInterface.g:1665:3: rule__GlobalNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GlobalNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalComponentInterface.g:1673:1: rule__GlobalNamespace__Group_3__4 : rule__GlobalNamespace__Group_3__4__Impl ;
    public final void rule__GlobalNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1677:1: ( rule__GlobalNamespace__Group_3__4__Impl )
            // InternalComponentInterface.g:1678:2: rule__GlobalNamespace__Group_3__4__Impl
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
    // InternalComponentInterface.g:1684:1: rule__GlobalNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1688:1: ( ( '}' ) )
            // InternalComponentInterface.g:1689:1: ( '}' )
            {
            // InternalComponentInterface.g:1689:1: ( '}' )
            // InternalComponentInterface.g:1690:2: '}'
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
    // InternalComponentInterface.g:1700:1: rule__GlobalNamespace__Group_3_3__0 : rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 ;
    public final void rule__GlobalNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1704:1: ( rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 )
            // InternalComponentInterface.g:1705:2: rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1
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
    // InternalComponentInterface.g:1712:1: rule__GlobalNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__GlobalNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1716:1: ( ( ',' ) )
            // InternalComponentInterface.g:1717:1: ( ',' )
            {
            // InternalComponentInterface.g:1717:1: ( ',' )
            // InternalComponentInterface.g:1718:2: ','
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
    // InternalComponentInterface.g:1727:1: rule__GlobalNamespace__Group_3_3__1 : rule__GlobalNamespace__Group_3_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1731:1: ( rule__GlobalNamespace__Group_3_3__1__Impl )
            // InternalComponentInterface.g:1732:2: rule__GlobalNamespace__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:1738:1: rule__GlobalNamespace__Group_3_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1742:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:1743:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:1743:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:1744:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:1745:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:1745:3: rule__GlobalNamespace__PartsAssignment_3_3_1
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
    // InternalComponentInterface.g:1754:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1758:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalComponentInterface.g:1759:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentInterface.g:1766:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1770:1: ( ( () ) )
            // InternalComponentInterface.g:1771:1: ( () )
            {
            // InternalComponentInterface.g:1771:1: ( () )
            // InternalComponentInterface.g:1772:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalComponentInterface.g:1773:2: ()
            // InternalComponentInterface.g:1773:3: 
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
    // InternalComponentInterface.g:1781:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1785:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalComponentInterface.g:1786:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
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
    // InternalComponentInterface.g:1793:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( 'RelativeNamespace' ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1797:1: ( ( 'RelativeNamespace' ) )
            // InternalComponentInterface.g:1798:1: ( 'RelativeNamespace' )
            {
            // InternalComponentInterface.g:1798:1: ( 'RelativeNamespace' )
            // InternalComponentInterface.g:1799:2: 'RelativeNamespace'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentInterface.g:1808:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1812:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalComponentInterface.g:1813:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1820:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1824:1: ( ( '{' ) )
            // InternalComponentInterface.g:1825:1: ( '{' )
            {
            // InternalComponentInterface.g:1825:1: ( '{' )
            // InternalComponentInterface.g:1826:2: '{'
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
    // InternalComponentInterface.g:1835:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1839:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalComponentInterface.g:1840:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1847:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1851:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalComponentInterface.g:1852:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1852:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalComponentInterface.g:1853:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalComponentInterface.g:1854:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:1854:3: rule__RelativeNamespace_Impl__Group_3__0
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
    // InternalComponentInterface.g:1862:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1866:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalComponentInterface.g:1867:2: rule__RelativeNamespace_Impl__Group__4__Impl
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
    // InternalComponentInterface.g:1873:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1877:1: ( ( '}' ) )
            // InternalComponentInterface.g:1878:1: ( '}' )
            {
            // InternalComponentInterface.g:1878:1: ( '}' )
            // InternalComponentInterface.g:1879:2: '}'
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
    // InternalComponentInterface.g:1889:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1893:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalComponentInterface.g:1894:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
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
    // InternalComponentInterface.g:1901:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1905:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1906:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1906:1: ( 'parts' )
            // InternalComponentInterface.g:1907:2: 'parts'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentInterface.g:1916:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1920:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 )
            // InternalComponentInterface.g:1921:2: rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2
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
    // InternalComponentInterface.g:1928:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1932:1: ( ( '{' ) )
            // InternalComponentInterface.g:1933:1: ( '{' )
            {
            // InternalComponentInterface.g:1933:1: ( '{' )
            // InternalComponentInterface.g:1934:2: '{'
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
    // InternalComponentInterface.g:1943:1: rule__RelativeNamespace_Impl__Group_3__2 : rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 ;
    public final void rule__RelativeNamespace_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1947:1: ( rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 )
            // InternalComponentInterface.g:1948:2: rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1955:1: rule__RelativeNamespace_Impl__Group_3__2__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1959:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:1960:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:1960:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:1961:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:1962:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            // InternalComponentInterface.g:1962:3: rule__RelativeNamespace_Impl__PartsAssignment_3_2
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
    // InternalComponentInterface.g:1970:1: rule__RelativeNamespace_Impl__Group_3__3 : rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 ;
    public final void rule__RelativeNamespace_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1974:1: ( rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 )
            // InternalComponentInterface.g:1975:2: rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:1982:1: rule__RelativeNamespace_Impl__Group_3__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1986:1: ( ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:1987:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:1987:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            // InternalComponentInterface.g:1988:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:1989:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentInterface.g:1989:3: rule__RelativeNamespace_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RelativeNamespace_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalComponentInterface.g:1997:1: rule__RelativeNamespace_Impl__Group_3__4 : rule__RelativeNamespace_Impl__Group_3__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2001:1: ( rule__RelativeNamespace_Impl__Group_3__4__Impl )
            // InternalComponentInterface.g:2002:2: rule__RelativeNamespace_Impl__Group_3__4__Impl
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
    // InternalComponentInterface.g:2008:1: rule__RelativeNamespace_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2012:1: ( ( '}' ) )
            // InternalComponentInterface.g:2013:1: ( '}' )
            {
            // InternalComponentInterface.g:2013:1: ( '}' )
            // InternalComponentInterface.g:2014:2: '}'
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
    // InternalComponentInterface.g:2024:1: rule__RelativeNamespace_Impl__Group_3_3__0 : rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2028:1: ( rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 )
            // InternalComponentInterface.g:2029:2: rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1
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
    // InternalComponentInterface.g:2036:1: rule__RelativeNamespace_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2040:1: ( ( ',' ) )
            // InternalComponentInterface.g:2041:1: ( ',' )
            {
            // InternalComponentInterface.g:2041:1: ( ',' )
            // InternalComponentInterface.g:2042:2: ','
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
    // InternalComponentInterface.g:2051:1: rule__RelativeNamespace_Impl__Group_3_3__1 : rule__RelativeNamespace_Impl__Group_3_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2055:1: ( rule__RelativeNamespace_Impl__Group_3_3__1__Impl )
            // InternalComponentInterface.g:2056:2: rule__RelativeNamespace_Impl__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:2062:1: rule__RelativeNamespace_Impl__Group_3_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2066:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:2067:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:2067:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:2068:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:2069:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:2069:3: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1
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
    // InternalComponentInterface.g:2078:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2082:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalComponentInterface.g:2083:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentInterface.g:2090:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2094:1: ( ( () ) )
            // InternalComponentInterface.g:2095:1: ( () )
            {
            // InternalComponentInterface.g:2095:1: ( () )
            // InternalComponentInterface.g:2096:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalComponentInterface.g:2097:2: ()
            // InternalComponentInterface.g:2097:3: 
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
    // InternalComponentInterface.g:2105:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2109:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalComponentInterface.g:2110:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
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
    // InternalComponentInterface.g:2117:1: rule__PrivateNamespace__Group__1__Impl : ( 'PrivateNamespace' ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2121:1: ( ( 'PrivateNamespace' ) )
            // InternalComponentInterface.g:2122:1: ( 'PrivateNamespace' )
            {
            // InternalComponentInterface.g:2122:1: ( 'PrivateNamespace' )
            // InternalComponentInterface.g:2123:2: 'PrivateNamespace'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentInterface.g:2132:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2136:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalComponentInterface.g:2137:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:2144:1: rule__PrivateNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2148:1: ( ( '{' ) )
            // InternalComponentInterface.g:2149:1: ( '{' )
            {
            // InternalComponentInterface.g:2149:1: ( '{' )
            // InternalComponentInterface.g:2150:2: '{'
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
    // InternalComponentInterface.g:2159:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2163:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalComponentInterface.g:2164:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:2171:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2175:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:2176:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2176:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:2177:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:2178:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:2178:3: rule__PrivateNamespace__Group_3__0
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
    // InternalComponentInterface.g:2186:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2190:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalComponentInterface.g:2191:2: rule__PrivateNamespace__Group__4__Impl
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
    // InternalComponentInterface.g:2197:1: rule__PrivateNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2201:1: ( ( '}' ) )
            // InternalComponentInterface.g:2202:1: ( '}' )
            {
            // InternalComponentInterface.g:2202:1: ( '}' )
            // InternalComponentInterface.g:2203:2: '}'
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
    // InternalComponentInterface.g:2213:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2217:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalComponentInterface.g:2218:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
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
    // InternalComponentInterface.g:2225:1: rule__PrivateNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2229:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:2230:1: ( 'parts' )
            {
            // InternalComponentInterface.g:2230:1: ( 'parts' )
            // InternalComponentInterface.g:2231:2: 'parts'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentInterface.g:2240:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2244:1: ( rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 )
            // InternalComponentInterface.g:2245:2: rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2
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
    // InternalComponentInterface.g:2252:1: rule__PrivateNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2256:1: ( ( '{' ) )
            // InternalComponentInterface.g:2257:1: ( '{' )
            {
            // InternalComponentInterface.g:2257:1: ( '{' )
            // InternalComponentInterface.g:2258:2: '{'
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
    // InternalComponentInterface.g:2267:1: rule__PrivateNamespace__Group_3__2 : rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 ;
    public final void rule__PrivateNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2271:1: ( rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 )
            // InternalComponentInterface.g:2272:2: rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:2279:1: rule__PrivateNamespace__Group_3__2__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__PrivateNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2283:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:2284:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:2284:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:2285:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:2286:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            // InternalComponentInterface.g:2286:3: rule__PrivateNamespace__PartsAssignment_3_2
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
    // InternalComponentInterface.g:2294:1: rule__PrivateNamespace__Group_3__3 : rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 ;
    public final void rule__PrivateNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2298:1: ( rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 )
            // InternalComponentInterface.g:2299:2: rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:2306:1: rule__PrivateNamespace__Group_3__3__Impl : ( ( rule__PrivateNamespace__Group_3_3__0 )* ) ;
    public final void rule__PrivateNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2310:1: ( ( ( rule__PrivateNamespace__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:2311:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:2311:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            // InternalComponentInterface.g:2312:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:2313:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentInterface.g:2313:3: rule__PrivateNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PrivateNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalComponentInterface.g:2321:1: rule__PrivateNamespace__Group_3__4 : rule__PrivateNamespace__Group_3__4__Impl ;
    public final void rule__PrivateNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2325:1: ( rule__PrivateNamespace__Group_3__4__Impl )
            // InternalComponentInterface.g:2326:2: rule__PrivateNamespace__Group_3__4__Impl
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
    // InternalComponentInterface.g:2332:1: rule__PrivateNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2336:1: ( ( '}' ) )
            // InternalComponentInterface.g:2337:1: ( '}' )
            {
            // InternalComponentInterface.g:2337:1: ( '}' )
            // InternalComponentInterface.g:2338:2: '}'
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
    // InternalComponentInterface.g:2348:1: rule__PrivateNamespace__Group_3_3__0 : rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 ;
    public final void rule__PrivateNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2352:1: ( rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 )
            // InternalComponentInterface.g:2353:2: rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1
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
    // InternalComponentInterface.g:2360:1: rule__PrivateNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__PrivateNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2364:1: ( ( ',' ) )
            // InternalComponentInterface.g:2365:1: ( ',' )
            {
            // InternalComponentInterface.g:2365:1: ( ',' )
            // InternalComponentInterface.g:2366:2: ','
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
    // InternalComponentInterface.g:2375:1: rule__PrivateNamespace__Group_3_3__1 : rule__PrivateNamespace__Group_3_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2379:1: ( rule__PrivateNamespace__Group_3_3__1__Impl )
            // InternalComponentInterface.g:2380:2: rule__PrivateNamespace__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:2386:1: rule__PrivateNamespace__Group_3_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2390:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:2391:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:2391:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:2392:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:2393:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:2393:3: rule__PrivateNamespace__PartsAssignment_3_3_1
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


    // $ANTLR start "rule__RosPublisher__Group__0"
    // InternalComponentInterface.g:2402:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2406:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalComponentInterface.g:2407:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
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
    // InternalComponentInterface.g:2414:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2418:1: ( ( () ) )
            // InternalComponentInterface.g:2419:1: ( () )
            {
            // InternalComponentInterface.g:2419:1: ( () )
            // InternalComponentInterface.g:2420:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:2421:2: ()
            // InternalComponentInterface.g:2421:3: 
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
    // InternalComponentInterface.g:2429:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2433:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalComponentInterface.g:2434:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:2441:1: rule__RosPublisher__Group__1__Impl : ( 'Publisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2445:1: ( ( 'Publisher' ) )
            // InternalComponentInterface.g:2446:1: ( 'Publisher' )
            {
            // InternalComponentInterface.g:2446:1: ( 'Publisher' )
            // InternalComponentInterface.g:2447:2: 'Publisher'
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getPublisherKeyword_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2456:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2460:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalComponentInterface.g:2461:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:2468:1: rule__RosPublisher__Group__2__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2472:1: ( ( '{' ) )
            // InternalComponentInterface.g:2473:1: ( '{' )
            {
            // InternalComponentInterface.g:2473:1: ( '{' )
            // InternalComponentInterface.g:2474:2: '{'
            {
             before(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2483:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2487:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalComponentInterface.g:2488:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
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
    // InternalComponentInterface.g:2495:1: rule__RosPublisher__Group__3__Impl : ( ( rule__RosPublisher__Group_3__0 )? ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2499:1: ( ( ( rule__RosPublisher__Group_3__0 )? ) )
            // InternalComponentInterface.g:2500:1: ( ( rule__RosPublisher__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2500:1: ( ( rule__RosPublisher__Group_3__0 )? )
            // InternalComponentInterface.g:2501:2: ( rule__RosPublisher__Group_3__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_3()); 
            // InternalComponentInterface.g:2502:2: ( rule__RosPublisher__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2502:3: rule__RosPublisher__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosPublisher__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosPublisherAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2510:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2514:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalComponentInterface.g:2515:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
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
    // InternalComponentInterface.g:2522:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2526:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:2527:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2527:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalComponentInterface.g:2528:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:2529:2: ( rule__RosPublisher__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2529:3: rule__RosPublisher__Group_4__0
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
    // InternalComponentInterface.g:2537:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2541:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalComponentInterface.g:2542:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:2549:1: rule__RosPublisher__Group__5__Impl : ( ( rule__RosPublisher__Group_5__0 )? ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2553:1: ( ( ( rule__RosPublisher__Group_5__0 )? ) )
            // InternalComponentInterface.g:2554:1: ( ( rule__RosPublisher__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2554:1: ( ( rule__RosPublisher__Group_5__0 )? )
            // InternalComponentInterface.g:2555:2: ( rule__RosPublisher__Group_5__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_5()); 
            // InternalComponentInterface.g:2556:2: ( rule__RosPublisher__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2556:3: rule__RosPublisher__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosPublisher__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosPublisherAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2564:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2568:1: ( rule__RosPublisher__Group__6__Impl )
            // InternalComponentInterface.g:2569:2: rule__RosPublisher__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:2575:1: rule__RosPublisher__Group__6__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2579:1: ( ( '}' ) )
            // InternalComponentInterface.g:2580:1: ( '}' )
            {
            // InternalComponentInterface.g:2580:1: ( '}' )
            // InternalComponentInterface.g:2581:2: '}'
            {
             before(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosPublisher__Group_3__0"
    // InternalComponentInterface.g:2591:1: rule__RosPublisher__Group_3__0 : rule__RosPublisher__Group_3__0__Impl rule__RosPublisher__Group_3__1 ;
    public final void rule__RosPublisher__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2595:1: ( rule__RosPublisher__Group_3__0__Impl rule__RosPublisher__Group_3__1 )
            // InternalComponentInterface.g:2596:2: rule__RosPublisher__Group_3__0__Impl rule__RosPublisher__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RosPublisher__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_3__0"


    // $ANTLR start "rule__RosPublisher__Group_3__0__Impl"
    // InternalComponentInterface.g:2603:1: rule__RosPublisher__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__RosPublisher__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2607:1: ( ( 'TopicName' ) )
            // InternalComponentInterface.g:2608:1: ( 'TopicName' )
            {
            // InternalComponentInterface.g:2608:1: ( 'TopicName' )
            // InternalComponentInterface.g:2609:2: 'TopicName'
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getTopicNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_3__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group_3__1"
    // InternalComponentInterface.g:2618:1: rule__RosPublisher__Group_3__1 : rule__RosPublisher__Group_3__1__Impl ;
    public final void rule__RosPublisher__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2622:1: ( rule__RosPublisher__Group_3__1__Impl )
            // InternalComponentInterface.g:2623:2: rule__RosPublisher__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_3__1"


    // $ANTLR start "rule__RosPublisher__Group_3__1__Impl"
    // InternalComponentInterface.g:2629:1: rule__RosPublisher__Group_3__1__Impl : ( ( rule__RosPublisher__TopicNameAssignment_3_1 ) ) ;
    public final void rule__RosPublisher__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2633:1: ( ( ( rule__RosPublisher__TopicNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2634:1: ( ( rule__RosPublisher__TopicNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2634:1: ( ( rule__RosPublisher__TopicNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2635:2: ( rule__RosPublisher__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameAssignment_3_1()); 
            // InternalComponentInterface.g:2636:2: ( rule__RosPublisher__TopicNameAssignment_3_1 )
            // InternalComponentInterface.g:2636:3: rule__RosPublisher__TopicNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__TopicNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getTopicNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_3__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group_4__0"
    // InternalComponentInterface.g:2645:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2649:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalComponentInterface.g:2650:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
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
    // InternalComponentInterface.g:2657:1: rule__RosPublisher__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2661:1: ( ( 'TopicRef' ) )
            // InternalComponentInterface.g:2662:1: ( 'TopicRef' )
            {
            // InternalComponentInterface.g:2662:1: ( 'TopicRef' )
            // InternalComponentInterface.g:2663:2: 'TopicRef'
            {
             before(grammarAccess.getRosPublisherAccess().getTopicRefKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getTopicRefKeyword_4_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2672:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2676:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalComponentInterface.g:2677:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalComponentInterface.g:2683:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__TopicRefAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2687:1: ( ( ( rule__RosPublisher__TopicRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2688:1: ( ( rule__RosPublisher__TopicRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2688:1: ( ( rule__RosPublisher__TopicRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2689:2: ( rule__RosPublisher__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getTopicRefAssignment_4_1()); 
            // InternalComponentInterface.g:2690:2: ( rule__RosPublisher__TopicRefAssignment_4_1 )
            // InternalComponentInterface.g:2690:3: rule__RosPublisher__TopicRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__TopicRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getTopicRefAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosPublisher__Group_5__0"
    // InternalComponentInterface.g:2699:1: rule__RosPublisher__Group_5__0 : rule__RosPublisher__Group_5__0__Impl rule__RosPublisher__Group_5__1 ;
    public final void rule__RosPublisher__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2703:1: ( rule__RosPublisher__Group_5__0__Impl rule__RosPublisher__Group_5__1 )
            // InternalComponentInterface.g:2704:2: rule__RosPublisher__Group_5__0__Impl rule__RosPublisher__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RosPublisher__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_5__0"


    // $ANTLR start "rule__RosPublisher__Group_5__0__Impl"
    // InternalComponentInterface.g:2711:1: rule__RosPublisher__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__RosPublisher__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2715:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2716:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2716:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2717:2: 'NameSpace'
            {
             before(grammarAccess.getRosPublisherAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_5__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group_5__1"
    // InternalComponentInterface.g:2726:1: rule__RosPublisher__Group_5__1 : rule__RosPublisher__Group_5__1__Impl ;
    public final void rule__RosPublisher__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2730:1: ( rule__RosPublisher__Group_5__1__Impl )
            // InternalComponentInterface.g:2731:2: rule__RosPublisher__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_5__1"


    // $ANTLR start "rule__RosPublisher__Group_5__1__Impl"
    // InternalComponentInterface.g:2737:1: rule__RosPublisher__Group_5__1__Impl : ( ( rule__RosPublisher__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__RosPublisher__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2741:1: ( ( ( rule__RosPublisher__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2742:1: ( ( rule__RosPublisher__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2742:1: ( ( rule__RosPublisher__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2743:2: ( rule__RosPublisher__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2744:2: ( rule__RosPublisher__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2744:3: rule__RosPublisher__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_5__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__0"
    // InternalComponentInterface.g:2753:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2757:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalComponentInterface.g:2758:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
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
    // InternalComponentInterface.g:2765:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2769:1: ( ( () ) )
            // InternalComponentInterface.g:2770:1: ( () )
            {
            // InternalComponentInterface.g:2770:1: ( () )
            // InternalComponentInterface.g:2771:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:2772:2: ()
            // InternalComponentInterface.g:2772:3: 
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
    // InternalComponentInterface.g:2780:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2784:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalComponentInterface.g:2785:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:2792:1: rule__RosSubscriber__Group__1__Impl : ( 'Subscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2796:1: ( ( 'Subscriber' ) )
            // InternalComponentInterface.g:2797:1: ( 'Subscriber' )
            {
            // InternalComponentInterface.g:2797:1: ( 'Subscriber' )
            // InternalComponentInterface.g:2798:2: 'Subscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getSubscriberKeyword_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2807:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2811:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalComponentInterface.g:2812:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:2819:1: rule__RosSubscriber__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2823:1: ( ( '{' ) )
            // InternalComponentInterface.g:2824:1: ( '{' )
            {
            // InternalComponentInterface.g:2824:1: ( '{' )
            // InternalComponentInterface.g:2825:2: '{'
            {
             before(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2834:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2838:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalComponentInterface.g:2839:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:2846:1: rule__RosSubscriber__Group__3__Impl : ( ( rule__RosSubscriber__Group_3__0 )? ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2850:1: ( ( ( rule__RosSubscriber__Group_3__0 )? ) )
            // InternalComponentInterface.g:2851:1: ( ( rule__RosSubscriber__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2851:1: ( ( rule__RosSubscriber__Group_3__0 )? )
            // InternalComponentInterface.g:2852:2: ( rule__RosSubscriber__Group_3__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_3()); 
            // InternalComponentInterface.g:2853:2: ( rule__RosSubscriber__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:2853:3: rule__RosSubscriber__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSubscriber__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSubscriberAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2861:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2865:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalComponentInterface.g:2866:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:2873:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2877:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2878:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2878:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2879:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2880:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2880:3: rule__RosSubscriber__Group_4__0
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
    // InternalComponentInterface.g:2888:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2892:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalComponentInterface.g:2893:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:2900:1: rule__RosSubscriber__Group__5__Impl : ( ( rule__RosSubscriber__Group_5__0 )? ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2904:1: ( ( ( rule__RosSubscriber__Group_5__0 )? ) )
            // InternalComponentInterface.g:2905:1: ( ( rule__RosSubscriber__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2905:1: ( ( rule__RosSubscriber__Group_5__0 )? )
            // InternalComponentInterface.g:2906:2: ( rule__RosSubscriber__Group_5__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_5()); 
            // InternalComponentInterface.g:2907:2: ( rule__RosSubscriber__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:2907:3: rule__RosSubscriber__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSubscriber__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSubscriberAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalComponentInterface.g:2915:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2919:1: ( rule__RosSubscriber__Group__6__Impl )
            // InternalComponentInterface.g:2920:2: rule__RosSubscriber__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:2926:1: rule__RosSubscriber__Group__6__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2930:1: ( ( '}' ) )
            // InternalComponentInterface.g:2931:1: ( '}' )
            {
            // InternalComponentInterface.g:2931:1: ( '}' )
            // InternalComponentInterface.g:2932:2: '}'
            {
             before(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosSubscriber__Group_3__0"
    // InternalComponentInterface.g:2942:1: rule__RosSubscriber__Group_3__0 : rule__RosSubscriber__Group_3__0__Impl rule__RosSubscriber__Group_3__1 ;
    public final void rule__RosSubscriber__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2946:1: ( rule__RosSubscriber__Group_3__0__Impl rule__RosSubscriber__Group_3__1 )
            // InternalComponentInterface.g:2947:2: rule__RosSubscriber__Group_3__0__Impl rule__RosSubscriber__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RosSubscriber__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_3__0"


    // $ANTLR start "rule__RosSubscriber__Group_3__0__Impl"
    // InternalComponentInterface.g:2954:1: rule__RosSubscriber__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__RosSubscriber__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2958:1: ( ( 'TopicName' ) )
            // InternalComponentInterface.g:2959:1: ( 'TopicName' )
            {
            // InternalComponentInterface.g:2959:1: ( 'TopicName' )
            // InternalComponentInterface.g:2960:2: 'TopicName'
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getTopicNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_3__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_3__1"
    // InternalComponentInterface.g:2969:1: rule__RosSubscriber__Group_3__1 : rule__RosSubscriber__Group_3__1__Impl ;
    public final void rule__RosSubscriber__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2973:1: ( rule__RosSubscriber__Group_3__1__Impl )
            // InternalComponentInterface.g:2974:2: rule__RosSubscriber__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_3__1"


    // $ANTLR start "rule__RosSubscriber__Group_3__1__Impl"
    // InternalComponentInterface.g:2980:1: rule__RosSubscriber__Group_3__1__Impl : ( ( rule__RosSubscriber__TopicNameAssignment_3_1 ) ) ;
    public final void rule__RosSubscriber__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2984:1: ( ( ( rule__RosSubscriber__TopicNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2985:1: ( ( rule__RosSubscriber__TopicNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2985:1: ( ( rule__RosSubscriber__TopicNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2986:2: ( rule__RosSubscriber__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameAssignment_3_1()); 
            // InternalComponentInterface.g:2987:2: ( rule__RosSubscriber__TopicNameAssignment_3_1 )
            // InternalComponentInterface.g:2987:3: rule__RosSubscriber__TopicNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__TopicNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getTopicNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_3__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_4__0"
    // InternalComponentInterface.g:2996:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3000:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalComponentInterface.g:3001:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
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
    // InternalComponentInterface.g:3008:1: rule__RosSubscriber__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3012:1: ( ( 'TopicRef' ) )
            // InternalComponentInterface.g:3013:1: ( 'TopicRef' )
            {
            // InternalComponentInterface.g:3013:1: ( 'TopicRef' )
            // InternalComponentInterface.g:3014:2: 'TopicRef'
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicRefKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getTopicRefKeyword_4_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3023:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3027:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:3028:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalComponentInterface.g:3034:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__TopicRefAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3038:1: ( ( ( rule__RosSubscriber__TopicRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3039:1: ( ( rule__RosSubscriber__TopicRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3039:1: ( ( rule__RosSubscriber__TopicRefAssignment_4_1 ) )
            // InternalComponentInterface.g:3040:2: ( rule__RosSubscriber__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicRefAssignment_4_1()); 
            // InternalComponentInterface.g:3041:2: ( rule__RosSubscriber__TopicRefAssignment_4_1 )
            // InternalComponentInterface.g:3041:3: rule__RosSubscriber__TopicRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__TopicRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getTopicRefAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosSubscriber__Group_5__0"
    // InternalComponentInterface.g:3050:1: rule__RosSubscriber__Group_5__0 : rule__RosSubscriber__Group_5__0__Impl rule__RosSubscriber__Group_5__1 ;
    public final void rule__RosSubscriber__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3054:1: ( rule__RosSubscriber__Group_5__0__Impl rule__RosSubscriber__Group_5__1 )
            // InternalComponentInterface.g:3055:2: rule__RosSubscriber__Group_5__0__Impl rule__RosSubscriber__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RosSubscriber__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_5__0"


    // $ANTLR start "rule__RosSubscriber__Group_5__0__Impl"
    // InternalComponentInterface.g:3062:1: rule__RosSubscriber__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__RosSubscriber__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3066:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:3067:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:3067:1: ( 'NameSpace' )
            // InternalComponentInterface.g:3068:2: 'NameSpace'
            {
             before(grammarAccess.getRosSubscriberAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_5__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_5__1"
    // InternalComponentInterface.g:3077:1: rule__RosSubscriber__Group_5__1 : rule__RosSubscriber__Group_5__1__Impl ;
    public final void rule__RosSubscriber__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3081:1: ( rule__RosSubscriber__Group_5__1__Impl )
            // InternalComponentInterface.g:3082:2: rule__RosSubscriber__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_5__1"


    // $ANTLR start "rule__RosSubscriber__Group_5__1__Impl"
    // InternalComponentInterface.g:3088:1: rule__RosSubscriber__Group_5__1__Impl : ( ( rule__RosSubscriber__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__RosSubscriber__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3092:1: ( ( ( rule__RosSubscriber__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:3093:1: ( ( rule__RosSubscriber__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:3093:1: ( ( rule__RosSubscriber__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:3094:2: ( rule__RosSubscriber__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:3095:2: ( rule__RosSubscriber__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:3095:3: rule__RosSubscriber__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_5__1__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__0"
    // InternalComponentInterface.g:3104:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3108:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalComponentInterface.g:3109:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
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
    // InternalComponentInterface.g:3116:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3120:1: ( ( () ) )
            // InternalComponentInterface.g:3121:1: ( () )
            {
            // InternalComponentInterface.g:3121:1: ( () )
            // InternalComponentInterface.g:3122:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:3123:2: ()
            // InternalComponentInterface.g:3123:3: 
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
    // InternalComponentInterface.g:3131:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3135:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalComponentInterface.g:3136:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:3143:1: rule__RosServiceServer__Group__1__Impl : ( 'ServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3147:1: ( ( 'ServiceServer' ) )
            // InternalComponentInterface.g:3148:1: ( 'ServiceServer' )
            {
            // InternalComponentInterface.g:3148:1: ( 'ServiceServer' )
            // InternalComponentInterface.g:3149:2: 'ServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getServiceServerKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getServiceServerKeyword_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3158:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3162:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalComponentInterface.g:3163:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
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
    // InternalComponentInterface.g:3170:1: rule__RosServiceServer__Group__2__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3174:1: ( ( '{' ) )
            // InternalComponentInterface.g:3175:1: ( '{' )
            {
            // InternalComponentInterface.g:3175:1: ( '{' )
            // InternalComponentInterface.g:3176:2: '{'
            {
             before(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3185:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3189:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalComponentInterface.g:3190:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3197:1: rule__RosServiceServer__Group__3__Impl : ( ( rule__RosServiceServer__Group_3__0 )? ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3201:1: ( ( ( rule__RosServiceServer__Group_3__0 )? ) )
            // InternalComponentInterface.g:3202:1: ( ( rule__RosServiceServer__Group_3__0 )? )
            {
            // InternalComponentInterface.g:3202:1: ( ( rule__RosServiceServer__Group_3__0 )? )
            // InternalComponentInterface.g:3203:2: ( rule__RosServiceServer__Group_3__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_3()); 
            // InternalComponentInterface.g:3204:2: ( rule__RosServiceServer__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:3204:3: rule__RosServiceServer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceServer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceServerAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3212:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3216:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalComponentInterface.g:3217:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3224:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3228:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:3229:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3229:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:3230:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:3231:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:3231:3: rule__RosServiceServer__Group_4__0
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
    // InternalComponentInterface.g:3239:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3243:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalComponentInterface.g:3244:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3251:1: rule__RosServiceServer__Group__5__Impl : ( ( rule__RosServiceServer__Group_5__0 )? ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3255:1: ( ( ( rule__RosServiceServer__Group_5__0 )? ) )
            // InternalComponentInterface.g:3256:1: ( ( rule__RosServiceServer__Group_5__0 )? )
            {
            // InternalComponentInterface.g:3256:1: ( ( rule__RosServiceServer__Group_5__0 )? )
            // InternalComponentInterface.g:3257:2: ( rule__RosServiceServer__Group_5__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_5()); 
            // InternalComponentInterface.g:3258:2: ( rule__RosServiceServer__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:3258:3: rule__RosServiceServer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceServer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceServerAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3266:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3270:1: ( rule__RosServiceServer__Group__6__Impl )
            // InternalComponentInterface.g:3271:2: rule__RosServiceServer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:3277:1: rule__RosServiceServer__Group__6__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3281:1: ( ( '}' ) )
            // InternalComponentInterface.g:3282:1: ( '}' )
            {
            // InternalComponentInterface.g:3282:1: ( '}' )
            // InternalComponentInterface.g:3283:2: '}'
            {
             before(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosServiceServer__Group_3__0"
    // InternalComponentInterface.g:3293:1: rule__RosServiceServer__Group_3__0 : rule__RosServiceServer__Group_3__0__Impl rule__RosServiceServer__Group_3__1 ;
    public final void rule__RosServiceServer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3297:1: ( rule__RosServiceServer__Group_3__0__Impl rule__RosServiceServer__Group_3__1 )
            // InternalComponentInterface.g:3298:2: rule__RosServiceServer__Group_3__0__Impl rule__RosServiceServer__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceServer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_3__0"


    // $ANTLR start "rule__RosServiceServer__Group_3__0__Impl"
    // InternalComponentInterface.g:3305:1: rule__RosServiceServer__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__RosServiceServer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3309:1: ( ( 'ServiceName' ) )
            // InternalComponentInterface.g:3310:1: ( 'ServiceName' )
            {
            // InternalComponentInterface.g:3310:1: ( 'ServiceName' )
            // InternalComponentInterface.g:3311:2: 'ServiceName'
            {
             before(grammarAccess.getRosServiceServerAccess().getServiceNameKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getServiceNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_3__0__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_3__1"
    // InternalComponentInterface.g:3320:1: rule__RosServiceServer__Group_3__1 : rule__RosServiceServer__Group_3__1__Impl ;
    public final void rule__RosServiceServer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3324:1: ( rule__RosServiceServer__Group_3__1__Impl )
            // InternalComponentInterface.g:3325:2: rule__RosServiceServer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_3__1"


    // $ANTLR start "rule__RosServiceServer__Group_3__1__Impl"
    // InternalComponentInterface.g:3331:1: rule__RosServiceServer__Group_3__1__Impl : ( ( rule__RosServiceServer__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__RosServiceServer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3335:1: ( ( ( rule__RosServiceServer__ServiceNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:3336:1: ( ( rule__RosServiceServer__ServiceNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:3336:1: ( ( rule__RosServiceServer__ServiceNameAssignment_3_1 ) )
            // InternalComponentInterface.g:3337:2: ( rule__RosServiceServer__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getServiceNameAssignment_3_1()); 
            // InternalComponentInterface.g:3338:2: ( rule__RosServiceServer__ServiceNameAssignment_3_1 )
            // InternalComponentInterface.g:3338:3: rule__RosServiceServer__ServiceNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__ServiceNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getServiceNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_3__1__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_4__0"
    // InternalComponentInterface.g:3347:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3351:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalComponentInterface.g:3352:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
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
    // InternalComponentInterface.g:3359:1: rule__RosServiceServer__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3363:1: ( ( 'SrvRef' ) )
            // InternalComponentInterface.g:3364:1: ( 'SrvRef' )
            {
            // InternalComponentInterface.g:3364:1: ( 'SrvRef' )
            // InternalComponentInterface.g:3365:2: 'SrvRef'
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvRefKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getSrvRefKeyword_4_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3374:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3378:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:3379:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalComponentInterface.g:3385:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__SrvRefAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3389:1: ( ( ( rule__RosServiceServer__SrvRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3390:1: ( ( rule__RosServiceServer__SrvRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3390:1: ( ( rule__RosServiceServer__SrvRefAssignment_4_1 ) )
            // InternalComponentInterface.g:3391:2: ( rule__RosServiceServer__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvRefAssignment_4_1()); 
            // InternalComponentInterface.g:3392:2: ( rule__RosServiceServer__SrvRefAssignment_4_1 )
            // InternalComponentInterface.g:3392:3: rule__RosServiceServer__SrvRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__SrvRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getSrvRefAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosServiceServer__Group_5__0"
    // InternalComponentInterface.g:3401:1: rule__RosServiceServer__Group_5__0 : rule__RosServiceServer__Group_5__0__Impl rule__RosServiceServer__Group_5__1 ;
    public final void rule__RosServiceServer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3405:1: ( rule__RosServiceServer__Group_5__0__Impl rule__RosServiceServer__Group_5__1 )
            // InternalComponentInterface.g:3406:2: rule__RosServiceServer__Group_5__0__Impl rule__RosServiceServer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceServer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_5__0"


    // $ANTLR start "rule__RosServiceServer__Group_5__0__Impl"
    // InternalComponentInterface.g:3413:1: rule__RosServiceServer__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__RosServiceServer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3417:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:3418:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:3418:1: ( 'NameSpace' )
            // InternalComponentInterface.g:3419:2: 'NameSpace'
            {
             before(grammarAccess.getRosServiceServerAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_5__0__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_5__1"
    // InternalComponentInterface.g:3428:1: rule__RosServiceServer__Group_5__1 : rule__RosServiceServer__Group_5__1__Impl ;
    public final void rule__RosServiceServer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3432:1: ( rule__RosServiceServer__Group_5__1__Impl )
            // InternalComponentInterface.g:3433:2: rule__RosServiceServer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_5__1"


    // $ANTLR start "rule__RosServiceServer__Group_5__1__Impl"
    // InternalComponentInterface.g:3439:1: rule__RosServiceServer__Group_5__1__Impl : ( ( rule__RosServiceServer__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__RosServiceServer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3443:1: ( ( ( rule__RosServiceServer__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:3444:1: ( ( rule__RosServiceServer__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:3444:1: ( ( rule__RosServiceServer__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:3445:2: ( rule__RosServiceServer__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:3446:2: ( rule__RosServiceServer__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:3446:3: rule__RosServiceServer__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_5__1__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__0"
    // InternalComponentInterface.g:3455:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3459:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalComponentInterface.g:3460:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
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
    // InternalComponentInterface.g:3467:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3471:1: ( ( () ) )
            // InternalComponentInterface.g:3472:1: ( () )
            {
            // InternalComponentInterface.g:3472:1: ( () )
            // InternalComponentInterface.g:3473:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:3474:2: ()
            // InternalComponentInterface.g:3474:3: 
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
    // InternalComponentInterface.g:3482:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3486:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalComponentInterface.g:3487:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentInterface.g:3494:1: rule__RosServiceClient__Group__1__Impl : ( 'ServiceServer' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3498:1: ( ( 'ServiceServer' ) )
            // InternalComponentInterface.g:3499:1: ( 'ServiceServer' )
            {
            // InternalComponentInterface.g:3499:1: ( 'ServiceServer' )
            // InternalComponentInterface.g:3500:2: 'ServiceServer'
            {
             before(grammarAccess.getRosServiceClientAccess().getServiceServerKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getServiceServerKeyword_1()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3509:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3513:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalComponentInterface.g:3514:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
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
    // InternalComponentInterface.g:3521:1: rule__RosServiceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3525:1: ( ( '{' ) )
            // InternalComponentInterface.g:3526:1: ( '{' )
            {
            // InternalComponentInterface.g:3526:1: ( '{' )
            // InternalComponentInterface.g:3527:2: '{'
            {
             before(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3536:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3540:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalComponentInterface.g:3541:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
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
    // InternalComponentInterface.g:3548:1: rule__RosServiceClient__Group__3__Impl : ( ( rule__RosServiceClient__Group_3__0 )? ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3552:1: ( ( ( rule__RosServiceClient__Group_3__0 )? ) )
            // InternalComponentInterface.g:3553:1: ( ( rule__RosServiceClient__Group_3__0 )? )
            {
            // InternalComponentInterface.g:3553:1: ( ( rule__RosServiceClient__Group_3__0 )? )
            // InternalComponentInterface.g:3554:2: ( rule__RosServiceClient__Group_3__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_3()); 
            // InternalComponentInterface.g:3555:2: ( rule__RosServiceClient__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:3555:3: rule__RosServiceClient__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceClient__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceClientAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3563:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3567:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalComponentInterface.g:3568:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
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
    // InternalComponentInterface.g:3575:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3579:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3580:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3580:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:3581:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3582:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:3582:3: rule__RosServiceClient__Group_4__0
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
    // InternalComponentInterface.g:3590:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3594:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalComponentInterface.g:3595:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentInterface.g:3602:1: rule__RosServiceClient__Group__5__Impl : ( ( rule__RosServiceClient__Group_5__0 )? ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3606:1: ( ( ( rule__RosServiceClient__Group_5__0 )? ) )
            // InternalComponentInterface.g:3607:1: ( ( rule__RosServiceClient__Group_5__0 )? )
            {
            // InternalComponentInterface.g:3607:1: ( ( rule__RosServiceClient__Group_5__0 )? )
            // InternalComponentInterface.g:3608:2: ( rule__RosServiceClient__Group_5__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_5()); 
            // InternalComponentInterface.g:3609:2: ( rule__RosServiceClient__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:3609:3: rule__RosServiceClient__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceClient__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceClientAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3617:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3621:1: ( rule__RosServiceClient__Group__6__Impl )
            // InternalComponentInterface.g:3622:2: rule__RosServiceClient__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:3628:1: rule__RosServiceClient__Group__6__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3632:1: ( ( '}' ) )
            // InternalComponentInterface.g:3633:1: ( '}' )
            {
            // InternalComponentInterface.g:3633:1: ( '}' )
            // InternalComponentInterface.g:3634:2: '}'
            {
             before(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosServiceClient__Group_3__0"
    // InternalComponentInterface.g:3644:1: rule__RosServiceClient__Group_3__0 : rule__RosServiceClient__Group_3__0__Impl rule__RosServiceClient__Group_3__1 ;
    public final void rule__RosServiceClient__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3648:1: ( rule__RosServiceClient__Group_3__0__Impl rule__RosServiceClient__Group_3__1 )
            // InternalComponentInterface.g:3649:2: rule__RosServiceClient__Group_3__0__Impl rule__RosServiceClient__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceClient__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_3__0"


    // $ANTLR start "rule__RosServiceClient__Group_3__0__Impl"
    // InternalComponentInterface.g:3656:1: rule__RosServiceClient__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__RosServiceClient__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3660:1: ( ( 'ServiceName' ) )
            // InternalComponentInterface.g:3661:1: ( 'ServiceName' )
            {
            // InternalComponentInterface.g:3661:1: ( 'ServiceName' )
            // InternalComponentInterface.g:3662:2: 'ServiceName'
            {
             before(grammarAccess.getRosServiceClientAccess().getServiceNameKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getServiceNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_3__0__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_3__1"
    // InternalComponentInterface.g:3671:1: rule__RosServiceClient__Group_3__1 : rule__RosServiceClient__Group_3__1__Impl ;
    public final void rule__RosServiceClient__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3675:1: ( rule__RosServiceClient__Group_3__1__Impl )
            // InternalComponentInterface.g:3676:2: rule__RosServiceClient__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_3__1"


    // $ANTLR start "rule__RosServiceClient__Group_3__1__Impl"
    // InternalComponentInterface.g:3682:1: rule__RosServiceClient__Group_3__1__Impl : ( ( rule__RosServiceClient__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__RosServiceClient__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3686:1: ( ( ( rule__RosServiceClient__ServiceNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:3687:1: ( ( rule__RosServiceClient__ServiceNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:3687:1: ( ( rule__RosServiceClient__ServiceNameAssignment_3_1 ) )
            // InternalComponentInterface.g:3688:2: ( rule__RosServiceClient__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getServiceNameAssignment_3_1()); 
            // InternalComponentInterface.g:3689:2: ( rule__RosServiceClient__ServiceNameAssignment_3_1 )
            // InternalComponentInterface.g:3689:3: rule__RosServiceClient__ServiceNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__ServiceNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getServiceNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_3__1__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_4__0"
    // InternalComponentInterface.g:3698:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3702:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalComponentInterface.g:3703:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
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
    // InternalComponentInterface.g:3710:1: rule__RosServiceClient__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3714:1: ( ( 'SrvRef' ) )
            // InternalComponentInterface.g:3715:1: ( 'SrvRef' )
            {
            // InternalComponentInterface.g:3715:1: ( 'SrvRef' )
            // InternalComponentInterface.g:3716:2: 'SrvRef'
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvRefKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getSrvRefKeyword_4_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:3725:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3729:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3730:2: rule__RosServiceClient__Group_4__1__Impl
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
    // InternalComponentInterface.g:3736:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__SrvRefAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3740:1: ( ( ( rule__RosServiceClient__SrvRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3741:1: ( ( rule__RosServiceClient__SrvRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3741:1: ( ( rule__RosServiceClient__SrvRefAssignment_4_1 ) )
            // InternalComponentInterface.g:3742:2: ( rule__RosServiceClient__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvRefAssignment_4_1()); 
            // InternalComponentInterface.g:3743:2: ( rule__RosServiceClient__SrvRefAssignment_4_1 )
            // InternalComponentInterface.g:3743:3: rule__RosServiceClient__SrvRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__SrvRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getSrvRefAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosServiceClient__Group_5__0"
    // InternalComponentInterface.g:3752:1: rule__RosServiceClient__Group_5__0 : rule__RosServiceClient__Group_5__0__Impl rule__RosServiceClient__Group_5__1 ;
    public final void rule__RosServiceClient__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3756:1: ( rule__RosServiceClient__Group_5__0__Impl rule__RosServiceClient__Group_5__1 )
            // InternalComponentInterface.g:3757:2: rule__RosServiceClient__Group_5__0__Impl rule__RosServiceClient__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceClient__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_5__0"


    // $ANTLR start "rule__RosServiceClient__Group_5__0__Impl"
    // InternalComponentInterface.g:3764:1: rule__RosServiceClient__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__RosServiceClient__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3768:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:3769:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:3769:1: ( 'NameSpace' )
            // InternalComponentInterface.g:3770:2: 'NameSpace'
            {
             before(grammarAccess.getRosServiceClientAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_5__0__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_5__1"
    // InternalComponentInterface.g:3779:1: rule__RosServiceClient__Group_5__1 : rule__RosServiceClient__Group_5__1__Impl ;
    public final void rule__RosServiceClient__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3783:1: ( rule__RosServiceClient__Group_5__1__Impl )
            // InternalComponentInterface.g:3784:2: rule__RosServiceClient__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_5__1"


    // $ANTLR start "rule__RosServiceClient__Group_5__1__Impl"
    // InternalComponentInterface.g:3790:1: rule__RosServiceClient__Group_5__1__Impl : ( ( rule__RosServiceClient__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__RosServiceClient__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3794:1: ( ( ( rule__RosServiceClient__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:3795:1: ( ( rule__RosServiceClient__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:3795:1: ( ( rule__RosServiceClient__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:3796:2: ( rule__RosServiceClient__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:3797:2: ( rule__RosServiceClient__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:3797:3: rule__RosServiceClient__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:3806:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3810:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3811:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3811:2: ( ruleEString )
            // InternalComponentInterface.g:3812:3: ruleEString
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


    // $ANTLR start "rule__ComponentInterface__NamespaceAssignment_4_1"
    // InternalComponentInterface.g:3821:1: rule__ComponentInterface__NamespaceAssignment_4_1 : ( ruleNamespace ) ;
    public final void rule__ComponentInterface__NamespaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3825:1: ( ( ruleNamespace ) )
            // InternalComponentInterface.g:3826:2: ( ruleNamespace )
            {
            // InternalComponentInterface.g:3826:2: ( ruleNamespace )
            // InternalComponentInterface.g:3827:3: ruleNamespace
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NamespaceAssignment_4_1"


    // $ANTLR start "rule__ComponentInterface__RosTopicPublisherAssignment_5_2"
    // InternalComponentInterface.g:3836:1: rule__ComponentInterface__RosTopicPublisherAssignment_5_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RosTopicPublisherAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3840:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:3841:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:3841:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:3842:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherRosPublisherParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherRosPublisherParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicPublisherAssignment_5_2"


    // $ANTLR start "rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1"
    // InternalComponentInterface.g:3851:1: rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3855:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:3856:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:3856:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:3857:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherRosPublisherParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherRosPublisherParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicPublisherAssignment_5_3_1"


    // $ANTLR start "rule__ComponentInterface__RosTopicSubscriberAssignment_6_2"
    // InternalComponentInterface.g:3866:1: rule__ComponentInterface__RosTopicSubscriberAssignment_6_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RosTopicSubscriberAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3870:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:3871:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:3871:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:3872:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberRosSubscriberParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberRosSubscriberParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicSubscriberAssignment_6_2"


    // $ANTLR start "rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1"
    // InternalComponentInterface.g:3881:1: rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3885:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:3886:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:3886:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:3887:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberRosSubscriberParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberRosSubscriberParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicSubscriberAssignment_6_3_1"


    // $ANTLR start "rule__ComponentInterface__RosServiceServerAssignment_7_2"
    // InternalComponentInterface.g:3896:1: rule__ComponentInterface__RosServiceServerAssignment_7_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosServiceServerAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3900:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:3901:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:3901:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:3902:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerRosServiceServerParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerRosServiceServerParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceServerAssignment_7_2"


    // $ANTLR start "rule__ComponentInterface__RosServiceServerAssignment_7_3_1"
    // InternalComponentInterface.g:3911:1: rule__ComponentInterface__RosServiceServerAssignment_7_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosServiceServerAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3915:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:3916:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:3916:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:3917:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerRosServiceServerParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerRosServiceServerParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceServerAssignment_7_3_1"


    // $ANTLR start "rule__ComponentInterface__RosServiceClientAssignment_8_2"
    // InternalComponentInterface.g:3926:1: rule__ComponentInterface__RosServiceClientAssignment_8_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosServiceClientAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3930:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:3931:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:3931:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:3932:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientRosServiceClientParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientRosServiceClientParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceClientAssignment_8_2"


    // $ANTLR start "rule__ComponentInterface__RosServiceClientAssignment_8_3_1"
    // InternalComponentInterface.g:3941:1: rule__ComponentInterface__RosServiceClientAssignment_8_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosServiceClientAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3945:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:3946:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:3946:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:3947:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientRosServiceClientParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientRosServiceClientParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceClientAssignment_8_3_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_2"
    // InternalComponentInterface.g:3956:1: rule__GlobalNamespace__PartsAssignment_3_2 : ( ruleEString ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3960:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3961:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3961:2: ( ruleEString )
            // InternalComponentInterface.g:3962:3: ruleEString
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
    // InternalComponentInterface.g:3971:1: rule__GlobalNamespace__PartsAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3975:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3976:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3976:2: ( ruleEString )
            // InternalComponentInterface.g:3977:3: ruleEString
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
    // InternalComponentInterface.g:3986:1: rule__RelativeNamespace_Impl__PartsAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3990:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3991:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3991:2: ( ruleEString )
            // InternalComponentInterface.g:3992:3: ruleEString
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
    // InternalComponentInterface.g:4001:1: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4005:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4006:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4006:2: ( ruleEString )
            // InternalComponentInterface.g:4007:3: ruleEString
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
    // InternalComponentInterface.g:4016:1: rule__PrivateNamespace__PartsAssignment_3_2 : ( ruleEString ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4020:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4021:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4021:2: ( ruleEString )
            // InternalComponentInterface.g:4022:3: ruleEString
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
    // InternalComponentInterface.g:4031:1: rule__PrivateNamespace__PartsAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4035:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4036:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4036:2: ( ruleEString )
            // InternalComponentInterface.g:4037:3: ruleEString
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


    // $ANTLR start "rule__RosPublisher__TopicNameAssignment_3_1"
    // InternalComponentInterface.g:4046:1: rule__RosPublisher__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4050:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4051:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4051:2: ( ruleEString )
            // InternalComponentInterface.g:4052:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__TopicNameAssignment_3_1"


    // $ANTLR start "rule__RosPublisher__TopicRefAssignment_4_1"
    // InternalComponentInterface.g:4061:1: rule__RosPublisher__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4065:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4066:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4066:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4067:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 
            // InternalComponentInterface.g:4068:3: ( ruleEString )
            // InternalComponentInterface.g:4069:4: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getTopicRefPublisherEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getTopicRefPublisherEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRosPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__TopicRefAssignment_4_1"


    // $ANTLR start "rule__RosPublisher__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:4080:1: rule__RosPublisher__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4084:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4085:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4085:2: ( ruleEString )
            // InternalComponentInterface.g:4086:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__RosSubscriber__TopicNameAssignment_3_1"
    // InternalComponentInterface.g:4095:1: rule__RosSubscriber__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4099:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4100:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4100:2: ( ruleEString )
            // InternalComponentInterface.g:4101:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__TopicNameAssignment_3_1"


    // $ANTLR start "rule__RosSubscriber__TopicRefAssignment_4_1"
    // InternalComponentInterface.g:4110:1: rule__RosSubscriber__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4114:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4115:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4115:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4116:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 
            // InternalComponentInterface.g:4117:3: ( ruleEString )
            // InternalComponentInterface.g:4118:4: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicRefSubscriberEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getTopicRefSubscriberEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRosSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__TopicRefAssignment_4_1"


    // $ANTLR start "rule__RosSubscriber__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:4129:1: rule__RosSubscriber__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4133:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4134:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4134:2: ( ruleEString )
            // InternalComponentInterface.g:4135:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__RosServiceServer__ServiceNameAssignment_3_1"
    // InternalComponentInterface.g:4144:1: rule__RosServiceServer__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4148:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4149:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4149:2: ( ruleEString )
            // InternalComponentInterface.g:4150:3: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__ServiceNameAssignment_3_1"


    // $ANTLR start "rule__RosServiceServer__SrvRefAssignment_4_1"
    // InternalComponentInterface.g:4159:1: rule__RosServiceServer__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4163:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4164:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4164:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4165:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 
            // InternalComponentInterface.g:4166:3: ( ruleEString )
            // InternalComponentInterface.g:4167:4: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvRefServiceServerEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getSrvRefServiceServerEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRosServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__SrvRefAssignment_4_1"


    // $ANTLR start "rule__RosServiceServer__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:4178:1: rule__RosServiceServer__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4182:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4183:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4183:2: ( ruleEString )
            // InternalComponentInterface.g:4184:3: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__RosServiceClient__ServiceNameAssignment_3_1"
    // InternalComponentInterface.g:4193:1: rule__RosServiceClient__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4197:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4198:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4198:2: ( ruleEString )
            // InternalComponentInterface.g:4199:3: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__ServiceNameAssignment_3_1"


    // $ANTLR start "rule__RosServiceClient__SrvRefAssignment_4_1"
    // InternalComponentInterface.g:4208:1: rule__RosServiceClient__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4212:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4213:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4213:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4214:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 
            // InternalComponentInterface.g:4215:3: ( ruleEString )
            // InternalComponentInterface.g:4216:4: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvRefServiceClientEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getSrvRefServiceClientEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRosServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__SrvRefAssignment_4_1"


    // $ANTLR start "rule__RosServiceClient__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:4227:1: rule__RosServiceClient__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4231:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4232:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4232:2: ( ruleEString )
            // InternalComponentInterface.g:4233:3: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__NameSpaceAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001DC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000190004000L});

}