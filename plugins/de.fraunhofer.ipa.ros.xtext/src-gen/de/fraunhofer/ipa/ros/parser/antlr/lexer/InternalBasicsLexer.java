package de.fraunhofer.ipa.ros.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicsLexer extends Lexer {
    public static final int RULE_DAY=73;
    public static final int RULE_BEGIN=83;
    public static final int Float32_1=10;
    public static final int Node=58;
    public static final int RULE_DATE_TIME=78;
    public static final int Uint64_1=17;
    public static final int RULE_BOOLEAN=70;
    public static final int RelativeNamespace=5;
    public static final int String=33;
    public static final int RULE_YEAR=75;
    public static final int Int16=45;
    public static final int Result=39;
    public static final int Name=57;
    public static final int RULE_MIN_SEC=77;
    public static final int Float32=21;
    public static final int Goal=55;
    public static final int Bool=53;
    public static final int Uint16=41;
    public static final int ParameterAny=8;
    public static final int List=52;
    public static final int Boolean=18;
    public static final int RightSquareBracket=67;
    public static final int PrivateNamespace=6;
    public static final int Uint8=49;
    public static final int GraphName=9;
    public static final int RULE_ID=79;
    public static final int Byte_1=37;
    public static final int Float64_1=11;
    public static final int RULE_DIGIT=68;
    public static final int Duration=12;
    public static final int Uint32_1=16;
    public static final int GlobalNamespace=7;
    public static final int Double=31;
    public static final int Int16_1=23;
    public static final int Header=32;
    public static final int RULE_INT=81;
    public static final int Byte=54;
    public static final int Type_1=48;
    public static final int Value=50;
    public static final int RULE_ML_COMMENT=88;
    public static final int LeftSquareBracket=66;
    public static final int Uint64=43;
    public static final int Action=35;
    public static final int RULE_END=84;
    public static final int Base64=30;
    public static final int Message=26;
    public static final int Value_1=44;
    public static final int Time=59;
    public static final int RULE_STRING=80;
    public static final int Bool_1=36;
    public static final int Any=61;
    public static final int Struct=34;
    public static final int RULE_SL_COMMENT=85;
    public static final int Comma=64;
    public static final int Uint8_1=28;
    public static final int RULE_MESSAGE_ASIGMENT=82;
    public static final int LeftSquareBracketRightSquareBracket=63;
    public static final int RULE_DOUBLE=72;
    public static final int Feedback=13;
    public static final int ParameterStructMember=4;
    public static final int Int32=46;
    public static final int RULE_ROS_CONVENTION_A=86;
    public static final int RULE_ROS_CONVENTION_PARAM=87;
    public static final int Colon=65;
    public static final int RULE_DECINT=71;
    public static final int EOF=-1;
    public static final int Uint32=42;
    public static final int RULE_HOUR=76;
    public static final int Ns=62;
    public static final int RULE_WS=89;
    public static final int Int64_1=25;
    public static final int Service=27;
    public static final int Int8=56;
    public static final int RULE_ANY_OTHER=90;
    public static final int Default=20;
    public static final int Int8_1=38;
    public static final int Date=51;
    public static final int Uint16_1=15;
    public static final int Integer=19;
    public static final int Array=29;
    public static final int Type=60;
    public static final int Float64=22;
    public static final int Int64=47;
    public static final int Int32_1=24;
    public static final int RULE_MONTH=74;
    public static final int RULE_BINARY=69;
    public static final int String_1=40;
    public static final int String_2=14;

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

    // $ANTLR start "ParameterStructMember"
    public final void mParameterStructMember() throws RecognitionException {
        try {
            int _type = ParameterStructMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:14:23: ( 'ParameterStructMember' )
            // InternalBasicsLexer.g:14:25: 'ParameterStructMember'
            {
            match("ParameterStructMember");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterStructMember"

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:16:19: ( 'RelativeNamespace' )
            // InternalBasicsLexer.g:16:21: 'RelativeNamespace'
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
            // InternalBasicsLexer.g:18:18: ( 'PrivateNamespace' )
            // InternalBasicsLexer.g:18:20: 'PrivateNamespace'
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
            // InternalBasicsLexer.g:20:17: ( 'GlobalNamespace' )
            // InternalBasicsLexer.g:20:19: 'GlobalNamespace'
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
            // InternalBasicsLexer.g:22:14: ( 'ParameterAny' )
            // InternalBasicsLexer.g:22:16: 'ParameterAny'
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
            // InternalBasicsLexer.g:24:11: ( 'GraphName' )
            // InternalBasicsLexer.g:24:13: 'GraphName'
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
            // InternalBasicsLexer.g:26:11: ( 'float32[]' )
            // InternalBasicsLexer.g:26:13: 'float32[]'
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
            // InternalBasicsLexer.g:28:11: ( 'float64[]' )
            // InternalBasicsLexer.g:28:13: 'float64[]'
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

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:46:9: ( 'default' )
            // InternalBasicsLexer.g:46:11: 'default'
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

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:48:9: ( 'float32' )
            // InternalBasicsLexer.g:48:11: 'float32'
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
            // InternalBasicsLexer.g:50:9: ( 'float64' )
            // InternalBasicsLexer.g:50:11: 'float64'
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
            // InternalBasicsLexer.g:52:9: ( 'int16[]' )
            // InternalBasicsLexer.g:52:11: 'int16[]'
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
            // InternalBasicsLexer.g:54:9: ( 'int32[]' )
            // InternalBasicsLexer.g:54:11: 'int32[]'
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
            // InternalBasicsLexer.g:56:9: ( 'int64[]' )
            // InternalBasicsLexer.g:56:11: 'int64[]'
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
            // InternalBasicsLexer.g:58:9: ( 'message' )
            // InternalBasicsLexer.g:58:11: 'message'
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
            // InternalBasicsLexer.g:60:9: ( 'service' )
            // InternalBasicsLexer.g:60:11: 'service'
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
            // InternalBasicsLexer.g:62:9: ( 'uint8[]' )
            // InternalBasicsLexer.g:62:11: 'uint8[]'
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
            // InternalBasicsLexer.g:64:7: ( 'Array:' )
            // InternalBasicsLexer.g:64:9: 'Array:'
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
            // InternalBasicsLexer.g:66:8: ( 'Base64' )
            // InternalBasicsLexer.g:66:10: 'Base64'
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
            // InternalBasicsLexer.g:68:8: ( 'Double' )
            // InternalBasicsLexer.g:68:10: 'Double'
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
            // InternalBasicsLexer.g:70:8: ( 'Header' )
            // InternalBasicsLexer.g:70:10: 'Header'
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
            // InternalBasicsLexer.g:72:8: ( 'String' )
            // InternalBasicsLexer.g:72:10: 'String'
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
            // InternalBasicsLexer.g:74:8: ( 'Struct' )
            // InternalBasicsLexer.g:74:10: 'Struct'
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
            // InternalBasicsLexer.g:76:8: ( 'action' )
            // InternalBasicsLexer.g:76:10: 'action'
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
            // InternalBasicsLexer.g:78:8: ( 'bool[]' )
            // InternalBasicsLexer.g:78:10: 'bool[]'
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
            // InternalBasicsLexer.g:80:8: ( 'byte[]' )
            // InternalBasicsLexer.g:80:10: 'byte[]'
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

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:116:6: ( 'goal' )
            // InternalBasicsLexer.g:116:8: 'goal'
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
            // InternalBasicsLexer.g:118:6: ( 'int8' )
            // InternalBasicsLexer.g:118:8: 'int8'
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
            // InternalBasicsLexer.g:120:6: ( 'name' )
            // InternalBasicsLexer.g:120:8: 'name'
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
            // InternalBasicsLexer.g:122:6: ( 'node' )
            // InternalBasicsLexer.g:122:8: 'node'
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
            // InternalBasicsLexer.g:124:6: ( 'time' )
            // InternalBasicsLexer.g:124:8: 'time'
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
            // InternalBasicsLexer.g:126:6: ( 'type' )
            // InternalBasicsLexer.g:126:8: 'type'
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
            // InternalBasicsLexer.g:128:5: ( 'Any' )
            // InternalBasicsLexer.g:128:7: 'Any'
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
            // InternalBasicsLexer.g:130:4: ( 'ns:' )
            // InternalBasicsLexer.g:130:6: 'ns:'
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
            // InternalBasicsLexer.g:132:37: ( '[]' )
            // InternalBasicsLexer.g:132:39: '[]'
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
            // InternalBasicsLexer.g:134:7: ( ',' )
            // InternalBasicsLexer.g:134:9: ','
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
            // InternalBasicsLexer.g:136:7: ( ':' )
            // InternalBasicsLexer.g:136:9: ':'
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
            // InternalBasicsLexer.g:138:19: ( '[' )
            // InternalBasicsLexer.g:138:21: '['
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
            // InternalBasicsLexer.g:140:20: ( ']' )
            // InternalBasicsLexer.g:140:22: ']'
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
            // InternalBasicsLexer.g:142:21: ( '0' .. '9' )
            // InternalBasicsLexer.g:142:23: '0' .. '9'
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
            // InternalBasicsLexer.g:144:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalBasicsLexer.g:144:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalBasicsLexer.g:144:15: ( '0b' | '0B' )
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
                    // InternalBasicsLexer.g:144:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:144:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalBasicsLexer.g:144:27: ( '0' | '1' )+
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
            // InternalBasicsLexer.g:146:14: ( ( 'true' | 'false' ) )
            // InternalBasicsLexer.g:146:16: ( 'true' | 'false' )
            {
            // InternalBasicsLexer.g:146:16: ( 'true' | 'false' )
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
                    // InternalBasicsLexer.g:146:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:146:24: 'false'
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
            // InternalBasicsLexer.g:148:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalBasicsLexer.g:148:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalBasicsLexer.g:148:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalBasicsLexer.g:148:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalBasicsLexer.g:148:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalBasicsLexer.g:148:31: RULE_DECINT
                            {
                            mRULE_DECINT();

                            }
                            break;

                        default :
                            break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:148:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalBasicsLexer.g:148:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalBasicsLexer.g:148:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalBasicsLexer.g:148:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                                case 1 :
                                    // InternalBasicsLexer.g:148:49: RULE_DIGIT
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

                    // InternalBasicsLexer.g:148:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
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

                    mRULE_DIGIT();

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
            // InternalBasicsLexer.g:150:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalBasicsLexer.g:150:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalBasicsLexer.g:150:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalBasicsLexer.g:150:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:150:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalBasicsLexer.g:150:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // InternalBasicsLexer.g:150:29: RULE_DIGIT
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
                    // InternalBasicsLexer.g:150:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalBasicsLexer.g:150:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                        case 1 :
                            // InternalBasicsLexer.g:150:54: RULE_DIGIT
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
            // InternalBasicsLexer.g:152:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalBasicsLexer.g:152:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalBasicsLexer.g:152:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalBasicsLexer.g:152:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:152:31: '1' .. '3' '0' .. '9'
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
            // InternalBasicsLexer.g:154:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalBasicsLexer.g:154:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalBasicsLexer.g:154:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalBasicsLexer.g:154:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:154:33: '1' '0' .. '2'
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
            // InternalBasicsLexer.g:156:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalBasicsLexer.g:156:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalBasicsLexer.g:158:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalBasicsLexer.g:158:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalBasicsLexer.g:158:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalBasicsLexer.g:158:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:158:41: '2' '0' .. '3'
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
            // InternalBasicsLexer.g:160:23: ( '0' .. '5' '0' .. '9' )
            // InternalBasicsLexer.g:160:25: '0' .. '5' '0' .. '9'
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
            // InternalBasicsLexer.g:162:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalBasicsLexer.g:162:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalBasicsLexer.g:164:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalBasicsLexer.g:164:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalBasicsLexer.g:164:25: ( RULE_ID | RULE_STRING )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='^' && LA15_0<='_')||(LA15_0>='a' && LA15_0<='z')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='\"'||LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBasicsLexer.g:164:26: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:164:34: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;

            }

            match('=');
            // InternalBasicsLexer.g:164:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt16=4;
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
                alt16=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt16=2;
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
                alt16=3;
                }
                break;
            case '-':
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalBasicsLexer.g:164:52: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:164:60: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;
                case 3 :
                    // InternalBasicsLexer.g:164:72: RULE_INT
                    {
                    mRULE_INT();

                    }
                    break;
                case 4 :
                    // InternalBasicsLexer.g:164:81: '-' RULE_INT
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
            // InternalBasicsLexer.g:166:21: ()
            // InternalBasicsLexer.g:166:23:
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
            // InternalBasicsLexer.g:168:19: ()
            // InternalBasicsLexer.g:168:21:
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
            // InternalBasicsLexer.g:170:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalBasicsLexer.g:170:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalBasicsLexer.g:170:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
                case 1 :
                    // InternalBasicsLexer.g:170:23: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:172:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalBasicsLexer.g:172:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalBasicsLexer.g:172:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='/') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='A' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=2;
                }


                switch (alt18) {
                case 1 :
                    // InternalBasicsLexer.g:172:26: '/' RULE_ID
                    {
                    match('/');
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:172:38: RULE_ID '/'
                    {
                    mRULE_ID();
                    match('/');

                    }
                    break;

                default :
                    break loop18;
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
            // InternalBasicsLexer.g:174:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalBasicsLexer.g:174:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalBasicsLexer.g:174:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt19=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt19=2;
                    }
                    break;
                case '~':
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
                case 1 :
                    // InternalBasicsLexer.g:174:30: '/' RULE_STRING
                    {
                    match('/');
                    mRULE_STRING();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:174:46: RULE_STRING '/'
                    {
                    mRULE_STRING();
                    match('/');

                    }
                    break;
                case 3 :
                    // InternalBasicsLexer.g:174:62: '~' RULE_STRING
                    {
                    match('~');
                    mRULE_STRING();

                    }
                    break;

                default :
                    break loop19;
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
            // InternalBasicsLexer.g:176:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBasicsLexer.g:176:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBasicsLexer.g:176:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBasicsLexer.g:176:11: '^'
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

            // InternalBasicsLexer.g:176:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalBasicsLexer.g:178:19: ( ( '0' .. '9' )+ )
            // InternalBasicsLexer.g:178:21: ( '0' .. '9' )+
            {
            // InternalBasicsLexer.g:178:21: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
                case 1 :
                    // InternalBasicsLexer.g:178:22: '0' .. '9'
                    {
                    matchRange('0','9');

                    }
                    break;

                default :
                    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // InternalBasicsLexer.g:180:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBasicsLexer.g:180:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBasicsLexer.g:180:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalBasicsLexer.g:180:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalBasicsLexer.g:180:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                        case 1 :
                            // InternalBasicsLexer.g:180:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalBasicsLexer.g:180:28: ~ ( ( '\\\\' | '\"' ) )
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
                            break loop23;
                        }
                    } while (true);

                    match('\"');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:180:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalBasicsLexer.g:180:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                        case 1 :
                            // InternalBasicsLexer.g:180:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalBasicsLexer.g:180:61: ~ ( ( '\\\\' | '\\'' ) )
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
                            break loop24;
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
            // InternalBasicsLexer.g:182:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBasicsLexer.g:182:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalBasicsLexer.g:182:24: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
                case 1 :
                    // InternalBasicsLexer.g:182:52: .
                    {
                    matchAny();

                    }
                    break;

                default :
                    break loop26;
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
            // InternalBasicsLexer.g:184:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBasicsLexer.g:184:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBasicsLexer.g:184:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
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
                    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // InternalBasicsLexer.g:186:16: ( . )
            // InternalBasicsLexer.g:186:18: .
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
        // InternalBasicsLexer.g:1:8: ( ParameterStructMember | RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | Float32_1 | Float64_1 | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=78;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalBasicsLexer.g:1:10: ParameterStructMember
                {
                mParameterStructMember();

                }
                break;
            case 2 :
                // InternalBasicsLexer.g:1:32: RelativeNamespace
                {
                mRelativeNamespace();

                }
                break;
            case 3 :
                // InternalBasicsLexer.g:1:50: PrivateNamespace
                {
                mPrivateNamespace();

                }
                break;
            case 4 :
                // InternalBasicsLexer.g:1:67: GlobalNamespace
                {
                mGlobalNamespace();

                }
                break;
            case 5 :
                // InternalBasicsLexer.g:1:83: ParameterAny
                {
                mParameterAny();

                }
                break;
            case 6 :
                // InternalBasicsLexer.g:1:96: GraphName
                {
                mGraphName();

                }
                break;
            case 7 :
                // InternalBasicsLexer.g:1:106: Float32_1
                {
                mFloat32_1();

                }
                break;
            case 8 :
                // InternalBasicsLexer.g:1:116: Float64_1
                {
                mFloat64_1();

                }
                break;
            case 9 :
                // InternalBasicsLexer.g:1:126: Duration
                {
                mDuration();

                }
                break;
            case 10 :
                // InternalBasicsLexer.g:1:135: Feedback
                {
                mFeedback();

                }
                break;
            case 11 :
                // InternalBasicsLexer.g:1:144: String_2
                {
                mString_2();

                }
                break;
            case 12 :
                // InternalBasicsLexer.g:1:153: Uint16_1
                {
                mUint16_1();

                }
                break;
            case 13 :
                // InternalBasicsLexer.g:1:162: Uint32_1
                {
                mUint32_1();

                }
                break;
            case 14 :
                // InternalBasicsLexer.g:1:171: Uint64_1
                {
                mUint64_1();

                }
                break;
            case 15 :
                // InternalBasicsLexer.g:1:180: Boolean
                {
                mBoolean();

                }
                break;
            case 16 :
                // InternalBasicsLexer.g:1:188: Integer
                {
                mInteger();

                }
                break;
            case 17 :
                // InternalBasicsLexer.g:1:196: Default
                {
                mDefault();

                }
                break;
            case 18 :
                // InternalBasicsLexer.g:1:204: Float32
                {
                mFloat32();

                }
                break;
            case 19 :
                // InternalBasicsLexer.g:1:212: Float64
                {
                mFloat64();

                }
                break;
            case 20 :
                // InternalBasicsLexer.g:1:220: Int16_1
                {
                mInt16_1();

                }
                break;
            case 21 :
                // InternalBasicsLexer.g:1:228: Int32_1
                {
                mInt32_1();

                }
                break;
            case 22 :
                // InternalBasicsLexer.g:1:236: Int64_1
                {
                mInt64_1();

                }
                break;
            case 23 :
                // InternalBasicsLexer.g:1:244: Message
                {
                mMessage();

                }
                break;
            case 24 :
                // InternalBasicsLexer.g:1:252: Service
                {
                mService();

                }
                break;
            case 25 :
                // InternalBasicsLexer.g:1:260: Uint8_1
                {
                mUint8_1();

                }
                break;
            case 26 :
                // InternalBasicsLexer.g:1:268: Array
                {
                mArray();

                }
                break;
            case 27 :
                // InternalBasicsLexer.g:1:274: Base64
                {
                mBase64();

                }
                break;
            case 28 :
                // InternalBasicsLexer.g:1:281: Double
                {
                mDouble();

                }
                break;
            case 29 :
                // InternalBasicsLexer.g:1:288: Header
                {
                mHeader();

                }
                break;
            case 30 :
                // InternalBasicsLexer.g:1:295: String
                {
                mString();

                }
                break;
            case 31 :
                // InternalBasicsLexer.g:1:302: Struct
                {
                mStruct();

                }
                break;
            case 32 :
                // InternalBasicsLexer.g:1:309: Action
                {
                mAction();

                }
                break;
            case 33 :
                // InternalBasicsLexer.g:1:316: Bool_1
                {
                mBool_1();

                }
                break;
            case 34 :
                // InternalBasicsLexer.g:1:323: Byte_1
                {
                mByte_1();

                }
                break;
            case 35 :
                // InternalBasicsLexer.g:1:330: Int8_1
                {
                mInt8_1();

                }
                break;
            case 36 :
                // InternalBasicsLexer.g:1:337: Result
                {
                mResult();

                }
                break;
            case 37 :
                // InternalBasicsLexer.g:1:344: String_1
                {
                mString_1();

                }
                break;
            case 38 :
                // InternalBasicsLexer.g:1:353: Uint16
                {
                mUint16();

                }
                break;
            case 39 :
                // InternalBasicsLexer.g:1:360: Uint32
                {
                mUint32();

                }
                break;
            case 40 :
                // InternalBasicsLexer.g:1:367: Uint64
                {
                mUint64();

                }
                break;
            case 41 :
                // InternalBasicsLexer.g:1:374: Value_1
                {
                mValue_1();

                }
                break;
            case 42 :
                // InternalBasicsLexer.g:1:382: Int16
                {
                mInt16();

                }
                break;
            case 43 :
                // InternalBasicsLexer.g:1:388: Int32
                {
                mInt32();

                }
                break;
            case 44 :
                // InternalBasicsLexer.g:1:394: Int64
                {
                mInt64();

                }
                break;
            case 45 :
                // InternalBasicsLexer.g:1:400: Type_1
                {
                mType_1();

                }
                break;
            case 46 :
                // InternalBasicsLexer.g:1:407: Uint8
                {
                mUint8();

                }
                break;
            case 47 :
                // InternalBasicsLexer.g:1:413: Value
                {
                mValue();

                }
                break;
            case 48 :
                // InternalBasicsLexer.g:1:419: Date
                {
                mDate();

                }
                break;
            case 49 :
                // InternalBasicsLexer.g:1:424: List
                {
                mList();

                }
                break;
            case 50 :
                // InternalBasicsLexer.g:1:429: Bool
                {
                mBool();

                }
                break;
            case 51 :
                // InternalBasicsLexer.g:1:434: Byte
                {
                mByte();

                }
                break;
            case 52 :
                // InternalBasicsLexer.g:1:439: Goal
                {
                mGoal();

                }
                break;
            case 53 :
                // InternalBasicsLexer.g:1:444: Int8
                {
                mInt8();

                }
                break;
            case 54 :
                // InternalBasicsLexer.g:1:449: Name
                {
                mName();

                }
                break;
            case 55 :
                // InternalBasicsLexer.g:1:454: Node
                {
                mNode();

                }
                break;
            case 56 :
                // InternalBasicsLexer.g:1:459: Time
                {
                mTime();

                }
                break;
            case 57 :
                // InternalBasicsLexer.g:1:464: Type
                {
                mType();

                }
                break;
            case 58 :
                // InternalBasicsLexer.g:1:469: Any
                {
                mAny();

                }
                break;
            case 59 :
                // InternalBasicsLexer.g:1:473: Ns
                {
                mNs();

                }
                break;
            case 60 :
                // InternalBasicsLexer.g:1:476: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket();

                }
                break;
            case 61 :
                // InternalBasicsLexer.g:1:512: Comma
                {
                mComma();

                }
                break;
            case 62 :
                // InternalBasicsLexer.g:1:518: Colon
                {
                mColon();

                }
                break;
            case 63 :
                // InternalBasicsLexer.g:1:524: LeftSquareBracket
                {
                mLeftSquareBracket();

                }
                break;
            case 64 :
                // InternalBasicsLexer.g:1:542: RightSquareBracket
                {
                mRightSquareBracket();

                }
                break;
            case 65 :
                // InternalBasicsLexer.g:1:561: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 66 :
                // InternalBasicsLexer.g:1:573: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 67 :
                // InternalBasicsLexer.g:1:586: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 68 :
                // InternalBasicsLexer.g:1:598: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 69 :
                // InternalBasicsLexer.g:1:610: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 70 :
                // InternalBasicsLexer.g:1:625: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT();

                }
                break;
            case 71 :
                // InternalBasicsLexer.g:1:647: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 72 :
                // InternalBasicsLexer.g:1:663: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A();

                }
                break;
            case 73 :
                // InternalBasicsLexer.g:1:685: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM();

                }
                break;
            case 74 :
                // InternalBasicsLexer.g:1:711: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 75 :
                // InternalBasicsLexer.g:1:719: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 76 :
                // InternalBasicsLexer.g:1:731: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 77 :
                // InternalBasicsLexer.g:1:747: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 78 :
                // InternalBasicsLexer.g:1:755: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER();

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA8_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA8_eofS =
        "\10\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA8_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
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
            return "148:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA28_eotS =
        "\1\46\27\55\1\123\3\uffff\2\131\1\51\1\131\1\51\1\55\2\51\1\uffff\1\51\1\uffff\1\51\2\uffff\3\55\2\uffff\43\55\11\uffff\1\131\1\55\2\uffff\1\u008e\2\uffff\1\u008e\4\uffff\23\55\1\u00a6\20\55\1\uffff\1\131\3\uffff\23\55\1\u00d0\2\55\1\uffff\1\55\1\u00d4\4\55\1\u00da\1\u00dc\2\55\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\131\7\55\1\u00e2\7\55\1\u00f7\3\55\1\u00fc\1\u00fe\1\u0100\2\uffff\3\55\1\uffff\4\55\4\uffff\1\55\1\u010a\10\uffff\12\55\1\u0116\1\55\1\u0119\1\u011b\1\u011d\2\uffff\1\55\1\u011f\1\55\6\uffff\1\55\1\uffff\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\2\uffff\5\55\1\u012e\1\u0130\2\55\1\u0133\2\uffff\1\u0134\6\uffff\1\u0135\1\uffff\1\u0136\1\u0137\6\uffff\5\55\4\uffff\1\u013d\1\u013e\5\uffff\4\55\1\u0144\2\uffff\5\55\1\uffff\6\55\1\u0150\4\55\1\uffff\12\55\1\u015f\1\55\1\u0161\1\55\1\uffff\1\55\1\uffff\1\u0164\1\55\1\uffff\2\55\1\u0168\1\uffff";
    static final String DFA28_eofS =
        "\u0169\uffff";
    static final String DFA28_minS =
        "\1\0\27\57\1\135\3\uffff\2\56\1\60\1\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\3\57\2\uffff\43\57\11\uffff\1\60\1\57\2\0\1\57\2\0\1\57\4\uffff\44\57\1\uffff\1\60\1\0\1\uffff\1\0\26\57\1\uffff\21\57\1\55\26\57\2\uffff\3\57\1\uffff\4\57\4\uffff\2\57\10\uffff\17\57\2\uffff\3\57\6\uffff\1\57\1\uffff\6\57\2\uffff\12\57\2\uffff\1\57\6\uffff\1\57\1\uffff\2\57\6\uffff\5\57\4\uffff\2\57\5\uffff\5\57\2\uffff\5\57\1\uffff\13\57\1\uffff\16\57\1\uffff\1\57\1\uffff\2\57\1\uffff\3\57\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\27\172\1\135\3\uffff\2\145\1\71\1\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\3\172\2\uffff\43\172\11\uffff\1\71\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\44\172\1\uffff\1\71\1\uffff\1\uffff\1\uffff\26\172\1\uffff\21\172\1\55\26\172\2\uffff\3\172\1\uffff\4\172\4\uffff\2\172\10\uffff\17\172\2\uffff\3\172\6\uffff\1\172\1\uffff\6\172\2\uffff\12\172\2\uffff\1\172\6\uffff\1\172\1\uffff\2\172\6\uffff\5\172\4\uffff\2\172\5\uffff\5\172\2\uffff\5\172\1\uffff\13\172\1\uffff\16\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff";
    static final String DFA28_acceptS =
        "\31\uffff\1\75\1\76\1\100\10\uffff\1\107\1\uffff\1\110\1\uffff\1\115\1\116\3\uffff\1\112\1\106\43\uffff\1\74\1\77\1\75\1\76\1\100\1\101\1\105\1\104\1\103\10\uffff\1\107\1\114\1\111\1\115\44\uffff\1\73\2\uffff\1\113\27\uffff\1\72\50\uffff\1\43\1\65\3\uffff\1\60\4\uffff\1\41\1\62\1\42\1\63\2\uffff\1\55\1\71\1\70\1\102\1\61\1\64\1\66\1\67\17\uffff\1\31\1\56\3\uffff\1\24\1\52\1\25\1\53\1\26\1\54\1\uffff\1\32\6\uffff\1\51\1\57\12\uffff\1\13\1\45\1\uffff\1\14\1\46\1\15\1\47\1\16\1\50\1\uffff\1\33\2\uffff\1\34\1\35\1\36\1\37\1\40\1\44\5\uffff\1\7\1\22\1\10\1\23\2\uffff\1\21\1\30\1\17\1\20\1\27\5\uffff\1\12\1\11\5\uffff\1\6\13\uffff\1\5\16\uffff\1\4\1\uffff\1\3\2\uffff\1\2\3\uffff\1\1";
    static final String DFA28_specialS =
        "\1\6\41\uffff\1\10\1\7\71\uffff\1\0\1\5\1\uffff\1\3\1\2\53\uffff\1\4\1\uffff\1\1\u00d9\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\42\1\44\3\51\1\43\4\51\1\31\1\36\1\51\1\45\1\34\2\35\7\37\1\32\6\51\1\14\1\10\1\41\1\15\2\41\1\3\1\16\1\11\2\41\1\25\3\41\1\1\1\41\1\2\1\17\7\41\1\30\1\51\1\33\1\40\1\41\1\51\1\20\1\21\1\41\1\5\1\41\1\4\1\26\1\41\1\12\3\41\1\13\1\27\3\41\1\22\1\6\1\24\1\7\1\23\4\41\3\51\1\47\uff81\51",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\52\20\54\1\53\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\57\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\60\5\54\1\61\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\64\3\54\1\63\6\54\1\62\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\66\17\54\1\65\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\70\16\54\1\67\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\71\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\73\15\54\1\72\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\74\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\75\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\76\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\100\3\54\1\77\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\102\15\54\1\101\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\103\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\104\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\105\27\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\106\11\54\1\107\1\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\110\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\111\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\113\10\54\1\114\6\54\1\112\1\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\115\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\116\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\117\15\54\1\120\3\54\1\121\7\54",
            "\1\122",
            "",
            "",
            "",
            "\1\132\1\uffff\12\130\10\uffff\1\127\2\uffff\1\132\34\uffff\1\127\2\uffff\1\132",
            "\1\132\1\uffff\12\133\13\uffff\1\132\37\uffff\1\132",
            "\12\131",
            "\1\132\26\uffff\1\132\37\uffff\1\132",
            "\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\42\136\1\137\71\136\1\135\uffa3\136",
            "\47\141\1\142\64\141\1\140\uffa3\141",
            "",
            "\1\145\4\uffff\1\145\2\uffff\1\144\26\uffff\32\46\3\uffff\2\46\1\uffff\32\46",
            "",
            "\1\145\4\uffff\1\145",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\147\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\150\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\151\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\152\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\153\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\154\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\155\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\156\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\157\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\5\54\1\160\24\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\161\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\162\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\163\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\164\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\165\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\166\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\167\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\170\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\171\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\30\54\1\172\1\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\173\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\174\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\175\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\176\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\177\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\u0080\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u0081\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u0082\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u0083\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\17\54\1\u0084\12\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u0085\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u0086\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u0087\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0088\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u0089\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\u008a\26\54",
            "\1\46\12\54\1\u008b\2\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u008c",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\0\u008d",
            "\42\136\1\137\71\136\1\135\uffa3\136",
            "\1\145\15\uffff\1\56",
            "\0\u008f",
            "\47\141\1\142\64\141\1\140\uffa3\141",
            "\1\145\15\uffff\1\56",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0090\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\25\54\1\u0091\4\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0092\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\54\1\u0093\30\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\17\54\1\u0094\12\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0095\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\u0096\26\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u0097\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0098\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0099\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u009a\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\25\54\1\u009b\4\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u009c\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u009d\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u009e\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u009f\25\54",
            "\1\46\1\54\1\u00a0\1\54\1\u00a1\2\54\1\u00a2\1\54\1\u00a3\1\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u00a4\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u00a5\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\54\1\u00a7\30\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00a8\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\u00a9\26\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00aa\13\54\1\u00ab\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00ac\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00ad\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00ae\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u00af\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u00b0\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00b1\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00b2\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00b3\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00b4\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00b5\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00b6\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00b7\25\54",
            "",
            "\12\u00b8",
            "\42\136\1\137\71\136\1\135\uffa3\136",
            "",
            "\47\141\1\142\64\141\1\140\uffa3\141",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u00b9\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u00ba\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00bb\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u00bc\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\7\54\1\u00bd\22\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00be\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\54\1\u00bf\30\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00c0\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00c1\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u00c2\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u00c3\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00c4\21\54",
            "\1\46\1\54\1\u00c5\1\54\1\u00c6\2\54\1\u00c7\1\54\1\u00c8\1\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00c9\25\54",
            "\1\46\6\54\1\u00ca\3\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\6\54\1\u00cb\23\54",
            "\1\46\6\54\1\u00cc\3\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\2\54\1\u00cd\7\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\4\54\1\u00ce\5\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00cf\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u00d1\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\30\54\1\u00d2\1\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00d3\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00d5\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u00d6\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u00d7\27\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\u00d8\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00d9\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00db\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00dd\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00de\25\54",
            "\1\46\12\54\1\u00df\2\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\130",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00e7\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00e8\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00e9\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00ea\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\15\54\1\u00eb\14\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\3\54\1\u00ec\2\54\1\u00ed\3\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u00ee\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00ef\21\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00f0\16\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\6\54\1\u00f1\23\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u00f2\27\54",
            "\1\46\6\54\1\u00f3\3\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\2\54\1\u00f4\7\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\4\54\1\u00f5\5\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00f6\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u00f8\31\54",
            "\1\46\4\54\1\u00f9\5\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00fa\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00fb\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00fd\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u00ff\3\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\6\54\1\u0101\23\54",
            "\1\46\12\54\1\u0102\2\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0103\25\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u0104\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\6\54\1\u0105\23\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u0106\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u0107\14\54",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u0108\6\54",
            "\1\46\12\54\1\u0109\2\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u010b\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u010c\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\25\54\1\u010d\4\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\15\54\1\u010e\14\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u010f\31\54",
            "\1\46\2\54\1\u0110\7\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\4\54\1\u0111\5\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u0112\27\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\u0113\13\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u0114\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u0115\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0117\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u0118\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u011a\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u011c\3\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u011e\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u0120\10\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0121\25\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0128\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\15\54\1\u0129\14\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u012a\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u012b\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u012c\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u012d\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\1\u012f\3\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\12\54\1\u0131\17\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u0132\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u0138\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0139\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\15\54\1\u013a\14\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u013b\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u013c\25\54",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\1\u0140\21\54\1\u013f\7\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u0141\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0142\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0143\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u0145\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u0146\14\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0147\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u0148\15\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u0149\7\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u014a\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\30\54\1\u014b\1\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u014c\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u014d\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\17\54\1\u014e\12\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u014f\5\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\17\54\1\u0151\12\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u0152\7\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0153\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u0154\27\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u0155\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\17\54\1\u0156\12\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u0157\27\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u0158\6\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u0159\27\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\u015a\31\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u015b\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\14\54\1\u015c\15\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u015d\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u015e\27\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0160\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0162\25\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\14\54\1\u0163\15\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\1\54\1\u0165\30\54",
            "",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0166\25\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u0167\10\54",
            "\1\46\12\54\3\uffff\1\56\3\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ParameterStructMember | RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | Float32_1 | Float64_1 | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA28_93 = input.LA(1);

                        s = -1;
                        if ( ((LA28_93>='\u0000' && LA28_93<='\uFFFF')) ) {s = 141;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA28_143 = input.LA(1);

                        s = -1;
                        if ( (LA28_143=='\'') ) {s = 98;}

                        else if ( (LA28_143=='\\') ) {s = 96;}

                        else if ( ((LA28_143>='\u0000' && LA28_143<='&')||(LA28_143>='(' && LA28_143<='[')||(LA28_143>=']' && LA28_143<='\uFFFF')) ) {s = 97;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA28_97 = input.LA(1);

                        s = -1;
                        if ( (LA28_97=='\'') ) {s = 98;}

                        else if ( (LA28_97=='\\') ) {s = 96;}

                        else if ( ((LA28_97>='\u0000' && LA28_97<='&')||(LA28_97>='(' && LA28_97<='[')||(LA28_97>=']' && LA28_97<='\uFFFF')) ) {s = 97;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA28_96 = input.LA(1);

                        s = -1;
                        if ( ((LA28_96>='\u0000' && LA28_96<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA28_141 = input.LA(1);

                        s = -1;
                        if ( (LA28_141=='\"') ) {s = 95;}

                        else if ( (LA28_141=='\\') ) {s = 93;}

                        else if ( ((LA28_141>='\u0000' && LA28_141<='!')||(LA28_141>='#' && LA28_141<='[')||(LA28_141>=']' && LA28_141<='\uFFFF')) ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA28_94 = input.LA(1);

                        s = -1;
                        if ( (LA28_94=='\"') ) {s = 95;}

                        else if ( (LA28_94=='\\') ) {s = 93;}

                        else if ( ((LA28_94>='\u0000' && LA28_94<='!')||(LA28_94>='#' && LA28_94<='[')||(LA28_94>=']' && LA28_94<='\uFFFF')) ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='P') ) {s = 1;}

                        else if ( (LA28_0=='R') ) {s = 2;}

                        else if ( (LA28_0=='G') ) {s = 3;}

                        else if ( (LA28_0=='f') ) {s = 4;}

                        else if ( (LA28_0=='d') ) {s = 5;}

                        else if ( (LA28_0=='s') ) {s = 6;}

                        else if ( (LA28_0=='u') ) {s = 7;}

                        else if ( (LA28_0=='B') ) {s = 8;}

                        else if ( (LA28_0=='I') ) {s = 9;}

                        else if ( (LA28_0=='i') ) {s = 10;}

                        else if ( (LA28_0=='m') ) {s = 11;}

                        else if ( (LA28_0=='A') ) {s = 12;}

                        else if ( (LA28_0=='D') ) {s = 13;}

                        else if ( (LA28_0=='H') ) {s = 14;}

                        else if ( (LA28_0=='S') ) {s = 15;}

                        else if ( (LA28_0=='a') ) {s = 16;}

                        else if ( (LA28_0=='b') ) {s = 17;}

                        else if ( (LA28_0=='r') ) {s = 18;}

                        else if ( (LA28_0=='v') ) {s = 19;}

                        else if ( (LA28_0=='t') ) {s = 20;}

                        else if ( (LA28_0=='L') ) {s = 21;}

                        else if ( (LA28_0=='g') ) {s = 22;}

                        else if ( (LA28_0=='n') ) {s = 23;}

                        else if ( (LA28_0=='[') ) {s = 24;}

                        else if ( (LA28_0==',') ) {s = 25;}

                        else if ( (LA28_0==':') ) {s = 26;}

                        else if ( (LA28_0==']') ) {s = 27;}

                        else if ( (LA28_0=='0') ) {s = 28;}

                        else if ( ((LA28_0>='1' && LA28_0<='2')) ) {s = 29;}

                        else if ( (LA28_0=='-') ) {s = 30;}

                        else if ( ((LA28_0>='3' && LA28_0<='9')) ) {s = 31;}

                        else if ( (LA28_0=='^') ) {s = 32;}

                        else if ( (LA28_0=='C'||(LA28_0>='E' && LA28_0<='F')||(LA28_0>='J' && LA28_0<='K')||(LA28_0>='M' && LA28_0<='O')||LA28_0=='Q'||(LA28_0>='T' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='c'||LA28_0=='e'||LA28_0=='h'||(LA28_0>='j' && LA28_0<='l')||(LA28_0>='o' && LA28_0<='q')||(LA28_0>='w' && LA28_0<='z')) ) {s = 33;}

                        else if ( (LA28_0=='\"') ) {s = 34;}

                        else if ( (LA28_0=='\'') ) {s = 35;}

                        else if ( (LA28_0=='#') ) {s = 36;}

                        else if ( (LA28_0=='/') ) {s = 37;}

                        else if ( (LA28_0=='~') ) {s = 39;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 40;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='!'||(LA28_0>='$' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='+')||LA28_0=='.'||(LA28_0>=';' && LA28_0<='@')||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='{' && LA28_0<='}')||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 41;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA28_35 = input.LA(1);

                        s = -1;
                        if ( (LA28_35=='\\') ) {s = 96;}

                        else if ( ((LA28_35>='\u0000' && LA28_35<='&')||(LA28_35>='(' && LA28_35<='[')||(LA28_35>=']' && LA28_35<='\uFFFF')) ) {s = 97;}

                        else if ( (LA28_35=='\'') ) {s = 98;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA28_34 = input.LA(1);

                        s = -1;
                        if ( (LA28_34=='\\') ) {s = 93;}

                        else if ( ((LA28_34>='\u0000' && LA28_34<='!')||(LA28_34>='#' && LA28_34<='[')||(LA28_34>=']' && LA28_34<='\uFFFF')) ) {s = 94;}

                        else if ( (LA28_34=='\"') ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}
