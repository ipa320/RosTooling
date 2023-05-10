package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal;
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
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "Connections", "Interfaces", "Parameters", "Processes", "GraphName", "Float32_1", "Float64_1", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Default", "Duration", "Feedback", "FromPub", "FromSub", "Threads", "Boolean", "Integer", "Int16_1", "Int32_1", "Int64_1", "Uint8_1", "Float32", "Float64", "FromAC", "FromAS", "FromSC", "FromSS", "Message", "Service", "Array", "Base64", "Double", "Header", "String", "Struct", "Bool_1", "Byte_1", "Int8_1", "Action", "Nodes", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "From", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=8;
    public static final int Float32_1=13;
    public static final int Node=70;
    public static final int RULE_DATE_TIME=90;
    public static final int Uint64_1=18;
    public static final int String=43;
    public static final int Processes=11;
    public static final int Int16=57;
    public static final int Float32=31;
    public static final int Goal=67;
    public static final int Bool=65;
    public static final int FromPub=22;
    public static final int Uint16=52;
    public static final int Boolean=25;
    public static final int Uint8=61;
    public static final int Parameters=10;
    public static final int RULE_ID=91;
    public static final int RULE_DIGIT=80;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=27;
    public static final int Header=42;
    public static final int RULE_INT=93;
    public static final int Byte=66;
    public static final int RULE_ML_COMMENT=100;
    public static final int LeftSquareBracket=78;
    public static final int Base64=40;
    public static final int FromSS=36;
    public static final int Comma=75;
    public static final int HyphenMinus=76;
    public static final int RULE_MESSAGE_ASIGMENT=94;
    public static final int Int32=58;
    public static final int RULE_DECINT=83;
    public static final int Uint32=53;
    public static final int RULE_HOUR=88;
    public static final int Int8=68;
    public static final int Default=19;
    public static final int Int8_1=47;
    public static final int Uint16_1=16;
    public static final int Type=72;
    public static final int Float64=32;
    public static final int Int32_1=28;
    public static final int FromSC=35;
    public static final int RULE_BINARY=81;
    public static final int String_1=51;
    public static final int String_2=15;
    public static final int FromAC=33;
    public static final int RULE_DAY=85;
    public static final int RULE_BEGIN=95;
    public static final int RULE_BOOLEAN=82;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=87;
    public static final int Result=50;
    public static final int Name=69;
    public static final int RULE_MIN_SEC=89;
    public static final int FromAS=34;
    public static final int ParameterAny=7;
    public static final int List=64;
    public static final int RightSquareBracket=79;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=46;
    public static final int Float64_1=14;
    public static final int Uint32_1=17;
    public static final int Duration=20;
    public static final int Double=41;
    public static final int Type_1=60;
    public static final int Value=62;
    public static final int Uint64=54;
    public static final int Action=48;
    public static final int RULE_END=96;
    public static final int Message=37;
    public static final int Value_1=55;
    public static final int Time=71;
    public static final int RULE_STRING=92;
    public static final int Bool_1=45;
    public static final int Any=73;
    public static final int Struct=44;
    public static final int RULE_SL_COMMENT=97;
    public static final int Uint8_1=30;
    public static final int RULE_DOUBLE=84;
    public static final int Feedback=21;
    public static final int RULE_ROS_CONVENTION_A=98;
    public static final int RULE_ROS_CONVENTION_PARAM=99;
    public static final int Colon=77;
    public static final int EOF=-1;
    public static final int FromSub=23;
    public static final int Ns=74;
    public static final int RULE_WS=101;
    public static final int Int64_1=29;
    public static final int Service=38;
    public static final int From=56;
    public static final int RULE_ANY_OTHER=102;
    public static final int Nodes=49;
    public static final int Date=63;
    public static final int Interfaces=9;
    public static final int Threads=24;
    public static final int Integer=26;
    public static final int Array=39;
    public static final int Int64=59;
    public static final int RULE_MONTH=86;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystemParser.g"; }


        private RosSystemGrammarAccess grammarAccess;
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
            tokenNameToValue.put("From", "'from:'");
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
            tokenNameToValue.put("Nodes", "'nodes:'");
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
            tokenNameToValue.put("FromAC", "'fromAC:'");
            tokenNameToValue.put("FromAS", "'fromAS:'");
            tokenNameToValue.put("FromSC", "'fromSC:'");
            tokenNameToValue.put("FromSS", "'fromSS:'");
            tokenNameToValue.put("Message", "'message'");
            tokenNameToValue.put("Service", "'service'");
            tokenNameToValue.put("String_2", "'[string]'");
            tokenNameToValue.put("Uint16_1", "'[uint16]'");
            tokenNameToValue.put("Uint32_1", "'[uint32]'");
            tokenNameToValue.put("Uint64_1", "'[uint64]'");
            tokenNameToValue.put("Default", "'default:'");
            tokenNameToValue.put("Duration", "'duration'");
            tokenNameToValue.put("Feedback", "'feedback'");
            tokenNameToValue.put("FromPub", "'fromPub:'");
            tokenNameToValue.put("FromSub", "'fromSub:'");
            tokenNameToValue.put("Threads", "'threads:'");
            tokenNameToValue.put("GraphName", "'GraphName'");
            tokenNameToValue.put("Float32_1", "'[float32]'");
            tokenNameToValue.put("Float64_1", "'[float64]'");
            tokenNameToValue.put("Processes", "'processes:'");
            tokenNameToValue.put("Interfaces", "'interfaces:'");
            tokenNameToValue.put("Parameters", "'parameters:'");
            tokenNameToValue.put("ParameterAny", "'ParameterAny'");
            tokenNameToValue.put("Connections", "'connections:'");
            tokenNameToValue.put("GlobalNamespace", "'GlobalNamespace'");
            tokenNameToValue.put("PrivateNamespace", "'PrivateNamespace'");
            tokenNameToValue.put("RelativeNamespace", "'RelativeNamespace'");
        }

        public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystem"
    // InternalRosSystemParser.g:131:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:132:1: ( ruleSystem EOF )
            // InternalRosSystemParser.g:133:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule());
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule());
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalRosSystemParser.g:140:1: ruleSystem : ( ruleRosSystem ) ;
    public final void ruleSystem() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:144:2: ( ( ruleRosSystem ) )
            // InternalRosSystemParser.g:145:2: ( ruleRosSystem )
            {
            // InternalRosSystemParser.g:145:2: ( ruleRosSystem )
            // InternalRosSystemParser.g:146:3: ruleRosSystem
            {
             before(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());
            pushFollow(FOLLOW_2);
            ruleRosSystem();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystemParser.g:156:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:157:1: ( ruleRosSystem EOF )
            // InternalRosSystemParser.g:158:1: ruleRosSystem EOF
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
    // InternalRosSystemParser.g:165:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:169:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystemParser.g:170:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystemParser.g:170:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystemParser.g:171:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup());
            // InternalRosSystemParser.g:172:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystemParser.g:172:4: rule__RosSystem__Group__0
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


    // $ANTLR start "entryRuleProcess"
    // InternalRosSystemParser.g:181:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:182:1: ( ruleProcess EOF )
            // InternalRosSystemParser.g:183:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule());
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule());
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalRosSystemParser.g:190:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:194:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalRosSystemParser.g:195:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalRosSystemParser.g:195:2: ( ( rule__Process__Group__0 ) )
            // InternalRosSystemParser.g:196:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup());
            // InternalRosSystemParser.g:197:3: ( rule__Process__Group__0 )
            // InternalRosSystemParser.g:197:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleComponentRef"
    // InternalRosSystemParser.g:206:1: entryRuleComponentRef : ruleComponentRef EOF ;
    public final void entryRuleComponentRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:207:1: ( ruleComponentRef EOF )
            // InternalRosSystemParser.g:208:1: ruleComponentRef EOF
            {
             before(grammarAccess.getComponentRefRule());
            pushFollow(FOLLOW_1);
            ruleComponentRef();

            state._fsp--;

             after(grammarAccess.getComponentRefRule());
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
    // $ANTLR end "entryRuleComponentRef"


    // $ANTLR start "ruleComponentRef"
    // InternalRosSystemParser.g:215:1: ruleComponentRef : ( ( rule__ComponentRef__Group__0 ) ) ;
    public final void ruleComponentRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:219:2: ( ( ( rule__ComponentRef__Group__0 ) ) )
            // InternalRosSystemParser.g:220:2: ( ( rule__ComponentRef__Group__0 ) )
            {
            // InternalRosSystemParser.g:220:2: ( ( rule__ComponentRef__Group__0 ) )
            // InternalRosSystemParser.g:221:3: ( rule__ComponentRef__Group__0 )
            {
             before(grammarAccess.getComponentRefAccess().getGroup());
            // InternalRosSystemParser.g:222:3: ( rule__ComponentRef__Group__0 )
            // InternalRosSystemParser.g:222:4: rule__ComponentRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentRefAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentRef"


    // $ANTLR start "entryRuleRosNode"
    // InternalRosSystemParser.g:231:1: entryRuleRosNode : ruleRosNode EOF ;
    public final void entryRuleRosNode() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:232:1: ( ruleRosNode EOF )
            // InternalRosSystemParser.g:233:1: ruleRosNode EOF
            {
             before(grammarAccess.getRosNodeRule());
            pushFollow(FOLLOW_1);
            ruleRosNode();

            state._fsp--;

             after(grammarAccess.getRosNodeRule());
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
    // $ANTLR end "entryRuleRosNode"


    // $ANTLR start "ruleRosNode"
    // InternalRosSystemParser.g:240:1: ruleRosNode : ( ( rule__RosNode__Group__0 ) ) ;
    public final void ruleRosNode() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:244:2: ( ( ( rule__RosNode__Group__0 ) ) )
            // InternalRosSystemParser.g:245:2: ( ( rule__RosNode__Group__0 ) )
            {
            // InternalRosSystemParser.g:245:2: ( ( rule__RosNode__Group__0 ) )
            // InternalRosSystemParser.g:246:3: ( rule__RosNode__Group__0 )
            {
             before(grammarAccess.getRosNodeAccess().getGroup());
            // InternalRosSystemParser.g:247:3: ( rule__RosNode__Group__0 )
            // InternalRosSystemParser.g:247:4: rule__RosNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosNode"


    // $ANTLR start "entryRuleRosInterface"
    // InternalRosSystemParser.g:256:1: entryRuleRosInterface : ruleRosInterface EOF ;
    public final void entryRuleRosInterface() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:257:1: ( ruleRosInterface EOF )
            // InternalRosSystemParser.g:258:1: ruleRosInterface EOF
            {
             before(grammarAccess.getRosInterfaceRule());
            pushFollow(FOLLOW_1);
            ruleRosInterface();

            state._fsp--;

             after(grammarAccess.getRosInterfaceRule());
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
    // $ANTLR end "entryRuleRosInterface"


    // $ANTLR start "ruleRosInterface"
    // InternalRosSystemParser.g:265:1: ruleRosInterface : ( ( rule__RosInterface__Group__0 ) ) ;
    public final void ruleRosInterface() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:269:2: ( ( ( rule__RosInterface__Group__0 ) ) )
            // InternalRosSystemParser.g:270:2: ( ( rule__RosInterface__Group__0 ) )
            {
            // InternalRosSystemParser.g:270:2: ( ( rule__RosInterface__Group__0 ) )
            // InternalRosSystemParser.g:271:3: ( rule__RosInterface__Group__0 )
            {
             before(grammarAccess.getRosInterfaceAccess().getGroup());
            // InternalRosSystemParser.g:272:3: ( rule__RosInterface__Group__0 )
            // InternalRosSystemParser.g:272:4: rule__RosInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosInterface"


    // $ANTLR start "entryRuleInterfaceReference"
    // InternalRosSystemParser.g:281:1: entryRuleInterfaceReference : ruleInterfaceReference EOF ;
    public final void entryRuleInterfaceReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:282:1: ( ruleInterfaceReference EOF )
            // InternalRosSystemParser.g:283:1: ruleInterfaceReference EOF
            {
             before(grammarAccess.getInterfaceReferenceRule());
            pushFollow(FOLLOW_1);
            ruleInterfaceReference();

            state._fsp--;

             after(grammarAccess.getInterfaceReferenceRule());
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
    // $ANTLR end "entryRuleInterfaceReference"


    // $ANTLR start "ruleInterfaceReference"
    // InternalRosSystemParser.g:290:1: ruleInterfaceReference : ( ( rule__InterfaceReference__Alternatives ) ) ;
    public final void ruleInterfaceReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:294:2: ( ( ( rule__InterfaceReference__Alternatives ) ) )
            // InternalRosSystemParser.g:295:2: ( ( rule__InterfaceReference__Alternatives ) )
            {
            // InternalRosSystemParser.g:295:2: ( ( rule__InterfaceReference__Alternatives ) )
            // InternalRosSystemParser.g:296:3: ( rule__InterfaceReference__Alternatives )
            {
             before(grammarAccess.getInterfaceReferenceAccess().getAlternatives());
            // InternalRosSystemParser.g:297:3: ( rule__InterfaceReference__Alternatives )
            // InternalRosSystemParser.g:297:4: rule__InterfaceReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceReferenceAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceReference"


    // $ANTLR start "entryRuleInterfaceReference_Impl"
    // InternalRosSystemParser.g:306:1: entryRuleInterfaceReference_Impl : ruleInterfaceReference_Impl EOF ;
    public final void entryRuleInterfaceReference_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:307:1: ( ruleInterfaceReference_Impl EOF )
            // InternalRosSystemParser.g:308:1: ruleInterfaceReference_Impl EOF
            {
             before(grammarAccess.getInterfaceReference_ImplRule());
            pushFollow(FOLLOW_1);
            ruleInterfaceReference_Impl();

            state._fsp--;

             after(grammarAccess.getInterfaceReference_ImplRule());
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
    // $ANTLR end "entryRuleInterfaceReference_Impl"


    // $ANTLR start "ruleInterfaceReference_Impl"
    // InternalRosSystemParser.g:315:1: ruleInterfaceReference_Impl : ( () ) ;
    public final void ruleInterfaceReference_Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:319:2: ( ( () ) )
            // InternalRosSystemParser.g:320:2: ( () )
            {
            // InternalRosSystemParser.g:320:2: ( () )
            // InternalRosSystemParser.g:321:3: ()
            {
             before(grammarAccess.getInterfaceReference_ImplAccess().getInterfaceReferenceAction());
            // InternalRosSystemParser.g:322:3: ()
            // InternalRosSystemParser.g:322:4:
            {
            }

             after(grammarAccess.getInterfaceReference_ImplAccess().getInterfaceReferenceAction());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceReference_Impl"


    // $ANTLR start "entryRuleRosPublisherReference"
    // InternalRosSystemParser.g:331:1: entryRuleRosPublisherReference : ruleRosPublisherReference EOF ;
    public final void entryRuleRosPublisherReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:332:1: ( ruleRosPublisherReference EOF )
            // InternalRosSystemParser.g:333:1: ruleRosPublisherReference EOF
            {
             before(grammarAccess.getRosPublisherReferenceRule());
            pushFollow(FOLLOW_1);
            ruleRosPublisherReference();

            state._fsp--;

             after(grammarAccess.getRosPublisherReferenceRule());
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
    // $ANTLR end "entryRuleRosPublisherReference"


    // $ANTLR start "ruleRosPublisherReference"
    // InternalRosSystemParser.g:340:1: ruleRosPublisherReference : ( ( rule__RosPublisherReference__Group__0 ) ) ;
    public final void ruleRosPublisherReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:344:2: ( ( ( rule__RosPublisherReference__Group__0 ) ) )
            // InternalRosSystemParser.g:345:2: ( ( rule__RosPublisherReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:345:2: ( ( rule__RosPublisherReference__Group__0 ) )
            // InternalRosSystemParser.g:346:3: ( rule__RosPublisherReference__Group__0 )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getGroup());
            // InternalRosSystemParser.g:347:3: ( rule__RosPublisherReference__Group__0 )
            // InternalRosSystemParser.g:347:4: rule__RosPublisherReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherReferenceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosPublisherReference"


    // $ANTLR start "entryRuleRosSubscriberReference"
    // InternalRosSystemParser.g:356:1: entryRuleRosSubscriberReference : ruleRosSubscriberReference EOF ;
    public final void entryRuleRosSubscriberReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:357:1: ( ruleRosSubscriberReference EOF )
            // InternalRosSystemParser.g:358:1: ruleRosSubscriberReference EOF
            {
             before(grammarAccess.getRosSubscriberReferenceRule());
            pushFollow(FOLLOW_1);
            ruleRosSubscriberReference();

            state._fsp--;

             after(grammarAccess.getRosSubscriberReferenceRule());
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
    // $ANTLR end "entryRuleRosSubscriberReference"


    // $ANTLR start "ruleRosSubscriberReference"
    // InternalRosSystemParser.g:365:1: ruleRosSubscriberReference : ( ( rule__RosSubscriberReference__Group__0 ) ) ;
    public final void ruleRosSubscriberReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:369:2: ( ( ( rule__RosSubscriberReference__Group__0 ) ) )
            // InternalRosSystemParser.g:370:2: ( ( rule__RosSubscriberReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:370:2: ( ( rule__RosSubscriberReference__Group__0 ) )
            // InternalRosSystemParser.g:371:3: ( rule__RosSubscriberReference__Group__0 )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getGroup());
            // InternalRosSystemParser.g:372:3: ( rule__RosSubscriberReference__Group__0 )
            // InternalRosSystemParser.g:372:4: rule__RosSubscriberReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberReferenceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSubscriberReference"


    // $ANTLR start "entryRuleRosServiceServerReference"
    // InternalRosSystemParser.g:381:1: entryRuleRosServiceServerReference : ruleRosServiceServerReference EOF ;
    public final void entryRuleRosServiceServerReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:382:1: ( ruleRosServiceServerReference EOF )
            // InternalRosSystemParser.g:383:1: ruleRosServiceServerReference EOF
            {
             before(grammarAccess.getRosServiceServerReferenceRule());
            pushFollow(FOLLOW_1);
            ruleRosServiceServerReference();

            state._fsp--;

             after(grammarAccess.getRosServiceServerReferenceRule());
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
    // $ANTLR end "entryRuleRosServiceServerReference"


    // $ANTLR start "ruleRosServiceServerReference"
    // InternalRosSystemParser.g:390:1: ruleRosServiceServerReference : ( ( rule__RosServiceServerReference__Group__0 ) ) ;
    public final void ruleRosServiceServerReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:394:2: ( ( ( rule__RosServiceServerReference__Group__0 ) ) )
            // InternalRosSystemParser.g:395:2: ( ( rule__RosServiceServerReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:395:2: ( ( rule__RosServiceServerReference__Group__0 ) )
            // InternalRosSystemParser.g:396:3: ( rule__RosServiceServerReference__Group__0 )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getGroup());
            // InternalRosSystemParser.g:397:3: ( rule__RosServiceServerReference__Group__0 )
            // InternalRosSystemParser.g:397:4: rule__RosServiceServerReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerReferenceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServiceServerReference"


    // $ANTLR start "entryRuleRosServerClientReference"
    // InternalRosSystemParser.g:406:1: entryRuleRosServerClientReference : ruleRosServerClientReference EOF ;
    public final void entryRuleRosServerClientReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:407:1: ( ruleRosServerClientReference EOF )
            // InternalRosSystemParser.g:408:1: ruleRosServerClientReference EOF
            {
             before(grammarAccess.getRosServerClientReferenceRule());
            pushFollow(FOLLOW_1);
            ruleRosServerClientReference();

            state._fsp--;

             after(grammarAccess.getRosServerClientReferenceRule());
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
    // $ANTLR end "entryRuleRosServerClientReference"


    // $ANTLR start "ruleRosServerClientReference"
    // InternalRosSystemParser.g:415:1: ruleRosServerClientReference : ( ( rule__RosServerClientReference__Group__0 ) ) ;
    public final void ruleRosServerClientReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:419:2: ( ( ( rule__RosServerClientReference__Group__0 ) ) )
            // InternalRosSystemParser.g:420:2: ( ( rule__RosServerClientReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:420:2: ( ( rule__RosServerClientReference__Group__0 ) )
            // InternalRosSystemParser.g:421:3: ( rule__RosServerClientReference__Group__0 )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getGroup());
            // InternalRosSystemParser.g:422:3: ( rule__RosServerClientReference__Group__0 )
            // InternalRosSystemParser.g:422:4: rule__RosServerClientReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServerClientReferenceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServerClientReference"


    // $ANTLR start "entryRuleRosActionServerReference"
    // InternalRosSystemParser.g:431:1: entryRuleRosActionServerReference : ruleRosActionServerReference EOF ;
    public final void entryRuleRosActionServerReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:432:1: ( ruleRosActionServerReference EOF )
            // InternalRosSystemParser.g:433:1: ruleRosActionServerReference EOF
            {
             before(grammarAccess.getRosActionServerReferenceRule());
            pushFollow(FOLLOW_1);
            ruleRosActionServerReference();

            state._fsp--;

             after(grammarAccess.getRosActionServerReferenceRule());
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
    // $ANTLR end "entryRuleRosActionServerReference"


    // $ANTLR start "ruleRosActionServerReference"
    // InternalRosSystemParser.g:440:1: ruleRosActionServerReference : ( ( rule__RosActionServerReference__Group__0 ) ) ;
    public final void ruleRosActionServerReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:444:2: ( ( ( rule__RosActionServerReference__Group__0 ) ) )
            // InternalRosSystemParser.g:445:2: ( ( rule__RosActionServerReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:445:2: ( ( rule__RosActionServerReference__Group__0 ) )
            // InternalRosSystemParser.g:446:3: ( rule__RosActionServerReference__Group__0 )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getGroup());
            // InternalRosSystemParser.g:447:3: ( rule__RosActionServerReference__Group__0 )
            // InternalRosSystemParser.g:447:4: rule__RosActionServerReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerReferenceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionServerReference"


    // $ANTLR start "entryRuleRosActionClientReference"
    // InternalRosSystemParser.g:456:1: entryRuleRosActionClientReference : ruleRosActionClientReference EOF ;
    public final void entryRuleRosActionClientReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:457:1: ( ruleRosActionClientReference EOF )
            // InternalRosSystemParser.g:458:1: ruleRosActionClientReference EOF
            {
             before(grammarAccess.getRosActionClientReferenceRule());
            pushFollow(FOLLOW_1);
            ruleRosActionClientReference();

            state._fsp--;

             after(grammarAccess.getRosActionClientReferenceRule());
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
    // $ANTLR end "entryRuleRosActionClientReference"


    // $ANTLR start "ruleRosActionClientReference"
    // InternalRosSystemParser.g:465:1: ruleRosActionClientReference : ( ( rule__RosActionClientReference__Group__0 ) ) ;
    public final void ruleRosActionClientReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:469:2: ( ( ( rule__RosActionClientReference__Group__0 ) ) )
            // InternalRosSystemParser.g:470:2: ( ( rule__RosActionClientReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:470:2: ( ( rule__RosActionClientReference__Group__0 ) )
            // InternalRosSystemParser.g:471:3: ( rule__RosActionClientReference__Group__0 )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getGroup());
            // InternalRosSystemParser.g:472:3: ( rule__RosActionClientReference__Group__0 )
            // InternalRosSystemParser.g:472:4: rule__RosActionClientReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientReferenceAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionClientReference"


    // $ANTLR start "entryRuleRosParameter"
    // InternalRosSystemParser.g:481:1: entryRuleRosParameter : ruleRosParameter EOF ;
    public final void entryRuleRosParameter() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:482:1: ( ruleRosParameter EOF )
            // InternalRosSystemParser.g:483:1: ruleRosParameter EOF
            {
             before(grammarAccess.getRosParameterRule());
            pushFollow(FOLLOW_1);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosParameterRule());
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
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalRosSystemParser.g:490:1: ruleRosParameter : ( ( rule__RosParameter__Group__0 ) ) ;
    public final void ruleRosParameter() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:494:2: ( ( ( rule__RosParameter__Group__0 ) ) )
            // InternalRosSystemParser.g:495:2: ( ( rule__RosParameter__Group__0 ) )
            {
            // InternalRosSystemParser.g:495:2: ( ( rule__RosParameter__Group__0 ) )
            // InternalRosSystemParser.g:496:3: ( rule__RosParameter__Group__0 )
            {
             before(grammarAccess.getRosParameterAccess().getGroup());
            // InternalRosSystemParser.g:497:3: ( rule__RosParameter__Group__0 )
            // InternalRosSystemParser.g:497:4: rule__RosParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosParameter"


    // $ANTLR start "entryRuleRosConnection"
    // InternalRosSystemParser.g:506:1: entryRuleRosConnection : ruleRosConnection EOF ;
    public final void entryRuleRosConnection() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:507:1: ( ruleRosConnection EOF )
            // InternalRosSystemParser.g:508:1: ruleRosConnection EOF
            {
             before(grammarAccess.getRosConnectionRule());
            pushFollow(FOLLOW_1);
            ruleRosConnection();

            state._fsp--;

             after(grammarAccess.getRosConnectionRule());
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
    // $ANTLR end "entryRuleRosConnection"


    // $ANTLR start "ruleRosConnection"
    // InternalRosSystemParser.g:515:1: ruleRosConnection : ( ( rule__RosConnection__Group__0 ) ) ;
    public final void ruleRosConnection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:519:2: ( ( ( rule__RosConnection__Group__0 ) ) )
            // InternalRosSystemParser.g:520:2: ( ( rule__RosConnection__Group__0 ) )
            {
            // InternalRosSystemParser.g:520:2: ( ( rule__RosConnection__Group__0 ) )
            // InternalRosSystemParser.g:521:3: ( rule__RosConnection__Group__0 )
            {
             before(grammarAccess.getRosConnectionAccess().getGroup());
            // InternalRosSystemParser.g:522:3: ( rule__RosConnection__Group__0 )
            // InternalRosSystemParser.g:522:4: rule__RosConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosConnectionAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosConnection"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystemParser.g:531:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:532:1: ( ruleNamespace EOF )
            // InternalRosSystemParser.g:533:1: ruleNamespace EOF
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
    // InternalRosSystemParser.g:540:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:544:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalRosSystemParser.g:545:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalRosSystemParser.g:545:2: ( ( rule__Namespace__Alternatives ) )
            // InternalRosSystemParser.g:546:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives());
            // InternalRosSystemParser.g:547:3: ( rule__Namespace__Alternatives )
            // InternalRosSystemParser.g:547:4: rule__Namespace__Alternatives
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
    // InternalRosSystemParser.g:556:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:557:1: ( ruleGraphName EOF )
            // InternalRosSystemParser.g:558:1: ruleGraphName EOF
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
    // InternalRosSystemParser.g:565:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:569:2: ( ( GraphName ) )
            // InternalRosSystemParser.g:570:2: ( GraphName )
            {
            // InternalRosSystemParser.g:570:2: ( GraphName )
            // InternalRosSystemParser.g:571:3: GraphName
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
    // InternalRosSystemParser.g:581:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:582:1: ( ruleGlobalNamespace EOF )
            // InternalRosSystemParser.g:583:1: ruleGlobalNamespace EOF
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
    // InternalRosSystemParser.g:590:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:594:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:595:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:595:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalRosSystemParser.g:596:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup());
            // InternalRosSystemParser.g:597:3: ( rule__GlobalNamespace__Group__0 )
            // InternalRosSystemParser.g:597:4: rule__GlobalNamespace__Group__0
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
    // InternalRosSystemParser.g:606:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:607:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalRosSystemParser.g:608:1: ruleRelativeNamespace_Impl EOF
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
    // InternalRosSystemParser.g:615:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:619:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalRosSystemParser.g:620:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalRosSystemParser.g:620:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalRosSystemParser.g:621:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup());
            // InternalRosSystemParser.g:622:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalRosSystemParser.g:622:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalRosSystemParser.g:631:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:632:1: ( rulePrivateNamespace EOF )
            // InternalRosSystemParser.g:633:1: rulePrivateNamespace EOF
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
    // InternalRosSystemParser.g:640:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:644:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:645:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:645:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalRosSystemParser.g:646:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup());
            // InternalRosSystemParser.g:647:3: ( rule__PrivateNamespace__Group__0 )
            // InternalRosSystemParser.g:647:4: rule__PrivateNamespace__Group__0
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
    // InternalRosSystemParser.g:656:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:657:1: ( ruleParameterType EOF )
            // InternalRosSystemParser.g:658:1: ruleParameterType EOF
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
    // InternalRosSystemParser.g:665:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:669:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalRosSystemParser.g:670:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalRosSystemParser.g:670:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalRosSystemParser.g:671:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives());
            // InternalRosSystemParser.g:672:3: ( rule__ParameterType__Alternatives )
            // InternalRosSystemParser.g:672:4: rule__ParameterType__Alternatives
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
    // InternalRosSystemParser.g:681:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:682:1: ( ruleParameterValue EOF )
            // InternalRosSystemParser.g:683:1: ruleParameterValue EOF
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
    // InternalRosSystemParser.g:690:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:694:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalRosSystemParser.g:695:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalRosSystemParser.g:695:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalRosSystemParser.g:696:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives());
            // InternalRosSystemParser.g:697:3: ( rule__ParameterValue__Alternatives )
            // InternalRosSystemParser.g:697:4: rule__ParameterValue__Alternatives
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
    // InternalRosSystemParser.g:706:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:707:1: ( ruleParameterListType EOF )
            // InternalRosSystemParser.g:708:1: ruleParameterListType EOF
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
    // InternalRosSystemParser.g:715:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:719:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalRosSystemParser.g:720:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalRosSystemParser.g:720:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalRosSystemParser.g:721:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup());
            // InternalRosSystemParser.g:722:3: ( rule__ParameterListType__Group__0 )
            // InternalRosSystemParser.g:722:4: rule__ParameterListType__Group__0
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
    // InternalRosSystemParser.g:731:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:732:1: ( ruleParameterStructType EOF )
            // InternalRosSystemParser.g:733:1: ruleParameterStructType EOF
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
    // InternalRosSystemParser.g:740:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:744:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalRosSystemParser.g:745:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalRosSystemParser.g:745:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalRosSystemParser.g:746:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup());
            // InternalRosSystemParser.g:747:3: ( rule__ParameterStructType__Group__0 )
            // InternalRosSystemParser.g:747:4: rule__ParameterStructType__Group__0
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
    // InternalRosSystemParser.g:756:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:757:1: ( ruleParameterIntegerType EOF )
            // InternalRosSystemParser.g:758:1: ruleParameterIntegerType EOF
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
    // InternalRosSystemParser.g:765:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:769:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalRosSystemParser.g:770:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalRosSystemParser.g:770:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalRosSystemParser.g:771:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup());
            // InternalRosSystemParser.g:772:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalRosSystemParser.g:772:4: rule__ParameterIntegerType__Group__0
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
    // InternalRosSystemParser.g:781:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:782:1: ( ruleParameterStringType EOF )
            // InternalRosSystemParser.g:783:1: ruleParameterStringType EOF
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
    // InternalRosSystemParser.g:790:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:794:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalRosSystemParser.g:795:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalRosSystemParser.g:795:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalRosSystemParser.g:796:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup());
            // InternalRosSystemParser.g:797:3: ( rule__ParameterStringType__Group__0 )
            // InternalRosSystemParser.g:797:4: rule__ParameterStringType__Group__0
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
    // InternalRosSystemParser.g:806:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:807:1: ( ruleParameterDoubleType EOF )
            // InternalRosSystemParser.g:808:1: ruleParameterDoubleType EOF
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
    // InternalRosSystemParser.g:815:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:819:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalRosSystemParser.g:820:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalRosSystemParser.g:820:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalRosSystemParser.g:821:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup());
            // InternalRosSystemParser.g:822:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalRosSystemParser.g:822:4: rule__ParameterDoubleType__Group__0
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
    // InternalRosSystemParser.g:831:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:832:1: ( ruleParameterBooleanType EOF )
            // InternalRosSystemParser.g:833:1: ruleParameterBooleanType EOF
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
    // InternalRosSystemParser.g:840:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:844:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalRosSystemParser.g:845:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalRosSystemParser.g:845:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalRosSystemParser.g:846:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup());
            // InternalRosSystemParser.g:847:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalRosSystemParser.g:847:4: rule__ParameterBooleanType__Group__0
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
    // InternalRosSystemParser.g:856:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:857:1: ( ruleParameterBase64Type EOF )
            // InternalRosSystemParser.g:858:1: ruleParameterBase64Type EOF
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
    // InternalRosSystemParser.g:865:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:869:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalRosSystemParser.g:870:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalRosSystemParser.g:870:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalRosSystemParser.g:871:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup());
            // InternalRosSystemParser.g:872:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalRosSystemParser.g:872:4: rule__ParameterBase64Type__Group__0
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
    // InternalRosSystemParser.g:881:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:882:1: ( ruleParameterArrayType EOF )
            // InternalRosSystemParser.g:883:1: ruleParameterArrayType EOF
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
    // InternalRosSystemParser.g:890:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:894:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalRosSystemParser.g:895:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalRosSystemParser.g:895:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalRosSystemParser.g:896:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup());
            // InternalRosSystemParser.g:897:3: ( rule__ParameterArrayType__Group__0 )
            // InternalRosSystemParser.g:897:4: rule__ParameterArrayType__Group__0
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
    // InternalRosSystemParser.g:906:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:907:1: ( ruleParameterList EOF )
            // InternalRosSystemParser.g:908:1: ruleParameterList EOF
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
    // InternalRosSystemParser.g:915:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:919:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalRosSystemParser.g:920:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalRosSystemParser.g:920:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalRosSystemParser.g:921:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup());
            // InternalRosSystemParser.g:922:3: ( rule__ParameterList__Group__0 )
            // InternalRosSystemParser.g:922:4: rule__ParameterList__Group__0
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
    // InternalRosSystemParser.g:931:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:932:1: ( ruleParameterAny EOF )
            // InternalRosSystemParser.g:933:1: ruleParameterAny EOF
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
    // InternalRosSystemParser.g:940:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:944:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalRosSystemParser.g:945:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalRosSystemParser.g:945:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalRosSystemParser.g:946:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup());
            // InternalRosSystemParser.g:947:3: ( rule__ParameterAny__Group__0 )
            // InternalRosSystemParser.g:947:4: rule__ParameterAny__Group__0
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
    // InternalRosSystemParser.g:956:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:957:1: ( ruleParameterString EOF )
            // InternalRosSystemParser.g:958:1: ruleParameterString EOF
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
    // InternalRosSystemParser.g:965:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:969:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalRosSystemParser.g:970:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:970:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalRosSystemParser.g:971:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment());
            // InternalRosSystemParser.g:972:3: ( rule__ParameterString__ValueAssignment )
            // InternalRosSystemParser.g:972:4: rule__ParameterString__ValueAssignment
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
    // InternalRosSystemParser.g:981:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:982:1: ( ruleParameterBase64 EOF )
            // InternalRosSystemParser.g:983:1: ruleParameterBase64 EOF
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
    // InternalRosSystemParser.g:990:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:994:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalRosSystemParser.g:995:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:995:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalRosSystemParser.g:996:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment());
            // InternalRosSystemParser.g:997:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalRosSystemParser.g:997:4: rule__ParameterBase64__ValueAssignment
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
    // InternalRosSystemParser.g:1006:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1007:1: ( ruleParameterInteger EOF )
            // InternalRosSystemParser.g:1008:1: ruleParameterInteger EOF
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
    // InternalRosSystemParser.g:1015:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1019:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1020:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1020:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalRosSystemParser.g:1021:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment());
            // InternalRosSystemParser.g:1022:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalRosSystemParser.g:1022:4: rule__ParameterInteger__ValueAssignment
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
    // InternalRosSystemParser.g:1031:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1032:1: ( ruleParameterDouble EOF )
            // InternalRosSystemParser.g:1033:1: ruleParameterDouble EOF
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
    // InternalRosSystemParser.g:1040:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1044:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1045:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1045:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalRosSystemParser.g:1046:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment());
            // InternalRosSystemParser.g:1047:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalRosSystemParser.g:1047:4: rule__ParameterDouble__ValueAssignment
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
    // InternalRosSystemParser.g:1056:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1057:1: ( ruleParameterBoolean EOF )
            // InternalRosSystemParser.g:1058:1: ruleParameterBoolean EOF
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
    // InternalRosSystemParser.g:1065:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1069:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1070:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1070:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalRosSystemParser.g:1071:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment());
            // InternalRosSystemParser.g:1072:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalRosSystemParser.g:1072:4: rule__ParameterBoolean__ValueAssignment
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
    // InternalRosSystemParser.g:1081:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1082:1: ( ruleParameterStruct EOF )
            // InternalRosSystemParser.g:1083:1: ruleParameterStruct EOF
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
    // InternalRosSystemParser.g:1090:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1094:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalRosSystemParser.g:1095:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalRosSystemParser.g:1095:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalRosSystemParser.g:1096:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup());
            // InternalRosSystemParser.g:1097:3: ( rule__ParameterStruct__Group__0 )
            // InternalRosSystemParser.g:1097:4: rule__ParameterStruct__Group__0
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
    // InternalRosSystemParser.g:1106:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1107:1: ( ruleParameterDate EOF )
            // InternalRosSystemParser.g:1108:1: ruleParameterDate EOF
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
    // InternalRosSystemParser.g:1115:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1119:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1120:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1120:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalRosSystemParser.g:1121:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment());
            // InternalRosSystemParser.g:1122:3: ( rule__ParameterDate__ValueAssignment )
            // InternalRosSystemParser.g:1122:4: rule__ParameterDate__ValueAssignment
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
    // InternalRosSystemParser.g:1131:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1132:1: ( ruleParameterStructMember EOF )
            // InternalRosSystemParser.g:1133:1: ruleParameterStructMember EOF
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
    // InternalRosSystemParser.g:1140:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1144:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalRosSystemParser.g:1145:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:1145:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalRosSystemParser.g:1146:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup());
            // InternalRosSystemParser.g:1147:3: ( rule__ParameterStructMember__Group__0 )
            // InternalRosSystemParser.g:1147:4: rule__ParameterStructMember__Group__0
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
    // InternalRosSystemParser.g:1156:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1157:1: ( ruleParameterStructTypeMember EOF )
            // InternalRosSystemParser.g:1158:1: ruleParameterStructTypeMember EOF
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
    // InternalRosSystemParser.g:1165:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1169:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalRosSystemParser.g:1170:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:1170:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalRosSystemParser.g:1171:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup());
            // InternalRosSystemParser.g:1172:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalRosSystemParser.g:1172:4: rule__ParameterStructTypeMember__Group__0
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
    // InternalRosSystemParser.g:1181:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1182:1: ( ruleBase64Binary EOF )
            // InternalRosSystemParser.g:1183:1: ruleBase64Binary EOF
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
    // InternalRosSystemParser.g:1190:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1194:2: ( ( RULE_BINARY ) )
            // InternalRosSystemParser.g:1195:2: ( RULE_BINARY )
            {
            // InternalRosSystemParser.g:1195:2: ( RULE_BINARY )
            // InternalRosSystemParser.g:1196:3: RULE_BINARY
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
    // InternalRosSystemParser.g:1206:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1207:1: ( ruleboolean0 EOF )
            // InternalRosSystemParser.g:1208:1: ruleboolean0 EOF
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
    // InternalRosSystemParser.g:1215:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1219:2: ( ( RULE_BOOLEAN ) )
            // InternalRosSystemParser.g:1220:2: ( RULE_BOOLEAN )
            {
            // InternalRosSystemParser.g:1220:2: ( RULE_BOOLEAN )
            // InternalRosSystemParser.g:1221:3: RULE_BOOLEAN
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
    // InternalRosSystemParser.g:1231:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1232:1: ( ruleDouble0 EOF )
            // InternalRosSystemParser.g:1233:1: ruleDouble0 EOF
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
    // InternalRosSystemParser.g:1240:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1244:2: ( ( RULE_DOUBLE ) )
            // InternalRosSystemParser.g:1245:2: ( RULE_DOUBLE )
            {
            // InternalRosSystemParser.g:1245:2: ( RULE_DOUBLE )
            // InternalRosSystemParser.g:1246:3: RULE_DOUBLE
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
    // InternalRosSystemParser.g:1256:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1257:1: ( ruleInteger0 EOF )
            // InternalRosSystemParser.g:1258:1: ruleInteger0 EOF
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
    // InternalRosSystemParser.g:1265:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1269:2: ( ( RULE_DECINT ) )
            // InternalRosSystemParser.g:1270:2: ( RULE_DECINT )
            {
            // InternalRosSystemParser.g:1270:2: ( RULE_DECINT )
            // InternalRosSystemParser.g:1271:3: RULE_DECINT
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
    // InternalRosSystemParser.g:1281:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1282:1: ( ruleDateTime0 EOF )
            // InternalRosSystemParser.g:1283:1: ruleDateTime0 EOF
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
    // InternalRosSystemParser.g:1290:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1294:2: ( ( RULE_DATE_TIME ) )
            // InternalRosSystemParser.g:1295:2: ( RULE_DATE_TIME )
            {
            // InternalRosSystemParser.g:1295:2: ( RULE_DATE_TIME )
            // InternalRosSystemParser.g:1296:3: RULE_DATE_TIME
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
    // InternalRosSystemParser.g:1306:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1307:1: ( ruleAbstractType EOF )
            // InternalRosSystemParser.g:1308:1: ruleAbstractType EOF
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
    // InternalRosSystemParser.g:1315:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1319:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalRosSystemParser.g:1320:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalRosSystemParser.g:1320:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalRosSystemParser.g:1321:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives());
            // InternalRosSystemParser.g:1322:3: ( rule__AbstractType__Alternatives )
            // InternalRosSystemParser.g:1322:4: rule__AbstractType__Alternatives
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
    // InternalRosSystemParser.g:1331:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1332:1: ( rulebool EOF )
            // InternalRosSystemParser.g:1333:1: rulebool EOF
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
    // InternalRosSystemParser.g:1340:1: rulebool : ( ( rule__Bool__Group__0 ) ) ;
    public final void rulebool() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1344:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalRosSystemParser.g:1345:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalRosSystemParser.g:1345:2: ( ( rule__Bool__Group__0 ) )
            // InternalRosSystemParser.g:1346:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup());
            // InternalRosSystemParser.g:1347:3: ( rule__Bool__Group__0 )
            // InternalRosSystemParser.g:1347:4: rule__Bool__Group__0
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
    // InternalRosSystemParser.g:1356:1: entryRuleint8 : ruleint8 EOF ;
    public final void entryRuleint8() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1357:1: ( ruleint8 EOF )
            // InternalRosSystemParser.g:1358:1: ruleint8 EOF
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
    // InternalRosSystemParser.g:1365:1: ruleint8 : ( ( rule__Int8__Group__0 ) ) ;
    public final void ruleint8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1369:2: ( ( ( rule__Int8__Group__0 ) ) )
            // InternalRosSystemParser.g:1370:2: ( ( rule__Int8__Group__0 ) )
            {
            // InternalRosSystemParser.g:1370:2: ( ( rule__Int8__Group__0 ) )
            // InternalRosSystemParser.g:1371:3: ( rule__Int8__Group__0 )
            {
             before(grammarAccess.getInt8Access().getGroup());
            // InternalRosSystemParser.g:1372:3: ( rule__Int8__Group__0 )
            // InternalRosSystemParser.g:1372:4: rule__Int8__Group__0
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
    // InternalRosSystemParser.g:1381:1: entryRuleuint8 : ruleuint8 EOF ;
    public final void entryRuleuint8() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1382:1: ( ruleuint8 EOF )
            // InternalRosSystemParser.g:1383:1: ruleuint8 EOF
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
    // InternalRosSystemParser.g:1390:1: ruleuint8 : ( ( rule__Uint8__Group__0 ) ) ;
    public final void ruleuint8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1394:2: ( ( ( rule__Uint8__Group__0 ) ) )
            // InternalRosSystemParser.g:1395:2: ( ( rule__Uint8__Group__0 ) )
            {
            // InternalRosSystemParser.g:1395:2: ( ( rule__Uint8__Group__0 ) )
            // InternalRosSystemParser.g:1396:3: ( rule__Uint8__Group__0 )
            {
             before(grammarAccess.getUint8Access().getGroup());
            // InternalRosSystemParser.g:1397:3: ( rule__Uint8__Group__0 )
            // InternalRosSystemParser.g:1397:4: rule__Uint8__Group__0
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
    // InternalRosSystemParser.g:1406:1: entryRuleint16 : ruleint16 EOF ;
    public final void entryRuleint16() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1407:1: ( ruleint16 EOF )
            // InternalRosSystemParser.g:1408:1: ruleint16 EOF
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
    // InternalRosSystemParser.g:1415:1: ruleint16 : ( ( rule__Int16__Group__0 ) ) ;
    public final void ruleint16() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1419:2: ( ( ( rule__Int16__Group__0 ) ) )
            // InternalRosSystemParser.g:1420:2: ( ( rule__Int16__Group__0 ) )
            {
            // InternalRosSystemParser.g:1420:2: ( ( rule__Int16__Group__0 ) )
            // InternalRosSystemParser.g:1421:3: ( rule__Int16__Group__0 )
            {
             before(grammarAccess.getInt16Access().getGroup());
            // InternalRosSystemParser.g:1422:3: ( rule__Int16__Group__0 )
            // InternalRosSystemParser.g:1422:4: rule__Int16__Group__0
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
    // InternalRosSystemParser.g:1431:1: entryRuleuint16 : ruleuint16 EOF ;
    public final void entryRuleuint16() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1432:1: ( ruleuint16 EOF )
            // InternalRosSystemParser.g:1433:1: ruleuint16 EOF
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
    // InternalRosSystemParser.g:1440:1: ruleuint16 : ( ( rule__Uint16__Group__0 ) ) ;
    public final void ruleuint16() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1444:2: ( ( ( rule__Uint16__Group__0 ) ) )
            // InternalRosSystemParser.g:1445:2: ( ( rule__Uint16__Group__0 ) )
            {
            // InternalRosSystemParser.g:1445:2: ( ( rule__Uint16__Group__0 ) )
            // InternalRosSystemParser.g:1446:3: ( rule__Uint16__Group__0 )
            {
             before(grammarAccess.getUint16Access().getGroup());
            // InternalRosSystemParser.g:1447:3: ( rule__Uint16__Group__0 )
            // InternalRosSystemParser.g:1447:4: rule__Uint16__Group__0
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
    // InternalRosSystemParser.g:1456:1: entryRuleint32 : ruleint32 EOF ;
    public final void entryRuleint32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1457:1: ( ruleint32 EOF )
            // InternalRosSystemParser.g:1458:1: ruleint32 EOF
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
    // InternalRosSystemParser.g:1465:1: ruleint32 : ( ( rule__Int32__Group__0 ) ) ;
    public final void ruleint32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1469:2: ( ( ( rule__Int32__Group__0 ) ) )
            // InternalRosSystemParser.g:1470:2: ( ( rule__Int32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1470:2: ( ( rule__Int32__Group__0 ) )
            // InternalRosSystemParser.g:1471:3: ( rule__Int32__Group__0 )
            {
             before(grammarAccess.getInt32Access().getGroup());
            // InternalRosSystemParser.g:1472:3: ( rule__Int32__Group__0 )
            // InternalRosSystemParser.g:1472:4: rule__Int32__Group__0
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
    // InternalRosSystemParser.g:1481:1: entryRuleuint32 : ruleuint32 EOF ;
    public final void entryRuleuint32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1482:1: ( ruleuint32 EOF )
            // InternalRosSystemParser.g:1483:1: ruleuint32 EOF
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
    // InternalRosSystemParser.g:1490:1: ruleuint32 : ( ( rule__Uint32__Group__0 ) ) ;
    public final void ruleuint32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1494:2: ( ( ( rule__Uint32__Group__0 ) ) )
            // InternalRosSystemParser.g:1495:2: ( ( rule__Uint32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1495:2: ( ( rule__Uint32__Group__0 ) )
            // InternalRosSystemParser.g:1496:3: ( rule__Uint32__Group__0 )
            {
             before(grammarAccess.getUint32Access().getGroup());
            // InternalRosSystemParser.g:1497:3: ( rule__Uint32__Group__0 )
            // InternalRosSystemParser.g:1497:4: rule__Uint32__Group__0
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
    // InternalRosSystemParser.g:1506:1: entryRuleint64 : ruleint64 EOF ;
    public final void entryRuleint64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1507:1: ( ruleint64 EOF )
            // InternalRosSystemParser.g:1508:1: ruleint64 EOF
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
    // InternalRosSystemParser.g:1515:1: ruleint64 : ( ( rule__Int64__Group__0 ) ) ;
    public final void ruleint64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1519:2: ( ( ( rule__Int64__Group__0 ) ) )
            // InternalRosSystemParser.g:1520:2: ( ( rule__Int64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1520:2: ( ( rule__Int64__Group__0 ) )
            // InternalRosSystemParser.g:1521:3: ( rule__Int64__Group__0 )
            {
             before(grammarAccess.getInt64Access().getGroup());
            // InternalRosSystemParser.g:1522:3: ( rule__Int64__Group__0 )
            // InternalRosSystemParser.g:1522:4: rule__Int64__Group__0
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
    // InternalRosSystemParser.g:1531:1: entryRuleuint64 : ruleuint64 EOF ;
    public final void entryRuleuint64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1532:1: ( ruleuint64 EOF )
            // InternalRosSystemParser.g:1533:1: ruleuint64 EOF
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
    // InternalRosSystemParser.g:1540:1: ruleuint64 : ( ( rule__Uint64__Group__0 ) ) ;
    public final void ruleuint64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1544:2: ( ( ( rule__Uint64__Group__0 ) ) )
            // InternalRosSystemParser.g:1545:2: ( ( rule__Uint64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1545:2: ( ( rule__Uint64__Group__0 ) )
            // InternalRosSystemParser.g:1546:3: ( rule__Uint64__Group__0 )
            {
             before(grammarAccess.getUint64Access().getGroup());
            // InternalRosSystemParser.g:1547:3: ( rule__Uint64__Group__0 )
            // InternalRosSystemParser.g:1547:4: rule__Uint64__Group__0
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
    // InternalRosSystemParser.g:1556:1: entryRulefloat32 : rulefloat32 EOF ;
    public final void entryRulefloat32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1557:1: ( rulefloat32 EOF )
            // InternalRosSystemParser.g:1558:1: rulefloat32 EOF
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
    // InternalRosSystemParser.g:1565:1: rulefloat32 : ( ( rule__Float32__Group__0 ) ) ;
    public final void rulefloat32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1569:2: ( ( ( rule__Float32__Group__0 ) ) )
            // InternalRosSystemParser.g:1570:2: ( ( rule__Float32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1570:2: ( ( rule__Float32__Group__0 ) )
            // InternalRosSystemParser.g:1571:3: ( rule__Float32__Group__0 )
            {
             before(grammarAccess.getFloat32Access().getGroup());
            // InternalRosSystemParser.g:1572:3: ( rule__Float32__Group__0 )
            // InternalRosSystemParser.g:1572:4: rule__Float32__Group__0
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
    // InternalRosSystemParser.g:1581:1: entryRulefloat64 : rulefloat64 EOF ;
    public final void entryRulefloat64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1582:1: ( rulefloat64 EOF )
            // InternalRosSystemParser.g:1583:1: rulefloat64 EOF
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
    // InternalRosSystemParser.g:1590:1: rulefloat64 : ( ( rule__Float64__Group__0 ) ) ;
    public final void rulefloat64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1594:2: ( ( ( rule__Float64__Group__0 ) ) )
            // InternalRosSystemParser.g:1595:2: ( ( rule__Float64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1595:2: ( ( rule__Float64__Group__0 ) )
            // InternalRosSystemParser.g:1596:3: ( rule__Float64__Group__0 )
            {
             before(grammarAccess.getFloat64Access().getGroup());
            // InternalRosSystemParser.g:1597:3: ( rule__Float64__Group__0 )
            // InternalRosSystemParser.g:1597:4: rule__Float64__Group__0
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
    // InternalRosSystemParser.g:1606:1: entryRulestring0 : rulestring0 EOF ;
    public final void entryRulestring0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1607:1: ( rulestring0 EOF )
            // InternalRosSystemParser.g:1608:1: rulestring0 EOF
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
    // InternalRosSystemParser.g:1615:1: rulestring0 : ( ( rule__String0__Group__0 ) ) ;
    public final void rulestring0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1619:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalRosSystemParser.g:1620:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalRosSystemParser.g:1620:2: ( ( rule__String0__Group__0 ) )
            // InternalRosSystemParser.g:1621:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup());
            // InternalRosSystemParser.g:1622:3: ( rule__String0__Group__0 )
            // InternalRosSystemParser.g:1622:4: rule__String0__Group__0
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
    // InternalRosSystemParser.g:1631:1: entryRulebyte : rulebyte EOF ;
    public final void entryRulebyte() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1632:1: ( rulebyte EOF )
            // InternalRosSystemParser.g:1633:1: rulebyte EOF
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
    // InternalRosSystemParser.g:1640:1: rulebyte : ( ( rule__Byte__Group__0 ) ) ;
    public final void rulebyte() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1644:2: ( ( ( rule__Byte__Group__0 ) ) )
            // InternalRosSystemParser.g:1645:2: ( ( rule__Byte__Group__0 ) )
            {
            // InternalRosSystemParser.g:1645:2: ( ( rule__Byte__Group__0 ) )
            // InternalRosSystemParser.g:1646:3: ( rule__Byte__Group__0 )
            {
             before(grammarAccess.getByteAccess().getGroup());
            // InternalRosSystemParser.g:1647:3: ( rule__Byte__Group__0 )
            // InternalRosSystemParser.g:1647:4: rule__Byte__Group__0
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
    // InternalRosSystemParser.g:1656:1: entryRuletime : ruletime EOF ;
    public final void entryRuletime() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1657:1: ( ruletime EOF )
            // InternalRosSystemParser.g:1658:1: ruletime EOF
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
    // InternalRosSystemParser.g:1665:1: ruletime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruletime() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1669:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalRosSystemParser.g:1670:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalRosSystemParser.g:1670:2: ( ( rule__Time__Group__0 ) )
            // InternalRosSystemParser.g:1671:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup());
            // InternalRosSystemParser.g:1672:3: ( rule__Time__Group__0 )
            // InternalRosSystemParser.g:1672:4: rule__Time__Group__0
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
    // InternalRosSystemParser.g:1681:1: entryRuleduration : ruleduration EOF ;
    public final void entryRuleduration() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1682:1: ( ruleduration EOF )
            // InternalRosSystemParser.g:1683:1: ruleduration EOF
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
    // InternalRosSystemParser.g:1690:1: ruleduration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleduration() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1694:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalRosSystemParser.g:1695:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalRosSystemParser.g:1695:2: ( ( rule__Duration__Group__0 ) )
            // InternalRosSystemParser.g:1696:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup());
            // InternalRosSystemParser.g:1697:3: ( rule__Duration__Group__0 )
            // InternalRosSystemParser.g:1697:4: rule__Duration__Group__0
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
    // InternalRosSystemParser.g:1706:1: entryRuleboolArray : ruleboolArray EOF ;
    public final void entryRuleboolArray() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1707:1: ( ruleboolArray EOF )
            // InternalRosSystemParser.g:1708:1: ruleboolArray EOF
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
    // InternalRosSystemParser.g:1715:1: ruleboolArray : ( ( rule__BoolArray__Group__0 ) ) ;
    public final void ruleboolArray() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1719:2: ( ( ( rule__BoolArray__Group__0 ) ) )
            // InternalRosSystemParser.g:1720:2: ( ( rule__BoolArray__Group__0 ) )
            {
            // InternalRosSystemParser.g:1720:2: ( ( rule__BoolArray__Group__0 ) )
            // InternalRosSystemParser.g:1721:3: ( rule__BoolArray__Group__0 )
            {
             before(grammarAccess.getBoolArrayAccess().getGroup());
            // InternalRosSystemParser.g:1722:3: ( rule__BoolArray__Group__0 )
            // InternalRosSystemParser.g:1722:4: rule__BoolArray__Group__0
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
    // InternalRosSystemParser.g:1731:1: entryRuleint8Array : ruleint8Array EOF ;
    public final void entryRuleint8Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1732:1: ( ruleint8Array EOF )
            // InternalRosSystemParser.g:1733:1: ruleint8Array EOF
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
    // InternalRosSystemParser.g:1740:1: ruleint8Array : ( ( rule__Int8Array__Group__0 ) ) ;
    public final void ruleint8Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1744:2: ( ( ( rule__Int8Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1745:2: ( ( rule__Int8Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1745:2: ( ( rule__Int8Array__Group__0 ) )
            // InternalRosSystemParser.g:1746:3: ( rule__Int8Array__Group__0 )
            {
             before(grammarAccess.getInt8ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1747:3: ( rule__Int8Array__Group__0 )
            // InternalRosSystemParser.g:1747:4: rule__Int8Array__Group__0
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
    // InternalRosSystemParser.g:1756:1: entryRuleuint8Array : ruleuint8Array EOF ;
    public final void entryRuleuint8Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1757:1: ( ruleuint8Array EOF )
            // InternalRosSystemParser.g:1758:1: ruleuint8Array EOF
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
    // InternalRosSystemParser.g:1765:1: ruleuint8Array : ( ( rule__Uint8Array__Group__0 ) ) ;
    public final void ruleuint8Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1769:2: ( ( ( rule__Uint8Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1770:2: ( ( rule__Uint8Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1770:2: ( ( rule__Uint8Array__Group__0 ) )
            // InternalRosSystemParser.g:1771:3: ( rule__Uint8Array__Group__0 )
            {
             before(grammarAccess.getUint8ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1772:3: ( rule__Uint8Array__Group__0 )
            // InternalRosSystemParser.g:1772:4: rule__Uint8Array__Group__0
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
    // InternalRosSystemParser.g:1781:1: entryRuleint16Array : ruleint16Array EOF ;
    public final void entryRuleint16Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1782:1: ( ruleint16Array EOF )
            // InternalRosSystemParser.g:1783:1: ruleint16Array EOF
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
    // InternalRosSystemParser.g:1790:1: ruleint16Array : ( ( rule__Int16Array__Group__0 ) ) ;
    public final void ruleint16Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1794:2: ( ( ( rule__Int16Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1795:2: ( ( rule__Int16Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1795:2: ( ( rule__Int16Array__Group__0 ) )
            // InternalRosSystemParser.g:1796:3: ( rule__Int16Array__Group__0 )
            {
             before(grammarAccess.getInt16ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1797:3: ( rule__Int16Array__Group__0 )
            // InternalRosSystemParser.g:1797:4: rule__Int16Array__Group__0
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
    // InternalRosSystemParser.g:1806:1: entryRuleuint16Array : ruleuint16Array EOF ;
    public final void entryRuleuint16Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1807:1: ( ruleuint16Array EOF )
            // InternalRosSystemParser.g:1808:1: ruleuint16Array EOF
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
    // InternalRosSystemParser.g:1815:1: ruleuint16Array : ( ( rule__Uint16Array__Group__0 ) ) ;
    public final void ruleuint16Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1819:2: ( ( ( rule__Uint16Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1820:2: ( ( rule__Uint16Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1820:2: ( ( rule__Uint16Array__Group__0 ) )
            // InternalRosSystemParser.g:1821:3: ( rule__Uint16Array__Group__0 )
            {
             before(grammarAccess.getUint16ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1822:3: ( rule__Uint16Array__Group__0 )
            // InternalRosSystemParser.g:1822:4: rule__Uint16Array__Group__0
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
    // InternalRosSystemParser.g:1831:1: entryRuleint32Array : ruleint32Array EOF ;
    public final void entryRuleint32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1832:1: ( ruleint32Array EOF )
            // InternalRosSystemParser.g:1833:1: ruleint32Array EOF
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
    // InternalRosSystemParser.g:1840:1: ruleint32Array : ( ( rule__Int32Array__Group__0 ) ) ;
    public final void ruleint32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1844:2: ( ( ( rule__Int32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1845:2: ( ( rule__Int32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1845:2: ( ( rule__Int32Array__Group__0 ) )
            // InternalRosSystemParser.g:1846:3: ( rule__Int32Array__Group__0 )
            {
             before(grammarAccess.getInt32ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1847:3: ( rule__Int32Array__Group__0 )
            // InternalRosSystemParser.g:1847:4: rule__Int32Array__Group__0
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
    // InternalRosSystemParser.g:1856:1: entryRuleuint32Array : ruleuint32Array EOF ;
    public final void entryRuleuint32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1857:1: ( ruleuint32Array EOF )
            // InternalRosSystemParser.g:1858:1: ruleuint32Array EOF
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
    // InternalRosSystemParser.g:1865:1: ruleuint32Array : ( ( rule__Uint32Array__Group__0 ) ) ;
    public final void ruleuint32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1869:2: ( ( ( rule__Uint32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1870:2: ( ( rule__Uint32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1870:2: ( ( rule__Uint32Array__Group__0 ) )
            // InternalRosSystemParser.g:1871:3: ( rule__Uint32Array__Group__0 )
            {
             before(grammarAccess.getUint32ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1872:3: ( rule__Uint32Array__Group__0 )
            // InternalRosSystemParser.g:1872:4: rule__Uint32Array__Group__0
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
    // InternalRosSystemParser.g:1881:1: entryRuleint64Array : ruleint64Array EOF ;
    public final void entryRuleint64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1882:1: ( ruleint64Array EOF )
            // InternalRosSystemParser.g:1883:1: ruleint64Array EOF
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
    // InternalRosSystemParser.g:1890:1: ruleint64Array : ( ( rule__Int64Array__Group__0 ) ) ;
    public final void ruleint64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1894:2: ( ( ( rule__Int64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1895:2: ( ( rule__Int64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1895:2: ( ( rule__Int64Array__Group__0 ) )
            // InternalRosSystemParser.g:1896:3: ( rule__Int64Array__Group__0 )
            {
             before(grammarAccess.getInt64ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1897:3: ( rule__Int64Array__Group__0 )
            // InternalRosSystemParser.g:1897:4: rule__Int64Array__Group__0
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
    // InternalRosSystemParser.g:1906:1: entryRuleuint64Array : ruleuint64Array EOF ;
    public final void entryRuleuint64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1907:1: ( ruleuint64Array EOF )
            // InternalRosSystemParser.g:1908:1: ruleuint64Array EOF
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
    // InternalRosSystemParser.g:1915:1: ruleuint64Array : ( ( rule__Uint64Array__Group__0 ) ) ;
    public final void ruleuint64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1919:2: ( ( ( rule__Uint64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1920:2: ( ( rule__Uint64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1920:2: ( ( rule__Uint64Array__Group__0 ) )
            // InternalRosSystemParser.g:1921:3: ( rule__Uint64Array__Group__0 )
            {
             before(grammarAccess.getUint64ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1922:3: ( rule__Uint64Array__Group__0 )
            // InternalRosSystemParser.g:1922:4: rule__Uint64Array__Group__0
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
    // InternalRosSystemParser.g:1931:1: entryRulefloat32Array : rulefloat32Array EOF ;
    public final void entryRulefloat32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1932:1: ( rulefloat32Array EOF )
            // InternalRosSystemParser.g:1933:1: rulefloat32Array EOF
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
    // InternalRosSystemParser.g:1940:1: rulefloat32Array : ( ( rule__Float32Array__Group__0 ) ) ;
    public final void rulefloat32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1944:2: ( ( ( rule__Float32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1945:2: ( ( rule__Float32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1945:2: ( ( rule__Float32Array__Group__0 ) )
            // InternalRosSystemParser.g:1946:3: ( rule__Float32Array__Group__0 )
            {
             before(grammarAccess.getFloat32ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1947:3: ( rule__Float32Array__Group__0 )
            // InternalRosSystemParser.g:1947:4: rule__Float32Array__Group__0
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
    // InternalRosSystemParser.g:1956:1: entryRulefloat64Array : rulefloat64Array EOF ;
    public final void entryRulefloat64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1957:1: ( rulefloat64Array EOF )
            // InternalRosSystemParser.g:1958:1: rulefloat64Array EOF
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
    // InternalRosSystemParser.g:1965:1: rulefloat64Array : ( ( rule__Float64Array__Group__0 ) ) ;
    public final void rulefloat64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1969:2: ( ( ( rule__Float64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1970:2: ( ( rule__Float64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1970:2: ( ( rule__Float64Array__Group__0 ) )
            // InternalRosSystemParser.g:1971:3: ( rule__Float64Array__Group__0 )
            {
             before(grammarAccess.getFloat64ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1972:3: ( rule__Float64Array__Group__0 )
            // InternalRosSystemParser.g:1972:4: rule__Float64Array__Group__0
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
    // InternalRosSystemParser.g:1981:1: entryRulestring0Array : rulestring0Array EOF ;
    public final void entryRulestring0Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1982:1: ( rulestring0Array EOF )
            // InternalRosSystemParser.g:1983:1: rulestring0Array EOF
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
    // InternalRosSystemParser.g:1990:1: rulestring0Array : ( ( rule__String0Array__Group__0 ) ) ;
    public final void rulestring0Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1994:2: ( ( ( rule__String0Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1995:2: ( ( rule__String0Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1995:2: ( ( rule__String0Array__Group__0 ) )
            // InternalRosSystemParser.g:1996:3: ( rule__String0Array__Group__0 )
            {
             before(grammarAccess.getString0ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1997:3: ( rule__String0Array__Group__0 )
            // InternalRosSystemParser.g:1997:4: rule__String0Array__Group__0
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
    // InternalRosSystemParser.g:2006:1: entryRulebyteArray : rulebyteArray EOF ;
    public final void entryRulebyteArray() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2007:1: ( rulebyteArray EOF )
            // InternalRosSystemParser.g:2008:1: rulebyteArray EOF
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
    // InternalRosSystemParser.g:2015:1: rulebyteArray : ( ( rule__ByteArray__Group__0 ) ) ;
    public final void rulebyteArray() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2019:2: ( ( ( rule__ByteArray__Group__0 ) ) )
            // InternalRosSystemParser.g:2020:2: ( ( rule__ByteArray__Group__0 ) )
            {
            // InternalRosSystemParser.g:2020:2: ( ( rule__ByteArray__Group__0 ) )
            // InternalRosSystemParser.g:2021:3: ( rule__ByteArray__Group__0 )
            {
             before(grammarAccess.getByteArrayAccess().getGroup());
            // InternalRosSystemParser.g:2022:3: ( rule__ByteArray__Group__0 )
            // InternalRosSystemParser.g:2022:4: rule__ByteArray__Group__0
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
    // InternalRosSystemParser.g:2031:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2032:1: ( ruleHeader EOF )
            // InternalRosSystemParser.g:2033:1: ruleHeader EOF
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
    // InternalRosSystemParser.g:2040:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2044:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalRosSystemParser.g:2045:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalRosSystemParser.g:2045:2: ( ( rule__Header__Group__0 ) )
            // InternalRosSystemParser.g:2046:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup());
            // InternalRosSystemParser.g:2047:3: ( rule__Header__Group__0 )
            // InternalRosSystemParser.g:2047:4: rule__Header__Group__0
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
    // InternalRosSystemParser.g:2056:1: entryRuleTopicSpecRef : ruleTopicSpecRef EOF ;
    public final void entryRuleTopicSpecRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2057:1: ( ruleTopicSpecRef EOF )
            // InternalRosSystemParser.g:2058:1: ruleTopicSpecRef EOF
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
    // InternalRosSystemParser.g:2065:1: ruleTopicSpecRef : ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) ;
    public final void ruleTopicSpecRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2069:2: ( ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) )
            // InternalRosSystemParser.g:2070:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            {
            // InternalRosSystemParser.g:2070:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            // InternalRosSystemParser.g:2071:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment());
            // InternalRosSystemParser.g:2072:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            // InternalRosSystemParser.g:2072:4: rule__TopicSpecRef__TopicSpecAssignment
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
    // InternalRosSystemParser.g:2081:1: entryRuleArrayTopicSpecRef : ruleArrayTopicSpecRef EOF ;
    public final void entryRuleArrayTopicSpecRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2082:1: ( ruleArrayTopicSpecRef EOF )
            // InternalRosSystemParser.g:2083:1: ruleArrayTopicSpecRef EOF
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
    // InternalRosSystemParser.g:2090:1: ruleArrayTopicSpecRef : ( ( rule__ArrayTopicSpecRef__Group__0 ) ) ;
    public final void ruleArrayTopicSpecRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2094:2: ( ( ( rule__ArrayTopicSpecRef__Group__0 ) ) )
            // InternalRosSystemParser.g:2095:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            {
            // InternalRosSystemParser.g:2095:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            // InternalRosSystemParser.g:2096:3: ( rule__ArrayTopicSpecRef__Group__0 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getGroup());
            // InternalRosSystemParser.g:2097:3: ( rule__ArrayTopicSpecRef__Group__0 )
            // InternalRosSystemParser.g:2097:4: rule__ArrayTopicSpecRef__Group__0
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
    // InternalRosSystemParser.g:2106:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2107:1: ( ruleKEYWORD EOF )
            // InternalRosSystemParser.g:2108:1: ruleKEYWORD EOF
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
    // InternalRosSystemParser.g:2115:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2119:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalRosSystemParser.g:2120:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalRosSystemParser.g:2120:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalRosSystemParser.g:2121:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives());
            // InternalRosSystemParser.g:2122:3: ( rule__KEYWORD__Alternatives )
            // InternalRosSystemParser.g:2122:4: rule__KEYWORD__Alternatives
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
    // InternalRosSystemParser.g:2131:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2132:1: ( ruleEString EOF )
            // InternalRosSystemParser.g:2133:1: ruleEString EOF
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
    // InternalRosSystemParser.g:2140:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2144:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystemParser.g:2145:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystemParser.g:2145:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystemParser.g:2146:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives());
            // InternalRosSystemParser.g:2147:3: ( rule__EString__Alternatives )
            // InternalRosSystemParser.g:2147:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRulePreListElement"
    // InternalRosSystemParser.g:2156:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {

            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalRosSystemParser.g:2160:1: ( rulePreListElement EOF )
            // InternalRosSystemParser.g:2161:1: rulePreListElement EOF
            {
             before(grammarAccess.getPreListElementRule());
            pushFollow(FOLLOW_1);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPreListElementRule());
            match(input,EOF,FOLLOW_2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePreListElement"


    // $ANTLR start "rulePreListElement"
    // InternalRosSystemParser.g:2171:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

                HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2176:2: ( ( HyphenMinus ) )
            // InternalRosSystemParser.g:2177:2: ( HyphenMinus )
            {
            // InternalRosSystemParser.g:2177:2: ( HyphenMinus )
            // InternalRosSystemParser.g:2178:3: HyphenMinus
            {
             before(grammarAccess.getPreListElementAccess().getHyphenMinusKeyword());
            match(input,HyphenMinus,FOLLOW_2);
             after(grammarAccess.getPreListElementAccess().getHyphenMinusKeyword());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);
                myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePreListElement"


    // $ANTLR start "rule__RosSystem__Alternatives_3"
    // InternalRosSystemParser.g:2188:1: rule__RosSystem__Alternatives_3 : ( ( ( rule__RosSystem__Group_3_0__0 ) ) | ( ( rule__RosSystem__Group_3_1__0 ) ) | ( ( rule__RosSystem__Group_3_2__0 ) ) | ( ( rule__RosSystem__Group_3_3__0 ) ) );
    public final void rule__RosSystem__Alternatives_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2192:1: ( ( ( rule__RosSystem__Group_3_0__0 ) ) | ( ( rule__RosSystem__Group_3_1__0 ) ) | ( ( rule__RosSystem__Group_3_2__0 ) ) | ( ( rule__RosSystem__Group_3_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case Processes:
                {
                alt1=1;
                }
                break;
            case Nodes:
                {
                alt1=2;
                }
                break;
            case Parameters:
                {
                alt1=3;
                }
                break;
            case Connections:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRosSystemParser.g:2193:2: ( ( rule__RosSystem__Group_3_0__0 ) )
                    {
                    // InternalRosSystemParser.g:2193:2: ( ( rule__RosSystem__Group_3_0__0 ) )
                    // InternalRosSystemParser.g:2194:3: ( rule__RosSystem__Group_3_0__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_0());
                    // InternalRosSystemParser.g:2195:3: ( rule__RosSystem__Group_3_0__0 )
                    // InternalRosSystemParser.g:2195:4: rule__RosSystem__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2199:2: ( ( rule__RosSystem__Group_3_1__0 ) )
                    {
                    // InternalRosSystemParser.g:2199:2: ( ( rule__RosSystem__Group_3_1__0 ) )
                    // InternalRosSystemParser.g:2200:3: ( rule__RosSystem__Group_3_1__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_1());
                    // InternalRosSystemParser.g:2201:3: ( rule__RosSystem__Group_3_1__0 )
                    // InternalRosSystemParser.g:2201:4: rule__RosSystem__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2205:2: ( ( rule__RosSystem__Group_3_2__0 ) )
                    {
                    // InternalRosSystemParser.g:2205:2: ( ( rule__RosSystem__Group_3_2__0 ) )
                    // InternalRosSystemParser.g:2206:3: ( rule__RosSystem__Group_3_2__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_2());
                    // InternalRosSystemParser.g:2207:3: ( rule__RosSystem__Group_3_2__0 )
                    // InternalRosSystemParser.g:2207:4: rule__RosSystem__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2211:2: ( ( rule__RosSystem__Group_3_3__0 ) )
                    {
                    // InternalRosSystemParser.g:2211:2: ( ( rule__RosSystem__Group_3_3__0 ) )
                    // InternalRosSystemParser.g:2212:3: ( rule__RosSystem__Group_3_3__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_3());
                    // InternalRosSystemParser.g:2213:3: ( rule__RosSystem__Group_3_3__0 )
                    // InternalRosSystemParser.g:2213:4: rule__RosSystem__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_3());

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
    // $ANTLR end "rule__RosSystem__Alternatives_3"


    // $ANTLR start "rule__InterfaceReference__Alternatives"
    // InternalRosSystemParser.g:2221:1: rule__InterfaceReference__Alternatives : ( ( ruleInterfaceReference_Impl ) | ( ruleRosPublisherReference ) | ( ruleRosSubscriberReference ) | ( ruleRosServiceServerReference ) | ( ruleRosServerClientReference ) | ( ruleRosActionServerReference ) | ( ruleRosActionClientReference ) );
    public final void rule__InterfaceReference__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2225:1: ( ( ruleInterfaceReference_Impl ) | ( ruleRosPublisherReference ) | ( ruleRosSubscriberReference ) | ( ruleRosServiceServerReference ) | ( ruleRosServerClientReference ) | ( ruleRosActionServerReference ) | ( ruleRosActionClientReference ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_END:
                {
                alt2=1;
                }
                break;
            case FromPub:
                {
                alt2=2;
                }
                break;
            case FromSub:
                {
                alt2=3;
                }
                break;
            case FromSS:
                {
                alt2=4;
                }
                break;
            case FromSC:
                {
                alt2=5;
                }
                break;
            case FromAS:
                {
                alt2=6;
                }
                break;
            case FromAC:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRosSystemParser.g:2226:2: ( ruleInterfaceReference_Impl )
                    {
                    // InternalRosSystemParser.g:2226:2: ( ruleInterfaceReference_Impl )
                    // InternalRosSystemParser.g:2227:3: ruleInterfaceReference_Impl
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getInterfaceReference_ImplParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    ruleInterfaceReference_Impl();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getInterfaceReference_ImplParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2232:2: ( ruleRosPublisherReference )
                    {
                    // InternalRosSystemParser.g:2232:2: ( ruleRosPublisherReference )
                    // InternalRosSystemParser.g:2233:3: ruleRosPublisherReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleRosPublisherReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2238:2: ( ruleRosSubscriberReference )
                    {
                    // InternalRosSystemParser.g:2238:2: ( ruleRosSubscriberReference )
                    // InternalRosSystemParser.g:2239:3: ruleRosSubscriberReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    ruleRosSubscriberReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2244:2: ( ruleRosServiceServerReference )
                    {
                    // InternalRosSystemParser.g:2244:2: ( ruleRosServiceServerReference )
                    // InternalRosSystemParser.g:2245:3: ruleRosServiceServerReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    ruleRosServiceServerReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2250:2: ( ruleRosServerClientReference )
                    {
                    // InternalRosSystemParser.g:2250:2: ( ruleRosServerClientReference )
                    // InternalRosSystemParser.g:2251:3: ruleRosServerClientReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    ruleRosServerClientReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2256:2: ( ruleRosActionServerReference )
                    {
                    // InternalRosSystemParser.g:2256:2: ( ruleRosActionServerReference )
                    // InternalRosSystemParser.g:2257:3: ruleRosActionServerReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_5());
                    pushFollow(FOLLOW_2);
                    ruleRosActionServerReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2262:2: ( ruleRosActionClientReference )
                    {
                    // InternalRosSystemParser.g:2262:2: ( ruleRosActionClientReference )
                    // InternalRosSystemParser.g:2263:3: ruleRosActionClientReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_6());
                    pushFollow(FOLLOW_2);
                    ruleRosActionClientReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_6());

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
    // $ANTLR end "rule__InterfaceReference__Alternatives"


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalRosSystemParser.g:2272:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2276:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt3=1;
                }
                break;
            case RelativeNamespace:
                {
                alt3=2;
                }
                break;
            case PrivateNamespace:
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
                    // InternalRosSystemParser.g:2277:2: ( ruleGlobalNamespace )
                    {
                    // InternalRosSystemParser.g:2277:2: ( ruleGlobalNamespace )
                    // InternalRosSystemParser.g:2278:3: ruleGlobalNamespace
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
                    // InternalRosSystemParser.g:2283:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalRosSystemParser.g:2283:2: ( ruleRelativeNamespace_Impl )
                    // InternalRosSystemParser.g:2284:3: ruleRelativeNamespace_Impl
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
                    // InternalRosSystemParser.g:2289:2: ( rulePrivateNamespace )
                    {
                    // InternalRosSystemParser.g:2289:2: ( rulePrivateNamespace )
                    // InternalRosSystemParser.g:2290:3: rulePrivateNamespace
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
    // InternalRosSystemParser.g:2299:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2303:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt4=1;
                }
                break;
            case Struct:
                {
                alt4=2;
                }
                break;
            case Integer:
                {
                alt4=3;
                }
                break;
            case String:
                {
                alt4=4;
                }
                break;
            case Double:
                {
                alt4=5;
                }
                break;
            case Boolean:
                {
                alt4=6;
                }
                break;
            case Base64:
                {
                alt4=7;
                }
                break;
            case RULE_BEGIN:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRosSystemParser.g:2304:2: ( ruleParameterListType )
                    {
                    // InternalRosSystemParser.g:2304:2: ( ruleParameterListType )
                    // InternalRosSystemParser.g:2305:3: ruleParameterListType
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
                    // InternalRosSystemParser.g:2310:2: ( ruleParameterStructType )
                    {
                    // InternalRosSystemParser.g:2310:2: ( ruleParameterStructType )
                    // InternalRosSystemParser.g:2311:3: ruleParameterStructType
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
                    // InternalRosSystemParser.g:2316:2: ( ruleParameterIntegerType )
                    {
                    // InternalRosSystemParser.g:2316:2: ( ruleParameterIntegerType )
                    // InternalRosSystemParser.g:2317:3: ruleParameterIntegerType
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
                    // InternalRosSystemParser.g:2322:2: ( ruleParameterStringType )
                    {
                    // InternalRosSystemParser.g:2322:2: ( ruleParameterStringType )
                    // InternalRosSystemParser.g:2323:3: ruleParameterStringType
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
                    // InternalRosSystemParser.g:2328:2: ( ruleParameterDoubleType )
                    {
                    // InternalRosSystemParser.g:2328:2: ( ruleParameterDoubleType )
                    // InternalRosSystemParser.g:2329:3: ruleParameterDoubleType
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
                    // InternalRosSystemParser.g:2334:2: ( ruleParameterBooleanType )
                    {
                    // InternalRosSystemParser.g:2334:2: ( ruleParameterBooleanType )
                    // InternalRosSystemParser.g:2335:3: ruleParameterBooleanType
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
                    // InternalRosSystemParser.g:2340:2: ( ruleParameterBase64Type )
                    {
                    // InternalRosSystemParser.g:2340:2: ( ruleParameterBase64Type )
                    // InternalRosSystemParser.g:2341:3: ruleParameterBase64Type
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
                    // InternalRosSystemParser.g:2346:2: ( ruleParameterArrayType )
                    {
                    // InternalRosSystemParser.g:2346:2: ( ruleParameterArrayType )
                    // InternalRosSystemParser.g:2347:3: ruleParameterArrayType
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
    // InternalRosSystemParser.g:2356:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2360:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRosSystemParser.g:2361:2: ( ruleParameterString )
                    {
                    // InternalRosSystemParser.g:2361:2: ( ruleParameterString )
                    // InternalRosSystemParser.g:2362:3: ruleParameterString
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
                    // InternalRosSystemParser.g:2367:2: ( ruleParameterBase64 )
                    {
                    // InternalRosSystemParser.g:2367:2: ( ruleParameterBase64 )
                    // InternalRosSystemParser.g:2368:3: ruleParameterBase64
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
                    // InternalRosSystemParser.g:2373:2: ( ruleParameterInteger )
                    {
                    // InternalRosSystemParser.g:2373:2: ( ruleParameterInteger )
                    // InternalRosSystemParser.g:2374:3: ruleParameterInteger
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
                    // InternalRosSystemParser.g:2379:2: ( ruleParameterDouble )
                    {
                    // InternalRosSystemParser.g:2379:2: ( ruleParameterDouble )
                    // InternalRosSystemParser.g:2380:3: ruleParameterDouble
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
                    // InternalRosSystemParser.g:2385:2: ( ruleParameterBoolean )
                    {
                    // InternalRosSystemParser.g:2385:2: ( ruleParameterBoolean )
                    // InternalRosSystemParser.g:2386:3: ruleParameterBoolean
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
                    // InternalRosSystemParser.g:2391:2: ( ruleParameterList )
                    {
                    // InternalRosSystemParser.g:2391:2: ( ruleParameterList )
                    // InternalRosSystemParser.g:2392:3: ruleParameterList
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
                    // InternalRosSystemParser.g:2397:2: ( ruleParameterStruct )
                    {
                    // InternalRosSystemParser.g:2397:2: ( ruleParameterStruct )
                    // InternalRosSystemParser.g:2398:3: ruleParameterStruct
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
    // InternalRosSystemParser.g:2407:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2411:1: ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) )
            int alt6=31;
            switch ( input.LA(1) ) {
            case Bool:
                {
                alt6=1;
                }
                break;
            case Int8:
                {
                alt6=2;
                }
                break;
            case Uint8:
                {
                alt6=3;
                }
                break;
            case Int16:
                {
                alt6=4;
                }
                break;
            case Uint16:
                {
                alt6=5;
                }
                break;
            case Int32:
                {
                alt6=6;
                }
                break;
            case Uint32:
                {
                alt6=7;
                }
                break;
            case Int64:
                {
                alt6=8;
                }
                break;
            case Uint64:
                {
                alt6=9;
                }
                break;
            case Float32:
                {
                alt6=10;
                }
                break;
            case Float64:
                {
                alt6=11;
                }
                break;
            case String_1:
                {
                alt6=12;
                }
                break;
            case Byte:
                {
                alt6=13;
                }
                break;
            case Time:
                {
                alt6=14;
                }
                break;
            case Duration:
                {
                alt6=15;
                }
                break;
            case Header:
                {
                alt6=16;
                }
                break;
            case Bool_1:
                {
                alt6=17;
                }
                break;
            case Int8_1:
                {
                alt6=18;
                }
                break;
            case Uint8_1:
                {
                alt6=19;
                }
                break;
            case Int16_1:
                {
                alt6=20;
                }
                break;
            case Uint16_1:
                {
                alt6=21;
                }
                break;
            case Int32_1:
                {
                alt6=22;
                }
                break;
            case Uint32_1:
                {
                alt6=23;
                }
                break;
            case Int64_1:
                {
                alt6=24;
                }
                break;
            case Uint64_1:
                {
                alt6=25;
                }
                break;
            case Float32_1:
                {
                alt6=26;
                }
                break;
            case Float64_1:
                {
                alt6=27;
                }
                break;
            case String_2:
                {
                alt6=28;
                }
                break;
            case Byte_1:
                {
                alt6=29;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt6=30;
                }
                break;
            case LeftSquareBracket:
                {
                alt6=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRosSystemParser.g:2412:2: ( rulebool )
                    {
                    // InternalRosSystemParser.g:2412:2: ( rulebool )
                    // InternalRosSystemParser.g:2413:3: rulebool
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
                    // InternalRosSystemParser.g:2418:2: ( ruleint8 )
                    {
                    // InternalRosSystemParser.g:2418:2: ( ruleint8 )
                    // InternalRosSystemParser.g:2419:3: ruleint8
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
                    // InternalRosSystemParser.g:2424:2: ( ruleuint8 )
                    {
                    // InternalRosSystemParser.g:2424:2: ( ruleuint8 )
                    // InternalRosSystemParser.g:2425:3: ruleuint8
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
                    // InternalRosSystemParser.g:2430:2: ( ruleint16 )
                    {
                    // InternalRosSystemParser.g:2430:2: ( ruleint16 )
                    // InternalRosSystemParser.g:2431:3: ruleint16
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
                    // InternalRosSystemParser.g:2436:2: ( ruleuint16 )
                    {
                    // InternalRosSystemParser.g:2436:2: ( ruleuint16 )
                    // InternalRosSystemParser.g:2437:3: ruleuint16
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
                    // InternalRosSystemParser.g:2442:2: ( ruleint32 )
                    {
                    // InternalRosSystemParser.g:2442:2: ( ruleint32 )
                    // InternalRosSystemParser.g:2443:3: ruleint32
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
                    // InternalRosSystemParser.g:2448:2: ( ruleuint32 )
                    {
                    // InternalRosSystemParser.g:2448:2: ( ruleuint32 )
                    // InternalRosSystemParser.g:2449:3: ruleuint32
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
                    // InternalRosSystemParser.g:2454:2: ( ruleint64 )
                    {
                    // InternalRosSystemParser.g:2454:2: ( ruleint64 )
                    // InternalRosSystemParser.g:2455:3: ruleint64
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
                    // InternalRosSystemParser.g:2460:2: ( ruleuint64 )
                    {
                    // InternalRosSystemParser.g:2460:2: ( ruleuint64 )
                    // InternalRosSystemParser.g:2461:3: ruleuint64
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
                    // InternalRosSystemParser.g:2466:2: ( rulefloat32 )
                    {
                    // InternalRosSystemParser.g:2466:2: ( rulefloat32 )
                    // InternalRosSystemParser.g:2467:3: rulefloat32
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
                    // InternalRosSystemParser.g:2472:2: ( rulefloat64 )
                    {
                    // InternalRosSystemParser.g:2472:2: ( rulefloat64 )
                    // InternalRosSystemParser.g:2473:3: rulefloat64
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
                    // InternalRosSystemParser.g:2478:2: ( rulestring0 )
                    {
                    // InternalRosSystemParser.g:2478:2: ( rulestring0 )
                    // InternalRosSystemParser.g:2479:3: rulestring0
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
                    // InternalRosSystemParser.g:2484:2: ( rulebyte )
                    {
                    // InternalRosSystemParser.g:2484:2: ( rulebyte )
                    // InternalRosSystemParser.g:2485:3: rulebyte
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
                    // InternalRosSystemParser.g:2490:2: ( ruletime )
                    {
                    // InternalRosSystemParser.g:2490:2: ( ruletime )
                    // InternalRosSystemParser.g:2491:3: ruletime
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
                    // InternalRosSystemParser.g:2496:2: ( ruleduration )
                    {
                    // InternalRosSystemParser.g:2496:2: ( ruleduration )
                    // InternalRosSystemParser.g:2497:3: ruleduration
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
                    // InternalRosSystemParser.g:2502:2: ( ruleHeader )
                    {
                    // InternalRosSystemParser.g:2502:2: ( ruleHeader )
                    // InternalRosSystemParser.g:2503:3: ruleHeader
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
                    // InternalRosSystemParser.g:2508:2: ( ruleboolArray )
                    {
                    // InternalRosSystemParser.g:2508:2: ( ruleboolArray )
                    // InternalRosSystemParser.g:2509:3: ruleboolArray
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
                    // InternalRosSystemParser.g:2514:2: ( ruleint8Array )
                    {
                    // InternalRosSystemParser.g:2514:2: ( ruleint8Array )
                    // InternalRosSystemParser.g:2515:3: ruleint8Array
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
                    // InternalRosSystemParser.g:2520:2: ( ruleuint8Array )
                    {
                    // InternalRosSystemParser.g:2520:2: ( ruleuint8Array )
                    // InternalRosSystemParser.g:2521:3: ruleuint8Array
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
                    // InternalRosSystemParser.g:2526:2: ( ruleint16Array )
                    {
                    // InternalRosSystemParser.g:2526:2: ( ruleint16Array )
                    // InternalRosSystemParser.g:2527:3: ruleint16Array
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
                    // InternalRosSystemParser.g:2532:2: ( ruleuint16Array )
                    {
                    // InternalRosSystemParser.g:2532:2: ( ruleuint16Array )
                    // InternalRosSystemParser.g:2533:3: ruleuint16Array
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
                    // InternalRosSystemParser.g:2538:2: ( ruleint32Array )
                    {
                    // InternalRosSystemParser.g:2538:2: ( ruleint32Array )
                    // InternalRosSystemParser.g:2539:3: ruleint32Array
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
                    // InternalRosSystemParser.g:2544:2: ( ruleuint32Array )
                    {
                    // InternalRosSystemParser.g:2544:2: ( ruleuint32Array )
                    // InternalRosSystemParser.g:2545:3: ruleuint32Array
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
                    // InternalRosSystemParser.g:2550:2: ( ruleint64Array )
                    {
                    // InternalRosSystemParser.g:2550:2: ( ruleint64Array )
                    // InternalRosSystemParser.g:2551:3: ruleint64Array
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
                    // InternalRosSystemParser.g:2556:2: ( ruleuint64Array )
                    {
                    // InternalRosSystemParser.g:2556:2: ( ruleuint64Array )
                    // InternalRosSystemParser.g:2557:3: ruleuint64Array
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
                    // InternalRosSystemParser.g:2562:2: ( rulefloat32Array )
                    {
                    // InternalRosSystemParser.g:2562:2: ( rulefloat32Array )
                    // InternalRosSystemParser.g:2563:3: rulefloat32Array
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
                    // InternalRosSystemParser.g:2568:2: ( rulefloat64Array )
                    {
                    // InternalRosSystemParser.g:2568:2: ( rulefloat64Array )
                    // InternalRosSystemParser.g:2569:3: rulefloat64Array
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
                    // InternalRosSystemParser.g:2574:2: ( rulestring0Array )
                    {
                    // InternalRosSystemParser.g:2574:2: ( rulestring0Array )
                    // InternalRosSystemParser.g:2575:3: rulestring0Array
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
                    // InternalRosSystemParser.g:2580:2: ( rulebyteArray )
                    {
                    // InternalRosSystemParser.g:2580:2: ( rulebyteArray )
                    // InternalRosSystemParser.g:2581:3: rulebyteArray
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
                    // InternalRosSystemParser.g:2586:2: ( ruleTopicSpecRef )
                    {
                    // InternalRosSystemParser.g:2586:2: ( ruleTopicSpecRef )
                    // InternalRosSystemParser.g:2587:3: ruleTopicSpecRef
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
                    // InternalRosSystemParser.g:2592:2: ( ruleArrayTopicSpecRef )
                    {
                    // InternalRosSystemParser.g:2592:2: ( ruleArrayTopicSpecRef )
                    // InternalRosSystemParser.g:2593:3: ruleArrayTopicSpecRef
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
    // InternalRosSystemParser.g:2602:1: rule__KEYWORD__Alternatives : ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2606:1: ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt7=1;
                }
                break;
            case Message:
                {
                alt7=2;
                }
                break;
            case Result:
                {
                alt7=3;
                }
                break;
            case Feedback:
                {
                alt7=4;
                }
                break;
            case Name:
                {
                alt7=5;
                }
                break;
            case Value:
                {
                alt7=6;
                }
                break;
            case Service:
                {
                alt7=7;
                }
                break;
            case Type:
                {
                alt7=8;
                }
                break;
            case Action:
                {
                alt7=9;
                }
                break;
            case Duration:
                {
                alt7=10;
                }
                break;
            case Time:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRosSystemParser.g:2607:2: ( Goal )
                    {
                    // InternalRosSystemParser.g:2607:2: ( Goal )
                    // InternalRosSystemParser.g:2608:3: Goal
                    {
                     before(grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    match(input,Goal,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getGoalKeyword_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2613:2: ( Message )
                    {
                    // InternalRosSystemParser.g:2613:2: ( Message )
                    // InternalRosSystemParser.g:2614:3: Message
                    {
                     before(grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    match(input,Message,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getMessageKeyword_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2619:2: ( Result )
                    {
                    // InternalRosSystemParser.g:2619:2: ( Result )
                    // InternalRosSystemParser.g:2620:3: Result
                    {
                     before(grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    match(input,Result,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getResultKeyword_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2625:2: ( Feedback )
                    {
                    // InternalRosSystemParser.g:2625:2: ( Feedback )
                    // InternalRosSystemParser.g:2626:3: Feedback
                    {
                     before(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    match(input,Feedback,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2631:2: ( Name )
                    {
                    // InternalRosSystemParser.g:2631:2: ( Name )
                    // InternalRosSystemParser.g:2632:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    match(input,Name,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2637:2: ( Value )
                    {
                    // InternalRosSystemParser.g:2637:2: ( Value )
                    // InternalRosSystemParser.g:2638:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    match(input,Value,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2643:2: ( Service )
                    {
                    // InternalRosSystemParser.g:2643:2: ( Service )
                    // InternalRosSystemParser.g:2644:3: Service
                    {
                     before(grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    match(input,Service,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getServiceKeyword_6());

                    }


                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:2649:2: ( Type )
                    {
                    // InternalRosSystemParser.g:2649:2: ( Type )
                    // InternalRosSystemParser.g:2650:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    match(input,Type,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7());

                    }


                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:2655:2: ( Action )
                    {
                    // InternalRosSystemParser.g:2655:2: ( Action )
                    // InternalRosSystemParser.g:2656:3: Action
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    match(input,Action,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_8());

                    }


                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:2661:2: ( Duration )
                    {
                    // InternalRosSystemParser.g:2661:2: ( Duration )
                    // InternalRosSystemParser.g:2662:3: Duration
                    {
                     before(grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    match(input,Duration,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getDurationKeyword_9());

                    }


                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:2667:2: ( Time )
                    {
                    // InternalRosSystemParser.g:2667:2: ( Time )
                    // InternalRosSystemParser.g:2668:3: Time
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
    // InternalRosSystemParser.g:2677:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2681:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystemParser.g:2682:2: ( RULE_STRING )
                    {
                    // InternalRosSystemParser.g:2682:2: ( RULE_STRING )
                    // InternalRosSystemParser.g:2683:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    match(input,RULE_STRING,FOLLOW_2);
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2688:2: ( RULE_ID )
                    {
                    // InternalRosSystemParser.g:2688:2: ( RULE_ID )
                    // InternalRosSystemParser.g:2689:3: RULE_ID
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
    // InternalRosSystemParser.g:2698:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2702:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystemParser.g:2703:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
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
    // InternalRosSystemParser.g:2710:1: rule__RosSystem__Group__0__Impl : ( ( rule__RosSystem__NameAssignment_0 ) ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2714:1: ( ( ( rule__RosSystem__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:2715:1: ( ( rule__RosSystem__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:2715:1: ( ( rule__RosSystem__NameAssignment_0 ) )
            // InternalRosSystemParser.g:2716:2: ( rule__RosSystem__NameAssignment_0 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:2717:2: ( rule__RosSystem__NameAssignment_0 )
            // InternalRosSystemParser.g:2717:3: rule__RosSystem__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0__Impl"


    // $ANTLR start "rule__RosSystem__Group__1"
    // InternalRosSystemParser.g:2725:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2729:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystemParser.g:2730:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
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
    // InternalRosSystemParser.g:2737:1: rule__RosSystem__Group__1__Impl : ( Colon ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2741:1: ( ( Colon ) )
            // InternalRosSystemParser.g:2742:1: ( Colon )
            {
            // InternalRosSystemParser.g:2742:1: ( Colon )
            // InternalRosSystemParser.g:2743:2: Colon
            {
             before(grammarAccess.getRosSystemAccess().getColonKeyword_1());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getColonKeyword_1());

            }


            }

        }
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
    // InternalRosSystemParser.g:2752:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2756:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystemParser.g:2757:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
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
    // InternalRosSystemParser.g:2764:1: rule__RosSystem__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2768:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2769:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2769:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2770:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2());

            }


            }

        }
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
    // InternalRosSystemParser.g:2779:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2783:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystemParser.g:2784:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
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
    // InternalRosSystemParser.g:2791:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Alternatives_3 )* ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2795:1: ( ( ( rule__RosSystem__Alternatives_3 )* ) )
            // InternalRosSystemParser.g:2796:1: ( ( rule__RosSystem__Alternatives_3 )* )
            {
            // InternalRosSystemParser.g:2796:1: ( ( rule__RosSystem__Alternatives_3 )* )
            // InternalRosSystemParser.g:2797:2: ( rule__RosSystem__Alternatives_3 )*
            {
             before(grammarAccess.getRosSystemAccess().getAlternatives_3());
            // InternalRosSystemParser.g:2798:2: ( rule__RosSystem__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Connections||(LA9_0>=Parameters && LA9_0<=Processes)||LA9_0==Nodes) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalRosSystemParser.g:2798:3: rule__RosSystem__Alternatives_3
                    {
                    pushFollow(FOLLOW_6);
                    rule__RosSystem__Alternatives_3();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop9;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getAlternatives_3());

            }


            }

        }
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
    // InternalRosSystemParser.g:2806:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2810:1: ( rule__RosSystem__Group__4__Impl )
            // InternalRosSystemParser.g:2811:2: rule__RosSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:2817:1: rule__RosSystem__Group__4__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2821:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2822:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2822:1: ( RULE_END )
            // InternalRosSystemParser.g:2823:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4());

            }


            }

        }
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


    // $ANTLR start "rule__RosSystem__Group_3_0__0"
    // InternalRosSystemParser.g:2833:1: rule__RosSystem__Group_3_0__0 : rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1 ;
    public final void rule__RosSystem__Group_3_0__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2837:1: ( rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1 )
            // InternalRosSystemParser.g:2838:2: rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__0"


    // $ANTLR start "rule__RosSystem__Group_3_0__0__Impl"
    // InternalRosSystemParser.g:2845:1: rule__RosSystem__Group_3_0__0__Impl : ( Processes ) ;
    public final void rule__RosSystem__Group_3_0__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2849:1: ( ( Processes ) )
            // InternalRosSystemParser.g:2850:1: ( Processes )
            {
            // InternalRosSystemParser.g:2850:1: ( Processes )
            // InternalRosSystemParser.g:2851:2: Processes
            {
             before(grammarAccess.getRosSystemAccess().getProcessesKeyword_3_0_0());
            match(input,Processes,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getProcessesKeyword_3_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__1"
    // InternalRosSystemParser.g:2860:1: rule__RosSystem__Group_3_0__1 : rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2 ;
    public final void rule__RosSystem__Group_3_0__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2864:1: ( rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2 )
            // InternalRosSystemParser.g:2865:2: rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__1"


    // $ANTLR start "rule__RosSystem__Group_3_0__1__Impl"
    // InternalRosSystemParser.g:2872:1: rule__RosSystem__Group_3_0__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_0__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2876:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2877:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2877:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2878:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_0_1());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_0_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__2"
    // InternalRosSystemParser.g:2887:1: rule__RosSystem__Group_3_0__2 : rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3 ;
    public final void rule__RosSystem__Group_3_0__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2891:1: ( rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3 )
            // InternalRosSystemParser.g:2892:2: rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__2"


    // $ANTLR start "rule__RosSystem__Group_3_0__2__Impl"
    // InternalRosSystemParser.g:2899:1: rule__RosSystem__Group_3_0__2__Impl : ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* ) ;
    public final void rule__RosSystem__Group_3_0__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2903:1: ( ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* ) )
            // InternalRosSystemParser.g:2904:1: ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* )
            {
            // InternalRosSystemParser.g:2904:1: ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* )
            // InternalRosSystemParser.g:2905:2: ( rule__RosSystem__ProcessesAssignment_3_0_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getProcessesAssignment_3_0_2());
            // InternalRosSystemParser.g:2906:2: ( rule__RosSystem__ProcessesAssignment_3_0_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // InternalRosSystemParser.g:2906:3: rule__RosSystem__ProcessesAssignment_3_0_2
                    {
                    pushFollow(FOLLOW_8);
                    rule__RosSystem__ProcessesAssignment_3_0_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop10;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getProcessesAssignment_3_0_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__3"
    // InternalRosSystemParser.g:2914:1: rule__RosSystem__Group_3_0__3 : rule__RosSystem__Group_3_0__3__Impl ;
    public final void rule__RosSystem__Group_3_0__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2918:1: ( rule__RosSystem__Group_3_0__3__Impl )
            // InternalRosSystemParser.g:2919:2: rule__RosSystem__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__3"


    // $ANTLR start "rule__RosSystem__Group_3_0__3__Impl"
    // InternalRosSystemParser.g:2925:1: rule__RosSystem__Group_3_0__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_0__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2929:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2930:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2930:1: ( RULE_END )
            // InternalRosSystemParser.g:2931:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_0_3());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_0_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__0"
    // InternalRosSystemParser.g:2941:1: rule__RosSystem__Group_3_1__0 : rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1 ;
    public final void rule__RosSystem__Group_3_1__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2945:1: ( rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1 )
            // InternalRosSystemParser.g:2946:2: rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__0"


    // $ANTLR start "rule__RosSystem__Group_3_1__0__Impl"
    // InternalRosSystemParser.g:2953:1: rule__RosSystem__Group_3_1__0__Impl : ( Nodes ) ;
    public final void rule__RosSystem__Group_3_1__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2957:1: ( ( Nodes ) )
            // InternalRosSystemParser.g:2958:1: ( Nodes )
            {
            // InternalRosSystemParser.g:2958:1: ( Nodes )
            // InternalRosSystemParser.g:2959:2: Nodes
            {
             before(grammarAccess.getRosSystemAccess().getNodesKeyword_3_1_0());
            match(input,Nodes,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getNodesKeyword_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__1"
    // InternalRosSystemParser.g:2968:1: rule__RosSystem__Group_3_1__1 : rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2 ;
    public final void rule__RosSystem__Group_3_1__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2972:1: ( rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2 )
            // InternalRosSystemParser.g:2973:2: rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__1"


    // $ANTLR start "rule__RosSystem__Group_3_1__1__Impl"
    // InternalRosSystemParser.g:2980:1: rule__RosSystem__Group_3_1__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_1__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2984:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2985:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2985:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2986:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_1_1());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_1_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__2"
    // InternalRosSystemParser.g:2995:1: rule__RosSystem__Group_3_1__2 : rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3 ;
    public final void rule__RosSystem__Group_3_1__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2999:1: ( rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3 )
            // InternalRosSystemParser.g:3000:2: rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__2"


    // $ANTLR start "rule__RosSystem__Group_3_1__2__Impl"
    // InternalRosSystemParser.g:3007:1: rule__RosSystem__Group_3_1__2__Impl : ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* ) ;
    public final void rule__RosSystem__Group_3_1__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3011:1: ( ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* ) )
            // InternalRosSystemParser.g:3012:1: ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* )
            {
            // InternalRosSystemParser.g:3012:1: ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* )
            // InternalRosSystemParser.g:3013:2: ( rule__RosSystem__ComponentsAssignment_3_1_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getComponentsAssignment_3_1_2());
            // InternalRosSystemParser.g:3014:2: ( rule__RosSystem__ComponentsAssignment_3_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalRosSystemParser.g:3014:3: rule__RosSystem__ComponentsAssignment_3_1_2
                    {
                    pushFollow(FOLLOW_8);
                    rule__RosSystem__ComponentsAssignment_3_1_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop11;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getComponentsAssignment_3_1_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__3"
    // InternalRosSystemParser.g:3022:1: rule__RosSystem__Group_3_1__3 : rule__RosSystem__Group_3_1__3__Impl ;
    public final void rule__RosSystem__Group_3_1__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3026:1: ( rule__RosSystem__Group_3_1__3__Impl )
            // InternalRosSystemParser.g:3027:2: rule__RosSystem__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__3"


    // $ANTLR start "rule__RosSystem__Group_3_1__3__Impl"
    // InternalRosSystemParser.g:3033:1: rule__RosSystem__Group_3_1__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_1__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3037:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3038:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3038:1: ( RULE_END )
            // InternalRosSystemParser.g:3039:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_1_3());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_1_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__0"
    // InternalRosSystemParser.g:3049:1: rule__RosSystem__Group_3_2__0 : rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1 ;
    public final void rule__RosSystem__Group_3_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3053:1: ( rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1 )
            // InternalRosSystemParser.g:3054:2: rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__0"


    // $ANTLR start "rule__RosSystem__Group_3_2__0__Impl"
    // InternalRosSystemParser.g:3061:1: rule__RosSystem__Group_3_2__0__Impl : ( Parameters ) ;
    public final void rule__RosSystem__Group_3_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3065:1: ( ( Parameters ) )
            // InternalRosSystemParser.g:3066:1: ( Parameters )
            {
            // InternalRosSystemParser.g:3066:1: ( Parameters )
            // InternalRosSystemParser.g:3067:2: Parameters
            {
             before(grammarAccess.getRosSystemAccess().getParametersKeyword_3_2_0());
            match(input,Parameters,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getParametersKeyword_3_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__1"
    // InternalRosSystemParser.g:3076:1: rule__RosSystem__Group_3_2__1 : rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2 ;
    public final void rule__RosSystem__Group_3_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3080:1: ( rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2 )
            // InternalRosSystemParser.g:3081:2: rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__1"


    // $ANTLR start "rule__RosSystem__Group_3_2__1__Impl"
    // InternalRosSystemParser.g:3088:1: rule__RosSystem__Group_3_2__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3092:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3093:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3093:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3094:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_2_1());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_2_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__2"
    // InternalRosSystemParser.g:3103:1: rule__RosSystem__Group_3_2__2 : rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3 ;
    public final void rule__RosSystem__Group_3_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3107:1: ( rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3 )
            // InternalRosSystemParser.g:3108:2: rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__2"


    // $ANTLR start "rule__RosSystem__Group_3_2__2__Impl"
    // InternalRosSystemParser.g:3115:1: rule__RosSystem__Group_3_2__2__Impl : ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* ) ;
    public final void rule__RosSystem__Group_3_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3119:1: ( ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* ) )
            // InternalRosSystemParser.g:3120:1: ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* )
            {
            // InternalRosSystemParser.g:3120:1: ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* )
            // InternalRosSystemParser.g:3121:2: ( rule__RosSystem__ParameterAssignment_3_2_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getParameterAssignment_3_2_2());
            // InternalRosSystemParser.g:3122:2: ( rule__RosSystem__ParameterAssignment_3_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
                case 1 :
                    // InternalRosSystemParser.g:3122:3: rule__RosSystem__ParameterAssignment_3_2_2
                    {
                    pushFollow(FOLLOW_10);
                    rule__RosSystem__ParameterAssignment_3_2_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop12;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getParameterAssignment_3_2_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__3"
    // InternalRosSystemParser.g:3130:1: rule__RosSystem__Group_3_2__3 : rule__RosSystem__Group_3_2__3__Impl ;
    public final void rule__RosSystem__Group_3_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3134:1: ( rule__RosSystem__Group_3_2__3__Impl )
            // InternalRosSystemParser.g:3135:2: rule__RosSystem__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__3"


    // $ANTLR start "rule__RosSystem__Group_3_2__3__Impl"
    // InternalRosSystemParser.g:3141:1: rule__RosSystem__Group_3_2__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3145:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3146:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3146:1: ( RULE_END )
            // InternalRosSystemParser.g:3147:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_2_3());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_2_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__0"
    // InternalRosSystemParser.g:3157:1: rule__RosSystem__Group_3_3__0 : rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1 ;
    public final void rule__RosSystem__Group_3_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3161:1: ( rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1 )
            // InternalRosSystemParser.g:3162:2: rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__0"


    // $ANTLR start "rule__RosSystem__Group_3_3__0__Impl"
    // InternalRosSystemParser.g:3169:1: rule__RosSystem__Group_3_3__0__Impl : ( Connections ) ;
    public final void rule__RosSystem__Group_3_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3173:1: ( ( Connections ) )
            // InternalRosSystemParser.g:3174:1: ( Connections )
            {
            // InternalRosSystemParser.g:3174:1: ( Connections )
            // InternalRosSystemParser.g:3175:2: Connections
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsKeyword_3_3_0());
            match(input,Connections,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getConnectionsKeyword_3_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__1"
    // InternalRosSystemParser.g:3184:1: rule__RosSystem__Group_3_3__1 : rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2 ;
    public final void rule__RosSystem__Group_3_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3188:1: ( rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2 )
            // InternalRosSystemParser.g:3189:2: rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__1"


    // $ANTLR start "rule__RosSystem__Group_3_3__1__Impl"
    // InternalRosSystemParser.g:3196:1: rule__RosSystem__Group_3_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3200:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3201:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3201:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3202:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_3_1());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__2"
    // InternalRosSystemParser.g:3211:1: rule__RosSystem__Group_3_3__2 : rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3 ;
    public final void rule__RosSystem__Group_3_3__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3215:1: ( rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3 )
            // InternalRosSystemParser.g:3216:2: rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_3_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__2"


    // $ANTLR start "rule__RosSystem__Group_3_3__2__Impl"
    // InternalRosSystemParser.g:3223:1: rule__RosSystem__Group_3_3__2__Impl : ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* ) ;
    public final void rule__RosSystem__Group_3_3__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3227:1: ( ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* ) )
            // InternalRosSystemParser.g:3228:1: ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* )
            {
            // InternalRosSystemParser.g:3228:1: ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* )
            // InternalRosSystemParser.g:3229:2: ( rule__RosSystem__ConnectionsAssignment_3_3_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsAssignment_3_3_2());
            // InternalRosSystemParser.g:3230:2: ( rule__RosSystem__ConnectionsAssignment_3_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
                case 1 :
                    // InternalRosSystemParser.g:3230:3: rule__RosSystem__ConnectionsAssignment_3_3_2
                    {
                    pushFollow(FOLLOW_10);
                    rule__RosSystem__ConnectionsAssignment_3_3_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop13;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getConnectionsAssignment_3_3_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__3"
    // InternalRosSystemParser.g:3238:1: rule__RosSystem__Group_3_3__3 : rule__RosSystem__Group_3_3__3__Impl ;
    public final void rule__RosSystem__Group_3_3__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3242:1: ( rule__RosSystem__Group_3_3__3__Impl )
            // InternalRosSystemParser.g:3243:2: rule__RosSystem__Group_3_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__3"


    // $ANTLR start "rule__RosSystem__Group_3_3__3__Impl"
    // InternalRosSystemParser.g:3249:1: rule__RosSystem__Group_3_3__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_3__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3253:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3254:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3254:1: ( RULE_END )
            // InternalRosSystemParser.g:3255:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_3_3());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_3_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__3__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // InternalRosSystemParser.g:3265:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3269:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalRosSystemParser.g:3270:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalRosSystemParser.g:3277:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3281:1: ( ( () ) )
            // InternalRosSystemParser.g:3282:1: ( () )
            {
            // InternalRosSystemParser.g:3282:1: ( () )
            // InternalRosSystemParser.g:3283:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0());
            // InternalRosSystemParser.g:3284:2: ()
            // InternalRosSystemParser.g:3284:3:
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalRosSystemParser.g:3292:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3296:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalRosSystemParser.g:3297:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalRosSystemParser.g:3304:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3308:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:3309:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3309:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalRosSystemParser.g:3310:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1());
            // InternalRosSystemParser.g:3311:2: ( rule__Process__NameAssignment_1 )
            // InternalRosSystemParser.g:3311:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalRosSystemParser.g:3319:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3323:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalRosSystemParser.g:3324:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalRosSystemParser.g:3331:1: rule__Process__Group__2__Impl : ( Colon ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3335:1: ( ( Colon ) )
            // InternalRosSystemParser.g:3336:1: ( Colon )
            {
            // InternalRosSystemParser.g:3336:1: ( Colon )
            // InternalRosSystemParser.g:3337:2: Colon
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_2());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getColonKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalRosSystemParser.g:3346:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3350:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalRosSystemParser.g:3351:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalRosSystemParser.g:3358:1: rule__Process__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3362:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3363:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3363:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3364:2: RULE_BEGIN
            {
             before(grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalRosSystemParser.g:3373:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3377:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalRosSystemParser.g:3378:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalRosSystemParser.g:3385:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3389:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalRosSystemParser.g:3390:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalRosSystemParser.g:3390:1: ( ( rule__Process__Group_4__0 )? )
            // InternalRosSystemParser.g:3391:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4());
            // InternalRosSystemParser.g:3392:2: ( rule__Process__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Nodes) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystemParser.g:3392:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalRosSystemParser.g:3400:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3404:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalRosSystemParser.g:3405:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalRosSystemParser.g:3412:1: rule__Process__Group__5__Impl : ( ( rule__Process__Group_5__0 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3416:1: ( ( ( rule__Process__Group_5__0 ) ) )
            // InternalRosSystemParser.g:3417:1: ( ( rule__Process__Group_5__0 ) )
            {
            // InternalRosSystemParser.g:3417:1: ( ( rule__Process__Group_5__0 ) )
            // InternalRosSystemParser.g:3418:2: ( rule__Process__Group_5__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup_5());
            // InternalRosSystemParser.g:3419:2: ( rule__Process__Group_5__0 )
            // InternalRosSystemParser.g:3419:3: rule__Process__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalRosSystemParser.g:3427:1: rule__Process__Group__6 : rule__Process__Group__6__Impl ;
    public final void rule__Process__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3431:1: ( rule__Process__Group__6__Impl )
            // InternalRosSystemParser.g:3432:2: rule__Process__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalRosSystemParser.g:3438:1: rule__Process__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3442:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3443:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3443:1: ( RULE_END )
            // InternalRosSystemParser.g:3444:2: RULE_END
            {
             before(grammarAccess.getProcessAccess().getENDTerminalRuleCall_6());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getENDTerminalRuleCall_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalRosSystemParser.g:3454:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3458:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalRosSystemParser.g:3459:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalRosSystemParser.g:3466:1: rule__Process__Group_4__0__Impl : ( Nodes ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3470:1: ( ( Nodes ) )
            // InternalRosSystemParser.g:3471:1: ( Nodes )
            {
            // InternalRosSystemParser.g:3471:1: ( Nodes )
            // InternalRosSystemParser.g:3472:2: Nodes
            {
             before(grammarAccess.getProcessAccess().getNodesKeyword_4_0());
            match(input,Nodes,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getNodesKeyword_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalRosSystemParser.g:3481:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3485:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalRosSystemParser.g:3486:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalRosSystemParser.g:3493:1: rule__Process__Group_4__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3497:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:3498:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:3498:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:3499:2: LeftSquareBracket
            {
             before(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_4__2"
    // InternalRosSystemParser.g:3508:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3512:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalRosSystemParser.g:3513:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2"


    // $ANTLR start "rule__Process__Group_4__2__Impl"
    // InternalRosSystemParser.g:3520:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__NodesAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3524:1: ( ( ( rule__Process__NodesAssignment_4_2 ) ) )
            // InternalRosSystemParser.g:3525:1: ( ( rule__Process__NodesAssignment_4_2 ) )
            {
            // InternalRosSystemParser.g:3525:1: ( ( rule__Process__NodesAssignment_4_2 ) )
            // InternalRosSystemParser.g:3526:2: ( rule__Process__NodesAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getNodesAssignment_4_2());
            // InternalRosSystemParser.g:3527:2: ( rule__Process__NodesAssignment_4_2 )
            // InternalRosSystemParser.g:3527:3: rule__Process__NodesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NodesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNodesAssignment_4_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group_4__3"
    // InternalRosSystemParser.g:3535:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3539:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalRosSystemParser.g:3540:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3"


    // $ANTLR start "rule__Process__Group_4__3__Impl"
    // InternalRosSystemParser.g:3547:1: rule__Process__Group_4__3__Impl : ( ( ( rule__Process__Group_4_3__0 ) ) ( ( rule__Process__Group_4_3__0 )* ) ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3551:1: ( ( ( ( rule__Process__Group_4_3__0 ) ) ( ( rule__Process__Group_4_3__0 )* ) ) )
            // InternalRosSystemParser.g:3552:1: ( ( ( rule__Process__Group_4_3__0 ) ) ( ( rule__Process__Group_4_3__0 )* ) )
            {
            // InternalRosSystemParser.g:3552:1: ( ( ( rule__Process__Group_4_3__0 ) ) ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalRosSystemParser.g:3553:2: ( ( rule__Process__Group_4_3__0 ) ) ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalRosSystemParser.g:3553:2: ( ( rule__Process__Group_4_3__0 ) )
            // InternalRosSystemParser.g:3554:3: ( rule__Process__Group_4_3__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3());
            // InternalRosSystemParser.g:3555:3: ( rule__Process__Group_4_3__0 )
            // InternalRosSystemParser.g:3555:4: rule__Process__Group_4_3__0
            {
            pushFollow(FOLLOW_17);
            rule__Process__Group_4_3__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup_4_3());

            }

            // InternalRosSystemParser.g:3558:2: ( ( rule__Process__Group_4_3__0 )* )
            // InternalRosSystemParser.g:3559:3: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3());
            // InternalRosSystemParser.g:3560:3: ( rule__Process__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
                case 1 :
                    // InternalRosSystemParser.g:3560:4: rule__Process__Group_4_3__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__Process__Group_4_3__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop15;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4_3());

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3__Impl"


    // $ANTLR start "rule__Process__Group_4__4"
    // InternalRosSystemParser.g:3569:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3573:1: ( rule__Process__Group_4__4__Impl )
            // InternalRosSystemParser.g:3574:2: rule__Process__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4"


    // $ANTLR start "rule__Process__Group_4__4__Impl"
    // InternalRosSystemParser.g:3580:1: rule__Process__Group_4__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3584:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:3585:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:3585:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:3586:2: RightSquareBracket
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4__Impl"


    // $ANTLR start "rule__Process__Group_4_3__0"
    // InternalRosSystemParser.g:3596:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3600:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalRosSystemParser.g:3601:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0"


    // $ANTLR start "rule__Process__Group_4_3__0__Impl"
    // InternalRosSystemParser.g:3608:1: rule__Process__Group_4_3__0__Impl : ( Comma ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3612:1: ( ( Comma ) )
            // InternalRosSystemParser.g:3613:1: ( Comma )
            {
            // InternalRosSystemParser.g:3613:1: ( Comma )
            // InternalRosSystemParser.g:3614:2: Comma
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0__Impl"


    // $ANTLR start "rule__Process__Group_4_3__1"
    // InternalRosSystemParser.g:3623:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3627:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalRosSystemParser.g:3628:2: rule__Process__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1"


    // $ANTLR start "rule__Process__Group_4_3__1__Impl"
    // InternalRosSystemParser.g:3634:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__NodesAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3638:1: ( ( ( rule__Process__NodesAssignment_4_3_1 ) ) )
            // InternalRosSystemParser.g:3639:1: ( ( rule__Process__NodesAssignment_4_3_1 ) )
            {
            // InternalRosSystemParser.g:3639:1: ( ( rule__Process__NodesAssignment_4_3_1 ) )
            // InternalRosSystemParser.g:3640:2: ( rule__Process__NodesAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getNodesAssignment_4_3_1());
            // InternalRosSystemParser.g:3641:2: ( rule__Process__NodesAssignment_4_3_1 )
            // InternalRosSystemParser.g:3641:3: rule__Process__NodesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NodesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNodesAssignment_4_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1__Impl"


    // $ANTLR start "rule__Process__Group_5__0"
    // InternalRosSystemParser.g:3650:1: rule__Process__Group_5__0 : rule__Process__Group_5__0__Impl rule__Process__Group_5__1 ;
    public final void rule__Process__Group_5__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3654:1: ( rule__Process__Group_5__0__Impl rule__Process__Group_5__1 )
            // InternalRosSystemParser.g:3655:2: rule__Process__Group_5__0__Impl rule__Process__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Process__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0"


    // $ANTLR start "rule__Process__Group_5__0__Impl"
    // InternalRosSystemParser.g:3662:1: rule__Process__Group_5__0__Impl : ( Threads ) ;
    public final void rule__Process__Group_5__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3666:1: ( ( Threads ) )
            // InternalRosSystemParser.g:3667:1: ( Threads )
            {
            // InternalRosSystemParser.g:3667:1: ( Threads )
            // InternalRosSystemParser.g:3668:2: Threads
            {
             before(grammarAccess.getProcessAccess().getThreadsKeyword_5_0());
            match(input,Threads,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getThreadsKeyword_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0__Impl"


    // $ANTLR start "rule__Process__Group_5__1"
    // InternalRosSystemParser.g:3677:1: rule__Process__Group_5__1 : rule__Process__Group_5__1__Impl ;
    public final void rule__Process__Group_5__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3681:1: ( rule__Process__Group_5__1__Impl )
            // InternalRosSystemParser.g:3682:2: rule__Process__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1"


    // $ANTLR start "rule__Process__Group_5__1__Impl"
    // InternalRosSystemParser.g:3688:1: rule__Process__Group_5__1__Impl : ( ( rule__Process__ThreadsAssignment_5_1 ) ) ;
    public final void rule__Process__Group_5__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3692:1: ( ( ( rule__Process__ThreadsAssignment_5_1 ) ) )
            // InternalRosSystemParser.g:3693:1: ( ( rule__Process__ThreadsAssignment_5_1 ) )
            {
            // InternalRosSystemParser.g:3693:1: ( ( rule__Process__ThreadsAssignment_5_1 ) )
            // InternalRosSystemParser.g:3694:2: ( rule__Process__ThreadsAssignment_5_1 )
            {
             before(grammarAccess.getProcessAccess().getThreadsAssignment_5_1());
            // InternalRosSystemParser.g:3695:2: ( rule__Process__ThreadsAssignment_5_1 )
            // InternalRosSystemParser.g:3695:3: rule__Process__ThreadsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ThreadsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getThreadsAssignment_5_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentRef__Group__0"
    // InternalRosSystemParser.g:3704:1: rule__ComponentRef__Group__0 : rule__ComponentRef__Group__0__Impl rule__ComponentRef__Group__1 ;
    public final void rule__ComponentRef__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3708:1: ( rule__ComponentRef__Group__0__Impl rule__ComponentRef__Group__1 )
            // InternalRosSystemParser.g:3709:2: rule__ComponentRef__Group__0__Impl rule__ComponentRef__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentRef__Group__0"


    // $ANTLR start "rule__ComponentRef__Group__0__Impl"
    // InternalRosSystemParser.g:3716:1: rule__ComponentRef__Group__0__Impl : ( () ) ;
    public final void rule__ComponentRef__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3720:1: ( ( () ) )
            // InternalRosSystemParser.g:3721:1: ( () )
            {
            // InternalRosSystemParser.g:3721:1: ( () )
            // InternalRosSystemParser.g:3722:2: ()
            {
             before(grammarAccess.getComponentRefAccess().getComponentRefAction_0());
            // InternalRosSystemParser.g:3723:2: ()
            // InternalRosSystemParser.g:3723:3:
            {
            }

             after(grammarAccess.getComponentRefAccess().getComponentRefAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentRef__Group__0__Impl"


    // $ANTLR start "rule__ComponentRef__Group__1"
    // InternalRosSystemParser.g:3731:1: rule__ComponentRef__Group__1 : rule__ComponentRef__Group__1__Impl ;
    public final void rule__ComponentRef__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3735:1: ( rule__ComponentRef__Group__1__Impl )
            // InternalRosSystemParser.g:3736:2: rule__ComponentRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentRef__Group__1"


    // $ANTLR start "rule__ComponentRef__Group__1__Impl"
    // InternalRosSystemParser.g:3742:1: rule__ComponentRef__Group__1__Impl : ( ( rule__ComponentRef__ComponentRefAssignment_1 ) ) ;
    public final void rule__ComponentRef__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3746:1: ( ( ( rule__ComponentRef__ComponentRefAssignment_1 ) ) )
            // InternalRosSystemParser.g:3747:1: ( ( rule__ComponentRef__ComponentRefAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3747:1: ( ( rule__ComponentRef__ComponentRefAssignment_1 ) )
            // InternalRosSystemParser.g:3748:2: ( rule__ComponentRef__ComponentRefAssignment_1 )
            {
             before(grammarAccess.getComponentRefAccess().getComponentRefAssignment_1());
            // InternalRosSystemParser.g:3749:2: ( rule__ComponentRef__ComponentRefAssignment_1 )
            // InternalRosSystemParser.g:3749:3: rule__ComponentRef__ComponentRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentRef__ComponentRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentRefAccess().getComponentRefAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentRef__Group__1__Impl"


    // $ANTLR start "rule__RosNode__Group__0"
    // InternalRosSystemParser.g:3758:1: rule__RosNode__Group__0 : rule__RosNode__Group__0__Impl rule__RosNode__Group__1 ;
    public final void rule__RosNode__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3762:1: ( rule__RosNode__Group__0__Impl rule__RosNode__Group__1 )
            // InternalRosSystemParser.g:3763:2: rule__RosNode__Group__0__Impl rule__RosNode__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__0"


    // $ANTLR start "rule__RosNode__Group__0__Impl"
    // InternalRosSystemParser.g:3770:1: rule__RosNode__Group__0__Impl : ( () ) ;
    public final void rule__RosNode__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3774:1: ( ( () ) )
            // InternalRosSystemParser.g:3775:1: ( () )
            {
            // InternalRosSystemParser.g:3775:1: ( () )
            // InternalRosSystemParser.g:3776:2: ()
            {
             before(grammarAccess.getRosNodeAccess().getRosNodeAction_0());
            // InternalRosSystemParser.g:3777:2: ()
            // InternalRosSystemParser.g:3777:3:
            {
            }

             after(grammarAccess.getRosNodeAccess().getRosNodeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__0__Impl"


    // $ANTLR start "rule__RosNode__Group__1"
    // InternalRosSystemParser.g:3785:1: rule__RosNode__Group__1 : rule__RosNode__Group__1__Impl rule__RosNode__Group__2 ;
    public final void rule__RosNode__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3789:1: ( rule__RosNode__Group__1__Impl rule__RosNode__Group__2 )
            // InternalRosSystemParser.g:3790:2: rule__RosNode__Group__1__Impl rule__RosNode__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RosNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__1"


    // $ANTLR start "rule__RosNode__Group__1__Impl"
    // InternalRosSystemParser.g:3797:1: rule__RosNode__Group__1__Impl : ( ( rule__RosNode__NameAssignment_1 ) ) ;
    public final void rule__RosNode__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3801:1: ( ( ( rule__RosNode__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:3802:1: ( ( rule__RosNode__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3802:1: ( ( rule__RosNode__NameAssignment_1 ) )
            // InternalRosSystemParser.g:3803:2: ( rule__RosNode__NameAssignment_1 )
            {
             before(grammarAccess.getRosNodeAccess().getNameAssignment_1());
            // InternalRosSystemParser.g:3804:2: ( rule__RosNode__NameAssignment_1 )
            // InternalRosSystemParser.g:3804:3: rule__RosNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getNameAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__1__Impl"


    // $ANTLR start "rule__RosNode__Group__2"
    // InternalRosSystemParser.g:3812:1: rule__RosNode__Group__2 : rule__RosNode__Group__2__Impl rule__RosNode__Group__3 ;
    public final void rule__RosNode__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3816:1: ( rule__RosNode__Group__2__Impl rule__RosNode__Group__3 )
            // InternalRosSystemParser.g:3817:2: rule__RosNode__Group__2__Impl rule__RosNode__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RosNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__2"


    // $ANTLR start "rule__RosNode__Group__2__Impl"
    // InternalRosSystemParser.g:3824:1: rule__RosNode__Group__2__Impl : ( Colon ) ;
    public final void rule__RosNode__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3828:1: ( ( Colon ) )
            // InternalRosSystemParser.g:3829:1: ( Colon )
            {
            // InternalRosSystemParser.g:3829:1: ( Colon )
            // InternalRosSystemParser.g:3830:2: Colon
            {
             before(grammarAccess.getRosNodeAccess().getColonKeyword_2());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getColonKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__2__Impl"


    // $ANTLR start "rule__RosNode__Group__3"
    // InternalRosSystemParser.g:3839:1: rule__RosNode__Group__3 : rule__RosNode__Group__3__Impl rule__RosNode__Group__4 ;
    public final void rule__RosNode__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3843:1: ( rule__RosNode__Group__3__Impl rule__RosNode__Group__4 )
            // InternalRosSystemParser.g:3844:2: rule__RosNode__Group__3__Impl rule__RosNode__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__RosNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__3"


    // $ANTLR start "rule__RosNode__Group__3__Impl"
    // InternalRosSystemParser.g:3851:1: rule__RosNode__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3855:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3856:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3856:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3857:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__3__Impl"


    // $ANTLR start "rule__RosNode__Group__4"
    // InternalRosSystemParser.g:3866:1: rule__RosNode__Group__4 : rule__RosNode__Group__4__Impl rule__RosNode__Group__5 ;
    public final void rule__RosNode__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3870:1: ( rule__RosNode__Group__4__Impl rule__RosNode__Group__5 )
            // InternalRosSystemParser.g:3871:2: rule__RosNode__Group__4__Impl rule__RosNode__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RosNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__4"


    // $ANTLR start "rule__RosNode__Group__4__Impl"
    // InternalRosSystemParser.g:3878:1: rule__RosNode__Group__4__Impl : ( From ) ;
    public final void rule__RosNode__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3882:1: ( ( From ) )
            // InternalRosSystemParser.g:3883:1: ( From )
            {
            // InternalRosSystemParser.g:3883:1: ( From )
            // InternalRosSystemParser.g:3884:2: From
            {
             before(grammarAccess.getRosNodeAccess().getFromKeyword_4());
            match(input,From,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getFromKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__4__Impl"


    // $ANTLR start "rule__RosNode__Group__5"
    // InternalRosSystemParser.g:3893:1: rule__RosNode__Group__5 : rule__RosNode__Group__5__Impl rule__RosNode__Group__6 ;
    public final void rule__RosNode__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3897:1: ( rule__RosNode__Group__5__Impl rule__RosNode__Group__6 )
            // InternalRosSystemParser.g:3898:2: rule__RosNode__Group__5__Impl rule__RosNode__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__RosNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__5"


    // $ANTLR start "rule__RosNode__Group__5__Impl"
    // InternalRosSystemParser.g:3905:1: rule__RosNode__Group__5__Impl : ( ( rule__RosNode__FromAssignment_5 ) ) ;
    public final void rule__RosNode__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3909:1: ( ( ( rule__RosNode__FromAssignment_5 ) ) )
            // InternalRosSystemParser.g:3910:1: ( ( rule__RosNode__FromAssignment_5 ) )
            {
            // InternalRosSystemParser.g:3910:1: ( ( rule__RosNode__FromAssignment_5 ) )
            // InternalRosSystemParser.g:3911:2: ( rule__RosNode__FromAssignment_5 )
            {
             before(grammarAccess.getRosNodeAccess().getFromAssignment_5());
            // InternalRosSystemParser.g:3912:2: ( rule__RosNode__FromAssignment_5 )
            // InternalRosSystemParser.g:3912:3: rule__RosNode__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getFromAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__5__Impl"


    // $ANTLR start "rule__RosNode__Group__6"
    // InternalRosSystemParser.g:3920:1: rule__RosNode__Group__6 : rule__RosNode__Group__6__Impl rule__RosNode__Group__7 ;
    public final void rule__RosNode__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3924:1: ( rule__RosNode__Group__6__Impl rule__RosNode__Group__7 )
            // InternalRosSystemParser.g:3925:2: rule__RosNode__Group__6__Impl rule__RosNode__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__RosNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__6"


    // $ANTLR start "rule__RosNode__Group__6__Impl"
    // InternalRosSystemParser.g:3932:1: rule__RosNode__Group__6__Impl : ( ( rule__RosNode__Group_6__0 )? ) ;
    public final void rule__RosNode__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3936:1: ( ( ( rule__RosNode__Group_6__0 )? ) )
            // InternalRosSystemParser.g:3937:1: ( ( rule__RosNode__Group_6__0 )? )
            {
            // InternalRosSystemParser.g:3937:1: ( ( rule__RosNode__Group_6__0 )? )
            // InternalRosSystemParser.g:3938:2: ( rule__RosNode__Group_6__0 )?
            {
             before(grammarAccess.getRosNodeAccess().getGroup_6());
            // InternalRosSystemParser.g:3939:2: ( rule__RosNode__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Interfaces) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystemParser.g:3939:3: rule__RosNode__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosNode__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosNodeAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__6__Impl"


    // $ANTLR start "rule__RosNode__Group__7"
    // InternalRosSystemParser.g:3947:1: rule__RosNode__Group__7 : rule__RosNode__Group__7__Impl rule__RosNode__Group__8 ;
    public final void rule__RosNode__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3951:1: ( rule__RosNode__Group__7__Impl rule__RosNode__Group__8 )
            // InternalRosSystemParser.g:3952:2: rule__RosNode__Group__7__Impl rule__RosNode__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__RosNode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__7"


    // $ANTLR start "rule__RosNode__Group__7__Impl"
    // InternalRosSystemParser.g:3959:1: rule__RosNode__Group__7__Impl : ( ( rule__RosNode__Group_7__0 )? ) ;
    public final void rule__RosNode__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3963:1: ( ( ( rule__RosNode__Group_7__0 )? ) )
            // InternalRosSystemParser.g:3964:1: ( ( rule__RosNode__Group_7__0 )? )
            {
            // InternalRosSystemParser.g:3964:1: ( ( rule__RosNode__Group_7__0 )? )
            // InternalRosSystemParser.g:3965:2: ( rule__RosNode__Group_7__0 )?
            {
             before(grammarAccess.getRosNodeAccess().getGroup_7());
            // InternalRosSystemParser.g:3966:2: ( rule__RosNode__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Parameters) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystemParser.g:3966:3: rule__RosNode__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosNode__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosNodeAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__7__Impl"


    // $ANTLR start "rule__RosNode__Group__8"
    // InternalRosSystemParser.g:3974:1: rule__RosNode__Group__8 : rule__RosNode__Group__8__Impl ;
    public final void rule__RosNode__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3978:1: ( rule__RosNode__Group__8__Impl )
            // InternalRosSystemParser.g:3979:2: rule__RosNode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__8"


    // $ANTLR start "rule__RosNode__Group__8__Impl"
    // InternalRosSystemParser.g:3985:1: rule__RosNode__Group__8__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3989:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3990:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3990:1: ( RULE_END )
            // InternalRosSystemParser.g:3991:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__8__Impl"


    // $ANTLR start "rule__RosNode__Group_6__0"
    // InternalRosSystemParser.g:4001:1: rule__RosNode__Group_6__0 : rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1 ;
    public final void rule__RosNode__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4005:1: ( rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1 )
            // InternalRosSystemParser.g:4006:2: rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RosNode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__0"


    // $ANTLR start "rule__RosNode__Group_6__0__Impl"
    // InternalRosSystemParser.g:4013:1: rule__RosNode__Group_6__0__Impl : ( Interfaces ) ;
    public final void rule__RosNode__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4017:1: ( ( Interfaces ) )
            // InternalRosSystemParser.g:4018:1: ( Interfaces )
            {
            // InternalRosSystemParser.g:4018:1: ( Interfaces )
            // InternalRosSystemParser.g:4019:2: Interfaces
            {
             before(grammarAccess.getRosNodeAccess().getInterfacesKeyword_6_0());
            match(input,Interfaces,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getInterfacesKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__0__Impl"


    // $ANTLR start "rule__RosNode__Group_6__1"
    // InternalRosSystemParser.g:4028:1: rule__RosNode__Group_6__1 : rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2 ;
    public final void rule__RosNode__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4032:1: ( rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2 )
            // InternalRosSystemParser.g:4033:2: rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__RosNode__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__1"


    // $ANTLR start "rule__RosNode__Group_6__1__Impl"
    // InternalRosSystemParser.g:4040:1: rule__RosNode__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4044:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4045:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4045:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4046:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_6_1());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__1__Impl"


    // $ANTLR start "rule__RosNode__Group_6__2"
    // InternalRosSystemParser.g:4055:1: rule__RosNode__Group_6__2 : rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3 ;
    public final void rule__RosNode__Group_6__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4059:1: ( rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3 )
            // InternalRosSystemParser.g:4060:2: rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__RosNode__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__2"


    // $ANTLR start "rule__RosNode__Group_6__2__Impl"
    // InternalRosSystemParser.g:4067:1: rule__RosNode__Group_6__2__Impl : ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* ) ;
    public final void rule__RosNode__Group_6__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4071:1: ( ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* ) )
            // InternalRosSystemParser.g:4072:1: ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* )
            {
            // InternalRosSystemParser.g:4072:1: ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* )
            // InternalRosSystemParser.g:4073:2: ( rule__RosNode__RosinterfacesAssignment_6_2 )*
            {
             before(grammarAccess.getRosNodeAccess().getRosinterfacesAssignment_6_2());
            // InternalRosSystemParser.g:4074:2: ( rule__RosNode__RosinterfacesAssignment_6_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
                case 1 :
                    // InternalRosSystemParser.g:4074:3: rule__RosNode__RosinterfacesAssignment_6_2
                    {
                    pushFollow(FOLLOW_8);
                    rule__RosNode__RosinterfacesAssignment_6_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop18;
                }
            } while (true);

             after(grammarAccess.getRosNodeAccess().getRosinterfacesAssignment_6_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__2__Impl"


    // $ANTLR start "rule__RosNode__Group_6__3"
    // InternalRosSystemParser.g:4082:1: rule__RosNode__Group_6__3 : rule__RosNode__Group_6__3__Impl ;
    public final void rule__RosNode__Group_6__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4086:1: ( rule__RosNode__Group_6__3__Impl )
            // InternalRosSystemParser.g:4087:2: rule__RosNode__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__3"


    // $ANTLR start "rule__RosNode__Group_6__3__Impl"
    // InternalRosSystemParser.g:4093:1: rule__RosNode__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group_6__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4097:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4098:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4098:1: ( RULE_END )
            // InternalRosSystemParser.g:4099:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_6_3());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_6_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__3__Impl"


    // $ANTLR start "rule__RosNode__Group_7__0"
    // InternalRosSystemParser.g:4109:1: rule__RosNode__Group_7__0 : rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1 ;
    public final void rule__RosNode__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4113:1: ( rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1 )
            // InternalRosSystemParser.g:4114:2: rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__RosNode__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__0"


    // $ANTLR start "rule__RosNode__Group_7__0__Impl"
    // InternalRosSystemParser.g:4121:1: rule__RosNode__Group_7__0__Impl : ( Parameters ) ;
    public final void rule__RosNode__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4125:1: ( ( Parameters ) )
            // InternalRosSystemParser.g:4126:1: ( Parameters )
            {
            // InternalRosSystemParser.g:4126:1: ( Parameters )
            // InternalRosSystemParser.g:4127:2: Parameters
            {
             before(grammarAccess.getRosNodeAccess().getParametersKeyword_7_0());
            match(input,Parameters,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getParametersKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__0__Impl"


    // $ANTLR start "rule__RosNode__Group_7__1"
    // InternalRosSystemParser.g:4136:1: rule__RosNode__Group_7__1 : rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2 ;
    public final void rule__RosNode__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4140:1: ( rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2 )
            // InternalRosSystemParser.g:4141:2: rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__RosNode__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__1"


    // $ANTLR start "rule__RosNode__Group_7__1__Impl"
    // InternalRosSystemParser.g:4148:1: rule__RosNode__Group_7__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4152:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4153:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4153:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4154:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__1__Impl"


    // $ANTLR start "rule__RosNode__Group_7__2"
    // InternalRosSystemParser.g:4163:1: rule__RosNode__Group_7__2 : rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3 ;
    public final void rule__RosNode__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4167:1: ( rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3 )
            // InternalRosSystemParser.g:4168:2: rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__RosNode__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__2"


    // $ANTLR start "rule__RosNode__Group_7__2__Impl"
    // InternalRosSystemParser.g:4175:1: rule__RosNode__Group_7__2__Impl : ( ( rule__RosNode__RosparametersAssignment_7_2 )* ) ;
    public final void rule__RosNode__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4179:1: ( ( ( rule__RosNode__RosparametersAssignment_7_2 )* ) )
            // InternalRosSystemParser.g:4180:1: ( ( rule__RosNode__RosparametersAssignment_7_2 )* )
            {
            // InternalRosSystemParser.g:4180:1: ( ( rule__RosNode__RosparametersAssignment_7_2 )* )
            // InternalRosSystemParser.g:4181:2: ( rule__RosNode__RosparametersAssignment_7_2 )*
            {
             before(grammarAccess.getRosNodeAccess().getRosparametersAssignment_7_2());
            // InternalRosSystemParser.g:4182:2: ( rule__RosNode__RosparametersAssignment_7_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==HyphenMinus) ) {
                    alt19=1;
                }


                switch (alt19) {
                case 1 :
                    // InternalRosSystemParser.g:4182:3: rule__RosNode__RosparametersAssignment_7_2
                    {
                    pushFollow(FOLLOW_10);
                    rule__RosNode__RosparametersAssignment_7_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop19;
                }
            } while (true);

             after(grammarAccess.getRosNodeAccess().getRosparametersAssignment_7_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__2__Impl"


    // $ANTLR start "rule__RosNode__Group_7__3"
    // InternalRosSystemParser.g:4190:1: rule__RosNode__Group_7__3 : rule__RosNode__Group_7__3__Impl ;
    public final void rule__RosNode__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4194:1: ( rule__RosNode__Group_7__3__Impl )
            // InternalRosSystemParser.g:4195:2: rule__RosNode__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__3"


    // $ANTLR start "rule__RosNode__Group_7__3__Impl"
    // InternalRosSystemParser.g:4201:1: rule__RosNode__Group_7__3__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4205:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4206:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4206:1: ( RULE_END )
            // InternalRosSystemParser.g:4207:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__3__Impl"


    // $ANTLR start "rule__RosInterface__Group__0"
    // InternalRosSystemParser.g:4217:1: rule__RosInterface__Group__0 : rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1 ;
    public final void rule__RosInterface__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4221:1: ( rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1 )
            // InternalRosSystemParser.g:4222:2: rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__0"


    // $ANTLR start "rule__RosInterface__Group__0__Impl"
    // InternalRosSystemParser.g:4229:1: rule__RosInterface__Group__0__Impl : ( ( rule__RosInterface__NameAssignment_0 ) ) ;
    public final void rule__RosInterface__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4233:1: ( ( ( rule__RosInterface__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:4234:1: ( ( rule__RosInterface__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:4234:1: ( ( rule__RosInterface__NameAssignment_0 ) )
            // InternalRosSystemParser.g:4235:2: ( rule__RosInterface__NameAssignment_0 )
            {
             before(grammarAccess.getRosInterfaceAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:4236:2: ( rule__RosInterface__NameAssignment_0 )
            // InternalRosSystemParser.g:4236:3: rule__RosInterface__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getNameAssignment_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__0__Impl"


    // $ANTLR start "rule__RosInterface__Group__1"
    // InternalRosSystemParser.g:4244:1: rule__RosInterface__Group__1 : rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2 ;
    public final void rule__RosInterface__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4248:1: ( rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2 )
            // InternalRosSystemParser.g:4249:2: rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__1"


    // $ANTLR start "rule__RosInterface__Group__1__Impl"
    // InternalRosSystemParser.g:4256:1: rule__RosInterface__Group__1__Impl : ( Colon ) ;
    public final void rule__RosInterface__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4260:1: ( ( Colon ) )
            // InternalRosSystemParser.g:4261:1: ( Colon )
            {
            // InternalRosSystemParser.g:4261:1: ( Colon )
            // InternalRosSystemParser.g:4262:2: Colon
            {
             before(grammarAccess.getRosInterfaceAccess().getColonKeyword_1());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getRosInterfaceAccess().getColonKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__1__Impl"


    // $ANTLR start "rule__RosInterface__Group__2"
    // InternalRosSystemParser.g:4271:1: rule__RosInterface__Group__2 : rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3 ;
    public final void rule__RosInterface__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4275:1: ( rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3 )
            // InternalRosSystemParser.g:4276:2: rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__RosInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__2"


    // $ANTLR start "rule__RosInterface__Group__2__Impl"
    // InternalRosSystemParser.g:4283:1: rule__RosInterface__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosInterface__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4287:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4288:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4288:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4289:2: RULE_BEGIN
            {
             before(grammarAccess.getRosInterfaceAccess().getBEGINTerminalRuleCall_2());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosInterfaceAccess().getBEGINTerminalRuleCall_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__2__Impl"


    // $ANTLR start "rule__RosInterface__Group__3"
    // InternalRosSystemParser.g:4298:1: rule__RosInterface__Group__3 : rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4 ;
    public final void rule__RosInterface__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4302:1: ( rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4 )
            // InternalRosSystemParser.g:4303:2: rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RosInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__3"


    // $ANTLR start "rule__RosInterface__Group__3__Impl"
    // InternalRosSystemParser.g:4310:1: rule__RosInterface__Group__3__Impl : ( ( rule__RosInterface__ReferenceAssignment_3 ) ) ;
    public final void rule__RosInterface__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4314:1: ( ( ( rule__RosInterface__ReferenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:4315:1: ( ( rule__RosInterface__ReferenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:4315:1: ( ( rule__RosInterface__ReferenceAssignment_3 ) )
            // InternalRosSystemParser.g:4316:2: ( rule__RosInterface__ReferenceAssignment_3 )
            {
             before(grammarAccess.getRosInterfaceAccess().getReferenceAssignment_3());
            // InternalRosSystemParser.g:4317:2: ( rule__RosInterface__ReferenceAssignment_3 )
            // InternalRosSystemParser.g:4317:3: rule__RosInterface__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getReferenceAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__3__Impl"


    // $ANTLR start "rule__RosInterface__Group__4"
    // InternalRosSystemParser.g:4325:1: rule__RosInterface__Group__4 : rule__RosInterface__Group__4__Impl ;
    public final void rule__RosInterface__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4329:1: ( rule__RosInterface__Group__4__Impl )
            // InternalRosSystemParser.g:4330:2: rule__RosInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__4"


    // $ANTLR start "rule__RosInterface__Group__4__Impl"
    // InternalRosSystemParser.g:4336:1: rule__RosInterface__Group__4__Impl : ( RULE_END ) ;
    public final void rule__RosInterface__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4340:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4341:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4341:1: ( RULE_END )
            // InternalRosSystemParser.g:4342:2: RULE_END
            {
             before(grammarAccess.getRosInterfaceAccess().getENDTerminalRuleCall_4());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosInterfaceAccess().getENDTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__4__Impl"


    // $ANTLR start "rule__RosPublisherReference__Group__0"
    // InternalRosSystemParser.g:4352:1: rule__RosPublisherReference__Group__0 : rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1 ;
    public final void rule__RosPublisherReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4356:1: ( rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1 )
            // InternalRosSystemParser.g:4357:2: rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosPublisherReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__0"


    // $ANTLR start "rule__RosPublisherReference__Group__0__Impl"
    // InternalRosSystemParser.g:4364:1: rule__RosPublisherReference__Group__0__Impl : ( FromPub ) ;
    public final void rule__RosPublisherReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4368:1: ( ( FromPub ) )
            // InternalRosSystemParser.g:4369:1: ( FromPub )
            {
            // InternalRosSystemParser.g:4369:1: ( FromPub )
            // InternalRosSystemParser.g:4370:2: FromPub
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPubKeyword_0());
            match(input,FromPub,FOLLOW_2);
             after(grammarAccess.getRosPublisherReferenceAccess().getFromPubKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__0__Impl"


    // $ANTLR start "rule__RosPublisherReference__Group__1"
    // InternalRosSystemParser.g:4379:1: rule__RosPublisherReference__Group__1 : rule__RosPublisherReference__Group__1__Impl ;
    public final void rule__RosPublisherReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4383:1: ( rule__RosPublisherReference__Group__1__Impl )
            // InternalRosSystemParser.g:4384:2: rule__RosPublisherReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__1"


    // $ANTLR start "rule__RosPublisherReference__Group__1__Impl"
    // InternalRosSystemParser.g:4390:1: rule__RosPublisherReference__Group__1__Impl : ( ( rule__RosPublisherReference__FromAssignment_1 ) ) ;
    public final void rule__RosPublisherReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4394:1: ( ( ( rule__RosPublisherReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4395:1: ( ( rule__RosPublisherReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4395:1: ( ( rule__RosPublisherReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4396:2: ( rule__RosPublisherReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4397:2: ( rule__RosPublisherReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4397:3: rule__RosPublisherReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherReferenceAccess().getFromAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__1__Impl"


    // $ANTLR start "rule__RosSubscriberReference__Group__0"
    // InternalRosSystemParser.g:4406:1: rule__RosSubscriberReference__Group__0 : rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1 ;
    public final void rule__RosSubscriberReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4410:1: ( rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1 )
            // InternalRosSystemParser.g:4411:2: rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosSubscriberReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__0"


    // $ANTLR start "rule__RosSubscriberReference__Group__0__Impl"
    // InternalRosSystemParser.g:4418:1: rule__RosSubscriberReference__Group__0__Impl : ( FromSub ) ;
    public final void rule__RosSubscriberReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4422:1: ( ( FromSub ) )
            // InternalRosSystemParser.g:4423:1: ( FromSub )
            {
            // InternalRosSystemParser.g:4423:1: ( FromSub )
            // InternalRosSystemParser.g:4424:2: FromSub
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubKeyword_0());
            match(input,FromSub,FOLLOW_2);
             after(grammarAccess.getRosSubscriberReferenceAccess().getFromSubKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__0__Impl"


    // $ANTLR start "rule__RosSubscriberReference__Group__1"
    // InternalRosSystemParser.g:4433:1: rule__RosSubscriberReference__Group__1 : rule__RosSubscriberReference__Group__1__Impl ;
    public final void rule__RosSubscriberReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4437:1: ( rule__RosSubscriberReference__Group__1__Impl )
            // InternalRosSystemParser.g:4438:2: rule__RosSubscriberReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__1"


    // $ANTLR start "rule__RosSubscriberReference__Group__1__Impl"
    // InternalRosSystemParser.g:4444:1: rule__RosSubscriberReference__Group__1__Impl : ( ( rule__RosSubscriberReference__FromAssignment_1 ) ) ;
    public final void rule__RosSubscriberReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4448:1: ( ( ( rule__RosSubscriberReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4449:1: ( ( rule__RosSubscriberReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4449:1: ( ( rule__RosSubscriberReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4450:2: ( rule__RosSubscriberReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4451:2: ( rule__RosSubscriberReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4451:3: rule__RosSubscriberReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberReferenceAccess().getFromAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__1__Impl"


    // $ANTLR start "rule__RosServiceServerReference__Group__0"
    // InternalRosSystemParser.g:4460:1: rule__RosServiceServerReference__Group__0 : rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1 ;
    public final void rule__RosServiceServerReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4464:1: ( rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1 )
            // InternalRosSystemParser.g:4465:2: rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosServiceServerReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__0"


    // $ANTLR start "rule__RosServiceServerReference__Group__0__Impl"
    // InternalRosSystemParser.g:4472:1: rule__RosServiceServerReference__Group__0__Impl : ( FromSS ) ;
    public final void rule__RosServiceServerReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4476:1: ( ( FromSS ) )
            // InternalRosSystemParser.g:4477:1: ( FromSS )
            {
            // InternalRosSystemParser.g:4477:1: ( FromSS )
            // InternalRosSystemParser.g:4478:2: FromSS
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromSSKeyword_0());
            match(input,FromSS,FOLLOW_2);
             after(grammarAccess.getRosServiceServerReferenceAccess().getFromSSKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__0__Impl"


    // $ANTLR start "rule__RosServiceServerReference__Group__1"
    // InternalRosSystemParser.g:4487:1: rule__RosServiceServerReference__Group__1 : rule__RosServiceServerReference__Group__1__Impl ;
    public final void rule__RosServiceServerReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4491:1: ( rule__RosServiceServerReference__Group__1__Impl )
            // InternalRosSystemParser.g:4492:2: rule__RosServiceServerReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__1"


    // $ANTLR start "rule__RosServiceServerReference__Group__1__Impl"
    // InternalRosSystemParser.g:4498:1: rule__RosServiceServerReference__Group__1__Impl : ( ( rule__RosServiceServerReference__FromAssignment_1 ) ) ;
    public final void rule__RosServiceServerReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4502:1: ( ( ( rule__RosServiceServerReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4503:1: ( ( rule__RosServiceServerReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4503:1: ( ( rule__RosServiceServerReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4504:2: ( rule__RosServiceServerReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4505:2: ( rule__RosServiceServerReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4505:3: rule__RosServiceServerReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerReferenceAccess().getFromAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__1__Impl"


    // $ANTLR start "rule__RosServerClientReference__Group__0"
    // InternalRosSystemParser.g:4514:1: rule__RosServerClientReference__Group__0 : rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1 ;
    public final void rule__RosServerClientReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4518:1: ( rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1 )
            // InternalRosSystemParser.g:4519:2: rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosServerClientReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__0"


    // $ANTLR start "rule__RosServerClientReference__Group__0__Impl"
    // InternalRosSystemParser.g:4526:1: rule__RosServerClientReference__Group__0__Impl : ( FromSC ) ;
    public final void rule__RosServerClientReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4530:1: ( ( FromSC ) )
            // InternalRosSystemParser.g:4531:1: ( FromSC )
            {
            // InternalRosSystemParser.g:4531:1: ( FromSC )
            // InternalRosSystemParser.g:4532:2: FromSC
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromSCKeyword_0());
            match(input,FromSC,FOLLOW_2);
             after(grammarAccess.getRosServerClientReferenceAccess().getFromSCKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__0__Impl"


    // $ANTLR start "rule__RosServerClientReference__Group__1"
    // InternalRosSystemParser.g:4541:1: rule__RosServerClientReference__Group__1 : rule__RosServerClientReference__Group__1__Impl ;
    public final void rule__RosServerClientReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4545:1: ( rule__RosServerClientReference__Group__1__Impl )
            // InternalRosSystemParser.g:4546:2: rule__RosServerClientReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__1"


    // $ANTLR start "rule__RosServerClientReference__Group__1__Impl"
    // InternalRosSystemParser.g:4552:1: rule__RosServerClientReference__Group__1__Impl : ( ( rule__RosServerClientReference__FromAssignment_1 ) ) ;
    public final void rule__RosServerClientReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4556:1: ( ( ( rule__RosServerClientReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4557:1: ( ( rule__RosServerClientReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4557:1: ( ( rule__RosServerClientReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4558:2: ( rule__RosServerClientReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4559:2: ( rule__RosServerClientReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4559:3: rule__RosServerClientReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServerClientReferenceAccess().getFromAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__1__Impl"


    // $ANTLR start "rule__RosActionServerReference__Group__0"
    // InternalRosSystemParser.g:4568:1: rule__RosActionServerReference__Group__0 : rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1 ;
    public final void rule__RosActionServerReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4572:1: ( rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1 )
            // InternalRosSystemParser.g:4573:2: rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosActionServerReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__0"


    // $ANTLR start "rule__RosActionServerReference__Group__0__Impl"
    // InternalRosSystemParser.g:4580:1: rule__RosActionServerReference__Group__0__Impl : ( FromAS ) ;
    public final void rule__RosActionServerReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4584:1: ( ( FromAS ) )
            // InternalRosSystemParser.g:4585:1: ( FromAS )
            {
            // InternalRosSystemParser.g:4585:1: ( FromAS )
            // InternalRosSystemParser.g:4586:2: FromAS
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromASKeyword_0());
            match(input,FromAS,FOLLOW_2);
             after(grammarAccess.getRosActionServerReferenceAccess().getFromASKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__0__Impl"


    // $ANTLR start "rule__RosActionServerReference__Group__1"
    // InternalRosSystemParser.g:4595:1: rule__RosActionServerReference__Group__1 : rule__RosActionServerReference__Group__1__Impl ;
    public final void rule__RosActionServerReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4599:1: ( rule__RosActionServerReference__Group__1__Impl )
            // InternalRosSystemParser.g:4600:2: rule__RosActionServerReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__1"


    // $ANTLR start "rule__RosActionServerReference__Group__1__Impl"
    // InternalRosSystemParser.g:4606:1: rule__RosActionServerReference__Group__1__Impl : ( ( rule__RosActionServerReference__FromAssignment_1 ) ) ;
    public final void rule__RosActionServerReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4610:1: ( ( ( rule__RosActionServerReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4611:1: ( ( rule__RosActionServerReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4611:1: ( ( rule__RosActionServerReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4612:2: ( rule__RosActionServerReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4613:2: ( rule__RosActionServerReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4613:3: rule__RosActionServerReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerReferenceAccess().getFromAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__1__Impl"


    // $ANTLR start "rule__RosActionClientReference__Group__0"
    // InternalRosSystemParser.g:4622:1: rule__RosActionClientReference__Group__0 : rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1 ;
    public final void rule__RosActionClientReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4626:1: ( rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1 )
            // InternalRosSystemParser.g:4627:2: rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosActionClientReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__0"


    // $ANTLR start "rule__RosActionClientReference__Group__0__Impl"
    // InternalRosSystemParser.g:4634:1: rule__RosActionClientReference__Group__0__Impl : ( FromAC ) ;
    public final void rule__RosActionClientReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4638:1: ( ( FromAC ) )
            // InternalRosSystemParser.g:4639:1: ( FromAC )
            {
            // InternalRosSystemParser.g:4639:1: ( FromAC )
            // InternalRosSystemParser.g:4640:2: FromAC
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromACKeyword_0());
            match(input,FromAC,FOLLOW_2);
             after(grammarAccess.getRosActionClientReferenceAccess().getFromACKeyword_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__0__Impl"


    // $ANTLR start "rule__RosActionClientReference__Group__1"
    // InternalRosSystemParser.g:4649:1: rule__RosActionClientReference__Group__1 : rule__RosActionClientReference__Group__1__Impl ;
    public final void rule__RosActionClientReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4653:1: ( rule__RosActionClientReference__Group__1__Impl )
            // InternalRosSystemParser.g:4654:2: rule__RosActionClientReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__1"


    // $ANTLR start "rule__RosActionClientReference__Group__1__Impl"
    // InternalRosSystemParser.g:4660:1: rule__RosActionClientReference__Group__1__Impl : ( ( rule__RosActionClientReference__FromAssignment_1 ) ) ;
    public final void rule__RosActionClientReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4664:1: ( ( ( rule__RosActionClientReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4665:1: ( ( rule__RosActionClientReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4665:1: ( ( rule__RosActionClientReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4666:2: ( rule__RosActionClientReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4667:2: ( rule__RosActionClientReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4667:3: rule__RosActionClientReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientReferenceAccess().getFromAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__0"
    // InternalRosSystemParser.g:4676:1: rule__RosParameter__Group__0 : rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 ;
    public final void rule__RosParameter__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4680:1: ( rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 )
            // InternalRosSystemParser.g:4681:2: rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0"


    // $ANTLR start "rule__RosParameter__Group__0__Impl"
    // InternalRosSystemParser.g:4688:1: rule__RosParameter__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__RosParameter__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4692:1: ( ( rulePreListElement ) )
            // InternalRosSystemParser.g:4693:1: ( rulePreListElement )
            {
            // InternalRosSystemParser.g:4693:1: ( rulePreListElement )
            // InternalRosSystemParser.g:4694:2: rulePreListElement
            {
             before(grammarAccess.getRosParameterAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0__Impl"


    // $ANTLR start "rule__RosParameter__Group__1"
    // InternalRosSystemParser.g:4703:1: rule__RosParameter__Group__1 : rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 ;
    public final void rule__RosParameter__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4707:1: ( rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 )
            // InternalRosSystemParser.g:4708:2: rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RosParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__1"


    // $ANTLR start "rule__RosParameter__Group__1__Impl"
    // InternalRosSystemParser.g:4715:1: rule__RosParameter__Group__1__Impl : ( ( rule__RosParameter__NameAssignment_1 ) ) ;
    public final void rule__RosParameter__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4719:1: ( ( ( rule__RosParameter__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:4720:1: ( ( rule__RosParameter__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4720:1: ( ( rule__RosParameter__NameAssignment_1 ) )
            // InternalRosSystemParser.g:4721:2: ( rule__RosParameter__NameAssignment_1 )
            {
             before(grammarAccess.getRosParameterAccess().getNameAssignment_1());
            // InternalRosSystemParser.g:4722:2: ( rule__RosParameter__NameAssignment_1 )
            // InternalRosSystemParser.g:4722:3: rule__RosParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getNameAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__2"
    // InternalRosSystemParser.g:4730:1: rule__RosParameter__Group__2 : rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 ;
    public final void rule__RosParameter__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4734:1: ( rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 )
            // InternalRosSystemParser.g:4735:2: rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RosParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__2"


    // $ANTLR start "rule__RosParameter__Group__2__Impl"
    // InternalRosSystemParser.g:4742:1: rule__RosParameter__Group__2__Impl : ( Colon ) ;
    public final void rule__RosParameter__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4746:1: ( ( Colon ) )
            // InternalRosSystemParser.g:4747:1: ( Colon )
            {
            // InternalRosSystemParser.g:4747:1: ( Colon )
            // InternalRosSystemParser.g:4748:2: Colon
            {
             before(grammarAccess.getRosParameterAccess().getColonKeyword_2());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getColonKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__2__Impl"


    // $ANTLR start "rule__RosParameter__Group__3"
    // InternalRosSystemParser.g:4757:1: rule__RosParameter__Group__3 : rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 ;
    public final void rule__RosParameter__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4761:1: ( rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 )
            // InternalRosSystemParser.g:4762:2: rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RosParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__3"


    // $ANTLR start "rule__RosParameter__Group__3__Impl"
    // InternalRosSystemParser.g:4769:1: rule__RosParameter__Group__3__Impl : ( ( rule__RosParameter__FromAssignment_3 ) ) ;
    public final void rule__RosParameter__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4773:1: ( ( ( rule__RosParameter__FromAssignment_3 ) ) )
            // InternalRosSystemParser.g:4774:1: ( ( rule__RosParameter__FromAssignment_3 ) )
            {
            // InternalRosSystemParser.g:4774:1: ( ( rule__RosParameter__FromAssignment_3 ) )
            // InternalRosSystemParser.g:4775:2: ( rule__RosParameter__FromAssignment_3 )
            {
             before(grammarAccess.getRosParameterAccess().getFromAssignment_3());
            // InternalRosSystemParser.g:4776:2: ( rule__RosParameter__FromAssignment_3 )
            // InternalRosSystemParser.g:4776:3: rule__RosParameter__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getFromAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__3__Impl"


    // $ANTLR start "rule__RosParameter__Group__4"
    // InternalRosSystemParser.g:4784:1: rule__RosParameter__Group__4 : rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 ;
    public final void rule__RosParameter__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4788:1: ( rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 )
            // InternalRosSystemParser.g:4789:2: rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__RosParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__4"


    // $ANTLR start "rule__RosParameter__Group__4__Impl"
    // InternalRosSystemParser.g:4796:1: rule__RosParameter__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosParameter__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4800:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4801:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4801:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4802:2: RULE_BEGIN
            {
             before(grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_4());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__4__Impl"


    // $ANTLR start "rule__RosParameter__Group__5"
    // InternalRosSystemParser.g:4811:1: rule__RosParameter__Group__5 : rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 ;
    public final void rule__RosParameter__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4815:1: ( rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 )
            // InternalRosSystemParser.g:4816:2: rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__RosParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__5"


    // $ANTLR start "rule__RosParameter__Group__5__Impl"
    // InternalRosSystemParser.g:4823:1: rule__RosParameter__Group__5__Impl : ( Value_1 ) ;
    public final void rule__RosParameter__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4827:1: ( ( Value_1 ) )
            // InternalRosSystemParser.g:4828:1: ( Value_1 )
            {
            // InternalRosSystemParser.g:4828:1: ( Value_1 )
            // InternalRosSystemParser.g:4829:2: Value_1
            {
             before(grammarAccess.getRosParameterAccess().getValueKeyword_5());
            match(input,Value_1,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getValueKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__5__Impl"


    // $ANTLR start "rule__RosParameter__Group__6"
    // InternalRosSystemParser.g:4838:1: rule__RosParameter__Group__6 : rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 ;
    public final void rule__RosParameter__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4842:1: ( rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 )
            // InternalRosSystemParser.g:4843:2: rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__RosParameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__6"


    // $ANTLR start "rule__RosParameter__Group__6__Impl"
    // InternalRosSystemParser.g:4850:1: rule__RosParameter__Group__6__Impl : ( ( rule__RosParameter__ValueAssignment_6 ) ) ;
    public final void rule__RosParameter__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4854:1: ( ( ( rule__RosParameter__ValueAssignment_6 ) ) )
            // InternalRosSystemParser.g:4855:1: ( ( rule__RosParameter__ValueAssignment_6 ) )
            {
            // InternalRosSystemParser.g:4855:1: ( ( rule__RosParameter__ValueAssignment_6 ) )
            // InternalRosSystemParser.g:4856:2: ( rule__RosParameter__ValueAssignment_6 )
            {
             before(grammarAccess.getRosParameterAccess().getValueAssignment_6());
            // InternalRosSystemParser.g:4857:2: ( rule__RosParameter__ValueAssignment_6 )
            // InternalRosSystemParser.g:4857:3: rule__RosParameter__ValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getValueAssignment_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__6__Impl"


    // $ANTLR start "rule__RosParameter__Group__7"
    // InternalRosSystemParser.g:4865:1: rule__RosParameter__Group__7 : rule__RosParameter__Group__7__Impl ;
    public final void rule__RosParameter__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4869:1: ( rule__RosParameter__Group__7__Impl )
            // InternalRosSystemParser.g:4870:2: rule__RosParameter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__7"


    // $ANTLR start "rule__RosParameter__Group__7__Impl"
    // InternalRosSystemParser.g:4876:1: rule__RosParameter__Group__7__Impl : ( RULE_END ) ;
    public final void rule__RosParameter__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4880:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4881:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4881:1: ( RULE_END )
            // InternalRosSystemParser.g:4882:2: RULE_END
            {
             before(grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_7());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__7__Impl"


    // $ANTLR start "rule__RosConnection__Group__0"
    // InternalRosSystemParser.g:4892:1: rule__RosConnection__Group__0 : rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1 ;
    public final void rule__RosConnection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4896:1: ( rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1 )
            // InternalRosSystemParser.g:4897:2: rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RosConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__0"


    // $ANTLR start "rule__RosConnection__Group__0__Impl"
    // InternalRosSystemParser.g:4904:1: rule__RosConnection__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__RosConnection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4908:1: ( ( rulePreListElement ) )
            // InternalRosSystemParser.g:4909:1: ( rulePreListElement )
            {
            // InternalRosSystemParser.g:4909:1: ( rulePreListElement )
            // InternalRosSystemParser.g:4910:2: rulePreListElement
            {
             before(grammarAccess.getRosConnectionAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getRosConnectionAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__0__Impl"


    // $ANTLR start "rule__RosConnection__Group__1"
    // InternalRosSystemParser.g:4919:1: rule__RosConnection__Group__1 : rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2 ;
    public final void rule__RosConnection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4923:1: ( rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2 )
            // InternalRosSystemParser.g:4924:2: rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RosConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__1"


    // $ANTLR start "rule__RosConnection__Group__1__Impl"
    // InternalRosSystemParser.g:4931:1: rule__RosConnection__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__RosConnection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4935:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:4936:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:4936:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:4937:2: LeftSquareBracket
            {
             before(grammarAccess.getRosConnectionAccess().getLeftSquareBracketKeyword_1());
            match(input,LeftSquareBracket,FOLLOW_2);
             after(grammarAccess.getRosConnectionAccess().getLeftSquareBracketKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__1__Impl"


    // $ANTLR start "rule__RosConnection__Group__2"
    // InternalRosSystemParser.g:4946:1: rule__RosConnection__Group__2 : rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3 ;
    public final void rule__RosConnection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4950:1: ( rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3 )
            // InternalRosSystemParser.g:4951:2: rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RosConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__2"


    // $ANTLR start "rule__RosConnection__Group__2__Impl"
    // InternalRosSystemParser.g:4958:1: rule__RosConnection__Group__2__Impl : ( ( rule__RosConnection__FromAssignment_2 ) ) ;
    public final void rule__RosConnection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4962:1: ( ( ( rule__RosConnection__FromAssignment_2 ) ) )
            // InternalRosSystemParser.g:4963:1: ( ( rule__RosConnection__FromAssignment_2 ) )
            {
            // InternalRosSystemParser.g:4963:1: ( ( rule__RosConnection__FromAssignment_2 ) )
            // InternalRosSystemParser.g:4964:2: ( rule__RosConnection__FromAssignment_2 )
            {
             before(grammarAccess.getRosConnectionAccess().getFromAssignment_2());
            // InternalRosSystemParser.g:4965:2: ( rule__RosConnection__FromAssignment_2 )
            // InternalRosSystemParser.g:4965:3: rule__RosConnection__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRosConnectionAccess().getFromAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__2__Impl"


    // $ANTLR start "rule__RosConnection__Group__3"
    // InternalRosSystemParser.g:4973:1: rule__RosConnection__Group__3 : rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4 ;
    public final void rule__RosConnection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4977:1: ( rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4 )
            // InternalRosSystemParser.g:4978:2: rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__RosConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__3"


    // $ANTLR start "rule__RosConnection__Group__3__Impl"
    // InternalRosSystemParser.g:4985:1: rule__RosConnection__Group__3__Impl : ( Comma ) ;
    public final void rule__RosConnection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4989:1: ( ( Comma ) )
            // InternalRosSystemParser.g:4990:1: ( Comma )
            {
            // InternalRosSystemParser.g:4990:1: ( Comma )
            // InternalRosSystemParser.g:4991:2: Comma
            {
             before(grammarAccess.getRosConnectionAccess().getCommaKeyword_3());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getRosConnectionAccess().getCommaKeyword_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__3__Impl"


    // $ANTLR start "rule__RosConnection__Group__4"
    // InternalRosSystemParser.g:5000:1: rule__RosConnection__Group__4 : rule__RosConnection__Group__4__Impl rule__RosConnection__Group__5 ;
    public final void rule__RosConnection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5004:1: ( rule__RosConnection__Group__4__Impl rule__RosConnection__Group__5 )
            // InternalRosSystemParser.g:5005:2: rule__RosConnection__Group__4__Impl rule__RosConnection__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__RosConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__4"


    // $ANTLR start "rule__RosConnection__Group__4__Impl"
    // InternalRosSystemParser.g:5012:1: rule__RosConnection__Group__4__Impl : ( ( rule__RosConnection__ToAssignment_4 ) ) ;
    public final void rule__RosConnection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5016:1: ( ( ( rule__RosConnection__ToAssignment_4 ) ) )
            // InternalRosSystemParser.g:5017:1: ( ( rule__RosConnection__ToAssignment_4 ) )
            {
            // InternalRosSystemParser.g:5017:1: ( ( rule__RosConnection__ToAssignment_4 ) )
            // InternalRosSystemParser.g:5018:2: ( rule__RosConnection__ToAssignment_4 )
            {
             before(grammarAccess.getRosConnectionAccess().getToAssignment_4());
            // InternalRosSystemParser.g:5019:2: ( rule__RosConnection__ToAssignment_4 )
            // InternalRosSystemParser.g:5019:3: rule__RosConnection__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosConnectionAccess().getToAssignment_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__4__Impl"


    // $ANTLR start "rule__RosConnection__Group__5"
    // InternalRosSystemParser.g:5027:1: rule__RosConnection__Group__5 : rule__RosConnection__Group__5__Impl ;
    public final void rule__RosConnection__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5031:1: ( rule__RosConnection__Group__5__Impl )
            // InternalRosSystemParser.g:5032:2: rule__RosConnection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__5"


    // $ANTLR start "rule__RosConnection__Group__5__Impl"
    // InternalRosSystemParser.g:5038:1: rule__RosConnection__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__RosConnection__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5042:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5043:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5043:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5044:2: RightSquareBracket
            {
             before(grammarAccess.getRosConnectionAccess().getRightSquareBracketKeyword_5());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getRosConnectionAccess().getRightSquareBracketKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__5__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalRosSystemParser.g:5054:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5058:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalRosSystemParser.g:5059:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystemParser.g:5066:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5070:1: ( ( () ) )
            // InternalRosSystemParser.g:5071:1: ( () )
            {
            // InternalRosSystemParser.g:5071:1: ( () )
            // InternalRosSystemParser.g:5072:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0());
            // InternalRosSystemParser.g:5073:2: ()
            // InternalRosSystemParser.g:5073:3:
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
    // InternalRosSystemParser.g:5081:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5085:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalRosSystemParser.g:5086:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:5093:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5097:1: ( ( GlobalNamespace ) )
            // InternalRosSystemParser.g:5098:1: ( GlobalNamespace )
            {
            // InternalRosSystemParser.g:5098:1: ( GlobalNamespace )
            // InternalRosSystemParser.g:5099:2: GlobalNamespace
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
    // InternalRosSystemParser.g:5108:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5112:1: ( rule__GlobalNamespace__Group__2__Impl )
            // InternalRosSystemParser.g:5113:2: rule__GlobalNamespace__Group__2__Impl
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
    // InternalRosSystemParser.g:5119:1: rule__GlobalNamespace__Group__2__Impl : ( ( rule__GlobalNamespace__Group_2__0 )? ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5123:1: ( ( ( rule__GlobalNamespace__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5124:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5124:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            // InternalRosSystemParser.g:5125:2: ( rule__GlobalNamespace__Group_2__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2());
            // InternalRosSystemParser.g:5126:2: ( rule__GlobalNamespace__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftSquareBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystemParser.g:5126:3: rule__GlobalNamespace__Group_2__0
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
    // InternalRosSystemParser.g:5135:1: rule__GlobalNamespace__Group_2__0 : rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 ;
    public final void rule__GlobalNamespace__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5139:1: ( rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 )
            // InternalRosSystemParser.g:5140:2: rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:5147:1: rule__GlobalNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5151:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5152:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5152:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5153:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5162:1: rule__GlobalNamespace__Group_2__1 : rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 ;
    public final void rule__GlobalNamespace__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5166:1: ( rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 )
            // InternalRosSystemParser.g:5167:2: rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5174:1: rule__GlobalNamespace__Group_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5178:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5179:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5179:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5180:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1());
            // InternalRosSystemParser.g:5181:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5181:3: rule__GlobalNamespace__PartsAssignment_2_1
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
    // InternalRosSystemParser.g:5189:1: rule__GlobalNamespace__Group_2__2 : rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 ;
    public final void rule__GlobalNamespace__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5193:1: ( rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 )
            // InternalRosSystemParser.g:5194:2: rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5201:1: rule__GlobalNamespace__Group_2__2__Impl : ( ( rule__GlobalNamespace__Group_2_2__0 )* ) ;
    public final void rule__GlobalNamespace__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5205:1: ( ( ( rule__GlobalNamespace__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5206:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5206:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5207:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2());
            // InternalRosSystemParser.g:5208:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
                case 1 :
                    // InternalRosSystemParser.g:5208:3: rule__GlobalNamespace__Group_2_2__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__GlobalNamespace__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop21;
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
    // InternalRosSystemParser.g:5216:1: rule__GlobalNamespace__Group_2__3 : rule__GlobalNamespace__Group_2__3__Impl ;
    public final void rule__GlobalNamespace__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5220:1: ( rule__GlobalNamespace__Group_2__3__Impl )
            // InternalRosSystemParser.g:5221:2: rule__GlobalNamespace__Group_2__3__Impl
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
    // InternalRosSystemParser.g:5227:1: rule__GlobalNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5231:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5232:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5232:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5233:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5243:1: rule__GlobalNamespace__Group_2_2__0 : rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 ;
    public final void rule__GlobalNamespace__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5247:1: ( rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 )
            // InternalRosSystemParser.g:5248:2: rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:5255:1: rule__GlobalNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5259:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5260:1: ( Comma )
            {
            // InternalRosSystemParser.g:5260:1: ( Comma )
            // InternalRosSystemParser.g:5261:2: Comma
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
    // InternalRosSystemParser.g:5270:1: rule__GlobalNamespace__Group_2_2__1 : rule__GlobalNamespace__Group_2_2__1__Impl ;
    public final void rule__GlobalNamespace__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5274:1: ( rule__GlobalNamespace__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5275:2: rule__GlobalNamespace__Group_2_2__1__Impl
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
    // InternalRosSystemParser.g:5281:1: rule__GlobalNamespace__Group_2_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5285:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5286:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5286:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5287:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1());
            // InternalRosSystemParser.g:5288:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5288:3: rule__GlobalNamespace__PartsAssignment_2_2_1
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
    // InternalRosSystemParser.g:5297:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5301:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalRosSystemParser.g:5302:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRosSystemParser.g:5309:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5313:1: ( ( () ) )
            // InternalRosSystemParser.g:5314:1: ( () )
            {
            // InternalRosSystemParser.g:5314:1: ( () )
            // InternalRosSystemParser.g:5315:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0());
            // InternalRosSystemParser.g:5316:2: ()
            // InternalRosSystemParser.g:5316:3:
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
    // InternalRosSystemParser.g:5324:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5328:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalRosSystemParser.g:5329:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:5336:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5340:1: ( ( RelativeNamespace ) )
            // InternalRosSystemParser.g:5341:1: ( RelativeNamespace )
            {
            // InternalRosSystemParser.g:5341:1: ( RelativeNamespace )
            // InternalRosSystemParser.g:5342:2: RelativeNamespace
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
    // InternalRosSystemParser.g:5351:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5355:1: ( rule__RelativeNamespace_Impl__Group__2__Impl )
            // InternalRosSystemParser.g:5356:2: rule__RelativeNamespace_Impl__Group__2__Impl
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
    // InternalRosSystemParser.g:5362:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5366:1: ( ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5367:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5367:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            // InternalRosSystemParser.g:5368:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2());
            // InternalRosSystemParser.g:5369:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftSquareBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystemParser.g:5369:3: rule__RelativeNamespace_Impl__Group_2__0
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
    // InternalRosSystemParser.g:5378:1: rule__RelativeNamespace_Impl__Group_2__0 : rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5382:1: ( rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 )
            // InternalRosSystemParser.g:5383:2: rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:5390:1: rule__RelativeNamespace_Impl__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5394:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5395:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5395:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5396:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5405:1: rule__RelativeNamespace_Impl__Group_2__1 : rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 ;
    public final void rule__RelativeNamespace_Impl__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5409:1: ( rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 )
            // InternalRosSystemParser.g:5410:2: rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5417:1: rule__RelativeNamespace_Impl__Group_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5421:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5422:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5422:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5423:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1());
            // InternalRosSystemParser.g:5424:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5424:3: rule__RelativeNamespace_Impl__PartsAssignment_2_1
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
    // InternalRosSystemParser.g:5432:1: rule__RelativeNamespace_Impl__Group_2__2 : rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 ;
    public final void rule__RelativeNamespace_Impl__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5436:1: ( rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 )
            // InternalRosSystemParser.g:5437:2: rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5444:1: rule__RelativeNamespace_Impl__Group_2__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5448:1: ( ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5449:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5449:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5450:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2());
            // InternalRosSystemParser.g:5451:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
                case 1 :
                    // InternalRosSystemParser.g:5451:3: rule__RelativeNamespace_Impl__Group_2_2__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__RelativeNamespace_Impl__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop23;
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
    // InternalRosSystemParser.g:5459:1: rule__RelativeNamespace_Impl__Group_2__3 : rule__RelativeNamespace_Impl__Group_2__3__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5463:1: ( rule__RelativeNamespace_Impl__Group_2__3__Impl )
            // InternalRosSystemParser.g:5464:2: rule__RelativeNamespace_Impl__Group_2__3__Impl
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
    // InternalRosSystemParser.g:5470:1: rule__RelativeNamespace_Impl__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5474:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5475:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5475:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5476:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5486:1: rule__RelativeNamespace_Impl__Group_2_2__0 : rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5490:1: ( rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 )
            // InternalRosSystemParser.g:5491:2: rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:5498:1: rule__RelativeNamespace_Impl__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5502:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5503:1: ( Comma )
            {
            // InternalRosSystemParser.g:5503:1: ( Comma )
            // InternalRosSystemParser.g:5504:2: Comma
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
    // InternalRosSystemParser.g:5513:1: rule__RelativeNamespace_Impl__Group_2_2__1 : rule__RelativeNamespace_Impl__Group_2_2__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5517:1: ( rule__RelativeNamespace_Impl__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5518:2: rule__RelativeNamespace_Impl__Group_2_2__1__Impl
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
    // InternalRosSystemParser.g:5524:1: rule__RelativeNamespace_Impl__Group_2_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5528:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5529:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5529:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5530:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1());
            // InternalRosSystemParser.g:5531:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5531:3: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1
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
    // InternalRosSystemParser.g:5540:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5544:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalRosSystemParser.g:5545:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRosSystemParser.g:5552:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5556:1: ( ( () ) )
            // InternalRosSystemParser.g:5557:1: ( () )
            {
            // InternalRosSystemParser.g:5557:1: ( () )
            // InternalRosSystemParser.g:5558:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0());
            // InternalRosSystemParser.g:5559:2: ()
            // InternalRosSystemParser.g:5559:3:
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
    // InternalRosSystemParser.g:5567:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5571:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalRosSystemParser.g:5572:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:5579:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5583:1: ( ( PrivateNamespace ) )
            // InternalRosSystemParser.g:5584:1: ( PrivateNamespace )
            {
            // InternalRosSystemParser.g:5584:1: ( PrivateNamespace )
            // InternalRosSystemParser.g:5585:2: PrivateNamespace
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
    // InternalRosSystemParser.g:5594:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5598:1: ( rule__PrivateNamespace__Group__2__Impl )
            // InternalRosSystemParser.g:5599:2: rule__PrivateNamespace__Group__2__Impl
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
    // InternalRosSystemParser.g:5605:1: rule__PrivateNamespace__Group__2__Impl : ( ( rule__PrivateNamespace__Group_2__0 )? ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5609:1: ( ( ( rule__PrivateNamespace__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5610:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5610:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            // InternalRosSystemParser.g:5611:2: ( rule__PrivateNamespace__Group_2__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2());
            // InternalRosSystemParser.g:5612:2: ( rule__PrivateNamespace__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystemParser.g:5612:3: rule__PrivateNamespace__Group_2__0
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
    // InternalRosSystemParser.g:5621:1: rule__PrivateNamespace__Group_2__0 : rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 ;
    public final void rule__PrivateNamespace__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5625:1: ( rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 )
            // InternalRosSystemParser.g:5626:2: rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:5633:1: rule__PrivateNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5637:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5638:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5638:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5639:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5648:1: rule__PrivateNamespace__Group_2__1 : rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 ;
    public final void rule__PrivateNamespace__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5652:1: ( rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 )
            // InternalRosSystemParser.g:5653:2: rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5660:1: rule__PrivateNamespace__Group_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5664:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5665:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5665:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5666:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1());
            // InternalRosSystemParser.g:5667:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5667:3: rule__PrivateNamespace__PartsAssignment_2_1
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
    // InternalRosSystemParser.g:5675:1: rule__PrivateNamespace__Group_2__2 : rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 ;
    public final void rule__PrivateNamespace__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5679:1: ( rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 )
            // InternalRosSystemParser.g:5680:2: rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5687:1: rule__PrivateNamespace__Group_2__2__Impl : ( ( rule__PrivateNamespace__Group_2_2__0 )* ) ;
    public final void rule__PrivateNamespace__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5691:1: ( ( ( rule__PrivateNamespace__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5692:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5692:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5693:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2());
            // InternalRosSystemParser.g:5694:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
                case 1 :
                    // InternalRosSystemParser.g:5694:3: rule__PrivateNamespace__Group_2_2__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__PrivateNamespace__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop25;
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
    // InternalRosSystemParser.g:5702:1: rule__PrivateNamespace__Group_2__3 : rule__PrivateNamespace__Group_2__3__Impl ;
    public final void rule__PrivateNamespace__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5706:1: ( rule__PrivateNamespace__Group_2__3__Impl )
            // InternalRosSystemParser.g:5707:2: rule__PrivateNamespace__Group_2__3__Impl
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
    // InternalRosSystemParser.g:5713:1: rule__PrivateNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5717:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5718:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5718:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5719:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5729:1: rule__PrivateNamespace__Group_2_2__0 : rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 ;
    public final void rule__PrivateNamespace__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5733:1: ( rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 )
            // InternalRosSystemParser.g:5734:2: rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:5741:1: rule__PrivateNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5745:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5746:1: ( Comma )
            {
            // InternalRosSystemParser.g:5746:1: ( Comma )
            // InternalRosSystemParser.g:5747:2: Comma
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
    // InternalRosSystemParser.g:5756:1: rule__PrivateNamespace__Group_2_2__1 : rule__PrivateNamespace__Group_2_2__1__Impl ;
    public final void rule__PrivateNamespace__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5760:1: ( rule__PrivateNamespace__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5761:2: rule__PrivateNamespace__Group_2_2__1__Impl
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
    // InternalRosSystemParser.g:5767:1: rule__PrivateNamespace__Group_2_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5771:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5772:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5772:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5773:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1());
            // InternalRosSystemParser.g:5774:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5774:3: rule__PrivateNamespace__PartsAssignment_2_2_1
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
    // InternalRosSystemParser.g:5783:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5787:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalRosSystemParser.g:5788:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRosSystemParser.g:5795:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5799:1: ( ( () ) )
            // InternalRosSystemParser.g:5800:1: ( () )
            {
            // InternalRosSystemParser.g:5800:1: ( () )
            // InternalRosSystemParser.g:5801:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0());
            // InternalRosSystemParser.g:5802:2: ()
            // InternalRosSystemParser.g:5802:3:
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
    // InternalRosSystemParser.g:5810:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5814:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalRosSystemParser.g:5815:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:5822:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5826:1: ( ( List ) )
            // InternalRosSystemParser.g:5827:1: ( List )
            {
            // InternalRosSystemParser.g:5827:1: ( List )
            // InternalRosSystemParser.g:5828:2: List
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
    // InternalRosSystemParser.g:5837:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5841:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalRosSystemParser.g:5842:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystemParser.g:5849:1: rule__ParameterListType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5853:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5854:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5854:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5855:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5864:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5868:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalRosSystemParser.g:5869:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5876:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5880:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:5881:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:5881:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalRosSystemParser.g:5882:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3());
            // InternalRosSystemParser.g:5883:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalRosSystemParser.g:5883:3: rule__ParameterListType__SequenceAssignment_3
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
    // InternalRosSystemParser.g:5891:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5895:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalRosSystemParser.g:5896:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5903:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5907:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:5908:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:5908:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalRosSystemParser.g:5909:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4());
            // InternalRosSystemParser.g:5910:2: ( rule__ParameterListType__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
                case 1 :
                    // InternalRosSystemParser.g:5910:3: rule__ParameterListType__Group_4__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__ParameterListType__Group_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop26;
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
    // InternalRosSystemParser.g:5918:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5922:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalRosSystemParser.g:5923:2: rule__ParameterListType__Group__5__Impl
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
    // InternalRosSystemParser.g:5929:1: rule__ParameterListType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5933:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5934:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5934:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5935:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5945:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5949:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalRosSystemParser.g:5950:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystemParser.g:5957:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5961:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5962:1: ( Comma )
            {
            // InternalRosSystemParser.g:5962:1: ( Comma )
            // InternalRosSystemParser.g:5963:2: Comma
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
    // InternalRosSystemParser.g:5972:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5976:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalRosSystemParser.g:5977:2: rule__ParameterListType__Group_4__1__Impl
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
    // InternalRosSystemParser.g:5983:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5987:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:5988:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:5988:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalRosSystemParser.g:5989:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1());
            // InternalRosSystemParser.g:5990:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalRosSystemParser.g:5990:3: rule__ParameterListType__SequenceAssignment_4_1
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
    // InternalRosSystemParser.g:5999:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6003:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalRosSystemParser.g:6004:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalRosSystemParser.g:6011:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6015:1: ( ( () ) )
            // InternalRosSystemParser.g:6016:1: ( () )
            {
            // InternalRosSystemParser.g:6016:1: ( () )
            // InternalRosSystemParser.g:6017:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0());
            // InternalRosSystemParser.g:6018:2: ()
            // InternalRosSystemParser.g:6018:3:
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
    // InternalRosSystemParser.g:6026:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6030:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalRosSystemParser.g:6031:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:6038:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6042:1: ( ( Struct ) )
            // InternalRosSystemParser.g:6043:1: ( Struct )
            {
            // InternalRosSystemParser.g:6043:1: ( Struct )
            // InternalRosSystemParser.g:6044:2: Struct
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
    // InternalRosSystemParser.g:6053:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6057:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalRosSystemParser.g:6058:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:6065:1: rule__ParameterStructType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6069:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:6070:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:6070:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:6071:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:6080:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6084:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalRosSystemParser.g:6085:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:6092:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6096:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalRosSystemParser.g:6097:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalRosSystemParser.g:6097:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalRosSystemParser.g:6098:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3());
            // InternalRosSystemParser.g:6099:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalRosSystemParser.g:6099:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
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
    // InternalRosSystemParser.g:6107:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6111:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalRosSystemParser.g:6112:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:6119:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6123:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:6124:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:6124:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalRosSystemParser.g:6125:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4());
            // InternalRosSystemParser.g:6126:2: ( rule__ParameterStructType__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
                case 1 :
                    // InternalRosSystemParser.g:6126:3: rule__ParameterStructType__Group_4__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__ParameterStructType__Group_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop27;
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
    // InternalRosSystemParser.g:6134:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6138:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalRosSystemParser.g:6139:2: rule__ParameterStructType__Group__5__Impl
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
    // InternalRosSystemParser.g:6145:1: rule__ParameterStructType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6149:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:6150:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:6150:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:6151:2: RightSquareBracket
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
    // InternalRosSystemParser.g:6161:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6165:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalRosSystemParser.g:6166:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:6173:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6177:1: ( ( Comma ) )
            // InternalRosSystemParser.g:6178:1: ( Comma )
            {
            // InternalRosSystemParser.g:6178:1: ( Comma )
            // InternalRosSystemParser.g:6179:2: Comma
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
    // InternalRosSystemParser.g:6188:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6192:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalRosSystemParser.g:6193:2: rule__ParameterStructType__Group_4__1__Impl
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
    // InternalRosSystemParser.g:6199:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6203:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:6204:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:6204:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalRosSystemParser.g:6205:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1());
            // InternalRosSystemParser.g:6206:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalRosSystemParser.g:6206:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
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
    // InternalRosSystemParser.g:6215:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6219:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalRosSystemParser.g:6220:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystemParser.g:6227:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6231:1: ( ( () ) )
            // InternalRosSystemParser.g:6232:1: ( () )
            {
            // InternalRosSystemParser.g:6232:1: ( () )
            // InternalRosSystemParser.g:6233:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0());
            // InternalRosSystemParser.g:6234:2: ()
            // InternalRosSystemParser.g:6234:3:
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
    // InternalRosSystemParser.g:6242:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6246:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalRosSystemParser.g:6247:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6254:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6258:1: ( ( Integer ) )
            // InternalRosSystemParser.g:6259:1: ( Integer )
            {
            // InternalRosSystemParser.g:6259:1: ( Integer )
            // InternalRosSystemParser.g:6260:2: Integer
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
    // InternalRosSystemParser.g:6269:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6273:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalRosSystemParser.g:6274:2: rule__ParameterIntegerType__Group__2__Impl
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
    // InternalRosSystemParser.g:6280:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6284:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6285:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6285:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalRosSystemParser.g:6286:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6287:2: ( rule__ParameterIntegerType__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Default) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_DECINT) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystemParser.g:6287:3: rule__ParameterIntegerType__Group_2__0
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
    // InternalRosSystemParser.g:6296:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6300:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalRosSystemParser.g:6301:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRosSystemParser.g:6308:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6312:1: ( ( Default ) )
            // InternalRosSystemParser.g:6313:1: ( Default )
            {
            // InternalRosSystemParser.g:6313:1: ( Default )
            // InternalRosSystemParser.g:6314:2: Default
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
    // InternalRosSystemParser.g:6323:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6327:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6328:2: rule__ParameterIntegerType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6334:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6338:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6339:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6339:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6340:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6341:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6341:3: rule__ParameterIntegerType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6350:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6354:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalRosSystemParser.g:6355:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalRosSystemParser.g:6362:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6366:1: ( ( () ) )
            // InternalRosSystemParser.g:6367:1: ( () )
            {
            // InternalRosSystemParser.g:6367:1: ( () )
            // InternalRosSystemParser.g:6368:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0());
            // InternalRosSystemParser.g:6369:2: ()
            // InternalRosSystemParser.g:6369:3:
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
    // InternalRosSystemParser.g:6377:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6381:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalRosSystemParser.g:6382:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6389:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6393:1: ( ( String ) )
            // InternalRosSystemParser.g:6394:1: ( String )
            {
            // InternalRosSystemParser.g:6394:1: ( String )
            // InternalRosSystemParser.g:6395:2: String
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
    // InternalRosSystemParser.g:6404:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6408:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalRosSystemParser.g:6409:2: rule__ParameterStringType__Group__2__Impl
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
    // InternalRosSystemParser.g:6415:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6419:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6420:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6420:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalRosSystemParser.g:6421:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6422:2: ( rule__ParameterStringType__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Default) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_STRING)) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystemParser.g:6422:3: rule__ParameterStringType__Group_2__0
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
    // InternalRosSystemParser.g:6431:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6435:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalRosSystemParser.g:6436:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:6443:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6447:1: ( ( Default ) )
            // InternalRosSystemParser.g:6448:1: ( Default )
            {
            // InternalRosSystemParser.g:6448:1: ( Default )
            // InternalRosSystemParser.g:6449:2: Default
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
    // InternalRosSystemParser.g:6458:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6462:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6463:2: rule__ParameterStringType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6469:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6473:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6474:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6474:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6475:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6476:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6476:3: rule__ParameterStringType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6485:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6489:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalRosSystemParser.g:6490:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalRosSystemParser.g:6497:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6501:1: ( ( () ) )
            // InternalRosSystemParser.g:6502:1: ( () )
            {
            // InternalRosSystemParser.g:6502:1: ( () )
            // InternalRosSystemParser.g:6503:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0());
            // InternalRosSystemParser.g:6504:2: ()
            // InternalRosSystemParser.g:6504:3:
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
    // InternalRosSystemParser.g:6512:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6516:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalRosSystemParser.g:6517:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6524:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6528:1: ( ( Double ) )
            // InternalRosSystemParser.g:6529:1: ( Double )
            {
            // InternalRosSystemParser.g:6529:1: ( Double )
            // InternalRosSystemParser.g:6530:2: Double
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
    // InternalRosSystemParser.g:6539:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6543:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalRosSystemParser.g:6544:2: rule__ParameterDoubleType__Group__2__Impl
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
    // InternalRosSystemParser.g:6550:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6554:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6555:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6555:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalRosSystemParser.g:6556:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6557:2: ( rule__ParameterDoubleType__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Default) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_DOUBLE) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystemParser.g:6557:3: rule__ParameterDoubleType__Group_2__0
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
    // InternalRosSystemParser.g:6566:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6570:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalRosSystemParser.g:6571:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalRosSystemParser.g:6578:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6582:1: ( ( Default ) )
            // InternalRosSystemParser.g:6583:1: ( Default )
            {
            // InternalRosSystemParser.g:6583:1: ( Default )
            // InternalRosSystemParser.g:6584:2: Default
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
    // InternalRosSystemParser.g:6593:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6597:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6598:2: rule__ParameterDoubleType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6604:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6608:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6609:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6609:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6610:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6611:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6611:3: rule__ParameterDoubleType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6620:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6624:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalRosSystemParser.g:6625:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalRosSystemParser.g:6632:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6636:1: ( ( () ) )
            // InternalRosSystemParser.g:6637:1: ( () )
            {
            // InternalRosSystemParser.g:6637:1: ( () )
            // InternalRosSystemParser.g:6638:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0());
            // InternalRosSystemParser.g:6639:2: ()
            // InternalRosSystemParser.g:6639:3:
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
    // InternalRosSystemParser.g:6647:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6651:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalRosSystemParser.g:6652:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6659:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6663:1: ( ( Boolean ) )
            // InternalRosSystemParser.g:6664:1: ( Boolean )
            {
            // InternalRosSystemParser.g:6664:1: ( Boolean )
            // InternalRosSystemParser.g:6665:2: Boolean
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
    // InternalRosSystemParser.g:6674:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6678:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalRosSystemParser.g:6679:2: rule__ParameterBooleanType__Group__2__Impl
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
    // InternalRosSystemParser.g:6685:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6689:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6690:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6690:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalRosSystemParser.g:6691:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6692:2: ( rule__ParameterBooleanType__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Default) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_BOOLEAN) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystemParser.g:6692:3: rule__ParameterBooleanType__Group_2__0
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
    // InternalRosSystemParser.g:6701:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6705:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalRosSystemParser.g:6706:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalRosSystemParser.g:6713:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6717:1: ( ( Default ) )
            // InternalRosSystemParser.g:6718:1: ( Default )
            {
            // InternalRosSystemParser.g:6718:1: ( Default )
            // InternalRosSystemParser.g:6719:2: Default
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
    // InternalRosSystemParser.g:6728:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6732:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6733:2: rule__ParameterBooleanType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6739:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6743:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6744:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6744:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6745:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6746:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6746:3: rule__ParameterBooleanType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6755:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6759:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalRosSystemParser.g:6760:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalRosSystemParser.g:6767:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6771:1: ( ( () ) )
            // InternalRosSystemParser.g:6772:1: ( () )
            {
            // InternalRosSystemParser.g:6772:1: ( () )
            // InternalRosSystemParser.g:6773:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0());
            // InternalRosSystemParser.g:6774:2: ()
            // InternalRosSystemParser.g:6774:3:
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
    // InternalRosSystemParser.g:6782:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6786:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalRosSystemParser.g:6787:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6794:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6798:1: ( ( Base64 ) )
            // InternalRosSystemParser.g:6799:1: ( Base64 )
            {
            // InternalRosSystemParser.g:6799:1: ( Base64 )
            // InternalRosSystemParser.g:6800:2: Base64
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
    // InternalRosSystemParser.g:6809:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6813:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalRosSystemParser.g:6814:2: rule__ParameterBase64Type__Group__2__Impl
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
    // InternalRosSystemParser.g:6820:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6824:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6825:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6825:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalRosSystemParser.g:6826:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6827:2: ( rule__ParameterBase64Type__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_BINARY) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystemParser.g:6827:3: rule__ParameterBase64Type__Group_2__0
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
    // InternalRosSystemParser.g:6836:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6840:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalRosSystemParser.g:6841:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalRosSystemParser.g:6848:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6852:1: ( ( Default ) )
            // InternalRosSystemParser.g:6853:1: ( Default )
            {
            // InternalRosSystemParser.g:6853:1: ( Default )
            // InternalRosSystemParser.g:6854:2: Default
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
    // InternalRosSystemParser.g:6863:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6867:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalRosSystemParser.g:6868:2: rule__ParameterBase64Type__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6874:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6878:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6879:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6879:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6880:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6881:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6881:3: rule__ParameterBase64Type__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6890:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6894:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalRosSystemParser.g:6895:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalRosSystemParser.g:6902:1: rule__ParameterArrayType__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6906:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:6907:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:6907:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:6908:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:6917:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6921:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalRosSystemParser.g:6922:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystemParser.g:6929:1: rule__ParameterArrayType__Group__1__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6933:1: ( ( Array ) )
            // InternalRosSystemParser.g:6934:1: ( Array )
            {
            // InternalRosSystemParser.g:6934:1: ( Array )
            // InternalRosSystemParser.g:6935:2: Array
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
    // InternalRosSystemParser.g:6944:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6948:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalRosSystemParser.g:6949:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalRosSystemParser.g:6956:1: rule__ParameterArrayType__Group__2__Impl : ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6960:1: ( ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) )
            // InternalRosSystemParser.g:6961:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            {
            // InternalRosSystemParser.g:6961:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            // InternalRosSystemParser.g:6962:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2());
            // InternalRosSystemParser.g:6963:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            // InternalRosSystemParser.g:6963:3: rule__ParameterArrayType__TypeAssignment_2
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
    // InternalRosSystemParser.g:6971:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6975:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalRosSystemParser.g:6976:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalRosSystemParser.g:6983:1: rule__ParameterArrayType__Group__3__Impl : ( ( rule__ParameterArrayType__Group_3__0 )? ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6987:1: ( ( ( rule__ParameterArrayType__Group_3__0 )? ) )
            // InternalRosSystemParser.g:6988:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            {
            // InternalRosSystemParser.g:6988:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            // InternalRosSystemParser.g:6989:2: ( rule__ParameterArrayType__Group_3__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_3());
            // InternalRosSystemParser.g:6990:2: ( rule__ParameterArrayType__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Default) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystemParser.g:6990:3: rule__ParameterArrayType__Group_3__0
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
    // InternalRosSystemParser.g:6998:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7002:1: ( rule__ParameterArrayType__Group__4__Impl )
            // InternalRosSystemParser.g:7003:2: rule__ParameterArrayType__Group__4__Impl
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
    // InternalRosSystemParser.g:7009:1: rule__ParameterArrayType__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7013:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:7014:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:7014:1: ( RULE_END )
            // InternalRosSystemParser.g:7015:2: RULE_END
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
    // InternalRosSystemParser.g:7025:1: rule__ParameterArrayType__Group_3__0 : rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 ;
    public final void rule__ParameterArrayType__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7029:1: ( rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 )
            // InternalRosSystemParser.g:7030:2: rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:7037:1: rule__ParameterArrayType__Group_3__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7041:1: ( ( Default ) )
            // InternalRosSystemParser.g:7042:1: ( Default )
            {
            // InternalRosSystemParser.g:7042:1: ( Default )
            // InternalRosSystemParser.g:7043:2: Default
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
    // InternalRosSystemParser.g:7052:1: rule__ParameterArrayType__Group_3__1 : rule__ParameterArrayType__Group_3__1__Impl ;
    public final void rule__ParameterArrayType__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7056:1: ( rule__ParameterArrayType__Group_3__1__Impl )
            // InternalRosSystemParser.g:7057:2: rule__ParameterArrayType__Group_3__1__Impl
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
    // InternalRosSystemParser.g:7063:1: rule__ParameterArrayType__Group_3__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) ;
    public final void rule__ParameterArrayType__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7067:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:7068:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:7068:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            // InternalRosSystemParser.g:7069:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_3_1());
            // InternalRosSystemParser.g:7070:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            // InternalRosSystemParser.g:7070:3: rule__ParameterArrayType__DefaultAssignment_3_1
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
    // InternalRosSystemParser.g:7079:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7083:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalRosSystemParser.g:7084:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:7091:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7095:1: ( ( () ) )
            // InternalRosSystemParser.g:7096:1: ( () )
            {
            // InternalRosSystemParser.g:7096:1: ( () )
            // InternalRosSystemParser.g:7097:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0());
            // InternalRosSystemParser.g:7098:2: ()
            // InternalRosSystemParser.g:7098:3:
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
    // InternalRosSystemParser.g:7106:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7110:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalRosSystemParser.g:7111:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystemParser.g:7118:1: rule__ParameterList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7122:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7123:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7123:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7124:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:7133:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7137:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalRosSystemParser.g:7138:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:7145:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7149:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalRosSystemParser.g:7150:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalRosSystemParser.g:7150:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalRosSystemParser.g:7151:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2());
            // InternalRosSystemParser.g:7152:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalRosSystemParser.g:7152:3: rule__ParameterList__ValueAssignment_2
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
    // InternalRosSystemParser.g:7160:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7164:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalRosSystemParser.g:7165:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:7172:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7176:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalRosSystemParser.g:7177:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalRosSystemParser.g:7177:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalRosSystemParser.g:7178:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3());
            // InternalRosSystemParser.g:7179:2: ( rule__ParameterList__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
                case 1 :
                    // InternalRosSystemParser.g:7179:3: rule__ParameterList__Group_3__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__ParameterList__Group_3__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop34;
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
    // InternalRosSystemParser.g:7187:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7191:1: ( rule__ParameterList__Group__4__Impl )
            // InternalRosSystemParser.g:7192:2: rule__ParameterList__Group__4__Impl
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
    // InternalRosSystemParser.g:7198:1: rule__ParameterList__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7202:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7203:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7203:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7204:2: RightSquareBracket
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
    // InternalRosSystemParser.g:7214:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7218:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalRosSystemParser.g:7219:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystemParser.g:7226:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7230:1: ( ( Comma ) )
            // InternalRosSystemParser.g:7231:1: ( Comma )
            {
            // InternalRosSystemParser.g:7231:1: ( Comma )
            // InternalRosSystemParser.g:7232:2: Comma
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
    // InternalRosSystemParser.g:7241:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7245:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalRosSystemParser.g:7246:2: rule__ParameterList__Group_3__1__Impl
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
    // InternalRosSystemParser.g:7252:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7256:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:7257:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:7257:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalRosSystemParser.g:7258:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1());
            // InternalRosSystemParser.g:7259:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalRosSystemParser.g:7259:3: rule__ParameterList__ValueAssignment_3_1
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
    // InternalRosSystemParser.g:7268:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7272:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalRosSystemParser.g:7273:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalRosSystemParser.g:7280:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7284:1: ( ( () ) )
            // InternalRosSystemParser.g:7285:1: ( () )
            {
            // InternalRosSystemParser.g:7285:1: ( () )
            // InternalRosSystemParser.g:7286:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0());
            // InternalRosSystemParser.g:7287:2: ()
            // InternalRosSystemParser.g:7287:3:
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
    // InternalRosSystemParser.g:7295:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7299:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalRosSystemParser.g:7300:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalRosSystemParser.g:7307:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7311:1: ( ( ParameterAny ) )
            // InternalRosSystemParser.g:7312:1: ( ParameterAny )
            {
            // InternalRosSystemParser.g:7312:1: ( ParameterAny )
            // InternalRosSystemParser.g:7313:2: ParameterAny
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
    // InternalRosSystemParser.g:7322:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7326:1: ( rule__ParameterAny__Group__2__Impl )
            // InternalRosSystemParser.g:7327:2: rule__ParameterAny__Group__2__Impl
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
    // InternalRosSystemParser.g:7333:1: rule__ParameterAny__Group__2__Impl : ( ( rule__ParameterAny__Group_2__0 )? ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7337:1: ( ( ( rule__ParameterAny__Group_2__0 )? ) )
            // InternalRosSystemParser.g:7338:1: ( ( rule__ParameterAny__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:7338:1: ( ( rule__ParameterAny__Group_2__0 )? )
            // InternalRosSystemParser.g:7339:2: ( rule__ParameterAny__Group_2__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_2());
            // InternalRosSystemParser.g:7340:2: ( rule__ParameterAny__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosSystemParser.g:7340:3: rule__ParameterAny__Group_2__0
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
    // InternalRosSystemParser.g:7349:1: rule__ParameterAny__Group_2__0 : rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 ;
    public final void rule__ParameterAny__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7353:1: ( rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 )
            // InternalRosSystemParser.g:7354:2: rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:7361:1: rule__ParameterAny__Group_2__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7365:1: ( ( Value ) )
            // InternalRosSystemParser.g:7366:1: ( Value )
            {
            // InternalRosSystemParser.g:7366:1: ( Value )
            // InternalRosSystemParser.g:7367:2: Value
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
    // InternalRosSystemParser.g:7376:1: rule__ParameterAny__Group_2__1 : rule__ParameterAny__Group_2__1__Impl ;
    public final void rule__ParameterAny__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7380:1: ( rule__ParameterAny__Group_2__1__Impl )
            // InternalRosSystemParser.g:7381:2: rule__ParameterAny__Group_2__1__Impl
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
    // InternalRosSystemParser.g:7387:1: rule__ParameterAny__Group_2__1__Impl : ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterAny__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7391:1: ( ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:7392:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:7392:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            // InternalRosSystemParser.g:7393:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1());
            // InternalRosSystemParser.g:7394:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            // InternalRosSystemParser.g:7394:3: rule__ParameterAny__ValueAssignment_2_1
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
    // InternalRosSystemParser.g:7403:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7407:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalRosSystemParser.g:7408:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystemParser.g:7415:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7419:1: ( ( () ) )
            // InternalRosSystemParser.g:7420:1: ( () )
            {
            // InternalRosSystemParser.g:7420:1: ( () )
            // InternalRosSystemParser.g:7421:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0());
            // InternalRosSystemParser.g:7422:2: ()
            // InternalRosSystemParser.g:7422:3:
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
    // InternalRosSystemParser.g:7430:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7434:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalRosSystemParser.g:7435:2: rule__ParameterStruct__Group__1__Impl
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
    // InternalRosSystemParser.g:7441:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7445:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalRosSystemParser.g:7446:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalRosSystemParser.g:7446:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalRosSystemParser.g:7447:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1());
            // InternalRosSystemParser.g:7448:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftSquareBracket) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystemParser.g:7448:3: rule__ParameterStruct__Group_1__0
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
    // InternalRosSystemParser.g:7457:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7461:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalRosSystemParser.g:7462:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:7469:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7473:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7474:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7474:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7475:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:7484:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7488:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalRosSystemParser.g:7489:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:7496:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7500:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalRosSystemParser.g:7501:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalRosSystemParser.g:7501:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalRosSystemParser.g:7502:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1());
            // InternalRosSystemParser.g:7503:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalRosSystemParser.g:7503:3: rule__ParameterStruct__ValueAssignment_1_1
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
    // InternalRosSystemParser.g:7511:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7515:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalRosSystemParser.g:7516:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:7523:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7527:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalRosSystemParser.g:7528:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalRosSystemParser.g:7528:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalRosSystemParser.g:7529:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2());
            // InternalRosSystemParser.g:7530:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Comma) ) {
                    alt37=1;
                }


                switch (alt37) {
                case 1 :
                    // InternalRosSystemParser.g:7530:3: rule__ParameterStruct__Group_1_2__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__ParameterStruct__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop37;
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
    // InternalRosSystemParser.g:7538:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7542:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalRosSystemParser.g:7543:2: rule__ParameterStruct__Group_1__3__Impl
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
    // InternalRosSystemParser.g:7549:1: rule__ParameterStruct__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7553:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7554:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7554:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7555:2: RightSquareBracket
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
    // InternalRosSystemParser.g:7565:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7569:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalRosSystemParser.g:7570:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystemParser.g:7577:1: rule__ParameterStruct__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7581:1: ( ( Comma ) )
            // InternalRosSystemParser.g:7582:1: ( Comma )
            {
            // InternalRosSystemParser.g:7582:1: ( Comma )
            // InternalRosSystemParser.g:7583:2: Comma
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
    // InternalRosSystemParser.g:7592:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7596:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalRosSystemParser.g:7597:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:7604:1: rule__ParameterStruct__Group_1_2__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7608:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7609:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7609:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7610:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:7619:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7623:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalRosSystemParser.g:7624:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystemParser.g:7631:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7635:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalRosSystemParser.g:7636:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalRosSystemParser.g:7636:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalRosSystemParser.g:7637:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2());
            // InternalRosSystemParser.g:7638:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalRosSystemParser.g:7638:3: rule__ParameterStruct__ValueAssignment_1_2_2
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
    // InternalRosSystemParser.g:7646:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7650:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalRosSystemParser.g:7651:2: rule__ParameterStruct__Group_1_2__3__Impl
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
    // InternalRosSystemParser.g:7657:1: rule__ParameterStruct__Group_1_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7661:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7662:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7662:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7663:2: RightSquareBracket
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
    // InternalRosSystemParser.g:7673:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7677:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalRosSystemParser.g:7678:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:7685:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7689:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:7690:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:7690:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:7691:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:7692:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalRosSystemParser.g:7692:3: rule__ParameterStructMember__NameAssignment_0
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
    // InternalRosSystemParser.g:7700:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7704:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalRosSystemParser.g:7705:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystemParser.g:7712:1: rule__ParameterStructMember__Group__1__Impl : ( Colon ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7716:1: ( ( Colon ) )
            // InternalRosSystemParser.g:7717:1: ( Colon )
            {
            // InternalRosSystemParser.g:7717:1: ( Colon )
            // InternalRosSystemParser.g:7718:2: Colon
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
    // InternalRosSystemParser.g:7727:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7731:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalRosSystemParser.g:7732:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystemParser.g:7739:1: rule__ParameterStructMember__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7743:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:7744:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:7744:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:7745:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:7754:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7758:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalRosSystemParser.g:7759:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystemParser.g:7766:1: rule__ParameterStructMember__Group__3__Impl : ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7770:1: ( ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) )
            // InternalRosSystemParser.g:7771:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            {
            // InternalRosSystemParser.g:7771:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            // InternalRosSystemParser.g:7772:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3());
            // InternalRosSystemParser.g:7773:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            // InternalRosSystemParser.g:7773:3: rule__ParameterStructMember__ValueAssignment_3
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
    // InternalRosSystemParser.g:7781:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7785:1: ( rule__ParameterStructMember__Group__4__Impl )
            // InternalRosSystemParser.g:7786:2: rule__ParameterStructMember__Group__4__Impl
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
    // InternalRosSystemParser.g:7792:1: rule__ParameterStructMember__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7796:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:7797:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:7797:1: ( RULE_END )
            // InternalRosSystemParser.g:7798:2: RULE_END
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
    // InternalRosSystemParser.g:7808:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7812:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalRosSystemParser.g:7813:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystemParser.g:7820:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7824:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:7825:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:7825:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:7826:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:7827:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalRosSystemParser.g:7827:3: rule__ParameterStructTypeMember__NameAssignment_0
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
    // InternalRosSystemParser.g:7835:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7839:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalRosSystemParser.g:7840:2: rule__ParameterStructTypeMember__Group__1__Impl
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
    // InternalRosSystemParser.g:7846:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7850:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalRosSystemParser.g:7851:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalRosSystemParser.g:7851:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalRosSystemParser.g:7852:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1());
            // InternalRosSystemParser.g:7853:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalRosSystemParser.g:7853:3: rule__ParameterStructTypeMember__TypeAssignment_1
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
    // InternalRosSystemParser.g:7862:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7866:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalRosSystemParser.g:7867:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalRosSystemParser.g:7874:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7878:1: ( ( () ) )
            // InternalRosSystemParser.g:7879:1: ( () )
            {
            // InternalRosSystemParser.g:7879:1: ( () )
            // InternalRosSystemParser.g:7880:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0());
            // InternalRosSystemParser.g:7881:2: ()
            // InternalRosSystemParser.g:7881:3:
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
    // InternalRosSystemParser.g:7889:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7893:1: ( rule__Bool__Group__1__Impl )
            // InternalRosSystemParser.g:7894:2: rule__Bool__Group__1__Impl
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
    // InternalRosSystemParser.g:7900:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7904:1: ( ( Bool ) )
            // InternalRosSystemParser.g:7905:1: ( Bool )
            {
            // InternalRosSystemParser.g:7905:1: ( Bool )
            // InternalRosSystemParser.g:7906:2: Bool
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
    // InternalRosSystemParser.g:7916:1: rule__Int8__Group__0 : rule__Int8__Group__0__Impl rule__Int8__Group__1 ;
    public final void rule__Int8__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7920:1: ( rule__Int8__Group__0__Impl rule__Int8__Group__1 )
            // InternalRosSystemParser.g:7921:2: rule__Int8__Group__0__Impl rule__Int8__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalRosSystemParser.g:7928:1: rule__Int8__Group__0__Impl : ( () ) ;
    public final void rule__Int8__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7932:1: ( ( () ) )
            // InternalRosSystemParser.g:7933:1: ( () )
            {
            // InternalRosSystemParser.g:7933:1: ( () )
            // InternalRosSystemParser.g:7934:2: ()
            {
             before(grammarAccess.getInt8Access().getInt8Action_0());
            // InternalRosSystemParser.g:7935:2: ()
            // InternalRosSystemParser.g:7935:3:
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
    // InternalRosSystemParser.g:7943:1: rule__Int8__Group__1 : rule__Int8__Group__1__Impl ;
    public final void rule__Int8__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7947:1: ( rule__Int8__Group__1__Impl )
            // InternalRosSystemParser.g:7948:2: rule__Int8__Group__1__Impl
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
    // InternalRosSystemParser.g:7954:1: rule__Int8__Group__1__Impl : ( Int8 ) ;
    public final void rule__Int8__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7958:1: ( ( Int8 ) )
            // InternalRosSystemParser.g:7959:1: ( Int8 )
            {
            // InternalRosSystemParser.g:7959:1: ( Int8 )
            // InternalRosSystemParser.g:7960:2: Int8
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
    // InternalRosSystemParser.g:7970:1: rule__Uint8__Group__0 : rule__Uint8__Group__0__Impl rule__Uint8__Group__1 ;
    public final void rule__Uint8__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7974:1: ( rule__Uint8__Group__0__Impl rule__Uint8__Group__1 )
            // InternalRosSystemParser.g:7975:2: rule__Uint8__Group__0__Impl rule__Uint8__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalRosSystemParser.g:7982:1: rule__Uint8__Group__0__Impl : ( () ) ;
    public final void rule__Uint8__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7986:1: ( ( () ) )
            // InternalRosSystemParser.g:7987:1: ( () )
            {
            // InternalRosSystemParser.g:7987:1: ( () )
            // InternalRosSystemParser.g:7988:2: ()
            {
             before(grammarAccess.getUint8Access().getUint8Action_0());
            // InternalRosSystemParser.g:7989:2: ()
            // InternalRosSystemParser.g:7989:3:
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
    // InternalRosSystemParser.g:7997:1: rule__Uint8__Group__1 : rule__Uint8__Group__1__Impl ;
    public final void rule__Uint8__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8001:1: ( rule__Uint8__Group__1__Impl )
            // InternalRosSystemParser.g:8002:2: rule__Uint8__Group__1__Impl
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
    // InternalRosSystemParser.g:8008:1: rule__Uint8__Group__1__Impl : ( Uint8 ) ;
    public final void rule__Uint8__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8012:1: ( ( Uint8 ) )
            // InternalRosSystemParser.g:8013:1: ( Uint8 )
            {
            // InternalRosSystemParser.g:8013:1: ( Uint8 )
            // InternalRosSystemParser.g:8014:2: Uint8
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
    // InternalRosSystemParser.g:8024:1: rule__Int16__Group__0 : rule__Int16__Group__0__Impl rule__Int16__Group__1 ;
    public final void rule__Int16__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8028:1: ( rule__Int16__Group__0__Impl rule__Int16__Group__1 )
            // InternalRosSystemParser.g:8029:2: rule__Int16__Group__0__Impl rule__Int16__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalRosSystemParser.g:8036:1: rule__Int16__Group__0__Impl : ( () ) ;
    public final void rule__Int16__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8040:1: ( ( () ) )
            // InternalRosSystemParser.g:8041:1: ( () )
            {
            // InternalRosSystemParser.g:8041:1: ( () )
            // InternalRosSystemParser.g:8042:2: ()
            {
             before(grammarAccess.getInt16Access().getInt16Action_0());
            // InternalRosSystemParser.g:8043:2: ()
            // InternalRosSystemParser.g:8043:3:
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
    // InternalRosSystemParser.g:8051:1: rule__Int16__Group__1 : rule__Int16__Group__1__Impl ;
    public final void rule__Int16__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8055:1: ( rule__Int16__Group__1__Impl )
            // InternalRosSystemParser.g:8056:2: rule__Int16__Group__1__Impl
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
    // InternalRosSystemParser.g:8062:1: rule__Int16__Group__1__Impl : ( Int16 ) ;
    public final void rule__Int16__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8066:1: ( ( Int16 ) )
            // InternalRosSystemParser.g:8067:1: ( Int16 )
            {
            // InternalRosSystemParser.g:8067:1: ( Int16 )
            // InternalRosSystemParser.g:8068:2: Int16
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
    // InternalRosSystemParser.g:8078:1: rule__Uint16__Group__0 : rule__Uint16__Group__0__Impl rule__Uint16__Group__1 ;
    public final void rule__Uint16__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8082:1: ( rule__Uint16__Group__0__Impl rule__Uint16__Group__1 )
            // InternalRosSystemParser.g:8083:2: rule__Uint16__Group__0__Impl rule__Uint16__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalRosSystemParser.g:8090:1: rule__Uint16__Group__0__Impl : ( () ) ;
    public final void rule__Uint16__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8094:1: ( ( () ) )
            // InternalRosSystemParser.g:8095:1: ( () )
            {
            // InternalRosSystemParser.g:8095:1: ( () )
            // InternalRosSystemParser.g:8096:2: ()
            {
             before(grammarAccess.getUint16Access().getUint16Action_0());
            // InternalRosSystemParser.g:8097:2: ()
            // InternalRosSystemParser.g:8097:3:
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
    // InternalRosSystemParser.g:8105:1: rule__Uint16__Group__1 : rule__Uint16__Group__1__Impl ;
    public final void rule__Uint16__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8109:1: ( rule__Uint16__Group__1__Impl )
            // InternalRosSystemParser.g:8110:2: rule__Uint16__Group__1__Impl
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
    // InternalRosSystemParser.g:8116:1: rule__Uint16__Group__1__Impl : ( Uint16 ) ;
    public final void rule__Uint16__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8120:1: ( ( Uint16 ) )
            // InternalRosSystemParser.g:8121:1: ( Uint16 )
            {
            // InternalRosSystemParser.g:8121:1: ( Uint16 )
            // InternalRosSystemParser.g:8122:2: Uint16
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
    // InternalRosSystemParser.g:8132:1: rule__Int32__Group__0 : rule__Int32__Group__0__Impl rule__Int32__Group__1 ;
    public final void rule__Int32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8136:1: ( rule__Int32__Group__0__Impl rule__Int32__Group__1 )
            // InternalRosSystemParser.g:8137:2: rule__Int32__Group__0__Impl rule__Int32__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalRosSystemParser.g:8144:1: rule__Int32__Group__0__Impl : ( () ) ;
    public final void rule__Int32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8148:1: ( ( () ) )
            // InternalRosSystemParser.g:8149:1: ( () )
            {
            // InternalRosSystemParser.g:8149:1: ( () )
            // InternalRosSystemParser.g:8150:2: ()
            {
             before(grammarAccess.getInt32Access().getInt32Action_0());
            // InternalRosSystemParser.g:8151:2: ()
            // InternalRosSystemParser.g:8151:3:
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
    // InternalRosSystemParser.g:8159:1: rule__Int32__Group__1 : rule__Int32__Group__1__Impl ;
    public final void rule__Int32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8163:1: ( rule__Int32__Group__1__Impl )
            // InternalRosSystemParser.g:8164:2: rule__Int32__Group__1__Impl
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
    // InternalRosSystemParser.g:8170:1: rule__Int32__Group__1__Impl : ( Int32 ) ;
    public final void rule__Int32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8174:1: ( ( Int32 ) )
            // InternalRosSystemParser.g:8175:1: ( Int32 )
            {
            // InternalRosSystemParser.g:8175:1: ( Int32 )
            // InternalRosSystemParser.g:8176:2: Int32
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
    // InternalRosSystemParser.g:8186:1: rule__Uint32__Group__0 : rule__Uint32__Group__0__Impl rule__Uint32__Group__1 ;
    public final void rule__Uint32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8190:1: ( rule__Uint32__Group__0__Impl rule__Uint32__Group__1 )
            // InternalRosSystemParser.g:8191:2: rule__Uint32__Group__0__Impl rule__Uint32__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalRosSystemParser.g:8198:1: rule__Uint32__Group__0__Impl : ( () ) ;
    public final void rule__Uint32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8202:1: ( ( () ) )
            // InternalRosSystemParser.g:8203:1: ( () )
            {
            // InternalRosSystemParser.g:8203:1: ( () )
            // InternalRosSystemParser.g:8204:2: ()
            {
             before(grammarAccess.getUint32Access().getUint32Action_0());
            // InternalRosSystemParser.g:8205:2: ()
            // InternalRosSystemParser.g:8205:3:
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
    // InternalRosSystemParser.g:8213:1: rule__Uint32__Group__1 : rule__Uint32__Group__1__Impl ;
    public final void rule__Uint32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8217:1: ( rule__Uint32__Group__1__Impl )
            // InternalRosSystemParser.g:8218:2: rule__Uint32__Group__1__Impl
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
    // InternalRosSystemParser.g:8224:1: rule__Uint32__Group__1__Impl : ( Uint32 ) ;
    public final void rule__Uint32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8228:1: ( ( Uint32 ) )
            // InternalRosSystemParser.g:8229:1: ( Uint32 )
            {
            // InternalRosSystemParser.g:8229:1: ( Uint32 )
            // InternalRosSystemParser.g:8230:2: Uint32
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
    // InternalRosSystemParser.g:8240:1: rule__Int64__Group__0 : rule__Int64__Group__0__Impl rule__Int64__Group__1 ;
    public final void rule__Int64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8244:1: ( rule__Int64__Group__0__Impl rule__Int64__Group__1 )
            // InternalRosSystemParser.g:8245:2: rule__Int64__Group__0__Impl rule__Int64__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalRosSystemParser.g:8252:1: rule__Int64__Group__0__Impl : ( () ) ;
    public final void rule__Int64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8256:1: ( ( () ) )
            // InternalRosSystemParser.g:8257:1: ( () )
            {
            // InternalRosSystemParser.g:8257:1: ( () )
            // InternalRosSystemParser.g:8258:2: ()
            {
             before(grammarAccess.getInt64Access().getInt64Action_0());
            // InternalRosSystemParser.g:8259:2: ()
            // InternalRosSystemParser.g:8259:3:
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
    // InternalRosSystemParser.g:8267:1: rule__Int64__Group__1 : rule__Int64__Group__1__Impl ;
    public final void rule__Int64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8271:1: ( rule__Int64__Group__1__Impl )
            // InternalRosSystemParser.g:8272:2: rule__Int64__Group__1__Impl
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
    // InternalRosSystemParser.g:8278:1: rule__Int64__Group__1__Impl : ( Int64 ) ;
    public final void rule__Int64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8282:1: ( ( Int64 ) )
            // InternalRosSystemParser.g:8283:1: ( Int64 )
            {
            // InternalRosSystemParser.g:8283:1: ( Int64 )
            // InternalRosSystemParser.g:8284:2: Int64
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
    // InternalRosSystemParser.g:8294:1: rule__Uint64__Group__0 : rule__Uint64__Group__0__Impl rule__Uint64__Group__1 ;
    public final void rule__Uint64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8298:1: ( rule__Uint64__Group__0__Impl rule__Uint64__Group__1 )
            // InternalRosSystemParser.g:8299:2: rule__Uint64__Group__0__Impl rule__Uint64__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalRosSystemParser.g:8306:1: rule__Uint64__Group__0__Impl : ( () ) ;
    public final void rule__Uint64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8310:1: ( ( () ) )
            // InternalRosSystemParser.g:8311:1: ( () )
            {
            // InternalRosSystemParser.g:8311:1: ( () )
            // InternalRosSystemParser.g:8312:2: ()
            {
             before(grammarAccess.getUint64Access().getUint64Action_0());
            // InternalRosSystemParser.g:8313:2: ()
            // InternalRosSystemParser.g:8313:3:
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
    // InternalRosSystemParser.g:8321:1: rule__Uint64__Group__1 : rule__Uint64__Group__1__Impl ;
    public final void rule__Uint64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8325:1: ( rule__Uint64__Group__1__Impl )
            // InternalRosSystemParser.g:8326:2: rule__Uint64__Group__1__Impl
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
    // InternalRosSystemParser.g:8332:1: rule__Uint64__Group__1__Impl : ( Uint64 ) ;
    public final void rule__Uint64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8336:1: ( ( Uint64 ) )
            // InternalRosSystemParser.g:8337:1: ( Uint64 )
            {
            // InternalRosSystemParser.g:8337:1: ( Uint64 )
            // InternalRosSystemParser.g:8338:2: Uint64
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
    // InternalRosSystemParser.g:8348:1: rule__Float32__Group__0 : rule__Float32__Group__0__Impl rule__Float32__Group__1 ;
    public final void rule__Float32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8352:1: ( rule__Float32__Group__0__Impl rule__Float32__Group__1 )
            // InternalRosSystemParser.g:8353:2: rule__Float32__Group__0__Impl rule__Float32__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalRosSystemParser.g:8360:1: rule__Float32__Group__0__Impl : ( () ) ;
    public final void rule__Float32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8364:1: ( ( () ) )
            // InternalRosSystemParser.g:8365:1: ( () )
            {
            // InternalRosSystemParser.g:8365:1: ( () )
            // InternalRosSystemParser.g:8366:2: ()
            {
             before(grammarAccess.getFloat32Access().getFloat32Action_0());
            // InternalRosSystemParser.g:8367:2: ()
            // InternalRosSystemParser.g:8367:3:
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
    // InternalRosSystemParser.g:8375:1: rule__Float32__Group__1 : rule__Float32__Group__1__Impl ;
    public final void rule__Float32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8379:1: ( rule__Float32__Group__1__Impl )
            // InternalRosSystemParser.g:8380:2: rule__Float32__Group__1__Impl
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
    // InternalRosSystemParser.g:8386:1: rule__Float32__Group__1__Impl : ( Float32 ) ;
    public final void rule__Float32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8390:1: ( ( Float32 ) )
            // InternalRosSystemParser.g:8391:1: ( Float32 )
            {
            // InternalRosSystemParser.g:8391:1: ( Float32 )
            // InternalRosSystemParser.g:8392:2: Float32
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
    // InternalRosSystemParser.g:8402:1: rule__Float64__Group__0 : rule__Float64__Group__0__Impl rule__Float64__Group__1 ;
    public final void rule__Float64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8406:1: ( rule__Float64__Group__0__Impl rule__Float64__Group__1 )
            // InternalRosSystemParser.g:8407:2: rule__Float64__Group__0__Impl rule__Float64__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalRosSystemParser.g:8414:1: rule__Float64__Group__0__Impl : ( () ) ;
    public final void rule__Float64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8418:1: ( ( () ) )
            // InternalRosSystemParser.g:8419:1: ( () )
            {
            // InternalRosSystemParser.g:8419:1: ( () )
            // InternalRosSystemParser.g:8420:2: ()
            {
             before(grammarAccess.getFloat64Access().getFloat64Action_0());
            // InternalRosSystemParser.g:8421:2: ()
            // InternalRosSystemParser.g:8421:3:
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
    // InternalRosSystemParser.g:8429:1: rule__Float64__Group__1 : rule__Float64__Group__1__Impl ;
    public final void rule__Float64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8433:1: ( rule__Float64__Group__1__Impl )
            // InternalRosSystemParser.g:8434:2: rule__Float64__Group__1__Impl
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
    // InternalRosSystemParser.g:8440:1: rule__Float64__Group__1__Impl : ( Float64 ) ;
    public final void rule__Float64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8444:1: ( ( Float64 ) )
            // InternalRosSystemParser.g:8445:1: ( Float64 )
            {
            // InternalRosSystemParser.g:8445:1: ( Float64 )
            // InternalRosSystemParser.g:8446:2: Float64
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
    // InternalRosSystemParser.g:8456:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8460:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalRosSystemParser.g:8461:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalRosSystemParser.g:8468:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8472:1: ( ( () ) )
            // InternalRosSystemParser.g:8473:1: ( () )
            {
            // InternalRosSystemParser.g:8473:1: ( () )
            // InternalRosSystemParser.g:8474:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0());
            // InternalRosSystemParser.g:8475:2: ()
            // InternalRosSystemParser.g:8475:3:
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
    // InternalRosSystemParser.g:8483:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8487:1: ( rule__String0__Group__1__Impl )
            // InternalRosSystemParser.g:8488:2: rule__String0__Group__1__Impl
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
    // InternalRosSystemParser.g:8494:1: rule__String0__Group__1__Impl : ( String_1 ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8498:1: ( ( String_1 ) )
            // InternalRosSystemParser.g:8499:1: ( String_1 )
            {
            // InternalRosSystemParser.g:8499:1: ( String_1 )
            // InternalRosSystemParser.g:8500:2: String_1
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
    // InternalRosSystemParser.g:8510:1: rule__Byte__Group__0 : rule__Byte__Group__0__Impl rule__Byte__Group__1 ;
    public final void rule__Byte__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8514:1: ( rule__Byte__Group__0__Impl rule__Byte__Group__1 )
            // InternalRosSystemParser.g:8515:2: rule__Byte__Group__0__Impl rule__Byte__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalRosSystemParser.g:8522:1: rule__Byte__Group__0__Impl : ( () ) ;
    public final void rule__Byte__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8526:1: ( ( () ) )
            // InternalRosSystemParser.g:8527:1: ( () )
            {
            // InternalRosSystemParser.g:8527:1: ( () )
            // InternalRosSystemParser.g:8528:2: ()
            {
             before(grammarAccess.getByteAccess().getByteAction_0());
            // InternalRosSystemParser.g:8529:2: ()
            // InternalRosSystemParser.g:8529:3:
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
    // InternalRosSystemParser.g:8537:1: rule__Byte__Group__1 : rule__Byte__Group__1__Impl ;
    public final void rule__Byte__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8541:1: ( rule__Byte__Group__1__Impl )
            // InternalRosSystemParser.g:8542:2: rule__Byte__Group__1__Impl
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
    // InternalRosSystemParser.g:8548:1: rule__Byte__Group__1__Impl : ( Byte ) ;
    public final void rule__Byte__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8552:1: ( ( Byte ) )
            // InternalRosSystemParser.g:8553:1: ( Byte )
            {
            // InternalRosSystemParser.g:8553:1: ( Byte )
            // InternalRosSystemParser.g:8554:2: Byte
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
    // InternalRosSystemParser.g:8564:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8568:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalRosSystemParser.g:8569:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalRosSystemParser.g:8576:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8580:1: ( ( () ) )
            // InternalRosSystemParser.g:8581:1: ( () )
            {
            // InternalRosSystemParser.g:8581:1: ( () )
            // InternalRosSystemParser.g:8582:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0());
            // InternalRosSystemParser.g:8583:2: ()
            // InternalRosSystemParser.g:8583:3:
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
    // InternalRosSystemParser.g:8591:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8595:1: ( rule__Time__Group__1__Impl )
            // InternalRosSystemParser.g:8596:2: rule__Time__Group__1__Impl
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
    // InternalRosSystemParser.g:8602:1: rule__Time__Group__1__Impl : ( Time ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8606:1: ( ( Time ) )
            // InternalRosSystemParser.g:8607:1: ( Time )
            {
            // InternalRosSystemParser.g:8607:1: ( Time )
            // InternalRosSystemParser.g:8608:2: Time
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
    // InternalRosSystemParser.g:8618:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8622:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalRosSystemParser.g:8623:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalRosSystemParser.g:8630:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8634:1: ( ( () ) )
            // InternalRosSystemParser.g:8635:1: ( () )
            {
            // InternalRosSystemParser.g:8635:1: ( () )
            // InternalRosSystemParser.g:8636:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0());
            // InternalRosSystemParser.g:8637:2: ()
            // InternalRosSystemParser.g:8637:3:
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
    // InternalRosSystemParser.g:8645:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8649:1: ( rule__Duration__Group__1__Impl )
            // InternalRosSystemParser.g:8650:2: rule__Duration__Group__1__Impl
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
    // InternalRosSystemParser.g:8656:1: rule__Duration__Group__1__Impl : ( Duration ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8660:1: ( ( Duration ) )
            // InternalRosSystemParser.g:8661:1: ( Duration )
            {
            // InternalRosSystemParser.g:8661:1: ( Duration )
            // InternalRosSystemParser.g:8662:2: Duration
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
    // InternalRosSystemParser.g:8672:1: rule__BoolArray__Group__0 : rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 ;
    public final void rule__BoolArray__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8676:1: ( rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 )
            // InternalRosSystemParser.g:8677:2: rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalRosSystemParser.g:8684:1: rule__BoolArray__Group__0__Impl : ( () ) ;
    public final void rule__BoolArray__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8688:1: ( ( () ) )
            // InternalRosSystemParser.g:8689:1: ( () )
            {
            // InternalRosSystemParser.g:8689:1: ( () )
            // InternalRosSystemParser.g:8690:2: ()
            {
             before(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0());
            // InternalRosSystemParser.g:8691:2: ()
            // InternalRosSystemParser.g:8691:3:
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
    // InternalRosSystemParser.g:8699:1: rule__BoolArray__Group__1 : rule__BoolArray__Group__1__Impl ;
    public final void rule__BoolArray__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8703:1: ( rule__BoolArray__Group__1__Impl )
            // InternalRosSystemParser.g:8704:2: rule__BoolArray__Group__1__Impl
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
    // InternalRosSystemParser.g:8710:1: rule__BoolArray__Group__1__Impl : ( Bool_1 ) ;
    public final void rule__BoolArray__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8714:1: ( ( Bool_1 ) )
            // InternalRosSystemParser.g:8715:1: ( Bool_1 )
            {
            // InternalRosSystemParser.g:8715:1: ( Bool_1 )
            // InternalRosSystemParser.g:8716:2: Bool_1
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
    // InternalRosSystemParser.g:8726:1: rule__Int8Array__Group__0 : rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 ;
    public final void rule__Int8Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8730:1: ( rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 )
            // InternalRosSystemParser.g:8731:2: rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalRosSystemParser.g:8738:1: rule__Int8Array__Group__0__Impl : ( () ) ;
    public final void rule__Int8Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8742:1: ( ( () ) )
            // InternalRosSystemParser.g:8743:1: ( () )
            {
            // InternalRosSystemParser.g:8743:1: ( () )
            // InternalRosSystemParser.g:8744:2: ()
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0());
            // InternalRosSystemParser.g:8745:2: ()
            // InternalRosSystemParser.g:8745:3:
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
    // InternalRosSystemParser.g:8753:1: rule__Int8Array__Group__1 : rule__Int8Array__Group__1__Impl ;
    public final void rule__Int8Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8757:1: ( rule__Int8Array__Group__1__Impl )
            // InternalRosSystemParser.g:8758:2: rule__Int8Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8764:1: rule__Int8Array__Group__1__Impl : ( Int8_1 ) ;
    public final void rule__Int8Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8768:1: ( ( Int8_1 ) )
            // InternalRosSystemParser.g:8769:1: ( Int8_1 )
            {
            // InternalRosSystemParser.g:8769:1: ( Int8_1 )
            // InternalRosSystemParser.g:8770:2: Int8_1
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
    // InternalRosSystemParser.g:8780:1: rule__Uint8Array__Group__0 : rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 ;
    public final void rule__Uint8Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8784:1: ( rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 )
            // InternalRosSystemParser.g:8785:2: rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalRosSystemParser.g:8792:1: rule__Uint8Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint8Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8796:1: ( ( () ) )
            // InternalRosSystemParser.g:8797:1: ( () )
            {
            // InternalRosSystemParser.g:8797:1: ( () )
            // InternalRosSystemParser.g:8798:2: ()
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0());
            // InternalRosSystemParser.g:8799:2: ()
            // InternalRosSystemParser.g:8799:3:
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
    // InternalRosSystemParser.g:8807:1: rule__Uint8Array__Group__1 : rule__Uint8Array__Group__1__Impl ;
    public final void rule__Uint8Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8811:1: ( rule__Uint8Array__Group__1__Impl )
            // InternalRosSystemParser.g:8812:2: rule__Uint8Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8818:1: rule__Uint8Array__Group__1__Impl : ( Uint8_1 ) ;
    public final void rule__Uint8Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8822:1: ( ( Uint8_1 ) )
            // InternalRosSystemParser.g:8823:1: ( Uint8_1 )
            {
            // InternalRosSystemParser.g:8823:1: ( Uint8_1 )
            // InternalRosSystemParser.g:8824:2: Uint8_1
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
    // InternalRosSystemParser.g:8834:1: rule__Int16Array__Group__0 : rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 ;
    public final void rule__Int16Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8838:1: ( rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 )
            // InternalRosSystemParser.g:8839:2: rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalRosSystemParser.g:8846:1: rule__Int16Array__Group__0__Impl : ( () ) ;
    public final void rule__Int16Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8850:1: ( ( () ) )
            // InternalRosSystemParser.g:8851:1: ( () )
            {
            // InternalRosSystemParser.g:8851:1: ( () )
            // InternalRosSystemParser.g:8852:2: ()
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0());
            // InternalRosSystemParser.g:8853:2: ()
            // InternalRosSystemParser.g:8853:3:
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
    // InternalRosSystemParser.g:8861:1: rule__Int16Array__Group__1 : rule__Int16Array__Group__1__Impl ;
    public final void rule__Int16Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8865:1: ( rule__Int16Array__Group__1__Impl )
            // InternalRosSystemParser.g:8866:2: rule__Int16Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8872:1: rule__Int16Array__Group__1__Impl : ( Int16_1 ) ;
    public final void rule__Int16Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8876:1: ( ( Int16_1 ) )
            // InternalRosSystemParser.g:8877:1: ( Int16_1 )
            {
            // InternalRosSystemParser.g:8877:1: ( Int16_1 )
            // InternalRosSystemParser.g:8878:2: Int16_1
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
    // InternalRosSystemParser.g:8888:1: rule__Uint16Array__Group__0 : rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 ;
    public final void rule__Uint16Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8892:1: ( rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 )
            // InternalRosSystemParser.g:8893:2: rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalRosSystemParser.g:8900:1: rule__Uint16Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint16Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8904:1: ( ( () ) )
            // InternalRosSystemParser.g:8905:1: ( () )
            {
            // InternalRosSystemParser.g:8905:1: ( () )
            // InternalRosSystemParser.g:8906:2: ()
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0());
            // InternalRosSystemParser.g:8907:2: ()
            // InternalRosSystemParser.g:8907:3:
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
    // InternalRosSystemParser.g:8915:1: rule__Uint16Array__Group__1 : rule__Uint16Array__Group__1__Impl ;
    public final void rule__Uint16Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8919:1: ( rule__Uint16Array__Group__1__Impl )
            // InternalRosSystemParser.g:8920:2: rule__Uint16Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8926:1: rule__Uint16Array__Group__1__Impl : ( Uint16_1 ) ;
    public final void rule__Uint16Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8930:1: ( ( Uint16_1 ) )
            // InternalRosSystemParser.g:8931:1: ( Uint16_1 )
            {
            // InternalRosSystemParser.g:8931:1: ( Uint16_1 )
            // InternalRosSystemParser.g:8932:2: Uint16_1
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
    // InternalRosSystemParser.g:8942:1: rule__Int32Array__Group__0 : rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 ;
    public final void rule__Int32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8946:1: ( rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 )
            // InternalRosSystemParser.g:8947:2: rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalRosSystemParser.g:8954:1: rule__Int32Array__Group__0__Impl : ( () ) ;
    public final void rule__Int32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8958:1: ( ( () ) )
            // InternalRosSystemParser.g:8959:1: ( () )
            {
            // InternalRosSystemParser.g:8959:1: ( () )
            // InternalRosSystemParser.g:8960:2: ()
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0());
            // InternalRosSystemParser.g:8961:2: ()
            // InternalRosSystemParser.g:8961:3:
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
    // InternalRosSystemParser.g:8969:1: rule__Int32Array__Group__1 : rule__Int32Array__Group__1__Impl ;
    public final void rule__Int32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8973:1: ( rule__Int32Array__Group__1__Impl )
            // InternalRosSystemParser.g:8974:2: rule__Int32Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8980:1: rule__Int32Array__Group__1__Impl : ( Int32_1 ) ;
    public final void rule__Int32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8984:1: ( ( Int32_1 ) )
            // InternalRosSystemParser.g:8985:1: ( Int32_1 )
            {
            // InternalRosSystemParser.g:8985:1: ( Int32_1 )
            // InternalRosSystemParser.g:8986:2: Int32_1
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
    // InternalRosSystemParser.g:8996:1: rule__Uint32Array__Group__0 : rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 ;
    public final void rule__Uint32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9000:1: ( rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 )
            // InternalRosSystemParser.g:9001:2: rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalRosSystemParser.g:9008:1: rule__Uint32Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9012:1: ( ( () ) )
            // InternalRosSystemParser.g:9013:1: ( () )
            {
            // InternalRosSystemParser.g:9013:1: ( () )
            // InternalRosSystemParser.g:9014:2: ()
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0());
            // InternalRosSystemParser.g:9015:2: ()
            // InternalRosSystemParser.g:9015:3:
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
    // InternalRosSystemParser.g:9023:1: rule__Uint32Array__Group__1 : rule__Uint32Array__Group__1__Impl ;
    public final void rule__Uint32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9027:1: ( rule__Uint32Array__Group__1__Impl )
            // InternalRosSystemParser.g:9028:2: rule__Uint32Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9034:1: rule__Uint32Array__Group__1__Impl : ( Uint32_1 ) ;
    public final void rule__Uint32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9038:1: ( ( Uint32_1 ) )
            // InternalRosSystemParser.g:9039:1: ( Uint32_1 )
            {
            // InternalRosSystemParser.g:9039:1: ( Uint32_1 )
            // InternalRosSystemParser.g:9040:2: Uint32_1
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
    // InternalRosSystemParser.g:9050:1: rule__Int64Array__Group__0 : rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 ;
    public final void rule__Int64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9054:1: ( rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 )
            // InternalRosSystemParser.g:9055:2: rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalRosSystemParser.g:9062:1: rule__Int64Array__Group__0__Impl : ( () ) ;
    public final void rule__Int64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9066:1: ( ( () ) )
            // InternalRosSystemParser.g:9067:1: ( () )
            {
            // InternalRosSystemParser.g:9067:1: ( () )
            // InternalRosSystemParser.g:9068:2: ()
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0());
            // InternalRosSystemParser.g:9069:2: ()
            // InternalRosSystemParser.g:9069:3:
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
    // InternalRosSystemParser.g:9077:1: rule__Int64Array__Group__1 : rule__Int64Array__Group__1__Impl ;
    public final void rule__Int64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9081:1: ( rule__Int64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9082:2: rule__Int64Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9088:1: rule__Int64Array__Group__1__Impl : ( Int64_1 ) ;
    public final void rule__Int64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9092:1: ( ( Int64_1 ) )
            // InternalRosSystemParser.g:9093:1: ( Int64_1 )
            {
            // InternalRosSystemParser.g:9093:1: ( Int64_1 )
            // InternalRosSystemParser.g:9094:2: Int64_1
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
    // InternalRosSystemParser.g:9104:1: rule__Uint64Array__Group__0 : rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 ;
    public final void rule__Uint64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9108:1: ( rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 )
            // InternalRosSystemParser.g:9109:2: rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1
            {
            pushFollow(FOLLOW_68);
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
    // InternalRosSystemParser.g:9116:1: rule__Uint64Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9120:1: ( ( () ) )
            // InternalRosSystemParser.g:9121:1: ( () )
            {
            // InternalRosSystemParser.g:9121:1: ( () )
            // InternalRosSystemParser.g:9122:2: ()
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0());
            // InternalRosSystemParser.g:9123:2: ()
            // InternalRosSystemParser.g:9123:3:
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
    // InternalRosSystemParser.g:9131:1: rule__Uint64Array__Group__1 : rule__Uint64Array__Group__1__Impl ;
    public final void rule__Uint64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9135:1: ( rule__Uint64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9136:2: rule__Uint64Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9142:1: rule__Uint64Array__Group__1__Impl : ( Uint64_1 ) ;
    public final void rule__Uint64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9146:1: ( ( Uint64_1 ) )
            // InternalRosSystemParser.g:9147:1: ( Uint64_1 )
            {
            // InternalRosSystemParser.g:9147:1: ( Uint64_1 )
            // InternalRosSystemParser.g:9148:2: Uint64_1
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
    // InternalRosSystemParser.g:9158:1: rule__Float32Array__Group__0 : rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 ;
    public final void rule__Float32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9162:1: ( rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 )
            // InternalRosSystemParser.g:9163:2: rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalRosSystemParser.g:9170:1: rule__Float32Array__Group__0__Impl : ( () ) ;
    public final void rule__Float32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9174:1: ( ( () ) )
            // InternalRosSystemParser.g:9175:1: ( () )
            {
            // InternalRosSystemParser.g:9175:1: ( () )
            // InternalRosSystemParser.g:9176:2: ()
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0());
            // InternalRosSystemParser.g:9177:2: ()
            // InternalRosSystemParser.g:9177:3:
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
    // InternalRosSystemParser.g:9185:1: rule__Float32Array__Group__1 : rule__Float32Array__Group__1__Impl ;
    public final void rule__Float32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9189:1: ( rule__Float32Array__Group__1__Impl )
            // InternalRosSystemParser.g:9190:2: rule__Float32Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9196:1: rule__Float32Array__Group__1__Impl : ( Float32_1 ) ;
    public final void rule__Float32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9200:1: ( ( Float32_1 ) )
            // InternalRosSystemParser.g:9201:1: ( Float32_1 )
            {
            // InternalRosSystemParser.g:9201:1: ( Float32_1 )
            // InternalRosSystemParser.g:9202:2: Float32_1
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
    // InternalRosSystemParser.g:9212:1: rule__Float64Array__Group__0 : rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 ;
    public final void rule__Float64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9216:1: ( rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 )
            // InternalRosSystemParser.g:9217:2: rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalRosSystemParser.g:9224:1: rule__Float64Array__Group__0__Impl : ( () ) ;
    public final void rule__Float64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9228:1: ( ( () ) )
            // InternalRosSystemParser.g:9229:1: ( () )
            {
            // InternalRosSystemParser.g:9229:1: ( () )
            // InternalRosSystemParser.g:9230:2: ()
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0());
            // InternalRosSystemParser.g:9231:2: ()
            // InternalRosSystemParser.g:9231:3:
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
    // InternalRosSystemParser.g:9239:1: rule__Float64Array__Group__1 : rule__Float64Array__Group__1__Impl ;
    public final void rule__Float64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9243:1: ( rule__Float64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9244:2: rule__Float64Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9250:1: rule__Float64Array__Group__1__Impl : ( Float64_1 ) ;
    public final void rule__Float64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9254:1: ( ( Float64_1 ) )
            // InternalRosSystemParser.g:9255:1: ( Float64_1 )
            {
            // InternalRosSystemParser.g:9255:1: ( Float64_1 )
            // InternalRosSystemParser.g:9256:2: Float64_1
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
    // InternalRosSystemParser.g:9266:1: rule__String0Array__Group__0 : rule__String0Array__Group__0__Impl rule__String0Array__Group__1 ;
    public final void rule__String0Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9270:1: ( rule__String0Array__Group__0__Impl rule__String0Array__Group__1 )
            // InternalRosSystemParser.g:9271:2: rule__String0Array__Group__0__Impl rule__String0Array__Group__1
            {
            pushFollow(FOLLOW_71);
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
    // InternalRosSystemParser.g:9278:1: rule__String0Array__Group__0__Impl : ( () ) ;
    public final void rule__String0Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9282:1: ( ( () ) )
            // InternalRosSystemParser.g:9283:1: ( () )
            {
            // InternalRosSystemParser.g:9283:1: ( () )
            // InternalRosSystemParser.g:9284:2: ()
            {
             before(grammarAccess.getString0ArrayAccess().getStringArrayAction_0());
            // InternalRosSystemParser.g:9285:2: ()
            // InternalRosSystemParser.g:9285:3:
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
    // InternalRosSystemParser.g:9293:1: rule__String0Array__Group__1 : rule__String0Array__Group__1__Impl ;
    public final void rule__String0Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9297:1: ( rule__String0Array__Group__1__Impl )
            // InternalRosSystemParser.g:9298:2: rule__String0Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9304:1: rule__String0Array__Group__1__Impl : ( String_2 ) ;
    public final void rule__String0Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9308:1: ( ( String_2 ) )
            // InternalRosSystemParser.g:9309:1: ( String_2 )
            {
            // InternalRosSystemParser.g:9309:1: ( String_2 )
            // InternalRosSystemParser.g:9310:2: String_2
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
    // InternalRosSystemParser.g:9320:1: rule__ByteArray__Group__0 : rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 ;
    public final void rule__ByteArray__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9324:1: ( rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 )
            // InternalRosSystemParser.g:9325:2: rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalRosSystemParser.g:9332:1: rule__ByteArray__Group__0__Impl : ( () ) ;
    public final void rule__ByteArray__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9336:1: ( ( () ) )
            // InternalRosSystemParser.g:9337:1: ( () )
            {
            // InternalRosSystemParser.g:9337:1: ( () )
            // InternalRosSystemParser.g:9338:2: ()
            {
             before(grammarAccess.getByteArrayAccess().getByteArrayAction_0());
            // InternalRosSystemParser.g:9339:2: ()
            // InternalRosSystemParser.g:9339:3:
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
    // InternalRosSystemParser.g:9347:1: rule__ByteArray__Group__1 : rule__ByteArray__Group__1__Impl ;
    public final void rule__ByteArray__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9351:1: ( rule__ByteArray__Group__1__Impl )
            // InternalRosSystemParser.g:9352:2: rule__ByteArray__Group__1__Impl
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
    // InternalRosSystemParser.g:9358:1: rule__ByteArray__Group__1__Impl : ( Byte_1 ) ;
    public final void rule__ByteArray__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9362:1: ( ( Byte_1 ) )
            // InternalRosSystemParser.g:9363:1: ( Byte_1 )
            {
            // InternalRosSystemParser.g:9363:1: ( Byte_1 )
            // InternalRosSystemParser.g:9364:2: Byte_1
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
    // InternalRosSystemParser.g:9374:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9378:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalRosSystemParser.g:9379:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_73);
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
    // InternalRosSystemParser.g:9386:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9390:1: ( ( () ) )
            // InternalRosSystemParser.g:9391:1: ( () )
            {
            // InternalRosSystemParser.g:9391:1: ( () )
            // InternalRosSystemParser.g:9392:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0());
            // InternalRosSystemParser.g:9393:2: ()
            // InternalRosSystemParser.g:9393:3:
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
    // InternalRosSystemParser.g:9401:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9405:1: ( rule__Header__Group__1__Impl )
            // InternalRosSystemParser.g:9406:2: rule__Header__Group__1__Impl
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
    // InternalRosSystemParser.g:9412:1: rule__Header__Group__1__Impl : ( Header ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9416:1: ( ( Header ) )
            // InternalRosSystemParser.g:9417:1: ( Header )
            {
            // InternalRosSystemParser.g:9417:1: ( Header )
            // InternalRosSystemParser.g:9418:2: Header
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
    // InternalRosSystemParser.g:9428:1: rule__ArrayTopicSpecRef__Group__0 : rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 ;
    public final void rule__ArrayTopicSpecRef__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9432:1: ( rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 )
            // InternalRosSystemParser.g:9433:2: rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:9440:1: rule__ArrayTopicSpecRef__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayTopicSpecRef__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9444:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:9445:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:9445:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:9446:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:9455:1: rule__ArrayTopicSpecRef__Group__1 : rule__ArrayTopicSpecRef__Group__1__Impl rule__ArrayTopicSpecRef__Group__2 ;
    public final void rule__ArrayTopicSpecRef__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9459:1: ( rule__ArrayTopicSpecRef__Group__1__Impl rule__ArrayTopicSpecRef__Group__2 )
            // InternalRosSystemParser.g:9460:2: rule__ArrayTopicSpecRef__Group__1__Impl rule__ArrayTopicSpecRef__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystemParser.g:9467:1: rule__ArrayTopicSpecRef__Group__1__Impl : ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) ) ;
    public final void rule__ArrayTopicSpecRef__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9471:1: ( ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) ) )
            // InternalRosSystemParser.g:9472:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) )
            {
            // InternalRosSystemParser.g:9472:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 ) )
            // InternalRosSystemParser.g:9473:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_1());
            // InternalRosSystemParser.g:9474:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_1 )
            // InternalRosSystemParser.g:9474:3: rule__ArrayTopicSpecRef__TopicSpecAssignment_1
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
    // InternalRosSystemParser.g:9482:1: rule__ArrayTopicSpecRef__Group__2 : rule__ArrayTopicSpecRef__Group__2__Impl ;
    public final void rule__ArrayTopicSpecRef__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9486:1: ( rule__ArrayTopicSpecRef__Group__2__Impl )
            // InternalRosSystemParser.g:9487:2: rule__ArrayTopicSpecRef__Group__2__Impl
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
    // InternalRosSystemParser.g:9493:1: rule__ArrayTopicSpecRef__Group__2__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayTopicSpecRef__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9497:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:9498:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:9498:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:9499:2: RightSquareBracket
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


    // $ANTLR start "rule__RosSystem__NameAssignment_0"
    // InternalRosSystemParser.g:9509:1: rule__RosSystem__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9513:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9514:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9514:2: ( ruleEString )
            // InternalRosSystemParser.g:9515:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__NameAssignment_0"


    // $ANTLR start "rule__RosSystem__ProcessesAssignment_3_0_2"
    // InternalRosSystemParser.g:9524:1: rule__RosSystem__ProcessesAssignment_3_0_2 : ( ruleProcess ) ;
    public final void rule__RosSystem__ProcessesAssignment_3_0_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9528:1: ( ( ruleProcess ) )
            // InternalRosSystemParser.g:9529:2: ( ruleProcess )
            {
            // InternalRosSystemParser.g:9529:2: ( ruleProcess )
            // InternalRosSystemParser.g:9530:3: ruleProcess
            {
             before(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_3_0_2_0());
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_3_0_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ProcessesAssignment_3_0_2"


    // $ANTLR start "rule__RosSystem__ComponentsAssignment_3_1_2"
    // InternalRosSystemParser.g:9539:1: rule__RosSystem__ComponentsAssignment_3_1_2 : ( ruleRosNode ) ;
    public final void rule__RosSystem__ComponentsAssignment_3_1_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9543:1: ( ( ruleRosNode ) )
            // InternalRosSystemParser.g:9544:2: ( ruleRosNode )
            {
            // InternalRosSystemParser.g:9544:2: ( ruleRosNode )
            // InternalRosSystemParser.g:9545:3: ruleRosNode
            {
             before(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_3_1_2_0());
            pushFollow(FOLLOW_2);
            ruleRosNode();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_3_1_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ComponentsAssignment_3_1_2"


    // $ANTLR start "rule__RosSystem__ParameterAssignment_3_2_2"
    // InternalRosSystemParser.g:9554:1: rule__RosSystem__ParameterAssignment_3_2_2 : ( ruleRosParameter ) ;
    public final void rule__RosSystem__ParameterAssignment_3_2_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9558:1: ( ( ruleRosParameter ) )
            // InternalRosSystemParser.g:9559:2: ( ruleRosParameter )
            {
            // InternalRosSystemParser.g:9559:2: ( ruleRosParameter )
            // InternalRosSystemParser.g:9560:3: ruleRosParameter
            {
             before(grammarAccess.getRosSystemAccess().getParameterRosParameterParserRuleCall_3_2_2_0());
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getParameterRosParameterParserRuleCall_3_2_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ParameterAssignment_3_2_2"


    // $ANTLR start "rule__RosSystem__ConnectionsAssignment_3_3_2"
    // InternalRosSystemParser.g:9569:1: rule__RosSystem__ConnectionsAssignment_3_3_2 : ( ruleRosConnection ) ;
    public final void rule__RosSystem__ConnectionsAssignment_3_3_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9573:1: ( ( ruleRosConnection ) )
            // InternalRosSystemParser.g:9574:2: ( ruleRosConnection )
            {
            // InternalRosSystemParser.g:9574:2: ( ruleRosConnection )
            // InternalRosSystemParser.g:9575:3: ruleRosConnection
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsRosConnectionParserRuleCall_3_3_2_0());
            pushFollow(FOLLOW_2);
            ruleRosConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getConnectionsRosConnectionParserRuleCall_3_3_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ConnectionsAssignment_3_3_2"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalRosSystemParser.g:9584:1: rule__Process__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9588:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9589:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9589:2: ( ruleEString )
            // InternalRosSystemParser.g:9590:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__NodesAssignment_4_2"
    // InternalRosSystemParser.g:9599:1: rule__Process__NodesAssignment_4_2 : ( ruleComponentRef ) ;
    public final void rule__Process__NodesAssignment_4_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9603:1: ( ( ruleComponentRef ) )
            // InternalRosSystemParser.g:9604:2: ( ruleComponentRef )
            {
            // InternalRosSystemParser.g:9604:2: ( ruleComponentRef )
            // InternalRosSystemParser.g:9605:3: ruleComponentRef
            {
             before(grammarAccess.getProcessAccess().getNodesComponentRefParserRuleCall_4_2_0());
            pushFollow(FOLLOW_2);
            ruleComponentRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNodesComponentRefParserRuleCall_4_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NodesAssignment_4_2"


    // $ANTLR start "rule__Process__NodesAssignment_4_3_1"
    // InternalRosSystemParser.g:9614:1: rule__Process__NodesAssignment_4_3_1 : ( ruleComponentRef ) ;
    public final void rule__Process__NodesAssignment_4_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9618:1: ( ( ruleComponentRef ) )
            // InternalRosSystemParser.g:9619:2: ( ruleComponentRef )
            {
            // InternalRosSystemParser.g:9619:2: ( ruleComponentRef )
            // InternalRosSystemParser.g:9620:3: ruleComponentRef
            {
             before(grammarAccess.getProcessAccess().getNodesComponentRefParserRuleCall_4_3_1_0());
            pushFollow(FOLLOW_2);
            ruleComponentRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNodesComponentRefParserRuleCall_4_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NodesAssignment_4_3_1"


    // $ANTLR start "rule__Process__ThreadsAssignment_5_1"
    // InternalRosSystemParser.g:9629:1: rule__Process__ThreadsAssignment_5_1 : ( ruleInteger0 ) ;
    public final void rule__Process__ThreadsAssignment_5_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9633:1: ( ( ruleInteger0 ) )
            // InternalRosSystemParser.g:9634:2: ( ruleInteger0 )
            {
            // InternalRosSystemParser.g:9634:2: ( ruleInteger0 )
            // InternalRosSystemParser.g:9635:3: ruleInteger0
            {
             before(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ThreadsAssignment_5_1"


    // $ANTLR start "rule__ComponentRef__ComponentRefAssignment_1"
    // InternalRosSystemParser.g:9644:1: rule__ComponentRef__ComponentRefAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentRef__ComponentRefAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9648:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9649:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9649:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9650:3: ( ruleEString )
            {
             before(grammarAccess.getComponentRefAccess().getComponentRefRosNodeCrossReference_1_0());
            // InternalRosSystemParser.g:9651:3: ( ruleEString )
            // InternalRosSystemParser.g:9652:4: ruleEString
            {
             before(grammarAccess.getComponentRefAccess().getComponentRefRosNodeEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentRefAccess().getComponentRefRosNodeEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getComponentRefAccess().getComponentRefRosNodeCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentRef__ComponentRefAssignment_1"


    // $ANTLR start "rule__RosNode__NameAssignment_1"
    // InternalRosSystemParser.g:9663:1: rule__RosNode__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RosNode__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9667:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9668:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9668:2: ( ruleEString )
            // InternalRosSystemParser.g:9669:3: ruleEString
            {
             before(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__NameAssignment_1"


    // $ANTLR start "rule__RosNode__FromAssignment_5"
    // InternalRosSystemParser.g:9678:1: rule__RosNode__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__RosNode__FromAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9682:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9683:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9683:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9684:3: ( ruleEString )
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0());
            // InternalRosSystemParser.g:9685:3: ( ruleEString )
            // InternalRosSystemParser.g:9686:4: ruleEString
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeEStringParserRuleCall_5_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getFromNodeEStringParserRuleCall_5_0_1());

            }

             after(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__FromAssignment_5"


    // $ANTLR start "rule__RosNode__RosinterfacesAssignment_6_2"
    // InternalRosSystemParser.g:9697:1: rule__RosNode__RosinterfacesAssignment_6_2 : ( ruleRosInterface ) ;
    public final void rule__RosNode__RosinterfacesAssignment_6_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9701:1: ( ( ruleRosInterface ) )
            // InternalRosSystemParser.g:9702:2: ( ruleRosInterface )
            {
            // InternalRosSystemParser.g:9702:2: ( ruleRosInterface )
            // InternalRosSystemParser.g:9703:3: ruleRosInterface
            {
             before(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_6_2_0());
            pushFollow(FOLLOW_2);
            ruleRosInterface();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_6_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__RosinterfacesAssignment_6_2"


    // $ANTLR start "rule__RosNode__RosparametersAssignment_7_2"
    // InternalRosSystemParser.g:9712:1: rule__RosNode__RosparametersAssignment_7_2 : ( ruleRosParameter ) ;
    public final void rule__RosNode__RosparametersAssignment_7_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9716:1: ( ( ruleRosParameter ) )
            // InternalRosSystemParser.g:9717:2: ( ruleRosParameter )
            {
            // InternalRosSystemParser.g:9717:2: ( ruleRosParameter )
            // InternalRosSystemParser.g:9718:3: ruleRosParameter
            {
             before(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_7_2_0());
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_7_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__RosparametersAssignment_7_2"


    // $ANTLR start "rule__RosInterface__NameAssignment_0"
    // InternalRosSystemParser.g:9727:1: rule__RosInterface__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosInterface__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9731:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9732:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9732:2: ( ruleEString )
            // InternalRosSystemParser.g:9733:3: ruleEString
            {
             before(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_0_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__NameAssignment_0"


    // $ANTLR start "rule__RosInterface__ReferenceAssignment_3"
    // InternalRosSystemParser.g:9742:1: rule__RosInterface__ReferenceAssignment_3 : ( ruleInterfaceReference ) ;
    public final void rule__RosInterface__ReferenceAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9746:1: ( ( ruleInterfaceReference ) )
            // InternalRosSystemParser.g:9747:2: ( ruleInterfaceReference )
            {
            // InternalRosSystemParser.g:9747:2: ( ruleInterfaceReference )
            // InternalRosSystemParser.g:9748:3: ruleInterfaceReference
            {
             before(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0());
            pushFollow(FOLLOW_2);
            ruleInterfaceReference();

            state._fsp--;

             after(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__ReferenceAssignment_3"


    // $ANTLR start "rule__RosPublisherReference__FromAssignment_1"
    // InternalRosSystemParser.g:9757:1: rule__RosPublisherReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisherReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9761:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9762:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9762:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9763:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_1_0());
            // InternalRosSystemParser.g:9764:3: ( ruleEString )
            // InternalRosSystemParser.g:9765:4: ruleEString
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__FromAssignment_1"


    // $ANTLR start "rule__RosSubscriberReference__FromAssignment_1"
    // InternalRosSystemParser.g:9776:1: rule__RosSubscriberReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriberReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9780:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9781:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9781:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9782:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_1_0());
            // InternalRosSystemParser.g:9783:3: ( ruleEString )
            // InternalRosSystemParser.g:9784:4: ruleEString
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__FromAssignment_1"


    // $ANTLR start "rule__RosServiceServerReference__FromAssignment_1"
    // InternalRosSystemParser.g:9795:1: rule__RosServiceServerReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServerReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9799:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9800:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9800:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9801:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_1_0());
            // InternalRosSystemParser.g:9802:3: ( ruleEString )
            // InternalRosSystemParser.g:9803:4: ruleEString
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__FromAssignment_1"


    // $ANTLR start "rule__RosServerClientReference__FromAssignment_1"
    // InternalRosSystemParser.g:9814:1: rule__RosServerClientReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServerClientReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9818:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9819:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9819:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9820:3: ( ruleEString )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_1_0());
            // InternalRosSystemParser.g:9821:3: ( ruleEString )
            // InternalRosSystemParser.g:9822:4: ruleEString
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__FromAssignment_1"


    // $ANTLR start "rule__RosActionServerReference__FromAssignment_1"
    // InternalRosSystemParser.g:9833:1: rule__RosActionServerReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServerReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9837:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9838:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9838:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9839:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_1_0());
            // InternalRosSystemParser.g:9840:3: ( ruleEString )
            // InternalRosSystemParser.g:9841:4: ruleEString
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__FromAssignment_1"


    // $ANTLR start "rule__RosActionClientReference__FromAssignment_1"
    // InternalRosSystemParser.g:9852:1: rule__RosActionClientReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClientReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9856:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9857:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9857:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9858:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_1_0());
            // InternalRosSystemParser.g:9859:3: ( ruleEString )
            // InternalRosSystemParser.g:9860:4: ruleEString
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientEStringParserRuleCall_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientEStringParserRuleCall_1_0_1());

            }

             after(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__FromAssignment_1"


    // $ANTLR start "rule__RosParameter__NameAssignment_1"
    // InternalRosSystemParser.g:9871:1: rule__RosParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RosParameter__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9875:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9876:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9876:2: ( ruleEString )
            // InternalRosSystemParser.g:9877:3: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__NameAssignment_1"


    // $ANTLR start "rule__RosParameter__FromAssignment_3"
    // InternalRosSystemParser.g:9886:1: rule__RosParameter__FromAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__RosParameter__FromAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9890:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9891:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9891:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9892:3: ( ruleEString )
            {
             before(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_3_0());
            // InternalRosSystemParser.g:9893:3: ( ruleEString )
            // InternalRosSystemParser.g:9894:4: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_3_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_3_0_1());

            }

             after(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__FromAssignment_3"


    // $ANTLR start "rule__RosParameter__ValueAssignment_6"
    // InternalRosSystemParser.g:9905:1: rule__RosParameter__ValueAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__RosParameter__ValueAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9909:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:9910:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:9910:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:9911:3: ruleParameterValue
            {
             before(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_0());
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ValueAssignment_6"


    // $ANTLR start "rule__RosConnection__FromAssignment_2"
    // InternalRosSystemParser.g:9920:1: rule__RosConnection__FromAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__RosConnection__FromAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9924:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9925:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9925:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9926:3: ( ruleEString )
            {
             before(grammarAccess.getRosConnectionAccess().getFromRosInterfaceCrossReference_2_0());
            // InternalRosSystemParser.g:9927:3: ( ruleEString )
            // InternalRosSystemParser.g:9928:4: ruleEString
            {
             before(grammarAccess.getRosConnectionAccess().getFromRosInterfaceEStringParserRuleCall_2_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosConnectionAccess().getFromRosInterfaceEStringParserRuleCall_2_0_1());

            }

             after(grammarAccess.getRosConnectionAccess().getFromRosInterfaceCrossReference_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__FromAssignment_2"


    // $ANTLR start "rule__RosConnection__ToAssignment_4"
    // InternalRosSystemParser.g:9939:1: rule__RosConnection__ToAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RosConnection__ToAssignment_4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9943:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9944:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9944:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9945:3: ( ruleEString )
            {
             before(grammarAccess.getRosConnectionAccess().getToRosInterfaceCrossReference_4_0());
            // InternalRosSystemParser.g:9946:3: ( ruleEString )
            // InternalRosSystemParser.g:9947:4: ruleEString
            {
             before(grammarAccess.getRosConnectionAccess().getToRosInterfaceEStringParserRuleCall_4_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosConnectionAccess().getToRosInterfaceEStringParserRuleCall_4_0_1());

            }

             after(grammarAccess.getRosConnectionAccess().getToRosInterfaceCrossReference_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__ToAssignment_4"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_1"
    // InternalRosSystemParser.g:9958:1: rule__GlobalNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9962:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9963:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9963:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9964:3: ruleGraphName
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
    // InternalRosSystemParser.g:9973:1: rule__GlobalNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9977:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9978:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9978:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9979:3: ruleGraphName
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
    // InternalRosSystemParser.g:9988:1: rule__RelativeNamespace_Impl__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9992:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9993:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9993:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9994:3: ruleGraphName
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
    // InternalRosSystemParser.g:10003:1: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10007:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10008:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10008:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10009:3: ruleGraphName
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
    // InternalRosSystemParser.g:10018:1: rule__PrivateNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10022:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10023:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10023:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10024:3: ruleGraphName
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
    // InternalRosSystemParser.g:10033:1: rule__PrivateNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10037:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10038:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10038:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10039:3: ruleGraphName
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
    // InternalRosSystemParser.g:10048:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10052:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10053:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10053:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10054:3: ruleParameterType
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
    // InternalRosSystemParser.g:10063:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10067:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10068:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10068:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10069:3: ruleParameterType
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
    // InternalRosSystemParser.g:10078:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10082:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:10083:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:10083:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:10084:3: ruleParameterStructTypeMember
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
    // InternalRosSystemParser.g:10093:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10097:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:10098:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:10098:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:10099:3: ruleParameterStructTypeMember
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
    // InternalRosSystemParser.g:10108:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10112:1: ( ( ruleParameterInteger ) )
            // InternalRosSystemParser.g:10113:2: ( ruleParameterInteger )
            {
            // InternalRosSystemParser.g:10113:2: ( ruleParameterInteger )
            // InternalRosSystemParser.g:10114:3: ruleParameterInteger
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
    // InternalRosSystemParser.g:10123:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10127:1: ( ( ruleParameterString ) )
            // InternalRosSystemParser.g:10128:2: ( ruleParameterString )
            {
            // InternalRosSystemParser.g:10128:2: ( ruleParameterString )
            // InternalRosSystemParser.g:10129:3: ruleParameterString
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
    // InternalRosSystemParser.g:10138:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10142:1: ( ( ruleParameterDouble ) )
            // InternalRosSystemParser.g:10143:2: ( ruleParameterDouble )
            {
            // InternalRosSystemParser.g:10143:2: ( ruleParameterDouble )
            // InternalRosSystemParser.g:10144:3: ruleParameterDouble
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
    // InternalRosSystemParser.g:10153:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10157:1: ( ( ruleParameterBoolean ) )
            // InternalRosSystemParser.g:10158:2: ( ruleParameterBoolean )
            {
            // InternalRosSystemParser.g:10158:2: ( ruleParameterBoolean )
            // InternalRosSystemParser.g:10159:3: ruleParameterBoolean
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
    // InternalRosSystemParser.g:10168:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10172:1: ( ( ruleParameterBase64 ) )
            // InternalRosSystemParser.g:10173:2: ( ruleParameterBase64 )
            {
            // InternalRosSystemParser.g:10173:2: ( ruleParameterBase64 )
            // InternalRosSystemParser.g:10174:3: ruleParameterBase64
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
    // InternalRosSystemParser.g:10183:1: rule__ParameterArrayType__TypeAssignment_2 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10187:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10188:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10188:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10189:3: ruleParameterType
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
    // InternalRosSystemParser.g:10198:1: rule__ParameterArrayType__DefaultAssignment_3_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10202:1: ( ( ruleParameterList ) )
            // InternalRosSystemParser.g:10203:2: ( ruleParameterList )
            {
            // InternalRosSystemParser.g:10203:2: ( ruleParameterList )
            // InternalRosSystemParser.g:10204:3: ruleParameterList
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
    // InternalRosSystemParser.g:10213:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10217:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10218:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10218:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10219:3: ruleParameterValue
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
    // InternalRosSystemParser.g:10228:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10232:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10233:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10233:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10234:3: ruleParameterValue
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
    // InternalRosSystemParser.g:10243:1: rule__ParameterAny__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10247:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10248:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10248:2: ( ruleEString )
            // InternalRosSystemParser.g:10249:3: ruleEString
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
    // InternalRosSystemParser.g:10258:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10262:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10263:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10263:2: ( ruleEString )
            // InternalRosSystemParser.g:10264:3: ruleEString
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
    // InternalRosSystemParser.g:10273:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10277:1: ( ( ruleBase64Binary ) )
            // InternalRosSystemParser.g:10278:2: ( ruleBase64Binary )
            {
            // InternalRosSystemParser.g:10278:2: ( ruleBase64Binary )
            // InternalRosSystemParser.g:10279:3: ruleBase64Binary
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
    // InternalRosSystemParser.g:10288:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10292:1: ( ( ruleInteger0 ) )
            // InternalRosSystemParser.g:10293:2: ( ruleInteger0 )
            {
            // InternalRosSystemParser.g:10293:2: ( ruleInteger0 )
            // InternalRosSystemParser.g:10294:3: ruleInteger0
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
    // InternalRosSystemParser.g:10303:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10307:1: ( ( ruleDouble0 ) )
            // InternalRosSystemParser.g:10308:2: ( ruleDouble0 )
            {
            // InternalRosSystemParser.g:10308:2: ( ruleDouble0 )
            // InternalRosSystemParser.g:10309:3: ruleDouble0
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
    // InternalRosSystemParser.g:10318:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10322:1: ( ( ruleboolean0 ) )
            // InternalRosSystemParser.g:10323:2: ( ruleboolean0 )
            {
            // InternalRosSystemParser.g:10323:2: ( ruleboolean0 )
            // InternalRosSystemParser.g:10324:3: ruleboolean0
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
    // InternalRosSystemParser.g:10333:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10337:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:10338:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:10338:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:10339:3: ruleParameterStructMember
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
    // InternalRosSystemParser.g:10348:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10352:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:10353:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:10353:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:10354:3: ruleParameterStructMember
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
    // InternalRosSystemParser.g:10363:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10367:1: ( ( ruleDateTime0 ) )
            // InternalRosSystemParser.g:10368:2: ( ruleDateTime0 )
            {
            // InternalRosSystemParser.g:10368:2: ( ruleDateTime0 )
            // InternalRosSystemParser.g:10369:3: ruleDateTime0
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
    // InternalRosSystemParser.g:10378:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10382:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10383:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10383:2: ( ruleEString )
            // InternalRosSystemParser.g:10384:3: ruleEString
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
    // InternalRosSystemParser.g:10393:1: rule__ParameterStructMember__ValueAssignment_3 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10397:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10398:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10398:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10399:3: ruleParameterValue
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
    // InternalRosSystemParser.g:10408:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10412:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10413:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10413:2: ( ruleEString )
            // InternalRosSystemParser.g:10414:3: ruleEString
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
    // InternalRosSystemParser.g:10423:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10427:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10428:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10428:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10429:3: ruleParameterType
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
    // InternalRosSystemParser.g:10438:1: rule__TopicSpecRef__TopicSpecAssignment : ( ( ruleEString ) ) ;
    public final void rule__TopicSpecRef__TopicSpecAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10442:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10443:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10443:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10444:3: ( ruleEString )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0());
            // InternalRosSystemParser.g:10445:3: ( ruleEString )
            // InternalRosSystemParser.g:10446:4: ruleEString
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
    // InternalRosSystemParser.g:10457:1: rule__ArrayTopicSpecRef__TopicSpecAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ArrayTopicSpecRef__TopicSpecAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10461:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10462:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10462:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10463:3: ( ruleEString )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_1_0());
            // InternalRosSystemParser.g:10464:3: ( ruleEString )
            // InternalRosSystemParser.g:10465:4: ruleEString
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\113\5\uffff\1\113\1\uffff\2\113\1\uffff";
    static final String dfa_4s = "\1\140\5\uffff\1\134\1\uffff\2\117\1\uffff";
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2356:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000D00L,0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000000000D02L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000118000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000100001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000600L,0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001E00C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x00000000181E4000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001B0006000000L,0x0000000080000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080000L,0x0000000100000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000040000000000L});

}
