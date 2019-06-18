package de.fraunhofer.ipa.componentInterface.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceLexer extends Lexer {
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

    public InternalComponentInterfaceLexer() {;} 
    public InternalComponentInterfaceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalComponentInterfaceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:11:7: ( 'ComponentInterface' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:11:9: 'ComponentInterface'
            {
            match("ComponentInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:12:7: ( '{' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:13:7: ( 'name' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:13:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:14:7: ( 'NameSpace' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:14:9: 'NameSpace'
            {
            match("NameSpace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:15:7: ( 'RosPublishers' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:15:9: 'RosPublishers'
            {
            match("RosPublishers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:16:7: ( ',' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:17:7: ( '}' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:18:7: ( 'RosSubscribers' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:18:9: 'RosSubscribers'
            {
            match("RosSubscribers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:19:7: ( 'RosSrvServers' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:19:9: 'RosSrvServers'
            {
            match("RosSrvServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:20:7: ( 'RosSrvClients' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:20:9: 'RosSrvClients'
            {
            match("RosSrvClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:21:7: ( 'RosActionServers' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:21:9: 'RosActionServers'
            {
            match("RosActionServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:22:7: ( 'RosActionClients' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:22:9: 'RosActionClients'
            {
            match("RosActionClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:23:7: ( 'RosPublisher' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:23:9: 'RosPublisher'
            {
            match("RosPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:24:7: ( 'ns' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:24:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:25:7: ( 'RefPublisher' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:25:9: 'RefPublisher'
            {
            match("RefPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:26:7: ( 'RosSubscriber' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:26:9: 'RosSubscriber'
            {
            match("RosSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:27:7: ( 'RefSubscriber' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:27:9: 'RefSubscriber'
            {
            match("RefSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:28:7: ( 'RosServiceServer' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:28:9: 'RosServiceServer'
            {
            match("RosServiceServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:29:7: ( 'RefServer' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:29:9: 'RefServer'
            {
            match("RefServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:30:7: ( 'RosServiceClient' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:30:9: 'RosServiceClient'
            {
            match("RosServiceClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:31:7: ( 'RefClient' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:31:9: 'RefClient'
            {
            match("RefClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:32:7: ( 'RosActionServer' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:32:9: 'RosActionServer'
            {
            match("RosActionServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:33:7: ( 'RosActionClient' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:33:9: 'RosActionClient'
            {
            match("RosActionClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1136:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1136:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1136:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1136:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1136:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1138:10: ( ( '0' .. '9' )+ )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1138:12: ( '0' .. '9' )+
            {
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1138:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1138:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1140:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1142:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1142:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1142:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1142:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:41: ( '\\r' )? '\\n'
                    {
                    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1144:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1146:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1146:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1146:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1148:16: ( . )
            // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1148:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:148: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:156: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:165: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:177: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:193: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:209: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../de.fraunhofer.ipa.componentInterface.xtext/src-gen/de/fraunhofer/ipa/componentInterface/parser/antlr/internal/InternalComponentInterface.g:1:217: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\21\1\uffff\3\21\2\uffff\1\17\2\uffff\3\17\2\uffff\1\21\2\uffff\1\21\1\41\3\21\7\uffff\2\21\1\uffff\4\21\1\57\10\21\1\uffff\56\21\1\152\10\21\1\164\1\165\1\21\1\uffff\11\21\2\uffff\14\21\1\u008e\7\21\1\u0096\2\21\1\u0099\1\uffff\1\u009b\1\u009c\1\u009d\4\21\1\uffff\1\u00a2\1\21\1\uffff\1\u00a4\3\uffff\4\21\1\uffff\1\21\1\uffff\2\21\1\u00ad\1\u00af\1\21\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u00b4\1\uffff\1\21\4\uffff\1\u00b6\1\uffff";
    static final String DFA12_eofS =
        "\u00b7\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\uffff\2\141\1\145\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\155\2\uffff\1\155\1\60\1\155\1\163\1\146\7\uffff\1\160\1\145\1\uffff\1\145\1\101\1\103\1\157\1\60\1\123\1\165\1\145\1\143\1\165\1\145\1\154\1\156\1\uffff\1\160\2\142\1\166\1\162\1\164\2\142\1\162\1\151\1\145\1\141\1\154\1\163\1\103\1\166\1\151\1\154\1\163\1\166\1\145\1\156\1\143\1\151\1\143\1\145\1\154\1\151\1\157\1\151\1\143\1\145\1\156\1\164\1\145\1\163\2\162\1\151\1\143\1\156\1\163\2\162\1\164\1\111\1\60\1\150\1\151\1\166\2\145\1\103\1\150\1\151\2\60\1\156\1\uffff\1\145\1\142\1\145\1\156\1\103\1\145\1\154\1\145\1\142\2\uffff\1\164\1\162\1\145\1\162\1\164\1\145\1\154\1\162\1\151\1\162\2\145\1\60\1\162\2\163\1\162\1\151\1\166\1\145\1\60\2\162\1\60\1\uffff\3\60\1\166\2\145\1\156\1\uffff\1\60\1\146\1\uffff\1\60\3\uffff\1\145\1\156\1\162\1\164\1\uffff\1\141\1\uffff\1\162\1\164\2\60\1\143\3\60\1\uffff\1\60\1\uffff\1\145\4\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\uffff\1\163\1\141\1\157\2\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\155\2\uffff\1\155\1\172\1\155\1\163\1\146\7\uffff\1\160\1\145\1\uffff\1\145\2\123\1\157\1\172\1\123\2\165\1\143\2\165\1\154\1\156\1\uffff\1\160\2\142\1\166\1\162\1\164\2\142\1\162\1\151\1\145\1\141\1\154\1\163\1\123\1\166\1\151\1\154\1\163\1\166\1\145\1\156\1\143\1\151\1\143\1\145\1\154\1\151\1\157\1\151\1\143\1\145\1\156\1\164\1\145\1\163\2\162\1\151\1\143\1\156\1\163\2\162\1\164\1\111\1\172\1\150\1\151\1\166\2\145\1\123\1\150\1\151\2\172\1\156\1\uffff\1\145\1\142\1\145\1\156\1\123\1\145\1\154\1\145\1\142\2\uffff\1\164\1\162\1\145\1\162\1\164\1\145\1\154\1\162\1\151\1\162\2\145\1\172\1\162\2\163\1\162\1\151\1\166\1\145\1\172\2\162\1\172\1\uffff\3\172\1\166\2\145\1\156\1\uffff\1\172\1\146\1\uffff\1\172\3\uffff\1\145\1\156\1\162\1\164\1\uffff\1\141\1\uffff\1\162\1\164\2\172\1\143\3\172\1\uffff\1\172\1\uffff\1\145\4\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\1\uffff\1\30\1\31\3\uffff\1\35\1\36\1\uffff\1\30\1\2\5\uffff\1\6\1\7\1\31\1\32\1\33\1\34\1\35\2\uffff\1\16\15\uffff\1\3\72\uffff\1\4\11\uffff\1\23\1\25\30\uffff\1\15\7\uffff\1\17\2\uffff\1\5\1\uffff\1\20\1\11\1\12\4\uffff\1\21\1\uffff\1\10\10\uffff\1\26\1\uffff\1\27\1\uffff\1\22\1\24\1\13\1\14\1\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\12\uffff\1\0\1\2\u00aa\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\13\4\17\1\14\4\17\1\6\2\17\1\15\12\12\7\17\2\11\1\1\12\11\1\4\3\11\1\5\10\11\3\17\1\10\1\11\1\17\15\11\1\3\14\11\1\2\1\17\1\7\uff82\17",
            "\1\20",
            "",
            "\1\23\21\uffff\1\24",
            "\1\25",
            "\1\27\11\uffff\1\26",
            "",
            "",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\0\33",
            "\0\33",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "\1\37",
            "",
            "",
            "\1\40",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "",
            "\1\47",
            "\1\52\16\uffff\1\50\2\uffff\1\51",
            "\1\55\14\uffff\1\53\2\uffff\1\54",
            "\1\56",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\60",
            "\1\61",
            "\1\64\14\uffff\1\63\2\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\70\17\uffff\1\67",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\112\17\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\161\17\uffff\1\160",
            "\1\162",
            "\1\163",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\174\17\uffff\1\173",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\22\21\1\u008d\7\21",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\u0097",
            "\1\u0098",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\22\21\1\u009a\7\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\u00a3",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\22\21\1\u00ac\7\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\22\21\1\u00ae\7\21",
            "\1\u00b0",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\1\u00b5",
            "",
            "",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 27;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='C') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='n') ) {s = 3;}

                        else if ( (LA12_0=='N') ) {s = 4;}

                        else if ( (LA12_0=='R') ) {s = 5;}

                        else if ( (LA12_0==',') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='Q')||(LA12_0>='S' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='z')) ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\"') ) {s = 11;}

                        else if ( (LA12_0=='\'') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 14;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFF')) ) {s = 27;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}