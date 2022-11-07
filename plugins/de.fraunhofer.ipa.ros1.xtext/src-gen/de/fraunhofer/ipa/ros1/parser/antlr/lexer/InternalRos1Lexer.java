package de.fraunhofer.ipa.ros1.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos1Lexer extends Lexer {
    public static final int RULE_END=20;
    public static final int RULE_BEGIN=19;
    public static final int Node=13;
    public static final int RULE_STRING=24;
    public static final int RULE_SL_COMMENT=21;
    public static final int Comma=14;
    public static final int RULE_ROS_CONVENTION_A=23;
    public static final int Publishers=9;
    public static final int RULE_ROS_CONVENTION_PARAM=25;
    public static final int Dependencies=5;
    public static final int Colon=15;
    public static final int RightCurlyBracket=18;
    public static final int EOF=-1;
    public static final int RightSquareBracket=17;
    public static final int FromGitRepo=6;
    public static final int ExternalDependency=4;
    public static final int Parameters=8;
    public static final int RULE_ID=22;
    public static final int RULE_WS=28;
    public static final int RULE_ANY_OTHER=29;
    public static final int Artifacts=10;
    public static final int Node_1=11;
    public static final int Type=12;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=27;
    public static final int LeftSquareBracket=16;
    public static final int Subscribers=7;

    // delegates
    // delegators

    public InternalRos1Lexer() {;} 
    public InternalRos1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRos1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRos1Lexer.g"; }

    // $ANTLR start "ExternalDependency"
    public final void mExternalDependency() throws RecognitionException {
        try {
            int _type = ExternalDependency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:14:20: ( 'ExternalDependency' )
            // InternalRos1Lexer.g:14:22: 'ExternalDependency'
            {
            match("ExternalDependency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExternalDependency"

    // $ANTLR start "Dependencies"
    public final void mDependencies() throws RecognitionException {
        try {
            int _type = Dependencies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:16:14: ( 'dependencies:' )
            // InternalRos1Lexer.g:16:16: 'dependencies:'
            {
            match("dependencies:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dependencies"

    // $ANTLR start "FromGitRepo"
    public final void mFromGitRepo() throws RecognitionException {
        try {
            int _type = FromGitRepo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:18:13: ( 'fromGitRepo:' )
            // InternalRos1Lexer.g:18:15: 'fromGitRepo:'
            {
            match("fromGitRepo:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromGitRepo"

    // $ANTLR start "Subscribers"
    public final void mSubscribers() throws RecognitionException {
        try {
            int _type = Subscribers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:20:13: ( 'subscribers:' )
            // InternalRos1Lexer.g:20:15: 'subscribers:'
            {
            match("subscribers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subscribers"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:22:12: ( 'parameters:' )
            // InternalRos1Lexer.g:22:14: 'parameters:'
            {
            match("parameters:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Publishers"
    public final void mPublishers() throws RecognitionException {
        try {
            int _type = Publishers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:24:12: ( 'publishers:' )
            // InternalRos1Lexer.g:24:14: 'publishers:'
            {
            match("publishers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Publishers"

    // $ANTLR start "Artifacts"
    public final void mArtifacts() throws RecognitionException {
        try {
            int _type = Artifacts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:26:11: ( 'artifacts:' )
            // InternalRos1Lexer.g:26:13: 'artifacts:'
            {
            match("artifacts:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Artifacts"

    // $ANTLR start "Node_1"
    public final void mNode_1() throws RecognitionException {
        try {
            int _type = Node_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:28:8: ( 'node:' )
            // InternalRos1Lexer.g:28:10: 'node:'
            {
            match("node:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node_1"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:30:6: ( 'type:' )
            // InternalRos1Lexer.g:30:8: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:32:6: ( 'node' )
            // InternalRos1Lexer.g:32:8: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:34:7: ( ',' )
            // InternalRos1Lexer.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:36:7: ( ':' )
            // InternalRos1Lexer.g:36:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:38:19: ( '[' )
            // InternalRos1Lexer.g:38:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:40:20: ( ']' )
            // InternalRos1Lexer.g:40:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:42:19: ( '}' )
            // InternalRos1Lexer.g:42:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:44:21: ()
            // InternalRos1Lexer.g:44:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:46:19: ()
            // InternalRos1Lexer.g:46:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:48:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRos1Lexer.g:48:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRos1Lexer.g:48:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRos1Lexer.g:48:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:50:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRos1Lexer.g:50:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRos1Lexer.g:50:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRos1Lexer.g:50:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos1Lexer.g:50:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

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
    // $ANTLR end "RULE_ROS_CONVENTION_A"

    // $ANTLR start "RULE_ROS_CONVENTION_PARAM"
    public final void mRULE_ROS_CONVENTION_PARAM() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:52:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRos1Lexer.g:52:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRos1Lexer.g:52:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt3=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt3=2;
                    }
                    break;
                case '~':
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalRos1Lexer.g:52:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos1Lexer.g:52:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRos1Lexer.g:52:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_PARAM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:54:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRos1Lexer.g:54:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRos1Lexer.g:54:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRos1Lexer.g:54:11: '^'
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

            // InternalRos1Lexer.g:54:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRos1Lexer.g:
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
            	    break loop5;
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
            // InternalRos1Lexer.g:56:10: ( ( '0' .. '9' )+ )
            // InternalRos1Lexer.g:56:12: ( '0' .. '9' )+
            {
            // InternalRos1Lexer.g:56:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRos1Lexer.g:56:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalRos1Lexer.g:58:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRos1Lexer.g:58:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRos1Lexer.g:58:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRos1Lexer.g:58:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRos1Lexer.g:58:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:58:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos1Lexer.g:58:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:58:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRos1Lexer.g:58:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:58:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos1Lexer.g:58:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalRos1Lexer.g:60:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRos1Lexer.g:60:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRos1Lexer.g:60:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRos1Lexer.g:60:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:62:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRos1Lexer.g:62:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRos1Lexer.g:62:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalRos1Lexer.g:
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
            // InternalRos1Lexer.g:64:16: ( . )
            // InternalRos1Lexer.g:64:18: .
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
        // InternalRos1Lexer.g:1:8: ( ExternalDependency | Dependencies | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | Node_1 | Type | Node | Comma | Colon | LeftSquareBracket | RightSquareBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRos1Lexer.g:1:10: ExternalDependency
                {
                mExternalDependency(); 

                }
                break;
            case 2 :
                // InternalRos1Lexer.g:1:29: Dependencies
                {
                mDependencies(); 

                }
                break;
            case 3 :
                // InternalRos1Lexer.g:1:42: FromGitRepo
                {
                mFromGitRepo(); 

                }
                break;
            case 4 :
                // InternalRos1Lexer.g:1:54: Subscribers
                {
                mSubscribers(); 

                }
                break;
            case 5 :
                // InternalRos1Lexer.g:1:66: Parameters
                {
                mParameters(); 

                }
                break;
            case 6 :
                // InternalRos1Lexer.g:1:77: Publishers
                {
                mPublishers(); 

                }
                break;
            case 7 :
                // InternalRos1Lexer.g:1:88: Artifacts
                {
                mArtifacts(); 

                }
                break;
            case 8 :
                // InternalRos1Lexer.g:1:98: Node_1
                {
                mNode_1(); 

                }
                break;
            case 9 :
                // InternalRos1Lexer.g:1:105: Type
                {
                mType(); 

                }
                break;
            case 10 :
                // InternalRos1Lexer.g:1:110: Node
                {
                mNode(); 

                }
                break;
            case 11 :
                // InternalRos1Lexer.g:1:115: Comma
                {
                mComma(); 

                }
                break;
            case 12 :
                // InternalRos1Lexer.g:1:121: Colon
                {
                mColon(); 

                }
                break;
            case 13 :
                // InternalRos1Lexer.g:1:127: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 14 :
                // InternalRos1Lexer.g:1:145: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 15 :
                // InternalRos1Lexer.g:1:164: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 16 :
                // InternalRos1Lexer.g:1:182: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalRos1Lexer.g:1:198: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 18 :
                // InternalRos1Lexer.g:1:220: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 19 :
                // InternalRos1Lexer.g:1:246: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalRos1Lexer.g:1:254: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalRos1Lexer.g:1:263: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalRos1Lexer.g:1:275: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalRos1Lexer.g:1:291: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalRos1Lexer.g:1:299: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\22\10\32\6\uffff\2\30\1\32\1\uffff\3\30\3\uffff\1\32\1\uffff\11\32\10\uffff\1\32\2\uffff\1\77\2\uffff\1\77\2\uffff\11\32\3\uffff\7\32\1\122\10\32\3\uffff\42\32\1\uffff\4\32\2\uffff\2\32\2\uffff\1\32\1\uffff\4\32\1\u0088\1\uffff";
    static final String DFA12_eofS =
        "\u0089\uffff";
    static final String DFA12_minS =
        "\1\0\10\57\6\uffff\1\42\1\101\1\57\1\uffff\2\0\1\42\3\uffff\1\57\1\uffff\11\57\10\uffff\1\57\2\0\1\57\2\0\1\57\2\uffff\11\57\1\0\1\uffff\1\0\20\57\3\uffff\42\57\1\uffff\4\57\2\uffff\2\57\2\uffff\1\57\1\uffff\5\57\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\10\172\6\uffff\3\172\1\uffff\2\uffff\1\47\3\uffff\1\172\1\uffff\11\172\10\uffff\1\172\2\uffff\1\57\2\uffff\1\57\2\uffff\11\172\1\uffff\1\uffff\1\uffff\20\172\3\uffff\42\172\1\uffff\4\172\2\uffff\2\172\2\uffff\1\172\1\uffff\5\172\1\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\13\1\14\1\15\1\16\1\17\1\20\3\uffff\1\21\3\uffff\1\24\1\27\1\30\1\uffff\1\23\11\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\26\1\22\7\uffff\1\24\1\27\12\uffff\1\25\21\uffff\1\10\1\12\1\11\42\uffff\1\7\4\uffff\1\5\1\6\2\uffff\1\3\1\4\1\uffff\1\2\5\uffff\1\1";
    static final String DFA12_specialS =
        "\1\10\22\uffff\1\6\1\7\30\uffff\1\4\1\1\1\uffff\1\5\1\3\14\uffff\1\0\1\uffff\1\2\110\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\23\1\16\3\30\1\24\4\30\1\11\2\30\1\17\12\26\1\12\6\30\4\21\1\1\25\21\1\13\1\30\1\14\1\20\1\21\1\30\1\6\2\21\1\2\1\21\1\3\7\21\1\7\1\21\1\5\2\21\1\4\1\10\6\21\2\30\1\15\1\25\uff81\30",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\27\33\1\31\2\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\34\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\35\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\24\33\1\36\5\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\37\23\33\1\40\5\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\41\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\42\13\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\30\33\1\43\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\4\uffff\1\53\2\uffff\1\52\26\uffff\32\22\3\uffff\2\22\1\uffff\32\22",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\42\56\1\57\71\56\1\55\uffa3\56",
            "\47\61\1\62\64\61\1\60\uffa3\61",
            "\1\53\4\uffff\1\53",
            "",
            "",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\65\6\33",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\17\33\1\66\12\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\67\13\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\70\30\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\71\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\72\30\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\73\6\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\3\33\1\74\26\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\17\33\1\75\12\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\0\76",
            "\42\56\1\57\71\56\1\55\uffa3\56",
            "\1\53",
            "\0\100",
            "\47\61\1\62\64\61\1\60\uffa3\61",
            "\1\53",
            "",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\101\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\102\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\103\15\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\104\7\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\105\31\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\106\16\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\107\21\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\110\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\111\25\33",
            "\42\56\1\57\71\56\1\55\uffa3\56",
            "",
            "\47\61\1\62\64\61\1\60\uffa3\61",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\112\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\113\14\33",
            "\1\22\12\33\7\uffff\6\33\1\114\23\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\115\27\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\116\15\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\117\21\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\120\24\33",
            "\1\22\12\33\1\121\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\1\123\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\124\14\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\3\33\1\125\26\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\126\21\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\127\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\130\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\131\7\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\132\31\33",
            "",
            "",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\133\31\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\134\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\135\6\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\136\21\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\137\6\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\7\33\1\140\22\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\141\27\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\142\16\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\143\14\33",
            "\1\22\12\33\7\uffff\21\33\1\144\10\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\145\30\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\146\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\147\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\150\6\33",
            "\1\22\12\33\7\uffff\3\33\1\151\26\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\152\27\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\153\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\154\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\155\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\156\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\157\7\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\160\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\161\21\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\17\33\1\162\12\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\163\10\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\164\7\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\165\7\33",
            "\1\22\12\33\1\166\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\17\33\1\167\12\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\170\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\171\13\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\172\7\33",
            "\1\22\12\33\1\173\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\1\174\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\175\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\176\7\33",
            "\1\22\12\33\1\177\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\22\12\33\1\u0080\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\u0081\14\33",
            "\1\22\12\33\1\u0082\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\3\33\1\u0083\26\33",
            "",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\u0084\25\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\u0085\14\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\u0086\27\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\30\33\1\u0087\1\33",
            "\1\22\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( ExternalDependency | Dependencies | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | Node_1 | Type | Node | Comma | Colon | LeftSquareBracket | RightSquareBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='\"') ) {s = 47;}

                        else if ( (LA12_62=='\\') ) {s = 45;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='!')||(LA12_62>='#' && LA12_62<='[')||(LA12_62>=']' && LA12_62<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='\"') ) {s = 47;}

                        else if ( (LA12_46=='\\') ) {s = 45;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='!')||(LA12_46>='#' && LA12_46<='[')||(LA12_46>=']' && LA12_46<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='\'') ) {s = 50;}

                        else if ( (LA12_64=='\\') ) {s = 48;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='&')||(LA12_64>='(' && LA12_64<='[')||(LA12_64>=']' && LA12_64<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='\'') ) {s = 50;}

                        else if ( (LA12_49=='\\') ) {s = 48;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='&')||(LA12_49>='(' && LA12_49<='[')||(LA12_49>=']' && LA12_49<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( ((LA12_45>='\u0000' && LA12_45<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( ((LA12_48>='\u0000' && LA12_48<='\uFFFF')) ) {s = 64;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='\\') ) {s = 45;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='!')||(LA12_19>='#' && LA12_19<='[')||(LA12_19>=']' && LA12_19<='\uFFFF')) ) {s = 46;}

                        else if ( (LA12_19=='\"') ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( (LA12_20=='\\') ) {s = 48;}

                        else if ( ((LA12_20>='\u0000' && LA12_20<='&')||(LA12_20>='(' && LA12_20<='[')||(LA12_20>=']' && LA12_20<='\uFFFF')) ) {s = 49;}

                        else if ( (LA12_20=='\'') ) {s = 50;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='E') ) {s = 1;}

                        else if ( (LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='f') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='a') ) {s = 6;}

                        else if ( (LA12_0=='n') ) {s = 7;}

                        else if ( (LA12_0=='t') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='[') ) {s = 11;}

                        else if ( (LA12_0==']') ) {s = 12;}

                        else if ( (LA12_0=='}') ) {s = 13;}

                        else if ( (LA12_0=='#') ) {s = 14;}

                        else if ( (LA12_0=='/') ) {s = 15;}

                        else if ( (LA12_0=='^') ) {s = 16;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='m')||LA12_0=='o'||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='z')) ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='~') ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 23;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='|')||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 24;}

                        else s = 18;

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