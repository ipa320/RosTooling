package de.fraunhofer.ipa.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_STRING_SLASH", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GraphName'", "'ComponentInterface'", "'{'", "'name'", "'}'", "'namespace'", "'publisher'", "'subscriber'", "'serviceServer'", "'serviceClient'", "'GlobalNamespace'", "'parts'", "','", "'RelativeNamespace'", "'PrivateNamespace'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'ServiceServer'", "'ServiceName'", "'SrvRef'"
    };
    public static final int RULE_STRING_SLASH=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:78:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:79:1: ( ruleNamespace EOF )
            // InternalComponentInterface.g:80:1: ruleNamespace EOF
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
    // InternalComponentInterface.g:87:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:91:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalComponentInterface.g:92:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalComponentInterface.g:92:2: ( ( rule__Namespace__Alternatives ) )
            // InternalComponentInterface.g:93:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalComponentInterface.g:94:3: ( rule__Namespace__Alternatives )
            // InternalComponentInterface.g:94:4: rule__Namespace__Alternatives
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
    // InternalComponentInterface.g:103:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalComponentInterface.g:104:1: ( ruleGraphName EOF )
            // InternalComponentInterface.g:105:1: ruleGraphName EOF
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
    // InternalComponentInterface.g:112:1: ruleGraphName : ( ( rule__GraphName__Alternatives ) ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:116:2: ( ( ( rule__GraphName__Alternatives ) ) )
            // InternalComponentInterface.g:117:2: ( ( rule__GraphName__Alternatives ) )
            {
            // InternalComponentInterface.g:117:2: ( ( rule__GraphName__Alternatives ) )
            // InternalComponentInterface.g:118:3: ( rule__GraphName__Alternatives )
            {
             before(grammarAccess.getGraphNameAccess().getAlternatives()); 
            // InternalComponentInterface.g:119:3: ( rule__GraphName__Alternatives )
            // InternalComponentInterface.g:119:4: rule__GraphName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphNameAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:204:1: ( ruleEString EOF )
            // InternalComponentInterface.g:205:1: ruleEString EOF
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
    // InternalComponentInterface.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComponentInterface.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComponentInterface.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalComponentInterface.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComponentInterface.g:219:3: ( rule__EString__Alternatives )
            // InternalComponentInterface.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRulePublisher"
    // InternalComponentInterface.g:228:1: entryRulePublisher : rulePublisher EOF ;
    public final void entryRulePublisher() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( rulePublisher EOF )
            // InternalComponentInterface.g:230:1: rulePublisher EOF
            {
             before(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getPublisherRule()); 
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
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalComponentInterface.g:237:1: rulePublisher : ( ( rule__Publisher__Group__0 ) ) ;
    public final void rulePublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__Publisher__Group__0 ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__Publisher__Group__0 ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__Publisher__Group__0 ) )
            // InternalComponentInterface.g:243:3: ( rule__Publisher__Group__0 )
            {
             before(grammarAccess.getPublisherAccess().getGroup()); 
            // InternalComponentInterface.g:244:3: ( rule__Publisher__Group__0 )
            // InternalComponentInterface.g:244:4: rule__Publisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalComponentInterface.g:253:1: entryRuleSubscriber : ruleSubscriber EOF ;
    public final void entryRuleSubscriber() throws RecognitionException {
        try {
            // InternalComponentInterface.g:254:1: ( ruleSubscriber EOF )
            // InternalComponentInterface.g:255:1: ruleSubscriber EOF
            {
             before(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getSubscriberRule()); 
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
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalComponentInterface.g:262:1: ruleSubscriber : ( ( rule__Subscriber__Group__0 ) ) ;
    public final void ruleSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:266:2: ( ( ( rule__Subscriber__Group__0 ) ) )
            // InternalComponentInterface.g:267:2: ( ( rule__Subscriber__Group__0 ) )
            {
            // InternalComponentInterface.g:267:2: ( ( rule__Subscriber__Group__0 ) )
            // InternalComponentInterface.g:268:3: ( rule__Subscriber__Group__0 )
            {
             before(grammarAccess.getSubscriberAccess().getGroup()); 
            // InternalComponentInterface.g:269:3: ( rule__Subscriber__Group__0 )
            // InternalComponentInterface.g:269:4: rule__Subscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleServiceServer"
    // InternalComponentInterface.g:278:1: entryRuleServiceServer : ruleServiceServer EOF ;
    public final void entryRuleServiceServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:279:1: ( ruleServiceServer EOF )
            // InternalComponentInterface.g:280:1: ruleServiceServer EOF
            {
             before(grammarAccess.getServiceServerRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceServer();

            state._fsp--;

             after(grammarAccess.getServiceServerRule()); 
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
    // $ANTLR end "entryRuleServiceServer"


    // $ANTLR start "ruleServiceServer"
    // InternalComponentInterface.g:287:1: ruleServiceServer : ( ( rule__ServiceServer__Group__0 ) ) ;
    public final void ruleServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:291:2: ( ( ( rule__ServiceServer__Group__0 ) ) )
            // InternalComponentInterface.g:292:2: ( ( rule__ServiceServer__Group__0 ) )
            {
            // InternalComponentInterface.g:292:2: ( ( rule__ServiceServer__Group__0 ) )
            // InternalComponentInterface.g:293:3: ( rule__ServiceServer__Group__0 )
            {
             before(grammarAccess.getServiceServerAccess().getGroup()); 
            // InternalComponentInterface.g:294:3: ( rule__ServiceServer__Group__0 )
            // InternalComponentInterface.g:294:4: rule__ServiceServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceServer"


    // $ANTLR start "entryRuleServiceClient"
    // InternalComponentInterface.g:303:1: entryRuleServiceClient : ruleServiceClient EOF ;
    public final void entryRuleServiceClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:304:1: ( ruleServiceClient EOF )
            // InternalComponentInterface.g:305:1: ruleServiceClient EOF
            {
             before(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceClient();

            state._fsp--;

             after(grammarAccess.getServiceClientRule()); 
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
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // InternalComponentInterface.g:312:1: ruleServiceClient : ( ( rule__ServiceClient__Group__0 ) ) ;
    public final void ruleServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:316:2: ( ( ( rule__ServiceClient__Group__0 ) ) )
            // InternalComponentInterface.g:317:2: ( ( rule__ServiceClient__Group__0 ) )
            {
            // InternalComponentInterface.g:317:2: ( ( rule__ServiceClient__Group__0 ) )
            // InternalComponentInterface.g:318:3: ( rule__ServiceClient__Group__0 )
            {
             before(grammarAccess.getServiceClientAccess().getGroup()); 
            // InternalComponentInterface.g:319:3: ( rule__ServiceClient__Group__0 )
            // InternalComponentInterface.g:319:4: rule__ServiceClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceClient"


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalComponentInterface.g:327:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:331:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
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
                    // InternalComponentInterface.g:332:2: ( ruleGlobalNamespace )
                    {
                    // InternalComponentInterface.g:332:2: ( ruleGlobalNamespace )
                    // InternalComponentInterface.g:333:3: ruleGlobalNamespace
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
                    // InternalComponentInterface.g:338:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalComponentInterface.g:338:2: ( ruleRelativeNamespace_Impl )
                    // InternalComponentInterface.g:339:3: ruleRelativeNamespace_Impl
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
                    // InternalComponentInterface.g:344:2: ( rulePrivateNamespace )
                    {
                    // InternalComponentInterface.g:344:2: ( rulePrivateNamespace )
                    // InternalComponentInterface.g:345:3: rulePrivateNamespace
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


    // $ANTLR start "rule__GraphName__Alternatives"
    // InternalComponentInterface.g:354:1: rule__GraphName__Alternatives : ( ( RULE_STRING ) | ( 'GraphName' ) );
    public final void rule__GraphName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:358:1: ( ( RULE_STRING ) | ( 'GraphName' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:359:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:359:2: ( RULE_STRING )
                    // InternalComponentInterface.g:360:3: RULE_STRING
                    {
                     before(grammarAccess.getGraphNameAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getGraphNameAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:365:2: ( 'GraphName' )
                    {
                    // InternalComponentInterface.g:365:2: ( 'GraphName' )
                    // InternalComponentInterface.g:366:3: 'GraphName'
                    {
                     before(grammarAccess.getGraphNameAccess().getGraphNameKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getGraphNameAccess().getGraphNameKeyword_1()); 

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
    // $ANTLR end "rule__GraphName__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComponentInterface.g:375:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_STRING_SLASH ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:379:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_STRING_SLASH ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_STRING_SLASH:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:380:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:380:2: ( RULE_STRING )
                    // InternalComponentInterface.g:381:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:386:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:386:2: ( RULE_ID )
                    // InternalComponentInterface.g:387:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:392:2: ( RULE_STRING_SLASH )
                    {
                    // InternalComponentInterface.g:392:2: ( RULE_STRING_SLASH )
                    // InternalComponentInterface.g:393:3: RULE_STRING_SLASH
                    {
                     before(grammarAccess.getEStringAccess().getSTRING_SLASHTerminalRuleCall_2()); 
                    match(input,RULE_STRING_SLASH,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRING_SLASHTerminalRuleCall_2()); 

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
    // InternalComponentInterface.g:402:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:406:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:407:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalComponentInterface.g:414:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:418:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:419:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:419:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:420:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentInterface.g:429:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:433:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:434:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
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
    // InternalComponentInterface.g:441:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:445:1: ( ( '{' ) )
            // InternalComponentInterface.g:446:1: ( '{' )
            {
            // InternalComponentInterface.g:446:1: ( '{' )
            // InternalComponentInterface.g:447:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:456:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:460:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:461:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
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
    // InternalComponentInterface.g:468:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:472:1: ( ( 'name' ) )
            // InternalComponentInterface.g:473:1: ( 'name' )
            {
            // InternalComponentInterface.g:473:1: ( 'name' )
            // InternalComponentInterface.g:474:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentInterface.g:483:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:487:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:488:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
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
    // InternalComponentInterface.g:495:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:499:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:500:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:500:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:501:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:502:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:502:3: rule__ComponentInterface__NameAssignment_3
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
    // InternalComponentInterface.g:510:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:514:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:515:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
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
    // InternalComponentInterface.g:522:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:526:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:527:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:527:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:528:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:529:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:529:3: rule__ComponentInterface__Group_4__0
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
    // InternalComponentInterface.g:537:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:541:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:542:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
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
    // InternalComponentInterface.g:549:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:553:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:554:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:554:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:555:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:556:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:556:3: rule__ComponentInterface__Group_5__0
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
    // InternalComponentInterface.g:564:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:568:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:569:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
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
    // InternalComponentInterface.g:576:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:580:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:581:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:581:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:582:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:583:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:583:3: rule__ComponentInterface__Group_6__0
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
    // InternalComponentInterface.g:591:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:595:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:596:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
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
    // InternalComponentInterface.g:603:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:607:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:608:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:608:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:609:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:610:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:610:3: rule__ComponentInterface__Group_7__0
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
    // InternalComponentInterface.g:618:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:622:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalComponentInterface.g:623:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
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
    // InternalComponentInterface.g:630:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:634:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalComponentInterface.g:635:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalComponentInterface.g:635:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalComponentInterface.g:636:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalComponentInterface.g:637:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:637:3: rule__ComponentInterface__Group_8__0
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
    // InternalComponentInterface.g:645:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:649:1: ( rule__ComponentInterface__Group__9__Impl )
            // InternalComponentInterface.g:650:2: rule__ComponentInterface__Group__9__Impl
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
    // InternalComponentInterface.g:656:1: rule__ComponentInterface__Group__9__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:660:1: ( ( '}' ) )
            // InternalComponentInterface.g:661:1: ( '}' )
            {
            // InternalComponentInterface.g:661:1: ( '}' )
            // InternalComponentInterface.g:662:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:672:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:676:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:677:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
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
    // InternalComponentInterface.g:684:1: rule__ComponentInterface__Group_4__0__Impl : ( 'namespace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:688:1: ( ( 'namespace' ) )
            // InternalComponentInterface.g:689:1: ( 'namespace' )
            {
            // InternalComponentInterface.g:689:1: ( 'namespace' )
            // InternalComponentInterface.g:690:2: 'namespace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentInterface.g:699:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:703:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:704:2: rule__ComponentInterface__Group_4__1__Impl
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
    // InternalComponentInterface.g:710:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:714:1: ( ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:715:1: ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:715:1: ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) )
            // InternalComponentInterface.g:716:2: ( rule__ComponentInterface__NamespaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceAssignment_4_1()); 
            // InternalComponentInterface.g:717:2: ( rule__ComponentInterface__NamespaceAssignment_4_1 )
            // InternalComponentInterface.g:717:3: rule__ComponentInterface__NamespaceAssignment_4_1
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
    // InternalComponentInterface.g:726:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:730:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:731:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentInterface.g:738:1: rule__ComponentInterface__Group_5__0__Impl : ( 'publisher' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:742:1: ( ( 'publisher' ) )
            // InternalComponentInterface.g:743:1: ( 'publisher' )
            {
            // InternalComponentInterface.g:743:1: ( 'publisher' )
            // InternalComponentInterface.g:744:2: 'publisher'
            {
             before(grammarAccess.getComponentInterfaceAccess().getPublisherKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getPublisherKeyword_5_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:753:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:757:1: ( rule__ComponentInterface__Group_5__1__Impl )
            // InternalComponentInterface.g:758:2: rule__ComponentInterface__Group_5__1__Impl
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
    // InternalComponentInterface.g:764:1: rule__ComponentInterface__Group_5__1__Impl : ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:768:1: ( ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) ) )
            // InternalComponentInterface.g:769:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:769:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) )
            // InternalComponentInterface.g:770:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_1()); 
            // InternalComponentInterface.g:771:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 )
            // InternalComponentInterface.g:771:3: rule__ComponentInterface__RosTopicPublisherAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicPublisherAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_6__0"
    // InternalComponentInterface.g:780:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:784:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:785:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentInterface.g:792:1: rule__ComponentInterface__Group_6__0__Impl : ( 'subscriber' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:796:1: ( ( 'subscriber' ) )
            // InternalComponentInterface.g:797:1: ( 'subscriber' )
            {
            // InternalComponentInterface.g:797:1: ( 'subscriber' )
            // InternalComponentInterface.g:798:2: 'subscriber'
            {
             before(grammarAccess.getComponentInterfaceAccess().getSubscriberKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getSubscriberKeyword_6_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:807:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:811:1: ( rule__ComponentInterface__Group_6__1__Impl )
            // InternalComponentInterface.g:812:2: rule__ComponentInterface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:818:1: rule__ComponentInterface__Group_6__1__Impl : ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:822:1: ( ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) ) )
            // InternalComponentInterface.g:823:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) )
            {
            // InternalComponentInterface.g:823:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) )
            // InternalComponentInterface.g:824:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_1()); 
            // InternalComponentInterface.g:825:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 )
            // InternalComponentInterface.g:825:3: rule__ComponentInterface__RosTopicSubscriberAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicSubscriberAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_7__0"
    // InternalComponentInterface.g:834:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:838:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:839:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentInterface.g:846:1: rule__ComponentInterface__Group_7__0__Impl : ( 'serviceServer' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:850:1: ( ( 'serviceServer' ) )
            // InternalComponentInterface.g:851:1: ( 'serviceServer' )
            {
            // InternalComponentInterface.g:851:1: ( 'serviceServer' )
            // InternalComponentInterface.g:852:2: 'serviceServer'
            {
             before(grammarAccess.getComponentInterfaceAccess().getServiceServerKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getServiceServerKeyword_7_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:861:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:865:1: ( rule__ComponentInterface__Group_7__1__Impl )
            // InternalComponentInterface.g:866:2: rule__ComponentInterface__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:872:1: rule__ComponentInterface__Group_7__1__Impl : ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:876:1: ( ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) ) )
            // InternalComponentInterface.g:877:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) )
            {
            // InternalComponentInterface.g:877:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) )
            // InternalComponentInterface.g:878:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_1()); 
            // InternalComponentInterface.g:879:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_1 )
            // InternalComponentInterface.g:879:3: rule__ComponentInterface__RosServiceServerAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceServerAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInterface__Group_8__0"
    // InternalComponentInterface.g:888:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:892:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalComponentInterface.g:893:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentInterface.g:900:1: rule__ComponentInterface__Group_8__0__Impl : ( 'serviceClient' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:904:1: ( ( 'serviceClient' ) )
            // InternalComponentInterface.g:905:1: ( 'serviceClient' )
            {
            // InternalComponentInterface.g:905:1: ( 'serviceClient' )
            // InternalComponentInterface.g:906:2: 'serviceClient'
            {
             before(grammarAccess.getComponentInterfaceAccess().getServiceClientKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getServiceClientKeyword_8_0()); 

            }


            }

        }
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
    // InternalComponentInterface.g:915:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:919:1: ( rule__ComponentInterface__Group_8__1__Impl )
            // InternalComponentInterface.g:920:2: rule__ComponentInterface__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalComponentInterface.g:926:1: rule__ComponentInterface__Group_8__1__Impl : ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:930:1: ( ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) ) )
            // InternalComponentInterface.g:931:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) )
            {
            // InternalComponentInterface.g:931:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) )
            // InternalComponentInterface.g:932:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_1()); 
            // InternalComponentInterface.g:933:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_1 )
            // InternalComponentInterface.g:933:3: rule__ComponentInterface__RosServiceClientAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceClientAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalComponentInterface.g:942:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:946:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalComponentInterface.g:947:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentInterface.g:954:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:958:1: ( ( () ) )
            // InternalComponentInterface.g:959:1: ( () )
            {
            // InternalComponentInterface.g:959:1: ( () )
            // InternalComponentInterface.g:960:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalComponentInterface.g:961:2: ()
            // InternalComponentInterface.g:961:3: 
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
    // InternalComponentInterface.g:969:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:973:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalComponentInterface.g:974:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
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
    // InternalComponentInterface.g:981:1: rule__GlobalNamespace__Group__1__Impl : ( 'GlobalNamespace' ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:985:1: ( ( 'GlobalNamespace' ) )
            // InternalComponentInterface.g:986:1: ( 'GlobalNamespace' )
            {
            // InternalComponentInterface.g:986:1: ( 'GlobalNamespace' )
            // InternalComponentInterface.g:987:2: 'GlobalNamespace'
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
    // InternalComponentInterface.g:996:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1000:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalComponentInterface.g:1001:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1008:1: rule__GlobalNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1012:1: ( ( '{' ) )
            // InternalComponentInterface.g:1013:1: ( '{' )
            {
            // InternalComponentInterface.g:1013:1: ( '{' )
            // InternalComponentInterface.g:1014:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:1023:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1027:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalComponentInterface.g:1028:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1035:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1039:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:1040:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1040:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:1041:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:1042:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:1042:3: rule__GlobalNamespace__Group_3__0
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
    // InternalComponentInterface.g:1050:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1054:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalComponentInterface.g:1055:2: rule__GlobalNamespace__Group__4__Impl
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
    // InternalComponentInterface.g:1061:1: rule__GlobalNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1065:1: ( ( '}' ) )
            // InternalComponentInterface.g:1066:1: ( '}' )
            {
            // InternalComponentInterface.g:1066:1: ( '}' )
            // InternalComponentInterface.g:1067:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:1077:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1081:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalComponentInterface.g:1082:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
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
    // InternalComponentInterface.g:1089:1: rule__GlobalNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1093:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1094:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1094:1: ( 'parts' )
            // InternalComponentInterface.g:1095:2: 'parts'
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
    // InternalComponentInterface.g:1104:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1108:1: ( rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 )
            // InternalComponentInterface.g:1109:2: rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1116:1: rule__GlobalNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1120:1: ( ( '{' ) )
            // InternalComponentInterface.g:1121:1: ( '{' )
            {
            // InternalComponentInterface.g:1121:1: ( '{' )
            // InternalComponentInterface.g:1122:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:1131:1: rule__GlobalNamespace__Group_3__2 : rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 ;
    public final void rule__GlobalNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1135:1: ( rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 )
            // InternalComponentInterface.g:1136:2: rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1143:1: rule__GlobalNamespace__Group_3__2__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__GlobalNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1147:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:1148:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:1148:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:1149:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:1150:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            // InternalComponentInterface.g:1150:3: rule__GlobalNamespace__PartsAssignment_3_2
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
    // InternalComponentInterface.g:1158:1: rule__GlobalNamespace__Group_3__3 : rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 ;
    public final void rule__GlobalNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1162:1: ( rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 )
            // InternalComponentInterface.g:1163:2: rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1170:1: rule__GlobalNamespace__Group_3__3__Impl : ( ( rule__GlobalNamespace__Group_3_3__0 )* ) ;
    public final void rule__GlobalNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1174:1: ( ( ( rule__GlobalNamespace__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:1175:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:1175:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            // InternalComponentInterface.g:1176:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:1177:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:1177:3: rule__GlobalNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GlobalNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalComponentInterface.g:1185:1: rule__GlobalNamespace__Group_3__4 : rule__GlobalNamespace__Group_3__4__Impl ;
    public final void rule__GlobalNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1189:1: ( rule__GlobalNamespace__Group_3__4__Impl )
            // InternalComponentInterface.g:1190:2: rule__GlobalNamespace__Group_3__4__Impl
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
    // InternalComponentInterface.g:1196:1: rule__GlobalNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1200:1: ( ( '}' ) )
            // InternalComponentInterface.g:1201:1: ( '}' )
            {
            // InternalComponentInterface.g:1201:1: ( '}' )
            // InternalComponentInterface.g:1202:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:1212:1: rule__GlobalNamespace__Group_3_3__0 : rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 ;
    public final void rule__GlobalNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1216:1: ( rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 )
            // InternalComponentInterface.g:1217:2: rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1224:1: rule__GlobalNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__GlobalNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1228:1: ( ( ',' ) )
            // InternalComponentInterface.g:1229:1: ( ',' )
            {
            // InternalComponentInterface.g:1229:1: ( ',' )
            // InternalComponentInterface.g:1230:2: ','
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentInterface.g:1239:1: rule__GlobalNamespace__Group_3_3__1 : rule__GlobalNamespace__Group_3_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1243:1: ( rule__GlobalNamespace__Group_3_3__1__Impl )
            // InternalComponentInterface.g:1244:2: rule__GlobalNamespace__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:1250:1: rule__GlobalNamespace__Group_3_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1254:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:1255:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:1255:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:1256:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:1257:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:1257:3: rule__GlobalNamespace__PartsAssignment_3_3_1
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
    // InternalComponentInterface.g:1266:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1270:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalComponentInterface.g:1271:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentInterface.g:1278:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1282:1: ( ( () ) )
            // InternalComponentInterface.g:1283:1: ( () )
            {
            // InternalComponentInterface.g:1283:1: ( () )
            // InternalComponentInterface.g:1284:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalComponentInterface.g:1285:2: ()
            // InternalComponentInterface.g:1285:3: 
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
    // InternalComponentInterface.g:1293:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1297:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalComponentInterface.g:1298:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
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
    // InternalComponentInterface.g:1305:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( 'RelativeNamespace' ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1309:1: ( ( 'RelativeNamespace' ) )
            // InternalComponentInterface.g:1310:1: ( 'RelativeNamespace' )
            {
            // InternalComponentInterface.g:1310:1: ( 'RelativeNamespace' )
            // InternalComponentInterface.g:1311:2: 'RelativeNamespace'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentInterface.g:1320:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1324:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalComponentInterface.g:1325:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1332:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1336:1: ( ( '{' ) )
            // InternalComponentInterface.g:1337:1: ( '{' )
            {
            // InternalComponentInterface.g:1337:1: ( '{' )
            // InternalComponentInterface.g:1338:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:1347:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1351:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalComponentInterface.g:1352:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1359:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1363:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalComponentInterface.g:1364:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1364:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalComponentInterface.g:1365:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalComponentInterface.g:1366:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:1366:3: rule__RelativeNamespace_Impl__Group_3__0
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
    // InternalComponentInterface.g:1374:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1378:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalComponentInterface.g:1379:2: rule__RelativeNamespace_Impl__Group__4__Impl
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
    // InternalComponentInterface.g:1385:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1389:1: ( ( '}' ) )
            // InternalComponentInterface.g:1390:1: ( '}' )
            {
            // InternalComponentInterface.g:1390:1: ( '}' )
            // InternalComponentInterface.g:1391:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:1401:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1405:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalComponentInterface.g:1406:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
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
    // InternalComponentInterface.g:1413:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1417:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1418:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1418:1: ( 'parts' )
            // InternalComponentInterface.g:1419:2: 'parts'
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
    // InternalComponentInterface.g:1428:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1432:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 )
            // InternalComponentInterface.g:1433:2: rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1440:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1444:1: ( ( '{' ) )
            // InternalComponentInterface.g:1445:1: ( '{' )
            {
            // InternalComponentInterface.g:1445:1: ( '{' )
            // InternalComponentInterface.g:1446:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:1455:1: rule__RelativeNamespace_Impl__Group_3__2 : rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 ;
    public final void rule__RelativeNamespace_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1459:1: ( rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 )
            // InternalComponentInterface.g:1460:2: rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1467:1: rule__RelativeNamespace_Impl__Group_3__2__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1471:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:1472:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:1472:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:1473:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:1474:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            // InternalComponentInterface.g:1474:3: rule__RelativeNamespace_Impl__PartsAssignment_3_2
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
    // InternalComponentInterface.g:1482:1: rule__RelativeNamespace_Impl__Group_3__3 : rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 ;
    public final void rule__RelativeNamespace_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1486:1: ( rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 )
            // InternalComponentInterface.g:1487:2: rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1494:1: rule__RelativeNamespace_Impl__Group_3__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1498:1: ( ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:1499:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:1499:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            // InternalComponentInterface.g:1500:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:1501:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentInterface.g:1501:3: rule__RelativeNamespace_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RelativeNamespace_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalComponentInterface.g:1509:1: rule__RelativeNamespace_Impl__Group_3__4 : rule__RelativeNamespace_Impl__Group_3__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1513:1: ( rule__RelativeNamespace_Impl__Group_3__4__Impl )
            // InternalComponentInterface.g:1514:2: rule__RelativeNamespace_Impl__Group_3__4__Impl
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
    // InternalComponentInterface.g:1520:1: rule__RelativeNamespace_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1524:1: ( ( '}' ) )
            // InternalComponentInterface.g:1525:1: ( '}' )
            {
            // InternalComponentInterface.g:1525:1: ( '}' )
            // InternalComponentInterface.g:1526:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:1536:1: rule__RelativeNamespace_Impl__Group_3_3__0 : rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1540:1: ( rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 )
            // InternalComponentInterface.g:1541:2: rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1548:1: rule__RelativeNamespace_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1552:1: ( ( ',' ) )
            // InternalComponentInterface.g:1553:1: ( ',' )
            {
            // InternalComponentInterface.g:1553:1: ( ',' )
            // InternalComponentInterface.g:1554:2: ','
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentInterface.g:1563:1: rule__RelativeNamespace_Impl__Group_3_3__1 : rule__RelativeNamespace_Impl__Group_3_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1567:1: ( rule__RelativeNamespace_Impl__Group_3_3__1__Impl )
            // InternalComponentInterface.g:1568:2: rule__RelativeNamespace_Impl__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:1574:1: rule__RelativeNamespace_Impl__Group_3_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1578:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:1579:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:1579:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:1580:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:1581:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:1581:3: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1
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
    // InternalComponentInterface.g:1590:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1594:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalComponentInterface.g:1595:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
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
    // InternalComponentInterface.g:1602:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1606:1: ( ( () ) )
            // InternalComponentInterface.g:1607:1: ( () )
            {
            // InternalComponentInterface.g:1607:1: ( () )
            // InternalComponentInterface.g:1608:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalComponentInterface.g:1609:2: ()
            // InternalComponentInterface.g:1609:3: 
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
    // InternalComponentInterface.g:1617:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1621:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalComponentInterface.g:1622:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
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
    // InternalComponentInterface.g:1629:1: rule__PrivateNamespace__Group__1__Impl : ( 'PrivateNamespace' ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1633:1: ( ( 'PrivateNamespace' ) )
            // InternalComponentInterface.g:1634:1: ( 'PrivateNamespace' )
            {
            // InternalComponentInterface.g:1634:1: ( 'PrivateNamespace' )
            // InternalComponentInterface.g:1635:2: 'PrivateNamespace'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalComponentInterface.g:1644:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1648:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalComponentInterface.g:1649:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1656:1: rule__PrivateNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1660:1: ( ( '{' ) )
            // InternalComponentInterface.g:1661:1: ( '{' )
            {
            // InternalComponentInterface.g:1661:1: ( '{' )
            // InternalComponentInterface.g:1662:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:1671:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1675:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalComponentInterface.g:1676:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentInterface.g:1683:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1687:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:1688:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1688:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:1689:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:1690:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:1690:3: rule__PrivateNamespace__Group_3__0
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
    // InternalComponentInterface.g:1698:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1702:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalComponentInterface.g:1703:2: rule__PrivateNamespace__Group__4__Impl
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
    // InternalComponentInterface.g:1709:1: rule__PrivateNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1713:1: ( ( '}' ) )
            // InternalComponentInterface.g:1714:1: ( '}' )
            {
            // InternalComponentInterface.g:1714:1: ( '}' )
            // InternalComponentInterface.g:1715:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:1725:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1729:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalComponentInterface.g:1730:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
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
    // InternalComponentInterface.g:1737:1: rule__PrivateNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1741:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1742:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1742:1: ( 'parts' )
            // InternalComponentInterface.g:1743:2: 'parts'
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
    // InternalComponentInterface.g:1752:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1756:1: ( rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 )
            // InternalComponentInterface.g:1757:2: rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1764:1: rule__PrivateNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1768:1: ( ( '{' ) )
            // InternalComponentInterface.g:1769:1: ( '{' )
            {
            // InternalComponentInterface.g:1769:1: ( '{' )
            // InternalComponentInterface.g:1770:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentInterface.g:1779:1: rule__PrivateNamespace__Group_3__2 : rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 ;
    public final void rule__PrivateNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1783:1: ( rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 )
            // InternalComponentInterface.g:1784:2: rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1791:1: rule__PrivateNamespace__Group_3__2__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__PrivateNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1795:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) )
            // InternalComponentInterface.g:1796:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            {
            // InternalComponentInterface.g:1796:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            // InternalComponentInterface.g:1797:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalComponentInterface.g:1798:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            // InternalComponentInterface.g:1798:3: rule__PrivateNamespace__PartsAssignment_3_2
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
    // InternalComponentInterface.g:1806:1: rule__PrivateNamespace__Group_3__3 : rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 ;
    public final void rule__PrivateNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1810:1: ( rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 )
            // InternalComponentInterface.g:1811:2: rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentInterface.g:1818:1: rule__PrivateNamespace__Group_3__3__Impl : ( ( rule__PrivateNamespace__Group_3_3__0 )* ) ;
    public final void rule__PrivateNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1822:1: ( ( ( rule__PrivateNamespace__Group_3_3__0 )* ) )
            // InternalComponentInterface.g:1823:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            {
            // InternalComponentInterface.g:1823:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            // InternalComponentInterface.g:1824:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 
            // InternalComponentInterface.g:1825:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentInterface.g:1825:3: rule__PrivateNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PrivateNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalComponentInterface.g:1833:1: rule__PrivateNamespace__Group_3__4 : rule__PrivateNamespace__Group_3__4__Impl ;
    public final void rule__PrivateNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1837:1: ( rule__PrivateNamespace__Group_3__4__Impl )
            // InternalComponentInterface.g:1838:2: rule__PrivateNamespace__Group_3__4__Impl
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
    // InternalComponentInterface.g:1844:1: rule__PrivateNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1848:1: ( ( '}' ) )
            // InternalComponentInterface.g:1849:1: ( '}' )
            {
            // InternalComponentInterface.g:1849:1: ( '}' )
            // InternalComponentInterface.g:1850:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentInterface.g:1860:1: rule__PrivateNamespace__Group_3_3__0 : rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 ;
    public final void rule__PrivateNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1864:1: ( rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 )
            // InternalComponentInterface.g:1865:2: rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentInterface.g:1872:1: rule__PrivateNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__PrivateNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1876:1: ( ( ',' ) )
            // InternalComponentInterface.g:1877:1: ( ',' )
            {
            // InternalComponentInterface.g:1877:1: ( ',' )
            // InternalComponentInterface.g:1878:2: ','
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentInterface.g:1887:1: rule__PrivateNamespace__Group_3_3__1 : rule__PrivateNamespace__Group_3_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1891:1: ( rule__PrivateNamespace__Group_3_3__1__Impl )
            // InternalComponentInterface.g:1892:2: rule__PrivateNamespace__Group_3_3__1__Impl
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
    // InternalComponentInterface.g:1898:1: rule__PrivateNamespace__Group_3_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1902:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalComponentInterface.g:1903:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalComponentInterface.g:1903:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            // InternalComponentInterface.g:1904:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalComponentInterface.g:1905:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            // InternalComponentInterface.g:1905:3: rule__PrivateNamespace__PartsAssignment_3_3_1
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


    // $ANTLR start "rule__Publisher__Group__0"
    // InternalComponentInterface.g:1914:1: rule__Publisher__Group__0 : rule__Publisher__Group__0__Impl rule__Publisher__Group__1 ;
    public final void rule__Publisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1918:1: ( rule__Publisher__Group__0__Impl rule__Publisher__Group__1 )
            // InternalComponentInterface.g:1919:2: rule__Publisher__Group__0__Impl rule__Publisher__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Publisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0"


    // $ANTLR start "rule__Publisher__Group__0__Impl"
    // InternalComponentInterface.g:1926:1: rule__Publisher__Group__0__Impl : ( () ) ;
    public final void rule__Publisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1930:1: ( ( () ) )
            // InternalComponentInterface.g:1931:1: ( () )
            {
            // InternalComponentInterface.g:1931:1: ( () )
            // InternalComponentInterface.g:1932:2: ()
            {
             before(grammarAccess.getPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:1933:2: ()
            // InternalComponentInterface.g:1933:3: 
            {
            }

             after(grammarAccess.getPublisherAccess().getRosPublisherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0__Impl"


    // $ANTLR start "rule__Publisher__Group__1"
    // InternalComponentInterface.g:1941:1: rule__Publisher__Group__1 : rule__Publisher__Group__1__Impl rule__Publisher__Group__2 ;
    public final void rule__Publisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1945:1: ( rule__Publisher__Group__1__Impl rule__Publisher__Group__2 )
            // InternalComponentInterface.g:1946:2: rule__Publisher__Group__1__Impl rule__Publisher__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Publisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1"


    // $ANTLR start "rule__Publisher__Group__1__Impl"
    // InternalComponentInterface.g:1953:1: rule__Publisher__Group__1__Impl : ( 'Publisher' ) ;
    public final void rule__Publisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1957:1: ( ( 'Publisher' ) )
            // InternalComponentInterface.g:1958:1: ( 'Publisher' )
            {
            // InternalComponentInterface.g:1958:1: ( 'Publisher' )
            // InternalComponentInterface.g:1959:2: 'Publisher'
            {
             before(grammarAccess.getPublisherAccess().getPublisherKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getPublisherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1__Impl"


    // $ANTLR start "rule__Publisher__Group__2"
    // InternalComponentInterface.g:1968:1: rule__Publisher__Group__2 : rule__Publisher__Group__2__Impl rule__Publisher__Group__3 ;
    public final void rule__Publisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1972:1: ( rule__Publisher__Group__2__Impl rule__Publisher__Group__3 )
            // InternalComponentInterface.g:1973:2: rule__Publisher__Group__2__Impl rule__Publisher__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2"


    // $ANTLR start "rule__Publisher__Group__2__Impl"
    // InternalComponentInterface.g:1980:1: rule__Publisher__Group__2__Impl : ( '{' ) ;
    public final void rule__Publisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1984:1: ( ( '{' ) )
            // InternalComponentInterface.g:1985:1: ( '{' )
            {
            // InternalComponentInterface.g:1985:1: ( '{' )
            // InternalComponentInterface.g:1986:2: '{'
            {
             before(grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2__Impl"


    // $ANTLR start "rule__Publisher__Group__3"
    // InternalComponentInterface.g:1995:1: rule__Publisher__Group__3 : rule__Publisher__Group__3__Impl rule__Publisher__Group__4 ;
    public final void rule__Publisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1999:1: ( rule__Publisher__Group__3__Impl rule__Publisher__Group__4 )
            // InternalComponentInterface.g:2000:2: rule__Publisher__Group__3__Impl rule__Publisher__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3"


    // $ANTLR start "rule__Publisher__Group__3__Impl"
    // InternalComponentInterface.g:2007:1: rule__Publisher__Group__3__Impl : ( ( rule__Publisher__Group_3__0 )? ) ;
    public final void rule__Publisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2011:1: ( ( ( rule__Publisher__Group_3__0 )? ) )
            // InternalComponentInterface.g:2012:1: ( ( rule__Publisher__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2012:1: ( ( rule__Publisher__Group_3__0 )? )
            // InternalComponentInterface.g:2013:2: ( rule__Publisher__Group_3__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_3()); 
            // InternalComponentInterface.g:2014:2: ( rule__Publisher__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:2014:3: rule__Publisher__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Publisher__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublisherAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3__Impl"


    // $ANTLR start "rule__Publisher__Group__4"
    // InternalComponentInterface.g:2022:1: rule__Publisher__Group__4 : rule__Publisher__Group__4__Impl rule__Publisher__Group__5 ;
    public final void rule__Publisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2026:1: ( rule__Publisher__Group__4__Impl rule__Publisher__Group__5 )
            // InternalComponentInterface.g:2027:2: rule__Publisher__Group__4__Impl rule__Publisher__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4"


    // $ANTLR start "rule__Publisher__Group__4__Impl"
    // InternalComponentInterface.g:2034:1: rule__Publisher__Group__4__Impl : ( ( rule__Publisher__Group_4__0 )? ) ;
    public final void rule__Publisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2038:1: ( ( ( rule__Publisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:2039:1: ( ( rule__Publisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2039:1: ( ( rule__Publisher__Group_4__0 )? )
            // InternalComponentInterface.g:2040:2: ( rule__Publisher__Group_4__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:2041:2: ( rule__Publisher__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:2041:3: rule__Publisher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Publisher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublisherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4__Impl"


    // $ANTLR start "rule__Publisher__Group__5"
    // InternalComponentInterface.g:2049:1: rule__Publisher__Group__5 : rule__Publisher__Group__5__Impl rule__Publisher__Group__6 ;
    public final void rule__Publisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2053:1: ( rule__Publisher__Group__5__Impl rule__Publisher__Group__6 )
            // InternalComponentInterface.g:2054:2: rule__Publisher__Group__5__Impl rule__Publisher__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5"


    // $ANTLR start "rule__Publisher__Group__5__Impl"
    // InternalComponentInterface.g:2061:1: rule__Publisher__Group__5__Impl : ( ( rule__Publisher__Group_5__0 )? ) ;
    public final void rule__Publisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2065:1: ( ( ( rule__Publisher__Group_5__0 )? ) )
            // InternalComponentInterface.g:2066:1: ( ( rule__Publisher__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2066:1: ( ( rule__Publisher__Group_5__0 )? )
            // InternalComponentInterface.g:2067:2: ( rule__Publisher__Group_5__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_5()); 
            // InternalComponentInterface.g:2068:2: ( rule__Publisher__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:2068:3: rule__Publisher__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Publisher__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublisherAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5__Impl"


    // $ANTLR start "rule__Publisher__Group__6"
    // InternalComponentInterface.g:2076:1: rule__Publisher__Group__6 : rule__Publisher__Group__6__Impl ;
    public final void rule__Publisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2080:1: ( rule__Publisher__Group__6__Impl )
            // InternalComponentInterface.g:2081:2: rule__Publisher__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6"


    // $ANTLR start "rule__Publisher__Group__6__Impl"
    // InternalComponentInterface.g:2087:1: rule__Publisher__Group__6__Impl : ( '}' ) ;
    public final void rule__Publisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2091:1: ( ( '}' ) )
            // InternalComponentInterface.g:2092:1: ( '}' )
            {
            // InternalComponentInterface.g:2092:1: ( '}' )
            // InternalComponentInterface.g:2093:2: '}'
            {
             before(grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6__Impl"


    // $ANTLR start "rule__Publisher__Group_3__0"
    // InternalComponentInterface.g:2103:1: rule__Publisher__Group_3__0 : rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1 ;
    public final void rule__Publisher__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2107:1: ( rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1 )
            // InternalComponentInterface.g:2108:2: rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__0"


    // $ANTLR start "rule__Publisher__Group_3__0__Impl"
    // InternalComponentInterface.g:2115:1: rule__Publisher__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__Publisher__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2119:1: ( ( 'TopicName' ) )
            // InternalComponentInterface.g:2120:1: ( 'TopicName' )
            {
            // InternalComponentInterface.g:2120:1: ( 'TopicName' )
            // InternalComponentInterface.g:2121:2: 'TopicName'
            {
             before(grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__0__Impl"


    // $ANTLR start "rule__Publisher__Group_3__1"
    // InternalComponentInterface.g:2130:1: rule__Publisher__Group_3__1 : rule__Publisher__Group_3__1__Impl ;
    public final void rule__Publisher__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2134:1: ( rule__Publisher__Group_3__1__Impl )
            // InternalComponentInterface.g:2135:2: rule__Publisher__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__1"


    // $ANTLR start "rule__Publisher__Group_3__1__Impl"
    // InternalComponentInterface.g:2141:1: rule__Publisher__Group_3__1__Impl : ( ( rule__Publisher__TopicNameAssignment_3_1 ) ) ;
    public final void rule__Publisher__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2145:1: ( ( ( rule__Publisher__TopicNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2146:1: ( ( rule__Publisher__TopicNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2146:1: ( ( rule__Publisher__TopicNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2147:2: ( rule__Publisher__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getPublisherAccess().getTopicNameAssignment_3_1()); 
            // InternalComponentInterface.g:2148:2: ( rule__Publisher__TopicNameAssignment_3_1 )
            // InternalComponentInterface.g:2148:3: rule__Publisher__TopicNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__TopicNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getTopicNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__1__Impl"


    // $ANTLR start "rule__Publisher__Group_4__0"
    // InternalComponentInterface.g:2157:1: rule__Publisher__Group_4__0 : rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1 ;
    public final void rule__Publisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2161:1: ( rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1 )
            // InternalComponentInterface.g:2162:2: rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__0"


    // $ANTLR start "rule__Publisher__Group_4__0__Impl"
    // InternalComponentInterface.g:2169:1: rule__Publisher__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__Publisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2173:1: ( ( 'TopicRef' ) )
            // InternalComponentInterface.g:2174:1: ( 'TopicRef' )
            {
            // InternalComponentInterface.g:2174:1: ( 'TopicRef' )
            // InternalComponentInterface.g:2175:2: 'TopicRef'
            {
             before(grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__0__Impl"


    // $ANTLR start "rule__Publisher__Group_4__1"
    // InternalComponentInterface.g:2184:1: rule__Publisher__Group_4__1 : rule__Publisher__Group_4__1__Impl ;
    public final void rule__Publisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2188:1: ( rule__Publisher__Group_4__1__Impl )
            // InternalComponentInterface.g:2189:2: rule__Publisher__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__1"


    // $ANTLR start "rule__Publisher__Group_4__1__Impl"
    // InternalComponentInterface.g:2195:1: rule__Publisher__Group_4__1__Impl : ( ( rule__Publisher__TopicRefAssignment_4_1 ) ) ;
    public final void rule__Publisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2199:1: ( ( ( rule__Publisher__TopicRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2200:1: ( ( rule__Publisher__TopicRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2200:1: ( ( rule__Publisher__TopicRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2201:2: ( rule__Publisher__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getPublisherAccess().getTopicRefAssignment_4_1()); 
            // InternalComponentInterface.g:2202:2: ( rule__Publisher__TopicRefAssignment_4_1 )
            // InternalComponentInterface.g:2202:3: rule__Publisher__TopicRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__TopicRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getTopicRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__1__Impl"


    // $ANTLR start "rule__Publisher__Group_5__0"
    // InternalComponentInterface.g:2211:1: rule__Publisher__Group_5__0 : rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1 ;
    public final void rule__Publisher__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2215:1: ( rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1 )
            // InternalComponentInterface.g:2216:2: rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__0"


    // $ANTLR start "rule__Publisher__Group_5__0__Impl"
    // InternalComponentInterface.g:2223:1: rule__Publisher__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__Publisher__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2227:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2228:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2228:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2229:2: 'NameSpace'
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__0__Impl"


    // $ANTLR start "rule__Publisher__Group_5__1"
    // InternalComponentInterface.g:2238:1: rule__Publisher__Group_5__1 : rule__Publisher__Group_5__1__Impl ;
    public final void rule__Publisher__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2242:1: ( rule__Publisher__Group_5__1__Impl )
            // InternalComponentInterface.g:2243:2: rule__Publisher__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__1"


    // $ANTLR start "rule__Publisher__Group_5__1__Impl"
    // InternalComponentInterface.g:2249:1: rule__Publisher__Group_5__1__Impl : ( ( rule__Publisher__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__Publisher__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2253:1: ( ( ( rule__Publisher__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2254:1: ( ( rule__Publisher__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2254:1: ( ( rule__Publisher__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2255:2: ( rule__Publisher__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2256:2: ( rule__Publisher__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2256:3: rule__Publisher__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__0"
    // InternalComponentInterface.g:2265:1: rule__Subscriber__Group__0 : rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 ;
    public final void rule__Subscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2269:1: ( rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 )
            // InternalComponentInterface.g:2270:2: rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Subscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0"


    // $ANTLR start "rule__Subscriber__Group__0__Impl"
    // InternalComponentInterface.g:2277:1: rule__Subscriber__Group__0__Impl : ( () ) ;
    public final void rule__Subscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2281:1: ( ( () ) )
            // InternalComponentInterface.g:2282:1: ( () )
            {
            // InternalComponentInterface.g:2282:1: ( () )
            // InternalComponentInterface.g:2283:2: ()
            {
             before(grammarAccess.getSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:2284:2: ()
            // InternalComponentInterface.g:2284:3: 
            {
            }

             after(grammarAccess.getSubscriberAccess().getRosSubscriberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0__Impl"


    // $ANTLR start "rule__Subscriber__Group__1"
    // InternalComponentInterface.g:2292:1: rule__Subscriber__Group__1 : rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 ;
    public final void rule__Subscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2296:1: ( rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 )
            // InternalComponentInterface.g:2297:2: rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Subscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1"


    // $ANTLR start "rule__Subscriber__Group__1__Impl"
    // InternalComponentInterface.g:2304:1: rule__Subscriber__Group__1__Impl : ( 'Subscriber' ) ;
    public final void rule__Subscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2308:1: ( ( 'Subscriber' ) )
            // InternalComponentInterface.g:2309:1: ( 'Subscriber' )
            {
            // InternalComponentInterface.g:2309:1: ( 'Subscriber' )
            // InternalComponentInterface.g:2310:2: 'Subscriber'
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getSubscriberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__2"
    // InternalComponentInterface.g:2319:1: rule__Subscriber__Group__2 : rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 ;
    public final void rule__Subscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2323:1: ( rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 )
            // InternalComponentInterface.g:2324:2: rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2"


    // $ANTLR start "rule__Subscriber__Group__2__Impl"
    // InternalComponentInterface.g:2331:1: rule__Subscriber__Group__2__Impl : ( '{' ) ;
    public final void rule__Subscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2335:1: ( ( '{' ) )
            // InternalComponentInterface.g:2336:1: ( '{' )
            {
            // InternalComponentInterface.g:2336:1: ( '{' )
            // InternalComponentInterface.g:2337:2: '{'
            {
             before(grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2__Impl"


    // $ANTLR start "rule__Subscriber__Group__3"
    // InternalComponentInterface.g:2346:1: rule__Subscriber__Group__3 : rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 ;
    public final void rule__Subscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2350:1: ( rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 )
            // InternalComponentInterface.g:2351:2: rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3"


    // $ANTLR start "rule__Subscriber__Group__3__Impl"
    // InternalComponentInterface.g:2358:1: rule__Subscriber__Group__3__Impl : ( ( rule__Subscriber__Group_3__0 )? ) ;
    public final void rule__Subscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2362:1: ( ( ( rule__Subscriber__Group_3__0 )? ) )
            // InternalComponentInterface.g:2363:1: ( ( rule__Subscriber__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2363:1: ( ( rule__Subscriber__Group_3__0 )? )
            // InternalComponentInterface.g:2364:2: ( rule__Subscriber__Group_3__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_3()); 
            // InternalComponentInterface.g:2365:2: ( rule__Subscriber__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2365:3: rule__Subscriber__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subscriber__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubscriberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3__Impl"


    // $ANTLR start "rule__Subscriber__Group__4"
    // InternalComponentInterface.g:2373:1: rule__Subscriber__Group__4 : rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 ;
    public final void rule__Subscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2377:1: ( rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 )
            // InternalComponentInterface.g:2378:2: rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4"


    // $ANTLR start "rule__Subscriber__Group__4__Impl"
    // InternalComponentInterface.g:2385:1: rule__Subscriber__Group__4__Impl : ( ( rule__Subscriber__Group_4__0 )? ) ;
    public final void rule__Subscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2389:1: ( ( ( rule__Subscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2390:1: ( ( rule__Subscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2390:1: ( ( rule__Subscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2391:2: ( rule__Subscriber__Group_4__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2392:2: ( rule__Subscriber__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2392:3: rule__Subscriber__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subscriber__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubscriberAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4__Impl"


    // $ANTLR start "rule__Subscriber__Group__5"
    // InternalComponentInterface.g:2400:1: rule__Subscriber__Group__5 : rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 ;
    public final void rule__Subscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2404:1: ( rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 )
            // InternalComponentInterface.g:2405:2: rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5"


    // $ANTLR start "rule__Subscriber__Group__5__Impl"
    // InternalComponentInterface.g:2412:1: rule__Subscriber__Group__5__Impl : ( ( rule__Subscriber__Group_5__0 )? ) ;
    public final void rule__Subscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2416:1: ( ( ( rule__Subscriber__Group_5__0 )? ) )
            // InternalComponentInterface.g:2417:1: ( ( rule__Subscriber__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2417:1: ( ( rule__Subscriber__Group_5__0 )? )
            // InternalComponentInterface.g:2418:2: ( rule__Subscriber__Group_5__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_5()); 
            // InternalComponentInterface.g:2419:2: ( rule__Subscriber__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2419:3: rule__Subscriber__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subscriber__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubscriberAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5__Impl"


    // $ANTLR start "rule__Subscriber__Group__6"
    // InternalComponentInterface.g:2427:1: rule__Subscriber__Group__6 : rule__Subscriber__Group__6__Impl ;
    public final void rule__Subscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2431:1: ( rule__Subscriber__Group__6__Impl )
            // InternalComponentInterface.g:2432:2: rule__Subscriber__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6"


    // $ANTLR start "rule__Subscriber__Group__6__Impl"
    // InternalComponentInterface.g:2438:1: rule__Subscriber__Group__6__Impl : ( '}' ) ;
    public final void rule__Subscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2442:1: ( ( '}' ) )
            // InternalComponentInterface.g:2443:1: ( '}' )
            {
            // InternalComponentInterface.g:2443:1: ( '}' )
            // InternalComponentInterface.g:2444:2: '}'
            {
             before(grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6__Impl"


    // $ANTLR start "rule__Subscriber__Group_3__0"
    // InternalComponentInterface.g:2454:1: rule__Subscriber__Group_3__0 : rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1 ;
    public final void rule__Subscriber__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2458:1: ( rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1 )
            // InternalComponentInterface.g:2459:2: rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__0"


    // $ANTLR start "rule__Subscriber__Group_3__0__Impl"
    // InternalComponentInterface.g:2466:1: rule__Subscriber__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__Subscriber__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2470:1: ( ( 'TopicName' ) )
            // InternalComponentInterface.g:2471:1: ( 'TopicName' )
            {
            // InternalComponentInterface.g:2471:1: ( 'TopicName' )
            // InternalComponentInterface.g:2472:2: 'TopicName'
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__0__Impl"


    // $ANTLR start "rule__Subscriber__Group_3__1"
    // InternalComponentInterface.g:2481:1: rule__Subscriber__Group_3__1 : rule__Subscriber__Group_3__1__Impl ;
    public final void rule__Subscriber__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2485:1: ( rule__Subscriber__Group_3__1__Impl )
            // InternalComponentInterface.g:2486:2: rule__Subscriber__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__1"


    // $ANTLR start "rule__Subscriber__Group_3__1__Impl"
    // InternalComponentInterface.g:2492:1: rule__Subscriber__Group_3__1__Impl : ( ( rule__Subscriber__TopicNameAssignment_3_1 ) ) ;
    public final void rule__Subscriber__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2496:1: ( ( ( rule__Subscriber__TopicNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2497:1: ( ( rule__Subscriber__TopicNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2497:1: ( ( rule__Subscriber__TopicNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2498:2: ( rule__Subscriber__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameAssignment_3_1()); 
            // InternalComponentInterface.g:2499:2: ( rule__Subscriber__TopicNameAssignment_3_1 )
            // InternalComponentInterface.g:2499:3: rule__Subscriber__TopicNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__TopicNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getTopicNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__1__Impl"


    // $ANTLR start "rule__Subscriber__Group_4__0"
    // InternalComponentInterface.g:2508:1: rule__Subscriber__Group_4__0 : rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1 ;
    public final void rule__Subscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2512:1: ( rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1 )
            // InternalComponentInterface.g:2513:2: rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__0"


    // $ANTLR start "rule__Subscriber__Group_4__0__Impl"
    // InternalComponentInterface.g:2520:1: rule__Subscriber__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__Subscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2524:1: ( ( 'TopicRef' ) )
            // InternalComponentInterface.g:2525:1: ( 'TopicRef' )
            {
            // InternalComponentInterface.g:2525:1: ( 'TopicRef' )
            // InternalComponentInterface.g:2526:2: 'TopicRef'
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__0__Impl"


    // $ANTLR start "rule__Subscriber__Group_4__1"
    // InternalComponentInterface.g:2535:1: rule__Subscriber__Group_4__1 : rule__Subscriber__Group_4__1__Impl ;
    public final void rule__Subscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2539:1: ( rule__Subscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:2540:2: rule__Subscriber__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__1"


    // $ANTLR start "rule__Subscriber__Group_4__1__Impl"
    // InternalComponentInterface.g:2546:1: rule__Subscriber__Group_4__1__Impl : ( ( rule__Subscriber__TopicRefAssignment_4_1 ) ) ;
    public final void rule__Subscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2550:1: ( ( ( rule__Subscriber__TopicRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2551:1: ( ( rule__Subscriber__TopicRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2551:1: ( ( rule__Subscriber__TopicRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2552:2: ( rule__Subscriber__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefAssignment_4_1()); 
            // InternalComponentInterface.g:2553:2: ( rule__Subscriber__TopicRefAssignment_4_1 )
            // InternalComponentInterface.g:2553:3: rule__Subscriber__TopicRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__TopicRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getTopicRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__1__Impl"


    // $ANTLR start "rule__Subscriber__Group_5__0"
    // InternalComponentInterface.g:2562:1: rule__Subscriber__Group_5__0 : rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1 ;
    public final void rule__Subscriber__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2566:1: ( rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1 )
            // InternalComponentInterface.g:2567:2: rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__0"


    // $ANTLR start "rule__Subscriber__Group_5__0__Impl"
    // InternalComponentInterface.g:2574:1: rule__Subscriber__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__Subscriber__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2578:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2579:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2579:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2580:2: 'NameSpace'
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__0__Impl"


    // $ANTLR start "rule__Subscriber__Group_5__1"
    // InternalComponentInterface.g:2589:1: rule__Subscriber__Group_5__1 : rule__Subscriber__Group_5__1__Impl ;
    public final void rule__Subscriber__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2593:1: ( rule__Subscriber__Group_5__1__Impl )
            // InternalComponentInterface.g:2594:2: rule__Subscriber__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__1"


    // $ANTLR start "rule__Subscriber__Group_5__1__Impl"
    // InternalComponentInterface.g:2600:1: rule__Subscriber__Group_5__1__Impl : ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__Subscriber__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2604:1: ( ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2605:1: ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2605:1: ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2606:2: ( rule__Subscriber__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2607:2: ( rule__Subscriber__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2607:3: rule__Subscriber__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group__0"
    // InternalComponentInterface.g:2616:1: rule__ServiceServer__Group__0 : rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1 ;
    public final void rule__ServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2620:1: ( rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1 )
            // InternalComponentInterface.g:2621:2: rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ServiceServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__0"


    // $ANTLR start "rule__ServiceServer__Group__0__Impl"
    // InternalComponentInterface.g:2628:1: rule__ServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__ServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2632:1: ( ( () ) )
            // InternalComponentInterface.g:2633:1: ( () )
            {
            // InternalComponentInterface.g:2633:1: ( () )
            // InternalComponentInterface.g:2634:2: ()
            {
             before(grammarAccess.getServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:2635:2: ()
            // InternalComponentInterface.g:2635:3: 
            {
            }

             after(grammarAccess.getServiceServerAccess().getRosServiceServerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group__1"
    // InternalComponentInterface.g:2643:1: rule__ServiceServer__Group__1 : rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2 ;
    public final void rule__ServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2647:1: ( rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2 )
            // InternalComponentInterface.g:2648:2: rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__1"


    // $ANTLR start "rule__ServiceServer__Group__1__Impl"
    // InternalComponentInterface.g:2655:1: rule__ServiceServer__Group__1__Impl : ( 'ServiceServer' ) ;
    public final void rule__ServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2659:1: ( ( 'ServiceServer' ) )
            // InternalComponentInterface.g:2660:1: ( 'ServiceServer' )
            {
            // InternalComponentInterface.g:2660:1: ( 'ServiceServer' )
            // InternalComponentInterface.g:2661:2: 'ServiceServer'
            {
             before(grammarAccess.getServiceServerAccess().getServiceServerKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getServiceServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group__2"
    // InternalComponentInterface.g:2670:1: rule__ServiceServer__Group__2 : rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3 ;
    public final void rule__ServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2674:1: ( rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3 )
            // InternalComponentInterface.g:2675:2: rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ServiceServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__2"


    // $ANTLR start "rule__ServiceServer__Group__2__Impl"
    // InternalComponentInterface.g:2682:1: rule__ServiceServer__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2686:1: ( ( '{' ) )
            // InternalComponentInterface.g:2687:1: ( '{' )
            {
            // InternalComponentInterface.g:2687:1: ( '{' )
            // InternalComponentInterface.g:2688:2: '{'
            {
             before(grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__2__Impl"


    // $ANTLR start "rule__ServiceServer__Group__3"
    // InternalComponentInterface.g:2697:1: rule__ServiceServer__Group__3 : rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4 ;
    public final void rule__ServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2701:1: ( rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4 )
            // InternalComponentInterface.g:2702:2: rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ServiceServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__3"


    // $ANTLR start "rule__ServiceServer__Group__3__Impl"
    // InternalComponentInterface.g:2709:1: rule__ServiceServer__Group__3__Impl : ( ( rule__ServiceServer__Group_3__0 )? ) ;
    public final void rule__ServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2713:1: ( ( ( rule__ServiceServer__Group_3__0 )? ) )
            // InternalComponentInterface.g:2714:1: ( ( rule__ServiceServer__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2714:1: ( ( rule__ServiceServer__Group_3__0 )? )
            // InternalComponentInterface.g:2715:2: ( rule__ServiceServer__Group_3__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_3()); 
            // InternalComponentInterface.g:2716:2: ( rule__ServiceServer__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:2716:3: rule__ServiceServer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceServer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceServerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__3__Impl"


    // $ANTLR start "rule__ServiceServer__Group__4"
    // InternalComponentInterface.g:2724:1: rule__ServiceServer__Group__4 : rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5 ;
    public final void rule__ServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2728:1: ( rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5 )
            // InternalComponentInterface.g:2729:2: rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ServiceServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__4"


    // $ANTLR start "rule__ServiceServer__Group__4__Impl"
    // InternalComponentInterface.g:2736:1: rule__ServiceServer__Group__4__Impl : ( ( rule__ServiceServer__Group_4__0 )? ) ;
    public final void rule__ServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2740:1: ( ( ( rule__ServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2741:1: ( ( rule__ServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2741:1: ( ( rule__ServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2742:2: ( rule__ServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2743:2: ( rule__ServiceServer__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2743:3: rule__ServiceServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__4__Impl"


    // $ANTLR start "rule__ServiceServer__Group__5"
    // InternalComponentInterface.g:2751:1: rule__ServiceServer__Group__5 : rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6 ;
    public final void rule__ServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2755:1: ( rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6 )
            // InternalComponentInterface.g:2756:2: rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ServiceServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__5"


    // $ANTLR start "rule__ServiceServer__Group__5__Impl"
    // InternalComponentInterface.g:2763:1: rule__ServiceServer__Group__5__Impl : ( ( rule__ServiceServer__Group_5__0 )? ) ;
    public final void rule__ServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2767:1: ( ( ( rule__ServiceServer__Group_5__0 )? ) )
            // InternalComponentInterface.g:2768:1: ( ( rule__ServiceServer__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2768:1: ( ( rule__ServiceServer__Group_5__0 )? )
            // InternalComponentInterface.g:2769:2: ( rule__ServiceServer__Group_5__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_5()); 
            // InternalComponentInterface.g:2770:2: ( rule__ServiceServer__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:2770:3: rule__ServiceServer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceServer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceServerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__5__Impl"


    // $ANTLR start "rule__ServiceServer__Group__6"
    // InternalComponentInterface.g:2778:1: rule__ServiceServer__Group__6 : rule__ServiceServer__Group__6__Impl ;
    public final void rule__ServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2782:1: ( rule__ServiceServer__Group__6__Impl )
            // InternalComponentInterface.g:2783:2: rule__ServiceServer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__6"


    // $ANTLR start "rule__ServiceServer__Group__6__Impl"
    // InternalComponentInterface.g:2789:1: rule__ServiceServer__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2793:1: ( ( '}' ) )
            // InternalComponentInterface.g:2794:1: ( '}' )
            {
            // InternalComponentInterface.g:2794:1: ( '}' )
            // InternalComponentInterface.g:2795:2: '}'
            {
             before(grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__6__Impl"


    // $ANTLR start "rule__ServiceServer__Group_3__0"
    // InternalComponentInterface.g:2805:1: rule__ServiceServer__Group_3__0 : rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1 ;
    public final void rule__ServiceServer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2809:1: ( rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1 )
            // InternalComponentInterface.g:2810:2: rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceServer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__0"


    // $ANTLR start "rule__ServiceServer__Group_3__0__Impl"
    // InternalComponentInterface.g:2817:1: rule__ServiceServer__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__ServiceServer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2821:1: ( ( 'ServiceName' ) )
            // InternalComponentInterface.g:2822:1: ( 'ServiceName' )
            {
            // InternalComponentInterface.g:2822:1: ( 'ServiceName' )
            // InternalComponentInterface.g:2823:2: 'ServiceName'
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group_3__1"
    // InternalComponentInterface.g:2832:1: rule__ServiceServer__Group_3__1 : rule__ServiceServer__Group_3__1__Impl ;
    public final void rule__ServiceServer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2836:1: ( rule__ServiceServer__Group_3__1__Impl )
            // InternalComponentInterface.g:2837:2: rule__ServiceServer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__1"


    // $ANTLR start "rule__ServiceServer__Group_3__1__Impl"
    // InternalComponentInterface.g:2843:1: rule__ServiceServer__Group_3__1__Impl : ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__ServiceServer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2847:1: ( ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2848:1: ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2848:1: ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2849:2: ( rule__ServiceServer__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameAssignment_3_1()); 
            // InternalComponentInterface.g:2850:2: ( rule__ServiceServer__ServiceNameAssignment_3_1 )
            // InternalComponentInterface.g:2850:3: rule__ServiceServer__ServiceNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__ServiceNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getServiceNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group_4__0"
    // InternalComponentInterface.g:2859:1: rule__ServiceServer__Group_4__0 : rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1 ;
    public final void rule__ServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2863:1: ( rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1 )
            // InternalComponentInterface.g:2864:2: rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__0"


    // $ANTLR start "rule__ServiceServer__Group_4__0__Impl"
    // InternalComponentInterface.g:2871:1: rule__ServiceServer__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__ServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2875:1: ( ( 'SrvRef' ) )
            // InternalComponentInterface.g:2876:1: ( 'SrvRef' )
            {
            // InternalComponentInterface.g:2876:1: ( 'SrvRef' )
            // InternalComponentInterface.g:2877:2: 'SrvRef'
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group_4__1"
    // InternalComponentInterface.g:2886:1: rule__ServiceServer__Group_4__1 : rule__ServiceServer__Group_4__1__Impl ;
    public final void rule__ServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2890:1: ( rule__ServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:2891:2: rule__ServiceServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__1"


    // $ANTLR start "rule__ServiceServer__Group_4__1__Impl"
    // InternalComponentInterface.g:2897:1: rule__ServiceServer__Group_4__1__Impl : ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) ) ;
    public final void rule__ServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2901:1: ( ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2902:1: ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2902:1: ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2903:2: ( rule__ServiceServer__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefAssignment_4_1()); 
            // InternalComponentInterface.g:2904:2: ( rule__ServiceServer__SrvRefAssignment_4_1 )
            // InternalComponentInterface.g:2904:3: rule__ServiceServer__SrvRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__SrvRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getSrvRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group_5__0"
    // InternalComponentInterface.g:2913:1: rule__ServiceServer__Group_5__0 : rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1 ;
    public final void rule__ServiceServer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2917:1: ( rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1 )
            // InternalComponentInterface.g:2918:2: rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceServer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__0"


    // $ANTLR start "rule__ServiceServer__Group_5__0__Impl"
    // InternalComponentInterface.g:2925:1: rule__ServiceServer__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ServiceServer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2929:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2930:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2930:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2931:2: 'NameSpace'
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group_5__1"
    // InternalComponentInterface.g:2940:1: rule__ServiceServer__Group_5__1 : rule__ServiceServer__Group_5__1__Impl ;
    public final void rule__ServiceServer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2944:1: ( rule__ServiceServer__Group_5__1__Impl )
            // InternalComponentInterface.g:2945:2: rule__ServiceServer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__1"


    // $ANTLR start "rule__ServiceServer__Group_5__1__Impl"
    // InternalComponentInterface.g:2951:1: rule__ServiceServer__Group_5__1__Impl : ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__ServiceServer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2955:1: ( ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2956:1: ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2956:1: ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2957:2: ( rule__ServiceServer__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2958:2: ( rule__ServiceServer__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2958:3: rule__ServiceServer__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group__0"
    // InternalComponentInterface.g:2967:1: rule__ServiceClient__Group__0 : rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 ;
    public final void rule__ServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2971:1: ( rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 )
            // InternalComponentInterface.g:2972:2: rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ServiceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__0"


    // $ANTLR start "rule__ServiceClient__Group__0__Impl"
    // InternalComponentInterface.g:2979:1: rule__ServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__ServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2983:1: ( ( () ) )
            // InternalComponentInterface.g:2984:1: ( () )
            {
            // InternalComponentInterface.g:2984:1: ( () )
            // InternalComponentInterface.g:2985:2: ()
            {
             before(grammarAccess.getServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:2986:2: ()
            // InternalComponentInterface.g:2986:3: 
            {
            }

             after(grammarAccess.getServiceClientAccess().getRosServiceClientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group__1"
    // InternalComponentInterface.g:2994:1: rule__ServiceClient__Group__1 : rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 ;
    public final void rule__ServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2998:1: ( rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 )
            // InternalComponentInterface.g:2999:2: rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__1"


    // $ANTLR start "rule__ServiceClient__Group__1__Impl"
    // InternalComponentInterface.g:3006:1: rule__ServiceClient__Group__1__Impl : ( 'ServiceServer' ) ;
    public final void rule__ServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3010:1: ( ( 'ServiceServer' ) )
            // InternalComponentInterface.g:3011:1: ( 'ServiceServer' )
            {
            // InternalComponentInterface.g:3011:1: ( 'ServiceServer' )
            // InternalComponentInterface.g:3012:2: 'ServiceServer'
            {
             before(grammarAccess.getServiceClientAccess().getServiceServerKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getServiceServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group__2"
    // InternalComponentInterface.g:3021:1: rule__ServiceClient__Group__2 : rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 ;
    public final void rule__ServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3025:1: ( rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 )
            // InternalComponentInterface.g:3026:2: rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ServiceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__2"


    // $ANTLR start "rule__ServiceClient__Group__2__Impl"
    // InternalComponentInterface.g:3033:1: rule__ServiceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3037:1: ( ( '{' ) )
            // InternalComponentInterface.g:3038:1: ( '{' )
            {
            // InternalComponentInterface.g:3038:1: ( '{' )
            // InternalComponentInterface.g:3039:2: '{'
            {
             before(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__2__Impl"


    // $ANTLR start "rule__ServiceClient__Group__3"
    // InternalComponentInterface.g:3048:1: rule__ServiceClient__Group__3 : rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 ;
    public final void rule__ServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3052:1: ( rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 )
            // InternalComponentInterface.g:3053:2: rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ServiceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__3"


    // $ANTLR start "rule__ServiceClient__Group__3__Impl"
    // InternalComponentInterface.g:3060:1: rule__ServiceClient__Group__3__Impl : ( ( rule__ServiceClient__Group_3__0 )? ) ;
    public final void rule__ServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3064:1: ( ( ( rule__ServiceClient__Group_3__0 )? ) )
            // InternalComponentInterface.g:3065:1: ( ( rule__ServiceClient__Group_3__0 )? )
            {
            // InternalComponentInterface.g:3065:1: ( ( rule__ServiceClient__Group_3__0 )? )
            // InternalComponentInterface.g:3066:2: ( rule__ServiceClient__Group_3__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_3()); 
            // InternalComponentInterface.g:3067:2: ( rule__ServiceClient__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:3067:3: rule__ServiceClient__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceClient__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceClientAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__3__Impl"


    // $ANTLR start "rule__ServiceClient__Group__4"
    // InternalComponentInterface.g:3075:1: rule__ServiceClient__Group__4 : rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 ;
    public final void rule__ServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3079:1: ( rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 )
            // InternalComponentInterface.g:3080:2: rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ServiceClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__4"


    // $ANTLR start "rule__ServiceClient__Group__4__Impl"
    // InternalComponentInterface.g:3087:1: rule__ServiceClient__Group__4__Impl : ( ( rule__ServiceClient__Group_4__0 )? ) ;
    public final void rule__ServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3091:1: ( ( ( rule__ServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3092:1: ( ( rule__ServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3092:1: ( ( rule__ServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:3093:2: ( rule__ServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3094:2: ( rule__ServiceClient__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:3094:3: rule__ServiceClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__4__Impl"


    // $ANTLR start "rule__ServiceClient__Group__5"
    // InternalComponentInterface.g:3102:1: rule__ServiceClient__Group__5 : rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 ;
    public final void rule__ServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3106:1: ( rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 )
            // InternalComponentInterface.g:3107:2: rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ServiceClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__5"


    // $ANTLR start "rule__ServiceClient__Group__5__Impl"
    // InternalComponentInterface.g:3114:1: rule__ServiceClient__Group__5__Impl : ( ( rule__ServiceClient__Group_5__0 )? ) ;
    public final void rule__ServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3118:1: ( ( ( rule__ServiceClient__Group_5__0 )? ) )
            // InternalComponentInterface.g:3119:1: ( ( rule__ServiceClient__Group_5__0 )? )
            {
            // InternalComponentInterface.g:3119:1: ( ( rule__ServiceClient__Group_5__0 )? )
            // InternalComponentInterface.g:3120:2: ( rule__ServiceClient__Group_5__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_5()); 
            // InternalComponentInterface.g:3121:2: ( rule__ServiceClient__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:3121:3: rule__ServiceClient__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceClient__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceClientAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__5__Impl"


    // $ANTLR start "rule__ServiceClient__Group__6"
    // InternalComponentInterface.g:3129:1: rule__ServiceClient__Group__6 : rule__ServiceClient__Group__6__Impl ;
    public final void rule__ServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3133:1: ( rule__ServiceClient__Group__6__Impl )
            // InternalComponentInterface.g:3134:2: rule__ServiceClient__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__6"


    // $ANTLR start "rule__ServiceClient__Group__6__Impl"
    // InternalComponentInterface.g:3140:1: rule__ServiceClient__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3144:1: ( ( '}' ) )
            // InternalComponentInterface.g:3145:1: ( '}' )
            {
            // InternalComponentInterface.g:3145:1: ( '}' )
            // InternalComponentInterface.g:3146:2: '}'
            {
             before(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__6__Impl"


    // $ANTLR start "rule__ServiceClient__Group_3__0"
    // InternalComponentInterface.g:3156:1: rule__ServiceClient__Group_3__0 : rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1 ;
    public final void rule__ServiceClient__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3160:1: ( rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1 )
            // InternalComponentInterface.g:3161:2: rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceClient__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__0"


    // $ANTLR start "rule__ServiceClient__Group_3__0__Impl"
    // InternalComponentInterface.g:3168:1: rule__ServiceClient__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__ServiceClient__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3172:1: ( ( 'ServiceName' ) )
            // InternalComponentInterface.g:3173:1: ( 'ServiceName' )
            {
            // InternalComponentInterface.g:3173:1: ( 'ServiceName' )
            // InternalComponentInterface.g:3174:2: 'ServiceName'
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group_3__1"
    // InternalComponentInterface.g:3183:1: rule__ServiceClient__Group_3__1 : rule__ServiceClient__Group_3__1__Impl ;
    public final void rule__ServiceClient__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3187:1: ( rule__ServiceClient__Group_3__1__Impl )
            // InternalComponentInterface.g:3188:2: rule__ServiceClient__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__1"


    // $ANTLR start "rule__ServiceClient__Group_3__1__Impl"
    // InternalComponentInterface.g:3194:1: rule__ServiceClient__Group_3__1__Impl : ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__ServiceClient__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3198:1: ( ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:3199:1: ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:3199:1: ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) )
            // InternalComponentInterface.g:3200:2: ( rule__ServiceClient__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameAssignment_3_1()); 
            // InternalComponentInterface.g:3201:2: ( rule__ServiceClient__ServiceNameAssignment_3_1 )
            // InternalComponentInterface.g:3201:3: rule__ServiceClient__ServiceNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__ServiceNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getServiceNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group_4__0"
    // InternalComponentInterface.g:3210:1: rule__ServiceClient__Group_4__0 : rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1 ;
    public final void rule__ServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3214:1: ( rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1 )
            // InternalComponentInterface.g:3215:2: rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__0"


    // $ANTLR start "rule__ServiceClient__Group_4__0__Impl"
    // InternalComponentInterface.g:3222:1: rule__ServiceClient__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__ServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3226:1: ( ( 'SrvRef' ) )
            // InternalComponentInterface.g:3227:1: ( 'SrvRef' )
            {
            // InternalComponentInterface.g:3227:1: ( 'SrvRef' )
            // InternalComponentInterface.g:3228:2: 'SrvRef'
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group_4__1"
    // InternalComponentInterface.g:3237:1: rule__ServiceClient__Group_4__1 : rule__ServiceClient__Group_4__1__Impl ;
    public final void rule__ServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3241:1: ( rule__ServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3242:2: rule__ServiceClient__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__1"


    // $ANTLR start "rule__ServiceClient__Group_4__1__Impl"
    // InternalComponentInterface.g:3248:1: rule__ServiceClient__Group_4__1__Impl : ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) ) ;
    public final void rule__ServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3252:1: ( ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3253:1: ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3253:1: ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) )
            // InternalComponentInterface.g:3254:2: ( rule__ServiceClient__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefAssignment_4_1()); 
            // InternalComponentInterface.g:3255:2: ( rule__ServiceClient__SrvRefAssignment_4_1 )
            // InternalComponentInterface.g:3255:3: rule__ServiceClient__SrvRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__SrvRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getSrvRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group_5__0"
    // InternalComponentInterface.g:3264:1: rule__ServiceClient__Group_5__0 : rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1 ;
    public final void rule__ServiceClient__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3268:1: ( rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1 )
            // InternalComponentInterface.g:3269:2: rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceClient__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__0"


    // $ANTLR start "rule__ServiceClient__Group_5__0__Impl"
    // InternalComponentInterface.g:3276:1: rule__ServiceClient__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ServiceClient__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3280:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:3281:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:3281:1: ( 'NameSpace' )
            // InternalComponentInterface.g:3282:2: 'NameSpace'
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group_5__1"
    // InternalComponentInterface.g:3291:1: rule__ServiceClient__Group_5__1 : rule__ServiceClient__Group_5__1__Impl ;
    public final void rule__ServiceClient__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3295:1: ( rule__ServiceClient__Group_5__1__Impl )
            // InternalComponentInterface.g:3296:2: rule__ServiceClient__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__1"


    // $ANTLR start "rule__ServiceClient__Group_5__1__Impl"
    // InternalComponentInterface.g:3302:1: rule__ServiceClient__Group_5__1__Impl : ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__ServiceClient__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3306:1: ( ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:3307:1: ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:3307:1: ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:3308:2: ( rule__ServiceClient__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:3309:2: ( rule__ServiceClient__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:3309:3: rule__ServiceClient__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:3318:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3322:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3323:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3323:2: ( ruleEString )
            // InternalComponentInterface.g:3324:3: ruleEString
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
    // InternalComponentInterface.g:3333:1: rule__ComponentInterface__NamespaceAssignment_4_1 : ( ruleNamespace ) ;
    public final void rule__ComponentInterface__NamespaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3337:1: ( ( ruleNamespace ) )
            // InternalComponentInterface.g:3338:2: ( ruleNamespace )
            {
            // InternalComponentInterface.g:3338:2: ( ruleNamespace )
            // InternalComponentInterface.g:3339:3: ruleNamespace
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


    // $ANTLR start "rule__ComponentInterface__RosTopicPublisherAssignment_5_1"
    // InternalComponentInterface.g:3348:1: rule__ComponentInterface__RosTopicPublisherAssignment_5_1 : ( rulePublisher ) ;
    public final void rule__ComponentInterface__RosTopicPublisherAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3352:1: ( ( rulePublisher ) )
            // InternalComponentInterface.g:3353:2: ( rulePublisher )
            {
            // InternalComponentInterface.g:3353:2: ( rulePublisher )
            // InternalComponentInterface.g:3354:3: rulePublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherPublisherParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherPublisherParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicPublisherAssignment_5_1"


    // $ANTLR start "rule__ComponentInterface__RosTopicSubscriberAssignment_6_1"
    // InternalComponentInterface.g:3363:1: rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 : ( ruleSubscriber ) ;
    public final void rule__ComponentInterface__RosTopicSubscriberAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3367:1: ( ( ruleSubscriber ) )
            // InternalComponentInterface.g:3368:2: ( ruleSubscriber )
            {
            // InternalComponentInterface.g:3368:2: ( ruleSubscriber )
            // InternalComponentInterface.g:3369:3: ruleSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberSubscriberParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberSubscriberParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicSubscriberAssignment_6_1"


    // $ANTLR start "rule__ComponentInterface__RosServiceServerAssignment_7_1"
    // InternalComponentInterface.g:3378:1: rule__ComponentInterface__RosServiceServerAssignment_7_1 : ( ruleServiceServer ) ;
    public final void rule__ComponentInterface__RosServiceServerAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3382:1: ( ( ruleServiceServer ) )
            // InternalComponentInterface.g:3383:2: ( ruleServiceServer )
            {
            // InternalComponentInterface.g:3383:2: ( ruleServiceServer )
            // InternalComponentInterface.g:3384:3: ruleServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerServiceServerParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerServiceServerParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceServerAssignment_7_1"


    // $ANTLR start "rule__ComponentInterface__RosServiceClientAssignment_8_1"
    // InternalComponentInterface.g:3393:1: rule__ComponentInterface__RosServiceClientAssignment_8_1 : ( ruleServiceClient ) ;
    public final void rule__ComponentInterface__RosServiceClientAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3397:1: ( ( ruleServiceClient ) )
            // InternalComponentInterface.g:3398:2: ( ruleServiceClient )
            {
            // InternalComponentInterface.g:3398:2: ( ruleServiceClient )
            // InternalComponentInterface.g:3399:3: ruleServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientServiceClientParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientServiceClientParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceClientAssignment_8_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_2"
    // InternalComponentInterface.g:3408:1: rule__GlobalNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3412:1: ( ( ruleGraphName ) )
            // InternalComponentInterface.g:3413:2: ( ruleGraphName )
            {
            // InternalComponentInterface.g:3413:2: ( ruleGraphName )
            // InternalComponentInterface.g:3414:3: ruleGraphName
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
    // InternalComponentInterface.g:3423:1: rule__GlobalNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3427:1: ( ( ruleGraphName ) )
            // InternalComponentInterface.g:3428:2: ( ruleGraphName )
            {
            // InternalComponentInterface.g:3428:2: ( ruleGraphName )
            // InternalComponentInterface.g:3429:3: ruleGraphName
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
    // InternalComponentInterface.g:3438:1: rule__RelativeNamespace_Impl__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3442:1: ( ( ruleGraphName ) )
            // InternalComponentInterface.g:3443:2: ( ruleGraphName )
            {
            // InternalComponentInterface.g:3443:2: ( ruleGraphName )
            // InternalComponentInterface.g:3444:3: ruleGraphName
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
    // InternalComponentInterface.g:3453:1: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3457:1: ( ( ruleGraphName ) )
            // InternalComponentInterface.g:3458:2: ( ruleGraphName )
            {
            // InternalComponentInterface.g:3458:2: ( ruleGraphName )
            // InternalComponentInterface.g:3459:3: ruleGraphName
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
    // InternalComponentInterface.g:3468:1: rule__PrivateNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3472:1: ( ( ruleGraphName ) )
            // InternalComponentInterface.g:3473:2: ( ruleGraphName )
            {
            // InternalComponentInterface.g:3473:2: ( ruleGraphName )
            // InternalComponentInterface.g:3474:3: ruleGraphName
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
    // InternalComponentInterface.g:3483:1: rule__PrivateNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3487:1: ( ( ruleGraphName ) )
            // InternalComponentInterface.g:3488:2: ( ruleGraphName )
            {
            // InternalComponentInterface.g:3488:2: ( ruleGraphName )
            // InternalComponentInterface.g:3489:3: ruleGraphName
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


    // $ANTLR start "rule__Publisher__TopicNameAssignment_3_1"
    // InternalComponentInterface.g:3498:1: rule__Publisher__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Publisher__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3502:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3503:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3503:2: ( ruleEString )
            // InternalComponentInterface.g:3504:3: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__TopicNameAssignment_3_1"


    // $ANTLR start "rule__Publisher__TopicRefAssignment_4_1"
    // InternalComponentInterface.g:3513:1: rule__Publisher__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3517:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3518:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3518:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3519:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3520:3: ( ruleEString )
            // InternalComponentInterface.g:3521:4: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getTopicRefPublisherEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getTopicRefPublisherEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__TopicRefAssignment_4_1"


    // $ANTLR start "rule__Publisher__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3532:1: rule__Publisher__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Publisher__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3536:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3537:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3537:2: ( ruleEString )
            // InternalComponentInterface.g:3538:3: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__Subscriber__TopicNameAssignment_3_1"
    // InternalComponentInterface.g:3547:1: rule__Subscriber__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subscriber__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3551:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3552:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3552:2: ( ruleEString )
            // InternalComponentInterface.g:3553:3: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__TopicNameAssignment_3_1"


    // $ANTLR start "rule__Subscriber__TopicRefAssignment_4_1"
    // InternalComponentInterface.g:3562:1: rule__Subscriber__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3566:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3567:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3567:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3568:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3569:3: ( ruleEString )
            // InternalComponentInterface.g:3570:4: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefSubscriberEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getTopicRefSubscriberEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__TopicRefAssignment_4_1"


    // $ANTLR start "rule__Subscriber__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3581:1: rule__Subscriber__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Subscriber__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3585:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3586:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3586:2: ( ruleEString )
            // InternalComponentInterface.g:3587:3: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__ServiceServer__ServiceNameAssignment_3_1"
    // InternalComponentInterface.g:3596:1: rule__ServiceServer__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServiceServer__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3600:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3601:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3601:2: ( ruleEString )
            // InternalComponentInterface.g:3602:3: ruleEString
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__ServiceNameAssignment_3_1"


    // $ANTLR start "rule__ServiceServer__SrvRefAssignment_4_1"
    // InternalComponentInterface.g:3611:1: rule__ServiceServer__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceServer__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3615:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3616:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3616:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3617:3: ( ruleEString )
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3618:3: ( ruleEString )
            // InternalComponentInterface.g:3619:4: ruleEString
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefServiceServerEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceServerAccess().getSrvRefServiceServerEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__SrvRefAssignment_4_1"


    // $ANTLR start "rule__ServiceServer__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3630:1: rule__ServiceServer__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServiceServer__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3634:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3635:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3635:2: ( ruleEString )
            // InternalComponentInterface.g:3636:3: ruleEString
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceServerAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__ServiceClient__ServiceNameAssignment_3_1"
    // InternalComponentInterface.g:3645:1: rule__ServiceClient__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServiceClient__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3649:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3650:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3650:2: ( ruleEString )
            // InternalComponentInterface.g:3651:3: ruleEString
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__ServiceNameAssignment_3_1"


    // $ANTLR start "rule__ServiceClient__SrvRefAssignment_4_1"
    // InternalComponentInterface.g:3660:1: rule__ServiceClient__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceClient__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3664:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3665:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3665:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3666:3: ( ruleEString )
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3667:3: ( ruleEString )
            // InternalComponentInterface.g:3668:4: ruleEString
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefServiceClientEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceClientAccess().getSrvRefServiceClientEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__SrvRefAssignment_4_1"


    // $ANTLR start "rule__ServiceClient__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3679:1: rule__ServiceClient__NameSpaceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServiceClient__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3683:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3684:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3684:2: ( ruleEString )
            // InternalComponentInterface.g:3685:3: ruleEString
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceClientAccess().getNameSpaceEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__NameSpaceAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000640010000L});

}