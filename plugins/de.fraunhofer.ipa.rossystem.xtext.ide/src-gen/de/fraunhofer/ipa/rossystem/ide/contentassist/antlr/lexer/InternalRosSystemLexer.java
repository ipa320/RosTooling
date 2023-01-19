package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemLexer extends Lexer {
    public static final int RULE_BEGIN=31;
    public static final int RULE_DAY=39;
    public static final int RULE_DATE_TIME=44;
    public static final int RULE_BOOLEAN=36;
    public static final int RelativeNamespace=4;
    public static final int String=16;
    public static final int RULE_YEAR=41;
    public static final int Name=24;
    public static final int RULE_MIN_SEC=43;
    public static final int ParameterAny=7;
    public static final int List=23;
    public static final int Boolean=11;
    public static final int PrivateNamespace=5;
    public static final int GraphName=8;
    public static final int RULE_ID=45;
    public static final int RULE_DIGIT=34;
    public static final int GlobalNamespace=6;
    public static final int Double=15;
    public static final int RULE_INT=46;
    public static final int Value=21;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_END=32;
    public static final int Base64=14;
    public static final int NameSpace=9;
    public static final int RULE_STRING=47;
    public static final int Any=26;
    public static final int Struct=17;
    public static final int RULE_SL_COMMENT=33;
    public static final int Comma=27;
    public static final int RULE_DOUBLE=38;
    public static final int Parts=20;
    public static final int Colon=28;
    public static final int RightCurlyBracket=30;
    public static final int RULE_DECINT=37;
    public static final int EOF=-1;
    public static final int RULE_HOUR=42;
    public static final int RULE_WS=49;
    public static final int LeftCurlyBracket=29;
    public static final int From=19;
    public static final int RULE_ANY_OTHER=50;
    public static final int Default=13;
    public static final int Date=22;
    public static final int Integer=12;
    public static final int Array=18;
    public static final int Type=25;
    public static final int Parameter=10;
    public static final int RULE_MONTH=40;
    public static final int RULE_BINARY=35;

    // delegates
    // delegators

    public InternalRosSystemLexer() {;} 
    public InternalRosSystemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRosSystemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRosSystemLexer.g"; }

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:14:19: ( 'RelativeNamespace' )
            // InternalRosSystemLexer.g:14:21: 'RelativeNamespace'
            {
            match("RelativeNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RelativeNamespace"

    // $ANTLR start "PrivateNamespace"
    public final void mPrivateNamespace() throws RecognitionException {
        try {
            int _type = PrivateNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:16:18: ( 'PrivateNamespace' )
            // InternalRosSystemLexer.g:16:20: 'PrivateNamespace'
            {
            match("PrivateNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PrivateNamespace"

    // $ANTLR start "GlobalNamespace"
    public final void mGlobalNamespace() throws RecognitionException {
        try {
            int _type = GlobalNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:18:17: ( 'GlobalNamespace' )
            // InternalRosSystemLexer.g:18:19: 'GlobalNamespace'
            {
            match("GlobalNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GlobalNamespace"

    // $ANTLR start "ParameterAny"
    public final void mParameterAny() throws RecognitionException {
        try {
            int _type = ParameterAny;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:20:14: ( 'ParameterAny' )
            // InternalRosSystemLexer.g:20:16: 'ParameterAny'
            {
            match("ParameterAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterAny"

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:22:11: ( 'GraphName' )
            // InternalRosSystemLexer.g:22:13: 'GraphName'
            {
            match("GraphName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GraphName"

    // $ANTLR start "NameSpace"
    public final void mNameSpace() throws RecognitionException {
        try {
            int _type = NameSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:24:11: ( 'NameSpace' )
            // InternalRosSystemLexer.g:24:13: 'NameSpace'
            {
            match("NameSpace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NameSpace"

    // $ANTLR start "Parameter"
    public final void mParameter() throws RecognitionException {
        try {
            int _type = Parameter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:26:11: ( 'Parameter' )
            // InternalRosSystemLexer.g:26:13: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameter"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:28:9: ( 'Boolean' )
            // InternalRosSystemLexer.g:28:11: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:30:9: ( 'Integer' )
            // InternalRosSystemLexer.g:30:11: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:32:9: ( 'default' )
            // InternalRosSystemLexer.g:32:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Base64"
    public final void mBase64() throws RecognitionException {
        try {
            int _type = Base64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:34:8: ( 'Base64' )
            // InternalRosSystemLexer.g:34:10: 'Base64'
            {
            match("Base64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Base64"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:36:8: ( 'Double' )
            // InternalRosSystemLexer.g:36:10: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:38:8: ( 'String' )
            // InternalRosSystemLexer.g:38:10: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Struct"
    public final void mStruct() throws RecognitionException {
        try {
            int _type = Struct;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:40:8: ( 'Struct' )
            // InternalRosSystemLexer.g:40:10: 'Struct'
            {
            match("Struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Struct"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:42:7: ( 'Array' )
            // InternalRosSystemLexer.g:42:9: 'Array'
            {
            match("Array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:44:6: ( 'from:' )
            // InternalRosSystemLexer.g:44:8: 'from:'
            {
            match("from:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Parts"
    public final void mParts() throws RecognitionException {
        try {
            int _type = Parts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:46:7: ( 'parts' )
            // InternalRosSystemLexer.g:46:9: 'parts'
            {
            match("parts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parts"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:48:7: ( 'value' )
            // InternalRosSystemLexer.g:48:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:50:6: ( 'Date' )
            // InternalRosSystemLexer.g:50:8: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "List"
    public final void mList() throws RecognitionException {
        try {
            int _type = List;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:52:6: ( 'List' )
            // InternalRosSystemLexer.g:52:8: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:54:6: ( 'name' )
            // InternalRosSystemLexer.g:54:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:56:6: ( 'type' )
            // InternalRosSystemLexer.g:56:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:58:5: ( 'Any' )
            // InternalRosSystemLexer.g:58:7: 'Any'
            {
            match("Any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Any"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:60:7: ( ',' )
            // InternalRosSystemLexer.g:60:9: ','
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
            // InternalRosSystemLexer.g:62:7: ( ':' )
            // InternalRosSystemLexer.g:62:9: ':'
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

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:64:18: ( '{' )
            // InternalRosSystemLexer.g:64:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:66:19: ( '}' )
            // InternalRosSystemLexer.g:66:21: '}'
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
            // InternalRosSystemLexer.g:68:21: ()
            // InternalRosSystemLexer.g:68:23: 
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
            // InternalRosSystemLexer.g:70:19: ()
            // InternalRosSystemLexer.g:70:21: 
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
            // InternalRosSystemLexer.g:72:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosSystemLexer.g:72:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosSystemLexer.g:72:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRosSystemLexer.g:72:23: ~ ( ( '\\n' | '\\r' ) )
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:74:21: ( '0' .. '9' )
            // InternalRosSystemLexer.g:74:23: '0' .. '9'
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
            // InternalRosSystemLexer.g:76:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystemLexer.g:76:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystemLexer.g:76:15: ( '0b' | '0B' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='b') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='B') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystemLexer.g:76:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:76:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosSystemLexer.g:76:27: ( '0' | '1' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='1')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
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
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:78:14: ( ( 'true' | 'false' ) )
            // InternalRosSystemLexer.g:78:16: ( 'true' | 'false' )
            {
            // InternalRosSystemLexer.g:78:16: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystemLexer.g:78:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:78:24: 'false'
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
            // InternalRosSystemLexer.g:80:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalRosSystemLexer.g:80:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalRosSystemLexer.g:80:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalRosSystemLexer.g:80:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalRosSystemLexer.g:80:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:80:32: RULE_DIGIT
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
                case 2 :
                    // InternalRosSystemLexer.g:80:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalRosSystemLexer.g:80:44: ( '.' ( RULE_DIGIT )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRosSystemLexer.g:80:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystemLexer.g:80:49: ( RULE_DIGIT )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalRosSystemLexer.g:80:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
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

                    // InternalRosSystemLexer.g:80:73: ( '-' | '+' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='0') ) {
                            alt8=1;
                        }
                        else if ( (LA8_1=='-'||(LA8_1>='1' && LA8_1<='9')) ) {
                            alt8=1;
                        }
                    }
                    else if ( (LA8_0=='+') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRosSystemLexer.g:
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
            // InternalRosSystemLexer.g:82:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:82:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:82:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt12=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt12=1;
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
                alt12=2;
                }
                break;
            case '-':
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRosSystemLexer.g:82:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:82:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystemLexer.g:82:29: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:82:29: RULE_DIGIT
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
                case 3 :
                    // InternalRosSystemLexer.g:82:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosSystemLexer.g:82:54: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:82:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
            // InternalRosSystemLexer.g:84:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystemLexer.g:84:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystemLexer.g:84:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='1' && LA13_0<='3')) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='9')) ) {
                    alt13=2;
                }
                else {
                    alt13=1;}
            }
            else if ( ((LA13_0>='4' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosSystemLexer.g:84:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:84:31: '1' .. '3' '0' .. '9'
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
            // InternalRosSystemLexer.g:86:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystemLexer.g:86:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystemLexer.g:86:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='1') ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>='0' && LA14_1<='2')) ) {
                    alt14=2;
                }
                else {
                    alt14=1;}
            }
            else if ( ((LA14_0>='2' && LA14_0<='9')) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystemLexer.g:86:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:86:33: '1' '0' .. '2'
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
            // InternalRosSystemLexer.g:88:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystemLexer.g:88:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosSystemLexer.g:90:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystemLexer.g:90:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystemLexer.g:90:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='0' && LA15_0<='1')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='2') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystemLexer.g:90:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:90:41: '2' '0' .. '3'
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
            // InternalRosSystemLexer.g:92:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystemLexer.g:92:25: '0' .. '5' '0' .. '9'
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
            // InternalRosSystemLexer.g:94:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystemLexer.g:94:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosSystemLexer.g:96:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystemLexer.g:96:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystemLexer.g:96:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystemLexer.g:96:11: '^'
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

            // InternalRosSystemLexer.g:96:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
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
            	    break loop17;
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
            // InternalRosSystemLexer.g:98:10: ( ( '0' .. '9' )+ )
            // InternalRosSystemLexer.g:98:12: ( '0' .. '9' )+
            {
            // InternalRosSystemLexer.g:98:12: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRosSystemLexer.g:98:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalRosSystemLexer.g:100:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystemLexer.g:100:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystemLexer.g:100:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystemLexer.g:100:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystemLexer.g:100:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:100:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:100:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop19;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:100:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystemLexer.g:100:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:100:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:100:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop20;
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
            // InternalRosSystemLexer.g:102:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystemLexer.g:102:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystemLexer.g:102:24: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystemLexer.g:102:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // InternalRosSystemLexer.g:104:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystemLexer.g:104:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystemLexer.g:104:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // InternalRosSystemLexer.g:106:16: ( . )
            // InternalRosSystemLexer.g:106:18: .
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
        // InternalRosSystemLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | NameSpace | Parameter | Boolean | Integer | Default | Base64 | Double | String | Struct | Array | From | Parts | Value | Date | List | Name | Type | Any | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=39;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalRosSystemLexer.g:1:10: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 2 :
                // InternalRosSystemLexer.g:1:28: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 3 :
                // InternalRosSystemLexer.g:1:45: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 4 :
                // InternalRosSystemLexer.g:1:61: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 5 :
                // InternalRosSystemLexer.g:1:74: GraphName
                {
                mGraphName(); 

                }
                break;
            case 6 :
                // InternalRosSystemLexer.g:1:84: NameSpace
                {
                mNameSpace(); 

                }
                break;
            case 7 :
                // InternalRosSystemLexer.g:1:94: Parameter
                {
                mParameter(); 

                }
                break;
            case 8 :
                // InternalRosSystemLexer.g:1:104: Boolean
                {
                mBoolean(); 

                }
                break;
            case 9 :
                // InternalRosSystemLexer.g:1:112: Integer
                {
                mInteger(); 

                }
                break;
            case 10 :
                // InternalRosSystemLexer.g:1:120: Default
                {
                mDefault(); 

                }
                break;
            case 11 :
                // InternalRosSystemLexer.g:1:128: Base64
                {
                mBase64(); 

                }
                break;
            case 12 :
                // InternalRosSystemLexer.g:1:135: Double
                {
                mDouble(); 

                }
                break;
            case 13 :
                // InternalRosSystemLexer.g:1:142: String
                {
                mString(); 

                }
                break;
            case 14 :
                // InternalRosSystemLexer.g:1:149: Struct
                {
                mStruct(); 

                }
                break;
            case 15 :
                // InternalRosSystemLexer.g:1:156: Array
                {
                mArray(); 

                }
                break;
            case 16 :
                // InternalRosSystemLexer.g:1:162: From
                {
                mFrom(); 

                }
                break;
            case 17 :
                // InternalRosSystemLexer.g:1:167: Parts
                {
                mParts(); 

                }
                break;
            case 18 :
                // InternalRosSystemLexer.g:1:173: Value
                {
                mValue(); 

                }
                break;
            case 19 :
                // InternalRosSystemLexer.g:1:179: Date
                {
                mDate(); 

                }
                break;
            case 20 :
                // InternalRosSystemLexer.g:1:184: List
                {
                mList(); 

                }
                break;
            case 21 :
                // InternalRosSystemLexer.g:1:189: Name
                {
                mName(); 

                }
                break;
            case 22 :
                // InternalRosSystemLexer.g:1:194: Type
                {
                mType(); 

                }
                break;
            case 23 :
                // InternalRosSystemLexer.g:1:199: Any
                {
                mAny(); 

                }
                break;
            case 24 :
                // InternalRosSystemLexer.g:1:203: Comma
                {
                mComma(); 

                }
                break;
            case 25 :
                // InternalRosSystemLexer.g:1:209: Colon
                {
                mColon(); 

                }
                break;
            case 26 :
                // InternalRosSystemLexer.g:1:215: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 27 :
                // InternalRosSystemLexer.g:1:232: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 28 :
                // InternalRosSystemLexer.g:1:250: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalRosSystemLexer.g:1:266: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 30 :
                // InternalRosSystemLexer.g:1:278: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 31 :
                // InternalRosSystemLexer.g:1:291: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 32 :
                // InternalRosSystemLexer.g:1:303: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 33 :
                // InternalRosSystemLexer.g:1:315: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 34 :
                // InternalRosSystemLexer.g:1:330: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalRosSystemLexer.g:1:338: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalRosSystemLexer.g:1:347: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalRosSystemLexer.g:1:359: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalRosSystemLexer.g:1:375: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalRosSystemLexer.g:1:383: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA9_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "80:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\20\42\5\uffff\2\100\1\40\1\100\1\40\1\uffff\3\40\2\uffff\1\42\1\uffff\26\42\6\uffff\1\140\2\uffff\3\100\3\uffff\16\42\1\162\10\42\1\140\1\uffff\2\100\13\42\1\u0088\3\42\1\uffff\4\42\1\u0090\1\u0091\1\u0092\1\u0093\1\140\1\100\13\42\1\uffff\2\42\1\u00a2\1\uffff\1\u0093\1\u00a3\1\u00a4\5\uffff\7\42\1\u00ac\2\42\1\u00af\1\u00b0\1\u00b1\3\uffff\6\42\1\u00b8\1\uffff\1\u00b9\1\u00ba\3\uffff\6\42\3\uffff\2\42\1\u00c4\1\42\1\u00c6\1\u00c7\3\42\1\uffff\1\42\2\uffff\6\42\1\u00d2\3\42\1\uffff\6\42\1\u00dc\1\42\1\u00de\1\uffff\1\u00df\2\uffff";
    static final String DFA24_eofS =
        "\u00e0\uffff";
    static final String DFA24_minS =
        "\1\0\1\145\1\141\1\154\2\141\1\156\1\145\1\141\1\164\1\156\3\141\1\151\1\141\1\162\5\uffff\2\56\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\154\1\uffff\1\151\1\162\1\157\1\141\1\155\1\157\1\163\1\164\1\146\1\165\1\164\2\162\1\171\1\157\1\154\1\162\1\154\1\163\1\155\1\160\1\165\6\uffff\1\60\2\uffff\3\56\3\uffff\1\141\1\166\1\141\1\142\1\160\1\145\1\154\2\145\1\141\1\142\1\145\1\151\1\141\1\60\1\155\1\163\1\164\1\165\1\164\3\145\1\60\1\uffff\2\56\1\164\1\141\1\155\1\141\1\150\1\123\1\145\1\66\1\147\1\165\1\154\1\60\1\156\1\143\1\171\1\uffff\1\72\1\145\1\163\1\145\4\60\2\55\1\151\1\164\1\145\1\154\1\116\1\160\1\141\1\64\1\145\1\154\1\145\1\uffff\1\147\1\164\1\60\1\uffff\3\60\5\uffff\1\166\1\145\1\164\1\116\2\141\1\156\1\60\1\162\1\164\3\60\3\uffff\1\145\1\116\1\145\1\141\1\155\1\143\1\60\1\uffff\2\60\3\uffff\1\116\1\141\1\162\1\155\2\145\3\uffff\1\141\1\155\1\60\1\145\2\60\1\155\1\145\1\156\1\uffff\1\163\2\uffff\1\145\1\163\1\171\1\160\1\163\1\160\1\60\1\141\1\160\1\141\1\uffff\1\143\1\141\1\143\1\145\1\143\1\145\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\145\2\162\1\141\1\157\1\156\1\145\1\157\1\164\2\162\2\141\1\151\1\141\1\171\5\uffff\2\145\1\71\1\145\1\172\1\uffff\2\uffff\1\52\2\uffff\1\154\1\uffff\1\151\1\162\1\157\1\141\1\155\1\157\1\163\1\164\1\146\1\165\1\164\2\162\1\171\1\157\1\154\1\162\1\154\1\163\1\155\1\160\1\165\6\uffff\1\71\2\uffff\3\145\3\uffff\1\141\1\166\1\141\1\142\1\160\1\145\1\154\2\145\1\141\1\142\1\145\1\165\1\141\1\172\1\155\1\163\1\164\1\165\1\164\3\145\1\71\1\uffff\2\145\1\164\1\141\1\155\1\141\1\150\1\123\1\145\1\66\1\147\1\165\1\154\1\172\1\156\1\143\1\171\1\uffff\1\72\1\145\1\163\1\145\4\172\1\55\1\145\1\151\1\164\1\145\1\154\1\116\1\160\1\141\1\64\1\145\1\154\1\145\1\uffff\1\147\1\164\1\172\1\uffff\3\172\5\uffff\1\166\1\145\1\164\1\116\2\141\1\156\1\172\1\162\1\164\3\172\3\uffff\1\145\1\116\1\145\1\141\1\155\1\143\1\172\1\uffff\2\172\3\uffff\1\116\1\141\1\162\1\155\2\145\3\uffff\1\141\1\155\1\172\1\145\2\172\1\155\1\145\1\156\1\uffff\1\163\2\uffff\1\145\1\163\1\171\1\160\1\163\1\160\1\172\1\141\1\160\1\141\1\uffff\1\143\1\141\1\143\1\145\1\143\1\145\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA24_acceptS =
        "\21\uffff\1\30\1\31\1\32\1\33\1\34\5\uffff\1\42\3\uffff\1\46\1\47\1\uffff\1\42\26\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff\1\40\1\37\3\uffff\1\44\1\45\1\46\30\uffff\1\43\21\uffff\1\27\25\uffff\1\23\3\uffff\1\20\3\uffff\1\24\1\25\1\26\1\36\1\41\15\uffff\1\17\1\21\1\22\7\uffff\1\13\2\uffff\1\14\1\15\1\16\6\uffff\1\10\1\11\1\12\11\uffff\1\7\1\uffff\1\5\1\6\12\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA24_specialS =
        "\1\1\33\uffff\1\0\1\2\u00c2\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\1\25\3\40\1\35\4\40\1\21\1\30\1\40\1\36\1\26\2\27\7\31\1\22\6\40\1\12\1\5\1\33\1\10\2\33\1\3\1\33\1\6\2\33\1\16\1\33\1\4\1\33\1\2\1\33\1\1\1\11\7\33\3\40\1\32\1\33\1\40\3\33\1\7\1\33\1\13\7\33\1\17\1\33\1\14\3\33\1\20\1\33\1\15\4\33\1\23\1\40\1\24\uff82\40",
            "\1\41",
            "\1\44\20\uffff\1\43",
            "\1\45\5\uffff\1\46",
            "\1\47",
            "\1\51\15\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\55\15\uffff\1\54",
            "\1\56",
            "\1\60\3\uffff\1\57",
            "\1\62\20\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\6\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "\1\101\1\uffff\12\77\10\uffff\1\76\2\uffff\1\101\34\uffff\1\76\2\uffff\1\101",
            "\1\101\1\uffff\12\102\13\uffff\1\101\37\uffff\1\101",
            "\12\103",
            "\1\101\1\uffff\12\104\13\uffff\1\101\37\uffff\1\101",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\105",
            "\0\105",
            "\1\106",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\137",
            "",
            "",
            "\1\101\1\uffff\12\141\13\uffff\1\101\37\uffff\1\101",
            "\1\101\1\uffff\12\142\13\uffff\1\101\37\uffff\1\101",
            "\1\101\1\uffff\12\104\13\uffff\1\101\37\uffff\1\101",
            "",
            "",
            "",
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
            "\1\156",
            "\1\157\13\uffff\1\160",
            "\1\161",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\173",
            "",
            "\1\101\1\uffff\12\174\13\uffff\1\101\37\uffff\1\101",
            "\1\101\1\uffff\12\142\13\uffff\1\101\37\uffff\1\101",
            "\1\175",
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
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0094",
            "\1\u0094\1\101\1\uffff\12\104\13\uffff\1\101\37\uffff\1\101",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ad",
            "\1\u00ae",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\12\42\7\uffff\1\u00c3\31\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c5",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00dd",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | NameSpace | Parameter | Boolean | Integer | Default | Base64 | Double | String | Struct | Array | From | Parts | Value | Date | List | Name | Type | Any | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_28 = input.LA(1);

                        s = -1;
                        if ( ((LA24_28>='\u0000' && LA24_28<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='R') ) {s = 1;}

                        else if ( (LA24_0=='P') ) {s = 2;}

                        else if ( (LA24_0=='G') ) {s = 3;}

                        else if ( (LA24_0=='N') ) {s = 4;}

                        else if ( (LA24_0=='B') ) {s = 5;}

                        else if ( (LA24_0=='I') ) {s = 6;}

                        else if ( (LA24_0=='d') ) {s = 7;}

                        else if ( (LA24_0=='D') ) {s = 8;}

                        else if ( (LA24_0=='S') ) {s = 9;}

                        else if ( (LA24_0=='A') ) {s = 10;}

                        else if ( (LA24_0=='f') ) {s = 11;}

                        else if ( (LA24_0=='p') ) {s = 12;}

                        else if ( (LA24_0=='v') ) {s = 13;}

                        else if ( (LA24_0=='L') ) {s = 14;}

                        else if ( (LA24_0=='n') ) {s = 15;}

                        else if ( (LA24_0=='t') ) {s = 16;}

                        else if ( (LA24_0==',') ) {s = 17;}

                        else if ( (LA24_0==':') ) {s = 18;}

                        else if ( (LA24_0=='{') ) {s = 19;}

                        else if ( (LA24_0=='}') ) {s = 20;}

                        else if ( (LA24_0=='#') ) {s = 21;}

                        else if ( (LA24_0=='0') ) {s = 22;}

                        else if ( ((LA24_0>='1' && LA24_0<='2')) ) {s = 23;}

                        else if ( (LA24_0=='-') ) {s = 24;}

                        else if ( ((LA24_0>='3' && LA24_0<='9')) ) {s = 25;}

                        else if ( (LA24_0=='^') ) {s = 26;}

                        else if ( (LA24_0=='C'||(LA24_0>='E' && LA24_0<='F')||LA24_0=='H'||(LA24_0>='J' && LA24_0<='K')||LA24_0=='M'||LA24_0=='O'||LA24_0=='Q'||(LA24_0>='T' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='c')||LA24_0=='e'||(LA24_0>='g' && LA24_0<='m')||LA24_0=='o'||(LA24_0>='q' && LA24_0<='s')||LA24_0=='u'||(LA24_0>='w' && LA24_0<='z')) ) {s = 27;}

                        else if ( (LA24_0=='\"') ) {s = 28;}

                        else if ( (LA24_0=='\'') ) {s = 29;}

                        else if ( (LA24_0=='/') ) {s = 30;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 31;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='$' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='+')||LA24_0=='.'||(LA24_0>=';' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||LA24_0=='|'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_29 = input.LA(1);

                        s = -1;
                        if ( ((LA24_29>='\u0000' && LA24_29<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}