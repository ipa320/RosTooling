package de.fraunhofer.ipa.ros.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import de.fraunhofer.ipa.ros.services.BasicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "GraphName", "Float32_1", "Float64_1", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Default", "Duration", "Feedback", "Boolean", "Integer", "Int16_1", "Int32_1", "Int64_1", "Uint8_1", "Float32", "Float64", "Message", "Service", "Array", "Base64", "Double", "Header", "String", "Struct", "Bool_1", "Byte_1", "Int8_1", "Action", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=72;
    public static final int RULE_BEGIN=82;
    public static final int Float32_1=9;
    public static final int Node=57;
    public static final int RULE_DATE_TIME=77;
    public static final int Uint64_1=14;
    public static final int RULE_BOOLEAN=69;
    public static final int RelativeNamespace=4;
    public static final int String=32;
    public static final int RULE_YEAR=74;
    public static final int Int16=44;
    public static final int Result=38;
    public static final int Name=56;
    public static final int RULE_MIN_SEC=76;
    public static final int Float32=24;
    public static final int Goal=54;
    public static final int Bool=52;
    public static final int Uint16=40;
    public static final int ParameterAny=7;
    public static final int List=51;
    public static final int Boolean=18;
    public static final int RightSquareBracket=66;
    public static final int PrivateNamespace=5;
    public static final int Uint8=48;
    public static final int GraphName=8;
    public static final int RULE_ID=78;
    public static final int Byte_1=35;
    public static final int Float64_1=10;
    public static final int RULE_DIGIT=67;
    public static final int Uint32_1=13;
    public static final int Duration=16;
    public static final int GlobalNamespace=6;
    public static final int Double=30;
    public static final int Int16_1=20;
    public static final int Header=31;
    public static final int RULE_INT=80;
    public static final int Byte=53;
    public static final int Type_1=47;
    public static final int Value=49;
    public static final int RULE_ML_COMMENT=87;
    public static final int LeftSquareBracket=65;
    public static final int Uint64=42;
    public static final int Action=37;
    public static final int RULE_END=83;
    public static final int Base64=29;
    public static final int Message=26;
    public static final int Value_1=43;
    public static final int Time=58;
    public static final int RULE_STRING=79;
    public static final int Bool_1=34;
    public static final int Any=60;
    public static final int Struct=33;
    public static final int RULE_SL_COMMENT=84;
    public static final int Comma=62;
    public static final int Uint8_1=23;
    public static final int HyphenMinus=63;
    public static final int RULE_MESSAGE_ASIGMENT=81;
    public static final int RULE_DOUBLE=71;
    public static final int Feedback=17;
    public static final int Int32=45;
    public static final int RULE_ROS_CONVENTION_A=85;
    public static final int RULE_ROS_CONVENTION_PARAM=86;
    public static final int Colon=64;
    public static final int RULE_DECINT=70;
    public static final int EOF=-1;
    public static final int Uint32=41;
    public static final int RULE_HOUR=75;
    public static final int Ns=61;
    public static final int RULE_WS=88;
    public static final int Int64_1=22;
    public static final int Service=27;
    public static final int Int8=55;
    public static final int RULE_ANY_OTHER=89;
    public static final int Default=15;
    public static final int Int8_1=36;
    public static final int Date=50;
    public static final int Uint16_1=12;
    public static final int Integer=19;
    public static final int Array=28;
    public static final int Type=59;
    public static final int Float64=25;
    public static final int Int64=46;
    public static final int Int32_1=21;
    public static final int RULE_MONTH=73;
    public static final int RULE_BINARY=68;
    public static final int String_1=39;
    public static final int String_2=11;

    // delegates
    // delegators


        public InternalBasicsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBasicsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalBasicsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBasicsParser.g"; }


        private BasicsGrammarAccess grammarAccess;
        private final Map<String, String> tokenNameToValue = new HashMap<String, String>();

        {
            tokenNameToValue.put("Comma", "','");
            tokenNameToValue.put("HyphenMinus", "'-'");
            tokenNameToValue.put("Colon", "':'");
            tokenNameToValue.put("LeftSquareBracket", "'['");
            tokenNameToValue.put("RightSquareBracket", "']'");
            tokenNameToValue.put("Any", "'Any'");
            tokenNameToValue.put("Ns", "'ns:'");
            tokenNameToValue.put("Date", "'Date'");
            tokenNameToValue.put("List", "'List'");
            tokenNameToValue.put("Bool", "'bool'");
            tokenNameToValue.put("Byte", "'byte'");
            tokenNameToValue.put("Goal", "'goal'");
            tokenNameToValue.put("Int8", "'int8'");
            tokenNameToValue.put("Name", "'name'");
            tokenNameToValue.put("Node", "'node'");
            tokenNameToValue.put("Time", "'time'");
            tokenNameToValue.put("Type", "'type'");
            tokenNameToValue.put("Int16", "'int16'");
            tokenNameToValue.put("Int32", "'int32'");
            tokenNameToValue.put("Int64", "'int64'");
            tokenNameToValue.put("Type_1", "'type:'");
            tokenNameToValue.put("Uint8", "'uint8'");
            tokenNameToValue.put("Value", "'value'");
            tokenNameToValue.put("Array", "'Array:'");
            tokenNameToValue.put("Base64", "'Base64'");
            tokenNameToValue.put("Double", "'Double'");
            tokenNameToValue.put("Header", "'Header'");
            tokenNameToValue.put("String", "'String'");
            tokenNameToValue.put("Struct", "'Struct'");
            tokenNameToValue.put("Bool_1", "'[bool]'");
            tokenNameToValue.put("Byte_1", "'[byte]'");
            tokenNameToValue.put("Int8_1", "'[int8]'");
            tokenNameToValue.put("Action", "'action'");
            tokenNameToValue.put("Result", "'result'");
            tokenNameToValue.put("String_1", "'string'");
            tokenNameToValue.put("Uint16", "'uint16'");
            tokenNameToValue.put("Uint32", "'uint32'");
            tokenNameToValue.put("Uint64", "'uint64'");
            tokenNameToValue.put("Value_1", "'value:'");
            tokenNameToValue.put("Boolean", "'Boolean'");
            tokenNameToValue.put("Integer", "'Integer'");
            tokenNameToValue.put("Int16_1", "'[int16]'");
            tokenNameToValue.put("Int32_1", "'[int32]'");
            tokenNameToValue.put("Int64_1", "'[int64]'");
            tokenNameToValue.put("Uint8_1", "'[uint8]'");
            tokenNameToValue.put("Float32", "'float32'");
            tokenNameToValue.put("Float64", "'float64'");
            tokenNameToValue.put("Message", "'message'");
            tokenNameToValue.put("Service", "'service'");
            tokenNameToValue.put("String_2", "'[string]'");
            tokenNameToValue.put("Uint16_1", "'[uint16]'");
            tokenNameToValue.put("Uint32_1", "'[uint32]'");
            tokenNameToValue.put("Uint64_1", "'[uint64]'");
            tokenNameToValue.put("Default", "'default:'");
            tokenNameToValue.put("Duration", "'duration'");
            tokenNameToValue.put("Feedback", "'feedback'");
            tokenNameToValue.put("GraphName", "'GraphName'");
            tokenNameToValue.put("Float32_1", "'[float32]'");
            tokenNameToValue.put("Float64_1", "'[float64]'");
            tokenNameToValue.put("ParameterAny", "'ParameterAny'");
            tokenNameToValue.put("GlobalNamespace", "'GlobalNamespace'");
            tokenNameToValue.put("PrivateNamespace", "'PrivateNamespace'");
            tokenNameToValue.put("RelativeNamespace", "'RelativeNamespace'");
        }

        public void setGrammarAccess(BasicsGrammarAccess grammarAccess) {
            this.grammarAccess = grammarAccess;
        }

        @Override
        protected Grammar getGrammar() {
            return grammarAccess.getGrammar();
        }

        @Override
        protected String getValueForTokenName(String tokenName) {
            String result = tokenNameToValue.get(tokenName);
            if (result == null)
                result = tokenName;
            return result;
        }



    // $ANTLR start "entryRuleNamespace"
    // InternalBasicsParser.g:118:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalBasicsParser.g:119:1: ( ruleNamespace EOF )
            // InternalBasicsParser.g:120:1: ruleNamespace EOF
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
    // InternalBasicsParser.g:127:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:131:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalBasicsParser.g:132:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalBasicsParser.g:132:2: ( ( rule__Namespace__Alternatives ) )
            // InternalBasicsParser.g:133:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives());
            // InternalBasicsParser.g:134:3: ( rule__Namespace__Alternatives )
            // InternalBasicsParser.g:134:4: rule__Namespace__Alternatives
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
    // InternalBasicsParser.g:143:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalBasicsParser.g:144:1: ( ruleGraphName EOF )
            // InternalBasicsParser.g:145:1: ruleGraphName EOF
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
    // InternalBasicsParser.g:152:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:156:2: ( ( GraphName ) )
            // InternalBasicsParser.g:157:2: ( GraphName )
            {
            // InternalBasicsParser.g:157:2: ( GraphName )
            // InternalBasicsParser.g:158:3: GraphName
            {
             before(grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            match(input,GraphName,FOLLOW_2);
             after(grammarAccess.getGraphNameAccess().getGraphNameKeyword());

            }


            }

        }
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
    // InternalBasicsParser.g:168:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalBasicsParser.g:169:1: ( ruleGlobalNamespace EOF )
            // InternalBasicsParser.g:170:1: ruleGlobalNamespace EOF
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
    // InternalBasicsParser.g:177:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:181:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalBasicsParser.g:182:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalBasicsParser.g:182:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalBasicsParser.g:183:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup());
            // InternalBasicsParser.g:184:3: ( rule__GlobalNamespace__Group__0 )
            // InternalBasicsParser.g:184:4: rule__GlobalNamespace__Group__0
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
    // InternalBasicsParser.g:193:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalBasicsParser.g:194:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalBasicsParser.g:195:1: ruleRelativeNamespace_Impl EOF
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
    // InternalBasicsParser.g:202:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:206:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalBasicsParser.g:207:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalBasicsParser.g:207:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalBasicsParser.g:208:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup());
            // InternalBasicsParser.g:209:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalBasicsParser.g:209:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalBasicsParser.g:218:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalBasicsParser.g:219:1: ( rulePrivateNamespace EOF )
            // InternalBasicsParser.g:220:1: rulePrivateNamespace EOF
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
    // InternalBasicsParser.g:227:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:231:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalBasicsParser.g:232:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalBasicsParser.g:232:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalBasicsParser.g:233:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup());
            // InternalBasicsParser.g:234:3: ( rule__PrivateNamespace__Group__0 )
            // InternalBasicsParser.g:234:4: rule__PrivateNamespace__Group__0
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


    // $ANTLR start "entryRuleParameterType"
    // InternalBasicsParser.g:243:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:244:1: ( ruleParameterType EOF )
            // InternalBasicsParser.g:245:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule());
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalBasicsParser.g:252:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:256:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalBasicsParser.g:257:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalBasicsParser.g:257:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalBasicsParser.g:258:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives());
            // InternalBasicsParser.g:259:3: ( rule__ParameterType__Alternatives )
            // InternalBasicsParser.g:259:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalBasicsParser.g:268:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBasicsParser.g:269:1: ( ruleParameterValue EOF )
            // InternalBasicsParser.g:270:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule());
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule());
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalBasicsParser.g:277:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:281:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBasicsParser.g:282:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBasicsParser.g:282:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBasicsParser.g:283:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives());
            // InternalBasicsParser.g:284:3: ( rule__ParameterValue__Alternatives )
            // InternalBasicsParser.g:284:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalBasicsParser.g:293:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:294:1: ( ruleParameterListType EOF )
            // InternalBasicsParser.g:295:1: ruleParameterListType EOF
            {
             before(grammarAccess.getParameterListTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterListType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeRule());
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
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalBasicsParser.g:302:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:306:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalBasicsParser.g:307:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalBasicsParser.g:307:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalBasicsParser.g:308:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup());
            // InternalBasicsParser.g:309:3: ( rule__ParameterListType__Group__0 )
            // InternalBasicsParser.g:309:4: rule__ParameterListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalBasicsParser.g:318:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:319:1: ( ruleParameterStructType EOF )
            // InternalBasicsParser.g:320:1: ruleParameterStructType EOF
            {
             before(grammarAccess.getParameterStructTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterStructType();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeRule());
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
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalBasicsParser.g:327:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:331:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalBasicsParser.g:332:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalBasicsParser.g:332:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalBasicsParser.g:333:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup());
            // InternalBasicsParser.g:334:3: ( rule__ParameterStructType__Group__0 )
            // InternalBasicsParser.g:334:4: rule__ParameterStructType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalBasicsParser.g:343:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:344:1: ( ruleParameterIntegerType EOF )
            // InternalBasicsParser.g:345:1: ruleParameterIntegerType EOF
            {
             before(grammarAccess.getParameterIntegerTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterIntegerType();

            state._fsp--;

             after(grammarAccess.getParameterIntegerTypeRule());
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
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalBasicsParser.g:352:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:356:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalBasicsParser.g:357:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalBasicsParser.g:357:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalBasicsParser.g:358:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup());
            // InternalBasicsParser.g:359:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalBasicsParser.g:359:4: rule__ParameterIntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalBasicsParser.g:368:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:369:1: ( ruleParameterStringType EOF )
            // InternalBasicsParser.g:370:1: ruleParameterStringType EOF
            {
             before(grammarAccess.getParameterStringTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterStringType();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeRule());
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalBasicsParser.g:377:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:381:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalBasicsParser.g:382:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalBasicsParser.g:382:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalBasicsParser.g:383:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup());
            // InternalBasicsParser.g:384:3: ( rule__ParameterStringType__Group__0 )
            // InternalBasicsParser.g:384:4: rule__ParameterStringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalBasicsParser.g:393:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:394:1: ( ruleParameterDoubleType EOF )
            // InternalBasicsParser.g:395:1: ruleParameterDoubleType EOF
            {
             before(grammarAccess.getParameterDoubleTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterDoubleType();

            state._fsp--;

             after(grammarAccess.getParameterDoubleTypeRule());
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
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalBasicsParser.g:402:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:406:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalBasicsParser.g:407:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalBasicsParser.g:407:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalBasicsParser.g:408:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup());
            // InternalBasicsParser.g:409:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalBasicsParser.g:409:4: rule__ParameterDoubleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalBasicsParser.g:418:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:419:1: ( ruleParameterBooleanType EOF )
            // InternalBasicsParser.g:420:1: ruleParameterBooleanType EOF
            {
             before(grammarAccess.getParameterBooleanTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterBooleanType();

            state._fsp--;

             after(grammarAccess.getParameterBooleanTypeRule());
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
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalBasicsParser.g:427:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:431:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalBasicsParser.g:432:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalBasicsParser.g:432:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalBasicsParser.g:433:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup());
            // InternalBasicsParser.g:434:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalBasicsParser.g:434:4: rule__ParameterBooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalBasicsParser.g:443:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalBasicsParser.g:444:1: ( ruleParameterBase64Type EOF )
            // InternalBasicsParser.g:445:1: ruleParameterBase64Type EOF
            {
             before(grammarAccess.getParameterBase64TypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterBase64Type();

            state._fsp--;

             after(grammarAccess.getParameterBase64TypeRule());
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
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalBasicsParser.g:452:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:456:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalBasicsParser.g:457:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalBasicsParser.g:457:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalBasicsParser.g:458:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup());
            // InternalBasicsParser.g:459:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalBasicsParser.g:459:4: rule__ParameterBase64Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64TypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalBasicsParser.g:468:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:469:1: ( ruleParameterArrayType EOF )
            // InternalBasicsParser.g:470:1: ruleParameterArrayType EOF
            {
             before(grammarAccess.getParameterArrayTypeRule());
            pushFollow(FOLLOW_1);
            ruleParameterArrayType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeRule());
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
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalBasicsParser.g:477:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:481:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalBasicsParser.g:482:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalBasicsParser.g:482:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalBasicsParser.g:483:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup());
            // InternalBasicsParser.g:484:3: ( rule__ParameterArrayType__Group__0 )
            // InternalBasicsParser.g:484:4: rule__ParameterArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalBasicsParser.g:493:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalBasicsParser.g:494:1: ( ruleParameterList EOF )
            // InternalBasicsParser.g:495:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule());
            pushFollow(FOLLOW_1);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule());
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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalBasicsParser.g:502:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:506:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalBasicsParser.g:507:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalBasicsParser.g:507:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalBasicsParser.g:508:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup());
            // InternalBasicsParser.g:509:3: ( rule__ParameterList__Group__0 )
            // InternalBasicsParser.g:509:4: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalBasicsParser.g:518:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalBasicsParser.g:519:1: ( ruleParameterAny EOF )
            // InternalBasicsParser.g:520:1: ruleParameterAny EOF
            {
             before(grammarAccess.getParameterAnyRule());
            pushFollow(FOLLOW_1);
            ruleParameterAny();

            state._fsp--;

             after(grammarAccess.getParameterAnyRule());
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
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalBasicsParser.g:527:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:531:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalBasicsParser.g:532:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalBasicsParser.g:532:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalBasicsParser.g:533:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup());
            // InternalBasicsParser.g:534:3: ( rule__ParameterAny__Group__0 )
            // InternalBasicsParser.g:534:4: rule__ParameterAny__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalBasicsParser.g:543:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalBasicsParser.g:544:1: ( ruleParameterString EOF )
            // InternalBasicsParser.g:545:1: ruleParameterString EOF
            {
             before(grammarAccess.getParameterStringRule());
            pushFollow(FOLLOW_1);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringRule());
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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalBasicsParser.g:552:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:556:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalBasicsParser.g:557:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalBasicsParser.g:557:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalBasicsParser.g:558:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment());
            // InternalBasicsParser.g:559:3: ( rule__ParameterString__ValueAssignment )
            // InternalBasicsParser.g:559:4: rule__ParameterString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringAccess().getValueAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalBasicsParser.g:568:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:569:1: ( ruleParameterBase64 EOF )
            // InternalBasicsParser.g:570:1: ruleParameterBase64 EOF
            {
             before(grammarAccess.getParameterBase64Rule());
            pushFollow(FOLLOW_1);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64Rule());
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
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalBasicsParser.g:577:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:581:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalBasicsParser.g:582:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalBasicsParser.g:582:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalBasicsParser.g:583:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment());
            // InternalBasicsParser.g:584:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalBasicsParser.g:584:4: rule__ParameterBase64__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64Access().getValueAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalBasicsParser.g:593:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalBasicsParser.g:594:1: ( ruleParameterInteger EOF )
            // InternalBasicsParser.g:595:1: ruleParameterInteger EOF
            {
             before(grammarAccess.getParameterIntegerRule());
            pushFollow(FOLLOW_1);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerRule());
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
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalBasicsParser.g:602:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:606:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalBasicsParser.g:607:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalBasicsParser.g:607:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalBasicsParser.g:608:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment());
            // InternalBasicsParser.g:609:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalBasicsParser.g:609:4: rule__ParameterInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerAccess().getValueAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalBasicsParser.g:618:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalBasicsParser.g:619:1: ( ruleParameterDouble EOF )
            // InternalBasicsParser.g:620:1: ruleParameterDouble EOF
            {
             before(grammarAccess.getParameterDoubleRule());
            pushFollow(FOLLOW_1);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleRule());
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
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalBasicsParser.g:627:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:631:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalBasicsParser.g:632:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalBasicsParser.g:632:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalBasicsParser.g:633:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment());
            // InternalBasicsParser.g:634:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalBasicsParser.g:634:4: rule__ParameterDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleAccess().getValueAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalBasicsParser.g:643:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalBasicsParser.g:644:1: ( ruleParameterBoolean EOF )
            // InternalBasicsParser.g:645:1: ruleParameterBoolean EOF
            {
             before(grammarAccess.getParameterBooleanRule());
            pushFollow(FOLLOW_1);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanRule());
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
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalBasicsParser.g:652:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:656:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalBasicsParser.g:657:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalBasicsParser.g:657:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalBasicsParser.g:658:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment());
            // InternalBasicsParser.g:659:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalBasicsParser.g:659:4: rule__ParameterBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanAccess().getValueAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalBasicsParser.g:668:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalBasicsParser.g:669:1: ( ruleParameterStruct EOF )
            // InternalBasicsParser.g:670:1: ruleParameterStruct EOF
            {
             before(grammarAccess.getParameterStructRule());
            pushFollow(FOLLOW_1);
            ruleParameterStruct();

            state._fsp--;

             after(grammarAccess.getParameterStructRule());
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
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalBasicsParser.g:677:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:681:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalBasicsParser.g:682:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalBasicsParser.g:682:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalBasicsParser.g:683:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup());
            // InternalBasicsParser.g:684:3: ( rule__ParameterStruct__Group__0 )
            // InternalBasicsParser.g:684:4: rule__ParameterStruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterDate"
    // InternalBasicsParser.g:693:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalBasicsParser.g:694:1: ( ruleParameterDate EOF )
            // InternalBasicsParser.g:695:1: ruleParameterDate EOF
            {
             before(grammarAccess.getParameterDateRule());
            pushFollow(FOLLOW_1);
            ruleParameterDate();

            state._fsp--;

             after(grammarAccess.getParameterDateRule());
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
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalBasicsParser.g:702:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:706:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalBasicsParser.g:707:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalBasicsParser.g:707:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalBasicsParser.g:708:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment());
            // InternalBasicsParser.g:709:3: ( rule__ParameterDate__ValueAssignment )
            // InternalBasicsParser.g:709:4: rule__ParameterDate__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDate__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDateAccess().getValueAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalBasicsParser.g:718:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalBasicsParser.g:719:1: ( ruleParameterStructMember EOF )
            // InternalBasicsParser.g:720:1: ruleParameterStructMember EOF
            {
             before(grammarAccess.getParameterStructMemberRule());
            pushFollow(FOLLOW_1);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberRule());
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
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalBasicsParser.g:727:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:731:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalBasicsParser.g:732:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalBasicsParser.g:732:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalBasicsParser.g:733:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup());
            // InternalBasicsParser.g:734:3: ( rule__ParameterStructMember__Group__0 )
            // InternalBasicsParser.g:734:4: rule__ParameterStructMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalBasicsParser.g:743:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalBasicsParser.g:744:1: ( ruleParameterStructTypeMember EOF )
            // InternalBasicsParser.g:745:1: ruleParameterStructTypeMember EOF
            {
             before(grammarAccess.getParameterStructTypeMemberRule());
            pushFollow(FOLLOW_1);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberRule());
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
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalBasicsParser.g:752:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:756:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalBasicsParser.g:757:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalBasicsParser.g:757:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalBasicsParser.g:758:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup());
            // InternalBasicsParser.g:759:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalBasicsParser.g:759:4: rule__ParameterStructTypeMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalBasicsParser.g:768:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalBasicsParser.g:769:1: ( ruleBase64Binary EOF )
            // InternalBasicsParser.g:770:1: ruleBase64Binary EOF
            {
             before(grammarAccess.getBase64BinaryRule());
            pushFollow(FOLLOW_1);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getBase64BinaryRule());
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
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalBasicsParser.g:777:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:781:2: ( ( RULE_BINARY ) )
            // InternalBasicsParser.g:782:2: ( RULE_BINARY )
            {
            // InternalBasicsParser.g:782:2: ( RULE_BINARY )
            // InternalBasicsParser.g:783:3: RULE_BINARY
            {
             before(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
            match(input,RULE_BINARY,FOLLOW_2);
             after(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalBasicsParser.g:793:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:794:1: ( ruleboolean0 EOF )
            // InternalBasicsParser.g:795:1: ruleboolean0 EOF
            {
             before(grammarAccess.getBoolean0Rule());
            pushFollow(FOLLOW_1);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getBoolean0Rule());
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
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalBasicsParser.g:802:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:806:2: ( ( RULE_BOOLEAN ) )
            // InternalBasicsParser.g:807:2: ( RULE_BOOLEAN )
            {
            // InternalBasicsParser.g:807:2: ( RULE_BOOLEAN )
            // InternalBasicsParser.g:808:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
            match(input,RULE_BOOLEAN,FOLLOW_2);
             after(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalBasicsParser.g:818:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:819:1: ( ruleDouble0 EOF )
            // InternalBasicsParser.g:820:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule());
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule());
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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalBasicsParser.g:827:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:831:2: ( ( RULE_DOUBLE ) )
            // InternalBasicsParser.g:832:2: ( RULE_DOUBLE )
            {
            // InternalBasicsParser.g:832:2: ( RULE_DOUBLE )
            // InternalBasicsParser.g:833:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            match(input,RULE_DOUBLE,FOLLOW_2);
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalBasicsParser.g:843:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:844:1: ( ruleInteger0 EOF )
            // InternalBasicsParser.g:845:1: ruleInteger0 EOF
            {
             before(grammarAccess.getInteger0Rule());
            pushFollow(FOLLOW_1);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getInteger0Rule());
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
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalBasicsParser.g:852:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:856:2: ( ( RULE_DECINT ) )
            // InternalBasicsParser.g:857:2: ( RULE_DECINT )
            {
            // InternalBasicsParser.g:857:2: ( RULE_DECINT )
            // InternalBasicsParser.g:858:3: RULE_DECINT
            {
             before(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
            match(input,RULE_DECINT,FOLLOW_2);
             after(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalBasicsParser.g:868:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:869:1: ( ruleDateTime0 EOF )
            // InternalBasicsParser.g:870:1: ruleDateTime0 EOF
            {
             before(grammarAccess.getDateTime0Rule());
            pushFollow(FOLLOW_1);
            ruleDateTime0();

            state._fsp--;

             after(grammarAccess.getDateTime0Rule());
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
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalBasicsParser.g:877:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:881:2: ( ( RULE_DATE_TIME ) )
            // InternalBasicsParser.g:882:2: ( RULE_DATE_TIME )
            {
            // InternalBasicsParser.g:882:2: ( RULE_DATE_TIME )
            // InternalBasicsParser.g:883:3: RULE_DATE_TIME
            {
             before(grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
            match(input,RULE_DATE_TIME,FOLLOW_2);
             after(grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleAbstractType"
    // InternalBasicsParser.g:893:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:894:1: ( ruleAbstractType EOF )
            // InternalBasicsParser.g:895:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule());
            pushFollow(FOLLOW_1);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule());
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalBasicsParser.g:902:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:906:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalBasicsParser.g:907:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalBasicsParser.g:907:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalBasicsParser.g:908:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives());
            // InternalBasicsParser.g:909:3: ( rule__AbstractType__Alternatives )
            // InternalBasicsParser.g:909:4: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulebool"
    // InternalBasicsParser.g:918:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalBasicsParser.g:919:1: ( rulebool EOF )
            // InternalBasicsParser.g:920:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule());
            pushFollow(FOLLOW_1);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule());
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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalBasicsParser.g:927:1: rulebool : ( ( rule__Bool__Group__0 ) ) ;
    public final void rulebool() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:931:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalBasicsParser.g:932:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalBasicsParser.g:932:2: ( ( rule__Bool__Group__0 ) )
            // InternalBasicsParser.g:933:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup());
            // InternalBasicsParser.g:934:3: ( rule__Bool__Group__0 )
            // InternalBasicsParser.g:934:4: rule__Bool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint8"
    // InternalBasicsParser.g:943:1: entryRuleint8 : ruleint8 EOF ;
    public final void entryRuleint8() throws RecognitionException {
        try {
            // InternalBasicsParser.g:944:1: ( ruleint8 EOF )
            // InternalBasicsParser.g:945:1: ruleint8 EOF
            {
             before(grammarAccess.getInt8Rule());
            pushFollow(FOLLOW_1);
            ruleint8();

            state._fsp--;

             after(grammarAccess.getInt8Rule());
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
    // $ANTLR end "entryRuleint8"


    // $ANTLR start "ruleint8"
    // InternalBasicsParser.g:952:1: ruleint8 : ( ( rule__Int8__Group__0 ) ) ;
    public final void ruleint8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:956:2: ( ( ( rule__Int8__Group__0 ) ) )
            // InternalBasicsParser.g:957:2: ( ( rule__Int8__Group__0 ) )
            {
            // InternalBasicsParser.g:957:2: ( ( rule__Int8__Group__0 ) )
            // InternalBasicsParser.g:958:3: ( rule__Int8__Group__0 )
            {
             before(grammarAccess.getInt8Access().getGroup());
            // InternalBasicsParser.g:959:3: ( rule__Int8__Group__0 )
            // InternalBasicsParser.g:959:4: rule__Int8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt8Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint8"


    // $ANTLR start "entryRuleuint8"
    // InternalBasicsParser.g:968:1: entryRuleuint8 : ruleuint8 EOF ;
    public final void entryRuleuint8() throws RecognitionException {
        try {
            // InternalBasicsParser.g:969:1: ( ruleuint8 EOF )
            // InternalBasicsParser.g:970:1: ruleuint8 EOF
            {
             before(grammarAccess.getUint8Rule());
            pushFollow(FOLLOW_1);
            ruleuint8();

            state._fsp--;

             after(grammarAccess.getUint8Rule());
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
    // $ANTLR end "entryRuleuint8"


    // $ANTLR start "ruleuint8"
    // InternalBasicsParser.g:977:1: ruleuint8 : ( ( rule__Uint8__Group__0 ) ) ;
    public final void ruleuint8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:981:2: ( ( ( rule__Uint8__Group__0 ) ) )
            // InternalBasicsParser.g:982:2: ( ( rule__Uint8__Group__0 ) )
            {
            // InternalBasicsParser.g:982:2: ( ( rule__Uint8__Group__0 ) )
            // InternalBasicsParser.g:983:3: ( rule__Uint8__Group__0 )
            {
             before(grammarAccess.getUint8Access().getGroup());
            // InternalBasicsParser.g:984:3: ( rule__Uint8__Group__0 )
            // InternalBasicsParser.g:984:4: rule__Uint8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint8Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint8"


    // $ANTLR start "entryRuleint16"
    // InternalBasicsParser.g:993:1: entryRuleint16 : ruleint16 EOF ;
    public final void entryRuleint16() throws RecognitionException {
        try {
            // InternalBasicsParser.g:994:1: ( ruleint16 EOF )
            // InternalBasicsParser.g:995:1: ruleint16 EOF
            {
             before(grammarAccess.getInt16Rule());
            pushFollow(FOLLOW_1);
            ruleint16();

            state._fsp--;

             after(grammarAccess.getInt16Rule());
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
    // $ANTLR end "entryRuleint16"


    // $ANTLR start "ruleint16"
    // InternalBasicsParser.g:1002:1: ruleint16 : ( ( rule__Int16__Group__0 ) ) ;
    public final void ruleint16() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1006:2: ( ( ( rule__Int16__Group__0 ) ) )
            // InternalBasicsParser.g:1007:2: ( ( rule__Int16__Group__0 ) )
            {
            // InternalBasicsParser.g:1007:2: ( ( rule__Int16__Group__0 ) )
            // InternalBasicsParser.g:1008:3: ( rule__Int16__Group__0 )
            {
             before(grammarAccess.getInt16Access().getGroup());
            // InternalBasicsParser.g:1009:3: ( rule__Int16__Group__0 )
            // InternalBasicsParser.g:1009:4: rule__Int16__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int16__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt16Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint16"


    // $ANTLR start "entryRuleuint16"
    // InternalBasicsParser.g:1018:1: entryRuleuint16 : ruleuint16 EOF ;
    public final void entryRuleuint16() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1019:1: ( ruleuint16 EOF )
            // InternalBasicsParser.g:1020:1: ruleuint16 EOF
            {
             before(grammarAccess.getUint16Rule());
            pushFollow(FOLLOW_1);
            ruleuint16();

            state._fsp--;

             after(grammarAccess.getUint16Rule());
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
    // $ANTLR end "entryRuleuint16"


    // $ANTLR start "ruleuint16"
    // InternalBasicsParser.g:1027:1: ruleuint16 : ( ( rule__Uint16__Group__0 ) ) ;
    public final void ruleuint16() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1031:2: ( ( ( rule__Uint16__Group__0 ) ) )
            // InternalBasicsParser.g:1032:2: ( ( rule__Uint16__Group__0 ) )
            {
            // InternalBasicsParser.g:1032:2: ( ( rule__Uint16__Group__0 ) )
            // InternalBasicsParser.g:1033:3: ( rule__Uint16__Group__0 )
            {
             before(grammarAccess.getUint16Access().getGroup());
            // InternalBasicsParser.g:1034:3: ( rule__Uint16__Group__0 )
            // InternalBasicsParser.g:1034:4: rule__Uint16__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint16__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint16Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint16"


    // $ANTLR start "entryRuleint32"
    // InternalBasicsParser.g:1043:1: entryRuleint32 : ruleint32 EOF ;
    public final void entryRuleint32() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1044:1: ( ruleint32 EOF )
            // InternalBasicsParser.g:1045:1: ruleint32 EOF
            {
             before(grammarAccess.getInt32Rule());
            pushFollow(FOLLOW_1);
            ruleint32();

            state._fsp--;

             after(grammarAccess.getInt32Rule());
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
    // $ANTLR end "entryRuleint32"


    // $ANTLR start "ruleint32"
    // InternalBasicsParser.g:1052:1: ruleint32 : ( ( rule__Int32__Group__0 ) ) ;
    public final void ruleint32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1056:2: ( ( ( rule__Int32__Group__0 ) ) )
            // InternalBasicsParser.g:1057:2: ( ( rule__Int32__Group__0 ) )
            {
            // InternalBasicsParser.g:1057:2: ( ( rule__Int32__Group__0 ) )
            // InternalBasicsParser.g:1058:3: ( rule__Int32__Group__0 )
            {
             before(grammarAccess.getInt32Access().getGroup());
            // InternalBasicsParser.g:1059:3: ( rule__Int32__Group__0 )
            // InternalBasicsParser.g:1059:4: rule__Int32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint32"


    // $ANTLR start "entryRuleuint32"
    // InternalBasicsParser.g:1068:1: entryRuleuint32 : ruleuint32 EOF ;
    public final void entryRuleuint32() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1069:1: ( ruleuint32 EOF )
            // InternalBasicsParser.g:1070:1: ruleuint32 EOF
            {
             before(grammarAccess.getUint32Rule());
            pushFollow(FOLLOW_1);
            ruleuint32();

            state._fsp--;

             after(grammarAccess.getUint32Rule());
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
    // $ANTLR end "entryRuleuint32"


    // $ANTLR start "ruleuint32"
    // InternalBasicsParser.g:1077:1: ruleuint32 : ( ( rule__Uint32__Group__0 ) ) ;
    public final void ruleuint32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1081:2: ( ( ( rule__Uint32__Group__0 ) ) )
            // InternalBasicsParser.g:1082:2: ( ( rule__Uint32__Group__0 ) )
            {
            // InternalBasicsParser.g:1082:2: ( ( rule__Uint32__Group__0 ) )
            // InternalBasicsParser.g:1083:3: ( rule__Uint32__Group__0 )
            {
             before(grammarAccess.getUint32Access().getGroup());
            // InternalBasicsParser.g:1084:3: ( rule__Uint32__Group__0 )
            // InternalBasicsParser.g:1084:4: rule__Uint32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint32Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint32"


    // $ANTLR start "entryRuleint64"
    // InternalBasicsParser.g:1093:1: entryRuleint64 : ruleint64 EOF ;
    public final void entryRuleint64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1094:1: ( ruleint64 EOF )
            // InternalBasicsParser.g:1095:1: ruleint64 EOF
            {
             before(grammarAccess.getInt64Rule());
            pushFollow(FOLLOW_1);
            ruleint64();

            state._fsp--;

             after(grammarAccess.getInt64Rule());
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
    // $ANTLR end "entryRuleint64"


    // $ANTLR start "ruleint64"
    // InternalBasicsParser.g:1102:1: ruleint64 : ( ( rule__Int64__Group__0 ) ) ;
    public final void ruleint64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1106:2: ( ( ( rule__Int64__Group__0 ) ) )
            // InternalBasicsParser.g:1107:2: ( ( rule__Int64__Group__0 ) )
            {
            // InternalBasicsParser.g:1107:2: ( ( rule__Int64__Group__0 ) )
            // InternalBasicsParser.g:1108:3: ( rule__Int64__Group__0 )
            {
             before(grammarAccess.getInt64Access().getGroup());
            // InternalBasicsParser.g:1109:3: ( rule__Int64__Group__0 )
            // InternalBasicsParser.g:1109:4: rule__Int64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt64Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint64"


    // $ANTLR start "entryRuleuint64"
    // InternalBasicsParser.g:1118:1: entryRuleuint64 : ruleuint64 EOF ;
    public final void entryRuleuint64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1119:1: ( ruleuint64 EOF )
            // InternalBasicsParser.g:1120:1: ruleuint64 EOF
            {
             before(grammarAccess.getUint64Rule());
            pushFollow(FOLLOW_1);
            ruleuint64();

            state._fsp--;

             after(grammarAccess.getUint64Rule());
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
    // $ANTLR end "entryRuleuint64"


    // $ANTLR start "ruleuint64"
    // InternalBasicsParser.g:1127:1: ruleuint64 : ( ( rule__Uint64__Group__0 ) ) ;
    public final void ruleuint64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1131:2: ( ( ( rule__Uint64__Group__0 ) ) )
            // InternalBasicsParser.g:1132:2: ( ( rule__Uint64__Group__0 ) )
            {
            // InternalBasicsParser.g:1132:2: ( ( rule__Uint64__Group__0 ) )
            // InternalBasicsParser.g:1133:3: ( rule__Uint64__Group__0 )
            {
             before(grammarAccess.getUint64Access().getGroup());
            // InternalBasicsParser.g:1134:3: ( rule__Uint64__Group__0 )
            // InternalBasicsParser.g:1134:4: rule__Uint64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint64Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint64"


    // $ANTLR start "entryRulefloat32"
    // InternalBasicsParser.g:1143:1: entryRulefloat32 : rulefloat32 EOF ;
    public final void entryRulefloat32() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1144:1: ( rulefloat32 EOF )
            // InternalBasicsParser.g:1145:1: rulefloat32 EOF
            {
             before(grammarAccess.getFloat32Rule());
            pushFollow(FOLLOW_1);
            rulefloat32();

            state._fsp--;

             after(grammarAccess.getFloat32Rule());
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
    // $ANTLR end "entryRulefloat32"


    // $ANTLR start "rulefloat32"
    // InternalBasicsParser.g:1152:1: rulefloat32 : ( ( rule__Float32__Group__0 ) ) ;
    public final void rulefloat32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1156:2: ( ( ( rule__Float32__Group__0 ) ) )
            // InternalBasicsParser.g:1157:2: ( ( rule__Float32__Group__0 ) )
            {
            // InternalBasicsParser.g:1157:2: ( ( rule__Float32__Group__0 ) )
            // InternalBasicsParser.g:1158:3: ( rule__Float32__Group__0 )
            {
             before(grammarAccess.getFloat32Access().getGroup());
            // InternalBasicsParser.g:1159:3: ( rule__Float32__Group__0 )
            // InternalBasicsParser.g:1159:4: rule__Float32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat32Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat32"


    // $ANTLR start "entryRulefloat64"
    // InternalBasicsParser.g:1168:1: entryRulefloat64 : rulefloat64 EOF ;
    public final void entryRulefloat64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1169:1: ( rulefloat64 EOF )
            // InternalBasicsParser.g:1170:1: rulefloat64 EOF
            {
             before(grammarAccess.getFloat64Rule());
            pushFollow(FOLLOW_1);
            rulefloat64();

            state._fsp--;

             after(grammarAccess.getFloat64Rule());
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
    // $ANTLR end "entryRulefloat64"


    // $ANTLR start "rulefloat64"
    // InternalBasicsParser.g:1177:1: rulefloat64 : ( ( rule__Float64__Group__0 ) ) ;
    public final void rulefloat64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1181:2: ( ( ( rule__Float64__Group__0 ) ) )
            // InternalBasicsParser.g:1182:2: ( ( rule__Float64__Group__0 ) )
            {
            // InternalBasicsParser.g:1182:2: ( ( rule__Float64__Group__0 ) )
            // InternalBasicsParser.g:1183:3: ( rule__Float64__Group__0 )
            {
             before(grammarAccess.getFloat64Access().getGroup());
            // InternalBasicsParser.g:1184:3: ( rule__Float64__Group__0 )
            // InternalBasicsParser.g:1184:4: rule__Float64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat64Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat64"


    // $ANTLR start "entryRulestring0"
    // InternalBasicsParser.g:1193:1: entryRulestring0 : rulestring0 EOF ;
    public final void entryRulestring0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1194:1: ( rulestring0 EOF )
            // InternalBasicsParser.g:1195:1: rulestring0 EOF
            {
             before(grammarAccess.getString0Rule());
            pushFollow(FOLLOW_1);
            rulestring0();

            state._fsp--;

             after(grammarAccess.getString0Rule());
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
    // $ANTLR end "entryRulestring0"


    // $ANTLR start "rulestring0"
    // InternalBasicsParser.g:1202:1: rulestring0 : ( ( rule__String0__Group__0 ) ) ;
    public final void rulestring0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1206:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalBasicsParser.g:1207:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalBasicsParser.g:1207:2: ( ( rule__String0__Group__0 ) )
            // InternalBasicsParser.g:1208:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup());
            // InternalBasicsParser.g:1209:3: ( rule__String0__Group__0 )
            // InternalBasicsParser.g:1209:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring0"


    // $ANTLR start "entryRulebyte"
    // InternalBasicsParser.g:1218:1: entryRulebyte : rulebyte EOF ;
    public final void entryRulebyte() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1219:1: ( rulebyte EOF )
            // InternalBasicsParser.g:1220:1: rulebyte EOF
            {
             before(grammarAccess.getByteRule());
            pushFollow(FOLLOW_1);
            rulebyte();

            state._fsp--;

             after(grammarAccess.getByteRule());
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
    // $ANTLR end "entryRulebyte"


    // $ANTLR start "rulebyte"
    // InternalBasicsParser.g:1227:1: rulebyte : ( ( rule__Byte__Group__0 ) ) ;
    public final void rulebyte() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1231:2: ( ( ( rule__Byte__Group__0 ) ) )
            // InternalBasicsParser.g:1232:2: ( ( rule__Byte__Group__0 ) )
            {
            // InternalBasicsParser.g:1232:2: ( ( rule__Byte__Group__0 ) )
            // InternalBasicsParser.g:1233:3: ( rule__Byte__Group__0 )
            {
             before(grammarAccess.getByteAccess().getGroup());
            // InternalBasicsParser.g:1234:3: ( rule__Byte__Group__0 )
            // InternalBasicsParser.g:1234:4: rule__Byte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Byte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebyte"


    // $ANTLR start "entryRuletime"
    // InternalBasicsParser.g:1243:1: entryRuletime : ruletime EOF ;
    public final void entryRuletime() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1244:1: ( ruletime EOF )
            // InternalBasicsParser.g:1245:1: ruletime EOF
            {
             before(grammarAccess.getTimeRule());
            pushFollow(FOLLOW_1);
            ruletime();

            state._fsp--;

             after(grammarAccess.getTimeRule());
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
    // $ANTLR end "entryRuletime"


    // $ANTLR start "ruletime"
    // InternalBasicsParser.g:1252:1: ruletime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruletime() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1256:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalBasicsParser.g:1257:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalBasicsParser.g:1257:2: ( ( rule__Time__Group__0 ) )
            // InternalBasicsParser.g:1258:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup());
            // InternalBasicsParser.g:1259:3: ( rule__Time__Group__0 )
            // InternalBasicsParser.g:1259:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletime"


    // $ANTLR start "entryRuleduration"
    // InternalBasicsParser.g:1268:1: entryRuleduration : ruleduration EOF ;
    public final void entryRuleduration() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1269:1: ( ruleduration EOF )
            // InternalBasicsParser.g:1270:1: ruleduration EOF
            {
             before(grammarAccess.getDurationRule());
            pushFollow(FOLLOW_1);
            ruleduration();

            state._fsp--;

             after(grammarAccess.getDurationRule());
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
    // $ANTLR end "entryRuleduration"


    // $ANTLR start "ruleduration"
    // InternalBasicsParser.g:1277:1: ruleduration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleduration() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1281:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalBasicsParser.g:1282:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalBasicsParser.g:1282:2: ( ( rule__Duration__Group__0 ) )
            // InternalBasicsParser.g:1283:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup());
            // InternalBasicsParser.g:1284:3: ( rule__Duration__Group__0 )
            // InternalBasicsParser.g:1284:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleduration"


    // $ANTLR start "entryRuleboolArray"
    // InternalBasicsParser.g:1293:1: entryRuleboolArray : ruleboolArray EOF ;
    public final void entryRuleboolArray() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1294:1: ( ruleboolArray EOF )
            // InternalBasicsParser.g:1295:1: ruleboolArray EOF
            {
             before(grammarAccess.getBoolArrayRule());
            pushFollow(FOLLOW_1);
            ruleboolArray();

            state._fsp--;

             after(grammarAccess.getBoolArrayRule());
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
    // $ANTLR end "entryRuleboolArray"


    // $ANTLR start "ruleboolArray"
    // InternalBasicsParser.g:1302:1: ruleboolArray : ( ( rule__BoolArray__Group__0 ) ) ;
    public final void ruleboolArray() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1306:2: ( ( ( rule__BoolArray__Group__0 ) ) )
            // InternalBasicsParser.g:1307:2: ( ( rule__BoolArray__Group__0 ) )
            {
            // InternalBasicsParser.g:1307:2: ( ( rule__BoolArray__Group__0 ) )
            // InternalBasicsParser.g:1308:3: ( rule__BoolArray__Group__0 )
            {
             before(grammarAccess.getBoolArrayAccess().getGroup());
            // InternalBasicsParser.g:1309:3: ( rule__BoolArray__Group__0 )
            // InternalBasicsParser.g:1309:4: rule__BoolArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolArray"


    // $ANTLR start "entryRuleint8Array"
    // InternalBasicsParser.g:1318:1: entryRuleint8Array : ruleint8Array EOF ;
    public final void entryRuleint8Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1319:1: ( ruleint8Array EOF )
            // InternalBasicsParser.g:1320:1: ruleint8Array EOF
            {
             before(grammarAccess.getInt8ArrayRule());
            pushFollow(FOLLOW_1);
            ruleint8Array();

            state._fsp--;

             after(grammarAccess.getInt8ArrayRule());
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
    // $ANTLR end "entryRuleint8Array"


    // $ANTLR start "ruleint8Array"
    // InternalBasicsParser.g:1327:1: ruleint8Array : ( ( rule__Int8Array__Group__0 ) ) ;
    public final void ruleint8Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1331:2: ( ( ( rule__Int8Array__Group__0 ) ) )
            // InternalBasicsParser.g:1332:2: ( ( rule__Int8Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1332:2: ( ( rule__Int8Array__Group__0 ) )
            // InternalBasicsParser.g:1333:3: ( rule__Int8Array__Group__0 )
            {
             before(grammarAccess.getInt8ArrayAccess().getGroup());
            // InternalBasicsParser.g:1334:3: ( rule__Int8Array__Group__0 )
            // InternalBasicsParser.g:1334:4: rule__Int8Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt8ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint8Array"


    // $ANTLR start "entryRuleuint8Array"
    // InternalBasicsParser.g:1343:1: entryRuleuint8Array : ruleuint8Array EOF ;
    public final void entryRuleuint8Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1344:1: ( ruleuint8Array EOF )
            // InternalBasicsParser.g:1345:1: ruleuint8Array EOF
            {
             before(grammarAccess.getUint8ArrayRule());
            pushFollow(FOLLOW_1);
            ruleuint8Array();

            state._fsp--;

             after(grammarAccess.getUint8ArrayRule());
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
    // $ANTLR end "entryRuleuint8Array"


    // $ANTLR start "ruleuint8Array"
    // InternalBasicsParser.g:1352:1: ruleuint8Array : ( ( rule__Uint8Array__Group__0 ) ) ;
    public final void ruleuint8Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1356:2: ( ( ( rule__Uint8Array__Group__0 ) ) )
            // InternalBasicsParser.g:1357:2: ( ( rule__Uint8Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1357:2: ( ( rule__Uint8Array__Group__0 ) )
            // InternalBasicsParser.g:1358:3: ( rule__Uint8Array__Group__0 )
            {
             before(grammarAccess.getUint8ArrayAccess().getGroup());
            // InternalBasicsParser.g:1359:3: ( rule__Uint8Array__Group__0 )
            // InternalBasicsParser.g:1359:4: rule__Uint8Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint8ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint8Array"


    // $ANTLR start "entryRuleint16Array"
    // InternalBasicsParser.g:1368:1: entryRuleint16Array : ruleint16Array EOF ;
    public final void entryRuleint16Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1369:1: ( ruleint16Array EOF )
            // InternalBasicsParser.g:1370:1: ruleint16Array EOF
            {
             before(grammarAccess.getInt16ArrayRule());
            pushFollow(FOLLOW_1);
            ruleint16Array();

            state._fsp--;

             after(grammarAccess.getInt16ArrayRule());
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
    // $ANTLR end "entryRuleint16Array"


    // $ANTLR start "ruleint16Array"
    // InternalBasicsParser.g:1377:1: ruleint16Array : ( ( rule__Int16Array__Group__0 ) ) ;
    public final void ruleint16Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1381:2: ( ( ( rule__Int16Array__Group__0 ) ) )
            // InternalBasicsParser.g:1382:2: ( ( rule__Int16Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1382:2: ( ( rule__Int16Array__Group__0 ) )
            // InternalBasicsParser.g:1383:3: ( rule__Int16Array__Group__0 )
            {
             before(grammarAccess.getInt16ArrayAccess().getGroup());
            // InternalBasicsParser.g:1384:3: ( rule__Int16Array__Group__0 )
            // InternalBasicsParser.g:1384:4: rule__Int16Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt16ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint16Array"


    // $ANTLR start "entryRuleuint16Array"
    // InternalBasicsParser.g:1393:1: entryRuleuint16Array : ruleuint16Array EOF ;
    public final void entryRuleuint16Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1394:1: ( ruleuint16Array EOF )
            // InternalBasicsParser.g:1395:1: ruleuint16Array EOF
            {
             before(grammarAccess.getUint16ArrayRule());
            pushFollow(FOLLOW_1);
            ruleuint16Array();

            state._fsp--;

             after(grammarAccess.getUint16ArrayRule());
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
    // $ANTLR end "entryRuleuint16Array"


    // $ANTLR start "ruleuint16Array"
    // InternalBasicsParser.g:1402:1: ruleuint16Array : ( ( rule__Uint16Array__Group__0 ) ) ;
    public final void ruleuint16Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1406:2: ( ( ( rule__Uint16Array__Group__0 ) ) )
            // InternalBasicsParser.g:1407:2: ( ( rule__Uint16Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1407:2: ( ( rule__Uint16Array__Group__0 ) )
            // InternalBasicsParser.g:1408:3: ( rule__Uint16Array__Group__0 )
            {
             before(grammarAccess.getUint16ArrayAccess().getGroup());
            // InternalBasicsParser.g:1409:3: ( rule__Uint16Array__Group__0 )
            // InternalBasicsParser.g:1409:4: rule__Uint16Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint16ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint16Array"


    // $ANTLR start "entryRuleint32Array"
    // InternalBasicsParser.g:1418:1: entryRuleint32Array : ruleint32Array EOF ;
    public final void entryRuleint32Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1419:1: ( ruleint32Array EOF )
            // InternalBasicsParser.g:1420:1: ruleint32Array EOF
            {
             before(grammarAccess.getInt32ArrayRule());
            pushFollow(FOLLOW_1);
            ruleint32Array();

            state._fsp--;

             after(grammarAccess.getInt32ArrayRule());
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
    // $ANTLR end "entryRuleint32Array"


    // $ANTLR start "ruleint32Array"
    // InternalBasicsParser.g:1427:1: ruleint32Array : ( ( rule__Int32Array__Group__0 ) ) ;
    public final void ruleint32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1431:2: ( ( ( rule__Int32Array__Group__0 ) ) )
            // InternalBasicsParser.g:1432:2: ( ( rule__Int32Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1432:2: ( ( rule__Int32Array__Group__0 ) )
            // InternalBasicsParser.g:1433:3: ( rule__Int32Array__Group__0 )
            {
             before(grammarAccess.getInt32ArrayAccess().getGroup());
            // InternalBasicsParser.g:1434:3: ( rule__Int32Array__Group__0 )
            // InternalBasicsParser.g:1434:4: rule__Int32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint32Array"


    // $ANTLR start "entryRuleuint32Array"
    // InternalBasicsParser.g:1443:1: entryRuleuint32Array : ruleuint32Array EOF ;
    public final void entryRuleuint32Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1444:1: ( ruleuint32Array EOF )
            // InternalBasicsParser.g:1445:1: ruleuint32Array EOF
            {
             before(grammarAccess.getUint32ArrayRule());
            pushFollow(FOLLOW_1);
            ruleuint32Array();

            state._fsp--;

             after(grammarAccess.getUint32ArrayRule());
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
    // $ANTLR end "entryRuleuint32Array"


    // $ANTLR start "ruleuint32Array"
    // InternalBasicsParser.g:1452:1: ruleuint32Array : ( ( rule__Uint32Array__Group__0 ) ) ;
    public final void ruleuint32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1456:2: ( ( ( rule__Uint32Array__Group__0 ) ) )
            // InternalBasicsParser.g:1457:2: ( ( rule__Uint32Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1457:2: ( ( rule__Uint32Array__Group__0 ) )
            // InternalBasicsParser.g:1458:3: ( rule__Uint32Array__Group__0 )
            {
             before(grammarAccess.getUint32ArrayAccess().getGroup());
            // InternalBasicsParser.g:1459:3: ( rule__Uint32Array__Group__0 )
            // InternalBasicsParser.g:1459:4: rule__Uint32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint32ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint32Array"


    // $ANTLR start "entryRuleint64Array"
    // InternalBasicsParser.g:1468:1: entryRuleint64Array : ruleint64Array EOF ;
    public final void entryRuleint64Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1469:1: ( ruleint64Array EOF )
            // InternalBasicsParser.g:1470:1: ruleint64Array EOF
            {
             before(grammarAccess.getInt64ArrayRule());
            pushFollow(FOLLOW_1);
            ruleint64Array();

            state._fsp--;

             after(grammarAccess.getInt64ArrayRule());
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
    // $ANTLR end "entryRuleint64Array"


    // $ANTLR start "ruleint64Array"
    // InternalBasicsParser.g:1477:1: ruleint64Array : ( ( rule__Int64Array__Group__0 ) ) ;
    public final void ruleint64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1481:2: ( ( ( rule__Int64Array__Group__0 ) ) )
            // InternalBasicsParser.g:1482:2: ( ( rule__Int64Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1482:2: ( ( rule__Int64Array__Group__0 ) )
            // InternalBasicsParser.g:1483:3: ( rule__Int64Array__Group__0 )
            {
             before(grammarAccess.getInt64ArrayAccess().getGroup());
            // InternalBasicsParser.g:1484:3: ( rule__Int64Array__Group__0 )
            // InternalBasicsParser.g:1484:4: rule__Int64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt64ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint64Array"


    // $ANTLR start "entryRuleuint64Array"
    // InternalBasicsParser.g:1493:1: entryRuleuint64Array : ruleuint64Array EOF ;
    public final void entryRuleuint64Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1494:1: ( ruleuint64Array EOF )
            // InternalBasicsParser.g:1495:1: ruleuint64Array EOF
            {
             before(grammarAccess.getUint64ArrayRule());
            pushFollow(FOLLOW_1);
            ruleuint64Array();

            state._fsp--;

             after(grammarAccess.getUint64ArrayRule());
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
    // $ANTLR end "entryRuleuint64Array"


    // $ANTLR start "ruleuint64Array"
    // InternalBasicsParser.g:1502:1: ruleuint64Array : ( ( rule__Uint64Array__Group__0 ) ) ;
    public final void ruleuint64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1506:2: ( ( ( rule__Uint64Array__Group__0 ) ) )
            // InternalBasicsParser.g:1507:2: ( ( rule__Uint64Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1507:2: ( ( rule__Uint64Array__Group__0 ) )
            // InternalBasicsParser.g:1508:3: ( rule__Uint64Array__Group__0 )
            {
             before(grammarAccess.getUint64ArrayAccess().getGroup());
            // InternalBasicsParser.g:1509:3: ( rule__Uint64Array__Group__0 )
            // InternalBasicsParser.g:1509:4: rule__Uint64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint64ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint64Array"


    // $ANTLR start "entryRulefloat32Array"
    // InternalBasicsParser.g:1518:1: entryRulefloat32Array : rulefloat32Array EOF ;
    public final void entryRulefloat32Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1519:1: ( rulefloat32Array EOF )
            // InternalBasicsParser.g:1520:1: rulefloat32Array EOF
            {
             before(grammarAccess.getFloat32ArrayRule());
            pushFollow(FOLLOW_1);
            rulefloat32Array();

            state._fsp--;

             after(grammarAccess.getFloat32ArrayRule());
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
    // $ANTLR end "entryRulefloat32Array"


    // $ANTLR start "rulefloat32Array"
    // InternalBasicsParser.g:1527:1: rulefloat32Array : ( ( rule__Float32Array__Group__0 ) ) ;
    public final void rulefloat32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1531:2: ( ( ( rule__Float32Array__Group__0 ) ) )
            // InternalBasicsParser.g:1532:2: ( ( rule__Float32Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1532:2: ( ( rule__Float32Array__Group__0 ) )
            // InternalBasicsParser.g:1533:3: ( rule__Float32Array__Group__0 )
            {
             before(grammarAccess.getFloat32ArrayAccess().getGroup());
            // InternalBasicsParser.g:1534:3: ( rule__Float32Array__Group__0 )
            // InternalBasicsParser.g:1534:4: rule__Float32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat32ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat32Array"


    // $ANTLR start "entryRulefloat64Array"
    // InternalBasicsParser.g:1543:1: entryRulefloat64Array : rulefloat64Array EOF ;
    public final void entryRulefloat64Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1544:1: ( rulefloat64Array EOF )
            // InternalBasicsParser.g:1545:1: rulefloat64Array EOF
            {
             before(grammarAccess.getFloat64ArrayRule());
            pushFollow(FOLLOW_1);
            rulefloat64Array();

            state._fsp--;

             after(grammarAccess.getFloat64ArrayRule());
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
    // $ANTLR end "entryRulefloat64Array"


    // $ANTLR start "rulefloat64Array"
    // InternalBasicsParser.g:1552:1: rulefloat64Array : ( ( rule__Float64Array__Group__0 ) ) ;
    public final void rulefloat64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1556:2: ( ( ( rule__Float64Array__Group__0 ) ) )
            // InternalBasicsParser.g:1557:2: ( ( rule__Float64Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1557:2: ( ( rule__Float64Array__Group__0 ) )
            // InternalBasicsParser.g:1558:3: ( rule__Float64Array__Group__0 )
            {
             before(grammarAccess.getFloat64ArrayAccess().getGroup());
            // InternalBasicsParser.g:1559:3: ( rule__Float64Array__Group__0 )
            // InternalBasicsParser.g:1559:4: rule__Float64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat64ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat64Array"


    // $ANTLR start "entryRulestring0Array"
    // InternalBasicsParser.g:1568:1: entryRulestring0Array : rulestring0Array EOF ;
    public final void entryRulestring0Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1569:1: ( rulestring0Array EOF )
            // InternalBasicsParser.g:1570:1: rulestring0Array EOF
            {
             before(grammarAccess.getString0ArrayRule());
            pushFollow(FOLLOW_1);
            rulestring0Array();

            state._fsp--;

             after(grammarAccess.getString0ArrayRule());
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
    // $ANTLR end "entryRulestring0Array"


    // $ANTLR start "rulestring0Array"
    // InternalBasicsParser.g:1577:1: rulestring0Array : ( ( rule__String0Array__Group__0 ) ) ;
    public final void rulestring0Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1581:2: ( ( ( rule__String0Array__Group__0 ) ) )
            // InternalBasicsParser.g:1582:2: ( ( rule__String0Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1582:2: ( ( rule__String0Array__Group__0 ) )
            // InternalBasicsParser.g:1583:3: ( rule__String0Array__Group__0 )
            {
             before(grammarAccess.getString0ArrayAccess().getGroup());
            // InternalBasicsParser.g:1584:3: ( rule__String0Array__Group__0 )
            // InternalBasicsParser.g:1584:4: rule__String0Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0ArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring0Array"


    // $ANTLR start "entryRulebyteArray"
    // InternalBasicsParser.g:1593:1: entryRulebyteArray : rulebyteArray EOF ;
    public final void entryRulebyteArray() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1594:1: ( rulebyteArray EOF )
            // InternalBasicsParser.g:1595:1: rulebyteArray EOF
            {
             before(grammarAccess.getByteArrayRule());
            pushFollow(FOLLOW_1);
            rulebyteArray();

            state._fsp--;

             after(grammarAccess.getByteArrayRule());
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
    // $ANTLR end "entryRulebyteArray"


    // $ANTLR start "rulebyteArray"
    // InternalBasicsParser.g:1602:1: rulebyteArray : ( ( rule__ByteArray__Group__0 ) ) ;
    public final void rulebyteArray() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1606:2: ( ( ( rule__ByteArray__Group__0 ) ) )
            // InternalBasicsParser.g:1607:2: ( ( rule__ByteArray__Group__0 ) )
            {
            // InternalBasicsParser.g:1607:2: ( ( rule__ByteArray__Group__0 ) )
            // InternalBasicsParser.g:1608:3: ( rule__ByteArray__Group__0 )
            {
             before(grammarAccess.getByteArrayAccess().getGroup());
            // InternalBasicsParser.g:1609:3: ( rule__ByteArray__Group__0 )
            // InternalBasicsParser.g:1609:4: rule__ByteArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteArrayAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebyteArray"


    // $ANTLR start "entryRuleHeader"
    // InternalBasicsParser.g:1618:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1619:1: ( ruleHeader EOF )
            // InternalBasicsParser.g:1620:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule());
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule());
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalBasicsParser.g:1627:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1631:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalBasicsParser.g:1632:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalBasicsParser.g:1632:2: ( ( rule__Header__Group__0 ) )
            // InternalBasicsParser.g:1633:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup());
            // InternalBasicsParser.g:1634:3: ( rule__Header__Group__0 )
            // InternalBasicsParser.g:1634:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleTopicSpecRef"
    // InternalBasicsParser.g:1643:1: entryRuleTopicSpecRef : ruleTopicSpecRef EOF ;
    public final void entryRuleTopicSpecRef() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1644:1: ( ruleTopicSpecRef EOF )
            // InternalBasicsParser.g:1645:1: ruleTopicSpecRef EOF
            {
             before(grammarAccess.getTopicSpecRefRule());
            pushFollow(FOLLOW_1);
            ruleTopicSpecRef();

            state._fsp--;

             after(grammarAccess.getTopicSpecRefRule());
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
    // $ANTLR end "entryRuleTopicSpecRef"


    // $ANTLR start "ruleTopicSpecRef"
    // InternalBasicsParser.g:1652:1: ruleTopicSpecRef : ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) ;
    public final void ruleTopicSpecRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1656:2: ( ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) )
            // InternalBasicsParser.g:1657:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            {
            // InternalBasicsParser.g:1657:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            // InternalBasicsParser.g:1658:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment());
            // InternalBasicsParser.g:1659:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            // InternalBasicsParser.g:1659:4: rule__TopicSpecRef__TopicSpecAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TopicSpecRef__TopicSpecAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopicSpecRef"


    // $ANTLR start "entryRuleArrayTopicSpecRef"
    // InternalBasicsParser.g:1668:1: entryRuleArrayTopicSpecRef : ruleArrayTopicSpecRef EOF ;
    public final void entryRuleArrayTopicSpecRef() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1669:1: ( ruleArrayTopicSpecRef EOF )
            // InternalBasicsParser.g:1670:1: ruleArrayTopicSpecRef EOF
            {
             before(grammarAccess.getArrayTopicSpecRefRule());
            pushFollow(FOLLOW_1);
            ruleArrayTopicSpecRef();

            state._fsp--;

             after(grammarAccess.getArrayTopicSpecRefRule());
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
    // $ANTLR end "entryRuleArrayTopicSpecRef"


    // $ANTLR start "ruleArrayTopicSpecRef"
    // InternalBasicsParser.g:1677:1: ruleArrayTopicSpecRef : ( ( rule__ArrayTopicSpecRef__Group__0 ) ) ;
    public final void ruleArrayTopicSpecRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1681:2: ( ( ( rule__ArrayTopicSpecRef__Group__0 ) ) )
            // InternalBasicsParser.g:1682:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            {
            // InternalBasicsParser.g:1682:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            // InternalBasicsParser.g:1683:3: ( rule__ArrayTopicSpecRef__Group__0 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getGroup());
            // InternalBasicsParser.g:1684:3: ( rule__ArrayTopicSpecRef__Group__0 )
            // InternalBasicsParser.g:1684:4: rule__ArrayTopicSpecRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTopicSpecRefAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayTopicSpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalBasicsParser.g:1693:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1694:1: ( ruleKEYWORD EOF )
            // InternalBasicsParser.g:1695:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule());
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule());
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalBasicsParser.g:1702:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1706:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalBasicsParser.g:1707:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalBasicsParser.g:1707:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalBasicsParser.g:1708:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives());
            // InternalBasicsParser.g:1709:3: ( rule__KEYWORD__Alternatives )
            // InternalBasicsParser.g:1709:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleEString"
    // InternalBasicsParser.g:1718:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1719:1: ( ruleEString EOF )
            // InternalBasicsParser.g:1720:1: ruleEString EOF
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
    // InternalBasicsParser.g:1727:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1731:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBasicsParser.g:1732:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBasicsParser.g:1732:2: ( ( rule__EString__Alternatives ) )
            // InternalBasicsParser.g:1733:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives());
            // InternalBasicsParser.g:1734:3: ( rule__EString__Alternatives )
            // InternalBasicsParser.g:1734:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalBasicsParser.g:1742:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1746:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt1=1;
                }
                break;
            case RelativeNamespace:
                {
                alt1=2;
                }
                break;
            case PrivateNamespace:
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
                    // InternalBasicsParser.g:1747:2: ( ruleGlobalNamespace )
                    {
                    // InternalBasicsParser.g:1747:2: ( ruleGlobalNamespace )
                    // InternalBasicsParser.g:1748:3: ruleGlobalNamespace
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
                    // InternalBasicsParser.g:1753:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalBasicsParser.g:1753:2: ( ruleRelativeNamespace_Impl )
                    // InternalBasicsParser.g:1754:3: ruleRelativeNamespace_Impl
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
                    // InternalBasicsParser.g:1759:2: ( rulePrivateNamespace )
                    {
                    // InternalBasicsParser.g:1759:2: ( rulePrivateNamespace )
                    // InternalBasicsParser.g:1760:3: rulePrivateNamespace
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


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalBasicsParser.g:1769:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1773:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt2=1;
                }
                break;
            case Struct:
                {
                alt2=2;
                }
                break;
            case Integer:
                {
                alt2=3;
                }
                break;
            case String:
                {
                alt2=4;
                }
                break;
            case Double:
                {
                alt2=5;
                }
                break;
            case Boolean:
                {
                alt2=6;
                }
                break;
            case Base64:
                {
                alt2=7;
                }
                break;
            case RULE_BEGIN:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBasicsParser.g:1774:2: ( ruleParameterListType )
                    {
                    // InternalBasicsParser.g:1774:2: ( ruleParameterListType )
                    // InternalBasicsParser.g:1775:3: ruleParameterListType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    ruleParameterListType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:1780:2: ( ruleParameterStructType )
                    {
                    // InternalBasicsParser.g:1780:2: ( ruleParameterStructType )
                    // InternalBasicsParser.g:1781:3: ruleParameterStructType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleParameterStructType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalBasicsParser.g:1786:2: ( ruleParameterIntegerType )
                    {
                    // InternalBasicsParser.g:1786:2: ( ruleParameterIntegerType )
                    // InternalBasicsParser.g:1787:3: ruleParameterIntegerType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    ruleParameterIntegerType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalBasicsParser.g:1792:2: ( ruleParameterStringType )
                    {
                    // InternalBasicsParser.g:1792:2: ( ruleParameterStringType )
                    // InternalBasicsParser.g:1793:3: ruleParameterStringType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    ruleParameterStringType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalBasicsParser.g:1798:2: ( ruleParameterDoubleType )
                    {
                    // InternalBasicsParser.g:1798:2: ( ruleParameterDoubleType )
                    // InternalBasicsParser.g:1799:3: ruleParameterDoubleType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    ruleParameterDoubleType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalBasicsParser.g:1804:2: ( ruleParameterBooleanType )
                    {
                    // InternalBasicsParser.g:1804:2: ( ruleParameterBooleanType )
                    // InternalBasicsParser.g:1805:3: ruleParameterBooleanType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                    pushFollow(FOLLOW_2);
                    ruleParameterBooleanType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalBasicsParser.g:1810:2: ( ruleParameterBase64Type )
                    {
                    // InternalBasicsParser.g:1810:2: ( ruleParameterBase64Type )
                    // InternalBasicsParser.g:1811:3: ruleParameterBase64Type
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64Type();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());

                    }


                    }
                    break;
                case 8 :
                    // InternalBasicsParser.g:1816:2: ( ruleParameterArrayType )
                    {
                    // InternalBasicsParser.g:1816:2: ( ruleParameterArrayType )
                    // InternalBasicsParser.g:1817:3: ruleParameterArrayType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                    pushFollow(FOLLOW_2);
                    ruleParameterArrayType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());

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
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalBasicsParser.g:1826:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1830:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBasicsParser.g:1831:2: ( ruleParameterString )
                    {
                    // InternalBasicsParser.g:1831:2: ( ruleParameterString )
                    // InternalBasicsParser.g:1832:3: ruleParameterString
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    ruleParameterString();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:1837:2: ( ruleParameterBase64 )
                    {
                    // InternalBasicsParser.g:1837:2: ( ruleParameterBase64 )
                    // InternalBasicsParser.g:1838:3: ruleParameterBase64
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalBasicsParser.g:1843:2: ( ruleParameterInteger )
                    {
                    // InternalBasicsParser.g:1843:2: ( ruleParameterInteger )
                    // InternalBasicsParser.g:1844:3: ruleParameterInteger
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    ruleParameterInteger();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalBasicsParser.g:1849:2: ( ruleParameterDouble )
                    {
                    // InternalBasicsParser.g:1849:2: ( ruleParameterDouble )
                    // InternalBasicsParser.g:1850:3: ruleParameterDouble
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    ruleParameterDouble();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalBasicsParser.g:1855:2: ( ruleParameterBoolean )
                    {
                    // InternalBasicsParser.g:1855:2: ( ruleParameterBoolean )
                    // InternalBasicsParser.g:1856:3: ruleParameterBoolean
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    ruleParameterBoolean();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalBasicsParser.g:1861:2: ( ruleParameterList )
                    {
                    // InternalBasicsParser.g:1861:2: ( ruleParameterList )
                    // InternalBasicsParser.g:1862:3: ruleParameterList
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                    pushFollow(FOLLOW_2);
                    ruleParameterList();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalBasicsParser.g:1867:2: ( ruleParameterStruct )
                    {
                    // InternalBasicsParser.g:1867:2: ( ruleParameterStruct )
                    // InternalBasicsParser.g:1868:3: ruleParameterStruct
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                    pushFollow(FOLLOW_2);
                    ruleParameterStruct();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());

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
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__AbstractType__Alternatives"
    // InternalBasicsParser.g:1877:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:1881:1: ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) )
            int alt4=31;
            switch ( input.LA(1) ) {
            case Bool:
                {
                alt4=1;
                }
                break;
            case Int8:
                {
                alt4=2;
                }
                break;
            case Uint8:
                {
                alt4=3;
                }
                break;
            case Int16:
                {
                alt4=4;
                }
                break;
            case Uint16:
                {
                alt4=5;
                }
                break;
            case Int32:
                {
                alt4=6;
                }
                break;
            case Uint32:
                {
                alt4=7;
                }
                break;
            case Int64:
                {
                alt4=8;
                }
                break;
            case Uint64:
                {
                alt4=9;
                }
                break;
            case Float32:
                {
                alt4=10;
                }
                break;
            case Float64:
                {
                alt4=11;
                }
                break;
            case String_1:
                {
                alt4=12;
                }
                break;
            case Byte:
                {
                alt4=13;
                }
                break;
            case Time:
                {
                alt4=14;
                }
                break;
            case Duration:
                {
                alt4=15;
                }
                break;
            case Header:
                {
                alt4=16;
                }
                break;
            case Bool_1:
                {
                alt4=17;
                }
                break;
            case Int8_1:
                {
                alt4=18;
                }
                break;
            case Uint8_1:
                {
                alt4=19;
                }
                break;
            case Int16_1:
                {
                alt4=20;
                }
                break;
            case Uint16_1:
                {
                alt4=21;
                }
                break;
            case Int32_1:
                {
                alt4=22;
                }
                break;
            case Uint32_1:
                {
                alt4=23;
                }
                break;
            case Int64_1:
                {
                alt4=24;
                }
                break;
            case Uint64_1:
                {
                alt4=25;
                }
                break;
            case Float32_1:
                {
                alt4=26;
                }
                break;
            case Float64_1:
                {
                alt4=27;
                }
                break;
            case String_2:
                {
                alt4=28;
                }
                break;
            case Byte_1:
                {
                alt4=29;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt4=30;
                }
                break;
            case LeftSquareBracket:
                {
                alt4=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBasicsParser.g:1882:2: ( rulebool )
                    {
                    // InternalBasicsParser.g:1882:2: ( rulebool )
                    // InternalBasicsParser.g:1883:3: rulebool
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    rulebool();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:1888:2: ( ruleint8 )
                    {
                    // InternalBasicsParser.g:1888:2: ( ruleint8 )
                    // InternalBasicsParser.g:1889:3: ruleint8
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleint8();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalBasicsParser.g:1894:2: ( ruleuint8 )
                    {
                    // InternalBasicsParser.g:1894:2: ( ruleuint8 )
                    // InternalBasicsParser.g:1895:3: ruleuint8
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    ruleuint8();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalBasicsParser.g:1900:2: ( ruleint16 )
                    {
                    // InternalBasicsParser.g:1900:2: ( ruleint16 )
                    // InternalBasicsParser.g:1901:3: ruleint16
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    ruleint16();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalBasicsParser.g:1906:2: ( ruleuint16 )
                    {
                    // InternalBasicsParser.g:1906:2: ( ruleuint16 )
                    // InternalBasicsParser.g:1907:3: ruleuint16
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    ruleuint16();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalBasicsParser.g:1912:2: ( ruleint32 )
                    {
                    // InternalBasicsParser.g:1912:2: ( ruleint32 )
                    // InternalBasicsParser.g:1913:3: ruleint32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5());
                    pushFollow(FOLLOW_2);
                    ruleint32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalBasicsParser.g:1918:2: ( ruleuint32 )
                    {
                    // InternalBasicsParser.g:1918:2: ( ruleuint32 )
                    // InternalBasicsParser.g:1919:3: ruleuint32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6());
                    pushFollow(FOLLOW_2);
                    ruleuint32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6());

                    }


                    }
                    break;
                case 8 :
                    // InternalBasicsParser.g:1924:2: ( ruleint64 )
                    {
                    // InternalBasicsParser.g:1924:2: ( ruleint64 )
                    // InternalBasicsParser.g:1925:3: ruleint64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7());
                    pushFollow(FOLLOW_2);
                    ruleint64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7());

                    }


                    }
                    break;
                case 9 :
                    // InternalBasicsParser.g:1930:2: ( ruleuint64 )
                    {
                    // InternalBasicsParser.g:1930:2: ( ruleuint64 )
                    // InternalBasicsParser.g:1931:3: ruleuint64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8());
                    pushFollow(FOLLOW_2);
                    ruleuint64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8());

                    }


                    }
                    break;
                case 10 :
                    // InternalBasicsParser.g:1936:2: ( rulefloat32 )
                    {
                    // InternalBasicsParser.g:1936:2: ( rulefloat32 )
                    // InternalBasicsParser.g:1937:3: rulefloat32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9());
                    pushFollow(FOLLOW_2);
                    rulefloat32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9());

                    }


                    }
                    break;
                case 11 :
                    // InternalBasicsParser.g:1942:2: ( rulefloat64 )
                    {
                    // InternalBasicsParser.g:1942:2: ( rulefloat64 )
                    // InternalBasicsParser.g:1943:3: rulefloat64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10());
                    pushFollow(FOLLOW_2);
                    rulefloat64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10());

                    }


                    }
                    break;
                case 12 :
                    // InternalBasicsParser.g:1948:2: ( rulestring0 )
                    {
                    // InternalBasicsParser.g:1948:2: ( rulestring0 )
                    // InternalBasicsParser.g:1949:3: rulestring0
                    {
                     before(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11());
                    pushFollow(FOLLOW_2);
                    rulestring0();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11());

                    }


                    }
                    break;
                case 13 :
                    // InternalBasicsParser.g:1954:2: ( rulebyte )
                    {
                    // InternalBasicsParser.g:1954:2: ( rulebyte )
                    // InternalBasicsParser.g:1955:3: rulebyte
                    {
                     before(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12());
                    pushFollow(FOLLOW_2);
                    rulebyte();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12());

                    }


                    }
                    break;
                case 14 :
                    // InternalBasicsParser.g:1960:2: ( ruletime )
                    {
                    // InternalBasicsParser.g:1960:2: ( ruletime )
                    // InternalBasicsParser.g:1961:3: ruletime
                    {
                     before(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13());
                    pushFollow(FOLLOW_2);
                    ruletime();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13());

                    }


                    }
                    break;
                case 15 :
                    // InternalBasicsParser.g:1966:2: ( ruleduration )
                    {
                    // InternalBasicsParser.g:1966:2: ( ruleduration )
                    // InternalBasicsParser.g:1967:3: ruleduration
                    {
                     before(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14());
                    pushFollow(FOLLOW_2);
                    ruleduration();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14());

                    }


                    }
                    break;
                case 16 :
                    // InternalBasicsParser.g:1972:2: ( ruleHeader )
                    {
                    // InternalBasicsParser.g:1972:2: ( ruleHeader )
                    // InternalBasicsParser.g:1973:3: ruleHeader
                    {
                     before(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15());
                    pushFollow(FOLLOW_2);
                    ruleHeader();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15());

                    }


                    }
                    break;
                case 17 :
                    // InternalBasicsParser.g:1978:2: ( ruleboolArray )
                    {
                    // InternalBasicsParser.g:1978:2: ( ruleboolArray )
                    // InternalBasicsParser.g:1979:3: ruleboolArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16());
                    pushFollow(FOLLOW_2);
                    ruleboolArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16());

                    }


                    }
                    break;
                case 18 :
                    // InternalBasicsParser.g:1984:2: ( ruleint8Array )
                    {
                    // InternalBasicsParser.g:1984:2: ( ruleint8Array )
                    // InternalBasicsParser.g:1985:3: ruleint8Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17());
                    pushFollow(FOLLOW_2);
                    ruleint8Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17());

                    }


                    }
                    break;
                case 19 :
                    // InternalBasicsParser.g:1990:2: ( ruleuint8Array )
                    {
                    // InternalBasicsParser.g:1990:2: ( ruleuint8Array )
                    // InternalBasicsParser.g:1991:3: ruleuint8Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18());
                    pushFollow(FOLLOW_2);
                    ruleuint8Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18());

                    }


                    }
                    break;
                case 20 :
                    // InternalBasicsParser.g:1996:2: ( ruleint16Array )
                    {
                    // InternalBasicsParser.g:1996:2: ( ruleint16Array )
                    // InternalBasicsParser.g:1997:3: ruleint16Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19());
                    pushFollow(FOLLOW_2);
                    ruleint16Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19());

                    }


                    }
                    break;
                case 21 :
                    // InternalBasicsParser.g:2002:2: ( ruleuint16Array )
                    {
                    // InternalBasicsParser.g:2002:2: ( ruleuint16Array )
                    // InternalBasicsParser.g:2003:3: ruleuint16Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20());
                    pushFollow(FOLLOW_2);
                    ruleuint16Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20());

                    }


                    }
                    break;
                case 22 :
                    // InternalBasicsParser.g:2008:2: ( ruleint32Array )
                    {
                    // InternalBasicsParser.g:2008:2: ( ruleint32Array )
                    // InternalBasicsParser.g:2009:3: ruleint32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21());
                    pushFollow(FOLLOW_2);
                    ruleint32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21());

                    }


                    }
                    break;
                case 23 :
                    // InternalBasicsParser.g:2014:2: ( ruleuint32Array )
                    {
                    // InternalBasicsParser.g:2014:2: ( ruleuint32Array )
                    // InternalBasicsParser.g:2015:3: ruleuint32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22());
                    pushFollow(FOLLOW_2);
                    ruleuint32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22());

                    }


                    }
                    break;
                case 24 :
                    // InternalBasicsParser.g:2020:2: ( ruleint64Array )
                    {
                    // InternalBasicsParser.g:2020:2: ( ruleint64Array )
                    // InternalBasicsParser.g:2021:3: ruleint64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23());
                    pushFollow(FOLLOW_2);
                    ruleint64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23());

                    }


                    }
                    break;
                case 25 :
                    // InternalBasicsParser.g:2026:2: ( ruleuint64Array )
                    {
                    // InternalBasicsParser.g:2026:2: ( ruleuint64Array )
                    // InternalBasicsParser.g:2027:3: ruleuint64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24());
                    pushFollow(FOLLOW_2);
                    ruleuint64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24());

                    }


                    }
                    break;
                case 26 :
                    // InternalBasicsParser.g:2032:2: ( rulefloat32Array )
                    {
                    // InternalBasicsParser.g:2032:2: ( rulefloat32Array )
                    // InternalBasicsParser.g:2033:3: rulefloat32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25());
                    pushFollow(FOLLOW_2);
                    rulefloat32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25());

                    }


                    }
                    break;
                case 27 :
                    // InternalBasicsParser.g:2038:2: ( rulefloat64Array )
                    {
                    // InternalBasicsParser.g:2038:2: ( rulefloat64Array )
                    // InternalBasicsParser.g:2039:3: rulefloat64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26());
                    pushFollow(FOLLOW_2);
                    rulefloat64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26());

                    }


                    }
                    break;
                case 28 :
                    // InternalBasicsParser.g:2044:2: ( rulestring0Array )
                    {
                    // InternalBasicsParser.g:2044:2: ( rulestring0Array )
                    // InternalBasicsParser.g:2045:3: rulestring0Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27());
                    pushFollow(FOLLOW_2);
                    rulestring0Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27());

                    }


                    }
                    break;
                case 29 :
                    // InternalBasicsParser.g:2050:2: ( rulebyteArray )
                    {
                    // InternalBasicsParser.g:2050:2: ( rulebyteArray )
                    // InternalBasicsParser.g:2051:3: rulebyteArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28());
                    pushFollow(FOLLOW_2);
                    rulebyteArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28());

                    }


                    }
                    break;
                case 30 :
                    // InternalBasicsParser.g:2056:2: ( ruleTopicSpecRef )
                    {
                    // InternalBasicsParser.g:2056:2: ( ruleTopicSpecRef )
                    // InternalBasicsParser.g:2057:3: ruleTopicSpecRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getTopicSpecRefParserRuleCall_29());
                    pushFollow(FOLLOW_2);
                    ruleTopicSpecRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getTopicSpecRefParserRuleCall_29());

                    }


                    }
                    break;
                case 31 :
                    // InternalBasicsParser.g:2062:2: ( ruleArrayTopicSpecRef )
                    {
                    // InternalBasicsParser.g:2062:2: ( ruleArrayTopicSpecRef )
                    // InternalBasicsParser.g:2063:3: ruleArrayTopicSpecRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getArrayTopicSpecRefParserRuleCall_30());
                    pushFollow(FOLLOW_2);
                    ruleArrayTopicSpecRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getArrayTopicSpecRefParserRuleCall_30());

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
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalBasicsParser.g:2072:1: rule__KEYWORD__Alternatives : ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2076:1: ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) )
            int alt5=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt5=1;
                }
                break;
            case Message:
                {
                alt5=2;
                }
                break;
            case Result:
                {
                alt5=3;
                }
                break;
            case Feedback:
                {
                alt5=4;
                }
                break;
            case Name:
                {
                alt5=5;
                }
                break;
            case Value:
                {
                alt5=6;
                }
                break;
            case Service:
                {
                alt5=7;
                }
                break;
            case Type:
                {
                alt5=8;
                }
                break;
            case Action:
                {
                alt5=9;
                }
                break;
            case Duration:
                {
                alt5=10;
                }
                break;
            case Time:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBasicsParser.g:2077:2: ( Goal )
                    {
                    // InternalBasicsParser.g:2077:2: ( Goal )
                    // InternalBasicsParser.g:2078:3: Goal
                    {
                     before(grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    match(input,Goal,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getGoalKeyword_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:2083:2: ( Message )
                    {
                    // InternalBasicsParser.g:2083:2: ( Message )
                    // InternalBasicsParser.g:2084:3: Message
                    {
                     before(grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    match(input,Message,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getMessageKeyword_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalBasicsParser.g:2089:2: ( Result )
                    {
                    // InternalBasicsParser.g:2089:2: ( Result )
                    // InternalBasicsParser.g:2090:3: Result
                    {
                     before(grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    match(input,Result,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getResultKeyword_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalBasicsParser.g:2095:2: ( Feedback )
                    {
                    // InternalBasicsParser.g:2095:2: ( Feedback )
                    // InternalBasicsParser.g:2096:3: Feedback
                    {
                     before(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    match(input,Feedback,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalBasicsParser.g:2101:2: ( Name )
                    {
                    // InternalBasicsParser.g:2101:2: ( Name )
                    // InternalBasicsParser.g:2102:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    match(input,Name,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalBasicsParser.g:2107:2: ( Value )
                    {
                    // InternalBasicsParser.g:2107:2: ( Value )
                    // InternalBasicsParser.g:2108:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    match(input,Value,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalBasicsParser.g:2113:2: ( Service )
                    {
                    // InternalBasicsParser.g:2113:2: ( Service )
                    // InternalBasicsParser.g:2114:3: Service
                    {
                     before(grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    match(input,Service,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getServiceKeyword_6());

                    }


                    }
                    break;
                case 8 :
                    // InternalBasicsParser.g:2119:2: ( Type )
                    {
                    // InternalBasicsParser.g:2119:2: ( Type )
                    // InternalBasicsParser.g:2120:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    match(input,Type,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7());

                    }


                    }
                    break;
                case 9 :
                    // InternalBasicsParser.g:2125:2: ( Action )
                    {
                    // InternalBasicsParser.g:2125:2: ( Action )
                    // InternalBasicsParser.g:2126:3: Action
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    match(input,Action,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_8());

                    }


                    }
                    break;
                case 10 :
                    // InternalBasicsParser.g:2131:2: ( Duration )
                    {
                    // InternalBasicsParser.g:2131:2: ( Duration )
                    // InternalBasicsParser.g:2132:3: Duration
                    {
                     before(grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    match(input,Duration,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getDurationKeyword_9());

                    }


                    }
                    break;
                case 11 :
                    // InternalBasicsParser.g:2137:2: ( Time )
                    {
                    // InternalBasicsParser.g:2137:2: ( Time )
                    // InternalBasicsParser.g:2138:3: Time
                    {
                     before(grammarAccess.getKEYWORDAccess().getTimeKeyword_10());
                    match(input,Time,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getTimeKeyword_10());

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
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBasicsParser.g:2147:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2151:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBasicsParser.g:2152:2: ( RULE_STRING )
                    {
                    // InternalBasicsParser.g:2152:2: ( RULE_STRING )
                    // InternalBasicsParser.g:2153:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    match(input,RULE_STRING,FOLLOW_2);
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:2158:2: ( RULE_ID )
                    {
                    // InternalBasicsParser.g:2158:2: ( RULE_ID )
                    // InternalBasicsParser.g:2159:3: RULE_ID
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


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalBasicsParser.g:2168:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2172:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalBasicsParser.g:2173:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBasicsParser.g:2180:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2184:1: ( ( () ) )
            // InternalBasicsParser.g:2185:1: ( () )
            {
            // InternalBasicsParser.g:2185:1: ( () )
            // InternalBasicsParser.g:2186:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0());
            // InternalBasicsParser.g:2187:2: ()
            // InternalBasicsParser.g:2187:3:
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
    // InternalBasicsParser.g:2195:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2199:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalBasicsParser.g:2200:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBasicsParser.g:2207:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2211:1: ( ( GlobalNamespace ) )
            // InternalBasicsParser.g:2212:1: ( GlobalNamespace )
            {
            // InternalBasicsParser.g:2212:1: ( GlobalNamespace )
            // InternalBasicsParser.g:2213:2: GlobalNamespace
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            match(input,GlobalNamespace,FOLLOW_2);
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
    // InternalBasicsParser.g:2222:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2226:1: ( rule__GlobalNamespace__Group__2__Impl )
            // InternalBasicsParser.g:2227:2: rule__GlobalNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalBasicsParser.g:2233:1: rule__GlobalNamespace__Group__2__Impl : ( ( rule__GlobalNamespace__Group_2__0 )? ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2237:1: ( ( ( rule__GlobalNamespace__Group_2__0 )? ) )
            // InternalBasicsParser.g:2238:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            {
            // InternalBasicsParser.g:2238:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            // InternalBasicsParser.g:2239:2: ( rule__GlobalNamespace__Group_2__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2());
            // InternalBasicsParser.g:2240:2: ( rule__GlobalNamespace__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LeftSquareBracket) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBasicsParser.g:2240:3: rule__GlobalNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_2());

            }


            }

        }
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


    // $ANTLR start "rule__GlobalNamespace__Group_2__0"
    // InternalBasicsParser.g:2249:1: rule__GlobalNamespace__Group_2__0 : rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 ;
    public final void rule__GlobalNamespace__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2253:1: ( rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 )
            // InternalBasicsParser.g:2254:2: rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GlobalNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__0"


    // $ANTLR start "rule__GlobalNamespace__Group_2__0__Impl"
    // InternalBasicsParser.g:2261:1: rule__GlobalNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2265:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2266:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2266:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2267:2: LeftSquareBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__1"
    // InternalBasicsParser.g:2276:1: rule__GlobalNamespace__Group_2__1 : rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 ;
    public final void rule__GlobalNamespace__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2280:1: ( rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 )
            // InternalBasicsParser.g:2281:2: rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__GlobalNamespace__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__1"


    // $ANTLR start "rule__GlobalNamespace__Group_2__1__Impl"
    // InternalBasicsParser.g:2288:1: rule__GlobalNamespace__Group_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2292:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) )
            // InternalBasicsParser.g:2293:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:2293:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            // InternalBasicsParser.g:2294:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1());
            // InternalBasicsParser.g:2295:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            // InternalBasicsParser.g:2295:3: rule__GlobalNamespace__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__2"
    // InternalBasicsParser.g:2303:1: rule__GlobalNamespace__Group_2__2 : rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 ;
    public final void rule__GlobalNamespace__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2307:1: ( rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 )
            // InternalBasicsParser.g:2308:2: rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__GlobalNamespace__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__2"


    // $ANTLR start "rule__GlobalNamespace__Group_2__2__Impl"
    // InternalBasicsParser.g:2315:1: rule__GlobalNamespace__Group_2__2__Impl : ( ( rule__GlobalNamespace__Group_2_2__0 )* ) ;
    public final void rule__GlobalNamespace__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2319:1: ( ( ( rule__GlobalNamespace__Group_2_2__0 )* ) )
            // InternalBasicsParser.g:2320:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            {
            // InternalBasicsParser.g:2320:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            // InternalBasicsParser.g:2321:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2());
            // InternalBasicsParser.g:2322:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
                case 1 :
                    // InternalBasicsParser.g:2322:3: rule__GlobalNamespace__Group_2_2__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__GlobalNamespace__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop8;
                }
            } while (true);

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__3"
    // InternalBasicsParser.g:2330:1: rule__GlobalNamespace__Group_2__3 : rule__GlobalNamespace__Group_2__3__Impl ;
    public final void rule__GlobalNamespace__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2334:1: ( rule__GlobalNamespace__Group_2__3__Impl )
            // InternalBasicsParser.g:2335:2: rule__GlobalNamespace__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__3"


    // $ANTLR start "rule__GlobalNamespace__Group_2__3__Impl"
    // InternalBasicsParser.g:2341:1: rule__GlobalNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2345:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:2346:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:2346:1: ( RightSquareBracket )
            // InternalBasicsParser.g:2347:2: RightSquareBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__0"
    // InternalBasicsParser.g:2357:1: rule__GlobalNamespace__Group_2_2__0 : rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 ;
    public final void rule__GlobalNamespace__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2361:1: ( rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 )
            // InternalBasicsParser.g:2362:2: rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GlobalNamespace__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__0"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__0__Impl"
    // InternalBasicsParser.g:2369:1: rule__GlobalNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2373:1: ( ( Comma ) )
            // InternalBasicsParser.g:2374:1: ( Comma )
            {
            // InternalBasicsParser.g:2374:1: ( Comma )
            // InternalBasicsParser.g:2375:2: Comma
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__1"
    // InternalBasicsParser.g:2384:1: rule__GlobalNamespace__Group_2_2__1 : rule__GlobalNamespace__Group_2_2__1__Impl ;
    public final void rule__GlobalNamespace__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2388:1: ( rule__GlobalNamespace__Group_2_2__1__Impl )
            // InternalBasicsParser.g:2389:2: rule__GlobalNamespace__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__1"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__1__Impl"
    // InternalBasicsParser.g:2395:1: rule__GlobalNamespace__Group_2_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2399:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalBasicsParser.g:2400:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalBasicsParser.g:2400:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            // InternalBasicsParser.g:2401:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1());
            // InternalBasicsParser.g:2402:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            // InternalBasicsParser.g:2402:3: rule__GlobalNamespace__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalBasicsParser.g:2411:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2415:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalBasicsParser.g:2416:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBasicsParser.g:2423:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2427:1: ( ( () ) )
            // InternalBasicsParser.g:2428:1: ( () )
            {
            // InternalBasicsParser.g:2428:1: ( () )
            // InternalBasicsParser.g:2429:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0());
            // InternalBasicsParser.g:2430:2: ()
            // InternalBasicsParser.g:2430:3:
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
    // InternalBasicsParser.g:2438:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2442:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalBasicsParser.g:2443:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBasicsParser.g:2450:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2454:1: ( ( RelativeNamespace ) )
            // InternalBasicsParser.g:2455:1: ( RelativeNamespace )
            {
            // InternalBasicsParser.g:2455:1: ( RelativeNamespace )
            // InternalBasicsParser.g:2456:2: RelativeNamespace
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            match(input,RelativeNamespace,FOLLOW_2);
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
    // InternalBasicsParser.g:2465:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2469:1: ( rule__RelativeNamespace_Impl__Group__2__Impl )
            // InternalBasicsParser.g:2470:2: rule__RelativeNamespace_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalBasicsParser.g:2476:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2480:1: ( ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) )
            // InternalBasicsParser.g:2481:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            {
            // InternalBasicsParser.g:2481:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            // InternalBasicsParser.g:2482:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2());
            // InternalBasicsParser.g:2483:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftSquareBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBasicsParser.g:2483:3: rule__RelativeNamespace_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeNamespace_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2());

            }


            }

        }
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


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__0"
    // InternalBasicsParser.g:2492:1: rule__RelativeNamespace_Impl__Group_2__0 : rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2496:1: ( rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 )
            // InternalBasicsParser.g:2497:2: rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__RelativeNamespace_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__0__Impl"
    // InternalBasicsParser.g:2504:1: rule__RelativeNamespace_Impl__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2508:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2509:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2509:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2510:2: LeftSquareBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__1"
    // InternalBasicsParser.g:2519:1: rule__RelativeNamespace_Impl__Group_2__1 : rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 ;
    public final void rule__RelativeNamespace_Impl__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2523:1: ( rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 )
            // InternalBasicsParser.g:2524:2: rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__RelativeNamespace_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__1__Impl"
    // InternalBasicsParser.g:2531:1: rule__RelativeNamespace_Impl__Group_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2535:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) )
            // InternalBasicsParser.g:2536:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:2536:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            // InternalBasicsParser.g:2537:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1());
            // InternalBasicsParser.g:2538:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            // InternalBasicsParser.g:2538:3: rule__RelativeNamespace_Impl__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__2"
    // InternalBasicsParser.g:2546:1: rule__RelativeNamespace_Impl__Group_2__2 : rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 ;
    public final void rule__RelativeNamespace_Impl__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2550:1: ( rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 )
            // InternalBasicsParser.g:2551:2: rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__RelativeNamespace_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__2__Impl"
    // InternalBasicsParser.g:2558:1: rule__RelativeNamespace_Impl__Group_2__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2562:1: ( ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) )
            // InternalBasicsParser.g:2563:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            {
            // InternalBasicsParser.g:2563:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            // InternalBasicsParser.g:2564:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2());
            // InternalBasicsParser.g:2565:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // InternalBasicsParser.g:2565:3: rule__RelativeNamespace_Impl__Group_2_2__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__RelativeNamespace_Impl__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop10;
                }
            } while (true);

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__3"
    // InternalBasicsParser.g:2573:1: rule__RelativeNamespace_Impl__Group_2__3 : rule__RelativeNamespace_Impl__Group_2__3__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2577:1: ( rule__RelativeNamespace_Impl__Group_2__3__Impl )
            // InternalBasicsParser.g:2578:2: rule__RelativeNamespace_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__3__Impl"
    // InternalBasicsParser.g:2584:1: rule__RelativeNamespace_Impl__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2588:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:2589:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:2589:1: ( RightSquareBracket )
            // InternalBasicsParser.g:2590:2: RightSquareBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__0"
    // InternalBasicsParser.g:2600:1: rule__RelativeNamespace_Impl__Group_2_2__0 : rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2604:1: ( rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 )
            // InternalBasicsParser.g:2605:2: rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__RelativeNamespace_Impl__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__0__Impl"
    // InternalBasicsParser.g:2612:1: rule__RelativeNamespace_Impl__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2616:1: ( ( Comma ) )
            // InternalBasicsParser.g:2617:1: ( Comma )
            {
            // InternalBasicsParser.g:2617:1: ( Comma )
            // InternalBasicsParser.g:2618:2: Comma
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__1"
    // InternalBasicsParser.g:2627:1: rule__RelativeNamespace_Impl__Group_2_2__1 : rule__RelativeNamespace_Impl__Group_2_2__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2631:1: ( rule__RelativeNamespace_Impl__Group_2_2__1__Impl )
            // InternalBasicsParser.g:2632:2: rule__RelativeNamespace_Impl__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__1__Impl"
    // InternalBasicsParser.g:2638:1: rule__RelativeNamespace_Impl__Group_2_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2642:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) )
            // InternalBasicsParser.g:2643:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            {
            // InternalBasicsParser.g:2643:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            // InternalBasicsParser.g:2644:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1());
            // InternalBasicsParser.g:2645:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            // InternalBasicsParser.g:2645:3: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalBasicsParser.g:2654:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2658:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalBasicsParser.g:2659:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBasicsParser.g:2666:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2670:1: ( ( () ) )
            // InternalBasicsParser.g:2671:1: ( () )
            {
            // InternalBasicsParser.g:2671:1: ( () )
            // InternalBasicsParser.g:2672:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0());
            // InternalBasicsParser.g:2673:2: ()
            // InternalBasicsParser.g:2673:3:
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
    // InternalBasicsParser.g:2681:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2685:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalBasicsParser.g:2686:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBasicsParser.g:2693:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2697:1: ( ( PrivateNamespace ) )
            // InternalBasicsParser.g:2698:1: ( PrivateNamespace )
            {
            // InternalBasicsParser.g:2698:1: ( PrivateNamespace )
            // InternalBasicsParser.g:2699:2: PrivateNamespace
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            match(input,PrivateNamespace,FOLLOW_2);
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
    // InternalBasicsParser.g:2708:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2712:1: ( rule__PrivateNamespace__Group__2__Impl )
            // InternalBasicsParser.g:2713:2: rule__PrivateNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalBasicsParser.g:2719:1: rule__PrivateNamespace__Group__2__Impl : ( ( rule__PrivateNamespace__Group_2__0 )? ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2723:1: ( ( ( rule__PrivateNamespace__Group_2__0 )? ) )
            // InternalBasicsParser.g:2724:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            {
            // InternalBasicsParser.g:2724:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            // InternalBasicsParser.g:2725:2: ( rule__PrivateNamespace__Group_2__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2());
            // InternalBasicsParser.g:2726:2: ( rule__PrivateNamespace__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LeftSquareBracket) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBasicsParser.g:2726:3: rule__PrivateNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrivateNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_2());

            }


            }

        }
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


    // $ANTLR start "rule__PrivateNamespace__Group_2__0"
    // InternalBasicsParser.g:2735:1: rule__PrivateNamespace__Group_2__0 : rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 ;
    public final void rule__PrivateNamespace__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2739:1: ( rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 )
            // InternalBasicsParser.g:2740:2: rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__PrivateNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__0"


    // $ANTLR start "rule__PrivateNamespace__Group_2__0__Impl"
    // InternalBasicsParser.g:2747:1: rule__PrivateNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2751:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2752:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2752:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2753:2: LeftSquareBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__1"
    // InternalBasicsParser.g:2762:1: rule__PrivateNamespace__Group_2__1 : rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 ;
    public final void rule__PrivateNamespace__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2766:1: ( rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 )
            // InternalBasicsParser.g:2767:2: rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__PrivateNamespace__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__1"


    // $ANTLR start "rule__PrivateNamespace__Group_2__1__Impl"
    // InternalBasicsParser.g:2774:1: rule__PrivateNamespace__Group_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2778:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) )
            // InternalBasicsParser.g:2779:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:2779:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            // InternalBasicsParser.g:2780:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1());
            // InternalBasicsParser.g:2781:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            // InternalBasicsParser.g:2781:3: rule__PrivateNamespace__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__2"
    // InternalBasicsParser.g:2789:1: rule__PrivateNamespace__Group_2__2 : rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 ;
    public final void rule__PrivateNamespace__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2793:1: ( rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 )
            // InternalBasicsParser.g:2794:2: rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__PrivateNamespace__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__2"


    // $ANTLR start "rule__PrivateNamespace__Group_2__2__Impl"
    // InternalBasicsParser.g:2801:1: rule__PrivateNamespace__Group_2__2__Impl : ( ( rule__PrivateNamespace__Group_2_2__0 )* ) ;
    public final void rule__PrivateNamespace__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2805:1: ( ( ( rule__PrivateNamespace__Group_2_2__0 )* ) )
            // InternalBasicsParser.g:2806:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            {
            // InternalBasicsParser.g:2806:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            // InternalBasicsParser.g:2807:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2());
            // InternalBasicsParser.g:2808:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
                case 1 :
                    // InternalBasicsParser.g:2808:3: rule__PrivateNamespace__Group_2_2__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__PrivateNamespace__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop12;
                }
            } while (true);

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__3"
    // InternalBasicsParser.g:2816:1: rule__PrivateNamespace__Group_2__3 : rule__PrivateNamespace__Group_2__3__Impl ;
    public final void rule__PrivateNamespace__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2820:1: ( rule__PrivateNamespace__Group_2__3__Impl )
            // InternalBasicsParser.g:2821:2: rule__PrivateNamespace__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__3"


    // $ANTLR start "rule__PrivateNamespace__Group_2__3__Impl"
    // InternalBasicsParser.g:2827:1: rule__PrivateNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2831:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:2832:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:2832:1: ( RightSquareBracket )
            // InternalBasicsParser.g:2833:2: RightSquareBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__0"
    // InternalBasicsParser.g:2843:1: rule__PrivateNamespace__Group_2_2__0 : rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 ;
    public final void rule__PrivateNamespace__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2847:1: ( rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 )
            // InternalBasicsParser.g:2848:2: rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__PrivateNamespace__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__0"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__0__Impl"
    // InternalBasicsParser.g:2855:1: rule__PrivateNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2859:1: ( ( Comma ) )
            // InternalBasicsParser.g:2860:1: ( Comma )
            {
            // InternalBasicsParser.g:2860:1: ( Comma )
            // InternalBasicsParser.g:2861:2: Comma
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__1"
    // InternalBasicsParser.g:2870:1: rule__PrivateNamespace__Group_2_2__1 : rule__PrivateNamespace__Group_2_2__1__Impl ;
    public final void rule__PrivateNamespace__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2874:1: ( rule__PrivateNamespace__Group_2_2__1__Impl )
            // InternalBasicsParser.g:2875:2: rule__PrivateNamespace__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__1"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__1__Impl"
    // InternalBasicsParser.g:2881:1: rule__PrivateNamespace__Group_2_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2885:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalBasicsParser.g:2886:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalBasicsParser.g:2886:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            // InternalBasicsParser.g:2887:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1());
            // InternalBasicsParser.g:2888:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            // InternalBasicsParser.g:2888:3: rule__PrivateNamespace__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__1__Impl"


    // $ANTLR start "rule__ParameterListType__Group__0"
    // InternalBasicsParser.g:2897:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2901:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalBasicsParser.g:2902:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ParameterListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__0"


    // $ANTLR start "rule__ParameterListType__Group__0__Impl"
    // InternalBasicsParser.g:2909:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2913:1: ( ( () ) )
            // InternalBasicsParser.g:2914:1: ( () )
            {
            // InternalBasicsParser.g:2914:1: ( () )
            // InternalBasicsParser.g:2915:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0());
            // InternalBasicsParser.g:2916:2: ()
            // InternalBasicsParser.g:2916:3:
            {
            }

             after(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__0__Impl"


    // $ANTLR start "rule__ParameterListType__Group__1"
    // InternalBasicsParser.g:2924:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2928:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalBasicsParser.g:2929:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ParameterListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__1"


    // $ANTLR start "rule__ParameterListType__Group__1__Impl"
    // InternalBasicsParser.g:2936:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2940:1: ( ( List ) )
            // InternalBasicsParser.g:2941:1: ( List )
            {
            // InternalBasicsParser.g:2941:1: ( List )
            // InternalBasicsParser.g:2942:2: List
            {
             before(grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            match(input,List,FOLLOW_2);
             after(grammarAccess.getParameterListTypeAccess().getListKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__1__Impl"


    // $ANTLR start "rule__ParameterListType__Group__2"
    // InternalBasicsParser.g:2951:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2955:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalBasicsParser.g:2956:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ParameterListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__2"


    // $ANTLR start "rule__ParameterListType__Group__2__Impl"
    // InternalBasicsParser.g:2963:1: rule__ParameterListType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2967:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2968:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2968:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2969:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__2__Impl"


    // $ANTLR start "rule__ParameterListType__Group__3"
    // InternalBasicsParser.g:2978:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2982:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalBasicsParser.g:2983:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ParameterListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__3"


    // $ANTLR start "rule__ParameterListType__Group__3__Impl"
    // InternalBasicsParser.g:2990:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:2994:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalBasicsParser.g:2995:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalBasicsParser.g:2995:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalBasicsParser.g:2996:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3());
            // InternalBasicsParser.g:2997:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalBasicsParser.g:2997:3: rule__ParameterListType__SequenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__SequenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__3__Impl"


    // $ANTLR start "rule__ParameterListType__Group__4"
    // InternalBasicsParser.g:3005:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3009:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalBasicsParser.g:3010:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ParameterListType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__4"


    // $ANTLR start "rule__ParameterListType__Group__4__Impl"
    // InternalBasicsParser.g:3017:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3021:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalBasicsParser.g:3022:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalBasicsParser.g:3022:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalBasicsParser.g:3023:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4());
            // InternalBasicsParser.g:3024:2: ( rule__ParameterListType__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
                case 1 :
                    // InternalBasicsParser.g:3024:3: rule__ParameterListType__Group_4__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__ParameterListType__Group_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop13;
                }
            } while (true);

             after(grammarAccess.getParameterListTypeAccess().getGroup_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__4__Impl"


    // $ANTLR start "rule__ParameterListType__Group__5"
    // InternalBasicsParser.g:3032:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3036:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalBasicsParser.g:3037:2: rule__ParameterListType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__5"


    // $ANTLR start "rule__ParameterListType__Group__5__Impl"
    // InternalBasicsParser.g:3043:1: rule__ParameterListType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3047:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:3048:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:3048:1: ( RightSquareBracket )
            // InternalBasicsParser.g:3049:2: RightSquareBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__5__Impl"


    // $ANTLR start "rule__ParameterListType__Group_4__0"
    // InternalBasicsParser.g:3059:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3063:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalBasicsParser.g:3064:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__ParameterListType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__0"


    // $ANTLR start "rule__ParameterListType__Group_4__0__Impl"
    // InternalBasicsParser.g:3071:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3075:1: ( ( Comma ) )
            // InternalBasicsParser.g:3076:1: ( Comma )
            {
            // InternalBasicsParser.g:3076:1: ( Comma )
            // InternalBasicsParser.g:3077:2: Comma
            {
             before(grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterListType__Group_4__1"
    // InternalBasicsParser.g:3086:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3090:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalBasicsParser.g:3091:2: rule__ParameterListType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__1"


    // $ANTLR start "rule__ParameterListType__Group_4__1__Impl"
    // InternalBasicsParser.g:3097:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3101:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalBasicsParser.g:3102:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalBasicsParser.g:3102:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalBasicsParser.g:3103:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1());
            // InternalBasicsParser.g:3104:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalBasicsParser.g:3104:3: rule__ParameterListType__SequenceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__SequenceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__0"
    // InternalBasicsParser.g:3113:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3117:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalBasicsParser.g:3118:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ParameterStructType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__0"


    // $ANTLR start "rule__ParameterStructType__Group__0__Impl"
    // InternalBasicsParser.g:3125:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3129:1: ( ( () ) )
            // InternalBasicsParser.g:3130:1: ( () )
            {
            // InternalBasicsParser.g:3130:1: ( () )
            // InternalBasicsParser.g:3131:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0());
            // InternalBasicsParser.g:3132:2: ()
            // InternalBasicsParser.g:3132:3:
            {
            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__1"
    // InternalBasicsParser.g:3140:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3144:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalBasicsParser.g:3145:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ParameterStructType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__1"


    // $ANTLR start "rule__ParameterStructType__Group__1__Impl"
    // InternalBasicsParser.g:3152:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3156:1: ( ( Struct ) )
            // InternalBasicsParser.g:3157:1: ( Struct )
            {
            // InternalBasicsParser.g:3157:1: ( Struct )
            // InternalBasicsParser.g:3158:2: Struct
            {
             before(grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            match(input,Struct,FOLLOW_2);
             after(grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__2"
    // InternalBasicsParser.g:3167:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3171:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalBasicsParser.g:3172:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ParameterStructType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__2"


    // $ANTLR start "rule__ParameterStructType__Group__2__Impl"
    // InternalBasicsParser.g:3179:1: rule__ParameterStructType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3183:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:3184:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:3184:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:3185:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__3"
    // InternalBasicsParser.g:3194:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3198:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalBasicsParser.g:3199:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ParameterStructType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__3"


    // $ANTLR start "rule__ParameterStructType__Group__3__Impl"
    // InternalBasicsParser.g:3206:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3210:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalBasicsParser.g:3211:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalBasicsParser.g:3211:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalBasicsParser.g:3212:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3());
            // InternalBasicsParser.g:3213:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalBasicsParser.g:3213:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__ParameterstructypetmemberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__3__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__4"
    // InternalBasicsParser.g:3221:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3225:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalBasicsParser.g:3226:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ParameterStructType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__4"


    // $ANTLR start "rule__ParameterStructType__Group__4__Impl"
    // InternalBasicsParser.g:3233:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3237:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalBasicsParser.g:3238:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalBasicsParser.g:3238:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalBasicsParser.g:3239:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4());
            // InternalBasicsParser.g:3240:2: ( rule__ParameterStructType__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
                case 1 :
                    // InternalBasicsParser.g:3240:3: rule__ParameterStructType__Group_4__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__ParameterStructType__Group_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop14;
                }
            } while (true);

             after(grammarAccess.getParameterStructTypeAccess().getGroup_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__4__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__5"
    // InternalBasicsParser.g:3248:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3252:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalBasicsParser.g:3253:2: rule__ParameterStructType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__5"


    // $ANTLR start "rule__ParameterStructType__Group__5__Impl"
    // InternalBasicsParser.g:3259:1: rule__ParameterStructType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3263:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:3264:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:3264:1: ( RightSquareBracket )
            // InternalBasicsParser.g:3265:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__5__Impl"


    // $ANTLR start "rule__ParameterStructType__Group_4__0"
    // InternalBasicsParser.g:3275:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3279:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalBasicsParser.g:3280:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ParameterStructType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__0"


    // $ANTLR start "rule__ParameterStructType__Group_4__0__Impl"
    // InternalBasicsParser.g:3287:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3291:1: ( ( Comma ) )
            // InternalBasicsParser.g:3292:1: ( Comma )
            {
            // InternalBasicsParser.g:3292:1: ( Comma )
            // InternalBasicsParser.g:3293:2: Comma
            {
             before(grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterStructType__Group_4__1"
    // InternalBasicsParser.g:3302:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3306:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalBasicsParser.g:3307:2: rule__ParameterStructType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__1"


    // $ANTLR start "rule__ParameterStructType__Group_4__1__Impl"
    // InternalBasicsParser.g:3313:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3317:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalBasicsParser.g:3318:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalBasicsParser.g:3318:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalBasicsParser.g:3319:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1());
            // InternalBasicsParser.g:3320:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalBasicsParser.g:3320:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__0"
    // InternalBasicsParser.g:3329:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3333:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalBasicsParser.g:3334:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterIntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__0"


    // $ANTLR start "rule__ParameterIntegerType__Group__0__Impl"
    // InternalBasicsParser.g:3341:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3345:1: ( ( () ) )
            // InternalBasicsParser.g:3346:1: ( () )
            {
            // InternalBasicsParser.g:3346:1: ( () )
            // InternalBasicsParser.g:3347:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0());
            // InternalBasicsParser.g:3348:2: ()
            // InternalBasicsParser.g:3348:3:
            {
            }

             after(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__0__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__1"
    // InternalBasicsParser.g:3356:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3360:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalBasicsParser.g:3361:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterIntegerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__1"


    // $ANTLR start "rule__ParameterIntegerType__Group__1__Impl"
    // InternalBasicsParser.g:3368:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3372:1: ( ( Integer ) )
            // InternalBasicsParser.g:3373:1: ( Integer )
            {
            // InternalBasicsParser.g:3373:1: ( Integer )
            // InternalBasicsParser.g:3374:2: Integer
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            match(input,Integer,FOLLOW_2);
             after(grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__1__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__2"
    // InternalBasicsParser.g:3383:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3387:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalBasicsParser.g:3388:2: rule__ParameterIntegerType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__2"


    // $ANTLR start "rule__ParameterIntegerType__Group__2__Impl"
    // InternalBasicsParser.g:3394:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3398:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3399:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3399:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalBasicsParser.g:3400:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2());
            // InternalBasicsParser.g:3401:2: ( rule__ParameterIntegerType__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Default) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_DECINT) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalBasicsParser.g:3401:3: rule__ParameterIntegerType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterIntegerType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterIntegerTypeAccess().getGroup_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__2__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__0"
    // InternalBasicsParser.g:3410:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3414:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalBasicsParser.g:3415:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__ParameterIntegerType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__0"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__0__Impl"
    // InternalBasicsParser.g:3422:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3426:1: ( ( Default ) )
            // InternalBasicsParser.g:3427:1: ( Default )
            {
            // InternalBasicsParser.g:3427:1: ( Default )
            // InternalBasicsParser.g:3428:2: Default
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__1"
    // InternalBasicsParser.g:3437:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3441:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalBasicsParser.g:3442:2: rule__ParameterIntegerType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__1"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__1__Impl"
    // InternalBasicsParser.g:3448:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3452:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3453:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3453:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3454:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1());
            // InternalBasicsParser.g:3455:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3455:3: rule__ParameterIntegerType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__0"
    // InternalBasicsParser.g:3464:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3468:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalBasicsParser.g:3469:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ParameterStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0"


    // $ANTLR start "rule__ParameterStringType__Group__0__Impl"
    // InternalBasicsParser.g:3476:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3480:1: ( ( () ) )
            // InternalBasicsParser.g:3481:1: ( () )
            {
            // InternalBasicsParser.g:3481:1: ( () )
            // InternalBasicsParser.g:3482:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0());
            // InternalBasicsParser.g:3483:2: ()
            // InternalBasicsParser.g:3483:3:
            {
            }

             after(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__1"
    // InternalBasicsParser.g:3491:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3495:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalBasicsParser.g:3496:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterStringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1"


    // $ANTLR start "rule__ParameterStringType__Group__1__Impl"
    // InternalBasicsParser.g:3503:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3507:1: ( ( String ) )
            // InternalBasicsParser.g:3508:1: ( String )
            {
            // InternalBasicsParser.g:3508:1: ( String )
            // InternalBasicsParser.g:3509:2: String
            {
             before(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            match(input,String,FOLLOW_2);
             after(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__2"
    // InternalBasicsParser.g:3518:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3522:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalBasicsParser.g:3523:2: rule__ParameterStringType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__2"


    // $ANTLR start "rule__ParameterStringType__Group__2__Impl"
    // InternalBasicsParser.g:3529:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3533:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3534:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3534:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalBasicsParser.g:3535:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2());
            // InternalBasicsParser.g:3536:2: ( rule__ParameterStringType__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Default) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=RULE_ID && LA16_1<=RULE_STRING)) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalBasicsParser.g:3536:3: rule__ParameterStringType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStringType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__2__Impl"


    // $ANTLR start "rule__ParameterStringType__Group_2__0"
    // InternalBasicsParser.g:3545:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3549:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalBasicsParser.g:3550:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__ParameterStringType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__0"


    // $ANTLR start "rule__ParameterStringType__Group_2__0__Impl"
    // InternalBasicsParser.g:3557:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3561:1: ( ( Default ) )
            // InternalBasicsParser.g:3562:1: ( Default )
            {
            // InternalBasicsParser.g:3562:1: ( Default )
            // InternalBasicsParser.g:3563:2: Default
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group_2__1"
    // InternalBasicsParser.g:3572:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3576:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalBasicsParser.g:3577:2: rule__ParameterStringType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__1"


    // $ANTLR start "rule__ParameterStringType__Group_2__1__Impl"
    // InternalBasicsParser.g:3583:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3587:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3588:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3588:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3589:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1());
            // InternalBasicsParser.g:3590:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3590:3: rule__ParameterStringType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__0"
    // InternalBasicsParser.g:3599:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3603:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalBasicsParser.g:3604:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ParameterDoubleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__0"


    // $ANTLR start "rule__ParameterDoubleType__Group__0__Impl"
    // InternalBasicsParser.g:3611:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3615:1: ( ( () ) )
            // InternalBasicsParser.g:3616:1: ( () )
            {
            // InternalBasicsParser.g:3616:1: ( () )
            // InternalBasicsParser.g:3617:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0());
            // InternalBasicsParser.g:3618:2: ()
            // InternalBasicsParser.g:3618:3:
            {
            }

             after(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__0__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__1"
    // InternalBasicsParser.g:3626:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3630:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalBasicsParser.g:3631:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterDoubleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__1"


    // $ANTLR start "rule__ParameterDoubleType__Group__1__Impl"
    // InternalBasicsParser.g:3638:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3642:1: ( ( Double ) )
            // InternalBasicsParser.g:3643:1: ( Double )
            {
            // InternalBasicsParser.g:3643:1: ( Double )
            // InternalBasicsParser.g:3644:2: Double
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            match(input,Double,FOLLOW_2);
             after(grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__1__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__2"
    // InternalBasicsParser.g:3653:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3657:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalBasicsParser.g:3658:2: rule__ParameterDoubleType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__2"


    // $ANTLR start "rule__ParameterDoubleType__Group__2__Impl"
    // InternalBasicsParser.g:3664:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3668:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3669:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3669:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalBasicsParser.g:3670:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2());
            // InternalBasicsParser.g:3671:2: ( rule__ParameterDoubleType__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Default) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_DOUBLE) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalBasicsParser.g:3671:3: rule__ParameterDoubleType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDoubleType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDoubleTypeAccess().getGroup_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__2__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__0"
    // InternalBasicsParser.g:3680:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3684:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalBasicsParser.g:3685:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__ParameterDoubleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__0"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__0__Impl"
    // InternalBasicsParser.g:3692:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3696:1: ( ( Default ) )
            // InternalBasicsParser.g:3697:1: ( Default )
            {
            // InternalBasicsParser.g:3697:1: ( Default )
            // InternalBasicsParser.g:3698:2: Default
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__1"
    // InternalBasicsParser.g:3707:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3711:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalBasicsParser.g:3712:2: rule__ParameterDoubleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__1"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__1__Impl"
    // InternalBasicsParser.g:3718:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3722:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3723:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3723:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3724:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1());
            // InternalBasicsParser.g:3725:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3725:3: rule__ParameterDoubleType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__0"
    // InternalBasicsParser.g:3734:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3738:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalBasicsParser.g:3739:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ParameterBooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__0"


    // $ANTLR start "rule__ParameterBooleanType__Group__0__Impl"
    // InternalBasicsParser.g:3746:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3750:1: ( ( () ) )
            // InternalBasicsParser.g:3751:1: ( () )
            {
            // InternalBasicsParser.g:3751:1: ( () )
            // InternalBasicsParser.g:3752:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0());
            // InternalBasicsParser.g:3753:2: ()
            // InternalBasicsParser.g:3753:3:
            {
            }

             after(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__0__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__1"
    // InternalBasicsParser.g:3761:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3765:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalBasicsParser.g:3766:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterBooleanType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__1"


    // $ANTLR start "rule__ParameterBooleanType__Group__1__Impl"
    // InternalBasicsParser.g:3773:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3777:1: ( ( Boolean ) )
            // InternalBasicsParser.g:3778:1: ( Boolean )
            {
            // InternalBasicsParser.g:3778:1: ( Boolean )
            // InternalBasicsParser.g:3779:2: Boolean
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            match(input,Boolean,FOLLOW_2);
             after(grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__1__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__2"
    // InternalBasicsParser.g:3788:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3792:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalBasicsParser.g:3793:2: rule__ParameterBooleanType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__2"


    // $ANTLR start "rule__ParameterBooleanType__Group__2__Impl"
    // InternalBasicsParser.g:3799:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3803:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3804:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3804:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalBasicsParser.g:3805:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2());
            // InternalBasicsParser.g:3806:2: ( rule__ParameterBooleanType__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Default) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_BOOLEAN) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalBasicsParser.g:3806:3: rule__ParameterBooleanType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterBooleanType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterBooleanTypeAccess().getGroup_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__2__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__0"
    // InternalBasicsParser.g:3815:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3819:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalBasicsParser.g:3820:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterBooleanType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__0"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__0__Impl"
    // InternalBasicsParser.g:3827:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3831:1: ( ( Default ) )
            // InternalBasicsParser.g:3832:1: ( Default )
            {
            // InternalBasicsParser.g:3832:1: ( Default )
            // InternalBasicsParser.g:3833:2: Default
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__1"
    // InternalBasicsParser.g:3842:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3846:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalBasicsParser.g:3847:2: rule__ParameterBooleanType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__1"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__1__Impl"
    // InternalBasicsParser.g:3853:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3857:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3858:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3858:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3859:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1());
            // InternalBasicsParser.g:3860:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3860:3: rule__ParameterBooleanType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__0"
    // InternalBasicsParser.g:3869:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3873:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalBasicsParser.g:3874:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ParameterBase64Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__0"


    // $ANTLR start "rule__ParameterBase64Type__Group__0__Impl"
    // InternalBasicsParser.g:3881:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3885:1: ( ( () ) )
            // InternalBasicsParser.g:3886:1: ( () )
            {
            // InternalBasicsParser.g:3886:1: ( () )
            // InternalBasicsParser.g:3887:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0());
            // InternalBasicsParser.g:3888:2: ()
            // InternalBasicsParser.g:3888:3:
            {
            }

             after(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__0__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__1"
    // InternalBasicsParser.g:3896:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3900:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalBasicsParser.g:3901:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterBase64Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__1"


    // $ANTLR start "rule__ParameterBase64Type__Group__1__Impl"
    // InternalBasicsParser.g:3908:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3912:1: ( ( Base64 ) )
            // InternalBasicsParser.g:3913:1: ( Base64 )
            {
            // InternalBasicsParser.g:3913:1: ( Base64 )
            // InternalBasicsParser.g:3914:2: Base64
            {
             before(grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            match(input,Base64,FOLLOW_2);
             after(grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__1__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__2"
    // InternalBasicsParser.g:3923:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3927:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalBasicsParser.g:3928:2: rule__ParameterBase64Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__2"


    // $ANTLR start "rule__ParameterBase64Type__Group__2__Impl"
    // InternalBasicsParser.g:3934:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3938:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalBasicsParser.g:3939:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3939:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalBasicsParser.g:3940:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2());
            // InternalBasicsParser.g:3941:2: ( rule__ParameterBase64Type__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Default) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_BINARY) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalBasicsParser.g:3941:3: rule__ParameterBase64Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterBase64Type__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterBase64TypeAccess().getGroup_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__2__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__0"
    // InternalBasicsParser.g:3950:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3954:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalBasicsParser.g:3955:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ParameterBase64Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__0"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__0__Impl"
    // InternalBasicsParser.g:3962:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3966:1: ( ( Default ) )
            // InternalBasicsParser.g:3967:1: ( Default )
            {
            // InternalBasicsParser.g:3967:1: ( Default )
            // InternalBasicsParser.g:3968:2: Default
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__1"
    // InternalBasicsParser.g:3977:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3981:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalBasicsParser.g:3982:2: rule__ParameterBase64Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__1"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__1__Impl"
    // InternalBasicsParser.g:3988:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:3992:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3993:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3993:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3994:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1());
            // InternalBasicsParser.g:3995:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3995:3: rule__ParameterBase64Type__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__0"
    // InternalBasicsParser.g:4004:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4008:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalBasicsParser.g:4009:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__0"


    // $ANTLR start "rule__ParameterArrayType__Group__0__Impl"
    // InternalBasicsParser.g:4016:1: rule__ParameterArrayType__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4020:1: ( ( RULE_BEGIN ) )
            // InternalBasicsParser.g:4021:1: ( RULE_BEGIN )
            {
            // InternalBasicsParser.g:4021:1: ( RULE_BEGIN )
            // InternalBasicsParser.g:4022:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__1"
    // InternalBasicsParser.g:4031:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4035:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalBasicsParser.g:4036:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ParameterArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__1"


    // $ANTLR start "rule__ParameterArrayType__Group__1__Impl"
    // InternalBasicsParser.g:4043:1: rule__ParameterArrayType__Group__1__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4047:1: ( ( Array ) )
            // InternalBasicsParser.g:4048:1: ( Array )
            {
            // InternalBasicsParser.g:4048:1: ( Array )
            // InternalBasicsParser.g:4049:2: Array
            {
             before(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());
            match(input,Array,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__1__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__2"
    // InternalBasicsParser.g:4058:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4062:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalBasicsParser.g:4063:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ParameterArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__2"


    // $ANTLR start "rule__ParameterArrayType__Group__2__Impl"
    // InternalBasicsParser.g:4070:1: rule__ParameterArrayType__Group__2__Impl : ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4074:1: ( ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) )
            // InternalBasicsParser.g:4075:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            {
            // InternalBasicsParser.g:4075:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            // InternalBasicsParser.g:4076:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2());
            // InternalBasicsParser.g:4077:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            // InternalBasicsParser.g:4077:3: rule__ParameterArrayType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__2__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__3"
    // InternalBasicsParser.g:4085:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4089:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalBasicsParser.g:4090:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ParameterArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__3"


    // $ANTLR start "rule__ParameterArrayType__Group__3__Impl"
    // InternalBasicsParser.g:4097:1: rule__ParameterArrayType__Group__3__Impl : ( ( rule__ParameterArrayType__Group_3__0 )? ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4101:1: ( ( ( rule__ParameterArrayType__Group_3__0 )? ) )
            // InternalBasicsParser.g:4102:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            {
            // InternalBasicsParser.g:4102:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            // InternalBasicsParser.g:4103:2: ( rule__ParameterArrayType__Group_3__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_3());
            // InternalBasicsParser.g:4104:2: ( rule__ParameterArrayType__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Default) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBasicsParser.g:4104:3: rule__ParameterArrayType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterArrayType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__3__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__4"
    // InternalBasicsParser.g:4112:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4116:1: ( rule__ParameterArrayType__Group__4__Impl )
            // InternalBasicsParser.g:4117:2: rule__ParameterArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__4"


    // $ANTLR start "rule__ParameterArrayType__Group__4__Impl"
    // InternalBasicsParser.g:4123:1: rule__ParameterArrayType__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4127:1: ( ( RULE_END ) )
            // InternalBasicsParser.g:4128:1: ( RULE_END )
            {
            // InternalBasicsParser.g:4128:1: ( RULE_END )
            // InternalBasicsParser.g:4129:2: RULE_END
            {
             before(grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_4());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__4__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_3__0"
    // InternalBasicsParser.g:4139:1: rule__ParameterArrayType__Group_3__0 : rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 ;
    public final void rule__ParameterArrayType__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4143:1: ( rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 )
            // InternalBasicsParser.g:4144:2: rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterArrayType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__0"


    // $ANTLR start "rule__ParameterArrayType__Group_3__0__Impl"
    // InternalBasicsParser.g:4151:1: rule__ParameterArrayType__Group_3__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4155:1: ( ( Default ) )
            // InternalBasicsParser.g:4156:1: ( Default )
            {
            // InternalBasicsParser.g:4156:1: ( Default )
            // InternalBasicsParser.g:4157:2: Default
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_3__1"
    // InternalBasicsParser.g:4166:1: rule__ParameterArrayType__Group_3__1 : rule__ParameterArrayType__Group_3__1__Impl ;
    public final void rule__ParameterArrayType__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4170:1: ( rule__ParameterArrayType__Group_3__1__Impl )
            // InternalBasicsParser.g:4171:2: rule__ParameterArrayType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__1"


    // $ANTLR start "rule__ParameterArrayType__Group_3__1__Impl"
    // InternalBasicsParser.g:4177:1: rule__ParameterArrayType__Group_3__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) ;
    public final void rule__ParameterArrayType__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4181:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) )
            // InternalBasicsParser.g:4182:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            {
            // InternalBasicsParser.g:4182:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            // InternalBasicsParser.g:4183:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_3_1());
            // InternalBasicsParser.g:4184:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            // InternalBasicsParser.g:4184:3: rule__ParameterArrayType__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalBasicsParser.g:4193:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4197:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalBasicsParser.g:4198:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // InternalBasicsParser.g:4205:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4209:1: ( ( () ) )
            // InternalBasicsParser.g:4210:1: ( () )
            {
            // InternalBasicsParser.g:4210:1: ( () )
            // InternalBasicsParser.g:4211:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0());
            // InternalBasicsParser.g:4212:2: ()
            // InternalBasicsParser.g:4212:3:
            {
            }

             after(grammarAccess.getParameterListAccess().getParameterSequenceAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // InternalBasicsParser.g:4220:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4224:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalBasicsParser.g:4225:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // InternalBasicsParser.g:4232:1: rule__ParameterList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4236:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:4237:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:4237:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:4238:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__2"
    // InternalBasicsParser.g:4247:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4251:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalBasicsParser.g:4252:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ParameterList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2"


    // $ANTLR start "rule__ParameterList__Group__2__Impl"
    // InternalBasicsParser.g:4259:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4263:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalBasicsParser.g:4264:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalBasicsParser.g:4264:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalBasicsParser.g:4265:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2());
            // InternalBasicsParser.g:4266:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalBasicsParser.g:4266:3: rule__ParameterList__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2__Impl"


    // $ANTLR start "rule__ParameterList__Group__3"
    // InternalBasicsParser.g:4274:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4278:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalBasicsParser.g:4279:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ParameterList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3"


    // $ANTLR start "rule__ParameterList__Group__3__Impl"
    // InternalBasicsParser.g:4286:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4290:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalBasicsParser.g:4291:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalBasicsParser.g:4291:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalBasicsParser.g:4292:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3());
            // InternalBasicsParser.g:4293:2: ( rule__ParameterList__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
                case 1 :
                    // InternalBasicsParser.g:4293:3: rule__ParameterList__Group_3__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__ParameterList__Group_3__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop21;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3__Impl"


    // $ANTLR start "rule__ParameterList__Group__4"
    // InternalBasicsParser.g:4301:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4305:1: ( rule__ParameterList__Group__4__Impl )
            // InternalBasicsParser.g:4306:2: rule__ParameterList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4"


    // $ANTLR start "rule__ParameterList__Group__4__Impl"
    // InternalBasicsParser.g:4312:1: rule__ParameterList__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4316:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:4317:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:4317:1: ( RightSquareBracket )
            // InternalBasicsParser.g:4318:2: RightSquareBracket
            {
             before(grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__0"
    // InternalBasicsParser.g:4328:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4332:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalBasicsParser.g:4333:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__ParameterList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0"


    // $ANTLR start "rule__ParameterList__Group_3__0__Impl"
    // InternalBasicsParser.g:4340:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4344:1: ( ( Comma ) )
            // InternalBasicsParser.g:4345:1: ( Comma )
            {
            // InternalBasicsParser.g:4345:1: ( Comma )
            // InternalBasicsParser.g:4346:2: Comma
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getParameterListAccess().getCommaKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__1"
    // InternalBasicsParser.g:4355:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4359:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalBasicsParser.g:4360:2: rule__ParameterList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1"


    // $ANTLR start "rule__ParameterList__Group_3__1__Impl"
    // InternalBasicsParser.g:4366:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4370:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalBasicsParser.g:4371:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalBasicsParser.g:4371:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalBasicsParser.g:4372:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1());
            // InternalBasicsParser.g:4373:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalBasicsParser.g:4373:3: rule__ParameterList__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterAny__Group__0"
    // InternalBasicsParser.g:4382:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4386:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalBasicsParser.g:4387:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ParameterAny__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__0"


    // $ANTLR start "rule__ParameterAny__Group__0__Impl"
    // InternalBasicsParser.g:4394:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4398:1: ( ( () ) )
            // InternalBasicsParser.g:4399:1: ( () )
            {
            // InternalBasicsParser.g:4399:1: ( () )
            // InternalBasicsParser.g:4400:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0());
            // InternalBasicsParser.g:4401:2: ()
            // InternalBasicsParser.g:4401:3:
            {
            }

             after(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group__1"
    // InternalBasicsParser.g:4409:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4413:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalBasicsParser.g:4414:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ParameterAny__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__1"


    // $ANTLR start "rule__ParameterAny__Group__1__Impl"
    // InternalBasicsParser.g:4421:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4425:1: ( ( ParameterAny ) )
            // InternalBasicsParser.g:4426:1: ( ParameterAny )
            {
            // InternalBasicsParser.g:4426:1: ( ParameterAny )
            // InternalBasicsParser.g:4427:2: ParameterAny
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            match(input,ParameterAny,FOLLOW_2);
             after(grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__1__Impl"


    // $ANTLR start "rule__ParameterAny__Group__2"
    // InternalBasicsParser.g:4436:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4440:1: ( rule__ParameterAny__Group__2__Impl )
            // InternalBasicsParser.g:4441:2: rule__ParameterAny__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__2"


    // $ANTLR start "rule__ParameterAny__Group__2__Impl"
    // InternalBasicsParser.g:4447:1: rule__ParameterAny__Group__2__Impl : ( ( rule__ParameterAny__Group_2__0 )? ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4451:1: ( ( ( rule__ParameterAny__Group_2__0 )? ) )
            // InternalBasicsParser.g:4452:1: ( ( rule__ParameterAny__Group_2__0 )? )
            {
            // InternalBasicsParser.g:4452:1: ( ( rule__ParameterAny__Group_2__0 )? )
            // InternalBasicsParser.g:4453:2: ( rule__ParameterAny__Group_2__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_2());
            // InternalBasicsParser.g:4454:2: ( rule__ParameterAny__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBasicsParser.g:4454:3: rule__ParameterAny__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterAny__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAnyAccess().getGroup_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__2__Impl"


    // $ANTLR start "rule__ParameterAny__Group_2__0"
    // InternalBasicsParser.g:4463:1: rule__ParameterAny__Group_2__0 : rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 ;
    public final void rule__ParameterAny__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4467:1: ( rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 )
            // InternalBasicsParser.g:4468:2: rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__ParameterAny__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__0"


    // $ANTLR start "rule__ParameterAny__Group_2__0__Impl"
    // InternalBasicsParser.g:4475:1: rule__ParameterAny__Group_2__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4479:1: ( ( Value ) )
            // InternalBasicsParser.g:4480:1: ( Value )
            {
            // InternalBasicsParser.g:4480:1: ( Value )
            // InternalBasicsParser.g:4481:2: Value
            {
             before(grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group_2__1"
    // InternalBasicsParser.g:4490:1: rule__ParameterAny__Group_2__1 : rule__ParameterAny__Group_2__1__Impl ;
    public final void rule__ParameterAny__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4494:1: ( rule__ParameterAny__Group_2__1__Impl )
            // InternalBasicsParser.g:4495:2: rule__ParameterAny__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__1"


    // $ANTLR start "rule__ParameterAny__Group_2__1__Impl"
    // InternalBasicsParser.g:4501:1: rule__ParameterAny__Group_2__1__Impl : ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterAny__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4505:1: ( ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) )
            // InternalBasicsParser.g:4506:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:4506:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            // InternalBasicsParser.g:4507:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1());
            // InternalBasicsParser.g:4508:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            // InternalBasicsParser.g:4508:3: rule__ParameterAny__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__0"
    // InternalBasicsParser.g:4517:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4521:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalBasicsParser.g:4522:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ParameterStruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0"


    // $ANTLR start "rule__ParameterStruct__Group__0__Impl"
    // InternalBasicsParser.g:4529:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4533:1: ( ( () ) )
            // InternalBasicsParser.g:4534:1: ( () )
            {
            // InternalBasicsParser.g:4534:1: ( () )
            // InternalBasicsParser.g:4535:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0());
            // InternalBasicsParser.g:4536:2: ()
            // InternalBasicsParser.g:4536:3:
            {
            }

             after(grammarAccess.getParameterStructAccess().getParameterStructAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__1"
    // InternalBasicsParser.g:4544:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4548:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalBasicsParser.g:4549:2: rule__ParameterStruct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1"


    // $ANTLR start "rule__ParameterStruct__Group__1__Impl"
    // InternalBasicsParser.g:4555:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4559:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalBasicsParser.g:4560:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalBasicsParser.g:4560:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalBasicsParser.g:4561:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1());
            // InternalBasicsParser.g:4562:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBasicsParser.g:4562:3: rule__ParameterStruct__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStruct__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStructAccess().getGroup_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__0"
    // InternalBasicsParser.g:4571:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4575:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalBasicsParser.g:4576:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ParameterStruct__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0"


    // $ANTLR start "rule__ParameterStruct__Group_1__0__Impl"
    // InternalBasicsParser.g:4583:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4587:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:4588:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:4588:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:4589:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__1"
    // InternalBasicsParser.g:4598:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4602:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalBasicsParser.g:4603:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ParameterStruct__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1"


    // $ANTLR start "rule__ParameterStruct__Group_1__1__Impl"
    // InternalBasicsParser.g:4610:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4614:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalBasicsParser.g:4615:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalBasicsParser.g:4615:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalBasicsParser.g:4616:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1());
            // InternalBasicsParser.g:4617:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalBasicsParser.g:4617:3: rule__ParameterStruct__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__2"
    // InternalBasicsParser.g:4625:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4629:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalBasicsParser.g:4630:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__ParameterStruct__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2"


    // $ANTLR start "rule__ParameterStruct__Group_1__2__Impl"
    // InternalBasicsParser.g:4637:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4641:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalBasicsParser.g:4642:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalBasicsParser.g:4642:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalBasicsParser.g:4643:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2());
            // InternalBasicsParser.g:4644:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
                case 1 :
                    // InternalBasicsParser.g:4644:3: rule__ParameterStruct__Group_1_2__0
                    {
                    pushFollow(FOLLOW_7);
                    rule__ParameterStruct__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop24;
                }
            } while (true);

             after(grammarAccess.getParameterStructAccess().getGroup_1_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__3"
    // InternalBasicsParser.g:4652:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4656:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalBasicsParser.g:4657:2: rule__ParameterStruct__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3"


    // $ANTLR start "rule__ParameterStruct__Group_1__3__Impl"
    // InternalBasicsParser.g:4663:1: rule__ParameterStruct__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4667:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:4668:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:4668:1: ( RightSquareBracket )
            // InternalBasicsParser.g:4669:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__0"
    // InternalBasicsParser.g:4679:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4683:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalBasicsParser.g:4684:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterStruct__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__0"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__0__Impl"
    // InternalBasicsParser.g:4691:1: rule__ParameterStruct__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4695:1: ( ( Comma ) )
            // InternalBasicsParser.g:4696:1: ( Comma )
            {
            // InternalBasicsParser.g:4696:1: ( Comma )
            // InternalBasicsParser.g:4697:2: Comma
            {
             before(grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__1"
    // InternalBasicsParser.g:4706:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4710:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalBasicsParser.g:4711:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
            {
            pushFollow(FOLLOW_13);
            rule__ParameterStruct__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__1"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__1__Impl"
    // InternalBasicsParser.g:4718:1: rule__ParameterStruct__Group_1_2__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4722:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:4723:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:4723:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:4724:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__2"
    // InternalBasicsParser.g:4733:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4737:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalBasicsParser.g:4738:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
            {
            pushFollow(FOLLOW_29);
            rule__ParameterStruct__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__2"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__2__Impl"
    // InternalBasicsParser.g:4745:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4749:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalBasicsParser.g:4750:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalBasicsParser.g:4750:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalBasicsParser.g:4751:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2());
            // InternalBasicsParser.g:4752:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalBasicsParser.g:4752:3: rule__ParameterStruct__ValueAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__ValueAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__3"
    // InternalBasicsParser.g:4760:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4764:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalBasicsParser.g:4765:2: rule__ParameterStruct__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__3"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__3__Impl"
    // InternalBasicsParser.g:4771:1: rule__ParameterStruct__Group_1_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4775:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:4776:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:4776:1: ( RightSquareBracket )
            // InternalBasicsParser.g:4777:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__3__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__0"
    // InternalBasicsParser.g:4787:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4791:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalBasicsParser.g:4792:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ParameterStructMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0"


    // $ANTLR start "rule__ParameterStructMember__Group__0__Impl"
    // InternalBasicsParser.g:4799:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4803:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalBasicsParser.g:4804:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalBasicsParser.g:4804:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalBasicsParser.g:4805:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0());
            // InternalBasicsParser.g:4806:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalBasicsParser.g:4806:3: rule__ParameterStructMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__1"
    // InternalBasicsParser.g:4814:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4818:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalBasicsParser.g:4819:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ParameterStructMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1"


    // $ANTLR start "rule__ParameterStructMember__Group__1__Impl"
    // InternalBasicsParser.g:4826:1: rule__ParameterStructMember__Group__1__Impl : ( Colon ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4830:1: ( ( Colon ) )
            // InternalBasicsParser.g:4831:1: ( Colon )
            {
            // InternalBasicsParser.g:4831:1: ( Colon )
            // InternalBasicsParser.g:4832:2: Colon
            {
             before(grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__2"
    // InternalBasicsParser.g:4841:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4845:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalBasicsParser.g:4846:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ParameterStructMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2"


    // $ANTLR start "rule__ParameterStructMember__Group__2__Impl"
    // InternalBasicsParser.g:4853:1: rule__ParameterStructMember__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4857:1: ( ( RULE_BEGIN ) )
            // InternalBasicsParser.g:4858:1: ( RULE_BEGIN )
            {
            // InternalBasicsParser.g:4858:1: ( RULE_BEGIN )
            // InternalBasicsParser.g:4859:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__3"
    // InternalBasicsParser.g:4868:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4872:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalBasicsParser.g:4873:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ParameterStructMember__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__3"


    // $ANTLR start "rule__ParameterStructMember__Group__3__Impl"
    // InternalBasicsParser.g:4880:1: rule__ParameterStructMember__Group__3__Impl : ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4884:1: ( ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) )
            // InternalBasicsParser.g:4885:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            {
            // InternalBasicsParser.g:4885:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            // InternalBasicsParser.g:4886:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3());
            // InternalBasicsParser.g:4887:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            // InternalBasicsParser.g:4887:3: rule__ParameterStructMember__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__3__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__4"
    // InternalBasicsParser.g:4895:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4899:1: ( rule__ParameterStructMember__Group__4__Impl )
            // InternalBasicsParser.g:4900:2: rule__ParameterStructMember__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__4"


    // $ANTLR start "rule__ParameterStructMember__Group__4__Impl"
    // InternalBasicsParser.g:4906:1: rule__ParameterStructMember__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4910:1: ( ( RULE_END ) )
            // InternalBasicsParser.g:4911:1: ( RULE_END )
            {
            // InternalBasicsParser.g:4911:1: ( RULE_END )
            // InternalBasicsParser.g:4912:2: RULE_END
            {
             before(grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_4());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__4__Impl"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0"
    // InternalBasicsParser.g:4922:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4926:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalBasicsParser.g:4927:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ParameterStructTypeMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__0"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0__Impl"
    // InternalBasicsParser.g:4934:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4938:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalBasicsParser.g:4939:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalBasicsParser.g:4939:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalBasicsParser.g:4940:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0());
            // InternalBasicsParser.g:4941:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalBasicsParser.g:4941:3: rule__ParameterStructTypeMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__1"
    // InternalBasicsParser.g:4949:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4953:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalBasicsParser.g:4954:2: rule__ParameterStructTypeMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__1"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__1__Impl"
    // InternalBasicsParser.g:4960:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4964:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalBasicsParser.g:4965:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalBasicsParser.g:4965:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalBasicsParser.g:4966:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1());
            // InternalBasicsParser.g:4967:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalBasicsParser.g:4967:3: rule__ParameterStructTypeMember__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__1__Impl"


    // $ANTLR start "rule__Bool__Group__0"
    // InternalBasicsParser.g:4976:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4980:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalBasicsParser.g:4981:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Bool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0"


    // $ANTLR start "rule__Bool__Group__0__Impl"
    // InternalBasicsParser.g:4988:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:4992:1: ( ( () ) )
            // InternalBasicsParser.g:4993:1: ( () )
            {
            // InternalBasicsParser.g:4993:1: ( () )
            // InternalBasicsParser.g:4994:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0());
            // InternalBasicsParser.g:4995:2: ()
            // InternalBasicsParser.g:4995:3:
            {
            }

             after(grammarAccess.getBoolAccess().getBoolAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0__Impl"


    // $ANTLR start "rule__Bool__Group__1"
    // InternalBasicsParser.g:5003:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5007:1: ( rule__Bool__Group__1__Impl )
            // InternalBasicsParser.g:5008:2: rule__Bool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1"


    // $ANTLR start "rule__Bool__Group__1__Impl"
    // InternalBasicsParser.g:5014:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5018:1: ( ( Bool ) )
            // InternalBasicsParser.g:5019:1: ( Bool )
            {
            // InternalBasicsParser.g:5019:1: ( Bool )
            // InternalBasicsParser.g:5020:2: Bool
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword_1());
            match(input,Bool,FOLLOW_2);
             after(grammarAccess.getBoolAccess().getBoolKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1__Impl"


    // $ANTLR start "rule__Int8__Group__0"
    // InternalBasicsParser.g:5030:1: rule__Int8__Group__0 : rule__Int8__Group__0__Impl rule__Int8__Group__1 ;
    public final void rule__Int8__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5034:1: ( rule__Int8__Group__0__Impl rule__Int8__Group__1 )
            // InternalBasicsParser.g:5035:2: rule__Int8__Group__0__Impl rule__Int8__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Int8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__0"


    // $ANTLR start "rule__Int8__Group__0__Impl"
    // InternalBasicsParser.g:5042:1: rule__Int8__Group__0__Impl : ( () ) ;
    public final void rule__Int8__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5046:1: ( ( () ) )
            // InternalBasicsParser.g:5047:1: ( () )
            {
            // InternalBasicsParser.g:5047:1: ( () )
            // InternalBasicsParser.g:5048:2: ()
            {
             before(grammarAccess.getInt8Access().getInt8Action_0());
            // InternalBasicsParser.g:5049:2: ()
            // InternalBasicsParser.g:5049:3:
            {
            }

             after(grammarAccess.getInt8Access().getInt8Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__0__Impl"


    // $ANTLR start "rule__Int8__Group__1"
    // InternalBasicsParser.g:5057:1: rule__Int8__Group__1 : rule__Int8__Group__1__Impl ;
    public final void rule__Int8__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5061:1: ( rule__Int8__Group__1__Impl )
            // InternalBasicsParser.g:5062:2: rule__Int8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__1"


    // $ANTLR start "rule__Int8__Group__1__Impl"
    // InternalBasicsParser.g:5068:1: rule__Int8__Group__1__Impl : ( Int8 ) ;
    public final void rule__Int8__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5072:1: ( ( Int8 ) )
            // InternalBasicsParser.g:5073:1: ( Int8 )
            {
            // InternalBasicsParser.g:5073:1: ( Int8 )
            // InternalBasicsParser.g:5074:2: Int8
            {
             before(grammarAccess.getInt8Access().getInt8Keyword_1());
            match(input,Int8,FOLLOW_2);
             after(grammarAccess.getInt8Access().getInt8Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__1__Impl"


    // $ANTLR start "rule__Uint8__Group__0"
    // InternalBasicsParser.g:5084:1: rule__Uint8__Group__0 : rule__Uint8__Group__0__Impl rule__Uint8__Group__1 ;
    public final void rule__Uint8__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5088:1: ( rule__Uint8__Group__0__Impl rule__Uint8__Group__1 )
            // InternalBasicsParser.g:5089:2: rule__Uint8__Group__0__Impl rule__Uint8__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Uint8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__0"


    // $ANTLR start "rule__Uint8__Group__0__Impl"
    // InternalBasicsParser.g:5096:1: rule__Uint8__Group__0__Impl : ( () ) ;
    public final void rule__Uint8__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5100:1: ( ( () ) )
            // InternalBasicsParser.g:5101:1: ( () )
            {
            // InternalBasicsParser.g:5101:1: ( () )
            // InternalBasicsParser.g:5102:2: ()
            {
             before(grammarAccess.getUint8Access().getUint8Action_0());
            // InternalBasicsParser.g:5103:2: ()
            // InternalBasicsParser.g:5103:3:
            {
            }

             after(grammarAccess.getUint8Access().getUint8Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__0__Impl"


    // $ANTLR start "rule__Uint8__Group__1"
    // InternalBasicsParser.g:5111:1: rule__Uint8__Group__1 : rule__Uint8__Group__1__Impl ;
    public final void rule__Uint8__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5115:1: ( rule__Uint8__Group__1__Impl )
            // InternalBasicsParser.g:5116:2: rule__Uint8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__1"


    // $ANTLR start "rule__Uint8__Group__1__Impl"
    // InternalBasicsParser.g:5122:1: rule__Uint8__Group__1__Impl : ( Uint8 ) ;
    public final void rule__Uint8__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5126:1: ( ( Uint8 ) )
            // InternalBasicsParser.g:5127:1: ( Uint8 )
            {
            // InternalBasicsParser.g:5127:1: ( Uint8 )
            // InternalBasicsParser.g:5128:2: Uint8
            {
             before(grammarAccess.getUint8Access().getUint8Keyword_1());
            match(input,Uint8,FOLLOW_2);
             after(grammarAccess.getUint8Access().getUint8Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__1__Impl"


    // $ANTLR start "rule__Int16__Group__0"
    // InternalBasicsParser.g:5138:1: rule__Int16__Group__0 : rule__Int16__Group__0__Impl rule__Int16__Group__1 ;
    public final void rule__Int16__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5142:1: ( rule__Int16__Group__0__Impl rule__Int16__Group__1 )
            // InternalBasicsParser.g:5143:2: rule__Int16__Group__0__Impl rule__Int16__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Int16__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int16__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__0"


    // $ANTLR start "rule__Int16__Group__0__Impl"
    // InternalBasicsParser.g:5150:1: rule__Int16__Group__0__Impl : ( () ) ;
    public final void rule__Int16__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5154:1: ( ( () ) )
            // InternalBasicsParser.g:5155:1: ( () )
            {
            // InternalBasicsParser.g:5155:1: ( () )
            // InternalBasicsParser.g:5156:2: ()
            {
             before(grammarAccess.getInt16Access().getInt16Action_0());
            // InternalBasicsParser.g:5157:2: ()
            // InternalBasicsParser.g:5157:3:
            {
            }

             after(grammarAccess.getInt16Access().getInt16Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__0__Impl"


    // $ANTLR start "rule__Int16__Group__1"
    // InternalBasicsParser.g:5165:1: rule__Int16__Group__1 : rule__Int16__Group__1__Impl ;
    public final void rule__Int16__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5169:1: ( rule__Int16__Group__1__Impl )
            // InternalBasicsParser.g:5170:2: rule__Int16__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int16__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__1"


    // $ANTLR start "rule__Int16__Group__1__Impl"
    // InternalBasicsParser.g:5176:1: rule__Int16__Group__1__Impl : ( Int16 ) ;
    public final void rule__Int16__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5180:1: ( ( Int16 ) )
            // InternalBasicsParser.g:5181:1: ( Int16 )
            {
            // InternalBasicsParser.g:5181:1: ( Int16 )
            // InternalBasicsParser.g:5182:2: Int16
            {
             before(grammarAccess.getInt16Access().getInt16Keyword_1());
            match(input,Int16,FOLLOW_2);
             after(grammarAccess.getInt16Access().getInt16Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__1__Impl"


    // $ANTLR start "rule__Uint16__Group__0"
    // InternalBasicsParser.g:5192:1: rule__Uint16__Group__0 : rule__Uint16__Group__0__Impl rule__Uint16__Group__1 ;
    public final void rule__Uint16__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5196:1: ( rule__Uint16__Group__0__Impl rule__Uint16__Group__1 )
            // InternalBasicsParser.g:5197:2: rule__Uint16__Group__0__Impl rule__Uint16__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Uint16__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint16__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__0"


    // $ANTLR start "rule__Uint16__Group__0__Impl"
    // InternalBasicsParser.g:5204:1: rule__Uint16__Group__0__Impl : ( () ) ;
    public final void rule__Uint16__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5208:1: ( ( () ) )
            // InternalBasicsParser.g:5209:1: ( () )
            {
            // InternalBasicsParser.g:5209:1: ( () )
            // InternalBasicsParser.g:5210:2: ()
            {
             before(grammarAccess.getUint16Access().getUint16Action_0());
            // InternalBasicsParser.g:5211:2: ()
            // InternalBasicsParser.g:5211:3:
            {
            }

             after(grammarAccess.getUint16Access().getUint16Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__0__Impl"


    // $ANTLR start "rule__Uint16__Group__1"
    // InternalBasicsParser.g:5219:1: rule__Uint16__Group__1 : rule__Uint16__Group__1__Impl ;
    public final void rule__Uint16__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5223:1: ( rule__Uint16__Group__1__Impl )
            // InternalBasicsParser.g:5224:2: rule__Uint16__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint16__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__1"


    // $ANTLR start "rule__Uint16__Group__1__Impl"
    // InternalBasicsParser.g:5230:1: rule__Uint16__Group__1__Impl : ( Uint16 ) ;
    public final void rule__Uint16__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5234:1: ( ( Uint16 ) )
            // InternalBasicsParser.g:5235:1: ( Uint16 )
            {
            // InternalBasicsParser.g:5235:1: ( Uint16 )
            // InternalBasicsParser.g:5236:2: Uint16
            {
             before(grammarAccess.getUint16Access().getUint16Keyword_1());
            match(input,Uint16,FOLLOW_2);
             after(grammarAccess.getUint16Access().getUint16Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__1__Impl"


    // $ANTLR start "rule__Int32__Group__0"
    // InternalBasicsParser.g:5246:1: rule__Int32__Group__0 : rule__Int32__Group__0__Impl rule__Int32__Group__1 ;
    public final void rule__Int32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5250:1: ( rule__Int32__Group__0__Impl rule__Int32__Group__1 )
            // InternalBasicsParser.g:5251:2: rule__Int32__Group__0__Impl rule__Int32__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Int32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__0"


    // $ANTLR start "rule__Int32__Group__0__Impl"
    // InternalBasicsParser.g:5258:1: rule__Int32__Group__0__Impl : ( () ) ;
    public final void rule__Int32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5262:1: ( ( () ) )
            // InternalBasicsParser.g:5263:1: ( () )
            {
            // InternalBasicsParser.g:5263:1: ( () )
            // InternalBasicsParser.g:5264:2: ()
            {
             before(grammarAccess.getInt32Access().getInt32Action_0());
            // InternalBasicsParser.g:5265:2: ()
            // InternalBasicsParser.g:5265:3:
            {
            }

             after(grammarAccess.getInt32Access().getInt32Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__0__Impl"


    // $ANTLR start "rule__Int32__Group__1"
    // InternalBasicsParser.g:5273:1: rule__Int32__Group__1 : rule__Int32__Group__1__Impl ;
    public final void rule__Int32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5277:1: ( rule__Int32__Group__1__Impl )
            // InternalBasicsParser.g:5278:2: rule__Int32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__1"


    // $ANTLR start "rule__Int32__Group__1__Impl"
    // InternalBasicsParser.g:5284:1: rule__Int32__Group__1__Impl : ( Int32 ) ;
    public final void rule__Int32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5288:1: ( ( Int32 ) )
            // InternalBasicsParser.g:5289:1: ( Int32 )
            {
            // InternalBasicsParser.g:5289:1: ( Int32 )
            // InternalBasicsParser.g:5290:2: Int32
            {
             before(grammarAccess.getInt32Access().getInt32Keyword_1());
            match(input,Int32,FOLLOW_2);
             after(grammarAccess.getInt32Access().getInt32Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__1__Impl"


    // $ANTLR start "rule__Uint32__Group__0"
    // InternalBasicsParser.g:5300:1: rule__Uint32__Group__0 : rule__Uint32__Group__0__Impl rule__Uint32__Group__1 ;
    public final void rule__Uint32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5304:1: ( rule__Uint32__Group__0__Impl rule__Uint32__Group__1 )
            // InternalBasicsParser.g:5305:2: rule__Uint32__Group__0__Impl rule__Uint32__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Uint32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__0"


    // $ANTLR start "rule__Uint32__Group__0__Impl"
    // InternalBasicsParser.g:5312:1: rule__Uint32__Group__0__Impl : ( () ) ;
    public final void rule__Uint32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5316:1: ( ( () ) )
            // InternalBasicsParser.g:5317:1: ( () )
            {
            // InternalBasicsParser.g:5317:1: ( () )
            // InternalBasicsParser.g:5318:2: ()
            {
             before(grammarAccess.getUint32Access().getUint32Action_0());
            // InternalBasicsParser.g:5319:2: ()
            // InternalBasicsParser.g:5319:3:
            {
            }

             after(grammarAccess.getUint32Access().getUint32Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__0__Impl"


    // $ANTLR start "rule__Uint32__Group__1"
    // InternalBasicsParser.g:5327:1: rule__Uint32__Group__1 : rule__Uint32__Group__1__Impl ;
    public final void rule__Uint32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5331:1: ( rule__Uint32__Group__1__Impl )
            // InternalBasicsParser.g:5332:2: rule__Uint32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__1"


    // $ANTLR start "rule__Uint32__Group__1__Impl"
    // InternalBasicsParser.g:5338:1: rule__Uint32__Group__1__Impl : ( Uint32 ) ;
    public final void rule__Uint32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5342:1: ( ( Uint32 ) )
            // InternalBasicsParser.g:5343:1: ( Uint32 )
            {
            // InternalBasicsParser.g:5343:1: ( Uint32 )
            // InternalBasicsParser.g:5344:2: Uint32
            {
             before(grammarAccess.getUint32Access().getUint32Keyword_1());
            match(input,Uint32,FOLLOW_2);
             after(grammarAccess.getUint32Access().getUint32Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__1__Impl"


    // $ANTLR start "rule__Int64__Group__0"
    // InternalBasicsParser.g:5354:1: rule__Int64__Group__0 : rule__Int64__Group__0__Impl rule__Int64__Group__1 ;
    public final void rule__Int64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5358:1: ( rule__Int64__Group__0__Impl rule__Int64__Group__1 )
            // InternalBasicsParser.g:5359:2: rule__Int64__Group__0__Impl rule__Int64__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Int64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__0"


    // $ANTLR start "rule__Int64__Group__0__Impl"
    // InternalBasicsParser.g:5366:1: rule__Int64__Group__0__Impl : ( () ) ;
    public final void rule__Int64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5370:1: ( ( () ) )
            // InternalBasicsParser.g:5371:1: ( () )
            {
            // InternalBasicsParser.g:5371:1: ( () )
            // InternalBasicsParser.g:5372:2: ()
            {
             before(grammarAccess.getInt64Access().getInt64Action_0());
            // InternalBasicsParser.g:5373:2: ()
            // InternalBasicsParser.g:5373:3:
            {
            }

             after(grammarAccess.getInt64Access().getInt64Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__0__Impl"


    // $ANTLR start "rule__Int64__Group__1"
    // InternalBasicsParser.g:5381:1: rule__Int64__Group__1 : rule__Int64__Group__1__Impl ;
    public final void rule__Int64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5385:1: ( rule__Int64__Group__1__Impl )
            // InternalBasicsParser.g:5386:2: rule__Int64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__1"


    // $ANTLR start "rule__Int64__Group__1__Impl"
    // InternalBasicsParser.g:5392:1: rule__Int64__Group__1__Impl : ( Int64 ) ;
    public final void rule__Int64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5396:1: ( ( Int64 ) )
            // InternalBasicsParser.g:5397:1: ( Int64 )
            {
            // InternalBasicsParser.g:5397:1: ( Int64 )
            // InternalBasicsParser.g:5398:2: Int64
            {
             before(grammarAccess.getInt64Access().getInt64Keyword_1());
            match(input,Int64,FOLLOW_2);
             after(grammarAccess.getInt64Access().getInt64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__1__Impl"


    // $ANTLR start "rule__Uint64__Group__0"
    // InternalBasicsParser.g:5408:1: rule__Uint64__Group__0 : rule__Uint64__Group__0__Impl rule__Uint64__Group__1 ;
    public final void rule__Uint64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5412:1: ( rule__Uint64__Group__0__Impl rule__Uint64__Group__1 )
            // InternalBasicsParser.g:5413:2: rule__Uint64__Group__0__Impl rule__Uint64__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Uint64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__0"


    // $ANTLR start "rule__Uint64__Group__0__Impl"
    // InternalBasicsParser.g:5420:1: rule__Uint64__Group__0__Impl : ( () ) ;
    public final void rule__Uint64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5424:1: ( ( () ) )
            // InternalBasicsParser.g:5425:1: ( () )
            {
            // InternalBasicsParser.g:5425:1: ( () )
            // InternalBasicsParser.g:5426:2: ()
            {
             before(grammarAccess.getUint64Access().getUint64Action_0());
            // InternalBasicsParser.g:5427:2: ()
            // InternalBasicsParser.g:5427:3:
            {
            }

             after(grammarAccess.getUint64Access().getUint64Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__0__Impl"


    // $ANTLR start "rule__Uint64__Group__1"
    // InternalBasicsParser.g:5435:1: rule__Uint64__Group__1 : rule__Uint64__Group__1__Impl ;
    public final void rule__Uint64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5439:1: ( rule__Uint64__Group__1__Impl )
            // InternalBasicsParser.g:5440:2: rule__Uint64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__1"


    // $ANTLR start "rule__Uint64__Group__1__Impl"
    // InternalBasicsParser.g:5446:1: rule__Uint64__Group__1__Impl : ( Uint64 ) ;
    public final void rule__Uint64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5450:1: ( ( Uint64 ) )
            // InternalBasicsParser.g:5451:1: ( Uint64 )
            {
            // InternalBasicsParser.g:5451:1: ( Uint64 )
            // InternalBasicsParser.g:5452:2: Uint64
            {
             before(grammarAccess.getUint64Access().getUint64Keyword_1());
            match(input,Uint64,FOLLOW_2);
             after(grammarAccess.getUint64Access().getUint64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__1__Impl"


    // $ANTLR start "rule__Float32__Group__0"
    // InternalBasicsParser.g:5462:1: rule__Float32__Group__0 : rule__Float32__Group__0__Impl rule__Float32__Group__1 ;
    public final void rule__Float32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5466:1: ( rule__Float32__Group__0__Impl rule__Float32__Group__1 )
            // InternalBasicsParser.g:5467:2: rule__Float32__Group__0__Impl rule__Float32__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Float32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__0"


    // $ANTLR start "rule__Float32__Group__0__Impl"
    // InternalBasicsParser.g:5474:1: rule__Float32__Group__0__Impl : ( () ) ;
    public final void rule__Float32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5478:1: ( ( () ) )
            // InternalBasicsParser.g:5479:1: ( () )
            {
            // InternalBasicsParser.g:5479:1: ( () )
            // InternalBasicsParser.g:5480:2: ()
            {
             before(grammarAccess.getFloat32Access().getFloat32Action_0());
            // InternalBasicsParser.g:5481:2: ()
            // InternalBasicsParser.g:5481:3:
            {
            }

             after(grammarAccess.getFloat32Access().getFloat32Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__0__Impl"


    // $ANTLR start "rule__Float32__Group__1"
    // InternalBasicsParser.g:5489:1: rule__Float32__Group__1 : rule__Float32__Group__1__Impl ;
    public final void rule__Float32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5493:1: ( rule__Float32__Group__1__Impl )
            // InternalBasicsParser.g:5494:2: rule__Float32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__1"


    // $ANTLR start "rule__Float32__Group__1__Impl"
    // InternalBasicsParser.g:5500:1: rule__Float32__Group__1__Impl : ( Float32 ) ;
    public final void rule__Float32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5504:1: ( ( Float32 ) )
            // InternalBasicsParser.g:5505:1: ( Float32 )
            {
            // InternalBasicsParser.g:5505:1: ( Float32 )
            // InternalBasicsParser.g:5506:2: Float32
            {
             before(grammarAccess.getFloat32Access().getFloat32Keyword_1());
            match(input,Float32,FOLLOW_2);
             after(grammarAccess.getFloat32Access().getFloat32Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__1__Impl"


    // $ANTLR start "rule__Float64__Group__0"
    // InternalBasicsParser.g:5516:1: rule__Float64__Group__0 : rule__Float64__Group__0__Impl rule__Float64__Group__1 ;
    public final void rule__Float64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5520:1: ( rule__Float64__Group__0__Impl rule__Float64__Group__1 )
            // InternalBasicsParser.g:5521:2: rule__Float64__Group__0__Impl rule__Float64__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Float64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__0"


    // $ANTLR start "rule__Float64__Group__0__Impl"
    // InternalBasicsParser.g:5528:1: rule__Float64__Group__0__Impl : ( () ) ;
    public final void rule__Float64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5532:1: ( ( () ) )
            // InternalBasicsParser.g:5533:1: ( () )
            {
            // InternalBasicsParser.g:5533:1: ( () )
            // InternalBasicsParser.g:5534:2: ()
            {
             before(grammarAccess.getFloat64Access().getFloat64Action_0());
            // InternalBasicsParser.g:5535:2: ()
            // InternalBasicsParser.g:5535:3:
            {
            }

             after(grammarAccess.getFloat64Access().getFloat64Action_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__0__Impl"


    // $ANTLR start "rule__Float64__Group__1"
    // InternalBasicsParser.g:5543:1: rule__Float64__Group__1 : rule__Float64__Group__1__Impl ;
    public final void rule__Float64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5547:1: ( rule__Float64__Group__1__Impl )
            // InternalBasicsParser.g:5548:2: rule__Float64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__1"


    // $ANTLR start "rule__Float64__Group__1__Impl"
    // InternalBasicsParser.g:5554:1: rule__Float64__Group__1__Impl : ( Float64 ) ;
    public final void rule__Float64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5558:1: ( ( Float64 ) )
            // InternalBasicsParser.g:5559:1: ( Float64 )
            {
            // InternalBasicsParser.g:5559:1: ( Float64 )
            // InternalBasicsParser.g:5560:2: Float64
            {
             before(grammarAccess.getFloat64Access().getFloat64Keyword_1());
            match(input,Float64,FOLLOW_2);
             after(grammarAccess.getFloat64Access().getFloat64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalBasicsParser.g:5570:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5574:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalBasicsParser.g:5575:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalBasicsParser.g:5582:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5586:1: ( ( () ) )
            // InternalBasicsParser.g:5587:1: ( () )
            {
            // InternalBasicsParser.g:5587:1: ( () )
            // InternalBasicsParser.g:5588:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0());
            // InternalBasicsParser.g:5589:2: ()
            // InternalBasicsParser.g:5589:3:
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalBasicsParser.g:5597:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5601:1: ( rule__String0__Group__1__Impl )
            // InternalBasicsParser.g:5602:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalBasicsParser.g:5608:1: rule__String0__Group__1__Impl : ( String_1 ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5612:1: ( ( String_1 ) )
            // InternalBasicsParser.g:5613:1: ( String_1 )
            {
            // InternalBasicsParser.g:5613:1: ( String_1 )
            // InternalBasicsParser.g:5614:2: String_1
            {
             before(grammarAccess.getString0Access().getStringKeyword_1());
            match(input,String_1,FOLLOW_2);
             after(grammarAccess.getString0Access().getStringKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Byte__Group__0"
    // InternalBasicsParser.g:5624:1: rule__Byte__Group__0 : rule__Byte__Group__0__Impl rule__Byte__Group__1 ;
    public final void rule__Byte__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5628:1: ( rule__Byte__Group__0__Impl rule__Byte__Group__1 )
            // InternalBasicsParser.g:5629:2: rule__Byte__Group__0__Impl rule__Byte__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Byte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Byte__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__0"


    // $ANTLR start "rule__Byte__Group__0__Impl"
    // InternalBasicsParser.g:5636:1: rule__Byte__Group__0__Impl : ( () ) ;
    public final void rule__Byte__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5640:1: ( ( () ) )
            // InternalBasicsParser.g:5641:1: ( () )
            {
            // InternalBasicsParser.g:5641:1: ( () )
            // InternalBasicsParser.g:5642:2: ()
            {
             before(grammarAccess.getByteAccess().getByteAction_0());
            // InternalBasicsParser.g:5643:2: ()
            // InternalBasicsParser.g:5643:3:
            {
            }

             after(grammarAccess.getByteAccess().getByteAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__0__Impl"


    // $ANTLR start "rule__Byte__Group__1"
    // InternalBasicsParser.g:5651:1: rule__Byte__Group__1 : rule__Byte__Group__1__Impl ;
    public final void rule__Byte__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5655:1: ( rule__Byte__Group__1__Impl )
            // InternalBasicsParser.g:5656:2: rule__Byte__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Byte__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__1"


    // $ANTLR start "rule__Byte__Group__1__Impl"
    // InternalBasicsParser.g:5662:1: rule__Byte__Group__1__Impl : ( Byte ) ;
    public final void rule__Byte__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5666:1: ( ( Byte ) )
            // InternalBasicsParser.g:5667:1: ( Byte )
            {
            // InternalBasicsParser.g:5667:1: ( Byte )
            // InternalBasicsParser.g:5668:2: Byte
            {
             before(grammarAccess.getByteAccess().getByteKeyword_1());
            match(input,Byte,FOLLOW_2);
             after(grammarAccess.getByteAccess().getByteKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalBasicsParser.g:5678:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5682:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalBasicsParser.g:5683:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalBasicsParser.g:5690:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5694:1: ( ( () ) )
            // InternalBasicsParser.g:5695:1: ( () )
            {
            // InternalBasicsParser.g:5695:1: ( () )
            // InternalBasicsParser.g:5696:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0());
            // InternalBasicsParser.g:5697:2: ()
            // InternalBasicsParser.g:5697:3:
            {
            }

             after(grammarAccess.getTimeAccess().getTimeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalBasicsParser.g:5705:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5709:1: ( rule__Time__Group__1__Impl )
            // InternalBasicsParser.g:5710:2: rule__Time__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalBasicsParser.g:5716:1: rule__Time__Group__1__Impl : ( Time ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5720:1: ( ( Time ) )
            // InternalBasicsParser.g:5721:1: ( Time )
            {
            // InternalBasicsParser.g:5721:1: ( Time )
            // InternalBasicsParser.g:5722:2: Time
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword_1());
            match(input,Time,FOLLOW_2);
             after(grammarAccess.getTimeAccess().getTimeKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalBasicsParser.g:5732:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5736:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalBasicsParser.g:5737:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalBasicsParser.g:5744:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5748:1: ( ( () ) )
            // InternalBasicsParser.g:5749:1: ( () )
            {
            // InternalBasicsParser.g:5749:1: ( () )
            // InternalBasicsParser.g:5750:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0());
            // InternalBasicsParser.g:5751:2: ()
            // InternalBasicsParser.g:5751:3:
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalBasicsParser.g:5759:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5763:1: ( rule__Duration__Group__1__Impl )
            // InternalBasicsParser.g:5764:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalBasicsParser.g:5770:1: rule__Duration__Group__1__Impl : ( Duration ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5774:1: ( ( Duration ) )
            // InternalBasicsParser.g:5775:1: ( Duration )
            {
            // InternalBasicsParser.g:5775:1: ( Duration )
            // InternalBasicsParser.g:5776:2: Duration
            {
             before(grammarAccess.getDurationAccess().getDurationKeyword_1());
            match(input,Duration,FOLLOW_2);
             after(grammarAccess.getDurationAccess().getDurationKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__BoolArray__Group__0"
    // InternalBasicsParser.g:5786:1: rule__BoolArray__Group__0 : rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 ;
    public final void rule__BoolArray__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5790:1: ( rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 )
            // InternalBasicsParser.g:5791:2: rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__BoolArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__0"


    // $ANTLR start "rule__BoolArray__Group__0__Impl"
    // InternalBasicsParser.g:5798:1: rule__BoolArray__Group__0__Impl : ( () ) ;
    public final void rule__BoolArray__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5802:1: ( ( () ) )
            // InternalBasicsParser.g:5803:1: ( () )
            {
            // InternalBasicsParser.g:5803:1: ( () )
            // InternalBasicsParser.g:5804:2: ()
            {
             before(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0());
            // InternalBasicsParser.g:5805:2: ()
            // InternalBasicsParser.g:5805:3:
            {
            }

             after(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__0__Impl"


    // $ANTLR start "rule__BoolArray__Group__1"
    // InternalBasicsParser.g:5813:1: rule__BoolArray__Group__1 : rule__BoolArray__Group__1__Impl ;
    public final void rule__BoolArray__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5817:1: ( rule__BoolArray__Group__1__Impl )
            // InternalBasicsParser.g:5818:2: rule__BoolArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__1"


    // $ANTLR start "rule__BoolArray__Group__1__Impl"
    // InternalBasicsParser.g:5824:1: rule__BoolArray__Group__1__Impl : ( Bool_1 ) ;
    public final void rule__BoolArray__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5828:1: ( ( Bool_1 ) )
            // InternalBasicsParser.g:5829:1: ( Bool_1 )
            {
            // InternalBasicsParser.g:5829:1: ( Bool_1 )
            // InternalBasicsParser.g:5830:2: Bool_1
            {
             before(grammarAccess.getBoolArrayAccess().getBoolKeyword_1());
            match(input,Bool_1,FOLLOW_2);
             after(grammarAccess.getBoolArrayAccess().getBoolKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__1__Impl"


    // $ANTLR start "rule__Int8Array__Group__0"
    // InternalBasicsParser.g:5840:1: rule__Int8Array__Group__0 : rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 ;
    public final void rule__Int8Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5844:1: ( rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 )
            // InternalBasicsParser.g:5845:2: rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Int8Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__0"


    // $ANTLR start "rule__Int8Array__Group__0__Impl"
    // InternalBasicsParser.g:5852:1: rule__Int8Array__Group__0__Impl : ( () ) ;
    public final void rule__Int8Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5856:1: ( ( () ) )
            // InternalBasicsParser.g:5857:1: ( () )
            {
            // InternalBasicsParser.g:5857:1: ( () )
            // InternalBasicsParser.g:5858:2: ()
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0());
            // InternalBasicsParser.g:5859:2: ()
            // InternalBasicsParser.g:5859:3:
            {
            }

             after(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__0__Impl"


    // $ANTLR start "rule__Int8Array__Group__1"
    // InternalBasicsParser.g:5867:1: rule__Int8Array__Group__1 : rule__Int8Array__Group__1__Impl ;
    public final void rule__Int8Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5871:1: ( rule__Int8Array__Group__1__Impl )
            // InternalBasicsParser.g:5872:2: rule__Int8Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__1"


    // $ANTLR start "rule__Int8Array__Group__1__Impl"
    // InternalBasicsParser.g:5878:1: rule__Int8Array__Group__1__Impl : ( Int8_1 ) ;
    public final void rule__Int8Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5882:1: ( ( Int8_1 ) )
            // InternalBasicsParser.g:5883:1: ( Int8_1 )
            {
            // InternalBasicsParser.g:5883:1: ( Int8_1 )
            // InternalBasicsParser.g:5884:2: Int8_1
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8Keyword_1());
            match(input,Int8_1,FOLLOW_2);
             after(grammarAccess.getInt8ArrayAccess().getInt8Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__1__Impl"


    // $ANTLR start "rule__Uint8Array__Group__0"
    // InternalBasicsParser.g:5894:1: rule__Uint8Array__Group__0 : rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 ;
    public final void rule__Uint8Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5898:1: ( rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 )
            // InternalBasicsParser.g:5899:2: rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Uint8Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__0"


    // $ANTLR start "rule__Uint8Array__Group__0__Impl"
    // InternalBasicsParser.g:5906:1: rule__Uint8Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint8Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5910:1: ( ( () ) )
            // InternalBasicsParser.g:5911:1: ( () )
            {
            // InternalBasicsParser.g:5911:1: ( () )
            // InternalBasicsParser.g:5912:2: ()
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0());
            // InternalBasicsParser.g:5913:2: ()
            // InternalBasicsParser.g:5913:3:
            {
            }

             after(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__0__Impl"


    // $ANTLR start "rule__Uint8Array__Group__1"
    // InternalBasicsParser.g:5921:1: rule__Uint8Array__Group__1 : rule__Uint8Array__Group__1__Impl ;
    public final void rule__Uint8Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5925:1: ( rule__Uint8Array__Group__1__Impl )
            // InternalBasicsParser.g:5926:2: rule__Uint8Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__1"


    // $ANTLR start "rule__Uint8Array__Group__1__Impl"
    // InternalBasicsParser.g:5932:1: rule__Uint8Array__Group__1__Impl : ( Uint8_1 ) ;
    public final void rule__Uint8Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5936:1: ( ( Uint8_1 ) )
            // InternalBasicsParser.g:5937:1: ( Uint8_1 )
            {
            // InternalBasicsParser.g:5937:1: ( Uint8_1 )
            // InternalBasicsParser.g:5938:2: Uint8_1
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8Keyword_1());
            match(input,Uint8_1,FOLLOW_2);
             after(grammarAccess.getUint8ArrayAccess().getUint8Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__1__Impl"


    // $ANTLR start "rule__Int16Array__Group__0"
    // InternalBasicsParser.g:5948:1: rule__Int16Array__Group__0 : rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 ;
    public final void rule__Int16Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5952:1: ( rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 )
            // InternalBasicsParser.g:5953:2: rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Int16Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__0"


    // $ANTLR start "rule__Int16Array__Group__0__Impl"
    // InternalBasicsParser.g:5960:1: rule__Int16Array__Group__0__Impl : ( () ) ;
    public final void rule__Int16Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5964:1: ( ( () ) )
            // InternalBasicsParser.g:5965:1: ( () )
            {
            // InternalBasicsParser.g:5965:1: ( () )
            // InternalBasicsParser.g:5966:2: ()
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0());
            // InternalBasicsParser.g:5967:2: ()
            // InternalBasicsParser.g:5967:3:
            {
            }

             after(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__0__Impl"


    // $ANTLR start "rule__Int16Array__Group__1"
    // InternalBasicsParser.g:5975:1: rule__Int16Array__Group__1 : rule__Int16Array__Group__1__Impl ;
    public final void rule__Int16Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5979:1: ( rule__Int16Array__Group__1__Impl )
            // InternalBasicsParser.g:5980:2: rule__Int16Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__1"


    // $ANTLR start "rule__Int16Array__Group__1__Impl"
    // InternalBasicsParser.g:5986:1: rule__Int16Array__Group__1__Impl : ( Int16_1 ) ;
    public final void rule__Int16Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:5990:1: ( ( Int16_1 ) )
            // InternalBasicsParser.g:5991:1: ( Int16_1 )
            {
            // InternalBasicsParser.g:5991:1: ( Int16_1 )
            // InternalBasicsParser.g:5992:2: Int16_1
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16Keyword_1());
            match(input,Int16_1,FOLLOW_2);
             after(grammarAccess.getInt16ArrayAccess().getInt16Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__1__Impl"


    // $ANTLR start "rule__Uint16Array__Group__0"
    // InternalBasicsParser.g:6002:1: rule__Uint16Array__Group__0 : rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 ;
    public final void rule__Uint16Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6006:1: ( rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 )
            // InternalBasicsParser.g:6007:2: rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Uint16Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__0"


    // $ANTLR start "rule__Uint16Array__Group__0__Impl"
    // InternalBasicsParser.g:6014:1: rule__Uint16Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint16Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6018:1: ( ( () ) )
            // InternalBasicsParser.g:6019:1: ( () )
            {
            // InternalBasicsParser.g:6019:1: ( () )
            // InternalBasicsParser.g:6020:2: ()
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0());
            // InternalBasicsParser.g:6021:2: ()
            // InternalBasicsParser.g:6021:3:
            {
            }

             after(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__0__Impl"


    // $ANTLR start "rule__Uint16Array__Group__1"
    // InternalBasicsParser.g:6029:1: rule__Uint16Array__Group__1 : rule__Uint16Array__Group__1__Impl ;
    public final void rule__Uint16Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6033:1: ( rule__Uint16Array__Group__1__Impl )
            // InternalBasicsParser.g:6034:2: rule__Uint16Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__1"


    // $ANTLR start "rule__Uint16Array__Group__1__Impl"
    // InternalBasicsParser.g:6040:1: rule__Uint16Array__Group__1__Impl : ( Uint16_1 ) ;
    public final void rule__Uint16Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6044:1: ( ( Uint16_1 ) )
            // InternalBasicsParser.g:6045:1: ( Uint16_1 )
            {
            // InternalBasicsParser.g:6045:1: ( Uint16_1 )
            // InternalBasicsParser.g:6046:2: Uint16_1
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16Keyword_1());
            match(input,Uint16_1,FOLLOW_2);
             after(grammarAccess.getUint16ArrayAccess().getUint16Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__1__Impl"


    // $ANTLR start "rule__Int32Array__Group__0"
    // InternalBasicsParser.g:6056:1: rule__Int32Array__Group__0 : rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 ;
    public final void rule__Int32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6060:1: ( rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 )
            // InternalBasicsParser.g:6061:2: rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Int32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__0"


    // $ANTLR start "rule__Int32Array__Group__0__Impl"
    // InternalBasicsParser.g:6068:1: rule__Int32Array__Group__0__Impl : ( () ) ;
    public final void rule__Int32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6072:1: ( ( () ) )
            // InternalBasicsParser.g:6073:1: ( () )
            {
            // InternalBasicsParser.g:6073:1: ( () )
            // InternalBasicsParser.g:6074:2: ()
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0());
            // InternalBasicsParser.g:6075:2: ()
            // InternalBasicsParser.g:6075:3:
            {
            }

             after(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__0__Impl"


    // $ANTLR start "rule__Int32Array__Group__1"
    // InternalBasicsParser.g:6083:1: rule__Int32Array__Group__1 : rule__Int32Array__Group__1__Impl ;
    public final void rule__Int32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6087:1: ( rule__Int32Array__Group__1__Impl )
            // InternalBasicsParser.g:6088:2: rule__Int32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__1"


    // $ANTLR start "rule__Int32Array__Group__1__Impl"
    // InternalBasicsParser.g:6094:1: rule__Int32Array__Group__1__Impl : ( Int32_1 ) ;
    public final void rule__Int32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6098:1: ( ( Int32_1 ) )
            // InternalBasicsParser.g:6099:1: ( Int32_1 )
            {
            // InternalBasicsParser.g:6099:1: ( Int32_1 )
            // InternalBasicsParser.g:6100:2: Int32_1
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32Keyword_1());
            match(input,Int32_1,FOLLOW_2);
             after(grammarAccess.getInt32ArrayAccess().getInt32Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__1__Impl"


    // $ANTLR start "rule__Uint32Array__Group__0"
    // InternalBasicsParser.g:6110:1: rule__Uint32Array__Group__0 : rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 ;
    public final void rule__Uint32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6114:1: ( rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 )
            // InternalBasicsParser.g:6115:2: rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__Uint32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__0"


    // $ANTLR start "rule__Uint32Array__Group__0__Impl"
    // InternalBasicsParser.g:6122:1: rule__Uint32Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6126:1: ( ( () ) )
            // InternalBasicsParser.g:6127:1: ( () )
            {
            // InternalBasicsParser.g:6127:1: ( () )
            // InternalBasicsParser.g:6128:2: ()
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0());
            // InternalBasicsParser.g:6129:2: ()
            // InternalBasicsParser.g:6129:3:
            {
            }

             after(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__0__Impl"


    // $ANTLR start "rule__Uint32Array__Group__1"
    // InternalBasicsParser.g:6137:1: rule__Uint32Array__Group__1 : rule__Uint32Array__Group__1__Impl ;
    public final void rule__Uint32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6141:1: ( rule__Uint32Array__Group__1__Impl )
            // InternalBasicsParser.g:6142:2: rule__Uint32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__1"


    // $ANTLR start "rule__Uint32Array__Group__1__Impl"
    // InternalBasicsParser.g:6148:1: rule__Uint32Array__Group__1__Impl : ( Uint32_1 ) ;
    public final void rule__Uint32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6152:1: ( ( Uint32_1 ) )
            // InternalBasicsParser.g:6153:1: ( Uint32_1 )
            {
            // InternalBasicsParser.g:6153:1: ( Uint32_1 )
            // InternalBasicsParser.g:6154:2: Uint32_1
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32Keyword_1());
            match(input,Uint32_1,FOLLOW_2);
             after(grammarAccess.getUint32ArrayAccess().getUint32Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__1__Impl"


    // $ANTLR start "rule__Int64Array__Group__0"
    // InternalBasicsParser.g:6164:1: rule__Int64Array__Group__0 : rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 ;
    public final void rule__Int64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6168:1: ( rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 )
            // InternalBasicsParser.g:6169:2: rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__Int64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__0"


    // $ANTLR start "rule__Int64Array__Group__0__Impl"
    // InternalBasicsParser.g:6176:1: rule__Int64Array__Group__0__Impl : ( () ) ;
    public final void rule__Int64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6180:1: ( ( () ) )
            // InternalBasicsParser.g:6181:1: ( () )
            {
            // InternalBasicsParser.g:6181:1: ( () )
            // InternalBasicsParser.g:6182:2: ()
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0());
            // InternalBasicsParser.g:6183:2: ()
            // InternalBasicsParser.g:6183:3:
            {
            }

             after(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__0__Impl"


    // $ANTLR start "rule__Int64Array__Group__1"
    // InternalBasicsParser.g:6191:1: rule__Int64Array__Group__1 : rule__Int64Array__Group__1__Impl ;
    public final void rule__Int64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6195:1: ( rule__Int64Array__Group__1__Impl )
            // InternalBasicsParser.g:6196:2: rule__Int64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__1"


    // $ANTLR start "rule__Int64Array__Group__1__Impl"
    // InternalBasicsParser.g:6202:1: rule__Int64Array__Group__1__Impl : ( Int64_1 ) ;
    public final void rule__Int64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6206:1: ( ( Int64_1 ) )
            // InternalBasicsParser.g:6207:1: ( Int64_1 )
            {
            // InternalBasicsParser.g:6207:1: ( Int64_1 )
            // InternalBasicsParser.g:6208:2: Int64_1
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64Keyword_1());
            match(input,Int64_1,FOLLOW_2);
             after(grammarAccess.getInt64ArrayAccess().getInt64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__1__Impl"


    // $ANTLR start "rule__Uint64Array__Group__0"
    // InternalBasicsParser.g:6218:1: rule__Uint64Array__Group__0 : rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 ;
    public final void rule__Uint64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6222:1: ( rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 )
            // InternalBasicsParser.g:6223:2: rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__Uint64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__0"


    // $ANTLR start "rule__Uint64Array__Group__0__Impl"
    // InternalBasicsParser.g:6230:1: rule__Uint64Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6234:1: ( ( () ) )
            // InternalBasicsParser.g:6235:1: ( () )
            {
            // InternalBasicsParser.g:6235:1: ( () )
            // InternalBasicsParser.g:6236:2: ()
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0());
            // InternalBasicsParser.g:6237:2: ()
            // InternalBasicsParser.g:6237:3:
            {
            }

             after(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__0__Impl"


    // $ANTLR start "rule__Uint64Array__Group__1"
    // InternalBasicsParser.g:6245:1: rule__Uint64Array__Group__1 : rule__Uint64Array__Group__1__Impl ;
    public final void rule__Uint64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6249:1: ( rule__Uint64Array__Group__1__Impl )
            // InternalBasicsParser.g:6250:2: rule__Uint64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__1"


    // $ANTLR start "rule__Uint64Array__Group__1__Impl"
    // InternalBasicsParser.g:6256:1: rule__Uint64Array__Group__1__Impl : ( Uint64_1 ) ;
    public final void rule__Uint64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6260:1: ( ( Uint64_1 ) )
            // InternalBasicsParser.g:6261:1: ( Uint64_1 )
            {
            // InternalBasicsParser.g:6261:1: ( Uint64_1 )
            // InternalBasicsParser.g:6262:2: Uint64_1
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64Keyword_1());
            match(input,Uint64_1,FOLLOW_2);
             after(grammarAccess.getUint64ArrayAccess().getUint64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__1__Impl"


    // $ANTLR start "rule__Float32Array__Group__0"
    // InternalBasicsParser.g:6272:1: rule__Float32Array__Group__0 : rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 ;
    public final void rule__Float32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6276:1: ( rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 )
            // InternalBasicsParser.g:6277:2: rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__Float32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__0"


    // $ANTLR start "rule__Float32Array__Group__0__Impl"
    // InternalBasicsParser.g:6284:1: rule__Float32Array__Group__0__Impl : ( () ) ;
    public final void rule__Float32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6288:1: ( ( () ) )
            // InternalBasicsParser.g:6289:1: ( () )
            {
            // InternalBasicsParser.g:6289:1: ( () )
            // InternalBasicsParser.g:6290:2: ()
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0());
            // InternalBasicsParser.g:6291:2: ()
            // InternalBasicsParser.g:6291:3:
            {
            }

             after(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__0__Impl"


    // $ANTLR start "rule__Float32Array__Group__1"
    // InternalBasicsParser.g:6299:1: rule__Float32Array__Group__1 : rule__Float32Array__Group__1__Impl ;
    public final void rule__Float32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6303:1: ( rule__Float32Array__Group__1__Impl )
            // InternalBasicsParser.g:6304:2: rule__Float32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__1"


    // $ANTLR start "rule__Float32Array__Group__1__Impl"
    // InternalBasicsParser.g:6310:1: rule__Float32Array__Group__1__Impl : ( Float32_1 ) ;
    public final void rule__Float32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6314:1: ( ( Float32_1 ) )
            // InternalBasicsParser.g:6315:1: ( Float32_1 )
            {
            // InternalBasicsParser.g:6315:1: ( Float32_1 )
            // InternalBasicsParser.g:6316:2: Float32_1
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1());
            match(input,Float32_1,FOLLOW_2);
             after(grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__1__Impl"


    // $ANTLR start "rule__Float64Array__Group__0"
    // InternalBasicsParser.g:6326:1: rule__Float64Array__Group__0 : rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 ;
    public final void rule__Float64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6330:1: ( rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 )
            // InternalBasicsParser.g:6331:2: rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__Float64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__0"


    // $ANTLR start "rule__Float64Array__Group__0__Impl"
    // InternalBasicsParser.g:6338:1: rule__Float64Array__Group__0__Impl : ( () ) ;
    public final void rule__Float64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6342:1: ( ( () ) )
            // InternalBasicsParser.g:6343:1: ( () )
            {
            // InternalBasicsParser.g:6343:1: ( () )
            // InternalBasicsParser.g:6344:2: ()
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0());
            // InternalBasicsParser.g:6345:2: ()
            // InternalBasicsParser.g:6345:3:
            {
            }

             after(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__0__Impl"


    // $ANTLR start "rule__Float64Array__Group__1"
    // InternalBasicsParser.g:6353:1: rule__Float64Array__Group__1 : rule__Float64Array__Group__1__Impl ;
    public final void rule__Float64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6357:1: ( rule__Float64Array__Group__1__Impl )
            // InternalBasicsParser.g:6358:2: rule__Float64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__1"


    // $ANTLR start "rule__Float64Array__Group__1__Impl"
    // InternalBasicsParser.g:6364:1: rule__Float64Array__Group__1__Impl : ( Float64_1 ) ;
    public final void rule__Float64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6368:1: ( ( Float64_1 ) )
            // InternalBasicsParser.g:6369:1: ( Float64_1 )
            {
            // InternalBasicsParser.g:6369:1: ( Float64_1 )
            // InternalBasicsParser.g:6370:2: Float64_1
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1());
            match(input,Float64_1,FOLLOW_2);
             after(grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__1__Impl"


    // $ANTLR start "rule__String0Array__Group__0"
    // InternalBasicsParser.g:6380:1: rule__String0Array__Group__0 : rule__String0Array__Group__0__Impl rule__String0Array__Group__1 ;
    public final void rule__String0Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6384:1: ( rule__String0Array__Group__0__Impl rule__String0Array__Group__1 )
            // InternalBasicsParser.g:6385:2: rule__String0Array__Group__0__Impl rule__String0Array__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__String0Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__0"


    // $ANTLR start "rule__String0Array__Group__0__Impl"
    // InternalBasicsParser.g:6392:1: rule__String0Array__Group__0__Impl : ( () ) ;
    public final void rule__String0Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6396:1: ( ( () ) )
            // InternalBasicsParser.g:6397:1: ( () )
            {
            // InternalBasicsParser.g:6397:1: ( () )
            // InternalBasicsParser.g:6398:2: ()
            {
             before(grammarAccess.getString0ArrayAccess().getStringArrayAction_0());
            // InternalBasicsParser.g:6399:2: ()
            // InternalBasicsParser.g:6399:3:
            {
            }

             after(grammarAccess.getString0ArrayAccess().getStringArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__0__Impl"


    // $ANTLR start "rule__String0Array__Group__1"
    // InternalBasicsParser.g:6407:1: rule__String0Array__Group__1 : rule__String0Array__Group__1__Impl ;
    public final void rule__String0Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6411:1: ( rule__String0Array__Group__1__Impl )
            // InternalBasicsParser.g:6412:2: rule__String0Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__1"


    // $ANTLR start "rule__String0Array__Group__1__Impl"
    // InternalBasicsParser.g:6418:1: rule__String0Array__Group__1__Impl : ( String_2 ) ;
    public final void rule__String0Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6422:1: ( ( String_2 ) )
            // InternalBasicsParser.g:6423:1: ( String_2 )
            {
            // InternalBasicsParser.g:6423:1: ( String_2 )
            // InternalBasicsParser.g:6424:2: String_2
            {
             before(grammarAccess.getString0ArrayAccess().getStringKeyword_1());
            match(input,String_2,FOLLOW_2);
             after(grammarAccess.getString0ArrayAccess().getStringKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__1__Impl"


    // $ANTLR start "rule__ByteArray__Group__0"
    // InternalBasicsParser.g:6434:1: rule__ByteArray__Group__0 : rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 ;
    public final void rule__ByteArray__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6438:1: ( rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 )
            // InternalBasicsParser.g:6439:2: rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__ByteArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__0"


    // $ANTLR start "rule__ByteArray__Group__0__Impl"
    // InternalBasicsParser.g:6446:1: rule__ByteArray__Group__0__Impl : ( () ) ;
    public final void rule__ByteArray__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6450:1: ( ( () ) )
            // InternalBasicsParser.g:6451:1: ( () )
            {
            // InternalBasicsParser.g:6451:1: ( () )
            // InternalBasicsParser.g:6452:2: ()
            {
             before(grammarAccess.getByteArrayAccess().getByteArrayAction_0());
            // InternalBasicsParser.g:6453:2: ()
            // InternalBasicsParser.g:6453:3:
            {
            }

             after(grammarAccess.getByteArrayAccess().getByteArrayAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__0__Impl"


    // $ANTLR start "rule__ByteArray__Group__1"
    // InternalBasicsParser.g:6461:1: rule__ByteArray__Group__1 : rule__ByteArray__Group__1__Impl ;
    public final void rule__ByteArray__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6465:1: ( rule__ByteArray__Group__1__Impl )
            // InternalBasicsParser.g:6466:2: rule__ByteArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__1"


    // $ANTLR start "rule__ByteArray__Group__1__Impl"
    // InternalBasicsParser.g:6472:1: rule__ByteArray__Group__1__Impl : ( Byte_1 ) ;
    public final void rule__ByteArray__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6476:1: ( ( Byte_1 ) )
            // InternalBasicsParser.g:6477:1: ( Byte_1 )
            {
            // InternalBasicsParser.g:6477:1: ( Byte_1 )
            // InternalBasicsParser.g:6478:2: Byte_1
            {
             before(grammarAccess.getByteArrayAccess().getByteKeyword_1());
            match(input,Byte_1,FOLLOW_2);
             after(grammarAccess.getByteArrayAccess().getByteKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalBasicsParser.g:6488:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6492:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalBasicsParser.g:6493:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalBasicsParser.g:6500:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6504:1: ( ( () ) )
            // InternalBasicsParser.g:6505:1: ( () )
            {
            // InternalBasicsParser.g:6505:1: ( () )
            // InternalBasicsParser.g:6506:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0());
            // InternalBasicsParser.g:6507:2: ()
            // InternalBasicsParser.g:6507:3:
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalBasicsParser.g:6515:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6519:1: ( rule__Header__Group__1__Impl )
            // InternalBasicsParser.g:6520:2: rule__Header__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalBasicsParser.g:6526:1: rule__Header__Group__1__Impl : ( Header ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6530:1: ( ( Header ) )
            // InternalBasicsParser.g:6531:1: ( Header )
            {
            // InternalBasicsParser.g:6531:1: ( Header )
            // InternalBasicsParser.g:6532:2: Header
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_1());
            match(input,Header,FOLLOW_2);
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__0"
    // InternalBasicsParser.g:6542:1: rule__ArrayTopicSpecRef__Group__0 : rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 ;
    public final void rule__ArrayTopicSpecRef__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6546:1: ( rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 )
            // InternalBasicsParser.g:6547:2: rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ArrayTopicSpecRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__0"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__0__Impl"
    // InternalBasicsParser.g:6554:1: rule__ArrayTopicSpecRef__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayTopicSpecRef__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6558:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:6559:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:6559:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:6560:2: LeftSquareBracket
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getLeftSquareBracketKeyword_0());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getArrayTopicSpecRefAccess().getLeftSquareBracketKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__0__Impl"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__1"
    // InternalBasicsParser.g:6569:1: rule__ArrayTopicSpecRef__Group__1 : rule__ArrayTopicSpecRef__Group__1__Impl rule__ArrayTopicSpecRef__Group__2 ;
    public final void rule__ArrayTopicSpecRef__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6573:1: ( rule__ArrayTopicSpecRef__Group__1__Impl rule__ArrayTopicSpecRef__Group__2 )
            // InternalBasicsParser.g:6574:2: rule__ArrayTopicSpecRef__Group__1__Impl rule__ArrayTopicSpecRef__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ArrayTopicSpecRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__1"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__1__Impl"
    // InternalBasicsParser.g:6581:1: rule__ArrayTopicSpecRef__Group__1__Impl : ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) ) ;
    public final void rule__ArrayTopicSpecRef__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6585:1: ( ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) ) )
            // InternalBasicsParser.g:6586:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) )
            {
            // InternalBasicsParser.g:6586:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) )
            // InternalBasicsParser.g:6587:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_1());
            // InternalBasicsParser.g:6588:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 )
            // InternalBasicsParser.g:6588:3: rule__ArrayTopicSpecRef__TopicSpecAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__TopicSpecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__1__Impl"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__2"
    // InternalBasicsParser.g:6596:1: rule__ArrayTopicSpecRef__Group__2 : rule__ArrayTopicSpecRef__Group__2__Impl ;
    public final void rule__ArrayTopicSpecRef__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6600:1: ( rule__ArrayTopicSpecRef__Group__2__Impl )
            // InternalBasicsParser.g:6601:2: rule__ArrayTopicSpecRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__2"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__2__Impl"
    // InternalBasicsParser.g:6607:1: rule__ArrayTopicSpecRef__Group__2__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayTopicSpecRef__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6611:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:6612:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:6612:1: ( RightSquareBracket )
            // InternalBasicsParser.g:6613:2: RightSquareBracket
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getRightSquareBracketKeyword_2());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getArrayTopicSpecRefAccess().getRightSquareBracketKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_1"
    // InternalBasicsParser.g:6623:1: rule__GlobalNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6627:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6628:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6628:2: ( ruleGraphName )
            // InternalBasicsParser.g:6629:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_2_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_2_1"
    // InternalBasicsParser.g:6638:1: rule__GlobalNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6642:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6643:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6643:2: ( ruleGraphName )
            // InternalBasicsParser.g:6644:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_2_2_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_2_1"
    // InternalBasicsParser.g:6653:1: rule__RelativeNamespace_Impl__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6657:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6658:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6658:2: ( ruleGraphName )
            // InternalBasicsParser.g:6659:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_2_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1"
    // InternalBasicsParser.g:6668:1: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6672:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6673:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6673:2: ( ruleGraphName )
            // InternalBasicsParser.g:6674:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_2_1"
    // InternalBasicsParser.g:6683:1: rule__PrivateNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6687:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6688:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6688:2: ( ruleGraphName )
            // InternalBasicsParser.g:6689:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_2_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_2_2_1"
    // InternalBasicsParser.g:6698:1: rule__PrivateNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6702:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6703:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6703:2: ( ruleGraphName )
            // InternalBasicsParser.g:6704:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_2_2_1"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_3"
    // InternalBasicsParser.g:6713:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6717:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:6718:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:6718:2: ( ruleParameterType )
            // InternalBasicsParser.g:6719:3: ruleParameterType
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__SequenceAssignment_3"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_4_1"
    // InternalBasicsParser.g:6728:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6732:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:6733:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:6733:2: ( ruleParameterType )
            // InternalBasicsParser.g:6734:3: ruleParameterType
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__SequenceAssignment_4_1"


    // $ANTLR start "rule__ParameterStructType__ParameterstructypetmemberAssignment_3"
    // InternalBasicsParser.g:6743:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6747:1: ( ( ruleParameterStructTypeMember ) )
            // InternalBasicsParser.g:6748:2: ( ruleParameterStructTypeMember )
            {
            // InternalBasicsParser.g:6748:2: ( ruleParameterStructTypeMember )
            // InternalBasicsParser.g:6749:3: ruleParameterStructTypeMember
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            pushFollow(FOLLOW_2);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__ParameterstructypetmemberAssignment_3"


    // $ANTLR start "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1"
    // InternalBasicsParser.g:6758:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6762:1: ( ( ruleParameterStructTypeMember ) )
            // InternalBasicsParser.g:6763:2: ( ruleParameterStructTypeMember )
            {
            // InternalBasicsParser.g:6763:2: ( ruleParameterStructTypeMember )
            // InternalBasicsParser.g:6764:3: ruleParameterStructTypeMember
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1"


    // $ANTLR start "rule__ParameterIntegerType__DefaultAssignment_2_1"
    // InternalBasicsParser.g:6773:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6777:1: ( ( ruleParameterInteger ) )
            // InternalBasicsParser.g:6778:2: ( ruleParameterInteger )
            {
            // InternalBasicsParser.g:6778:2: ( ruleParameterInteger )
            // InternalBasicsParser.g:6779:3: ruleParameterInteger
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterStringType__DefaultAssignment_2_1"
    // InternalBasicsParser.g:6788:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6792:1: ( ( ruleParameterString ) )
            // InternalBasicsParser.g:6793:2: ( ruleParameterString )
            {
            // InternalBasicsParser.g:6793:2: ( ruleParameterString )
            // InternalBasicsParser.g:6794:3: ruleParameterString
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterDoubleType__DefaultAssignment_2_1"
    // InternalBasicsParser.g:6803:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6807:1: ( ( ruleParameterDouble ) )
            // InternalBasicsParser.g:6808:2: ( ruleParameterDouble )
            {
            // InternalBasicsParser.g:6808:2: ( ruleParameterDouble )
            // InternalBasicsParser.g:6809:3: ruleParameterDouble
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterBooleanType__DefaultAssignment_2_1"
    // InternalBasicsParser.g:6818:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6822:1: ( ( ruleParameterBoolean ) )
            // InternalBasicsParser.g:6823:2: ( ruleParameterBoolean )
            {
            // InternalBasicsParser.g:6823:2: ( ruleParameterBoolean )
            // InternalBasicsParser.g:6824:3: ruleParameterBoolean
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterBase64Type__DefaultAssignment_2_1"
    // InternalBasicsParser.g:6833:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6837:1: ( ( ruleParameterBase64 ) )
            // InternalBasicsParser.g:6838:2: ( ruleParameterBase64 )
            {
            // InternalBasicsParser.g:6838:2: ( ruleParameterBase64 )
            // InternalBasicsParser.g:6839:3: ruleParameterBase64
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterArrayType__TypeAssignment_2"
    // InternalBasicsParser.g:6848:1: rule__ParameterArrayType__TypeAssignment_2 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6852:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:6853:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:6853:2: ( ruleParameterType )
            // InternalBasicsParser.g:6854:3: ruleParameterType
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__TypeAssignment_2"


    // $ANTLR start "rule__ParameterArrayType__DefaultAssignment_3_1"
    // InternalBasicsParser.g:6863:1: rule__ParameterArrayType__DefaultAssignment_3_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6867:1: ( ( ruleParameterList ) )
            // InternalBasicsParser.g:6868:2: ( ruleParameterList )
            {
            // InternalBasicsParser.g:6868:2: ( ruleParameterList )
            // InternalBasicsParser.g:6869:3: ruleParameterList
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__DefaultAssignment_3_1"


    // $ANTLR start "rule__ParameterList__ValueAssignment_2"
    // InternalBasicsParser.g:6878:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6882:1: ( ( ruleParameterValue ) )
            // InternalBasicsParser.g:6883:2: ( ruleParameterValue )
            {
            // InternalBasicsParser.g:6883:2: ( ruleParameterValue )
            // InternalBasicsParser.g:6884:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_2"


    // $ANTLR start "rule__ParameterList__ValueAssignment_3_1"
    // InternalBasicsParser.g:6893:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6897:1: ( ( ruleParameterValue ) )
            // InternalBasicsParser.g:6898:2: ( ruleParameterValue )
            {
            // InternalBasicsParser.g:6898:2: ( ruleParameterValue )
            // InternalBasicsParser.g:6899:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_3_1"


    // $ANTLR start "rule__ParameterAny__ValueAssignment_2_1"
    // InternalBasicsParser.g:6908:1: rule__ParameterAny__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6912:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:6913:2: ( ruleEString )
            {
            // InternalBasicsParser.g:6913:2: ( ruleEString )
            // InternalBasicsParser.g:6914:3: ruleEString
            {
             before(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__ValueAssignment_2_1"


    // $ANTLR start "rule__ParameterString__ValueAssignment"
    // InternalBasicsParser.g:6923:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6927:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:6928:2: ( ruleEString )
            {
            // InternalBasicsParser.g:6928:2: ( ruleEString )
            // InternalBasicsParser.g:6929:3: ruleEString
            {
             before(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__ValueAssignment"


    // $ANTLR start "rule__ParameterBase64__ValueAssignment"
    // InternalBasicsParser.g:6938:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6942:1: ( ( ruleBase64Binary ) )
            // InternalBasicsParser.g:6943:2: ( ruleBase64Binary )
            {
            // InternalBasicsParser.g:6943:2: ( ruleBase64Binary )
            // InternalBasicsParser.g:6944:3: ruleBase64Binary
            {
             before(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64__ValueAssignment"


    // $ANTLR start "rule__ParameterInteger__ValueAssignment"
    // InternalBasicsParser.g:6953:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6957:1: ( ( ruleInteger0 ) )
            // InternalBasicsParser.g:6958:2: ( ruleInteger0 )
            {
            // InternalBasicsParser.g:6958:2: ( ruleInteger0 )
            // InternalBasicsParser.g:6959:3: ruleInteger0
            {
             before(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInteger__ValueAssignment"


    // $ANTLR start "rule__ParameterDouble__ValueAssignment"
    // InternalBasicsParser.g:6968:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6972:1: ( ( ruleDouble0 ) )
            // InternalBasicsParser.g:6973:2: ( ruleDouble0 )
            {
            // InternalBasicsParser.g:6973:2: ( ruleDouble0 )
            // InternalBasicsParser.g:6974:3: ruleDouble0
            {
             before(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDouble__ValueAssignment"


    // $ANTLR start "rule__ParameterBoolean__ValueAssignment"
    // InternalBasicsParser.g:6983:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:6987:1: ( ( ruleboolean0 ) )
            // InternalBasicsParser.g:6988:2: ( ruleboolean0 )
            {
            // InternalBasicsParser.g:6988:2: ( ruleboolean0 )
            // InternalBasicsParser.g:6989:3: ruleboolean0
            {
             before(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBoolean__ValueAssignment"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_1"
    // InternalBasicsParser.g:6998:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7002:1: ( ( ruleParameterStructMember ) )
            // InternalBasicsParser.g:7003:2: ( ruleParameterStructMember )
            {
            // InternalBasicsParser.g:7003:2: ( ruleParameterStructMember )
            // InternalBasicsParser.g:7004:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_1"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_2_2"
    // InternalBasicsParser.g:7013:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7017:1: ( ( ruleParameterStructMember ) )
            // InternalBasicsParser.g:7018:2: ( ruleParameterStructMember )
            {
            // InternalBasicsParser.g:7018:2: ( ruleParameterStructMember )
            // InternalBasicsParser.g:7019:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_2_2"


    // $ANTLR start "rule__ParameterDate__ValueAssignment"
    // InternalBasicsParser.g:7028:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7032:1: ( ( ruleDateTime0 ) )
            // InternalBasicsParser.g:7033:2: ( ruleDateTime0 )
            {
            // InternalBasicsParser.g:7033:2: ( ruleDateTime0 )
            // InternalBasicsParser.g:7034:3: ruleDateTime0
            {
             before(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleDateTime0();

            state._fsp--;

             after(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDate__ValueAssignment"


    // $ANTLR start "rule__ParameterStructMember__NameAssignment_0"
    // InternalBasicsParser.g:7043:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7047:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:7048:2: ( ruleEString )
            {
            // InternalBasicsParser.g:7048:2: ( ruleEString )
            // InternalBasicsParser.g:7049:3: ruleEString
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructMember__ValueAssignment_3"
    // InternalBasicsParser.g:7058:1: rule__ParameterStructMember__ValueAssignment_3 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7062:1: ( ( ruleParameterValue ) )
            // InternalBasicsParser.g:7063:2: ( ruleParameterValue )
            {
            // InternalBasicsParser.g:7063:2: ( ruleParameterValue )
            // InternalBasicsParser.g:7064:3: ruleParameterValue
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__ValueAssignment_3"


    // $ANTLR start "rule__ParameterStructTypeMember__NameAssignment_0"
    // InternalBasicsParser.g:7073:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7077:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:7078:2: ( ruleEString )
            {
            // InternalBasicsParser.g:7078:2: ( ruleEString )
            // InternalBasicsParser.g:7079:3: ruleEString
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructTypeMember__TypeAssignment_1"
    // InternalBasicsParser.g:7088:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7092:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:7093:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:7093:2: ( ruleParameterType )
            // InternalBasicsParser.g:7094:3: ruleParameterType
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__TypeAssignment_1"


    // $ANTLR start "rule__TopicSpecRef__TopicSpecAssignment"
    // InternalBasicsParser.g:7103:1: rule__TopicSpecRef__TopicSpecAssignment : ( ( ruleEString ) ) ;
    public final void rule__TopicSpecRef__TopicSpecAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7107:1: ( ( ( ruleEString ) ) )
            // InternalBasicsParser.g:7108:2: ( ( ruleEString ) )
            {
            // InternalBasicsParser.g:7108:2: ( ( ruleEString ) )
            // InternalBasicsParser.g:7109:3: ( ruleEString )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0());
            // InternalBasicsParser.g:7110:3: ( ruleEString )
            // InternalBasicsParser.g:7111:4: ruleEString
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_1());

            }

             after(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicSpecRef__TopicSpecAssignment"


    // $ANTLR start "rule__ArrayTopicSpecRef__TopicSpecAssignment_1"
    // InternalBasicsParser.g:7122:1: rule__ArrayTopicSpecRef__TopicSpecAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ArrayTopicSpecRef__TopicSpecAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalBasicsParser.g:7126:1: ( ( ( ruleEString ) ) )
            // InternalBasicsParser.g:7127:2: ( ( ruleEString ) )
            {
            // InternalBasicsParser.g:7127:2: ( ( ruleEString ) )
            // InternalBasicsParser.g:7128:3: ( ruleEString )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_1_0());
            // InternalBasicsParser.g:7129:3: ( ruleEString )
            // InternalBasicsParser.g:7130:4: ruleEString
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__TopicSpecAssignment_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\76\5\uffff\1\76\1\uffff\2\76\1\uffff";
    static final String dfa_4s = "\1\123\5\uffff\1\117\1\uffff\2\102\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\2\uffff\1\6\1\7\1\uffff\1\2\1\5\1\3\1\4\6\uffff\2\1\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\2\12\1\uffff\4\12\6\uffff\1\11\1\10",
            "",
            "\1\12\1\uffff\1\7\1\uffff\1\12",
            "\1\12\1\uffff\1\7\1\uffff\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1826:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00080003600C0000L,0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008000L,0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C0F2L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000080000000L});

}
