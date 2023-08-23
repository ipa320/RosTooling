package de.fraunhofer.ipa.ros.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicsLexer extends Lexer {
    public static final int Float32_1=9;
    public static final int Node=59;
    public static final int RULE_DATE_TIME=79;
    public static final int Uint64_1=17;
    public static final int String=32;
    public static final int Int16=45;
    public static final int Float32=20;
    public static final int Goal=56;
    public static final int Bool=53;
    public static final int Uint16=41;
    public static final int Boolean=18;
    public static final int Uint8=49;
    public static final int RULE_ID=80;
    public static final int RULE_DIGIT=69;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=22;
    public static final int Header=31;
    public static final int RULE_INT=82;
    public static final int Byte=54;
    public static final int RULE_ML_COMMENT=89;
    public static final int LeftSquareBracket=67;
    public static final int Base64=29;
    public static final int Comma=65;
    public static final int RULE_MESSAGE_ASIGMENT=83;
    public static final int LeftSquareBracketRightSquareBracket=64;
    public static final int Int32=46;
    public static final int Char=55;
    public static final int RULE_DECINT=72;
    public static final int Uint32=42;
    public static final int RULE_HOUR=77;
    public static final int Int8=57;
    public static final int Default=11;
    public static final int Int8_1=38;
    public static final int Uint16_1=15;
    public static final int Type=61;
    public static final int Float64=21;
    public static final int Int32_1=23;
    public static final int RULE_BINARY=70;
    public static final int String_1=40;
    public static final int String_2=14;
    public static final int RULE_DAY=74;
    public static final int RULE_BEGIN=84;
    public static final int RULE_BOOLEAN=71;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=76;
    public static final int Result=39;
    public static final int Name=58;
    public static final int RULE_MIN_SEC=78;
    public static final int Char_1=37;
    public static final int ParameterAny=7;
    public static final int List=52;
    public static final int RightSquareBracket=68;
    public static final int PrivateNamespace=5;
    public static final int GraphName=8;
    public static final int Byte_1=36;
    public static final int Float64_1=10;
    public static final int Duration=12;
    public static final int Uint32_1=16;
    public static final int Double=30;
    public static final int Type_1=48;
    public static final int Value=50;
    public static final int Uint64=43;
    public static final int Action=34;
    public static final int RULE_END=85;
    public static final int Message=25;
    public static final int Value_1=44;
    public static final int Time=60;
    public static final int RULE_STRING=81;
    public static final int Bool_1=35;
    public static final int Any=62;
    public static final int Struct=33;
    public static final int RULE_SL_COMMENT=86;
    public static final int Uint8_1=27;
    public static final int RULE_DOUBLE=73;
    public static final int Feedback=13;
    public static final int RULE_ROS_CONVENTION_A=87;
    public static final int RULE_ROS_CONVENTION_PARAM=88;
    public static final int Colon=66;
    public static final int EOF=-1;
    public static final int Ns=63;
    public static final int RULE_WS=90;
    public static final int Int64_1=24;
    public static final int Service=26;
    public static final int RULE_ANY_OTHER=91;
    public static final int Date=51;
    public static final int Integer=19;
    public static final int Array=28;
    public static final int Int64=47;
    public static final int RULE_MONTH=75;

    // delegates
    // delegators

    public InternalBasicsLexer() {;} 
    public InternalBasicsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBasicsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBasicsLexer.g"; }

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:14:19: ( 'RelativeNamespace' )
            // InternalBasicsLexer.g:14:21: 'RelativeNamespace'
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
            // InternalBasicsLexer.g:16:18: ( 'PrivateNamespace' )
            // InternalBasicsLexer.g:16:20: 'PrivateNamespace'
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
            // InternalBasicsLexer.g:18:17: ( 'GlobalNamespace' )
            // InternalBasicsLexer.g:18:19: 'GlobalNamespace'
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
            // InternalBasicsLexer.g:20:14: ( 'ParameterAny' )
            // InternalBasicsLexer.g:20:16: 'ParameterAny'
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
            // InternalBasicsLexer.g:22:11: ( 'GraphName' )
            // InternalBasicsLexer.g:22:13: 'GraphName'
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

    // $ANTLR start "Float32_1"
    public final void mFloat32_1() throws RecognitionException {
        try {
            int _type = Float32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:24:11: ( 'float32[]' )
            // InternalBasicsLexer.g:24:13: 'float32[]'
            {
            match("float32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32_1"

    // $ANTLR start "Float64_1"
    public final void mFloat64_1() throws RecognitionException {
        try {
            int _type = Float64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:26:11: ( 'float64[]' )
            // InternalBasicsLexer.g:26:13: 'float64[]'
            {
            match("float64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64_1"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:28:9: ( 'default:' )
            // InternalBasicsLexer.g:28:11: 'default:'
            {
            match("default:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Duration"
    public final void mDuration() throws RecognitionException {
        try {
            int _type = Duration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:30:10: ( 'duration' )
            // InternalBasicsLexer.g:30:12: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Duration"

    // $ANTLR start "Feedback"
    public final void mFeedback() throws RecognitionException {
        try {
            int _type = Feedback;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:32:10: ( 'feedback' )
            // InternalBasicsLexer.g:32:12: 'feedback'
            {
            match("feedback"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feedback"

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:34:10: ( 'string[]' )
            // InternalBasicsLexer.g:34:12: 'string[]'
            {
            match("string[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_2"

    // $ANTLR start "Uint16_1"
    public final void mUint16_1() throws RecognitionException {
        try {
            int _type = Uint16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:36:10: ( 'uint16[]' )
            // InternalBasicsLexer.g:36:12: 'uint16[]'
            {
            match("uint16[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16_1"

    // $ANTLR start "Uint32_1"
    public final void mUint32_1() throws RecognitionException {
        try {
            int _type = Uint32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:38:10: ( 'uint32[]' )
            // InternalBasicsLexer.g:38:12: 'uint32[]'
            {
            match("uint32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32_1"

    // $ANTLR start "Uint64_1"
    public final void mUint64_1() throws RecognitionException {
        try {
            int _type = Uint64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:40:10: ( 'uint64[]' )
            // InternalBasicsLexer.g:40:12: 'uint64[]'
            {
            match("uint64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64_1"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:42:9: ( 'Boolean' )
            // InternalBasicsLexer.g:42:11: 'Boolean'
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
            // InternalBasicsLexer.g:44:9: ( 'Integer' )
            // InternalBasicsLexer.g:44:11: 'Integer'
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

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:46:9: ( 'float32' )
            // InternalBasicsLexer.g:46:11: 'float32'
            {
            match("float32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32"

    // $ANTLR start "Float64"
    public final void mFloat64() throws RecognitionException {
        try {
            int _type = Float64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:48:9: ( 'float64' )
            // InternalBasicsLexer.g:48:11: 'float64'
            {
            match("float64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64"

    // $ANTLR start "Int16_1"
    public final void mInt16_1() throws RecognitionException {
        try {
            int _type = Int16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:50:9: ( 'int16[]' )
            // InternalBasicsLexer.g:50:11: 'int16[]'
            {
            match("int16[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16_1"

    // $ANTLR start "Int32_1"
    public final void mInt32_1() throws RecognitionException {
        try {
            int _type = Int32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:52:9: ( 'int32[]' )
            // InternalBasicsLexer.g:52:11: 'int32[]'
            {
            match("int32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32_1"

    // $ANTLR start "Int64_1"
    public final void mInt64_1() throws RecognitionException {
        try {
            int _type = Int64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:54:9: ( 'int64[]' )
            // InternalBasicsLexer.g:54:11: 'int64[]'
            {
            match("int64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64_1"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:56:9: ( 'message' )
            // InternalBasicsLexer.g:56:11: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:58:9: ( 'service' )
            // InternalBasicsLexer.g:58:11: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Service"

    // $ANTLR start "Uint8_1"
    public final void mUint8_1() throws RecognitionException {
        try {
            int _type = Uint8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:60:9: ( 'uint8[]' )
            // InternalBasicsLexer.g:60:11: 'uint8[]'
            {
            match("uint8[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8_1"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:62:7: ( 'Array:' )
            // InternalBasicsLexer.g:62:9: 'Array:'
            {
            match("Array:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Base64"
    public final void mBase64() throws RecognitionException {
        try {
            int _type = Base64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:64:8: ( 'Base64' )
            // InternalBasicsLexer.g:64:10: 'Base64'
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
            // InternalBasicsLexer.g:66:8: ( 'Double' )
            // InternalBasicsLexer.g:66:10: 'Double'
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

    // $ANTLR start "Header"
    public final void mHeader() throws RecognitionException {
        try {
            int _type = Header;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:68:8: ( 'Header' )
            // InternalBasicsLexer.g:68:10: 'Header'
            {
            match("Header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Header"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:70:8: ( 'String' )
            // InternalBasicsLexer.g:70:10: 'String'
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
            // InternalBasicsLexer.g:72:8: ( 'Struct' )
            // InternalBasicsLexer.g:72:10: 'Struct'
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

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:74:8: ( 'action' )
            // InternalBasicsLexer.g:74:10: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Bool_1"
    public final void mBool_1() throws RecognitionException {
        try {
            int _type = Bool_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:76:8: ( 'bool[]' )
            // InternalBasicsLexer.g:76:10: 'bool[]'
            {
            match("bool[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool_1"

    // $ANTLR start "Byte_1"
    public final void mByte_1() throws RecognitionException {
        try {
            int _type = Byte_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:78:8: ( 'byte[]' )
            // InternalBasicsLexer.g:78:10: 'byte[]'
            {
            match("byte[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte_1"

    // $ANTLR start "Char_1"
    public final void mChar_1() throws RecognitionException {
        try {
            int _type = Char_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:80:8: ( 'char[]' )
            // InternalBasicsLexer.g:80:10: 'char[]'
            {
            match("char[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char_1"

    // $ANTLR start "Int8_1"
    public final void mInt8_1() throws RecognitionException {
        try {
            int _type = Int8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:82:8: ( 'int8[]' )
            // InternalBasicsLexer.g:82:10: 'int8[]'
            {
            match("int8[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8_1"

    // $ANTLR start "Result"
    public final void mResult() throws RecognitionException {
        try {
            int _type = Result;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:84:8: ( 'result' )
            // InternalBasicsLexer.g:84:10: 'result'
            {
            match("result"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Result"

    // $ANTLR start "String_1"
    public final void mString_1() throws RecognitionException {
        try {
            int _type = String_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:86:10: ( 'string' )
            // InternalBasicsLexer.g:86:12: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_1"

    // $ANTLR start "Uint16"
    public final void mUint16() throws RecognitionException {
        try {
            int _type = Uint16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:88:8: ( 'uint16' )
            // InternalBasicsLexer.g:88:10: 'uint16'
            {
            match("uint16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16"

    // $ANTLR start "Uint32"
    public final void mUint32() throws RecognitionException {
        try {
            int _type = Uint32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:90:8: ( 'uint32' )
            // InternalBasicsLexer.g:90:10: 'uint32'
            {
            match("uint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32"

    // $ANTLR start "Uint64"
    public final void mUint64() throws RecognitionException {
        try {
            int _type = Uint64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:92:8: ( 'uint64' )
            // InternalBasicsLexer.g:92:10: 'uint64'
            {
            match("uint64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64"

    // $ANTLR start "Value_1"
    public final void mValue_1() throws RecognitionException {
        try {
            int _type = Value_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:94:9: ( 'value:' )
            // InternalBasicsLexer.g:94:11: 'value:'
            {
            match("value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value_1"

    // $ANTLR start "Int16"
    public final void mInt16() throws RecognitionException {
        try {
            int _type = Int16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:96:7: ( 'int16' )
            // InternalBasicsLexer.g:96:9: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16"

    // $ANTLR start "Int32"
    public final void mInt32() throws RecognitionException {
        try {
            int _type = Int32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:98:7: ( 'int32' )
            // InternalBasicsLexer.g:98:9: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32"

    // $ANTLR start "Int64"
    public final void mInt64() throws RecognitionException {
        try {
            int _type = Int64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:100:7: ( 'int64' )
            // InternalBasicsLexer.g:100:9: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64"

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:102:8: ( 'type:' )
            // InternalBasicsLexer.g:102:10: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type_1"

    // $ANTLR start "Uint8"
    public final void mUint8() throws RecognitionException {
        try {
            int _type = Uint8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:104:7: ( 'uint8' )
            // InternalBasicsLexer.g:104:9: 'uint8'
            {
            match("uint8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:106:7: ( 'value' )
            // InternalBasicsLexer.g:106:9: 'value'
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
            // InternalBasicsLexer.g:108:6: ( 'Date' )
            // InternalBasicsLexer.g:108:8: 'Date'
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
            // InternalBasicsLexer.g:110:6: ( 'List' )
            // InternalBasicsLexer.g:110:8: 'List'
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

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:112:6: ( 'bool' )
            // InternalBasicsLexer.g:112:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:114:6: ( 'byte' )
            // InternalBasicsLexer.g:114:8: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte"

    // $ANTLR start "Char"
    public final void mChar() throws RecognitionException {
        try {
            int _type = Char;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:116:6: ( 'char' )
            // InternalBasicsLexer.g:116:8: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char"

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:118:6: ( 'goal' )
            // InternalBasicsLexer.g:118:8: 'goal'
            {
            match("goal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goal"

    // $ANTLR start "Int8"
    public final void mInt8() throws RecognitionException {
        try {
            int _type = Int8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:120:6: ( 'int8' )
            // InternalBasicsLexer.g:120:8: 'int8'
            {
            match("int8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:122:6: ( 'name' )
            // InternalBasicsLexer.g:122:8: 'name'
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

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:124:6: ( 'node' )
            // InternalBasicsLexer.g:124:8: 'node'
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

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:126:6: ( 'time' )
            // InternalBasicsLexer.g:126:8: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Time"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:128:6: ( 'type' )
            // InternalBasicsLexer.g:128:8: 'type'
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
            // InternalBasicsLexer.g:130:5: ( 'Any' )
            // InternalBasicsLexer.g:130:7: 'Any'
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

    // $ANTLR start "Ns"
    public final void mNs() throws RecognitionException {
        try {
            int _type = Ns;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:132:4: ( 'ns:' )
            // InternalBasicsLexer.g:132:6: 'ns:'
            {
            match("ns:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ns"

    // $ANTLR start "LeftSquareBracketRightSquareBracket"
    public final void mLeftSquareBracketRightSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracketRightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:134:37: ( '[]' )
            // InternalBasicsLexer.g:134:39: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracketRightSquareBracket"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:136:7: ( ',' )
            // InternalBasicsLexer.g:136:9: ','
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
            // InternalBasicsLexer.g:138:7: ( ':' )
            // InternalBasicsLexer.g:138:9: ':'
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
            // InternalBasicsLexer.g:140:19: ( '[' )
            // InternalBasicsLexer.g:140:21: '['
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
            // InternalBasicsLexer.g:142:20: ( ']' )
            // InternalBasicsLexer.g:142:22: ']'
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalBasicsLexer.g:144:21: ( '0' .. '9' )
            // InternalBasicsLexer.g:144:23: '0' .. '9'
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
            // InternalBasicsLexer.g:146:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalBasicsLexer.g:146:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalBasicsLexer.g:146:15: ( '0b' | '0B' )
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
                    // InternalBasicsLexer.g:146:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:146:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalBasicsLexer.g:146:27: ( '0' | '1' )+
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
            	    // InternalBasicsLexer.g:
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
            // InternalBasicsLexer.g:148:14: ( ( 'true' | 'false' ) )
            // InternalBasicsLexer.g:148:16: ( 'true' | 'false' )
            {
            // InternalBasicsLexer.g:148:16: ( 'true' | 'false' )
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
                    // InternalBasicsLexer.g:148:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:148:24: 'false'
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
            // InternalBasicsLexer.g:150:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalBasicsLexer.g:150:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalBasicsLexer.g:150:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.'||(LA6_0>='0' && LA6_0<='9')||LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            else if ( (LA6_0=='-') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBasicsLexer.g:150:16: ( RULE_DIGIT )*
                    {
                    // InternalBasicsLexer.g:150:16: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:150:16: RULE_DIGIT
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
                    // InternalBasicsLexer.g:150:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalBasicsLexer.g:150:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:150:32: RULE_DIGIT
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

            // InternalBasicsLexer.g:150:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalBasicsLexer.g:150:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalBasicsLexer.g:150:50: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:150:50: RULE_DECINT
                    	    {
                    	    mRULE_DECINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:150:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalBasicsLexer.g:150:63: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBasicsLexer.g:150:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalBasicsLexer.g:150:68: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalBasicsLexer.g:150:68: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
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

                    // InternalBasicsLexer.g:150:92: ( '-' | '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBasicsLexer.g:
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

                    // InternalBasicsLexer.g:150:103: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:150:103: RULE_DIGIT
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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:152:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalBasicsLexer.g:152:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalBasicsLexer.g:152:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt15=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt15=1;
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
                alt15=2;
                }
                break;
            case '-':
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBasicsLexer.g:152:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:152:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalBasicsLexer.g:152:29: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:152:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalBasicsLexer.g:152:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalBasicsLexer.g:152:54: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:152:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
            // InternalBasicsLexer.g:154:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalBasicsLexer.g:154:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalBasicsLexer.g:154:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='1' && LA16_0<='3')) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='9')) ) {
                    alt16=2;
                }
                else {
                    alt16=1;}
            }
            else if ( ((LA16_0>='4' && LA16_0<='9')) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBasicsLexer.g:154:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:154:31: '1' .. '3' '0' .. '9'
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
            // InternalBasicsLexer.g:156:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalBasicsLexer.g:156:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalBasicsLexer.g:156:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='1') ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>='0' && LA17_1<='2')) ) {
                    alt17=2;
                }
                else {
                    alt17=1;}
            }
            else if ( ((LA17_0>='2' && LA17_0<='9')) ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalBasicsLexer.g:156:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:156:33: '1' '0' .. '2'
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
            // InternalBasicsLexer.g:158:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalBasicsLexer.g:158:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalBasicsLexer.g:160:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalBasicsLexer.g:160:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalBasicsLexer.g:160:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='0' && LA18_0<='1')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='2') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBasicsLexer.g:160:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:160:41: '2' '0' .. '3'
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
            // InternalBasicsLexer.g:162:23: ( '0' .. '5' '0' .. '9' )
            // InternalBasicsLexer.g:162:25: '0' .. '5' '0' .. '9'
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
            // InternalBasicsLexer.g:164:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalBasicsLexer.g:164:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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

    // $ANTLR start "RULE_MESSAGE_ASIGMENT"
    public final void mRULE_MESSAGE_ASIGMENT() throws RecognitionException {
        try {
            int _type = RULE_MESSAGE_ASIGMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:166:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalBasicsLexer.g:166:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalBasicsLexer.g:166:25: ( RULE_ID | RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='^' && LA19_0<='_')||(LA19_0>='a' && LA19_0<='z')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='\"'||LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalBasicsLexer.g:166:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:166:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalBasicsLexer.g:166:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt20=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt20=2;
                }
                break;
            case '0':
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
                alt20=3;
                }
                break;
            case '-':
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalBasicsLexer.g:166:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:166:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalBasicsLexer.g:166:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalBasicsLexer.g:166:81: '-' RULE_INT
                    {
                    match('-'); 
                    mRULE_INT(); 

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
    // $ANTLR end "RULE_MESSAGE_ASIGMENT"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalBasicsLexer.g:168:21: ()
            // InternalBasicsLexer.g:168:23: 
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
            // InternalBasicsLexer.g:170:19: ()
            // InternalBasicsLexer.g:170:21: 
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
            // InternalBasicsLexer.g:172:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalBasicsLexer.g:172:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalBasicsLexer.g:172:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBasicsLexer.g:172:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
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
            // InternalBasicsLexer.g:174:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalBasicsLexer.g:174:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalBasicsLexer.g:174:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='/') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='A' && LA22_0<='Z')||(LA22_0>='^' && LA22_0<='_')||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBasicsLexer.g:174:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalBasicsLexer.g:174:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // InternalBasicsLexer.g:176:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalBasicsLexer.g:176:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalBasicsLexer.g:176:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop23:
            do {
                int alt23=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt23=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt23=2;
                    }
                    break;
                case '~':
                    {
                    alt23=3;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalBasicsLexer.g:176:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalBasicsLexer.g:176:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalBasicsLexer.g:176:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // InternalBasicsLexer.g:178:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBasicsLexer.g:178:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBasicsLexer.g:178:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBasicsLexer.g:178:11: '^'
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

            // InternalBasicsLexer.g:178:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBasicsLexer.g:
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
            	    break loop25;
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
            // InternalBasicsLexer.g:180:19: ( ( '0' .. '9' )+ )
            // InternalBasicsLexer.g:180:21: ( '0' .. '9' )+
            {
            // InternalBasicsLexer.g:180:21: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBasicsLexer.g:180:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

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
            // InternalBasicsLexer.g:182:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBasicsLexer.g:182:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBasicsLexer.g:182:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\"') ) {
                alt29=1;
            }
            else if ( (LA29_0=='\'') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalBasicsLexer.g:182:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBasicsLexer.g:182:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:182:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBasicsLexer.g:182:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop27;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:182:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBasicsLexer.g:182:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBasicsLexer.g:182:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBasicsLexer.g:182:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop28;
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
            // InternalBasicsLexer.g:184:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBasicsLexer.g:184:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBasicsLexer.g:184:24: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFF')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBasicsLexer.g:184:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // InternalBasicsLexer.g:186:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBasicsLexer.g:186:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBasicsLexer.g:186:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBasicsLexer.g:
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
            // InternalBasicsLexer.g:188:16: ( . )
            // InternalBasicsLexer.g:188:18: .
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
        // InternalBasicsLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=79;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalBasicsLexer.g:1:10: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 2 :
                // InternalBasicsLexer.g:1:28: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 3 :
                // InternalBasicsLexer.g:1:45: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 4 :
                // InternalBasicsLexer.g:1:61: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 5 :
                // InternalBasicsLexer.g:1:74: GraphName
                {
                mGraphName(); 

                }
                break;
            case 6 :
                // InternalBasicsLexer.g:1:84: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 7 :
                // InternalBasicsLexer.g:1:94: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 8 :
                // InternalBasicsLexer.g:1:104: Default
                {
                mDefault(); 

                }
                break;
            case 9 :
                // InternalBasicsLexer.g:1:112: Duration
                {
                mDuration(); 

                }
                break;
            case 10 :
                // InternalBasicsLexer.g:1:121: Feedback
                {
                mFeedback(); 

                }
                break;
            case 11 :
                // InternalBasicsLexer.g:1:130: String_2
                {
                mString_2(); 

                }
                break;
            case 12 :
                // InternalBasicsLexer.g:1:139: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 13 :
                // InternalBasicsLexer.g:1:148: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 14 :
                // InternalBasicsLexer.g:1:157: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 15 :
                // InternalBasicsLexer.g:1:166: Boolean
                {
                mBoolean(); 

                }
                break;
            case 16 :
                // InternalBasicsLexer.g:1:174: Integer
                {
                mInteger(); 

                }
                break;
            case 17 :
                // InternalBasicsLexer.g:1:182: Float32
                {
                mFloat32(); 

                }
                break;
            case 18 :
                // InternalBasicsLexer.g:1:190: Float64
                {
                mFloat64(); 

                }
                break;
            case 19 :
                // InternalBasicsLexer.g:1:198: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 20 :
                // InternalBasicsLexer.g:1:206: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 21 :
                // InternalBasicsLexer.g:1:214: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 22 :
                // InternalBasicsLexer.g:1:222: Message
                {
                mMessage(); 

                }
                break;
            case 23 :
                // InternalBasicsLexer.g:1:230: Service
                {
                mService(); 

                }
                break;
            case 24 :
                // InternalBasicsLexer.g:1:238: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 25 :
                // InternalBasicsLexer.g:1:246: Array
                {
                mArray(); 

                }
                break;
            case 26 :
                // InternalBasicsLexer.g:1:252: Base64
                {
                mBase64(); 

                }
                break;
            case 27 :
                // InternalBasicsLexer.g:1:259: Double
                {
                mDouble(); 

                }
                break;
            case 28 :
                // InternalBasicsLexer.g:1:266: Header
                {
                mHeader(); 

                }
                break;
            case 29 :
                // InternalBasicsLexer.g:1:273: String
                {
                mString(); 

                }
                break;
            case 30 :
                // InternalBasicsLexer.g:1:280: Struct
                {
                mStruct(); 

                }
                break;
            case 31 :
                // InternalBasicsLexer.g:1:287: Action
                {
                mAction(); 

                }
                break;
            case 32 :
                // InternalBasicsLexer.g:1:294: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 33 :
                // InternalBasicsLexer.g:1:301: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 34 :
                // InternalBasicsLexer.g:1:308: Char_1
                {
                mChar_1(); 

                }
                break;
            case 35 :
                // InternalBasicsLexer.g:1:315: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 36 :
                // InternalBasicsLexer.g:1:322: Result
                {
                mResult(); 

                }
                break;
            case 37 :
                // InternalBasicsLexer.g:1:329: String_1
                {
                mString_1(); 

                }
                break;
            case 38 :
                // InternalBasicsLexer.g:1:338: Uint16
                {
                mUint16(); 

                }
                break;
            case 39 :
                // InternalBasicsLexer.g:1:345: Uint32
                {
                mUint32(); 

                }
                break;
            case 40 :
                // InternalBasicsLexer.g:1:352: Uint64
                {
                mUint64(); 

                }
                break;
            case 41 :
                // InternalBasicsLexer.g:1:359: Value_1
                {
                mValue_1(); 

                }
                break;
            case 42 :
                // InternalBasicsLexer.g:1:367: Int16
                {
                mInt16(); 

                }
                break;
            case 43 :
                // InternalBasicsLexer.g:1:373: Int32
                {
                mInt32(); 

                }
                break;
            case 44 :
                // InternalBasicsLexer.g:1:379: Int64
                {
                mInt64(); 

                }
                break;
            case 45 :
                // InternalBasicsLexer.g:1:385: Type_1
                {
                mType_1(); 

                }
                break;
            case 46 :
                // InternalBasicsLexer.g:1:392: Uint8
                {
                mUint8(); 

                }
                break;
            case 47 :
                // InternalBasicsLexer.g:1:398: Value
                {
                mValue(); 

                }
                break;
            case 48 :
                // InternalBasicsLexer.g:1:404: Date
                {
                mDate(); 

                }
                break;
            case 49 :
                // InternalBasicsLexer.g:1:409: List
                {
                mList(); 

                }
                break;
            case 50 :
                // InternalBasicsLexer.g:1:414: Bool
                {
                mBool(); 

                }
                break;
            case 51 :
                // InternalBasicsLexer.g:1:419: Byte
                {
                mByte(); 

                }
                break;
            case 52 :
                // InternalBasicsLexer.g:1:424: Char
                {
                mChar(); 

                }
                break;
            case 53 :
                // InternalBasicsLexer.g:1:429: Goal
                {
                mGoal(); 

                }
                break;
            case 54 :
                // InternalBasicsLexer.g:1:434: Int8
                {
                mInt8(); 

                }
                break;
            case 55 :
                // InternalBasicsLexer.g:1:439: Name
                {
                mName(); 

                }
                break;
            case 56 :
                // InternalBasicsLexer.g:1:444: Node
                {
                mNode(); 

                }
                break;
            case 57 :
                // InternalBasicsLexer.g:1:449: Time
                {
                mTime(); 

                }
                break;
            case 58 :
                // InternalBasicsLexer.g:1:454: Type
                {
                mType(); 

                }
                break;
            case 59 :
                // InternalBasicsLexer.g:1:459: Any
                {
                mAny(); 

                }
                break;
            case 60 :
                // InternalBasicsLexer.g:1:463: Ns
                {
                mNs(); 

                }
                break;
            case 61 :
                // InternalBasicsLexer.g:1:466: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 62 :
                // InternalBasicsLexer.g:1:502: Comma
                {
                mComma(); 

                }
                break;
            case 63 :
                // InternalBasicsLexer.g:1:508: Colon
                {
                mColon(); 

                }
                break;
            case 64 :
                // InternalBasicsLexer.g:1:514: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 65 :
                // InternalBasicsLexer.g:1:532: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 66 :
                // InternalBasicsLexer.g:1:551: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 67 :
                // InternalBasicsLexer.g:1:563: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 68 :
                // InternalBasicsLexer.g:1:576: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 69 :
                // InternalBasicsLexer.g:1:588: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 70 :
                // InternalBasicsLexer.g:1:600: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 71 :
                // InternalBasicsLexer.g:1:615: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 72 :
                // InternalBasicsLexer.g:1:637: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalBasicsLexer.g:1:653: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 74 :
                // InternalBasicsLexer.g:1:675: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 75 :
                // InternalBasicsLexer.g:1:701: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 76 :
                // InternalBasicsLexer.g:1:709: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 77 :
                // InternalBasicsLexer.g:1:721: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 78 :
                // InternalBasicsLexer.g:1:737: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // InternalBasicsLexer.g:1:745: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA12_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA12_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
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
            return "150:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA32_eotS =
        "\1\51\30\56\1\127\3\uffff\2\135\1\uffff\1\136\1\54\1\135\1\54\1\56\2\54\1\uffff\1\54\1\uffff\1\54\2\uffff\1\56\1\uffff\1\56\1\uffff\45\56\11\uffff\1\135\1\136\2\135\1\56\2\uffff\1\u0098\2\uffff\1\u0098\4\uffff\23\56\1\u00b0\21\56\2\uffff\2\135\3\uffff\23\56\1\u00dc\2\56\1\uffff\1\56\1\u00e0\4\56\1\u00e6\1\u00e8\1\u00ea\2\56\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\uffff\1\135\7\56\1\u00f0\7\56\1\u0106\3\56\1\u010b\1\u010d\1\u010f\2\uffff\3\56\1\uffff\4\56\6\uffff\1\56\1\u0119\11\uffff\12\56\1\u0125\1\56\1\u0128\1\u012a\1\u012c\2\uffff\1\56\1\u012e\1\56\6\uffff\1\56\1\uffff\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\2\uffff\5\56\1\u013d\1\u013f\3\56\2\uffff\1\u0143\6\uffff\1\u0144\1\uffff\1\u0145\1\u0146\6\uffff\5\56\4\uffff\1\u014c\1\uffff\1\u014d\4\uffff\4\56\1\u0152\2\uffff\4\56\1\uffff\6\56\1\u015d\3\56\1\uffff\6\56\1\u0167\1\56\1\u0169\1\uffff\1\u016a\2\uffff";
    static final String DFA32_eofS =
        "\u016b\uffff";
    static final String DFA32_minS =
        "\1\0\30\57\1\135\3\uffff\2\56\1\uffff\1\57\2\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\1\57\1\uffff\1\57\1\uffff\45\57\6\uffff\1\56\2\uffff\1\56\1\57\2\56\1\57\2\0\1\57\2\0\1\57\4\uffff\45\57\1\uffff\3\56\1\0\1\uffff\1\0\26\57\1\uffff\22\57\2\55\26\57\2\uffff\3\57\1\uffff\4\57\6\uffff\2\57\11\uffff\17\57\2\uffff\3\57\6\uffff\1\57\1\uffff\6\57\2\uffff\12\57\2\uffff\1\57\6\uffff\1\57\1\uffff\2\57\6\uffff\5\57\4\uffff\1\57\1\uffff\1\57\4\uffff\5\57\2\uffff\4\57\1\uffff\12\57\1\uffff\11\57\1\uffff\1\57\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\30\172\1\135\3\uffff\2\145\1\uffff\1\172\2\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\1\172\1\uffff\1\172\1\uffff\45\172\6\uffff\1\145\2\uffff\1\145\1\172\2\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\45\172\1\uffff\3\145\1\uffff\1\uffff\1\uffff\26\172\1\uffff\22\172\2\145\26\172\2\uffff\3\172\1\uffff\4\172\6\uffff\2\172\11\uffff\17\172\2\uffff\3\172\6\uffff\1\172\1\uffff\6\172\2\uffff\12\172\2\uffff\1\172\6\uffff\1\172\1\uffff\2\172\6\uffff\5\172\4\uffff\1\172\1\uffff\1\172\4\uffff\5\172\2\uffff\4\172\1\uffff\12\172\1\uffff\11\172\1\uffff\1\172\2\uffff";
    static final String DFA32_acceptS =
        "\32\uffff\1\76\1\77\1\101\2\uffff\1\104\7\uffff\1\110\1\uffff\1\111\1\uffff\1\116\1\117\1\uffff\1\113\1\uffff\1\107\45\uffff\1\75\1\100\1\76\1\77\1\101\1\102\1\uffff\1\105\1\104\13\uffff\1\110\1\115\1\112\1\116\45\uffff\1\74\4\uffff\1\114\27\uffff\1\73\52\uffff\1\43\1\66\3\uffff\1\60\4\uffff\1\40\1\62\1\41\1\63\1\42\1\64\2\uffff\1\55\1\72\1\71\1\103\1\61\1\65\1\67\1\70\1\106\17\uffff\1\30\1\56\3\uffff\1\23\1\52\1\24\1\53\1\25\1\54\1\uffff\1\31\6\uffff\1\51\1\57\12\uffff\1\13\1\45\1\uffff\1\14\1\46\1\15\1\47\1\16\1\50\1\uffff\1\32\2\uffff\1\33\1\34\1\35\1\36\1\37\1\44\5\uffff\1\6\1\21\1\7\1\22\1\uffff\1\10\1\uffff\1\27\1\17\1\20\1\26\5\uffff\1\12\1\11\4\uffff\1\5\12\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\1\44\uffff\1\5\1\4\75\uffff\1\2\1\0\1\uffff\1\3\1\7\56\uffff\1\10\1\uffff\1\6\u00d1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\45\1\47\3\54\1\46\4\54\1\32\1\41\1\37\1\50\1\35\2\36\7\42\1\33\6\54\1\14\1\10\1\44\1\15\1\40\1\44\1\3\1\16\1\11\2\44\1\26\3\44\1\2\1\44\1\1\1\17\7\44\1\31\1\54\1\34\1\43\1\44\1\54\1\20\1\21\1\22\1\5\1\40\1\4\1\27\1\44\1\12\3\44\1\13\1\30\3\44\1\23\1\6\1\25\1\7\1\24\4\44\3\54\1\52\uff81\54",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\55\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\62\20\57\1\61\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\63\5\57\1\64\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\67\3\57\1\66\6\57\1\65\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\70\17\57\1\71\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\73\16\57\1\72\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\74\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\76\15\57\1\75\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\77\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\100\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\101\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\103\3\57\1\102\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\105\15\57\1\104\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\106\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\107\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\110\27\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\111\11\57\1\112\1\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\113\22\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\114\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\115\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\117\10\57\1\120\6\57\1\116\1\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\121\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\122\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\123\15\57\1\124\3\57\1\125\7\57",
            "\1\126",
            "",
            "",
            "",
            "\1\136\1\uffff\12\134\10\uffff\1\133\2\uffff\1\136\34\uffff\1\133\2\uffff\1\136",
            "\1\136\1\uffff\12\137\13\uffff\1\136\37\uffff\1\136",
            "",
            "\1\51\12\140\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\136\1\uffff\12\141\13\uffff\1\136\37\uffff\1\136",
            "\1\136\1\uffff\12\142\13\uffff\1\136\37\uffff\1\136",
            "\32\143\4\uffff\1\143\1\uffff\32\143",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\42\145\1\146\71\145\1\144\uffa3\145",
            "\47\150\1\151\64\150\1\147\uffa3\150",
            "",
            "\1\154\4\uffff\1\154\2\uffff\1\153\26\uffff\32\51\3\uffff\2\51\1\uffff\32\51",
            "",
            "\1\154\4\uffff\1\154",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\156\16\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\157\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\160\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\161\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\162\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\163\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\164\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\165\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\166\24\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\167\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\170\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\171\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\172\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\173\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\174\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\175\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\176\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\177\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0080\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u0081\1\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0082\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0083\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0084\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0085\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0086\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0087\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0088\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0089\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u008a\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u008b\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u008c\12\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u008d\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u008e\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u008f\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0090\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0091\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u0092\26\57",
            "\1\51\12\57\1\u0093\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136\1\uffff\12\u0094\13\uffff\1\136\37\uffff\1\136",
            "",
            "",
            "\1\136\1\uffff\12\u0095\13\uffff\1\136\37\uffff\1\136",
            "\1\51\12\140\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\136\1\uffff\12\u0096\13\uffff\1\136\37\uffff\1\136",
            "\1\136\1\uffff\12\142\13\uffff\1\136\37\uffff\1\136",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\0\u0097",
            "\42\145\1\146\71\145\1\144\uffa3\145",
            "\1\154\15\uffff\1\60",
            "\0\u0099",
            "\47\150\1\151\64\150\1\147\uffa3\150",
            "\1\154\15\uffff\1\60",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u009a\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u009b\4\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u009c\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u009d\30\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u009e\12\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u009f\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00a0\26\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00a1\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a2\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a3\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00a4\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u00a5\4\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00a6\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a7\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a8\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a9\25\57",
            "\1\51\1\57\1\u00aa\1\57\1\u00ab\2\57\1\u00ac\1\57\1\u00ad\1\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00ae\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00af\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00b1\30\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b2\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00b3\26\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b4\13\57\1\u00b5\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b6\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00b7\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b8\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00b9\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00ba\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00bb\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00bc\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00bd\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00be\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00bf\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00c0\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c1\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c2\25\57",
            "",
            "\1\136\1\uffff\12\u00c3\13\uffff\1\136\37\uffff\1\136",
            "\1\136\1\uffff\12\u00c4\13\uffff\1\136\37\uffff\1\136",
            "\1\136\1\uffff\12\u0096\13\uffff\1\136\37\uffff\1\136",
            "\42\145\1\146\71\145\1\144\uffa3\145",
            "",
            "\47\150\1\151\64\150\1\147\uffa3\150",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00c5\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00c6\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00c7\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00c8\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00c9\22\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00ca\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00cb\30\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00cc\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00cd\5\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00ce\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00cf\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00d0\21\57",
            "\1\51\1\57\1\u00d1\1\57\1\u00d2\2\57\1\u00d3\1\57\1\u00d4\1\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d5\25\57",
            "\1\51\6\57\1\u00d6\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00d7\23\57",
            "\1\51\6\57\1\u00d8\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\2\57\1\u00d9\7\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\4\57\1\u00da\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u00db\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00dd\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u00de\1\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00df\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e1\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00e2\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00e3\27\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00e4\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u00e5\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u00e7\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u00e9\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00eb\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ec\25\57",
            "\1\51\12\57\1\u00ed\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f5\1\136\1\uffff\12\136\13\uffff\1\136\37\uffff\1\136",
            "\1\u00f5\1\136\1\uffff\12\142\13\uffff\1\136\37\uffff\1\136",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00f6\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00f7\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00f8\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00f9\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\15\57\1\u00fa\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\3\57\1\u00fb\2\57\1\u00fc\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00fd\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00fe\16\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00ff\21\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u0100\23\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0101\27\57",
            "\1\51\6\57\1\u0102\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\2\57\1\u0103\7\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\4\57\1\u0104\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u0105\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0107\31\57",
            "\1\51\4\57\1\u0108\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0109\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u010a\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u010c\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u010e\3\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u0110\23\57",
            "\1\51\12\57\1\u0111\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0112\25\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0113\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u0114\23\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0115\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0116\14\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0117\6\57",
            "\1\51\12\57\1\u0118\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u011a\4\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u011b\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u011c\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\15\57\1\u011d\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u011e\31\57",
            "\1\51\2\57\1\u011f\7\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\4\57\1\u0120\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0121\27\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0122\6\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0123\13\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u0124\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0126\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u0127\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u0129\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u012b\3\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u012d\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u012f\10\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0130\25\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0137\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\15\57\1\u0138\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0139\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u013a\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u013b\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u013c\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\1\u013e\3\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u0140\17\57",
            "\1\51\12\57\1\u0141\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0142\14\57",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\15\57\1\u0147\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0148\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0149\10\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u014a\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u014b\25\57",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u014e\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u014f\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\1\u0150\31\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0151\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0153\15\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0154\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0155\14\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0156\7\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0157\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0158\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u0159\1\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u015a\12\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u015b\7\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u015c\12\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u015e\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u015f\12\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0160\31\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0161\27\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0162\31\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0163\27\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0164\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0165\27\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0166\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0168\25\57",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\51\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_101 = input.LA(1);

                        s = -1;
                        if ( (LA32_101=='\"') ) {s = 102;}

                        else if ( (LA32_101=='\\') ) {s = 100;}

                        else if ( ((LA32_101>='\u0000' && LA32_101<='!')||(LA32_101>='#' && LA32_101<='[')||(LA32_101>=']' && LA32_101<='\uFFFF')) ) {s = 101;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='R') ) {s = 1;}

                        else if ( (LA32_0=='P') ) {s = 2;}

                        else if ( (LA32_0=='G') ) {s = 3;}

                        else if ( (LA32_0=='f') ) {s = 4;}

                        else if ( (LA32_0=='d') ) {s = 5;}

                        else if ( (LA32_0=='s') ) {s = 6;}

                        else if ( (LA32_0=='u') ) {s = 7;}

                        else if ( (LA32_0=='B') ) {s = 8;}

                        else if ( (LA32_0=='I') ) {s = 9;}

                        else if ( (LA32_0=='i') ) {s = 10;}

                        else if ( (LA32_0=='m') ) {s = 11;}

                        else if ( (LA32_0=='A') ) {s = 12;}

                        else if ( (LA32_0=='D') ) {s = 13;}

                        else if ( (LA32_0=='H') ) {s = 14;}

                        else if ( (LA32_0=='S') ) {s = 15;}

                        else if ( (LA32_0=='a') ) {s = 16;}

                        else if ( (LA32_0=='b') ) {s = 17;}

                        else if ( (LA32_0=='c') ) {s = 18;}

                        else if ( (LA32_0=='r') ) {s = 19;}

                        else if ( (LA32_0=='v') ) {s = 20;}

                        else if ( (LA32_0=='t') ) {s = 21;}

                        else if ( (LA32_0=='L') ) {s = 22;}

                        else if ( (LA32_0=='g') ) {s = 23;}

                        else if ( (LA32_0=='n') ) {s = 24;}

                        else if ( (LA32_0=='[') ) {s = 25;}

                        else if ( (LA32_0==',') ) {s = 26;}

                        else if ( (LA32_0==':') ) {s = 27;}

                        else if ( (LA32_0==']') ) {s = 28;}

                        else if ( (LA32_0=='0') ) {s = 29;}

                        else if ( ((LA32_0>='1' && LA32_0<='2')) ) {s = 30;}

                        else if ( (LA32_0=='.') ) {s = 31;}

                        else if ( (LA32_0=='E'||LA32_0=='e') ) {s = 32;}

                        else if ( (LA32_0=='-') ) {s = 33;}

                        else if ( ((LA32_0>='3' && LA32_0<='9')) ) {s = 34;}

                        else if ( (LA32_0=='^') ) {s = 35;}

                        else if ( (LA32_0=='C'||LA32_0=='F'||(LA32_0>='J' && LA32_0<='K')||(LA32_0>='M' && LA32_0<='O')||LA32_0=='Q'||(LA32_0>='T' && LA32_0<='Z')||LA32_0=='_'||LA32_0=='h'||(LA32_0>='j' && LA32_0<='l')||(LA32_0>='o' && LA32_0<='q')||(LA32_0>='w' && LA32_0<='z')) ) {s = 36;}

                        else if ( (LA32_0=='\"') ) {s = 37;}

                        else if ( (LA32_0=='\'') ) {s = 38;}

                        else if ( (LA32_0=='#') ) {s = 39;}

                        else if ( (LA32_0=='/') ) {s = 40;}

                        else if ( (LA32_0=='~') ) {s = 42;}

                        else if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 43;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||(LA32_0>='$' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='+')||(LA32_0>=';' && LA32_0<='@')||LA32_0=='\\'||LA32_0=='`'||(LA32_0>='{' && LA32_0<='}')||(LA32_0>='\u007F' && LA32_0<='\uFFFF')) ) {s = 44;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_100 = input.LA(1);

                        s = -1;
                        if ( ((LA32_100>='\u0000' && LA32_100<='\uFFFF')) ) {s = 151;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_103 = input.LA(1);

                        s = -1;
                        if ( ((LA32_103>='\u0000' && LA32_103<='\uFFFF')) ) {s = 153;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_38 = input.LA(1);

                        s = -1;
                        if ( (LA32_38=='\\') ) {s = 103;}

                        else if ( ((LA32_38>='\u0000' && LA32_38<='&')||(LA32_38>='(' && LA32_38<='[')||(LA32_38>=']' && LA32_38<='\uFFFF')) ) {s = 104;}

                        else if ( (LA32_38=='\'') ) {s = 105;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_37 = input.LA(1);

                        s = -1;
                        if ( (LA32_37=='\\') ) {s = 100;}

                        else if ( ((LA32_37>='\u0000' && LA32_37<='!')||(LA32_37>='#' && LA32_37<='[')||(LA32_37>=']' && LA32_37<='\uFFFF')) ) {s = 101;}

                        else if ( (LA32_37=='\"') ) {s = 102;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_153 = input.LA(1);

                        s = -1;
                        if ( (LA32_153=='\'') ) {s = 105;}

                        else if ( (LA32_153=='\\') ) {s = 103;}

                        else if ( ((LA32_153>='\u0000' && LA32_153<='&')||(LA32_153>='(' && LA32_153<='[')||(LA32_153>=']' && LA32_153<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_104 = input.LA(1);

                        s = -1;
                        if ( (LA32_104=='\'') ) {s = 105;}

                        else if ( (LA32_104=='\\') ) {s = 103;}

                        else if ( ((LA32_104>='\u0000' && LA32_104<='&')||(LA32_104>='(' && LA32_104<='[')||(LA32_104>=']' && LA32_104<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_151 = input.LA(1);

                        s = -1;
                        if ( (LA32_151=='\"') ) {s = 102;}

                        else if ( (LA32_151=='\\') ) {s = 100;}

                        else if ( ((LA32_151>='\u0000' && LA32_151<='!')||(LA32_151>='#' && LA32_151<='[')||(LA32_151>=']' && LA32_151<='\uFFFF')) ) {s = 101;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}