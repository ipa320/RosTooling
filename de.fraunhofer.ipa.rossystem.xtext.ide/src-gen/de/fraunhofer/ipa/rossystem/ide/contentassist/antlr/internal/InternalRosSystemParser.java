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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'}'", "'Name'", "'RosComponent'", "'('", "')'", "','", "'TopicConnections'", "'ServiceConnections'", "'TopicConnection'", "'FromTopic'", "'ToTopic'", "'ServiceConnection'", "'FromSrv'", "'ToSrv'"
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystem.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRosSystem.g:157:2: ( RULE_STRING )
                    {
                    // InternalRosSystem.g:157:2: ( RULE_STRING )
                    // InternalRosSystem.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:163:2: ( RULE_ID )
                    {
                    // InternalRosSystem.g:163:2: ( RULE_ID )
                    // InternalRosSystem.g:164:3: RULE_ID
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
    // InternalRosSystem.g:173:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:177:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystem.g:178:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
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
    // InternalRosSystem.g:185:1: rule__RosSystem__Group__0__Impl : ( () ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:189:1: ( ( () ) )
            // InternalRosSystem.g:190:1: ( () )
            {
            // InternalRosSystem.g:190:1: ( () )
            // InternalRosSystem.g:191:2: ()
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 
            // InternalRosSystem.g:192:2: ()
            // InternalRosSystem.g:192:3: 
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
    // InternalRosSystem.g:200:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:204:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystem.g:205:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
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
    // InternalRosSystem.g:212:1: rule__RosSystem__Group__1__Impl : ( 'RosSystem' ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:216:1: ( ( 'RosSystem' ) )
            // InternalRosSystem.g:217:1: ( 'RosSystem' )
            {
            // InternalRosSystem.g:217:1: ( 'RosSystem' )
            // InternalRosSystem.g:218:2: 'RosSystem'
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
    // InternalRosSystem.g:227:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:231:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystem.g:232:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
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
    // InternalRosSystem.g:239:1: rule__RosSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:243:1: ( ( '{' ) )
            // InternalRosSystem.g:244:1: ( '{' )
            {
            // InternalRosSystem.g:244:1: ( '{' )
            // InternalRosSystem.g:245:2: '{'
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
    // InternalRosSystem.g:254:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:258:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystem.g:259:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
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
    // InternalRosSystem.g:266:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Group_3__0 )? ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:270:1: ( ( ( rule__RosSystem__Group_3__0 )? ) )
            // InternalRosSystem.g:271:1: ( ( rule__RosSystem__Group_3__0 )? )
            {
            // InternalRosSystem.g:271:1: ( ( rule__RosSystem__Group_3__0 )? )
            // InternalRosSystem.g:272:2: ( rule__RosSystem__Group_3__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_3()); 
            // InternalRosSystem.g:273:2: ( rule__RosSystem__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystem.g:273:3: rule__RosSystem__Group_3__0
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
    // InternalRosSystem.g:281:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:285:1: ( rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 )
            // InternalRosSystem.g:286:2: rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5
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
    // InternalRosSystem.g:293:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__Group_4__0 )? ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:297:1: ( ( ( rule__RosSystem__Group_4__0 )? ) )
            // InternalRosSystem.g:298:1: ( ( rule__RosSystem__Group_4__0 )? )
            {
            // InternalRosSystem.g:298:1: ( ( rule__RosSystem__Group_4__0 )? )
            // InternalRosSystem.g:299:2: ( rule__RosSystem__Group_4__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4()); 
            // InternalRosSystem.g:300:2: ( rule__RosSystem__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:300:3: rule__RosSystem__Group_4__0
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
    // InternalRosSystem.g:308:1: rule__RosSystem__Group__5 : rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 ;
    public final void rule__RosSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:312:1: ( rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 )
            // InternalRosSystem.g:313:2: rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6
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
    // InternalRosSystem.g:320:1: rule__RosSystem__Group__5__Impl : ( ( rule__RosSystem__Group_5__0 )? ) ;
    public final void rule__RosSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:324:1: ( ( ( rule__RosSystem__Group_5__0 )? ) )
            // InternalRosSystem.g:325:1: ( ( rule__RosSystem__Group_5__0 )? )
            {
            // InternalRosSystem.g:325:1: ( ( rule__RosSystem__Group_5__0 )? )
            // InternalRosSystem.g:326:2: ( rule__RosSystem__Group_5__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5()); 
            // InternalRosSystem.g:327:2: ( rule__RosSystem__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:327:3: rule__RosSystem__Group_5__0
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
    // InternalRosSystem.g:335:1: rule__RosSystem__Group__6 : rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 ;
    public final void rule__RosSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:339:1: ( rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 )
            // InternalRosSystem.g:340:2: rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7
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
    // InternalRosSystem.g:347:1: rule__RosSystem__Group__6__Impl : ( ( rule__RosSystem__Group_6__0 )? ) ;
    public final void rule__RosSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:351:1: ( ( ( rule__RosSystem__Group_6__0 )? ) )
            // InternalRosSystem.g:352:1: ( ( rule__RosSystem__Group_6__0 )? )
            {
            // InternalRosSystem.g:352:1: ( ( rule__RosSystem__Group_6__0 )? )
            // InternalRosSystem.g:353:2: ( rule__RosSystem__Group_6__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6()); 
            // InternalRosSystem.g:354:2: ( rule__RosSystem__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:354:3: rule__RosSystem__Group_6__0
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
    // InternalRosSystem.g:362:1: rule__RosSystem__Group__7 : rule__RosSystem__Group__7__Impl ;
    public final void rule__RosSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:366:1: ( rule__RosSystem__Group__7__Impl )
            // InternalRosSystem.g:367:2: rule__RosSystem__Group__7__Impl
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
    // InternalRosSystem.g:373:1: rule__RosSystem__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:377:1: ( ( '}' ) )
            // InternalRosSystem.g:378:1: ( '}' )
            {
            // InternalRosSystem.g:378:1: ( '}' )
            // InternalRosSystem.g:379:2: '}'
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
    // InternalRosSystem.g:389:1: rule__RosSystem__Group_3__0 : rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 ;
    public final void rule__RosSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:393:1: ( rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 )
            // InternalRosSystem.g:394:2: rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1
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
    // InternalRosSystem.g:401:1: rule__RosSystem__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__RosSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:405:1: ( ( 'Name' ) )
            // InternalRosSystem.g:406:1: ( 'Name' )
            {
            // InternalRosSystem.g:406:1: ( 'Name' )
            // InternalRosSystem.g:407:2: 'Name'
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
    // InternalRosSystem.g:416:1: rule__RosSystem__Group_3__1 : rule__RosSystem__Group_3__1__Impl ;
    public final void rule__RosSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:420:1: ( rule__RosSystem__Group_3__1__Impl )
            // InternalRosSystem.g:421:2: rule__RosSystem__Group_3__1__Impl
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
    // InternalRosSystem.g:427:1: rule__RosSystem__Group_3__1__Impl : ( ( rule__RosSystem__NameAssignment_3_1 ) ) ;
    public final void rule__RosSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:431:1: ( ( ( rule__RosSystem__NameAssignment_3_1 ) ) )
            // InternalRosSystem.g:432:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:432:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            // InternalRosSystem.g:433:2: ( rule__RosSystem__NameAssignment_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 
            // InternalRosSystem.g:434:2: ( rule__RosSystem__NameAssignment_3_1 )
            // InternalRosSystem.g:434:3: rule__RosSystem__NameAssignment_3_1
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
    // InternalRosSystem.g:443:1: rule__RosSystem__Group_4__0 : rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 ;
    public final void rule__RosSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:447:1: ( rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 )
            // InternalRosSystem.g:448:2: rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1
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
    // InternalRosSystem.g:455:1: rule__RosSystem__Group_4__0__Impl : ( 'RosComponent' ) ;
    public final void rule__RosSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:459:1: ( ( 'RosComponent' ) )
            // InternalRosSystem.g:460:1: ( 'RosComponent' )
            {
            // InternalRosSystem.g:460:1: ( 'RosComponent' )
            // InternalRosSystem.g:461:2: 'RosComponent'
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:470:1: rule__RosSystem__Group_4__1 : rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2 ;
    public final void rule__RosSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:474:1: ( rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2 )
            // InternalRosSystem.g:475:2: rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:482:1: rule__RosSystem__Group_4__1__Impl : ( '(' ) ;
    public final void rule__RosSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:486:1: ( ( '(' ) )
            // InternalRosSystem.g:487:1: ( '(' )
            {
            // InternalRosSystem.g:487:1: ( '(' )
            // InternalRosSystem.g:488:2: '('
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
    // InternalRosSystem.g:497:1: rule__RosSystem__Group_4__2 : rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3 ;
    public final void rule__RosSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:501:1: ( rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3 )
            // InternalRosSystem.g:502:2: rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalRosSystem.g:509:1: rule__RosSystem__Group_4__2__Impl : ( ( rule__RosSystem__RosComponentAssignment_4_2 ) ) ;
    public final void rule__RosSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:513:1: ( ( ( rule__RosSystem__RosComponentAssignment_4_2 ) ) )
            // InternalRosSystem.g:514:1: ( ( rule__RosSystem__RosComponentAssignment_4_2 ) )
            {
            // InternalRosSystem.g:514:1: ( ( rule__RosSystem__RosComponentAssignment_4_2 ) )
            // InternalRosSystem.g:515:2: ( rule__RosSystem__RosComponentAssignment_4_2 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_2()); 
            // InternalRosSystem.g:516:2: ( rule__RosSystem__RosComponentAssignment_4_2 )
            // InternalRosSystem.g:516:3: rule__RosSystem__RosComponentAssignment_4_2
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
    // InternalRosSystem.g:524:1: rule__RosSystem__Group_4__3 : rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4 ;
    public final void rule__RosSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:528:1: ( rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4 )
            // InternalRosSystem.g:529:2: rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRosSystem.g:536:1: rule__RosSystem__Group_4__3__Impl : ( ( rule__RosSystem__Group_4_3__0 )* ) ;
    public final void rule__RosSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:540:1: ( ( ( rule__RosSystem__Group_4_3__0 )* ) )
            // InternalRosSystem.g:541:1: ( ( rule__RosSystem__Group_4_3__0 )* )
            {
            // InternalRosSystem.g:541:1: ( ( rule__RosSystem__Group_4_3__0 )* )
            // InternalRosSystem.g:542:2: ( rule__RosSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4_3()); 
            // InternalRosSystem.g:543:2: ( rule__RosSystem__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRosSystem.g:543:3: rule__RosSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalRosSystem.g:551:1: rule__RosSystem__Group_4__4 : rule__RosSystem__Group_4__4__Impl ;
    public final void rule__RosSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:555:1: ( rule__RosSystem__Group_4__4__Impl )
            // InternalRosSystem.g:556:2: rule__RosSystem__Group_4__4__Impl
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
    // InternalRosSystem.g:562:1: rule__RosSystem__Group_4__4__Impl : ( ')' ) ;
    public final void rule__RosSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:566:1: ( ( ')' ) )
            // InternalRosSystem.g:567:1: ( ')' )
            {
            // InternalRosSystem.g:567:1: ( ')' )
            // InternalRosSystem.g:568:2: ')'
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
    // InternalRosSystem.g:578:1: rule__RosSystem__Group_4_3__0 : rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1 ;
    public final void rule__RosSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:582:1: ( rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1 )
            // InternalRosSystem.g:583:2: rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:590:1: rule__RosSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:594:1: ( ( ',' ) )
            // InternalRosSystem.g:595:1: ( ',' )
            {
            // InternalRosSystem.g:595:1: ( ',' )
            // InternalRosSystem.g:596:2: ','
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
    // InternalRosSystem.g:605:1: rule__RosSystem__Group_4_3__1 : rule__RosSystem__Group_4_3__1__Impl ;
    public final void rule__RosSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:609:1: ( rule__RosSystem__Group_4_3__1__Impl )
            // InternalRosSystem.g:610:2: rule__RosSystem__Group_4_3__1__Impl
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
    // InternalRosSystem.g:616:1: rule__RosSystem__Group_4_3__1__Impl : ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) ) ;
    public final void rule__RosSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:620:1: ( ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) ) )
            // InternalRosSystem.g:621:1: ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) )
            {
            // InternalRosSystem.g:621:1: ( ( rule__RosSystem__RosComponentAssignment_4_3_1 ) )
            // InternalRosSystem.g:622:2: ( rule__RosSystem__RosComponentAssignment_4_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_3_1()); 
            // InternalRosSystem.g:623:2: ( rule__RosSystem__RosComponentAssignment_4_3_1 )
            // InternalRosSystem.g:623:3: rule__RosSystem__RosComponentAssignment_4_3_1
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
    // InternalRosSystem.g:632:1: rule__RosSystem__Group_5__0 : rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 ;
    public final void rule__RosSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:636:1: ( rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 )
            // InternalRosSystem.g:637:2: rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1
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
    // InternalRosSystem.g:644:1: rule__RosSystem__Group_5__0__Impl : ( 'TopicConnections' ) ;
    public final void rule__RosSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:648:1: ( ( 'TopicConnections' ) )
            // InternalRosSystem.g:649:1: ( 'TopicConnections' )
            {
            // InternalRosSystem.g:649:1: ( 'TopicConnections' )
            // InternalRosSystem.g:650:2: 'TopicConnections'
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
    // InternalRosSystem.g:659:1: rule__RosSystem__Group_5__1 : rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 ;
    public final void rule__RosSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:663:1: ( rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 )
            // InternalRosSystem.g:664:2: rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalRosSystem.g:671:1: rule__RosSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:675:1: ( ( '{' ) )
            // InternalRosSystem.g:676:1: ( '{' )
            {
            // InternalRosSystem.g:676:1: ( '{' )
            // InternalRosSystem.g:677:2: '{'
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
    // InternalRosSystem.g:686:1: rule__RosSystem__Group_5__2 : rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 ;
    public final void rule__RosSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:690:1: ( rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 )
            // InternalRosSystem.g:691:2: rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystem.g:698:1: rule__RosSystem__Group_5__2__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) ;
    public final void rule__RosSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:702:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) )
            // InternalRosSystem.g:703:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            {
            // InternalRosSystem.g:703:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            // InternalRosSystem.g:704:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 
            // InternalRosSystem.g:705:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            // InternalRosSystem.g:705:3: rule__RosSystem__TopicConnectionsAssignment_5_2
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
    // InternalRosSystem.g:713:1: rule__RosSystem__Group_5__3 : rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 ;
    public final void rule__RosSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:717:1: ( rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 )
            // InternalRosSystem.g:718:2: rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystem.g:725:1: rule__RosSystem__Group_5__3__Impl : ( ( rule__RosSystem__Group_5_3__0 )* ) ;
    public final void rule__RosSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:729:1: ( ( ( rule__RosSystem__Group_5_3__0 )* ) )
            // InternalRosSystem.g:730:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:730:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            // InternalRosSystem.g:731:2: ( rule__RosSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_3()); 
            // InternalRosSystem.g:732:2: ( rule__RosSystem__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRosSystem.g:732:3: rule__RosSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalRosSystem.g:740:1: rule__RosSystem__Group_5__4 : rule__RosSystem__Group_5__4__Impl ;
    public final void rule__RosSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:744:1: ( rule__RosSystem__Group_5__4__Impl )
            // InternalRosSystem.g:745:2: rule__RosSystem__Group_5__4__Impl
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
    // InternalRosSystem.g:751:1: rule__RosSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:755:1: ( ( '}' ) )
            // InternalRosSystem.g:756:1: ( '}' )
            {
            // InternalRosSystem.g:756:1: ( '}' )
            // InternalRosSystem.g:757:2: '}'
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
    // InternalRosSystem.g:767:1: rule__RosSystem__Group_5_3__0 : rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 ;
    public final void rule__RosSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:771:1: ( rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 )
            // InternalRosSystem.g:772:2: rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRosSystem.g:779:1: rule__RosSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:783:1: ( ( ',' ) )
            // InternalRosSystem.g:784:1: ( ',' )
            {
            // InternalRosSystem.g:784:1: ( ',' )
            // InternalRosSystem.g:785:2: ','
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
    // InternalRosSystem.g:794:1: rule__RosSystem__Group_5_3__1 : rule__RosSystem__Group_5_3__1__Impl ;
    public final void rule__RosSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:798:1: ( rule__RosSystem__Group_5_3__1__Impl )
            // InternalRosSystem.g:799:2: rule__RosSystem__Group_5_3__1__Impl
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
    // InternalRosSystem.g:805:1: rule__RosSystem__Group_5_3__1__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) ;
    public final void rule__RosSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:809:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:810:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:810:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            // InternalRosSystem.g:811:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 
            // InternalRosSystem.g:812:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            // InternalRosSystem.g:812:3: rule__RosSystem__TopicConnectionsAssignment_5_3_1
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
    // InternalRosSystem.g:821:1: rule__RosSystem__Group_6__0 : rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 ;
    public final void rule__RosSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:825:1: ( rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 )
            // InternalRosSystem.g:826:2: rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1
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
    // InternalRosSystem.g:833:1: rule__RosSystem__Group_6__0__Impl : ( 'ServiceConnections' ) ;
    public final void rule__RosSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:837:1: ( ( 'ServiceConnections' ) )
            // InternalRosSystem.g:838:1: ( 'ServiceConnections' )
            {
            // InternalRosSystem.g:838:1: ( 'ServiceConnections' )
            // InternalRosSystem.g:839:2: 'ServiceConnections'
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
    // InternalRosSystem.g:848:1: rule__RosSystem__Group_6__1 : rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 ;
    public final void rule__RosSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:852:1: ( rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 )
            // InternalRosSystem.g:853:2: rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:860:1: rule__RosSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:864:1: ( ( '{' ) )
            // InternalRosSystem.g:865:1: ( '{' )
            {
            // InternalRosSystem.g:865:1: ( '{' )
            // InternalRosSystem.g:866:2: '{'
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
    // InternalRosSystem.g:875:1: rule__RosSystem__Group_6__2 : rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 ;
    public final void rule__RosSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:879:1: ( rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 )
            // InternalRosSystem.g:880:2: rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystem.g:887:1: rule__RosSystem__Group_6__2__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) ;
    public final void rule__RosSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:891:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) )
            // InternalRosSystem.g:892:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            {
            // InternalRosSystem.g:892:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            // InternalRosSystem.g:893:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 
            // InternalRosSystem.g:894:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            // InternalRosSystem.g:894:3: rule__RosSystem__ServiceConnectionsAssignment_6_2
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
    // InternalRosSystem.g:902:1: rule__RosSystem__Group_6__3 : rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 ;
    public final void rule__RosSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:906:1: ( rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 )
            // InternalRosSystem.g:907:2: rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystem.g:914:1: rule__RosSystem__Group_6__3__Impl : ( ( rule__RosSystem__Group_6_3__0 )* ) ;
    public final void rule__RosSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:918:1: ( ( ( rule__RosSystem__Group_6_3__0 )* ) )
            // InternalRosSystem.g:919:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:919:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            // InternalRosSystem.g:920:2: ( rule__RosSystem__Group_6_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_3()); 
            // InternalRosSystem.g:921:2: ( rule__RosSystem__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRosSystem.g:921:3: rule__RosSystem__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalRosSystem.g:929:1: rule__RosSystem__Group_6__4 : rule__RosSystem__Group_6__4__Impl ;
    public final void rule__RosSystem__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:933:1: ( rule__RosSystem__Group_6__4__Impl )
            // InternalRosSystem.g:934:2: rule__RosSystem__Group_6__4__Impl
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
    // InternalRosSystem.g:940:1: rule__RosSystem__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:944:1: ( ( '}' ) )
            // InternalRosSystem.g:945:1: ( '}' )
            {
            // InternalRosSystem.g:945:1: ( '}' )
            // InternalRosSystem.g:946:2: '}'
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
    // InternalRosSystem.g:956:1: rule__RosSystem__Group_6_3__0 : rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 ;
    public final void rule__RosSystem__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:960:1: ( rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 )
            // InternalRosSystem.g:961:2: rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:968:1: rule__RosSystem__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:972:1: ( ( ',' ) )
            // InternalRosSystem.g:973:1: ( ',' )
            {
            // InternalRosSystem.g:973:1: ( ',' )
            // InternalRosSystem.g:974:2: ','
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
    // InternalRosSystem.g:983:1: rule__RosSystem__Group_6_3__1 : rule__RosSystem__Group_6_3__1__Impl ;
    public final void rule__RosSystem__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:987:1: ( rule__RosSystem__Group_6_3__1__Impl )
            // InternalRosSystem.g:988:2: rule__RosSystem__Group_6_3__1__Impl
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
    // InternalRosSystem.g:994:1: rule__RosSystem__Group_6_3__1__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) ;
    public final void rule__RosSystem__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:998:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:999:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:999:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            // InternalRosSystem.g:1000:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 
            // InternalRosSystem.g:1001:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            // InternalRosSystem.g:1001:3: rule__RosSystem__ServiceConnectionsAssignment_6_3_1
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
    // InternalRosSystem.g:1010:1: rule__TopicConnection__Group__0 : rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 ;
    public final void rule__TopicConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1014:1: ( rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 )
            // InternalRosSystem.g:1015:2: rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1
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
    // InternalRosSystem.g:1022:1: rule__TopicConnection__Group__0__Impl : ( 'TopicConnection' ) ;
    public final void rule__TopicConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1026:1: ( ( 'TopicConnection' ) )
            // InternalRosSystem.g:1027:1: ( 'TopicConnection' )
            {
            // InternalRosSystem.g:1027:1: ( 'TopicConnection' )
            // InternalRosSystem.g:1028:2: 'TopicConnection'
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
    // InternalRosSystem.g:1037:1: rule__TopicConnection__Group__1 : rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 ;
    public final void rule__TopicConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1041:1: ( rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 )
            // InternalRosSystem.g:1042:2: rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:1049:1: rule__TopicConnection__Group__1__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1053:1: ( ( '{' ) )
            // InternalRosSystem.g:1054:1: ( '{' )
            {
            // InternalRosSystem.g:1054:1: ( '{' )
            // InternalRosSystem.g:1055:2: '{'
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
    // InternalRosSystem.g:1064:1: rule__TopicConnection__Group__2 : rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 ;
    public final void rule__TopicConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1068:1: ( rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 )
            // InternalRosSystem.g:1069:2: rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3
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
    // InternalRosSystem.g:1076:1: rule__TopicConnection__Group__2__Impl : ( 'FromTopic' ) ;
    public final void rule__TopicConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1080:1: ( ( 'FromTopic' ) )
            // InternalRosSystem.g:1081:1: ( 'FromTopic' )
            {
            // InternalRosSystem.g:1081:1: ( 'FromTopic' )
            // InternalRosSystem.g:1082:2: 'FromTopic'
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
    // InternalRosSystem.g:1091:1: rule__TopicConnection__Group__3 : rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 ;
    public final void rule__TopicConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1095:1: ( rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 )
            // InternalRosSystem.g:1096:2: rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystem.g:1103:1: rule__TopicConnection__Group__3__Impl : ( ( rule__TopicConnection__FromTopicAssignment_3 ) ) ;
    public final void rule__TopicConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1107:1: ( ( ( rule__TopicConnection__FromTopicAssignment_3 ) ) )
            // InternalRosSystem.g:1108:1: ( ( rule__TopicConnection__FromTopicAssignment_3 ) )
            {
            // InternalRosSystem.g:1108:1: ( ( rule__TopicConnection__FromTopicAssignment_3 ) )
            // InternalRosSystem.g:1109:2: ( rule__TopicConnection__FromTopicAssignment_3 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromTopicAssignment_3()); 
            // InternalRosSystem.g:1110:2: ( rule__TopicConnection__FromTopicAssignment_3 )
            // InternalRosSystem.g:1110:3: rule__TopicConnection__FromTopicAssignment_3
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
    // InternalRosSystem.g:1118:1: rule__TopicConnection__Group__4 : rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 ;
    public final void rule__TopicConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1122:1: ( rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 )
            // InternalRosSystem.g:1123:2: rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5
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
    // InternalRosSystem.g:1130:1: rule__TopicConnection__Group__4__Impl : ( 'ToTopic' ) ;
    public final void rule__TopicConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1134:1: ( ( 'ToTopic' ) )
            // InternalRosSystem.g:1135:1: ( 'ToTopic' )
            {
            // InternalRosSystem.g:1135:1: ( 'ToTopic' )
            // InternalRosSystem.g:1136:2: 'ToTopic'
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
    // InternalRosSystem.g:1145:1: rule__TopicConnection__Group__5 : rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 ;
    public final void rule__TopicConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1149:1: ( rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 )
            // InternalRosSystem.g:1150:2: rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystem.g:1157:1: rule__TopicConnection__Group__5__Impl : ( ( rule__TopicConnection__ToTopicAssignment_5 ) ) ;
    public final void rule__TopicConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1161:1: ( ( ( rule__TopicConnection__ToTopicAssignment_5 ) ) )
            // InternalRosSystem.g:1162:1: ( ( rule__TopicConnection__ToTopicAssignment_5 ) )
            {
            // InternalRosSystem.g:1162:1: ( ( rule__TopicConnection__ToTopicAssignment_5 ) )
            // InternalRosSystem.g:1163:2: ( rule__TopicConnection__ToTopicAssignment_5 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToTopicAssignment_5()); 
            // InternalRosSystem.g:1164:2: ( rule__TopicConnection__ToTopicAssignment_5 )
            // InternalRosSystem.g:1164:3: rule__TopicConnection__ToTopicAssignment_5
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
    // InternalRosSystem.g:1172:1: rule__TopicConnection__Group__6 : rule__TopicConnection__Group__6__Impl ;
    public final void rule__TopicConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1176:1: ( rule__TopicConnection__Group__6__Impl )
            // InternalRosSystem.g:1177:2: rule__TopicConnection__Group__6__Impl
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
    // InternalRosSystem.g:1183:1: rule__TopicConnection__Group__6__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1187:1: ( ( '}' ) )
            // InternalRosSystem.g:1188:1: ( '}' )
            {
            // InternalRosSystem.g:1188:1: ( '}' )
            // InternalRosSystem.g:1189:2: '}'
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
    // InternalRosSystem.g:1199:1: rule__ServiceConnection__Group__0 : rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 ;
    public final void rule__ServiceConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1203:1: ( rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 )
            // InternalRosSystem.g:1204:2: rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1
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
    // InternalRosSystem.g:1211:1: rule__ServiceConnection__Group__0__Impl : ( 'ServiceConnection' ) ;
    public final void rule__ServiceConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1215:1: ( ( 'ServiceConnection' ) )
            // InternalRosSystem.g:1216:1: ( 'ServiceConnection' )
            {
            // InternalRosSystem.g:1216:1: ( 'ServiceConnection' )
            // InternalRosSystem.g:1217:2: 'ServiceConnection'
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
    // InternalRosSystem.g:1226:1: rule__ServiceConnection__Group__1 : rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 ;
    public final void rule__ServiceConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1230:1: ( rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 )
            // InternalRosSystem.g:1231:2: rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystem.g:1238:1: rule__ServiceConnection__Group__1__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1242:1: ( ( '{' ) )
            // InternalRosSystem.g:1243:1: ( '{' )
            {
            // InternalRosSystem.g:1243:1: ( '{' )
            // InternalRosSystem.g:1244:2: '{'
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
    // InternalRosSystem.g:1253:1: rule__ServiceConnection__Group__2 : rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 ;
    public final void rule__ServiceConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1257:1: ( rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 )
            // InternalRosSystem.g:1258:2: rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3
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
    // InternalRosSystem.g:1265:1: rule__ServiceConnection__Group__2__Impl : ( 'FromSrv' ) ;
    public final void rule__ServiceConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1269:1: ( ( 'FromSrv' ) )
            // InternalRosSystem.g:1270:1: ( 'FromSrv' )
            {
            // InternalRosSystem.g:1270:1: ( 'FromSrv' )
            // InternalRosSystem.g:1271:2: 'FromSrv'
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
    // InternalRosSystem.g:1280:1: rule__ServiceConnection__Group__3 : rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 ;
    public final void rule__ServiceConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1284:1: ( rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 )
            // InternalRosSystem.g:1285:2: rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:1292:1: rule__ServiceConnection__Group__3__Impl : ( ( rule__ServiceConnection__FromSrvAssignment_3 ) ) ;
    public final void rule__ServiceConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1296:1: ( ( ( rule__ServiceConnection__FromSrvAssignment_3 ) ) )
            // InternalRosSystem.g:1297:1: ( ( rule__ServiceConnection__FromSrvAssignment_3 ) )
            {
            // InternalRosSystem.g:1297:1: ( ( rule__ServiceConnection__FromSrvAssignment_3 ) )
            // InternalRosSystem.g:1298:2: ( rule__ServiceConnection__FromSrvAssignment_3 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromSrvAssignment_3()); 
            // InternalRosSystem.g:1299:2: ( rule__ServiceConnection__FromSrvAssignment_3 )
            // InternalRosSystem.g:1299:3: rule__ServiceConnection__FromSrvAssignment_3
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
    // InternalRosSystem.g:1307:1: rule__ServiceConnection__Group__4 : rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 ;
    public final void rule__ServiceConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1311:1: ( rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 )
            // InternalRosSystem.g:1312:2: rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5
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
    // InternalRosSystem.g:1319:1: rule__ServiceConnection__Group__4__Impl : ( 'ToSrv' ) ;
    public final void rule__ServiceConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1323:1: ( ( 'ToSrv' ) )
            // InternalRosSystem.g:1324:1: ( 'ToSrv' )
            {
            // InternalRosSystem.g:1324:1: ( 'ToSrv' )
            // InternalRosSystem.g:1325:2: 'ToSrv'
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
    // InternalRosSystem.g:1334:1: rule__ServiceConnection__Group__5 : rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 ;
    public final void rule__ServiceConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1338:1: ( rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 )
            // InternalRosSystem.g:1339:2: rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystem.g:1346:1: rule__ServiceConnection__Group__5__Impl : ( ( rule__ServiceConnection__ToSrvAssignment_5 ) ) ;
    public final void rule__ServiceConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1350:1: ( ( ( rule__ServiceConnection__ToSrvAssignment_5 ) ) )
            // InternalRosSystem.g:1351:1: ( ( rule__ServiceConnection__ToSrvAssignment_5 ) )
            {
            // InternalRosSystem.g:1351:1: ( ( rule__ServiceConnection__ToSrvAssignment_5 ) )
            // InternalRosSystem.g:1352:2: ( rule__ServiceConnection__ToSrvAssignment_5 )
            {
             before(grammarAccess.getServiceConnectionAccess().getToSrvAssignment_5()); 
            // InternalRosSystem.g:1353:2: ( rule__ServiceConnection__ToSrvAssignment_5 )
            // InternalRosSystem.g:1353:3: rule__ServiceConnection__ToSrvAssignment_5
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
    // InternalRosSystem.g:1361:1: rule__ServiceConnection__Group__6 : rule__ServiceConnection__Group__6__Impl ;
    public final void rule__ServiceConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1365:1: ( rule__ServiceConnection__Group__6__Impl )
            // InternalRosSystem.g:1366:2: rule__ServiceConnection__Group__6__Impl
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
    // InternalRosSystem.g:1372:1: rule__ServiceConnection__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1376:1: ( ( '}' ) )
            // InternalRosSystem.g:1377:1: ( '}' )
            {
            // InternalRosSystem.g:1377:1: ( '}' )
            // InternalRosSystem.g:1378:2: '}'
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


    // $ANTLR start "rule__RosSystem__NameAssignment_3_1"
    // InternalRosSystem.g:1388:1: rule__RosSystem__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1392:1: ( ( ruleEString ) )
            // InternalRosSystem.g:1393:2: ( ruleEString )
            {
            // InternalRosSystem.g:1393:2: ( ruleEString )
            // InternalRosSystem.g:1394:3: ruleEString
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
    // InternalRosSystem.g:1403:1: rule__RosSystem__RosComponentAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__RosSystem__RosComponentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1407:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:1408:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:1408:2: ( ( ruleEString ) )
            // InternalRosSystem.g:1409:3: ( ruleEString )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_2_0()); 
            // InternalRosSystem.g:1410:3: ( ruleEString )
            // InternalRosSystem.g:1411:4: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_2_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:1422:1: rule__RosSystem__RosComponentAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RosSystem__RosComponentAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1426:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:1427:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:1427:2: ( ( ruleEString ) )
            // InternalRosSystem.g:1428:3: ( ruleEString )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_3_1_0()); 
            // InternalRosSystem.g:1429:3: ( ruleEString )
            // InternalRosSystem.g:1430:4: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_3_1_0()); 

            }


            }

        }
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
    // InternalRosSystem.g:1441:1: rule__RosSystem__TopicConnectionsAssignment_5_2 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1445:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:1446:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:1446:2: ( ruleTopicConnection )
            // InternalRosSystem.g:1447:3: ruleTopicConnection
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
    // InternalRosSystem.g:1456:1: rule__RosSystem__TopicConnectionsAssignment_5_3_1 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1460:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:1461:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:1461:2: ( ruleTopicConnection )
            // InternalRosSystem.g:1462:3: ruleTopicConnection
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
    // InternalRosSystem.g:1471:1: rule__RosSystem__ServiceConnectionsAssignment_6_2 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1475:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:1476:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:1476:2: ( ruleServiceConnection )
            // InternalRosSystem.g:1477:3: ruleServiceConnection
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
    // InternalRosSystem.g:1486:1: rule__RosSystem__ServiceConnectionsAssignment_6_3_1 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1490:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:1491:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:1491:2: ( ruleServiceConnection )
            // InternalRosSystem.g:1492:3: ruleServiceConnection
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
    // InternalRosSystem.g:1501:1: rule__TopicConnection__FromTopicAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromTopicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1505:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:1506:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:1506:2: ( ( ruleEString ) )
            // InternalRosSystem.g:1507:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherCrossReference_3_0()); 
            // InternalRosSystem.g:1508:3: ( ruleEString )
            // InternalRosSystem.g:1509:4: ruleEString
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
    // InternalRosSystem.g:1520:1: rule__TopicConnection__ToTopicAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToTopicAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1524:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:1525:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:1525:2: ( ( ruleEString ) )
            // InternalRosSystem.g:1526:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberCrossReference_5_0()); 
            // InternalRosSystem.g:1527:3: ( ruleEString )
            // InternalRosSystem.g:1528:4: ruleEString
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
    // InternalRosSystem.g:1539:1: rule__ServiceConnection__FromSrvAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromSrvAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1543:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:1544:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:1544:2: ( ( ruleEString ) )
            // InternalRosSystem.g:1545:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerCrossReference_3_0()); 
            // InternalRosSystem.g:1546:3: ( ruleEString )
            // InternalRosSystem.g:1547:4: ruleEString
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
    // InternalRosSystem.g:1558:1: rule__ServiceConnection__ToSrvAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__ToSrvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1562:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:1563:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:1563:2: ( ( ruleEString ) )
            // InternalRosSystem.g:1564:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientCrossReference_5_0()); 
            // InternalRosSystem.g:1565:3: ( ruleEString )
            // InternalRosSystem.g:1566:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000018E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});

}