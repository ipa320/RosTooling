package de.fraunhofer.ipa.componentInterface.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceLexer extends Lexer {
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

    public InternalComponentInterfaceLexer() {;} 
    public InternalComponentInterfaceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalComponentInterfaceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:11:7: ( 'ComponentInterface' )
            // InternalComponentInterface.g:11:9: 'ComponentInterface'
            {
            match("ComponentInterface"); 


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
            // InternalComponentInterface.g:12:7: ( '{' )
            // InternalComponentInterface.g:12:9: '{'
            {
            match('{'); 

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
            // InternalComponentInterface.g:13:7: ( 'name' )
            // InternalComponentInterface.g:13:9: 'name'
            {
            match("name"); 


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
            // InternalComponentInterface.g:14:7: ( '}' )
            // InternalComponentInterface.g:14:9: '}'
            {
            match('}'); 

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
            // InternalComponentInterface.g:15:7: ( 'NameSpace' )
            // InternalComponentInterface.g:15:9: 'NameSpace'
            {
            match("NameSpace"); 


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
            // InternalComponentInterface.g:16:7: ( 'FromRosNode' )
            // InternalComponentInterface.g:16:9: 'FromRosNode'
            {
            match("FromRosNode"); 


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
            // InternalComponentInterface.g:17:7: ( 'RosPublishers' )
            // InternalComponentInterface.g:17:9: 'RosPublishers'
            {
            match("RosPublishers"); 


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
            // InternalComponentInterface.g:18:7: ( ',' )
            // InternalComponentInterface.g:18:9: ','
            {
            match(','); 

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
            // InternalComponentInterface.g:19:7: ( 'RosSubscribers' )
            // InternalComponentInterface.g:19:9: 'RosSubscribers'
            {
            match("RosSubscribers"); 


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
            // InternalComponentInterface.g:20:7: ( 'RosSrvServers' )
            // InternalComponentInterface.g:20:9: 'RosSrvServers'
            {
            match("RosSrvServers"); 


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
            // InternalComponentInterface.g:21:7: ( 'RosSrvClients' )
            // InternalComponentInterface.g:21:9: 'RosSrvClients'
            {
            match("RosSrvClients"); 


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
            // InternalComponentInterface.g:22:7: ( 'RosActionServers' )
            // InternalComponentInterface.g:22:9: 'RosActionServers'
            {
            match("RosActionServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:23:7: ( 'RosActionClients' )
            // InternalComponentInterface.g:23:9: 'RosActionClients'
            {
            match("RosActionClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:24:7: ( 'RosParameters' )
            // InternalComponentInterface.g:24:9: 'RosParameters'
            {
            match("RosParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:25:7: ( 'RosPublisher' )
            // InternalComponentInterface.g:25:9: 'RosPublisher'
            {
            match("RosPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:26:7: ( 'RefPublisher' )
            // InternalComponentInterface.g:26:9: 'RefPublisher'
            {
            match("RefPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:27:7: ( 'ns' )
            // InternalComponentInterface.g:27:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:28:7: ( 'RosSubscriber' )
            // InternalComponentInterface.g:28:9: 'RosSubscriber'
            {
            match("RosSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:29:7: ( 'RefSubscriber' )
            // InternalComponentInterface.g:29:9: 'RefSubscriber'
            {
            match("RefSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:30:7: ( 'RosServiceServer' )
            // InternalComponentInterface.g:30:9: 'RosServiceServer'
            {
            match("RosServiceServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:31:7: ( 'RefServer' )
            // InternalComponentInterface.g:31:9: 'RefServer'
            {
            match("RefServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:32:7: ( 'RosServiceClient' )
            // InternalComponentInterface.g:32:9: 'RosServiceClient'
            {
            match("RosServiceClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:33:7: ( 'RefClient' )
            // InternalComponentInterface.g:33:9: 'RefClient'
            {
            match("RefClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:34:7: ( 'RosActionServer' )
            // InternalComponentInterface.g:34:9: 'RosActionServer'
            {
            match("RosActionServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:35:7: ( 'RosActionClient' )
            // InternalComponentInterface.g:35:9: 'RosActionClient'
            {
            match("RosActionClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:36:7: ( 'RosParameter' )
            // InternalComponentInterface.g:36:9: 'RosParameter'
            {
            match("RosParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:37:7: ( 'RefParameter' )
            // InternalComponentInterface.g:37:9: 'RefParameter'
            {
            match("RefParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:38:7: ( 'value' )
            // InternalComponentInterface.g:38:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalComponentInterface.g:5830:21: ( '0' .. '9' )
            // InternalComponentInterface.g:5830:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:5832:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalComponentInterface.g:5832:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalComponentInterface.g:5832:15: ( '0b' | '0B' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='b') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='B') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:5832:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5832:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalComponentInterface.g:5832:27: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentInterface.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:5834:14: ( ( 'true' | 'false' ) )
            // InternalComponentInterface.g:5834:16: ( 'true' | 'false' )
            {
            // InternalComponentInterface.g:5834:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:5834:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5834:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:5836:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalComponentInterface.g:5836:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalComponentInterface.g:5836:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:5836:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalComponentInterface.g:5836:32: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalComponentInterface.g:5836:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5836:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalComponentInterface.g:5836:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalComponentInterface.g:5836:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalComponentInterface.g:5836:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalComponentInterface.g:5836:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalComponentInterface.g:5836:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='-') ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1=='0') ) {
                            alt7=1;
                        }
                        else if ( (LA7_1=='-'||(LA7_1>='1' && LA7_1<='9')) ) {
                            alt7=1;
                        }
                    }
                    else if ( (LA7_0=='+') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalComponentInterface.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DECINT(); 

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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:5838:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalComponentInterface.g:5838:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalComponentInterface.g:5838:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt11=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt11=2;
                }
                break;
            case '-':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:5838:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5838:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalComponentInterface.g:5838:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalComponentInterface.g:5838:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:5838:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalComponentInterface.g:5838:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComponentInterface.g:5838:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            // InternalComponentInterface.g:5840:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalComponentInterface.g:5840:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalComponentInterface.g:5840:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='1' && LA12_0<='3')) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='9')) ) {
                    alt12=2;
                }
                else {
                    alt12=1;}
            }
            else if ( ((LA12_0>='4' && LA12_0<='9')) ) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:5840:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5840:31: '1' .. '3' '0' .. '9'
                    {
                    matchRange('1','3'); 
                    matchRange('0','9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            // InternalComponentInterface.g:5842:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalComponentInterface.g:5842:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalComponentInterface.g:5842:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='1') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='2')) ) {
                    alt13=2;
                }
                else {
                    alt13=1;}
            }
            else if ( ((LA13_0>='2' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:5842:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5842:33: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            // InternalComponentInterface.g:5844:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalComponentInterface.g:5844:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','2'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_HOUR"
    public final void mRULE_HOUR() throws RecognitionException {
        try {
            // InternalComponentInterface.g:5846:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalComponentInterface.g:5846:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalComponentInterface.g:5846:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='0' && LA14_0<='1')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='2') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:5846:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5846:41: '2' '0' .. '3'
                    {
                    match('2'); 
                    matchRange('0','3'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOUR"

    // $ANTLR start "RULE_MIN_SEC"
    public final void mRULE_MIN_SEC() throws RecognitionException {
        try {
            // InternalComponentInterface.g:5848:23: ( '0' .. '5' '0' .. '9' )
            // InternalComponentInterface.g:5848:25: '0' .. '5' '0' .. '9'
            {
            matchRange('0','5'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN_SEC"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:5850:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalComponentInterface.g:5850:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
            {
            mRULE_YEAR(); 
            match('-'); 
            mRULE_MONTH(); 
            match('-'); 
            mRULE_DAY(); 
            match('T'); 
            mRULE_HOUR(); 
            match(':'); 
            mRULE_MIN_SEC(); 
            match(':'); 
            mRULE_MIN_SEC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:5852:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalComponentInterface.g:5852:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalComponentInterface.g:5852:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:5852:11: '^'
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

            // InternalComponentInterface.g:5852:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComponentInterface.g:
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
            	    break loop16;
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
            // InternalComponentInterface.g:5854:10: ( ( '0' .. '9' )+ )
            // InternalComponentInterface.g:5854:12: ( '0' .. '9' )+
            {
            // InternalComponentInterface.g:5854:12: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentInterface.g:5854:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalComponentInterface.g:5856:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalComponentInterface.g:5856:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalComponentInterface.g:5856:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:5856:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalComponentInterface.g:5856:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalComponentInterface.g:5856:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComponentInterface.g:5856:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:5856:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalComponentInterface.g:5856:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalComponentInterface.g:5856:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComponentInterface.g:5856:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop19;
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
            // InternalComponentInterface.g:5858:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalComponentInterface.g:5858:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalComponentInterface.g:5858:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentInterface.g:5858:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
            // InternalComponentInterface.g:5860:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalComponentInterface.g:5860:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalComponentInterface.g:5860:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentInterface.g:5860:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // InternalComponentInterface.g:5860:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:5860:41: ( '\\r' )? '\\n'
                    {
                    // InternalComponentInterface.g:5860:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalComponentInterface.g:5860:41: '\\r'
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
            // InternalComponentInterface.g:5862:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalComponentInterface.g:5862:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalComponentInterface.g:5862:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponentInterface.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // InternalComponentInterface.g:5864:16: ( . )
            // InternalComponentInterface.g:5864:18: .
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
        // InternalComponentInterface.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=40;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalComponentInterface.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalComponentInterface.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalComponentInterface.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalComponentInterface.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalComponentInterface.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalComponentInterface.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalComponentInterface.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalComponentInterface.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalComponentInterface.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalComponentInterface.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalComponentInterface.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalComponentInterface.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalComponentInterface.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalComponentInterface.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalComponentInterface.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalComponentInterface.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalComponentInterface.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalComponentInterface.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalComponentInterface.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalComponentInterface.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalComponentInterface.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalComponentInterface.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalComponentInterface.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalComponentInterface.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalComponentInterface.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalComponentInterface.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalComponentInterface.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalComponentInterface.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalComponentInterface.g:1:178: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 30 :
                // InternalComponentInterface.g:1:190: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 31 :
                // InternalComponentInterface.g:1:203: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 32 :
                // InternalComponentInterface.g:1:215: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 33 :
                // InternalComponentInterface.g:1:227: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 34 :
                // InternalComponentInterface.g:1:242: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalComponentInterface.g:1:250: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalComponentInterface.g:1:259: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalComponentInterface.g:1:271: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalComponentInterface.g:1:287: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalComponentInterface.g:1:303: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalComponentInterface.g:1:311: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA8_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "5836:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\30\1\uffff\1\30\1\uffff\3\30\1\uffff\1\30\1\45\2\30\1\45\1\26\1\45\1\26\1\uffff\3\26\2\uffff\1\30\2\uffff\1\30\1\62\1\uffff\4\30\1\uffff\1\30\1\uffff\1\71\2\uffff\2\30\3\45\4\uffff\2\30\1\uffff\5\30\1\71\1\uffff\2\30\2\45\1\30\1\116\11\30\1\71\1\136\1\30\1\45\1\30\1\uffff\15\30\1\156\2\uffff\1\136\16\30\1\uffff\37\30\1\u009d\13\30\1\u00aa\1\u00ab\1\30\1\uffff\14\30\2\uffff\1\30\1\u00bb\15\30\1\uffff\1\u00ca\1\u00cc\7\30\1\u00d4\1\u00d5\2\30\1\u00d8\1\uffff\1\u00d9\1\uffff\1\u00db\1\u00dc\1\u00dd\4\30\2\uffff\1\u00e2\1\30\2\uffff\1\u00e4\3\uffff\4\30\1\uffff\1\30\1\uffff\2\30\1\u00ed\1\u00ef\1\30\1\u00f1\1\u00f2\1\u00f3\1\uffff\1\u00f4\1\uffff\1\30\4\uffff\1\u00f6\1\uffff";
    static final String DFA26_eofS =
        "\u00f7\uffff";
    static final String DFA26_minS =
        "\1\0\1\157\1\uffff\1\141\1\uffff\1\141\1\162\1\145\1\uffff\1\141\1\56\1\162\1\141\1\56\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\155\2\uffff\1\155\1\60\1\uffff\1\155\1\157\1\163\1\146\1\uffff\1\154\1\uffff\1\60\2\uffff\1\165\1\154\3\56\4\uffff\1\160\1\145\1\uffff\1\145\1\155\1\101\1\103\1\165\1\60\1\uffff\1\145\1\163\2\56\1\157\1\60\1\123\1\122\1\141\1\145\1\143\1\141\1\145\1\154\1\145\1\55\1\60\1\145\1\55\1\156\1\uffff\1\160\1\157\1\142\1\162\1\142\1\166\1\162\1\164\1\142\1\162\1\142\1\162\1\151\1\60\2\uffff\1\60\1\145\1\141\1\163\1\154\1\141\1\163\1\103\1\166\1\151\1\154\1\141\1\163\1\166\1\145\1\uffff\1\156\1\143\1\116\1\151\1\155\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\143\1\145\1\156\1\164\1\145\1\157\1\163\1\145\2\162\1\151\1\143\1\156\1\163\1\145\2\162\1\164\1\111\1\60\1\144\1\150\1\164\1\151\1\166\2\145\1\103\1\150\1\164\1\151\2\60\1\156\1\uffff\3\145\1\142\1\145\1\156\1\103\1\145\1\154\2\145\1\142\2\uffff\1\164\1\60\2\162\1\145\1\162\1\164\1\145\1\154\1\162\1\151\2\162\2\145\1\uffff\2\60\1\162\2\163\1\162\1\151\1\166\1\145\2\60\2\162\1\60\1\uffff\1\60\1\uffff\3\60\1\166\2\145\1\156\2\uffff\1\60\1\146\2\uffff\1\60\3\uffff\1\145\1\156\1\162\1\164\1\uffff\1\141\1\uffff\1\162\1\164\2\60\1\143\3\60\1\uffff\1\60\1\uffff\1\145\4\uffff\1\60\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\157\1\uffff\1\163\1\uffff\1\141\1\162\1\157\1\uffff\1\141\1\145\1\162\1\141\1\145\1\71\1\145\1\172\1\uffff\2\uffff\1\57\2\uffff\1\155\2\uffff\1\155\1\172\1\uffff\1\155\1\157\1\163\1\146\1\uffff\1\154\1\uffff\1\71\2\uffff\1\165\1\154\3\145\4\uffff\1\160\1\145\1\uffff\1\145\1\155\2\123\1\165\1\71\1\uffff\1\145\1\163\2\145\1\157\1\172\1\123\1\122\2\165\1\143\2\165\1\154\1\145\1\55\1\172\2\145\1\156\1\uffff\1\160\1\157\1\142\1\162\1\142\1\166\1\162\1\164\1\142\1\162\1\142\1\162\1\151\1\172\2\uffff\1\172\1\145\1\141\1\163\1\154\1\141\1\163\1\123\1\166\1\151\1\154\1\141\1\163\1\166\1\145\1\uffff\1\156\1\143\1\116\1\151\1\155\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\143\1\145\1\156\1\164\1\145\1\157\1\163\1\145\2\162\1\151\1\143\1\156\1\163\1\145\2\162\1\164\1\111\1\172\1\144\1\150\1\164\1\151\1\166\2\145\1\123\1\150\1\164\1\151\2\172\1\156\1\uffff\3\145\1\142\1\145\1\156\1\123\1\145\1\154\2\145\1\142\2\uffff\1\164\1\172\2\162\1\145\1\162\1\164\1\145\1\154\1\162\1\151\2\162\2\145\1\uffff\2\172\1\162\2\163\1\162\1\151\1\166\1\145\2\172\2\162\1\172\1\uffff\1\172\1\uffff\3\172\1\166\2\145\1\156\2\uffff\1\172\1\146\2\uffff\1\172\3\uffff\1\145\1\156\1\162\1\164\1\uffff\1\141\1\uffff\1\162\1\164\2\172\1\143\3\172\1\uffff\1\172\1\uffff\1\145\4\uffff\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\3\uffff\1\10\10\uffff\1\42\3\uffff\1\47\1\50\1\uffff\1\42\1\2\2\uffff\1\4\4\uffff\1\10\1\uffff\1\35\1\uffff\1\40\1\37\5\uffff\1\44\1\45\1\46\1\47\2\uffff\1\21\6\uffff\1\43\24\uffff\1\3\16\uffff\1\41\1\36\17\uffff\1\34\56\uffff\1\5\14\uffff\1\25\1\27\17\uffff\1\6\16\uffff\1\17\1\uffff\1\32\7\uffff\1\20\1\33\2\uffff\1\7\1\16\1\uffff\1\22\1\12\1\13\4\uffff\1\23\1\uffff\1\11\10\uffff\1\30\1\uffff\1\31\1\uffff\1\24\1\26\1\14\1\15\1\uffff\1\1";
    static final String DFA26_specialS =
        "\1\0\21\uffff\1\2\1\1\u00e3\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\4\26\1\10\1\16\1\26\1\24\1\12\2\15\7\17\7\26\2\21\1\1\2\21\1\6\7\21\1\5\3\21\1\7\10\21\3\26\1\20\1\21\1\26\5\21\1\14\7\21\1\3\5\21\1\13\1\21\1\11\4\21\1\2\1\26\1\4\uff82\26",
            "\1\27",
            "",
            "\1\32\21\uffff\1\33",
            "",
            "\1\35",
            "\1\36",
            "\1\40\11\uffff\1\37",
            "",
            "\1\42",
            "\1\46\1\uffff\12\44\10\uffff\1\43\2\uffff\1\46\34\uffff\1\43\2\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\46\1\uffff\12\51\13\uffff\1\46\37\uffff\1\46",
            "\12\52",
            "\1\46\1\uffff\12\53\13\uffff\1\46\37\uffff\1\46",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\0\54",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\60",
            "",
            "",
            "\1\61",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "",
            "\12\70",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\46\1\uffff\12\74\13\uffff\1\46\37\uffff\1\46",
            "\1\46\1\uffff\12\75\13\uffff\1\46\37\uffff\1\46",
            "\1\46\1\uffff\12\53\13\uffff\1\46\37\uffff\1\46",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\104\16\uffff\1\102\2\uffff\1\103",
            "\1\107\14\uffff\1\105\2\uffff\1\106",
            "\1\110",
            "\12\111",
            "",
            "\1\112",
            "\1\113",
            "\1\46\1\uffff\12\114\13\uffff\1\46\37\uffff\1\46",
            "\1\46\1\uffff\12\75\13\uffff\1\46\37\uffff\1\46",
            "\1\115",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\117",
            "\1\120",
            "\1\122\23\uffff\1\121",
            "\1\125\14\uffff\1\124\2\uffff\1\123",
            "\1\126",
            "\1\130\23\uffff\1\127",
            "\1\132\17\uffff\1\131",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\137",
            "\1\135\1\46\1\uffff\12\53\13\uffff\1\46\37\uffff\1\46",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\166\17\uffff\1\165",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
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
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\17\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\17\uffff\1\u00b3",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\u00ba",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\u00c9\7\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\u00cb\7\30",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00d6",
            "\1\u00d7",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\u00da\7\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00e3",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\u00ec\7\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\u00ee\7\30",
            "\1\u00f0",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00f5",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='C') ) {s = 1;}

                        else if ( (LA26_0=='{') ) {s = 2;}

                        else if ( (LA26_0=='n') ) {s = 3;}

                        else if ( (LA26_0=='}') ) {s = 4;}

                        else if ( (LA26_0=='N') ) {s = 5;}

                        else if ( (LA26_0=='F') ) {s = 6;}

                        else if ( (LA26_0=='R') ) {s = 7;}

                        else if ( (LA26_0==',') ) {s = 8;}

                        else if ( (LA26_0=='v') ) {s = 9;}

                        else if ( (LA26_0=='0') ) {s = 10;}

                        else if ( (LA26_0=='t') ) {s = 11;}

                        else if ( (LA26_0=='f') ) {s = 12;}

                        else if ( ((LA26_0>='1' && LA26_0<='2')) ) {s = 13;}

                        else if ( (LA26_0=='-') ) {s = 14;}

                        else if ( ((LA26_0>='3' && LA26_0<='9')) ) {s = 15;}

                        else if ( (LA26_0=='^') ) {s = 16;}

                        else if ( ((LA26_0>='A' && LA26_0<='B')||(LA26_0>='D' && LA26_0<='E')||(LA26_0>='G' && LA26_0<='M')||(LA26_0>='O' && LA26_0<='Q')||(LA26_0>='S' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='e')||(LA26_0>='g' && LA26_0<='m')||(LA26_0>='o' && LA26_0<='s')||LA26_0=='u'||(LA26_0>='w' && LA26_0<='z')) ) {s = 17;}

                        else if ( (LA26_0=='\"') ) {s = 18;}

                        else if ( (LA26_0=='\'') ) {s = 19;}

                        else if ( (LA26_0=='/') ) {s = 20;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 21;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='!'||(LA26_0>='#' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='+')||LA26_0=='.'||(LA26_0>=':' && LA26_0<='@')||(LA26_0>='[' && LA26_0<=']')||LA26_0=='`'||LA26_0=='|'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_19 = input.LA(1);

                        s = -1;
                        if ( ((LA26_19>='\u0000' && LA26_19<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_18 = input.LA(1);

                        s = -1;
                        if ( ((LA26_18>='\u0000' && LA26_18<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}